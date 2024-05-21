package com.test1;

public class StandardQueues {
	private Integer queueId;
	private String streamPolicy;
	private boolean queueAccessDeny;
	private Integer queueName;
	private String streamType;
	private String streamStatus;
	private Integer owner;
	private Integer dedLetterQueue;
	private String delayQueue;
	private Integer firstInFirstOutQueue;
	private String lastInFirstOutQueue;
	private String status;
	private String remarks;

	public StandardQueues() {

	}

	public StandardQueues(Integer queueId, String streamPolicy, boolean queueAccessDeny, Integer queueName,
			String streamType, String streamStatus, Integer owner, Integer dedLetterQueue, String delayQueue,
			Integer firstInFirstOutQueue, String lastInFirstOutQueue, String status, String remarks) {
		super();
		this.queueId = queueId;
		this.streamPolicy = streamPolicy;
		this.queueAccessDeny = queueAccessDeny;
		this.queueName = queueName;
		this.streamType = streamType;
		this.streamStatus = streamStatus;
		this.owner = owner;
		this.dedLetterQueue = dedLetterQueue;
		this.delayQueue = delayQueue;
		this.firstInFirstOutQueue = firstInFirstOutQueue;
		this.lastInFirstOutQueue = lastInFirstOutQueue;
		this.status = status;
		this.remarks = remarks;
	}

	public Integer getQueueId() {
		return queueId;
	}

	public void setQueueId(Integer queueId) {
		this.queueId = queueId;
	}

	public String getStreamPolicy() {
		return streamPolicy;
	}

	public void setStreamPolicy(String streamPolicy) {
		this.streamPolicy = streamPolicy;
	}

	public boolean isQueueAccessDeny() {
		return queueAccessDeny;
	}

	public void setQueueAccessDeny(boolean queueAccessDeny) {
		this.queueAccessDeny = queueAccessDeny;
	}

	public Integer getQueueName() {
		return queueName;
	}

	public void setQueueName(Integer queueName) {
		this.queueName = queueName;
	}

	public String getStreamType() {
		return streamType;
	}

	public void setStreamType(String streamType) {
		this.streamType = streamType;
	}

	public String getStreamStatus() {
		return streamStatus;
	}

	public void setStreamStatus(String streamStatus) {
		this.streamStatus = streamStatus;
	}

	public Integer getOwner() {
		return owner;
	}

	public void setOwner(Integer owner) {
		this.owner = owner;
	}

	public Integer getDedLetterQueue() {
		return dedLetterQueue;
	}

	public void setDedLetterQueue(Integer dedLetterQueue) {
		this.dedLetterQueue = dedLetterQueue;
	}

	public String getDelayQueue() {
		return delayQueue;
	}

	public void setDelayQueue(String delayQueue) {
		this.delayQueue = delayQueue;
	}

	public Integer getFirstInFirstOutQueue() {
		return firstInFirstOutQueue;
	}

	public void setFirstInFirstOutQueue(Integer firstInFirstOutQueue) {
		this.firstInFirstOutQueue = firstInFirstOutQueue;
	}

	public String getLastInFirstOutQueue() {
		return lastInFirstOutQueue;
	}

	public void setLastInFirstOutQueue(String lastInFirstOutQueue) {
		this.lastInFirstOutQueue = lastInFirstOutQueue;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
