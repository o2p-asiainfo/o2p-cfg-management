<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.asiainfo.foundation.util.MessageSourceUtils"%>
<%@page import="com.asiainfo.foundation.util.MessageUtils"%>
<head>
<meta charset="UTF-8">
<title>Property list</title>
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<link rel="stylesheet" href="resources/css/jasny-bootstrap.min.css">
<link rel="stylesheet" href="resources/js/uniform/css/uniform.default.min.css">
<link rel="stylesheet" href="resources/js/bootstrap-toastr/toastr.min.css">
<link rel="stylesheet" href="resources/js/jstree/css/jstree.css">
<link rel="stylesheet" href="resources/js/data-tables/css/jquery.dataTables.min.css">
<link rel="stylesheet" href="resources/css/custom.css">

<jsp:include page="../../international.jsp"></jsp:include>
</head>

<body>
<div class="container-fluid">
	<div class="sidebar" id="sidebar"></div>
  <h1>
    <%=MessageSourceUtils.getMessage("o2p.configuration.view.element.PropertyList", null)%></h1>
  <hr>
  <nav id="myNavmenu" class="navmenu navmenu-default navmenu-fixed-left offcanvas" role="navigation"> 
  	<a class="navmenu-brand" href="#"><%=MessageSourceUtils.getMessage("o2p.configuration.view.element.PropertyNameSpace", null)%></a>
  	<div class="sidebar"></div>
    <div id="treeMenu"> </div>
  </nav>
  <div class="portlet box blue">
    <div class="portlet-title">
      <div class="caption" id="caption"> <%=MessageSourceUtils.getMessage("o2p.configuration.view.element.initPath", null)%> </div>
      <div class="actions">
      	<input id='fileToUpload' name='fileToUpload' type="file" style="display: none" onchange="javascript:fileUpload()"/>
        <a href="javascript:;" data-set="file" class="btn btn-default"> <i class="glyphicon glyphicon-cloud-upload"></i> <%=MessageSourceUtils.getMessage("o2p.configuration.view.element.import", null)%> </a>
        <a href="javascript:;" data-set="export" class="btn btn-default"> <i class="glyphicon glyphicon-cloud-download"></i> <%=MessageSourceUtils.getMessage("o2p.configuration.view.element.export", null)%> </a>
      	<a href="javascript:;" data-set="add" class="btn btn-default"> <i class="glyphicon glyphicon-plus"></i> <%=MessageSourceUtils.getMessage("o2p.configuration.view.element.add", null)%> </a>
        <a href="javascript:;" data-set="save" class="btn btn-default"> <i class="glyphicon glyphicon-floppy-disk"></i> <%=MessageSourceUtils.getMessage("o2p.configuration.view.element.save", null)%> </a>
        <a href="javascript:;" data-set="move" class="btn btn-default"> <i class="glyphicon glyphicon-random"></i> <%=MessageSourceUtils.getMessage("o2p.configuration.view.element.copy", null)%> </a>
        <a href="javascript:;" data-set="delete" class="btn btn-default"> <i class="glyphicon glyphicon-trash"></i> <%=MessageSourceUtils.getMessage("o2p.configuration.view.element.delete", null)%> </a>
      </div>
    </div>
    <div class="portlet-body">
      <table class="table group-check text-middle table-bordered" id="dt">
        <thead>
          <tr>
            <th> <input type="checkbox" class="group-checkable" data-set=".group-check .checkboxes">
            </th>
            <th> <%=MessageSourceUtils.getMessage("o2p.configuration.view.element.groupName", null)%></th>
            <th> <%=MessageSourceUtils.getMessage("o2p.configuration.view.element.key", null)%> </th>
            <th> <%=MessageSourceUtils.getMessage("o2p.configuration.view.element.value", null)%></th>
            <th> <%=MessageSourceUtils.getMessage("o2p.configuration.view.element.encryption", null)%></th>
            <th> <%=MessageSourceUtils.getMessage("o2p.configuration.view.element.constraint", null)%></th>
            <th> <%=MessageSourceUtils.getMessage("o2p.configuration.view.element.description", null)%></th>
            <th> <%=MessageSourceUtils.getMessage("o2p.configuration.view.element.dataType", null)%></th>
            <th> <%=MessageSourceUtils.getMessage("o2p.configuration.view.element.state", null)%></th>
          </tr>
        </thead>
        <tbody>
        </tbody>
      </table>
    </div>
  </div>
