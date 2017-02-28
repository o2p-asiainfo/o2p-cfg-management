DROP TABLE zk_path IF EXISTS;
CREATE TABLE zk_path (
  dir_id INTEGER IDENTITY,
  fa_dir_id decimal(9) ,
  dir_name varchar(50)  ,
  dir_type char(1)  ,
  dir_create_time date ,
  dir_state char(1)  ,
  dir_lastest_time date ,
  PRIMARY KEY (dir_id)
);

DROP TABLE conf_properties IF EXISTS;
CREATE TABLE conf_properties (
  id INTEGER IDENTITY,
  pro_data_type varchar(20) ,
  module_name varchar(64) ,
  group_name varchar(64) ,
  group_desc varchar(64) ,
  effect_zone varchar(64) ,
  create_dt date ,
  modify_dt date ,
  pro_key varchar(64) ,
  pro_value varchar(200) ,
  pro_value_buffer varchar(2000),
  pro_type varchar(64) ,
  pro_encrypt decimal(1) ,
  syn_status varchar(1) ,
  pro_constraint char(1) ,
  dir_id decimal(9) ,
  description varchar(500) ,
  PRIMARY KEY (id)
);

-- ----------------------------
-- Table structure for sequenceconftable
-- ----------------------------
DROP TABLE sequenceconftable IF EXISTS;
CREATE TABLE sequenceconftable (
  id INTEGER  IDENTITY,
  name varchar(255) ,
  max_1 decimal(11) ,
  length_1 decimal(2) ,
  next_1 decimal(2) ,
  rules varchar(255)
);



