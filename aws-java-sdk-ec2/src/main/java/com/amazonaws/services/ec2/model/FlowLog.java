/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a flow log.
 * </p>
 */
public class FlowLog implements Serializable, Cloneable {

    /**
     * The date and time the flow log was created.
     */
    private java.util.Date creationTime;

    /**
     * The flow log ID.
     */
    private String flowLogId;

    /**
     * The status of the flow log (<code>ACTIVE</code>).
     */
    private String flowLogStatus;

    /**
     * The ID of the resource on which the flow log was created.
     */
    private String resourceId;

    /**
     * The type of traffic captured for the flow log.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCEPT, REJECT, ALL
     */
    private String trafficType;

    /**
     * The name of the flow log group.
     */
    private String logGroupName;

    /**
     * The status of the logs delivery (<code>SUCCESS</code> |
     * <code>FAILED</code>).
     */
    private String deliverLogsStatus;

    /**
     * Information about the error that occurred. <code>Rate limited</code>
     * indicates that CloudWatch logs throttling has been applied for one or
     * more network interfaces. <code>Access error</code> indicates that the
     * IAM role associated with the flow log does not have sufficient
     * permissions to publish to CloudWatch Logs. <code>Unknown error</code>
     * indicates an internal error.
     */
    private String deliverLogsErrorMessage;

    /**
     * The ARN of the IAM role that posts logs to CloudWatch Logs.
     */
    private String deliverLogsPermissionArn;

    /**
     * The date and time the flow log was created.
     *
     * @return The date and time the flow log was created.
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }
    
    /**
     * The date and time the flow log was created.
     *
     * @param creationTime The date and time the flow log was created.
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }
    
    /**
     * The date and time the flow log was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationTime The date and time the flow log was created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FlowLog withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * The flow log ID.
     *
     * @return The flow log ID.
     */
    public String getFlowLogId() {
        return flowLogId;
    }
    
    /**
     * The flow log ID.
     *
     * @param flowLogId The flow log ID.
     */
    public void setFlowLogId(String flowLogId) {
        this.flowLogId = flowLogId;
    }
    
    /**
     * The flow log ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param flowLogId The flow log ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FlowLog withFlowLogId(String flowLogId) {
        this.flowLogId = flowLogId;
        return this;
    }

    /**
     * The status of the flow log (<code>ACTIVE</code>).
     *
     * @return The status of the flow log (<code>ACTIVE</code>).
     */
    public String getFlowLogStatus() {
        return flowLogStatus;
    }
    
    /**
     * The status of the flow log (<code>ACTIVE</code>).
     *
     * @param flowLogStatus The status of the flow log (<code>ACTIVE</code>).
     */
    public void setFlowLogStatus(String flowLogStatus) {
        this.flowLogStatus = flowLogStatus;
    }
    
    /**
     * The status of the flow log (<code>ACTIVE</code>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param flowLogStatus The status of the flow log (<code>ACTIVE</code>).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FlowLog withFlowLogStatus(String flowLogStatus) {
        this.flowLogStatus = flowLogStatus;
        return this;
    }

    /**
     * The ID of the resource on which the flow log was created.
     *
     * @return The ID of the resource on which the flow log was created.
     */
    public String getResourceId() {
        return resourceId;
    }
    
    /**
     * The ID of the resource on which the flow log was created.
     *
     * @param resourceId The ID of the resource on which the flow log was created.
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
    
    /**
     * The ID of the resource on which the flow log was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceId The ID of the resource on which the flow log was created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FlowLog withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * The type of traffic captured for the flow log.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCEPT, REJECT, ALL
     *
     * @return The type of traffic captured for the flow log.
     *
     * @see TrafficType
     */
    public String getTrafficType() {
        return trafficType;
    }
    
    /**
     * The type of traffic captured for the flow log.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCEPT, REJECT, ALL
     *
     * @param trafficType The type of traffic captured for the flow log.
     *
     * @see TrafficType
     */
    public void setTrafficType(String trafficType) {
        this.trafficType = trafficType;
    }
    
    /**
     * The type of traffic captured for the flow log.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCEPT, REJECT, ALL
     *
     * @param trafficType The type of traffic captured for the flow log.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see TrafficType
     */
    public FlowLog withTrafficType(String trafficType) {
        this.trafficType = trafficType;
        return this;
    }

    /**
     * The type of traffic captured for the flow log.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCEPT, REJECT, ALL
     *
     * @param trafficType The type of traffic captured for the flow log.
     *
     * @see TrafficType
     */
    public void setTrafficType(TrafficType trafficType) {
        this.trafficType = trafficType.toString();
    }
    