</div>
<div class="modal" id="modal">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title"><%=MessageSourceUtils.getMessage("o2p.configuration.view.element.chooseTranMsg", null)%></h4>
      </div>
      <div class="modal-body" id="content">
        <div id="result"></div>
        <div id="copyTreeMenu"></div>
      </div>
      <div class="modal-footer">
        <button class="btn btn-default" data-dismiss="modal"><%=MessageSourceUtils.getMessage("o2p.configuration.view.element.canel", null)%></button>
        <button class="btn btn-primary" onclick="Custom.move()"><%=MessageSourceUtils.getMessage("o2p.configuration.view.element.ok", null)%></button>
      </div>
    </div>
  </div>
</div>

<!-- zknodedetail -->
<div  class="modal container"  style="display: none;" id="zknodeDetail">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title"></h4>
				</div>
				<div class="modal-body">	
					<div class="form-body" id="addProp">
					  <div class="row">
				      	<div class="col-md-6">
				          <div class="form-group">
				            <label class="control-label"><font color='FF0000'>*</font><%=MessageSourceUtils.getMessage("o2p.configuration.view.element.confName", null)%></label>
				            <input type="text" name="key" placeholder="Group Name value" style="display: none;"  id="dirParentId">
				            <input type="text" name="key" placeholder="Group Name value" style="display: none;" id="dirId">
				            <input type="text" name="key" placeholder="Group Name value" class="form-control" id="dirName">
				          </div>
				        </div>
				      	 <div class="col-md-6">
				          <div class="form-group">
				            <label class="control-label"><font color='FF0000'>*</font><%=MessageSourceUtils.getMessage("o2p.configuration.view.element.directoryType", null)%></label>
				            <select type="text" name="key" placeholder="Group Name value" class="form-control" id="dirType">
				            	<option value="1" selected="selected"><%=MessageSourceUtils.getMessage("o2p.configuration.view.element.propertiesDirectory", null)%></option>
				            	<option value="0"><%=MessageSourceUtils.getMessage("o2p.configuration.view.element.nonPropertiesDirectory", null)%></option>
				            </select>
				          </div>
				       </div>
				      </div>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal"><%=MessageSourceUtils.getMessage("o2p.configuration.view.element.close", null)%></button>
    				<button type="submit" class="btn yellow" actionType='submit'  id="changeZkPath"><%=MessageSourceUtils.getMessage("o2p.configuration.view.element.submit", null)%></button>
				</div>
			</div>
		</div>
	</div>


