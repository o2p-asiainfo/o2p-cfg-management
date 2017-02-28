<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.asiainfo.foundation.util.MessageSourceUtils" %>
<script type="text/javascript">
	var tip_chooseDir="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.chooseDir", null)%>";
	var tip_noPropType="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.noPropType", null)%>";
	var tip_noPropFile="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.noPropFile", null)%>";
	var tip_loading="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.loading", null)%>";
	var tip_impSuccess="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.impSuccess", null)%>";
	var tip_InvalidLine="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.InvalidLine", null)%>";
	var tip_deleteConfirm="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.deleteConfirm", null)%>";
	var tip_delSuccess="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.delSuccess", null)%>";
	var tip_lengthMenu="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.lengthMenu", null)%>";
	var tip_zeroRecords="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.zeroRecords", null)%>";
	var tip_info="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.info", null)%>";
	var tip_infoEmpty="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.infoEmpty", null)%>";
	var tip_infoFiltered="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.infoFiltered", null)%>";
	var tip_search="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.search", null)%>";
	var tip_first="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.first", null)%>";
	var tip_last="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.last", null)%>";
	var tip_next="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.next", null)%>";
	var tip_previous="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.previous", null)%>";
	var tip_leastRecord="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.leastRecord", null)%>";
	var tip_strLengthExceed="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.strLengthExceed", null)%>";
	var tip_numTypeInvalid="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.numTypeInvalid", null)%>";
	var tip_emailTypeInvalid="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.emailTypeInvalid", null)%>";
	var tip_ipTypeInvalid="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.ipTypeInvalid", null)%>";
	var tip_strLengthExceedSim="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.strLengthExceedSim", null)%>";
	var tip_numTypeInvalidSim="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.numTypeInvalidSim", null)%>";
	var tip_emailTypeInvalidSim="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.emailTypeInvalidSim", null)%>";
	var tip_ipTypeInvalidSim="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.ipTypeInvalidSim", null)%>";
	var tip_updateSuccess="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.updateSuccess", null)%>";
	var tip_groupNotNull="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.groupNotNull", null)%>";
	var tip_keyNotNull="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.keyNotNull", null)%>";
	var tip_nodeTypeNotNull="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.nodeTypeNotNull", null)%>";
	var tip_nodeNameNotNull="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.nodeNameNotNull", null)%>";
	var tip_createSuccess="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.createSuccess", null)%>";
	var tip_addSuccess="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.addSuccess", null)%>";
	var tip_chooseTargetNode="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.chooseTargetNode", null)%>";
	var tip_chooseTargetNodeAgain="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.chooseTargetNodeAgain", null)%>";
	var tip_copySuccess="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.copySuccess", null)%>";
	var tip_exportSuccess="<%=MessageSourceUtils.getMessage("o2p.configuration.view.tip.exportSuccess", null)%>";
	var error_title="<%=MessageSourceUtils.getMessage("o2p.configuration.view.error.title", null)%>";
	var error_notFind="<%=MessageSourceUtils.getMessage("o2p.configuration.view.error.notFind", null)%>";
	var error_notTheSame="<%=MessageSourceUtils.getMessage("o2p.configuration.view.error.notTheSame", null)%>";
	
	function getMessage(msg, variable) {
		msg = new String(msg);
		if(variable == null || variable == '' || variable == undefined) {
			return msg.replace("{0}", "");
		} else {
			return msg.replace("{0}", variable);
		}
	}
</script>