INSERT INTO sequenceconftable VALUES ('1', 'SEQ_ENDPOINT', '100001178', '10', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('3', 'SEQ_MESSAGE_FLOW', '100000261', '10', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('4', 'SEQ_SERVICE_ROUTE_CONF', '100002665', '10', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('5', 'SEQ_ROUTE_POLI', '100002629', '10', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('6', 'SEQ_END_INTERACTION', '100000000', '10', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('7', 'SEQ_ROUTE_CONDIT', '100000000', '10', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('8', 'SEQ_APP_API_LIST', '100000033', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('9', 'SEQ_COMPONENT', '100000066', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('10', 'SEQ_FILE_SHARE', '100000036', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('11', 'SEQ_MAIN_DATA', '100000000', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('12', 'SEQ_MAIN_DATA_TYPE', '100000000', '4', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('13', 'SEQ_ORG', '100000017', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('14', 'SEQ_TECH_IMPL', '100000208', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('15', 'SEQ_TECH_IMP_ATT', '100001359', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('16', 'SEQ_SER_TECH_IMPL', '100000197', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('17', 'SEQ_CONTRACT', '100000190', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('18', 'SEQ_CONTRACT_VERSION', '100000222', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('19', 'SEQ_CONTRACT_FORMAT', '100000369', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('20', 'SEQ_SERVICE', '100000188', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('21', 'SEQ_DIR_SER_LIST', '100000097', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('22', 'SEQ_SERVICE_ATT', '100000230', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('23', 'SEQ_NODE_DESC', '100007217', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('24', 'SEQ_DOC_CONTRACT', '100000020', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('25', 'SEQ_SER_INVOKE_INS', '100000071', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('26', 'SEQ_APP', '100000044', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('27', 'SEQ_PRODUCT', '802010000067', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('28', 'SEQ_ATTR_SPEC', '100000000', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('29', 'SEQ_ATTR_VALUE', '100000000', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('30', 'SEQ_OFFER_PROD_REL', '100000157', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('31', 'SEQ_RICING_PLAN', '100000000', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('32', 'PRICING_PLAN_CLASSIFY_REL', '100000000', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('33', 'SEQ_PROD_OFFER_PRICING', '100000028', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('34', 'SEQ_OFFER_PROD_REL_PRICING', '100000038', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('36', 'SEQ_PROD_ATTR_VALUE', '100000000', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('37', 'SEQ_PROD_OFFER', '801010000073', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('38', 'SEQ_PROD_OFFER_ATTR', '100000000', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('39', 'SEQ_PROD_OFFER_CHANNEL_TYPE', '100000000', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('40', 'SEQ_PRODUCT_ATTR', '100000036', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('41', 'SEQ_PRODUCT_ATTR_GROUP', '100000000', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('42', 'SEQ_PRODUCT_ATTR_GROUP_RELA', '100000000', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('43', 'SEQ_CHANNEL', '100000000', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('44', 'SEQ_PROD_OFFER_CHANNEL', '100000018', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('45', 'SEQ_ORG_ROLE', '100000022', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('46', 'SEQ_ORG_AUTH_CODE', '100000002', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('48', 'SEQ_BPM_PROC_MODEL', '100000007', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('49', 'SEQ_BPM_ACT_MODEL', '100000086', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('50', 'SEQ_BPM_TRAN_MODEL', '100000056', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('51', 'SEQ_BPM_ACT_VALUE_DEF', '100000000', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('53', 'SEQ_ENDPOINT_ATTR_VAL', '100003515', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('54', 'SEQ_ADAPTER_NODE_CONFIG', '100000042', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('55', 'SEQ_NODE_CONTENT_CONFIG', '100000030', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('56', 'SEQ_NODE_PATH_CONFIG', '100000020', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('57', 'SEQ_BPM_ACT', '100000079', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('58', 'SEQ_BPM_JOB', '100000019', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('59', 'SEQ_BPM_PROC', '100000030', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('60', 'SEQ_PROCESS_ID', '100000000', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('61', 'SEQ_BPM_WORK_LISTS', '100000060', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('62', 'SEQ_BPM_ACT_VALUE', '100000068', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('63', 'SEQ_PROC_MODE_INST', '100000000', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('64', 'SEQ_PRICING_PLAN_2_PROC_MODE_I', '100000000', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('65', 'SEQ_PROC_MODE_INST_ATTR', '100000000', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('66', 'SEQ_PRICING_PLAN_CLASSIFY_REL', '100000000', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('67', 'SEQ_CONTRACT_DOC', '100000008', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('68', 'SEQ_GET_VALUE_EXPR', '100000000', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('69', 'SEQ_FUNC_2_SERVICE', '100000000', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('70', 'SEQ_API', '100000140', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('71', 'SEQ_DATA_SEQ', '100000000', '5', '1', null);
INSERT INTO sequenceconftable VALUES ('72', 'SEQ_DIRECTORY', '100000013', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('73', 'SEQ_PORTAL_PANEL', '100000000', '12', '1', null);
INSERT INTO sequenceconftable VALUES ('76', 'SEQ_CTL_COUNTERMS_2_C', '100000001', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('77', 'SEQ_AUTH_OBJ', '100000000', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('78', 'SEQ_AUTH', '100000000', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('79', 'SEQ_AUTH_BASE', '100000000', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('80', 'SEQ_AUTH_OBJ_ATTR', '100000000', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('81', 'SEQ_PROOF_EFFECT', '100000000', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('82', 'SEQ_PROOF_VALUES', '100000002', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('83', 'SEQ_BPM_TRAN', '100000049', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('84', 'SEQ_GATHER_CYCLE', '100000000', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('85', 'SEQ_TASK_MANAGER', '100000013', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('86', 'SEQ_TASK_2_SER_INST', '100000000', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('87', 'SEQ_FTP_DIR', '100000000', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('88', 'SEQ_BIZ_FUNCTION', '100000001', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('89', 'SEQ_TEST_SCENE', '100000000', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('90', 'SEQ_TEST_TASK', '100000000', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('91', 'SEQ_TEST_RESULT', '100000000', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('93', 'SEQ_REQUEST_MESSAGE_HIS', '100000000', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('94', 'SEQ_TEST_MSG_MOD', '100000032', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('95', 'SEQ_TEST_SCENE_RELA', '100000000', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('96', 'SEQ_TEST_RESULT_LOG', '100000002', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('97', 'SEQ_NODE_DESC_MAPER', '100000793', '1', '1', null);
INSERT INTO sequenceconftable VALUES ('98', 'SEQ_CONTRACT_ADAPTER', '100000150', '1', '1', null);
INSERT INTO sequenceconftable VALUES ('100', 'SEQ_NODE_VAL_ADAPTER_REQ', '100000079', '1', '1', null);
INSERT INTO sequenceconftable VALUES ('101', 'SEQ_VARIABLE_MAP', '100000008', '1', '1', null);
INSERT INTO sequenceconftable VALUES ('102', 'SEQ_VAR_MAP_TYPE', '100000033', '1', '1', null);
INSERT INTO sequenceconftable VALUES ('103', 'SEQ_DYN_PARAM_MAP', '100000000', '1', '1', null);
INSERT INTO sequenceconftable VALUES ('104', 'SEQ_CONTRACT_DOC_RELA', '100000000', '10', '1', '###max_id###');
INSERT INTO sequenceconftable VALUES ('105', 'SEQ_CONTRACT_VERSION_ID', '100000000', '10', '1', null);
INSERT INTO sequenceconftable VALUES ('106', 'SEQ_PROC_MODE_ATTR_VALUE', '100000000', '1', '1', null);
INSERT INTO sequenceconftable VALUES ('108', 'SEQ_PRICING_PLAN_ATTR', '100000003', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('109', 'SEQ_PROD_OFFER_REL', '100000226', '9', '1', 'B###max_id###');
INSERT INTO sequenceconftable VALUES ('112', 'SEQ_WSDL_IMPORT', '100000005', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('116', 'SEQ_O2P2UPC_ATTR_ID', '880110001001', '12', '1', null);
INSERT INTO sequenceconftable VALUES ('118', 'SEQ_PRICING_TARGET', '100000028', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('119', 'SEQ_COMPONENT_PRICE', '100000018', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('120', 'SEQ_BASIC_TARIFF_ITEM_REL', '100000006', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('121', 'SEQ_RATING_CURVE_DETAIL', '100000009', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('122', 'SEQ_PROD_INST_ID', '100000066', '10', '1', '###max_id###');
INSERT INTO sequenceconftable VALUES ('123', 'SEQ_CUST_INFO', '100000066', '10', '1', '###max_id###');
INSERT INTO sequenceconftable VALUES ('124', 'SEQ_PROD_INST_USER_INFO', '100000066', '10', '1', '###max_id###');
INSERT INTO sequenceconftable VALUES ('125', 'SEQ_CUST_ORDER_INFO', '100000066', '10', '1', '###max_id###');
INSERT INTO sequenceconftable VALUES ('126', 'SEQ_ORDER_ITEM_ID', '100000066', '10', '1', '###max_id###');
INSERT INTO sequenceconftable VALUES ('127', 'SEQ_TASK_RELA_OBJ', '100000013', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('128', 'SEQ_CONTRACT_INTERACTION_ID', '100000469', '10', '1', '###max_id###');
INSERT INTO sequenceconftable VALUES ('129', 'SEQ_OLC_ID', '100000469', '10', '1', '###max_id###');
INSERT INTO sequenceconftable VALUES ('130', 'SEQ_TIME_SEG_DEF', '100000010', '12', '1', null);
INSERT INTO sequenceconftable VALUES ('131', 'SEQ_TIME_SEG_DTL', '100000012', '12', '1', null);
INSERT INTO sequenceconftable VALUES ('134', 'SEQ_PRICING_CASE_ID', '100000079', '9', '1', '');
INSERT INTO sequenceconftable VALUES ('135', 'SEQ_CONTRACT_2_ATTR_SPEC', '100001116', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('136', 'SEQ_SERVICE_PRODUCT_REAL', '100000067', '1', '1', '');
INSERT INTO sequenceconftable VALUES ('137', 'SEQ_OFFER_API_RELA_ID', '100000106', '9', '1', '');
INSERT INTO sequenceconftable VALUES ('138', 'SEQ_PRICING_PLAN', '100000031', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('141', 'SEQ_SETTLE_SP_BUSI_DEF', '100000016', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('142', 'SEQ_SETTLE_CYCLE_DEF', '100000002', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('143', 'SEQ_SETTLE_RULE', '100000006', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('144', 'SEQ_SETTLE_RULE_CONDITION', '100000006', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('145', 'SEQ_SETTLE_RULE_CONDITION_EXPR', '100000000', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('146', 'SEQ_SETTLE_RULE_DETAIL', '100000006', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('147', 'SEQ_OPERATE_LOG', '100012996', '12', '1', '');
INSERT INTO sequenceconftable VALUES ('148', 'SEQ_OPERATE_LOG_DATA', '100014024', '12', '1', '');
INSERT INTO sequenceconftable VALUES ('149', 'SEQ_OPERATE_LOG_BAK', '100000000', '3', '1', '');
INSERT INTO sequenceconftable VALUES ('150', 'SEQ_OPERATE_LOG_DATA_BAK', '100000000', '5', '1', '');
INSERT INTO sequenceconftable VALUES ('151', 'SEQ_FUZZY_ENCRYPTION', '100000000', '1', '1', null);
INSERT INTO sequenceconftable VALUES ('152', 'SEQ_CONTRACT_NODE_FUZZY', '100000000', '1', '1', null);
INSERT INTO sequenceconftable VALUES ('153', 'SEQ_MESSAGE', '5', '11', '1', '');
INSERT INTO sequenceconftable VALUES ('154', 'SEQ_MSG_RECIPIENT_REL', '574', '12', '1', '');
INSERT INTO sequenceconftable VALUES ('155', 'SEQ_MESSAGE_RECIPENT', '526', '12', '1', '');
INSERT INTO sequenceconftable VALUES ('223', 'SEQ_EXCEPTION_DEAL_INFO', '100012896', '10', '1', null);
INSERT INTO sequenceconftable VALUES ('224', 'SEQ_EXCEPTION_DEAL_INFO_HIS', '100000000', '10', '1', null);
INSERT INTO sequenceconftable VALUES ('230', 'SEQ_CSV_TEMPLATE', '100000000', '1', '1', null);
INSERT INTO sequenceconftable VALUES ('231', 'SEQ_DATA_SOURCE', '100000000', '1', '1', null);
INSERT INTO sequenceconftable VALUES ('232', 'SEQ_REMOTE_CALL_INFO_ID', '100000000', '12', '1', null);
INSERT INTO sequenceconftable VALUES ('234', 'SEQ_TASK_ID', '100000000', '10', '1', '###max_id###');
INSERT INTO sequenceconftable VALUES ('235', 'SEQ_WORKFLOW_TASK_CONF_ID', '100000000', '10', '1', '###max_id###');
INSERT INTO sequenceconftable VALUES ('236', 'SEQ_ACTIVE_TASK_RESULT_ID', '100000000', '10', '1', '###max_id###');
INSERT INTO sequenceconftable VALUES ('237', 'SEQ_TASK_LOG_ID', '100000000', '10', '1', '###max_id###');
INSERT INTO sequenceconftable VALUES ('238', 'SEQ_TEST_MSG_MOD_RESPONSE', '4', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('240', 'SEQ_O2P_UPC_SERVICE', '803010000009', '12', '1', null);
INSERT INTO sequenceconftable VALUES ('250', 'SEQ_ZK_PATH', '100000064', '10', '1', null);
INSERT INTO sequenceconftable VALUES ('251', 'SEQ_CONF_PROPERTIES', '100003244', '10', '1', null);
INSERT INTO sequenceconftable VALUES ('260', 'SEQ_CONTRACT_ADAPTER_ENDPOINT', '100000308', '1', '1', null);
INSERT INTO sequenceconftable VALUES ('301', 'SEQ_CONTENT_TEMPLATE_ID', '17', '9', '1', null);
INSERT INTO sequenceconftable VALUES ('303', 'SEQ_WORK_TASK_CONF', '100000100', '10', '1', null);
INSERT INTO sequenceconftable VALUES ('304', 'SEQ_WORK_TASK_CONTION', '100000031', '10', '1', null);
INSERT INTO sequenceconftable VALUES ('305', 'OTT_TASK_SCHEDULE', '100000001', '10', '1', null);
INSERT INTO sequenceconftable VALUES ('306', 'SEQ_SERVICE_BEAN', '100000168', '10', '1', null);
INSERT INTO sequenceconftable VALUES ('307', 'SEQ_SERVICE_BEAN_2_SERVICE', '100000168', '10', '1', null);



INSERT INTO zk_path (dir_id, fa_dir_id, dir_name, dir_type, dir_create_time, dir_state, dir_lastest_time) VALUES ('1', '0', 'cfg', '0', '2015-09-22 16:50:37', 'A', '2015-09-22 16:50:40');
INSERT INTO conf_properties (id, pro_data_type, module_name, group_name, group_desc, effect_zone, create_dt, modify_dt, pro_key, pro_value, pro_value_buffer, pro_type, pro_encrypt, syn_status, pro_constraint, dir_id, description) VALUES ('1', 'string', NULL, 'default', NULL, NULL, '2015-11-24 16:02:44', '2015-11-24 16:02:45', 'staffModelFrom', 'workflow', NULL, NULL, '0', '1', NULL, '2', NULL);
INSERT INTO zk_path (dir_id, fa_dir_id, dir_name, dir_type, dir_create_time, dir_state, dir_lastest_time) VALUES (2, 1, 'serviceAgent', '1', '2015-10-25 18:32:33', 'A', '2015-10-25 18:32:33');
INSERT INTO zk_path (dir_id, fa_dir_id, dir_name, dir_type, dir_create_time, dir_state, dir_lastest_time) VALUES (3, 1, 'serviceAgent1', '1', '2015-10-25 18:32:33', 'A', '2015-10-25 18:32:33');

