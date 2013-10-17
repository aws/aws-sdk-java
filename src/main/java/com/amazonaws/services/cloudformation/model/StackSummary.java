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
 * The StackSummary Data Type
 * </p>
 */
public class StackSummary implements Serializable {

    /**
     * Unique stack identifier.
     */
    private String stackId;

    /**
     * The name associated with the stack.
     */
    private String stackName;

    /**
     * The template description of the template used to create the stack.
     */
    private String templateDescription;

    /**
     * The time the stack was created.
     */
    private java.util.Date creationTime;

    /**
     * The time the stack was last updated. This field will only be returned
     * if the stack has been updated at least once.
     */
    private java.util.Date lastUpdatedTime;

    /**
     * The time the stack was deleted.
     */
    private java.util.Date deletionTime;

    /**
     * The current status of the stack.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED, CREATE_COMPLETE, ROLLBACK_IN_PROGRESS, ROLLBACK_FAILED, ROLLBACK_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE, UPDATE_IN_PROGRESS, UPDATE_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_COMPLETE, UPDATE_ROLLBACK_IN_PROGRESS, UPDATE_ROLLBACK_FAILED, UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_ROLLBACK_COMPLETE
     */
    private String stackStatus;

    /**
     * Success/Failure message associated with the stack status.
     */
    private String stackStatusReason;

    /**
     * Unique stack identifier.
     *
     * @return Unique stack identifier.
     */
    public String getStackId() {
        return stackId;
    }
    
    /**
     * Unique stack identifier.
     *
     * @param stackId Unique stack identifier.
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }
    
    /**
     * Unique stack identifier.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackId Unique stack identifier.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StackSummary withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

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
    public StackSummary withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    /**
     * The template description of the template used to create the stack.
     *
     * @return The template description of the template used to create the stack.
     */
    public String getTemplateDescription() {
        return templateDescription;
    }
    
