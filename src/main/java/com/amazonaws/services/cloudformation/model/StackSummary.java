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
 * The StackSummary Data Type
 * </p>
 */
public class StackSummary {

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
     * The time the stack was deleted.
     */
    private java.util.Date deletionTime;

    /**
     * The status of the stack when it was deleted.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED, CREATE_COMPLETE, UPDATE_IN_PROGRESS, UPDATE_FAILED, UPDATE_COMPLETE, ROLLBACK_IN_PROGRESS, ROLLBACK_FAILED, ROLLBACK_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE, UPDATE_ROLLBACK_IN_PROGRESS, UPDATE_ROLLBACK_FAILED, UPDATE_ROLLBACK_COMPLETE
     */
    private String stackStatus;

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
     * The status of the stack when it was deleted.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED, CREATE_COMPLETE, UPDATE_IN_PROGRESS, UPDATE_FAILED, UPDATE_COMPLETE, ROLLBACK_IN_PROGRESS, ROLLBACK_FAILED, ROLLBACK_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE, UPDATE_ROLLBACK_IN_PROGRESS, UPDATE_ROLLBACK_FAILED, UPDATE_ROLLBACK_COMPLETE
     *
     * @return The status of the stack when it was deleted.
     *
     * @see StackStatus
     */
    public String getStackStatus() {
        return stackStatus;
    }
    
    /**
     * The status of the stack when it was deleted.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED, CREATE_COMPLETE, UPDATE_IN_PROGRESS, UPDATE_FAILED, UPDATE_COMPLETE, ROLLBACK_IN_PROGRESS, ROLLBACK_FAILED, ROLLBACK_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE, UPDATE_ROLLBACK_IN_PROGRESS, UPDATE_ROLLBACK_FAILED, UPDATE_ROLLBACK_COMPLETE
     *
     * @param stackStatus The status of the stack when it was deleted.
     *
     * @see StackStatus
     */
    public void setStackStatus(String stackStatus) {
        this.stackStatus = stackStatus;
    }
    
    /**
     * The status of the stack when it was deleted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED, CREATE_COMPLETE, UPDATE_IN_PROGRESS, UPDATE_FAILED, UPDATE_COMPLETE, ROLLBACK_IN_PROGRESS, ROLLBACK_FAILED, ROLLBACK_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE, UPDATE_ROLLBACK_IN_PROGRESS, UPDATE_ROLLBACK_FAILED, UPDATE_ROLLBACK_COMPLETE
     *
     * @param stackStatus The status of the stack when it was deleted.
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
        sb.append("StackId: " + stackId + ", ");
        sb.append("StackName: " + stackName + ", ");
        sb.append("TemplateDescription: " + templateDescription + ", ");
        sb.append("CreationTime: " + creationTime + ", ");
        sb.append("DeletionTime: " + deletionTime + ", ");
        sb.append("StackStatus: " + stackStatus + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    