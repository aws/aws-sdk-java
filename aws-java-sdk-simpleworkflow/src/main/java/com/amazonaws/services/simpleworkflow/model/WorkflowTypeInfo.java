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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a workflow type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/WorkflowTypeInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowTypeInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The workflow type this information is about.
     * </p>
     */
    private WorkflowType workflowType;
    /**
     * <p>
     * The current status of the workflow type.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The description of the type registered through <a>RegisterWorkflowType</a>.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The date when this type was registered.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * If the type is in deprecated state, then it is set to the date when the type was deprecated.
     * </p>
     */
    private java.util.Date deprecationDate;

    /**
     * <p>
     * The workflow type this information is about.
     * </p>
     * 
     * @param workflowType
     *        The workflow type this information is about.
     */

    public void setWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType;
    }

    /**
     * <p>
     * The workflow type this information is about.
     * </p>
     * 
     * @return The workflow type this information is about.
     */

    public WorkflowType getWorkflowType() {
        return this.workflowType;
    }

    /**
     * <p>
     * The workflow type this information is about.
     * </p>
     * 
     * @param workflowType
     *        The workflow type this information is about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowTypeInfo withWorkflowType(WorkflowType workflowType) {
        setWorkflowType(workflowType);
        return this;
    }

    /**
     * <p>
     * The current status of the workflow type.
     * </p>
     * 
     * @param status
     *        The current status of the workflow type.
     * @see RegistrationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the workflow type.
     * </p>
     * 
     * @return The current status of the workflow type.
     * @see RegistrationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the workflow type.
     * </p>
     * 
     * @param status
     *        The current status of the workflow type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistrationStatus
     */

    public WorkflowTypeInfo withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the workflow type.
     * </p>
     * 
     * @param status
     *        The current status of the workflow type.
     * @see RegistrationStatus
     */

    public void setStatus(RegistrationStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The current status of the workflow type.
     * </p>
     * 
     * @param status
     *        The current status of the workflow type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistrationStatus
     */

    public WorkflowTypeInfo withStatus(RegistrationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The description of the type registered through <a>RegisterWorkflowType</a>.
     * </p>
     * 
     * @param description
     *        The description of the type registered through <a>RegisterWorkflowType</a>.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the type registered through <a>RegisterWorkflowType</a>.
     * </p>
     * 
     * @return The description of the type registered through <a>RegisterWorkflowType</a>.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the type registered through <a>RegisterWorkflowType</a>.
     * </p>
     * 
     * @param description
     *        The description of the type registered through <a>RegisterWorkflowType</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowTypeInfo withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The date when this type was registered.
     * </p>
     * 
     * @param creationDate
     *        The date when this type was registered.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date when this type was registered.
     * </p>
     * 
     * @return The date when this type was registered.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date when this type was registered.
     * </p>
     * 
     * @param creationDate
     *        The date when this type was registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowTypeInfo withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * If the type is in deprecated state, then it is set to the date when the type was deprecated.
     * </p>
     * 
     * @param deprecationDate
     *        If the type is in deprecated state, then it is set to the date when the type was deprecated.
     */

    public void setDeprecationDate(java.util.Date deprecationDate) {
        this.deprecationDate = deprecationDate;
    }

    /**
     * <p>
     * If the type is in deprecated state, then it is set to the date when the type was deprecated.
     * </p>
     * 
     * @return If the type is in deprecated state, then it is set to the date when the type was deprecated.
     */

    public java.util.Date getDeprecationDate() {
        return this.deprecationDate;
    }

    /**
     * <p>
     * If the type is in deprecated state, then it is set to the date when the type was deprecated.
     * </p>
     * 
     * @param deprecationDate
     *        If the type is in deprecated state, then it is set to the date when the type was deprecated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowTypeInfo withDeprecationDate(java.util.Date deprecationDate) {
        setDeprecationDate(deprecationDate);
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
        if (getWorkflowType() != null)
            sb.append("WorkflowType: ").append(getWorkflowType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getDeprecationDate() != null)
            sb.append("DeprecationDate: ").append(getDeprecationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkflowTypeInfo == false)
            return false;
        WorkflowTypeInfo other = (WorkflowTypeInfo) obj;
        if (other.getWorkflowType() == null ^ this.getWorkflowType() == null)
            return false;
        if (other.getWorkflowType() != null && other.getWorkflowType().equals(this.getWorkflowType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getDeprecationDate() == null ^ this.getDeprecationDate() == null)
            return false;
        if (other.getDeprecationDate() != null && other.getDeprecationDate().equals(this.getDeprecationDate()) == false)
            return false;
        return true;
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
    public WorkflowTypeInfo clone() {
        try {
            return (WorkflowTypeInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleworkflow.model.transform.WorkflowTypeInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
