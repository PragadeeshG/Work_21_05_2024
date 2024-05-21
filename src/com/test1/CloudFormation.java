package com.test1;

public class CloudFormation {
	private Integer resourceId;
	private Integer parameters;
	private String templateId;
	private String templateName;
	private String mappings;
	private String templateInput;
	private boolean templateOutputAvailable;
	private String templateOutput;
	private String intrinsicFunction;
	private String rollback;
	private String serviceRole;
	private String capabilityIndicator;
	private String deletionPolicy;
	private String stackPolicy;

	public CloudFormation() {

	}

	public CloudFormation(Integer resourceId, Integer parameters, String templateId, String templateName,
			String mappings, String templateInput, boolean templateOutputAvailable, String templateOutput,
			String intrinsicFunction, String rollback, String serviceRole, String capabilityIndicator,
			String deletionPolicy, String stackPolicy) {
		super();
		this.resourceId = resourceId;
		this.parameters = parameters;
		this.templateId = templateId;
		this.templateName = templateName;
		this.mappings = mappings;
		this.templateInput = templateInput;
		this.templateOutputAvailable = templateOutputAvailable;
		this.templateOutput = templateOutput;
		this.intrinsicFunction = intrinsicFunction;
		this.rollback = rollback;
		this.serviceRole = serviceRole;
		this.capabilityIndicator = capabilityIndicator;
		this.deletionPolicy = deletionPolicy;
		this.stackPolicy = stackPolicy;
	}

	public Integer getResourceId() {
		return resourceId;
	}

	public void setResourceId(Integer resourceId) {
		this.resourceId = resourceId;
	}

	public Integer getParameters() {
		return parameters;
	}

	public void setParameters(Integer parameters) {
		this.parameters = parameters;
	}

	public String getTemplateId() {
		return templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getMappings() {
		return mappings;
	}

	public void setMappings(String mappings) {
		this.mappings = mappings;
	}

	public String getTemplateInput() {
		return templateInput;
	}

	public void setTemplateInput(String templateInput) {
		this.templateInput = templateInput;
	}

	public boolean isTemplateOutputAvailable() {
		return templateOutputAvailable;
	}

	public void setTemplateOutputAvailable(boolean templateOutputAvailable) {
		this.templateOutputAvailable = templateOutputAvailable;
	}

	public String getTemplateOutput() {
		return templateOutput;
	}

	public void setTemplateOutput(String templateOutput) {
		this.templateOutput = templateOutput;
	}

	public String getIntrinsicFunction() {
		return intrinsicFunction;
	}

	public void setIntrinsicFunction(String intrinsicFunction) {
		this.intrinsicFunction = intrinsicFunction;
	}

	public String getRollback() {
		return rollback;
	}

	public void setRollback(String rollback) {
		this.rollback = rollback;
	}

	public String getServiceRole() {
		return serviceRole;
	}

	public void setServiceRole(String serviceRole) {
		this.serviceRole = serviceRole;
	}

	public String getCapabilityIndicator() {
		return capabilityIndicator;
	}

	public void setCapabilityIndicator(String capabilityIndicator) {
		this.capabilityIndicator = capabilityIndicator;
	}

	public String getDeletionPolicy() {
		return deletionPolicy;
	}

	public void setDeletionPolicy(String deletionPolicy) {
		this.deletionPolicy = deletionPolicy;
	}

	public String getStackPolicy() {
		return stackPolicy;
	}

	public void setStackPolicy(String stackPolicy) {
		this.stackPolicy = stackPolicy;
	}

}
