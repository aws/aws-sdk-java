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
 * Contains high-level information about the specified stack resource.
 * </p>
 */
public class StackResourceSummary implements Serializable {

    /**
     * The logical name of the resource specified in the template.
     */
    private String logicalResourceId;

    /**
     * The name or unique identifier that corresponds to a physical instance
     * ID of the resource.
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
    private java.util.Date lastUpdatedTimestamp;

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
    public StackResourceSummary withLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
        return this;
    }

    /**
     * The name or unique identifier that corresponds to a physical instance
     * ID of the resource.
     *
     * @return The name or unique identifier that corresponds to a physical instance
     *         ID of the resource.
     */
    public String getPhysicalResourceId() {
        return physicalResourceId;
    }
    
    /**
     * The name or unique identifier that corresponds to a physical instance
     * ID of the resource.
     *
     * @param physicalResourceId The name or unique identifier that corresponds to a physical instance
     *         ID of the resource.
     */
    public void setPhysicalResourceId(String physicalResourceId) {
        this.physicalResourceId = physicalResourceId;
    }
    
    /**
     * The name or unique identifier that corresponds to a physical instance
     * ID of the resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param physicalResourceId The name or unique identifier that corresponds to a physical instance
     *         ID of the resource.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StackResourceSummary withPhysicalResourceId(String physicalResourceId) {
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
    public StackResourceSummary withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Time the status was updated.
     *
     * @return Time the status was updated.
     */
    public java.util.Date getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp;
    }
    
    /**
     * Time the status was updated.
     *
     * @param lastUpdatedTimestamp Time the status was updated.
     */
    public void setLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }
    
    /**
     * Time the status was updated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastUpdatedTimestamp Time the status was updated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StackResourceSummary withLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
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
    public StackResourceSummary withResourceStatus(String resourceStatus) {
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
    public StackResourceSummary withResourceStatus(ResourceStatus resourceStatus) {
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
    public StackResourceSummary withResourceStatusReason(String resourceStatusReason) {
        this.resourceStatusReason = resourceStatusReason;
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
        if (getLogicalResourceId() != null) sb.append("LogicalResourceId: " + getLogicalResourceId() + ",");
        if (getPhysicalResourceId() != null) sb.append("PhysicalResourceId: " + getPhysicalResourceId() + ",");
        if (getResourceType() != null) sb.append("ResourceType: " + getResourceType() + ",");
        if (getLastUpdatedTimestamp() != null) sb.append("LastUpdatedTimestamp: " + getLastUpdatedTimestamp() + ",");
        if (getResourceStatus() != null) sb.append("ResourceStatus: " + getResourceStatus() + ",");
        if (getResourceStatusReason() != null) sb.append("ResourceStatusReason: " + getResourceStatusReason() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLogicalResourceId() == null) ? 0 : getLogicalResourceId().hashCode()); 
        hashCode = prime * hashCode + ((getPhysicalResourceId() == null) ? 0 : getPhysicalResourceId().hashCode()); 
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode()); 
        hashCode = prime * hashCode + ((getLastUpdatedTimestamp() == null) ? 0 : getLastUpdatedTimestamp().hashCode()); 
        hashCode = prime * hashCode + ((getResourceStatus() == null) ? 0 : getResourceStatus().hashCode()); 
        hashCode = prime * hashCode + ((getResourceStatusReason() == null) ? 0 : getResourceStatusReason().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof StackResourceSummary == false) return false;
        StackResourceSummary other = (StackResourceSummary)obj;
        
        if (other.getLogicalResourceId() == null ^ this.getLogicalResourceId() == null) return false;
        if (other.getLogicalResourceId() != null && other.getLogicalResourceId().equals(this.getLogicalResourceId()) == false) return false; 
        if (other.getPhysicalResourceId() == null ^ this.getPhysicalResourceId() == null) return false;
        if (other.getPhysicalResourceId() != null && other.getPhysicalResourceId().equals(this.getPhysicalResourceId()) == false) return false; 
        if (other.getResourceType() == null ^ this.getResourceType() == null) return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false) return false; 
        if (other.getLastUpdatedTimestamp() == null ^ this.getLastUpdatedTimestamp() == null) return false;
        if (other.getLastUpdatedTimestamp() != null && other.getLastUpdatedTimestamp().equals(this.getLastUpdatedTimestamp()) == false) return false; 
        if (other.getResourceStatus() == null ^ this.getResourceStatus() == null) return false;
        if (other.getResourceStatus() != null && other.getResourceStatus().equals(this.getResourceStatus()) == false) return false; 
        if (other.getResourceStatusReason() == null ^ this.getResourceStatusReason() == null) return false;
        if (other.getResourceStatusReason() != null && other.getResourceStatusReason().equals(this.getResourceStatusReason()) == false) return false; 
        return true;
    }
    
}
    