    /**
     * The template description of the template used to create the stack.
     *
     * @param templateDescription The template description of the template used to create the stack.
     */
    public void setTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
    }
    
    /**
     * The template description of the template used to create the stack.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param templateDescription The template description of the template used to create the stack.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StackSummary withTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
        return this;
    }

    /**
     * The time the stack was created.
     *
     * @return The time the stack was created.
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }
    
    /**
     * The time the stack was created.
     *
     * @param creationTime The time the stack was created.
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }
    
    /**
     * The time the stack was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationTime The time the stack was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StackSummary withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * The time the stack was last updated. This field will only be returned
     * if the stack has been updated at least once.
     *
     * @return The time the stack was last updated. This field will only be returned
     *         if the stack has been updated at least once.
     */
    public java.util.Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }
    
    /**
     * The time the stack was last updated. This field will only be returned
     * if the stack has been updated at least once.
     *
     * @param lastUpdatedTime The time the stack was last updated. This field will only be returned
     *         if the stack has been updated at least once.
     */
    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }
    
    /**
     * The time the stack was last updated. This field will only be returned
     * if the stack has been updated at least once.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastUpdatedTime The time the stack was last updated. This field will only be returned
     *         if the stack has been updated at least once.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StackSummary withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
        return this;
    }

    /**
     * The time the stack was deleted.
     *
     * @return The time the stack was deleted.
     */
    public java.util.Date getDeletionTime() {
        return deletionTime;
    }
    
    /**
     * The time the stack was deleted.
     *
     * @param deletionTime The time the stack was deleted.
     */
    public void setDeletionTime(java.util.Date deletionTime) {
        this.deletionTime = deletionTime;
    }
    
    /**
     * The time the stack was deleted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deletionTime The time the stack was deleted.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StackSummary withDeletionTime(java.util.Date deletionTime) {
        this.deletionTime = deletionTime;
        return this;
    }

    /**
     * The current status of the stack.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED, CREATE_COMPLETE, ROLLBACK_IN_PROGRESS, ROLLBACK_FAILED, ROLLBACK_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE, UPDATE_IN_PROGRESS, UPDATE_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_COMPLETE, UPDATE_ROLLBACK_IN_PROGRESS, UPDATE_ROLLBACK_FAILED, UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_ROLLBACK_COMPLETE
     *
     * @return The current status of the stack.
     *
     * @see StackStatus
     */
    public String getStackStatus() {
        return stackStatus;
    }
    
    /**
     * The current status of the stack.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED, CREATE_COMPLETE, ROLLBACK_IN_PROGRESS, ROLLBACK_FAILED, ROLLBACK_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE, UPDATE_IN_PROGRESS, UPDATE_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_COMPLETE, UPDATE_ROLLBACK_IN_PROGRESS, UPDATE_ROLLBACK_FAILED, UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_ROLLBACK_COMPLETE
     *
     * @param stackStatus The current status of the stack.
     *
     * @see StackStatus
     */
    public void setStackStatus(String stackStatus) {
        this.stackStatus = stackStatus;
    }
    
    /**
     * The current status of the stack.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED, CREATE_COMPLETE, ROLLBACK_IN_PROGRESS, ROLLBACK_FAILED, ROLLBACK_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE, UPDATE_IN_PROGRESS, UPDATE_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_COMPLETE, UPDATE_ROLLBACK_IN_PROGRESS, UPDATE_ROLLBACK_FAILED, UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_ROLLBACK_COMPLETE
     *
     * @param stackStatus The current status of the stack.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see StackStatus
     */
    public StackSummary withStackStatus(String stackStatus) {
        this.stackStatus = stackStatus;
        return this;
    }

    /**
     * The current status of the stack.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED, CREATE_COMPLETE, ROLLBACK_IN_PROGRESS, ROLLBACK_FAILED, ROLLBACK_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE, UPDATE_IN_PROGRESS, UPDATE_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_COMPLETE, UPDATE_ROLLBACK_IN_PROGRESS, UPDATE_ROLLBACK_FAILED, UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_ROLLBACK_COMPLETE
     *
     * @param stackStatus The current status of the stack.
     *
     * @see StackStatus
     */
    public void setStackStatus(StackStatus stackStatus) {
        this.stackStatus = stackStatus.toString();
    }
    
    /**
     * The current status of the stack.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED, CREATE_COMPLETE, ROLLBACK_IN_PROGRESS, ROLLBACK_FAILED, ROLLBACK_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE, UPDATE_IN_PROGRESS, UPDATE_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_COMPLETE, UPDATE_ROLLBACK_IN_PROGRESS, UPDATE_ROLLBACK_FAILED, UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_ROLLBACK_COMPLETE
     *
     * @param stackStatus The current status of the stack.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see StackStatus
     */
    public StackSummary withStackStatus(StackStatus stackStatus) {
        this.stackStatus = stackStatus.toString();
        return this;
    }

    /**
     * Success/Failure message associated with the stack status.
     *
     * @return Success/Failure message associated with the stack status.
     */
    public String getStackStatusReason() {
        return stackStatusReason;
    }
    
    /**
     * Success/Failure message associated with the stack status.
     *
     * @param stackStatusReason Success/Failure message associated with the stack status.
     */
    public void setStackStatusReason(String stackStatusReason) {
        this.stackStatusReason = stackStatusReason;
    }
    
    /**
     * Success/Failure message associated with the stack status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackStatusReason Success/Failure message associated with the stack status.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StackSummary withStackStatusReason(String stackStatusReason) {
        this.stackStatusReason = stackStatusReason;
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
        if (getStackName() != null) sb.append("StackName: " + getStackName() + ",");
        if (getTemplateDescription() != null) sb.append("TemplateDescription: " + getTemplateDescription() + ",");
        if (getCreationTime() != null) sb.append("CreationTime: " + getCreationTime() + ",");
        if (getLastUpdatedTime() != null) sb.append("LastUpdatedTime: " + getLastUpdatedTime() + ",");
        if (getDeletionTime() != null) sb.append("DeletionTime: " + getDeletionTime() + ",");
        if (getStackStatus() != null) sb.append("StackStatus: " + getStackStatus() + ",");
        if (getStackStatusReason() != null) sb.append("StackStatusReason: " + getStackStatusReason() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode()); 
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode()); 
        hashCode = prime * hashCode + ((getTemplateDescription() == null) ? 0 : getTemplateDescription().hashCode()); 
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode()); 
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode()); 
        hashCode = prime * hashCode + ((getDeletionTime() == null) ? 0 : getDeletionTime().hashCode()); 
        hashCode = prime * hashCode + ((getStackStatus() == null) ? 0 : getStackStatus().hashCode()); 
        hashCode = prime * hashCode + ((getStackStatusReason() == null) ? 0 : getStackStatusReason().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof StackSummary == false) return false;
        StackSummary other = (StackSummary)obj;
        
        if (other.getStackId() == null ^ this.getStackId() == null) return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false) return false; 
        if (other.getStackName() == null ^ this.getStackName() == null) return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false) return false; 
        if (other.getTemplateDescription() == null ^ this.getTemplateDescription() == null) return false;
        if (other.getTemplateDescription() != null && other.getTemplateDescription().equals(this.getTemplateDescription()) == false) return false; 
        if (other.getCreationTime() == null ^ this.getCreationTime() == null) return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false) return false; 
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null) return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false) return false; 
        if (other.getDeletionTime() == null ^ this.getDeletionTime() == null) return false;
        if (other.getDeletionTime() != null && other.getDeletionTime().equals(this.getDeletionTime()) == false) return false; 
        if (other.getStackStatus() == null ^ this.getStackStatus() == null) return false;
        if (other.getStackStatus() != null && other.getStackStatus().equals(this.getStackStatus()) == false) return false; 
        if (other.getStackStatusReason() == null ^ this.getStackStatusReason() == null) return false;
        if (other.getStackStatusReason() != null && other.getStackStatusReason().equals(this.getStackStatusReason()) == false) return false; 
        return true;
    }
    
}
    