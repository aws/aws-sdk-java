/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;


/**
 * <p>
 * The StackEvent data type.
 * </p>
 */
public class StackEvent implements Serializable {

    /**
     * The unique ID name of the instance of the stack.
     */
    private String stackId;

    /**
     * The unique ID of this event.
     */
    private String eventId;

    /**
     * The name associated with a stack.
     */
    private String stackName;

    /**
     * The logical name of the resource specified in the template.
     */
    private String logicalResourceId;

    /**
     * The name or unique identifier associated with the physical instance of
     * the resource.
     */
    private String physicalResourceId;

    /**
     * Type of the resource. (For more information, go to the <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide">AWS
     * CloudFormation User Guide</a>.)
     */
    private String resourceType;

    /**
     * Time the status was updated.
     */
    private java.util.Date timestamp;

    /**
     * Current status of the resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED, CREATE_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE, UPDATE_IN_PROGRESS, UPDATE_FAILED, UPDATE_COMPLETE
     */
    private String resourceStatus;

    /**
     * Success/failure message associated with the resource.
     */
    private String resourceStatusReason;

    /**
     * BLOB of the properties used to create the resource.
     */
    private String resourceProperties;

    /**
     * The unique ID name of the instance of the stack.
     *
     * @return The unique ID name of the instance of the stack.
     */
    public String getStackId() {
        return stackId;
    }
    
    /**
     * The unique ID name of the instance of the stack.
     *
     * @param stackId The unique ID name of the instance of the stack.
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }
    
    /**
     * The unique ID name of the instance of the stack.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackId The unique ID name of the instance of the stack.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StackEvent withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * The unique ID of this event.
     *
     * @return The unique ID of this event.
     */
    public String getEventId() {
        return eventId;
    }
    