<!-- nodedetail -->
<div id="addModal" class="modal container"  style="display: none; background:#fff">
  <div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
    <h4 class="modal-title"><%=MessageSourceUtils.getMessage("o2p.configuration.view.element.add", null)%></h4>
  </div>
  <div class="modal-body">
  <form role="form" id="form1" name="form1">
    <div class="form-body" id="addProp">
      <div class="row">
        <div class="col-md-6">
          <div class="form-group">
            <label class="control-label"><font color='FF0000'>*</font><%=MessageSourceUtils.getMessage("o2p.configuration.view.element.groupName", null)%></label>
            <input type="text" name="GroupNamevalue" placeholder="Group Name value" class="form-control" id="GroupNamevalue">
          </div>
        </div>
        <!--/span-->
        <div class="col-md-6">
          <div class="form-group">
            <label class="control-label"><%=MessageSourceUtils.getMessage("o2p.configuration.view.element.dataType", null)%></label>
            <select  class="form-control" id="DataTypeValue">
            	<option value="string" selected="selected">String</option>
                <option value="int">Integer</option>
                <option value="email">Email</option>
                <option value="ip">Ip</option>
            </select>
          </div>
      	</div>
        <!--/span-->
      </div>
      
      <div class="row">
      	
      </div>
      
      <div class="row">
      	<div class="col-md-6">
          <div class="form-group">
            <label class="control-label"><font color='FF0000'>*</font><%=MessageSourceUtils.getMessage("o2p.configuration.view.element.key", null)%></label>
            <input type="text" name="KeyNamevalue" placeholder="Group Name value" class="form-control" id="KeyNamevalue">
          </div>
        </div>
        <div class="col-md-6">
          <div class="form-group">
            <label class="control-label"><font color='FF0000'>*</font><%=MessageSourceUtils.getMessage("o2p.configuration.view.element.value", null)%></label>
            <input type="text" name="Valuevalue" placeholder="Value" class="form-control" id="Valuevalue">
          </div>
        </div>
        <!--/span-->
        
        <!--/span-->
      </div>
      <div class="row">
      	<div class="col-md-6">
          <div class="form-group">
            <label class="control-label"><%=MessageSourceUtils.getMessage("o2p.configuration.view.element.encryption", null)%></label>
            <select  class="form-control" id="Encryptionvalue">
            	<option value="0" selected="selected">No</option>
                <option value="1">Yes</option>
            </select>
          </div>
        </div>
        <div class="col-md-6">
          <div class="form-group">
            <label class="control-label"><%=MessageSourceUtils.getMessage("o2p.configuration.view.element.constraint", null)%></label>
            <select  class="form-control" id="proConstraintvalue">
            	<option value="0" selected="selected">Optional</option>
                <option value="1">Must</option>
            </select>
          </div>
        </div>
      </div>
      <div class="row">
        <!--/span-->
        <div class="col-md-6">
          <div class="form-group">
            <label class="control-label"><%=MessageSourceUtils.getMessage("o2p.configuration.view.element.description", null)%></label>
            <textarea placeholder="Description value" class="form-control" id="Descriptionvalue"></textarea>
          </div>
        </div>
        <!--/span-->
      </div>
  </div>
  <div class="modal-footer">
    <button type="button" class="btn btn-default" data-dismiss="modal"><%=MessageSourceUtils.getMessage("o2p.configuration.view.element.close", null)%></button>
    <button type="submit" class="btn yellow"  id="submitAdd"><%=MessageSourceUtils.getMessage("o2p.configuration.view.element.submit", null)%></button>
  </div>
  </form>
</div>
</div>
<!--node end-->

<!-- nodedetail -->
<div id="myCheckModal" class="modal container"  style="display: none; background:#fff">
  <div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
    <h4 class="modal-title"><%=MessageSourceUtils.getMessage("o2p.configuration.view.element.chooseCover", null)%></h4>
  </div>
  <div class="modal-body">
  	<table class="table table-bordered table-striped" id="checkTable">
	  <colgroup width="33%"></colgroup>
	  <colgroup width="33%"></colgroup>
	  <colgroup width="34%"></colgroup>
    </table>
  </div>
  <div class="modal-footer">
    <button type="button" class="btn btn-default"  id="submitCover" onclick="propertiesCopy()"><%=MessageSourceUtils.getMessage("o2p.configuration.view.element.cover", null)%></button>
    <button type="button" class="btn btn-default"  id="submitAllCover" onclick="propertiesCopy('allCover')"><%=MessageSourceUtils.getMessage("o2p.configuration.view.element.allCover", null)%></button>
    <button type="button" class="btn btn-default"  id="submitAllSkip" onclick="propertiesCopy('allSkip')"><%=MessageSourceUtils.getMessage("o2p.configuration.view.element.allSkip", null)%></button>
    <button type="button" class="btn btn-default" data-dismiss="modal"><%=MessageSourceUtils.getMessage("o2p.configuration.view.element.close", null)%></button>
  </div>
</div>
<!--node end-->

<script src="resources/js/jquery.min.js"></script>  
<script src="resources/js/ajaxfileupload.js"></script>
<script src="resources/js/bootstrap.min.js"></script> 
<script src="resources/js/jasny-bootstrap-offcanvas.js"></script> 
<script src="resources/js/uniform/jquery.uniform.min.js"></script> 
<script src="resources/js/data-tables/jquery.dataTables.min.js"></script> 
<script src="resources/js/plugins/jquery.validate.min.js"></script> 
<script src="resources/js/bootstrap-toastr/toastr.min.js"></script> 
<script src="resources/js/bootbox.min.js"></script> 
<script src="resources/js/jstree/jstree.min.js"></script> 
<script src="resources/js/jquery.blockui.min.js"></script> 
<script src="resources/js/custom.js"></script> 
<script>
    $(document).ready(function($) {
       Custom.init();
    });
</script>
</body>
</html>