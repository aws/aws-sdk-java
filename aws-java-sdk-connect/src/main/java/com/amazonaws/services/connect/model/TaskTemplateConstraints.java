/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes constraints that apply to the template fields.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/TaskTemplateConstraints" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskTemplateConstraints implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Lists the fields that are required to be filled by agents.
     * </p>
     */
    private java.util.List<RequiredFieldInfo> requiredFields;
    /**
     * <p>
     * Lists the fields that are read-only to agents, and cannot be edited.
     * </p>
     */
    private java.util.List<ReadOnlyFieldInfo> readOnlyFields;
    /**
     * <p>
     * Lists the fields that are invisible to agents.
     * </p>
     */
    private java.util.List<InvisibleFieldInfo> invisibleFields;

    /**
     * <p>
     * Lists the fields that are required to be filled by agents.
     * </p>
     * 
     * @return Lists the fields that are required to be filled by agents.
     */

    public java.util.List<RequiredFieldInfo> getRequiredFields() {
        return requiredFields;
    }

    /**
     * <p>
     * Lists the fields that are required to be filled by agents.
     * </p>
     * 
     * @param requiredFields
     *        Lists the fields that are required to be filled by agents.
     */

    public void setRequiredFields(java.util.Collection<RequiredFieldInfo> requiredFields) {
        if (requiredFields == null) {
            this.requiredFields = null;
            return;
        }

        this.requiredFields = new java.util.ArrayList<RequiredFieldInfo>(requiredFields);
    }

    /**
     * <p>
     * Lists the fields that are required to be filled by agents.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRequiredFields(java.util.Collection)} or {@link #withRequiredFields(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param requiredFields
     *        Lists the fields that are required to be filled by agents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskTemplateConstraints withRequiredFields(RequiredFieldInfo... requiredFields) {
        if (this.requiredFields == null) {
            setRequiredFields(new java.util.ArrayList<RequiredFieldInfo>(requiredFields.length));
        }
        for (RequiredFieldInfo ele : requiredFields) {
            this.requiredFields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists the fields that are required to be filled by agents.
     * </p>
     * 
     * @param requiredFields
     *        Lists the fields that are required to be filled by agents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskTemplateConstraints withRequiredFields(java.util.Collection<RequiredFieldInfo> requiredFields) {
        setRequiredFields(requiredFields);
        return this;
    }

    /**
     * <p>
     * Lists the fields that are read-only to agents, and cannot be edited.
     * </p>
     * 
     * @return Lists the fields that are read-only to agents, and cannot be edited.
     */

    public java.util.List<ReadOnlyFieldInfo> getReadOnlyFields() {
        return readOnlyFields;
    }

    /**
     * <p>
     * Lists the fields that are read-only to agents, and cannot be edited.
     * </p>
     * 
     * @param readOnlyFields
     *        Lists the fields that are read-only to agents, and cannot be edited.
     */

    public void setReadOnlyFields(java.util.Collection<ReadOnlyFieldInfo> readOnlyFields) {
        if (readOnlyFields == null) {
            this.readOnlyFields = null;
            return;
        }

        this.readOnlyFields = new java.util.ArrayList<ReadOnlyFieldInfo>(readOnlyFields);
    }

    /**
     * <p>
     * Lists the fields that are read-only to agents, and cannot be edited.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReadOnlyFields(java.util.Collection)} or {@link #withReadOnlyFields(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param readOnlyFields
     *        Lists the fields that are read-only to agents, and cannot be edited.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskTemplateConstraints withReadOnlyFields(ReadOnlyFieldInfo... readOnlyFields) {
        if (this.readOnlyFields == null) {
            setReadOnlyFields(new java.util.ArrayList<ReadOnlyFieldInfo>(readOnlyFields.length));
        }
        for (ReadOnlyFieldInfo ele : readOnlyFields) {
            this.readOnlyFields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists the fields that are read-only to agents, and cannot be edited.
     * </p>
     * 
     * @param readOnlyFields
     *        Lists the fields that are read-only to agents, and cannot be edited.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskTemplateConstraints withReadOnlyFields(java.util.Collection<ReadOnlyFieldInfo> readOnlyFields) {
        setReadOnlyFields(readOnlyFields);
        return this;
    }

    /**
     * <p>
     * Lists the fields that are invisible to agents.
     * </p>
     * 
     * @return Lists the fields that are invisible to agents.
     */

    public java.util.List<InvisibleFieldInfo> getInvisibleFields() {
        return invisibleFields;
    }

    /**
     * <p>
     * Lists the fields that are invisible to agents.
     * </p>
     * 
     * @param invisibleFields
     *        Lists the fields that are invisible to agents.
     */

    public void setInvisibleFields(java.util.Collection<InvisibleFieldInfo> invisibleFields) {
        if (invisibleFields == null) {
            this.invisibleFields = null;
            return;
        }

        this.invisibleFields = new java.util.ArrayList<InvisibleFieldInfo>(invisibleFields);
    }

    /**
     * <p>
     * Lists the fields that are invisible to agents.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInvisibleFields(java.util.Collection)} or {@link #withInvisibleFields(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param invisibleFields
     *        Lists the fields that are invisible to agents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskTemplateConstraints withInvisibleFields(InvisibleFieldInfo... invisibleFields) {
        if (this.invisibleFields == null) {
            setInvisibleFields(new java.util.ArrayList<InvisibleFieldInfo>(invisibleFields.length));
        }
        for (InvisibleFieldInfo ele : invisibleFields) {
            this.invisibleFields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists the fields that are invisible to agents.
     * </p>
     * 
     * @param invisibleFields
     *        Lists the fields that are invisible to agents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskTemplateConstraints withInvisibleFields(java.util.Collection<InvisibleFieldInfo> invisibleFields) {
        setInvisibleFields(invisibleFields);
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
        if (getRequiredFields() != null)
            sb.append("RequiredFields: ").append(getRequiredFields()).append(",");
        if (getReadOnlyFields() != null)
            sb.append("ReadOnlyFields: ").append(getReadOnlyFields()).append(",");
        if (getInvisibleFields() != null)
            sb.append("InvisibleFields: ").append(getInvisibleFields());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskTemplateConstraints == false)
            return false;
        TaskTemplateConstraints other = (TaskTemplateConstraints) obj;
        if (other.getRequiredFields() == null ^ this.getRequiredFields() == null)
            return false;
        if (other.getRequiredFields() != null && other.getRequiredFields().equals(this.getRequiredFields()) == false)
            return false;
        if (other.getReadOnlyFields() == null ^ this.getReadOnlyFields() == null)
            return false;
        if (other.getReadOnlyFields() != null && other.getReadOnlyFields().equals(this.getReadOnlyFields()) == false)
            return false;
        if (other.getInvisibleFields() == null ^ this.getInvisibleFields() == null)
            return false;
        if (other.getInvisibleFields() != null && other.getInvisibleFields().equals(this.getInvisibleFields()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequiredFields() == null) ? 0 : getRequiredFields().hashCode());
        hashCode = prime * hashCode + ((getReadOnlyFields() == null) ? 0 : getReadOnlyFields().hashCode());
        hashCode = prime * hashCode + ((getInvisibleFields() == null) ? 0 : getInvisibleFields().hashCode());
        return hashCode;
    }

    @Override
    public TaskTemplateConstraints clone() {
        try {
            return (TaskTemplateConstraints) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.TaskTemplateConstraintsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