    /**
     * The unique ID of this event.
     *
     * @param eventId The unique ID of this event.
     */
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }
    
    /**
     * The unique ID of this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventId The unique ID of this event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StackEvent withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * The name associated with a stack.
     *
     * @return The name associated with a stack.
     */
    public String getStackName() {
        return stackName;
    }
    
    /**
     * The name associated with a stack.
     *
     * @param stackName The name associated with a stack.
     */
    public void setStackName(String stackName) {
        this.stackName = stackName;
    }
    
    /**
     * The name associated with a stack.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackName The name associated with a stack.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StackEvent withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    /**
     * The logical name of the resource specified in the template.
     *
     * @return The logical name of the resource specified in the template.
     */
    public String getLogicalResourceId() {
        return logicalResourceId;
    }
    
    /**
     * The logical name of the resource specified in the template.
     *
     * @param logicalResourceId The logical name of the resource specified in the template.
     */
    public void setLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
    }
    
    /**
     * The logical name of the resource specified in the template.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param logicalResourceId The logical name of the resource specified in the template.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StackEvent withLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
        return this;
    }

    /**
     * The name or unique identifier associated with the physical instance of
     * the resource.
     *
     * @return The name or unique identifier associated with the physical instance of
     *         the resource.
     */
    public String getPhysicalResourceId() {
        return physicalResourceId;
    }
    
    /**
     * The name or unique identifier associated with the physical instance of
     * the resource.
     *
     * @param physicalResourceId The name or unique identifier associated with the physical instance of
     *         the resource.
     */
    public void setPhysicalResourceId(String physicalResourceId) {
        this.physicalResourceId = physicalResourceId;
    }
    
    /**
     * The name or unique identifier associated with the physical instance of
     * the resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param physicalResourceId The name or unique identifier associated with the physical instance of
     *         the resource.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StackEvent withPhysicalResourceId(String physicalResourceId) {
        this.physicalResourceId = physicalResourceId;
        return this;
    }

    /**
     * Type of the resource. (For more information, go to the <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide">AWS
     * CloudFormation User Guide</a>.)
     *
     * @return Type of the resource. (For more information, go to the <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide">AWS
     *         CloudFormation User Guide</a>.)
     */
    public String getResourceType() {
        return resourceType;
    }
    
    /**
     * Type of the resource. (For more information, go to the <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide">AWS
     * CloudFormation User Guide</a>.)
     *
     * @param resourceType Type of the resource. (For more information, go to the <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide">AWS
     *         CloudFormation User Guide</a>.)
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
    
    /**
     * Type of the resource. (For more information, go to the <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide">AWS
     * CloudFormation User Guide</a>.)
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceType Type of the resource. (For more information, go to the <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide">AWS
     *         CloudFormation User Guide</a>.)
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StackEvent withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Time the status was updated.
     *
     * @return Time the status was updated.
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }
    
    /**
     * Time the status was updated.
     *
     * @param timestamp Time the status was updated.
     */
    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }
    
    /**
     * Time the status was updated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param timestamp Time the status was updated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StackEvent withTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Current status of the resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED, CREATE_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE, UPDATE_IN_PROGRESS, UPDATE_FAILED, UPDATE_COMPLETE
     *
     * @return Current status of the resource.
     *
     * @see ResourceStatus
     */
    public String getResourceStatus() {
        return resourceStatus;
    }
    
    /**
     * Current status of the resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED, CREATE_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE, UPDATE_IN_PROGRESS, UPDATE_FAILED, UPDATE_COMPLETE
     *
     * @param resourceStatus Current status of the resource.
     *
     * @see ResourceStatus
     */
    public void setResourceStatus(String resourceStatus) {
        this.resourceStatus = resourceStatus;
    }
    
    /**
     * Current status of the resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED, CREATE_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE, UPDATE_IN_PROGRESS, UPDATE_FAILED, UPDATE_COMPLETE
     *
     * @param resourceStatus Current status of the resource.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ResourceStatus
     */
    public StackEvent withResourceStatus(String resourceStatus) {
        this.resourceStatus = resourceStatus;
        return this;
    }

    /**
     * Current status of the resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED, CREATE_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE, UPDATE_IN_PROGRESS, UPDATE_FAILED, UPDATE_COMPLETE
     *
     * @param resourceStatus Current status of the resource.
     *
     * @see ResourceStatus
     */
    public void setResourceStatus(ResourceStatus resourceStatus) {
        this.resourceStatus = resourceStatus.toString();
    }
    
    /**
     * Current status of the resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED, CREATE_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE, UPDATE_IN_PROGRESS, UPDATE_FAILED, UPDATE_COMPLETE
     *
     * @param resourceStatus Current status of the resource.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ResourceStatus
     */
    public StackEvent withResourceStatus(ResourceStatus resourceStatus) {
        this.resourceStatus = resourceStatus.toString();
        return this;
    }

    /**
     * Success/failure message associated with the resource.
     *
     * @return Success/failure message associated with the resource.
     */
    public String getResourceStatusReason() {
        return resourceStatusReason;
    }
    
    /**
     * Success/failure message associated with the resource.
     *
     * @param resourceStatusReason Success/failure message associated with the resource.
     */
    public void setResourceStatusReason(String resourceStatusReason) {
        this.resourceStatusReason = resourceStatusReason;
    }
    
    /**
     * Success/failure message associated with the resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceStatusReason Success/failure message associated with the resource.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StackEvent withResourceStatusReason(String resourceStatusReason) {
        this.resourceStatusReason = resourceStatusReason;
        return this;
    }

    /**
     * BLOB of the properties used to create the resource.
     *
     * @return BLOB of the properties used to create the resource.
     */
    public String getResourceProperties() {
        return resourceProperties;
    }
    
    /**
     * BLOB of the properties used to create the resource.
     *
     * @param resourceProperties BLOB of the properties used to create the resource.
     */
    public void setResourceProperties(String resourceProperties) {
        this.resourceProperties = resourceProperties;
    }
    
    /**
     * BLOB of the properties used to create the resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceProperties BLOB of the properties used to create the resource.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StackEvent withResourceProperties(String resourceProperties) {
        this.resourceProperties = resourceProperties;
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
        if (getStackId() != null) sb.append("StackId: " + getStackId() + ",");
        if (getEventId() != null) sb.append("EventId: " + getEventId() + ",");
        if (getStackName() != null) sb.append("StackName: " + getStackName() + ",");
        if (getLogicalResourceId() != null) sb.append("LogicalResourceId: " + getLogicalResourceId() + ",");
        if (getPhysicalResourceId() != null) sb.append("PhysicalResourceId: " + getPhysicalResourceId() + ",");
        if (getResourceType() != null) sb.append("ResourceType: " + getResourceType() + ",");
        if (getTimestamp() != null) sb.append("Timestamp: " + getTimestamp() + ",");
        if (getResourceStatus() != null) sb.append("ResourceStatus: " + getResourceStatus() + ",");
        if (getResourceStatusReason() != null) sb.append("ResourceStatusReason: " + getResourceStatusReason() + ",");
        if (getResourceProperties() != null) sb.append("ResourceProperties: " + getResourceProperties() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode()); 
        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode()); 
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode()); 
        hashCode = prime * hashCode + ((getLogicalResourceId() == null) ? 0 : getLogicalResourceId().hashCode()); 
        hashCode = prime * hashCode + ((getPhysicalResourceId() == null) ? 0 : getPhysicalResourceId().hashCode()); 
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode()); 
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode()); 
        hashCode = prime * hashCode + ((getResourceStatus() == null) ? 0 : getResourceStatus().hashCode()); 
        hashCode = prime * hashCode + ((getResourceStatusReason() == null) ? 0 : getResourceStatusReason().hashCode()); 
        hashCode = prime * hashCode + ((getResourceProperties() == null) ? 0 : getResourceProperties().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof StackEvent == false) return false;
        StackEvent other = (StackEvent)obj;
        
        if (other.getStackId() == null ^ this.getStackId() == null) return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false) return false; 
        if (other.getEventId() == null ^ this.getEventId() == null) return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false) return false; 
        if (other.getStackName() == null ^ this.getStackName() == null) return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false) return false; 
        if (other.getLogicalResourceId() == null ^ this.getLogicalResourceId() == null) return false;
        if (other.getLogicalResourceId() != null && other.getLogicalResourceId().equals(this.getLogicalResourceId()) == false) return false; 
        if (other.getPhysicalResourceId() == null ^ this.getPhysicalResourceId() == null) return false;
        if (other.getPhysicalResourceId() != null && other.getPhysicalResourceId().equals(this.getPhysicalResourceId()) == false) return false; 
        if (other.getResourceType() == null ^ this.getResourceType() == null) return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false) return false; 
        if (other.getTimestamp() == null ^ this.getTimestamp() == null) return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false) return false; 
        if (other.getResourceStatus() == null ^ this.getResourceStatus() == null) return false;
        if (other.getResourceStatus() != null && other.getResourceStatus().equals(this.getResourceStatus()) == false) return false; 
        if (other.getResourceStatusReason() == null ^ this.getResourceStatusReason() == null) return false;
        if (other.getResourceStatusReason() != null && other.getResourceStatusReason().equals(this.getResourceStatusReason()) == false) return false; 
        if (other.getResourceProperties() == null ^ this.getResourceProperties() == null) return false;
        if (other.getResourceProperties() != null && other.getResourceProperties().equals(this.getResourceProperties()) == false) return false; 
        return true;
    }
    
}
    