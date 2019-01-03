/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a flow log.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/FlowLog" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FlowLog implements Serializable, Cloneable {

    /**
     * <p>
     * The date and time the flow log was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Information about the error that occurred. <code>Rate limited</code> indicates that CloudWatch Logs throttling
     * has been applied for one or more network interfaces, or that you've reached the limit on the number of log groups
     * that you can create. <code>Access error</code> indicates that the IAM role associated with the flow log does not
     * have sufficient permissions to publish to CloudWatch Logs. <code>Unknown error</code> indicates an internal
     * error.
     * </p>
     */
    private String deliverLogsErrorMessage;
    /**
     * <p>
     * The ARN of the IAM role that posts logs to CloudWatch Logs.
     * </p>
     */
    private String deliverLogsPermissionArn;
    /**
     * <p>
     * The status of the logs delivery (<code>SUCCESS</code> | <code>FAILED</code>).
     * </p>
     */
    private String deliverLogsStatus;
    /**
     * <p>
     * The flow log ID.
     * </p>
     */
    private String flowLogId;
    /**
     * <p>
     * The status of the flow log (<code>ACTIVE</code>).
     * </p>
     */
    private String flowLogStatus;
    /**
     * <p>
     * The name of the flow log group.
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * The ID of the resource on which the flow log was created.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The type of traffic captured for the flow log.
     * </p>
     */
    private String trafficType;
    /**
     * <p>
     * Specifies the type of destination to which the flow log data is published. Flow log data can be published to
     * CloudWatch Logs or Amazon S3.
     * </p>
     */
    private String logDestinationType;
    /**
     * <p>
     * Specifies the destination to which the flow log data is published. Flow log data can be published to an
     * CloudWatch Logs log group or an Amazon S3 bucket. If the flow log publishes to CloudWatch Logs, this element
     * indicates the Amazon Resource Name (ARN) of the CloudWatch Logs log group to which the data is published. If the
     * flow log publishes to Amazon S3, this element indicates the ARN of the Amazon S3 bucket to which the data is
     * published.
     * </p>
     */
    private String logDestination;

    /**
     * <p>
     * The date and time the flow log was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time the flow log was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time the flow log was created.
     * </p>
     * 
     * @return The date and time the flow log was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time the flow log was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time the flow log was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowLog withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Information about the error that occurred. <code>Rate limited</code> indicates that CloudWatch Logs throttling
     * has been applied for one or more network interfaces, or that you've reached the limit on the number of log groups
     * that you can create. <code>Access error</code> indicates that the IAM role associated with the flow log does not
     * have sufficient permissions to publish to CloudWatch Logs. <code>Unknown error</code> indicates an internal
     * error.
     * </p>
     * 
     * @param deliverLogsErrorMessage
     *        Information about the error that occurred. <code>Rate limited</code> indicates that CloudWatch Logs
     *        throttling has been applied for one or more network interfaces, or that you've reached the limit on the
     *        number of log groups that you can create. <code>Access error</code> indicates that the IAM role associated
     *        with the flow log does not have sufficient permissions to publish to CloudWatch Logs.
     *        <code>Unknown error</code> indicates an internal error.
     */

    public void setDeliverLogsErrorMessage(String deliverLogsErrorMessage) {
        this.deliverLogsErrorMessage = deliverLogsErrorMessage;
    }

    /**
     * <p>
     * Information about the error that occurred. <code>Rate limited</code> indicates that CloudWatch Logs throttling
     * has been applied for one or more network interfaces, or that you've reached the limit on the number of log groups
     * that you can create. <code>Access error</code> indicates that the IAM role associated with the flow log does not
     * have sufficient permissions to publish to CloudWatch Logs. <code>Unknown error</code> indicates an internal
     * error.
     * </p>
     * 
     * @return Information about the error that occurred. <code>Rate limited</code> indicates that CloudWatch Logs
     *         throttling has been applied for one or more network interfaces, or that you've reached the limit on the
     *         number of log groups that you can create. <code>Access error</code> indicates that the IAM role
     *         associated with the flow log does not have sufficient permissions to publish to CloudWatch Logs.
     *         <code>Unknown error</code> indicates an internal error.
     */

    public String getDeliverLogsErrorMessage() {
        return this.deliverLogsErrorMessage;
    }

    /**
     * <p>
     * Information about the error that occurred. <code>Rate limited</code> indicates that CloudWatch Logs throttling
     * has been applied for one or more network interfaces, or that you've reached the limit on the number of log groups
     * that you can create. <code>Access error</code> indicates that the IAM role associated with the flow log does not
     * have sufficient permissions to publish to CloudWatch Logs. <code>Unknown error</code> indicates an internal
     * error.
     * </p>
     * 
     * @param deliverLogsErrorMessage
     *        Information about the error that occurred. <code>Rate limited</code> indicates that CloudWatch Logs
     *        throttling has been applied for one or more network interfaces, or that you've reached the limit on the
     *        number of log groups that you can create. <code>Access error</code> indicates that the IAM role associated
     *        with the flow log does not have sufficient permissions to publish to CloudWatch Logs.
     *        <code>Unknown error</code> indicates an internal error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowLog withDeliverLogsErrorMessage(String deliverLogsErrorMessage) {
        setDeliverLogsErrorMessage(deliverLogsErrorMessage);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that posts logs to CloudWatch Logs.
     * </p>
     * 
     * @param deliverLogsPermissionArn
     *        The ARN of the IAM role that posts logs to CloudWatch Logs.
     */

    public void setDeliverLogsPermissionArn(String deliverLogsPermissionArn) {
        this.deliverLogsPermissionArn = deliverLogsPermissionArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that posts logs to CloudWatch Logs.
     * </p>
     * 
     * @return The ARN of the IAM role that posts logs to CloudWatch Logs.
     */

    public String getDeliverLogsPermissionArn() {
        return this.deliverLogsPermissionArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that posts logs to CloudWatch Logs.
     * </p>
     * 
     * @param deliverLogsPermissionArn
     *        The ARN of the IAM role that posts logs to CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowLog withDeliverLogsPermissionArn(String deliverLogsPermissionArn) {
        setDeliverLogsPermissionArn(deliverLogsPermissionArn);
        return this;
    }

    /**
     * <p>
     * The status of the logs delivery (<code>SUCCESS</code> | <code>FAILED</code>).
     * </p>
     * 
     * @param deliverLogsStatus
     *        The status of the logs delivery (<code>SUCCESS</code> | <code>FAILED</code>).
     */

    public void setDeliverLogsStatus(String deliverLogsStatus) {
        this.deliverLogsStatus = deliverLogsStatus;
    }

    /**
     * <p>
     * The status of the logs delivery (<code>SUCCESS</code> | <code>FAILED</code>).
     * </p>
     * 
     * @return The status of the logs delivery (<code>SUCCESS</code> | <code>FAILED</code>).
     */

    public String getDeliverLogsStatus() {
        return this.deliverLogsStatus;
    }

    /**
     * <p>
     * The status of the logs delivery (<code>SUCCESS</code> | <code>FAILED</code>).
     * </p>
     * 
     * @param deliverLogsStatus
     *        The status of the logs delivery (<code>SUCCESS</code> | <code>FAILED</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowLog withDeliverLogsStatus(String deliverLogsStatus) {
        setDeliverLogsStatus(deliverLogsStatus);
        return this;
    }

    /**
     * <p>
     * The flow log ID.
     * </p>
     * 
     * @param flowLogId
     *        The flow log ID.
     */

    public void setFlowLogId(String flowLogId) {
        this.flowLogId = flowLogId;
    }

    /**
     * <p>
     * The flow log ID.
     * </p>
     * 
     * @return The flow log ID.
     */

    public String getFlowLogId() {
        return this.flowLogId;
    }

    /**
     * <p>
     * The flow log ID.
     * </p>
     * 
     * @param flowLogId
     *        The flow log ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowLog withFlowLogId(String flowLogId) {
        setFlowLogId(flowLogId);
        return this;
    }

    /**
     * <p>
     * The status of the flow log (<code>ACTIVE</code>).
     * </p>
     * 
     * @param flowLogStatus
     *        The status of the flow log (<code>ACTIVE</code>).
     */

    public void setFlowLogStatus(String flowLogStatus) {
        this.flowLogStatus = flowLogStatus;
    }

    /**
     * <p>
     * The status of the flow log (<code>ACTIVE</code>).
     * </p>
     * 
     * @return The status of the flow log (<code>ACTIVE</code>).
     */

    public String getFlowLogStatus() {
        return this.flowLogStatus;
    }

    /**
     * <p>
     * The status of the flow log (<code>ACTIVE</code>).
     * </p>
     * 
     * @param flowLogStatus
     *        The status of the flow log (<code>ACTIVE</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowLog withFlowLogStatus(String flowLogStatus) {
        setFlowLogStatus(flowLogStatus);
        return this;
    }

    /**
     * <p>
     * The name of the flow log group.
     * </p>
     * 
     * @param logGroupName
     *        The name of the flow log group.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the flow log group.
     * </p>
     * 
     * @return The name of the flow log group.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The name of the flow log group.
     * </p>
     * 
     * @param logGroupName
     *        The name of the flow log group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowLog withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * The ID of the resource on which the flow log was created.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource on which the flow log was created.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource on which the flow log was created.
     * </p>
     * 
     * @return The ID of the resource on which the flow log was created.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the resource on which the flow log was created.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource on which the flow log was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowLog withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The type of traffic captured for the flow log.
     * </p>
     * 
     * @param trafficType
     *        The type of traffic captured for the flow log.
     * @see TrafficType
     */

    public void setTrafficType(String trafficType) {
        this.trafficType = trafficType;
    }

    /**
     * <p>
     * The type of traffic captured for the flow log.
     * </p>
     * 
     * @return The type of traffic captured for the flow log.
     * @see TrafficType
     */

    public String getTrafficType() {
        return this.trafficType;
    }

    /**
     * <p>
     * The type of traffic captured for the flow log.
     * </p>
     * 
     * @param trafficType
     *        The type of traffic captured for the flow log.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficType
     */

    public FlowLog withTrafficType(String trafficType) {
        setTrafficType(trafficType);
        return this;
    }

    /**
     * <p>
     * The type of traffic captured for the flow log.
     * </p>
     * 
     * @param trafficType
     *        The type of traffic captured for the flow log.
     * @see TrafficType
     */

    public void setTrafficType(TrafficType trafficType) {
        withTrafficType(trafficType);
    }

    /**
     * <p>
     * The type of traffic captured for the flow log.
     * </p>
     * 
     * @param trafficType
     *        The type of traffic captured for the flow log.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficType
     */

    public FlowLog withTrafficType(TrafficType trafficType) {
        this.trafficType = trafficType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the type of destination to which the flow log data is published. Flow log data can be published to
     * CloudWatch Logs or Amazon S3.
     * </p>
     * 
     * @param logDestinationType
     *        Specifies the type of destination to which the flow log data is published. Flow log data can be published
     *        to CloudWatch Logs or Amazon S3.
     * @see LogDestinationType
     */

    public void setLogDestinationType(String logDestinationType) {
        this.logDestinationType = logDestinationType;
    }

    /**
     * <p>
     * Specifies the type of destination to which the flow log data is published. Flow log data can be published to
     * CloudWatch Logs or Amazon S3.
     * </p>
     * 
     * @return Specifies the type of destination to which the flow log data is published. Flow log data can be published
     *         to CloudWatch Logs or Amazon S3.
     * @see LogDestinationType
     */

    public String getLogDestinationType() {
        return this.logDestinationType;
    }

    /**
     * <p>
     * Specifies the type of destination to which the flow log data is published. Flow log data can be published to
     * CloudWatch Logs or Amazon S3.
     * </p>
     * 
     * @param logDestinationType
     *        Specifies the type of destination to which the flow log data is published. Flow log data can be published
     *        to CloudWatch Logs or Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogDestinationType
     */

    public FlowLog withLogDestinationType(String logDestinationType) {
        setLogDestinationType(logDestinationType);
        return this;
    }

    /**
     * <p>
     * Specifies the type of destination to which the flow log data is published. Flow log data can be published to
     * CloudWatch Logs or Amazon S3.
     * </p>
     * 
     * @param logDestinationType
     *        Specifies the type of destination to which the flow log data is published. Flow log data can be published
     *        to CloudWatch Logs or Amazon S3.
     * @see LogDestinationType
     */

    public void setLogDestinationType(LogDestinationType logDestinationType) {
        withLogDestinationType(logDestinationType);
    }

    /**
     * <p>
     * Specifies the type of destination to which the flow log data is published. Flow log data can be published to
     * CloudWatch Logs or Amazon S3.
     * </p>
     * 
     * @param logDestinationType
     *        Specifies the type of destination to which the flow log data is published. Flow log data can be published
     *        to CloudWatch Logs or Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogDestinationType
     */

    public FlowLog withLogDestinationType(LogDestinationType logDestinationType) {
        this.logDestinationType = logDestinationType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the destination to which the flow log data is published. Flow log data can be published to an
     * CloudWatch Logs log group or an Amazon S3 bucket. If the flow log publishes to CloudWatch Logs, this element
     * indicates the Amazon Resource Name (ARN) of the CloudWatch Logs log group to which the data is published. If the
     * flow log publishes to Amazon S3, this element indicates the ARN of the Amazon S3 bucket to which the data is
     * published.
     * </p>
     * 
     * @param logDestination
     *        Specifies the destination to which the flow log data is published. Flow log data can be published to an
     *        CloudWatch Logs log group or an Amazon S3 bucket. If the flow log publishes to CloudWatch Logs, this
     *        element indicates the Amazon Resource Name (ARN) of the CloudWatch Logs log group to which the data is
     *        published. If the flow log publishes to Amazon S3, this element indicates the ARN of the Amazon S3 bucket
     *        to which the data is published.
     */

    public void setLogDestination(String logDestination) {
        this.logDestination = logDestination;
    }

    /**
     * <p>
     * Specifies the destination to which the flow log data is published. Flow log data can be published to an
     * CloudWatch Logs log group or an Amazon S3 bucket. If the flow log publishes to CloudWatch Logs, this element
     * indicates the Amazon Resource Name (ARN) of the CloudWatch Logs log group to which the data is published. If the
     * flow log publishes to Amazon S3, this element indicates the ARN of the Amazon S3 bucket to which the data is
     * published.
     * </p>
     * 
     * @return Specifies the destination to which the flow log data is published. Flow log data can be published to an
     *         CloudWatch Logs log group or an Amazon S3 bucket. If the flow log publishes to CloudWatch Logs, this
     *         element indicates the Amazon Resource Name (ARN) of the CloudWatch Logs log group to which the data is
     *         published. If the flow log publishes to Amazon S3, this element indicates the ARN of the Amazon S3 bucket
     *         to which the data is published.
     */

    public String getLogDestination() {
        return this.logDestination;
    }

    /**
     * <p>
     * Specifies the destination to which the flow log data is published. Flow log data can be published to an
     * CloudWatch Logs log group or an Amazon S3 bucket. If the flow log publishes to CloudWatch Logs, this element
     * indicates the Amazon Resource Name (ARN) of the CloudWatch Logs log group to which the data is published. If the
     * flow log publishes to Amazon S3, this element indicates the ARN of the Amazon S3 bucket to which the data is
     * published.
     * </p>
     * 
     * @param logDestination
     *        Specifies the destination to which the flow log data is published. Flow log data can be published to an
     *        CloudWatch Logs log group or an Amazon S3 bucket. If the flow log publishes to CloudWatch Logs, this
     *        element indicates the Amazon Resource Name (ARN) of the CloudWatch Logs log group to which the data is
     *        published. If the flow log publishes to Amazon S3, this element indicates the ARN of the Amazon S3 bucket
     *        to which the data is published.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowLog withLogDestination(String logDestination) {
        setLogDestination(logDestination);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDeliverLogsErrorMessage() != null)
            sb.append("DeliverLogsErrorMessage: ").append(getDeliverLogsErrorMessage()).append(",");
        if (getDeliverLogsPermissionArn() != null)
            sb.append("DeliverLogsPermissionArn: ").append(getDeliverLogsPermissionArn()).append(",");
        if (getDeliverLogsStatus() != null)
            sb.append("DeliverLogsStatus: ").append(getDeliverLogsStatus()).append(",");
        if (getFlowLogId() != null)
            sb.append("FlowLogId: ").append(getFlowLogId()).append(",");
        if (getFlowLogStatus() != null)
            sb.append("FlowLogStatus: ").append(getFlowLogStatus()).append(",");
        if (getLogGroupName() != null)
            sb.append("LogGroupName: ").append(getLogGroupName()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getTrafficType() != null)
            sb.append("TrafficType: ").append(getTrafficType()).append(",");
        if (getLogDestinationType() != null)
            sb.append("LogDestinationType: ").append(getLogDestinationType()).append(",");
        if (getLogDestination() != null)
            sb.append("LogDestination: ").append(getLogDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FlowLog == false)
            return false;
        FlowLog other = (FlowLog) obj;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDeliverLogsErrorMessage() == null ^ this.getDeliverLogsErrorMessage() == null)
            return false;
        if (other.getDeliverLogsErrorMessage() != null && other.getDeliverLogsErrorMessage().equals(this.getDeliverLogsErrorMessage()) == false)
            return false;
        if (other.getDeliverLogsPermissionArn() == null ^ this.getDeliverLogsPermissionArn() == null)
            return false;
        if (other.getDeliverLogsPermissionArn() != null && other.getDeliverLogsPermissionArn().equals(this.getDeliverLogsPermissionArn()) == false)
            return false;
        if (other.getDeliverLogsStatus() == null ^ this.getDeliverLogsStatus() == null)
            return false;
        if (other.getDeliverLogsStatus() != null && other.getDeliverLogsStatus().equals(this.getDeliverLogsStatus()) == false)
            return false;
        if (other.getFlowLogId() == null ^ this.getFlowLogId() == null)
            return false;
        if (other.getFlowLogId() != null && other.getFlowLogId().equals(this.getFlowLogId()) == false)
            return false;
        if (other.getFlowLogStatus() == null ^ this.getFlowLogStatus() == null)
            return false;
        if (other.getFlowLogStatus() != null && other.getFlowLogStatus().equals(this.getFlowLogStatus()) == false)
            return false;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getTrafficType() == null ^ this.getTrafficType() == null)
            return false;
        if (other.getTrafficType() != null && other.getTrafficType().equals(this.getTrafficType()) == false)
            return false;
        if (other.getLogDestinationType() == null ^ this.getLogDestinationType() == null)
            return false;
        if (other.getLogDestinationType() != null && other.getLogDestinationType().equals(this.getLogDestinationType()) == false)
            return false;
        if (other.getLogDestination() == null ^ this.getLogDestination() == null)
            return false;
        if (other.getLogDestination() != null && other.getLogDestination().equals(this.getLogDestination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDeliverLogsErrorMessage() == null) ? 0 : getDeliverLogsErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getDeliverLogsPermissionArn() == null) ? 0 : getDeliverLogsPermissionArn().hashCode());
        hashCode = prime * hashCode + ((getDeliverLogsStatus() == null) ? 0 : getDeliverLogsStatus().hashCode());
        hashCode = prime * hashCode + ((getFlowLogId() == null) ? 0 : getFlowLogId().hashCode());
        hashCode = prime * hashCode + ((getFlowLogStatus() == null) ? 0 : getFlowLogStatus().hashCode());
        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getTrafficType() == null) ? 0 : getTrafficType().hashCode());
        hashCode = prime * hashCode + ((getLogDestinationType() == null) ? 0 : getLogDestinationType().hashCode());
        hashCode = prime * hashCode + ((getLogDestination() == null) ? 0 : getLogDestination().hashCode());
        return hashCode;
    }

    @Override
    public FlowLog clone() {
        try {
            return (FlowLog) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
