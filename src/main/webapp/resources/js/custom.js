String.prototype.endWith=function(str){
    var reg=new RegExp(str+"$");
    return reg.test(this);
}

var IDS0;
var oTable;
function fileUpload() {
	if (IDS0 == undefined || IDS0 == 0) {
		toastr.warning(getMessage(tip_chooseDir,null));
		return;
	}
	if($('#treeMenu').jstree()._data.core.last_clicked != undefined && $('#treeMenu').jstree()._data.core.last_clicked.state.dirType != "1") {
		toastr.warning(getMessage(tip_chooseDir,null));
		return;
	}
	var url = oTable.api().ajax.url();
	var filename = new String($("#fileToUpload").val());
	if(!filename.endWith("properties")) {
		toastr.warning(getMessage(tip_noPropFile,null));
		return;
	}
	$.blockUI({ message: '<h5><img src="resources/images/loading.gif" /> '+getMessage(tip_loading,null)+'...</h5>' });
	$.ajaxFileUpload({
		 url:"rest/configuration/import/"+IDS0,
         dataType:"text",
         fileElementId:'fileToUpload',
         success: function (data, status){
        	 $.unblockUI();
        	 data = eval( "(" + data + ")" );
        	 if(data.result == 'success') {
        		 oTable.api().ajax.url(url).load();
        		 toastr.success(getMessage(tip_impSuccess,null));
        	 } else {
        		 var msg = data.msg;
        		 if(data.info != undefined && data.info != '' && data.info.length > 0 && data.info.length <= 10) {
        			 msg += ", "+getMessage(tip_InvalidLine,null)+":"
        			 for(var i=0; i<data.info.length; i++) {
        				 msg += "<br>"+data.info[i];
        			 }
        		 }
        		 toastr.error(msg);
        	 }
         },
         error: function (data, status)
         {
        	 toastr.error(data);
        	 $.unblockUI();
         }
	})
};

function changeContent(ele) {
	$(ele).attr("data-content",$(ele).val());
}

function propertiesCopy(action) {
	var selected = $('#copyTreeMenu').attr('selected-node');
    var IDS = $('#copyTreeMenu').attr('IDS');
    var IDSResult = '';
    if(action == 'allCover') {
    	IDSResult = IDS;
    } else {
    	var noChecked = null;
    	if(action == 'allSkip') {
    		noChecked = $('#checkTable input[type=checkbox]');
    	} else {
    		noChecked = $('#checkTable input[type=checkbox]:not(:checked)');
    	}
        var IDSArray = IDS.split(",");
        for(var i=0; i<IDSArray.length; i++) {
        	for(var j=0; j<noChecked.length; j++) {
        		if(IDSArray[i]==noChecked[j].value) {
        			IDSArray.splice(i, 1);
        			i--;
        			break;
        		}
        	}
        }
        for(var i=0; i<IDSArray.length; i++) {
        	IDSResult += (IDSArray[i] + ",");
        }
        IDSResult = IDSResult.substring(0, IDSResult.length-1);
    }
    $('#myCheckModal').modal('hide');
    if(IDSResult != '') {
    	$.blockUI({ message: '<h5><img src="resources/images/loading.gif" /> '+getMessage(tip_loading,null)+'...</h5>' });
    	var url = oTable.api().ajax.url();
        $.ajax({
			type: "POST",
		    url: "rest/configuration/copy/"+selected+"/" + IDSResult,
			success:function(msg){
				if(msg == 'success'){
					oTable.api().ajax.reload();
					toastr.success(getMessage(tip_copySuccess,null));
				}
				else{
					oTable.api().ajax.reload();
					toastr.error(msg);
				}
				$.unblockUI();
	         },
	         error: function(msg) {
	        	 $.unblockUI();
	         }
	     });
    }
}