    /**
     * The type of traffic captured for the flow log.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCEPT, REJECT, ALL
     *
     * @param trafficType The type of traffic captured for the flow log.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see TrafficType
     */
    public FlowLog withTrafficType(TrafficType trafficType) {
        this.trafficType = trafficType.toString();
        return this;
    }

    /**
     * The name of the flow log group.
     *
     * @return The name of the flow log group.
     */
    public String getLogGroupName() {
        return logGroupName;
    }
    
    /**
     * The name of the flow log group.
     *
     * @param logGroupName The name of the flow log group.
     */
    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }
    
    /**
     * The name of the flow log group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param logGroupName The name of the flow log group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FlowLog withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * The status of the logs delivery (<code>SUCCESS</code> |
     * <code>FAILED</code>).
     *
     * @return The status of the logs delivery (<code>SUCCESS</code> |
     *         <code>FAILED</code>).
     */
    public String getDeliverLogsStatus() {
        return deliverLogsStatus;
    }
    
    /**
     * The status of the logs delivery (<code>SUCCESS</code> |
     * <code>FAILED</code>).
     *
     * @param deliverLogsStatus The status of the logs delivery (<code>SUCCESS</code> |
     *         <code>FAILED</code>).
     */
    public void setDeliverLogsStatus(String deliverLogsStatus) {
        this.deliverLogsStatus = deliverLogsStatus;
    }
    
    /**
     * The status of the logs delivery (<code>SUCCESS</code> |
     * <code>FAILED</code>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deliverLogsStatus The status of the logs delivery (<code>SUCCESS</code> |
     *         <code>FAILED</code>).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FlowLog withDeliverLogsStatus(String deliverLogsStatus) {
        this.deliverLogsStatus = deliverLogsStatus;
        return this;
    }

    /**
     * Information about the error that occurred. <code>Rate limited</code>
     * indicates that CloudWatch logs throttling has been applied for one or
     * more network interfaces. <code>Access error</code> indicates that the
     * IAM role associated with the flow log does not have sufficient
     * permissions to publish to CloudWatch Logs. <code>Unknown error</code>
     * indicates an internal error.
     *
     * @return Information about the error that occurred. <code>Rate limited</code>
     *         indicates that CloudWatch logs throttling has been applied for one or
     *         more network interfaces. <code>Access error</code> indicates that the
     *         IAM role associated with the flow log does not have sufficient
     *         permissions to publish to CloudWatch Logs. <code>Unknown error</code>
     *         indicates an internal error.
     */
    public String getDeliverLogsErrorMessage() {
        return deliverLogsErrorMessage;
    }
    
    /**
     * Information about the error that occurred. <code>Rate limited</code>
     * indicates that CloudWatch logs throttling has been applied for one or
     * more network interfaces. <code>Access error</code> indicates that the
     * IAM role associated with the flow log does not have sufficient
     * permissions to publish to CloudWatch Logs. <code>Unknown error</code>
     * indicates an internal error.
     *
     * @param deliverLogsErrorMessage Information about the error that occurred. <code>Rate limited</code>
     *         indicates that CloudWatch logs throttling has been applied for one or
     *         more network interfaces. <code>Access error</code> indicates that the
     *         IAM role associated with the flow log does not have sufficient
     *         permissions to publish to CloudWatch Logs. <code>Unknown error</code>
     *         indicates an internal error.
     */
    public void setDeliverLogsErrorMessage(String deliverLogsErrorMessage) {
        this.deliverLogsErrorMessage = deliverLogsErrorMessage;
    }
    
    /**
     * Information about the error that occurred. <code>Rate limited</code>
     * indicates that CloudWatch logs throttling has been applied for one or
     * more network interfaces. <code>Access error</code> indicates that the
     * IAM role associated with the flow log does not have sufficient
     * permissions to publish to CloudWatch Logs. <code>Unknown error</code>
     * indicates an internal error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deliverLogsErrorMessage Information about the error that occurred. <code>Rate limited</code>
     *         indicates that CloudWatch logs throttling has been applied for one or
     *         more network interfaces. <code>Access error</code> indicates that the
     *         IAM role associated with the flow log does not have sufficient
     *         permissions to publish to CloudWatch Logs. <code>Unknown error</code>
     *         indicates an internal error.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FlowLog withDeliverLogsErrorMessage(String deliverLogsErrorMessage) {
        this.deliverLogsErrorMessage = deliverLogsErrorMessage;
        return this;
    }

    /**
     * The ARN of the IAM role that posts logs to CloudWatch Logs.
     *
     * @return The ARN of the IAM role that posts logs to CloudWatch Logs.
     */
    public String getDeliverLogsPermissionArn() {
        return deliverLogsPermissionArn;
    }
    
    /**
     * The ARN of the IAM role that posts logs to CloudWatch Logs.
     *
     * @param deliverLogsPermissionArn The ARN of the IAM role that posts logs to CloudWatch Logs.
     */
    public void setDeliverLogsPermissionArn(String deliverLogsPermissionArn) {
        this.deliverLogsPermissionArn = deliverLogsPermissionArn;
    }
    
    /**
     * The ARN of the IAM role that posts logs to CloudWatch Logs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deliverLogsPermissionArn The ARN of the IAM role that posts logs to CloudWatch Logs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FlowLog withDeliverLogsPermissionArn(String deliverLogsPermissionArn) {
        this.deliverLogsPermissionArn = deliverLogsPermissionArn;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCreationTime() != null) sb.append("CreationTime: " + getCreationTime() + ",");
        if (getFlowLogId() != null) sb.append("FlowLogId: " + getFlowLogId() + ",");
        if (getFlowLogStatus() != null) sb.append("FlowLogStatus: " + getFlowLogStatus() + ",");
        if (getResourceId() != null) sb.append("ResourceId: " + getResourceId() + ",");
        if (getTrafficType() != null) sb.append("TrafficType: " + getTrafficType() + ",");
        if (getLogGroupName() != null) sb.append("LogGroupName: " + getLogGroupName() + ",");
        if (getDeliverLogsStatus() != null) sb.append("DeliverLogsStatus: " + getDeliverLogsStatus() + ",");
        if (getDeliverLogsErrorMessage() != null) sb.append("DeliverLogsErrorMessage: " + getDeliverLogsErrorMessage() + ",");
        if (getDeliverLogsPermissionArn() != null) sb.append("DeliverLogsPermissionArn: " + getDeliverLogsPermissionArn() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode()); 
        hashCode = prime * hashCode + ((getFlowLogId() == null) ? 0 : getFlowLogId().hashCode()); 
        hashCode = prime * hashCode + ((getFlowLogStatus() == null) ? 0 : getFlowLogStatus().hashCode()); 
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode()); 
        hashCode = prime * hashCode + ((getTrafficType() == null) ? 0 : getTrafficType().hashCode()); 
        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getDeliverLogsStatus() == null) ? 0 : getDeliverLogsStatus().hashCode()); 
        hashCode = prime * hashCode + ((getDeliverLogsErrorMessage() == null) ? 0 : getDeliverLogsErrorMessage().hashCode()); 
        hashCode = prime * hashCode + ((getDeliverLogsPermissionArn() == null) ? 0 : getDeliverLogsPermissionArn().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof FlowLog == false) return false;
        FlowLog other = (FlowLog)obj;
        
        if (other.getCreationTime() == null ^ this.getCreationTime() == null) return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false) return false; 
        if (other.getFlowLogId() == null ^ this.getFlowLogId() == null) return false;
        if (other.getFlowLogId() != null && other.getFlowLogId().equals(this.getFlowLogId()) == false) return false; 
        if (other.getFlowLogStatus() == null ^ this.getFlowLogStatus() == null) return false;
        if (other.getFlowLogStatus() != null && other.getFlowLogStatus().equals(this.getFlowLogStatus()) == false) return false; 
        if (other.getResourceId() == null ^ this.getResourceId() == null) return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false) return false; 
        if (other.getTrafficType() == null ^ this.getTrafficType() == null) return false;
        if (other.getTrafficType() != null && other.getTrafficType().equals(this.getTrafficType()) == false) return false; 
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null) return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false) return false; 
        if (other.getDeliverLogsStatus() == null ^ this.getDeliverLogsStatus() == null) return false;
        if (other.getDeliverLogsStatus() != null && other.getDeliverLogsStatus().equals(this.getDeliverLogsStatus()) == false) return false; 
        if (other.getDeliverLogsErrorMessage() == null ^ this.getDeliverLogsErrorMessage() == null) return false;
        if (other.getDeliverLogsErrorMessage() != null && other.getDeliverLogsErrorMessage().equals(this.getDeliverLogsErrorMessage()) == false) return false; 
        if (other.getDeliverLogsPermissionArn() == null ^ this.getDeliverLogsPermissionArn() == null) return false;
        if (other.getDeliverLogsPermissionArn() != null && other.getDeliverLogsPermissionArn().equals(this.getDeliverLogsPermissionArn()) == false) return false; 
        return true;
    }
    
    @Override
    public FlowLog clone() {
        try {
            return (FlowLog) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    