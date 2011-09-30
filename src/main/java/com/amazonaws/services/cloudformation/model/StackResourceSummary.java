/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Contains high-level information about the specified stack resource.
 * </p>
 */
public class StackResourceSummary {

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
     * p://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">AWS
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
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED, CREATE_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE
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
     * p://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">AWS
     * CloudFormation User Guide</a>.)
     *
     * @return Type of the resource. (For more information, go to the <a
     *         p://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">AWS
     *         CloudFormation User Guide</a>.)
     */
    public String getResourceType() {
        return resourceType;
    }
    
    /**
     * Type of the resource. (For more information, go to the <a
     * p://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">AWS
     * CloudFormation User Guide</a>.)
     *
     * @param resourceType Type of the resource. (For more information, go to the <a
     *         p://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">AWS
     *         CloudFormation User Guide</a>.)
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
    
    /**
     * Type of the resource. (For more information, go to the <a
     * p://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">AWS
     * CloudFormation User Guide</a>.)
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceType Type of the resource. (For more information, go to the <a
     *         p://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">AWS
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
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED, CREATE_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE
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
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED, CREATE_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE
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
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED, CREATE_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE
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
        sb.append("LogicalResourceId: " + logicalResourceId + ", ");
        sb.append("PhysicalResourceId: " + physicalResourceId + ", ");
        sb.append("ResourceType: " + resourceType + ", ");
        sb.append("LastUpdatedTimestamp: " + lastUpdatedTimestamp + ", ");
        sb.append("ResourceStatus: " + resourceStatus + ", ");
        sb.append("ResourceStatusReason: " + resourceStatusReason + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    