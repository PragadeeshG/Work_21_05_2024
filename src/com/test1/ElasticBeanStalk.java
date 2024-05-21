package com.test1;

public class ElasticBeanStalk {
	private String applications;
	private String routeFifty;
	private String loadBalancer;
	private String autoScalingGroup;
	private String availZones;
	private String elasticCahce;
	private String amazonDataSource;
	private String publicSubnet;
	private String privateSubnet;
	private String status;

	public ElasticBeanStalk() {

	}

	public ElasticBeanStalk(String applications, String routeFifty, String loadBalancer, String autoScalingGroup,
			String availZones, String elasticCahce, String amazonDataSource, String publicSubnet, String privateSubnet,
			String status) {
		super();
		this.applications = applications;
		this.routeFifty = routeFifty;
		this.loadBalancer = loadBalancer;
		this.autoScalingGroup = autoScalingGroup;
		this.availZones = availZones;
		this.elasticCahce = elasticCahce;
		this.amazonDataSource = amazonDataSource;
		this.publicSubnet = publicSubnet;
		this.privateSubnet = privateSubnet;
		this.status = status;
	}

	public String getApplications() {
		return applications;
	}

	public void setApplications(String applications) {
		this.applications = applications;
	}

	public String getRouteFifty() {
		return routeFifty;
	}

	public void setRouteFifty(String routeFifty) {
		this.routeFifty = routeFifty;
	}

	public String getLoadBalancer() {
		return loadBalancer;
	}

	public void setLoadBalancer(String loadBalancer) {
		this.loadBalancer = loadBalancer;
	}

	public String getAutoScalingGroup() {
		return autoScalingGroup;
	}

	public void setAutoScalingGroup(String autoScalingGroup) {
		this.autoScalingGroup = autoScalingGroup;
	}

	public String getAvailZones() {
		return availZones;
	}

	public void setAvailZones(String availZones) {
		this.availZones = availZones;
	}

	public String getElasticCahce() {
		return elasticCahce;
	}

	public void setElasticCahce(String elasticCahce) {
		this.elasticCahce = elasticCahce;
	}

	public String getAmazonDataSource() {
		return amazonDataSource;
	}

	public void setAmazonDataSource(String amazonDataSource) {
		this.amazonDataSource = amazonDataSource;
	}

	public String getPublicSubnet() {
		return publicSubnet;
	}

	public void setPublicSubnet(String publicSubnet) {
		this.publicSubnet = publicSubnet;
	}

	public String getPrivateSubnet() {
		return privateSubnet;
	}

	public void setPrivateSubnet(String privateSubnet) {
		this.privateSubnet = privateSubnet;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
