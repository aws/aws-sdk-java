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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;


/**
 * <p>
 * Contains information about a workflow type.
 * </p>
 */
public class WorkflowTypeInfo implements Serializable {

    /**
     * The workflow type this information is about.
     */
    private WorkflowType workflowType;

    /**
     * The current status of the workflow type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERED, DEPRECATED
     */
    private String status;

    /**
     * The description of the type registered through
     * <a>RegisterWorkflowType</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String description;

    /**
     * The date when this type was registered.
     */
    private java.util.Date creationDate;

    /**
     * If the type is in deprecated state, then it is set to the date when
     * the type was deprecated.
     */
    private java.util.Date deprecationDate;

    /**
     * The workflow type this information is about.
     *
     * @return The workflow type this information is about.
     */
    public WorkflowType getWorkflowType() {
        return workflowType;
    }
    
    /**
     * The workflow type this information is about.
     *
     * @param workflowType The workflow type this information is about.
     */
    public void setWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType;
    }
    
    /**
     * The workflow type this information is about.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param workflowType The workflow type this information is about.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowTypeInfo withWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType;
        return this;
    }

    /**
     * The current status of the workflow type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERED, DEPRECATED
     *
     * @return The current status of the workflow type.
     *
     * @see RegistrationStatus
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The current status of the workflow type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERED, DEPRECATED
     *
     * @param status The current status of the workflow type.
     *
     * @see RegistrationStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The current status of the workflow type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERED, DEPRECATED
     *
     * @param status The current status of the workflow type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see RegistrationStatus
     */
    public WorkflowTypeInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The current status of the workflow type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERED, DEPRECATED
     *
     * @param status The current status of the workflow type.
     *
     * @see RegistrationStatus
     */
    public void setStatus(RegistrationStatus status) {
        this.status = status.toString();
    }
    
    /**
     * The current status of the workflow type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERED, DEPRECATED
     *
     * @param status The current status of the workflow type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see RegistrationStatus
     */
    public WorkflowTypeInfo withStatus(RegistrationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * The description of the type registered through
     * <a>RegisterWorkflowType</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return The description of the type registered through
     *         <a>RegisterWorkflowType</a>.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description of the type registered through
     * <a>RegisterWorkflowType</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description The description of the type registered through
     *         <a>RegisterWorkflowType</a>.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description of the type registered through
     * <a>RegisterWorkflowType</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description The description of the type registered through
     *         <a>RegisterWorkflowType</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowTypeInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The date when this type was registered.
     *
     * @return The date when this type was registered.
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }
    
    /**
     * The date when this type was registered.
     *
     * @param creationDate The date when this type was registered.
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }
    
    /**
     * The date when this type was registered.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationDate The date when this type was registered.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowTypeInfo withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * If the type is in deprecated state, then it is set to the date when
     * the type was deprecated.
     *
     * @return If the type is in deprecated state, then it is set to the date when
     *         the type was deprecated.
     */
    public java.util.Date getDeprecationDate() {
        return deprecationDate;
    }
    
    /**
     * If the type is in deprecated state, then it is set to the date when
     * the type was deprecated.
     *
     * @param deprecationDate If the type is in deprecated state, then it is set to the date when
     *         the type was deprecated.
     */
    public void setDeprecationDate(java.util.Date deprecationDate) {
        this.deprecationDate = deprecationDate;
    }
    
    /**
     * If the type is in deprecated state, then it is set to the date when
     * the type was deprecated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deprecationDate If the type is in deprecated state, then it is set to the date when
     *         the type was deprecated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowTypeInfo withDeprecationDate(java.util.Date deprecationDate) {
        this.deprecationDate = deprecationDate;
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
        if (getWorkflowType() != null) sb.append("WorkflowType: " + getWorkflowType() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getCreationDate() != null) sb.append("CreationDate: " + getCreationDate() + ",");
        if (getDeprecationDate() != null) sb.append("DeprecationDate: " + getDeprecationDate() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getWorkflowType() == null) ? 0 : getWorkflowType().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode()); 
        hashCode = prime * hashCode + ((getDeprecationDate() == null) ? 0 : getDeprecationDate().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof WorkflowTypeInfo == false) return false;
        WorkflowTypeInfo other = (WorkflowTypeInfo)obj;
        
        if (other.getWorkflowType() == null ^ this.getWorkflowType() == null) return false;
        if (other.getWorkflowType() != null && other.getWorkflowType().equals(this.getWorkflowType()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getCreationDate() == null ^ this.getCreationDate() == null) return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false) return false; 
        if (other.getDeprecationDate() == null ^ this.getDeprecationDate() == null) return false;
        if (other.getDeprecationDate() != null && other.getDeprecationDate().equals(this.getDeprecationDate()) == false) return false; 
        return true;
    }
    
}
    