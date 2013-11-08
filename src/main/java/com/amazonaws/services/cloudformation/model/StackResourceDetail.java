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
 * Contains detailed information about the specified stack resource.
 * </p>
 */
public class StackResourceDetail implements Serializable {

    /**
     * The name associated with the stack.
     */
    private String stackName;

    /**
     * Unique identifier of the stack.
     */
    private String stackId;

    /**
     * The logical name of the resource specified in the template.
     */
    private String logicalResourceId;

    /**
     * The name or unique identifier that corresponds to a physical instance
     * ID of a resource supported by AWS CloudFormation.
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
     * User defined description associated with the resource.
     */
    private String description;

    /**
     * The JSON format content of the <code>Metadata</code> attribute
     * declared for the resource. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-metadata.html">Metadata
     * Attribute</a> in the AWS CloudFormation User Guide.
     */
    private String metadata;

    /**
     * The name associated with the stack.
     *
     * @return The name associated with the stack.
     */
    public String getStackName() {
        return stackName;
    }
    
    /**
     * The name associated with the stack.
     *
     * @param stackName The name associated with the stack.
     */
    public void setStackName(String stackName) {
        this.stackName = stackName;
    }
    
    /**
     * The name associated with the stack.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackName The name associated with the stack.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StackResourceDetail withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    /**
     * Unique identifier of the stack.
     *
     * @return Unique identifier of the stack.
     */
    public String getStackId() {
        return stackId;
    }
    
    /**
     * Unique identifier of the stack.
     *
     * @param stackId Unique identifier of the stack.
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }
    
    /**
     * Unique identifier of the stack.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackId Unique identifier of the stack.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StackResourceDetail withStackId(String stackId) {
        this.stackId = stackId;
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
    public StackResourceDetail withLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
        return this;
    }

    /**
     * The name or unique identifier that corresponds to a physical instance
     * ID of a resource supported by AWS CloudFormation.
     *
     * @return The name or unique identifier that corresponds to a physical instance
     *         ID of a resource supported by AWS CloudFormation.
     */
    public String getPhysicalResourceId() {
        return physicalResourceId;
    }
    
    /**
     * The name or unique identifier that corresponds to a physical instance
     * ID of a resource supported by AWS CloudFormation.
     *
     * @param physicalResourceId The name or unique identifier that corresponds to a physical instance
     *         ID of a resource supported by AWS CloudFormation.
     */
    public void setPhysicalResourceId(String physicalResourceId) {
        this.physicalResourceId = physicalResourceId;
    }
    
    /**
     * The name or unique identifier that corresponds to a physical instance
     * ID of a resource supported by AWS CloudFormation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param physicalResourceId The name or unique identifier that corresponds to a physical instance
     *         ID of a resource supported by AWS CloudFormation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StackResourceDetail withPhysicalResourceId(String physicalResourceId) {
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
    public StackResourceDetail withResourceType(String resourceType) {
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
    public StackResourceDetail withLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
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
    public StackResourceDetail withResourceStatus(String resourceStatus) {
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
    public StackResourceDetail withResourceStatus(ResourceStatus resourceStatus) {
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
    public StackResourceDetail withResourceStatusReason(String resourceStatusReason) {
        this.resourceStatusReason = resourceStatusReason;
        return this;
    }

    /**
     * User defined description associated with the resource.
     *
     * @return User defined description associated with the resource.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * User defined description associated with the resource.
     *
     * @param description User defined description associated with the resource.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * User defined description associated with the resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description User defined description associated with the resource.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StackResourceDetail withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The JSON format content of the <code>Metadata</code> attribute
     * declared for the resource. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-metadata.html">Metadata
     * Attribute</a> in the AWS CloudFormation User Guide.
     *
     * @return The JSON format content of the <code>Metadata</code> attribute
     *         declared for the resource. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-metadata.html">Metadata
     *         Attribute</a> in the AWS CloudFormation User Guide.
     */
    public String getMetadata() {
        return metadata;
    }
    
    /**
     * The JSON format content of the <code>Metadata</code> attribute
     * declared for the resource. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-metadata.html">Metadata
     * Attribute</a> in the AWS CloudFormation User Guide.
     *
     * @param metadata The JSON format content of the <code>Metadata</code> attribute
     *         declared for the resource. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-metadata.html">Metadata
     *         Attribute</a> in the AWS CloudFormation User Guide.
     */
    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }
    
    /**
     * The JSON format content of the <code>Metadata</code> attribute
     * declared for the resource. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-metadata.html">Metadata
     * Attribute</a> in the AWS CloudFormation User Guide.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metadata The JSON format content of the <code>Metadata</code> attribute
     *         declared for the resource. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-metadata.html">Metadata
     *         Attribute</a> in the AWS CloudFormation User Guide.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StackResourceDetail withMetadata(String metadata) {
        this.metadata = metadata;
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
        if (getStackName() != null) sb.append("StackName: " + getStackName() + ",");
        if (getStackId() != null) sb.append("StackId: " + getStackId() + ",");
        if (getLogicalResourceId() != null) sb.append("LogicalResourceId: " + getLogicalResourceId() + ",");
        if (getPhysicalResourceId() != null) sb.append("PhysicalResourceId: " + getPhysicalResourceId() + ",");
        if (getResourceType() != null) sb.append("ResourceType: " + getResourceType() + ",");
        if (getLastUpdatedTimestamp() != null) sb.append("LastUpdatedTimestamp: " + getLastUpdatedTimestamp() + ",");
        if (getResourceStatus() != null) sb.append("ResourceStatus: " + getResourceStatus() + ",");
        if (getResourceStatusReason() != null) sb.append("ResourceStatusReason: " + getResourceStatusReason() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getMetadata() != null) sb.append("Metadata: " + getMetadata() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode()); 
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode()); 
        hashCode = prime * hashCode + ((getLogicalResourceId() == null) ? 0 : getLogicalResourceId().hashCode()); 
        hashCode = prime * hashCode + ((getPhysicalResourceId() == null) ? 0 : getPhysicalResourceId().hashCode()); 
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode()); 
        hashCode = prime * hashCode + ((getLastUpdatedTimestamp() == null) ? 0 : getLastUpdatedTimestamp().hashCode()); 
        hashCode = prime * hashCode + ((getResourceStatus() == null) ? 0 : getResourceStatus().hashCode()); 
        hashCode = prime * hashCode + ((getResourceStatusReason() == null) ? 0 : getResourceStatusReason().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof StackResourceDetail == false) return false;
        StackResourceDetail other = (StackResourceDetail)obj;
        
        if (other.getStackName() == null ^ this.getStackName() == null) return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false) return false; 
        if (other.getStackId() == null ^ this.getStackId() == null) return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false) return false; 
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
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getMetadata() == null ^ this.getMetadata() == null) return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false) return false; 
        return true;
    }
    
}
    