package com.test1;

public class DataStreams {
	private Integer streamId;
	private String streamFlowType;
	private String referenceId;
	private String streamRequestType;
	private Integer streamRequestId;
	private Integer streamRequestTypeCode;
	private Integer opCode;
	private String operations;
	private String clientLib;
	private String streamFireHose;
	private String dataAnalystics;
	private String entityState;

	public DataStreams() {

	}

	public DataStreams(Integer streamId, String streamFlowType, String referenceId, String streamRequestType,
			Integer streamRequestId, Integer streamRequestTypeCode, Integer opCode, String operations, String clientLib,
			String streamFireHose, String dataAnalystics, String entityState) {
		super();
		this.streamId = streamId;
		this.streamFlowType = streamFlowType;
		this.referenceId = referenceId;
		this.streamRequestType = streamRequestType;
		this.streamRequestId = streamRequestId;
		this.streamRequestTypeCode = streamRequestTypeCode;
		this.opCode = opCode;
		this.operations = operations;
		this.clientLib = clientLib;
		this.streamFireHose = streamFireHose;
		this.dataAnalystics = dataAnalystics;
		this.entityState = entityState;
	}

	public Integer getStreamId() {
		return streamId;
	}

	public void setStreamId(Integer streamId) {
		this.streamId = streamId;
	}

	public String getStreamFlowType() {
		return streamFlowType;
	}

	public void setStreamFlowType(String streamFlowType) {
		this.streamFlowType = streamFlowType;
	}

	public String getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	public String getStreamRequestType() {
		return streamRequestType;
	}

	public void setStreamRequestType(String streamRequestType) {
		this.streamRequestType = streamRequestType;
	}

	public Integer getStreamRequestId() {
		return streamRequestId;
	}

	public void setStreamRequestId(Integer streamRequestId) {
		this.streamRequestId = streamRequestId;
	}

	public Integer getStreamRequestTypeCode() {
		return streamRequestTypeCode;
	}

	public void setStreamRequestTypeCode(Integer streamRequestTypeCode) {
		this.streamRequestTypeCode = streamRequestTypeCode;
	}

	public Integer getOpCode() {
		return opCode;
	}

	public void setOpCode(Integer opCode) {
		this.opCode = opCode;
	}

	public String getOperations() {
		return operations;
	}

	public void setOperations(String operations) {
		this.operations = operations;
	}

	public String getClientLib() {
		return clientLib;
	}

	public void setClientLib(String clientLib) {
		this.clientLib = clientLib;
	}

	public String getStreamFireHose() {
		return streamFireHose;
	}

	public void setStreamFireHose(String streamFireHose) {
		this.streamFireHose = streamFireHose;
	}

	public String getDataAnalystics() {
		return dataAnalystics;
	}

	public void setDataAnalystics(String dataAnalystics) {
		this.dataAnalystics = dataAnalystics;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