var Custom = function() {

    var globalSet = function() {
            //对消息提示插件toastr的全局定义
            toastr.options = {
                positionClass: 'toast-bottom-right',
                closeButton: true,
                timeOut: 2000,
            }
        }
        //checkbox美化
    function handleUniform() {
            if (!jQuery().uniform) {
                return;
            }
            var test = $("input[type=checkbox]:not(.toggle), input[type=radio]:not(.toggle, .star)");
            if (test.size() > 0) {
                test.each(function() {
                    if ($(this).parents(".checker").size() == 0) {
                        $(this).show();
                        $(this).uniform();
                    }
                });
            }
        }
    
        //全选功能
    var handleCheckBox = function() {
        $('.group-checkable').change(function() {
            var set = jQuery(this).attr("data-set");
            var checked = jQuery(this).is(":checked");
            $(set).each(function() {
                if (checked) {
                    this.checked = true;
                    $(this).parents('tr').addClass("active");
                } else {
                    this.checked = false;
                    $(this).parents('tr').removeClass("active");
                }
            });
            $.uniform.update(set);
        });
        $('.group-check').on('change', '#dt tbody tr .checkboxes',
            function() {
                $(this).parents('tr').toggleClass("active");
            });
    }
    
    $('#zknodeDetail').on('hide.bs.modal',function(e){
    	$("#dirName").val('');
		$("#dirType").val('1');
		$("#dirType").removeAttr("disabled");
		$("#dirName").removeAttr("disabled");
		$("#dirParentId").val('');
		$("#dirId").val('');
    });
    
    $('#addModal').on('hide.bs.modal',function(e){
    	clearAddForm();
    })
    
    $('#modal').on('hide.bs.modal',function(e){
    	$('#copyTreeMenu').jstree().destroy ();
    })

    //生成树形菜单
    var handleSidebar = function() {
            $('#treeMenu').jstree({
                'core': {
                	'check_callback':true,
                    'data': {
                    	"url": "rest/configuration/tree",
                    	"type": "post",
                        "dataType": "json" // needed only if you do not supply JSON headers
                    },
                    'check_callback': function(chk, obj, par, pos) {
                    	if(chk == 'delete_node') {
                    		if(confirm(getMessage(tip_deleteConfirm,null))) {
                    			return true;
                    		} else {
                    			return false;
                    		}
                    	}
                    }
                },
                "types": {
                    "default": {
                        "icon": "glyphicon glyphicon-folder-close"
                    },
                    "properties directory": {
                        "icon": "glyphicon glyphicon-list-alt"
                    }
                },
                'contextmenu': {
                	'items': function(node) {
                		var tmp = $.jstree.defaults.contextmenu.items();
                		if(node.state.dirType != undefined && node.state.dirType == '1') {
                			delete tmp.create;
                		} else {
                			tmp.create.action = function(data) {
                				var inst = $.jstree.reference(data.reference);
								var nd = inst.get_node(data.reference);
                				$('#dirParentId').val(nd.id);
                				$('#changeZkPath').attr('actionType', 'add');
                    			$('#zknodeDetail').modal('show');
                    		}
                		}
                		delete tmp.ccp;
                		delete tmp.rename;
                		tmp.edit = {
            				"separator_after": true,
							"label": "Edit",
							"action": function (data) {
								var inst = $.jstree.reference(data.reference);
								var node = inst.get_node(data.reference);
								$("#dirName").val(node.text);
								$("#dirName").attr("disabled","disabled");
								if(node.state != undefined) {
									$("#dirType").val(node.state.dirType);
									if(node.state.dirType == '0' && node.children != undefined && node.children.length > 0) {
										$("#dirType").attr("disabled","disabled");
									}
								}
								$('#dirId').val(node.id);
								$('#changeZkPath').attr('actionType', 'edit');
								$('#zknodeDetail').modal('show');
							}
                		}
                        return tmp;
                	}
                },
                "plugins": ["types","contextmenu"]
            }).on('delete_node.jstree', function (e, data) {
            	$.blockUI({ message: '<h5><img src="resources/images/loading.gif" /> '+getMessage(tip_loading,null)+'...</h5>' });
            	$('#myNavmenu').offcanvas('hide');
            	$.ajax({
        			type: "delete",
        		    url: "rest/configuration/delete/zkpath/" + data.node.id,
        			success:function(msg){
        				$.unblockUI();
        				if(msg != 'success'){
        					toastr.error(msg);
        				} else {
        					toastr.success(getMessage(tip_delSuccess,null));
        				}
        				data.instance.refresh();
        	         },
        	         error:function(msg) {
        	        	 $.unblockUI();
        	         }
        	     });
            });
            $('#treeMenu').on('changed.jstree', function(e,data) {
            	var node = data.node;
            	if(node == undefined) {
            		return;
            	}
            	if(data.event != undefined && data.event.type == 'click') {
            		if(node.state.dirType != undefined && node.state.dirType == '1') {
                		var pnode = $(this).jstree().get_node(node.parent);
                		var title = new String(node.text);
                		while(pnode != false && pnode.text != undefined) {
                			title = pnode.text + "/" + title;
                			pnode = $(this).jstree().get_node(pnode.parent);
                		}
                		$('#caption').html("<b>/"+title+"</b>") //同步表格的title
                        handleDT(node.id)
                	} else {
                		$(this).attr('selected-node', '');
                	}
            	}
            	if (data.event != undefined && data.event.type == 'contextmenu') {
                    $(document).off('mouseleave', '#myNavmenu', hideCanvas);
                }
            });
        }
    
        //传入的是叶节点的id，根据id生成表格数据
    var handleDT = function(id) {
    		IDS0 = id;
            /* Create an array with the values of all the select options in a column */
            $.fn.dataTable.ext.order['dom-select'] = function(settings, col) {
                return this.api().column(col, {
                    order: 'index'
                }).nodes().map(function(td, i) {
                    return $('select', td).val();
                });
            }
            id == undefined ? id = 0 : id = id;
            if ($('.dataTable').size() > 0) {
                oTable.api().ajax.url("rest/configuration/conf/" + id).load();
            } else {
                oTable = $('#dt').dataTable({
                    "processing": true,
                    "stateSave": true,
                    "lengthMenu": [
                        [10, 25, 50, -1],
                        [10, 25, 50, "All"]
                    ],
                    "ajax": "rest/configuration/conf/" + id,
                    "columns": [{
                        "orderable": false,
                        "data": null,
                    }, {
                        "data": "group"
                    }, {
                        "orderable": false,
                        "data": "key"
                    }, {
                        "orderable": false,
                        "data": "value"
                    }, {
                        "data": "lock",
                        "orderDataType": "dom-select"
                    }, {
                        "data": "proConstraint"
                    }, {
                        "orderable": false,
                        "data": "description"
                    }, {
                    	"orderable": false,
                        "data": "proDataType"
                    }, {
                        "data": "state"
                    }],
                    columnDefs: [{
                            targets: 0,
                            width: "19px",
                            render: function(data, type, full, meta) {
                                var html = '<input type="checkbox" name="" class="checkboxes" value="' + full.id + '">'
                                return html;
                            }
                        }, {
                            targets: 8,
                            class: 'text-center',
                            render: function(data, type, full, meta) {
                                if (full.state == 1) {
                                    var html = '<div class="text-hide"><i class="glyphicon glyphicon-ok-circle fz18"></i>1<div>';
                                } else if (full.state == 0) {
                                    var html = '<div class="text-hide"><i class="glyphicon glyphicon-remove-circle fz18"></i>0<div>';
                                } else if (full.state == 2) {
                                    var html = '<div class="text-hide" onkeyup="changeContent(this);" data-placement="top" data-toggle="popover" data-trigger="hover" title="'+getMessage(error_title,null)+'" data-content="'+getMessage(error_notTheSame,full.error)+'"><i class="glyphicon glyphicon-remove-circle fz18"></i>2<div>';
                                } else if (full.state == 3) {
                                    var html = '<div class="text-hide" onkeyup="changeContent(this);" data-placement="top" data-toggle="popover" data-trigger="hover" title="'+getMessage(error_title,null)+'" data-content="'+getMessage(error_notFind,null)+'"><i class="glyphicon glyphicon-remove-circle fz18"></i>2<div>';
                                }
                                return html;
                            }
                        }, {
                            targets: 4,
                            render: function(data, type, full, meta) {
                                if (full.lock == 1) {
                                    var html = 'yes';
                                } else if (full.lock == 0) {
                                    var html = '<select name="" id="encryptionSelect" class="form-control input-sm"><option value="1">Yes</option><option value="0" selected="selected">No</option></select>';
                                }
                                return html;
                            }
                        },{
                            targets: 3,
                            render: function(data, type, full, meta) {
                            	var value = '';
                            	if(full.value == '') {
                            		value = full.proValueBuffer;
                            	} else {
                            		value = full.value;
                            	}
                            	if (full.lock == 1) {
                            		var html = '<input type="password" name="value" class="form-control input-sm input-small" value="' + value + '" onkeyup="changeContent(this);" data-placement="top" data-toggle="popover" data-trigger="hover" title="Properties Value" data-content="'+value+'">'
                            	} else if (full.lock == 0) {
                            		var html = '<input type="text" name="value" class="form-control input-sm input-small" value="' + value + '" onkeyup="changeContent(this);" data-placement="top" data-toggle="popover" data-trigger="hover" title="Properties Value" data-content="'+value+'">'
                            	}
                                return html;
                            }
                        }
                        ,{
                            targets: 1,
                            render: function(data, type, full, meta) {
                                var html = '<input type="text" name="groupName" class="form-control input-sm" value="' + full.group + '">'
                                return html;
                            }
                        },{
                            targets: 2,
                            render: function(data, type, full, meta) {
                                var html = '<font style="color:blue">'+full.key+'</font>';
                                return html;
                            }
                        },{
                            targets: 5,
                            render: function(data, type, full, meta) {
                            	if (full.proConstraint == 1) {
                                    var html = '<select name="" id="proConstraint" class="form-control input-sm"><option value="1" selected="selected">Must</option><option value="0">Optional</option></select>'
                                } else {
                                    var html = '<select name="" id="proConstraint" class="form-control input-sm"><option value="1">Must</option><option value="0" selected="selected">Optional</option></select>'
                                }
                                return html;
                            }
                        },{
                            targets: 7,
                            render: function(data, type, full, meta) {
                            	var stringSelect = '';
                            	var intSelect = '';
                            	var ipSelect = '';
                            	var emailSelect = '';
                            	if(full.proDataType == 'string') {
                            		stringSelect = 'selected="selected"';
                            	} else if(full.proDataType == 'int') {
                            		intSelect = 'selected="selected"';
                            	} else if(full.proDataType == 'ip') {
                            		ipSelect = 'selected="selected"';
                            	} else if(full.proDataType == 'email') {
                            		emailSelect = 'selected="selected"';
                            	}
                                var html = '<select name="" id="proDataType" class="form-control input-sm">'+
	                                	'<option value="string" '+stringSelect+'>String</option><option value="int" '+intSelect+'>Integer</option>'+
	                                	'<option value="email" '+emailSelect+'>Email</option><option value="ip" '+ipSelect+'>IP</option>'+
                                	'</select>';
                                return html;
                            	return '';
                            }
                        },{
                            targets: 6,
                            render: function(data, type, full, meta) {
                            	var html = '<input type="text" name="description" class="form-control input-sm" value="' + full.description + '"  onkeyup="changeContent(this);" data-placement="top" data-toggle="popover" data-trigger="hover" title="Properties Description" data-content="'+full.description+'">'
                                return html;
                            }
                        }
                        

                    ],
                    "order": [
                        [1, 'asc']
                    ],
                    "drawCallback": function(settings) {
                        handleUniform();
                        var cur = this.api().page();
                        var state = parseInt($('.group-checkable').attr('page' + cur));
                        if (state) {
                            $('.group-checkable').get(0).checked = true;
                        } else {
                            $('.group-checkable').get(0).checked = false;
                        }
                        $.uniform.update('.group-checkable');
                        $('[data-toggle="popover"]').popover();
                    },
                    "language": {
                        "lengthMenu": getMessage(tip_lengthMenu,null),
                        "zeroRecords": getMessage(tip_zeroRecords,null),
                        "info": getMessage(tip_info,null),
                        "infoEmpty": getMessage(tip_infoEmpty,null),
                        "infoFiltered": getMessage(tip_infoFiltered,null),
                        "search": getMessage(tip_search,null),
                        "paginate":{
                        	"first":getMessage(tip_first,null),
                        	"last":getMessage(tip_last,null),
                        	"next":getMessage(tip_next,null),
                        	"previous":getMessage(tip_previous,null)
                        }
                    }
                });
                jQuery('#dt_wrapper .dataTables_filter input').addClass("form-control input-small input-inline"); // modify table search input
                jQuery('#dt_wrapper .dataTables_length select').addClass("form-control input-small"); // modify table per page dropdown
                //记录每一页的全选按钮的状态
                $('.group-checkable').bind('click', function() {
                    var checked = $(this).is(':checked');
                    var cur = oTable.api().page();
                    if (checked) {
                        $(this).attr('page' + cur, 1);
                    } else {
                        $(this).attr('page' + cur, 0);
                    }
                })
            }
        }
        //
    function _deleteList() {
            var str = '';
            $("#dt tbody input[type='checkbox']:checked").each(function(i, o) {
                str += $(this).val();
                str += ",";
            });
            if (str.length > 0) {
            	if(confirm("delete the selected properties?")==true) {
            		var IDS = str.substr(0, str.length - 1);
                    $.ajax({
            			type: "delete",
            		    url: "rest/configuration/delete/conf/" + IDS,
            			success:function(msg){
            				if(msg == 'success'){
            					toastr.success(getMessage(tip_delSuccess,null));
            					oTable.api().ajax.reload();
            				}
            				else{
            					oTable.api().ajax.reload();
            					toastr.error(msg);
            				}
            	         }
            	     });
            	}
            } else {
                toastr.warning(getMessage(tip_leastRecord,null));
            }
        }
        //
    function _moveList() {
            var str = '';
            $("#dt tbody input[type='checkbox']:checked").each(function(i, o) {
                str += $(this).val();
                str += ",";
            });
            if (str.length > 0) {
                $('#modal').modal('show');
                $('#copyTreeMenu').jstree({
                	'check_callback':true,
                    'core': {
                        'data': {
                        	"url": "rest/configuration/tree",
                        	"type": "post",
                            "dataType": "json" // needed only if you do not supply JSON headers
                        }
                    },
                    "types": {
                        "default": {
                            "icon": "glyphicon glyphicon-folder-close"
                        },
                        "properties directory": {
                            "icon": "glyphicon glyphicon-list-alt"
                        }
                    },
                    "plugins": ["types"]
                });
                $('#copyTreeMenu').on('changed.jstree', function(e, data) {
                	var ch = data.node.children; //返回的是数组类型                   
                    var hasChildren = ch.length == 0 ? false : true; //是否是最后一级的节点
                    //把当前选中的叶节点id记录在treeMenu2上
                    if (!hasChildren) {
                        $(this).attr('selected-node', data.node.id)
                    } else {
                        $(this).attr('selected-node', '')
                    }
                });
                var IDS = str.substr(0, str.length - 1);
                $('#copyTreeMenu').attr('IDS', IDS);
            } else {
                toastr.warning(getMessage(tip_leastRecord,null));
            }
        }
    
    function _fileImport() {
    	if (IDS0 == undefined || IDS0 == 0) {
    		toastr.warning(getMessage(tip_chooseDir,null));
    		return;
    	}
    	if($('#treeMenu').jstree()._data.core.last_clicked != undefined && $('#treeMenu').jstree()._data.core.last_clicked.state.dirType != "1") {
    		toastr.warning(getMessage(tip_noPropType,null));
    		return;
    	}
    	$('#fileToUpload').click();
    }
    
    function _fileExport() {
        var str = '';
        $("#dt tbody input[type='checkbox']:checked").each(function(i, o) {
            str += $(this).val();
            str += ",";
        });
        if (str.length > 0) {
        	if(confirm("export the selected properties?")==true) {
        		var IDS = str.substr(0, str.length - 1);
        		$.blockUI({ message: '<h5><img src="resources/images/loading.gif" /> '+getMessage(tip_loading,null)+'...</h5>' });
                $.ajax({
        			type: "post",
        		    url: "rest/configuration/export/" + IDS,
        			success:function(msg){
        				$.unblockUI();
        				if(msg == 'success'){
        					toastr.success(getMessage(tip_exportSuccess,null));
        					
        					var exportForm=$("<form>");
        					exportForm.attr("style","display:none");
        					exportForm.attr("method","post");
        					exportForm.attr("action","rest/configuration/export");
        					$("body").append(exportForm);
        					exportForm.submit();
        				}
        				else{
        					toastr.error(msg);
        				}
        	         },
        	         error: function(msg) {
        	        	 $.unblockUI();
        	         }
        	     });
        	}
        } else {
            toastr.warning(getMessage(tip_leastRecord,null));
        }
    }
        //
    function _saveList() {
//        var str = '';
    	if (IDS0 == undefined || IDS0 == 0) {
    		toastr.warning(getMessage(tip_chooseDir,null));
    		return;
    	}
        var oSelected = $("#dt tbody input[type='checkbox']:checked");
        if(oSelected.length == 0) {
        	toastr.warning(getMessage(tip_leastRecord,null));
    		return;
        }
        var paramArray = [];
        var param = null;
        oSelected.each(function(index, n){
        	if(paramArray == null) {
        		return;
        	}
        	param = new Object();
        	var trselected = $(n).closest('tr');
        	param.value = trselected.find("[name='value']").val();
        	param.lock = trselected.find('td').eq(4).children('select').val();
        	if(param.lock == undefined) {
        		param.lock = trselected.find('td').eq(4).text();
        	}
        	if(param.lock == 'yes') {
        		param.lock = 1;
        	}
        	param.group = trselected.find("[name='groupName']").val();
        	param.proConstraint = trselected.find('td').eq(5).children('select').val();
        	param.proDataType = trselected.find('td').eq(7).children('select').val();
        	param.description = trselected.find("[name='description']").val();
        	param.key = trselected.find('td').eq(2).children('font').text();
        	param.id = $(n).val();
        	param.dirId = IDS0;
        	
        	if(param.group == '' || param.group == null) {
        		toastr.error(getMessage(tip_groupNotNull,null));
        		paramArray = null;
        		return;
        	}
//        	if ('string' == param.proDataType) {
//				if (param.value.length > 200) {
//					toastr.error(getMessage(tip_strLengthExceed,index), 'The warning dialog');
//					paramArray = null;
//	        		return;
//				}
//			}
			if ('int' == param.proDataType) {
				var reg=/^\d+(\.\d+)?$/;
				if (!reg.test(param.value)) {
					toastr.error(getMessage(tip_numTypeInvalid,param.value));
					paramArray = null;
	        		return;
				}
			}
			if ('email' == param.proDataType) {
				var reg = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/;
				if (!reg.test(param.value)) {
					toastr.error(getMessage(tip_emailTypeInvalid,param.value));
					paramArray = null;
	        		return;
				}
			}
			if ('ip' == param.proDataType) {
				var reg=/^(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])$/;
				if (!reg.test(param.value)) {
					toastr.error(getMessage(tip_ipTypeInvalid,param.value));
					paramArray = null;
	        		return;
				}
			}
        	paramArray.push(param);
        });
        if(paramArray == null) {
        	return;
        }
    	$.ajax({
			type: "POST",
			async:true,
		    url: "rest/configuration/conf/",
		    data:{"data":JSON.stringify(paramArray)},
			success:function(msg){
				if(msg == 'success'){
					toastr.success(getMessage(tip_updateSuccess,null));
					oTable.api().ajax.reload();
				}
				else{
					oTable.api().ajax.reload();
					toastr.error(msg);
				}
	         }
	     });
    }
    
    function _changeZkPath() {
    	var actionType = $("#changeZkPath").attr("actionType");
    	var url = 'rest/configuration/'+actionType+'/zkpath/';
    	var type = 'post';
    	if("add" == actionType) {
    		if($("#dirType").val() == '' || $("#dirType").val() == null) {
    			toastr.error(getMessage(tip_nodeTypeNotNull,null));
    			return;
    		}
    		if($("#dirName").val() == '' || $("#dirName").val() == null) {
    			toastr.error(getMessage(tip_nodeNameNotNull,null));
    			return;
    		}
    		type = 'put';
    		url += $("#dirParentId").val()+"/"+ $("#dirType").val()+"/"+$("#dirName").val();
    	} else if("edit" == actionType) {
    		type = 'post';
    		url += $("#dirId").val()+"/"+ $("#dirType").val()+"/"+$("#dirName").val();
    	}
    	$.ajax({
			type: type,
			async:false,
		    url: url,
			success:function(msg){
				if(msg != 'success'){
					toastr.error(msg);
				} else {
					$('#zknodeDetail').modal('hide');
					toastr.success(getMessage(tip_createSuccess,null));
				}
				$('#treeMenu').jstree().refresh();
	         }
	     });
    }
    
    function clearAddForm() {
    	$("#GroupNamevalue").val('');
    	$("#KeyNamevalue").val('');
    	$("#Valuevalue").val('');
    	$("#Encryptionvalue").val('0');
    	$("#Descriptionvalue").val('');
    	$("#proConstraintvalue").val('0');
    }
    function _addList() {
    	var id = oTable.api().id;
    	var url = oTable.api().ajax.url();
    	if (IDS0 == undefined || IDS0 == 0) {
    		toastr.warning(getMessage(tip_chooseDir,null));
    		return;
    	}
    	$("#form1").validate({
    		rules: {
    			GroupNamevalue: "required",
    		    KeyNamevalue: "required"
    		  },
    		  messages:{
    			  GroupNamevalue: getMessage(tip_groupNotNull,null),
    			  KeyNamevalue: getMessage(tip_keyNotNull,null),
    		  },
    		  submitHandler: function(form1) {
    			    var type = $("#DataTypeValue").val();
					var value = $("#Valuevalue").val();
//					if ('string' == type) {
//						if (value.length > 200) {
//							$("#Valuevalue").focus();
//							toastr.warning(getMessage(tip_strLengthExceedSim,null));
//							return false;
//						}
//					}
					if ('int' == type) {
						var reg=/^\d+(\.\d+)?$/;
						if (!reg.test(value)) {
							toastr.warning(getMessage(tip_numTypeInvalidSim,null));
							$("#Valuevalue").focus();
							return false;
						}
					}
					if ('email' == type) {
						var reg = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/;
						if (!reg.test(value)) {
							toastr.warning(getMessage(tip_emailTypeInvalidSim,null));
							$("#Valuevalue").focus();
							return false;
						}
					}
					if ('ip' == type) {
						var reg=/^(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])$/;
						if (!reg.test(value)) {
							toastr.warning(getMessage(tip_ipTypeInvalidSim,null));
							$("#Valuevalue").focus();
							return false;
						}
					}
    				
    				var data = {};
    				data.group = $("#GroupNamevalue").val();
    				data.key = $("#KeyNamevalue").val();
    				data.value = $("#Valuevalue").val();
    				data.lock = $("#Encryptionvalue").val();
    				data.description = $("#Descriptionvalue").val();
    				data.proConstraint = $("#proConstraintvalue").val();
    				data.proDataType = $("#DataTypeValue").val();
    				data.dirId = IDS0;
    				$.ajax({
    		    		type: "POST",
    		    		async:true,
    		    	    url: "rest/configuration/prop/add",
    		    	    data:data,
    		    		success:function(data){
    		    			if (data == "success") {
    		    				$('#addModal').modal('hide');
    		    				$('#addProp input').val('');
    		    				oTable.api().ajax.url(url).load();
    							toastr.success(getMessage(tip_addSuccess,null));
    						}else {
    							toastr.warning(data);
    						}
    		              }
    		         });
    		  }
    	});
    }
    function hideCanvas() {
        $('#myNavmenu').offcanvas('hide');
    }
    var handleOffCanvas = function() {
        $(document).on('mouseleave', '#myNavmenu', hideCanvas);
        $(document).on('mouseover', '#sidebar', function() {
            $('#myNavmenu').offcanvas({
                autohide: false,
                disableScrolling: false
            })
            $('#myNavmenu').offcanvas('show')
        });
        $(document).on('mousedown','#treeMenu a',function(e){
            if(e.which == 3){
               $(document).off('mouseleave', '#myNavmenu', hideCanvas); 
            }
        })
        var ff = false;
        $(document).on('context_hide.vakata', function(e, data) {
        	console.log(11);
            $(document).on('mouseleave', '#myNavmenu', hideCanvas);
        })
    }
    return {
        init: function() {
            globalSet();
            handleUniform();
            handleCheckBox();
            handleSidebar();
            handleDT() //初始化的参数为空 则返回空数据，待选择树菜单后再往表格内填充数据
            handleOffCanvas();
            //对表格右上角的工具菜单作动作监听
            $('body').on('click', '.actions a[data-set]', function() {
                var action = $.trim($(this).data('set'));
                if (action == 'delete') {
                    _deleteList();
                } else if (action == 'move') {
                    _moveList();

                } else if (action == 'save') {
                    _saveList();
                } else if (action == 'add') {
					$("#addModal").modal("show");
                } else if (action == "file") {
                	_fileImport();
                }
                else if (action == "export") {
                	_fileExport();
                }
            })
//            $('#addModal').on('shown.bs.modal',function(){
////            	console.log('sdf');
//            	_addList();
//            })
            $("#submitAdd").click(function(){
            	_addList();
			})
			$('#changeZkPath').click(function(){
				_changeZkPath();
			})
			$('body').on('change','#encryptionSelect',function() {
//				  alert($(this).find('option:selected').val());
				  if (1 == $(this).find('option:selected').val()) {
//					  alert($(this).closest('tr').find("[name='value']").val());
					  $(this).closest('tr').find("[name='value']").attr('type','password')
				  } else if (0 == $(this).find('option:selected').val()) {
					  $(this).closest('tr').find("[name='value']").attr('type','text')
				  }
			})
			$('body').on('change','#Encryptionvalue',function() {
				  if (1 == $(this).find('option:selected').val()) {
					  $('#Valuevalue').attr('type','password')
				  } else if (0 == $(this).find('option:selected').val()) {
					  $('#Valuevalue').attr('type','text')
				  }
			})
			
        },
        move: function() {
        	if($('#copyTreeMenu').jstree()._data.core.last_clicked != undefined && $('#copyTreeMenu').jstree()._data.core.last_clicked.state.dirType != "1") {
        		toastr.error(getMessage(tip_noPropType,null));
        		return;
        	}
            var selected = $('#copyTreeMenu').attr('selected-node');
            var IDS = $('#copyTreeMenu').attr('IDS');
            if (selected == IDS0) {
            	alert(getMessage(tip_chooseTargetNodeAgain,null));
            	return;
            }
            
            if (selected == undefined || selected == '') {
                toastr.warning(getMessage(tip_chooseTargetNode,null));
            } else {
                $('#modal').modal('hide');
                $.blockUI({ message: '<h5><img src="resources/images/loading.gif" /> '+getMessage(tip_loading,null)+'...</h5>' });
                $.ajax({
        			type: "POST",
        		    url: "rest/configuration/check/conf/"+selected+"/" + IDS,
        			success:function(list){
        				if(list.length > 0) {
        					$.unblockUI();
        					$("#checkTable tbody").empty();
        					for(var i=0; i<list.length; i++) {
        						var proKey = list[i].pro_key;
        						var id = list[i].id;
        						if(i % 3 == 0) {
        							var newRow = "<tr></tr>";
        							$("#checkTable").append(newRow);
        						}
        						var newCol = "<td><input type=\"checkbox\" value=\""+id+"\" class=\"checkboxes\"> "+proKey+"</td>";
        						$("#checkTable tbody").append(newCol);
        					}
        					handleUniform();
        					$('#myCheckModal').modal('show');
        				} else {
        					var url = oTable.api().ajax.url();
        	                $.ajax({
        	        			type: "POST",
        	        		    url: "rest/configuration/copy/"+selected+"/" + IDS,
        	        			success:function(msg){
        	        				if(msg == 'success'){
        	        					oTable.api().ajax.reload();
        	        					toastr.success(getMessage(tip_copySuccess,null));
        	        				}
        	        				else{
        	        					oTable.api().ajax.reload();
        	        					toastr.error(msg);
        	        				}
        	        				$.unblockUI();
        	        	         },
        	        	         error: function(msg) {
        	        	        	 $.unblockUI();
        	        	         }
        	        	     });
        				}
        	         },
        	         error: function(msg) {
        	        	 $.unblockUI();
        	         }
        	     });
            }
        }
    }
}()
