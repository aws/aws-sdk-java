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
 * Describes default values for fields on a template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/TaskTemplateDefaults" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskTemplateDefaults implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Default value for the field.
     * </p>
     */
    private java.util.List<TaskTemplateDefaultFieldValue> defaultFieldValues;

    /**
     * <p>
     * Default value for the field.
     * </p>
     * 
     * @return Default value for the field.
     */

    public java.util.List<TaskTemplateDefaultFieldValue> getDefaultFieldValues() {
        return defaultFieldValues;
    }

    /**
     * <p>
     * Default value for the field.
     * </p>
     * 
     * @param defaultFieldValues
     *        Default value for the field.
     */

    public void setDefaultFieldValues(java.util.Collection<TaskTemplateDefaultFieldValue> defaultFieldValues) {
        if (defaultFieldValues == null) {
            this.defaultFieldValues = null;
            return;
        }

        this.defaultFieldValues = new java.util.ArrayList<TaskTemplateDefaultFieldValue>(defaultFieldValues);
    }

    /**
     * <p>
     * Default value for the field.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDefaultFieldValues(java.util.Collection)} or {@link #withDefaultFieldValues(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param defaultFieldValues
     *        Default value for the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskTemplateDefaults withDefaultFieldValues(TaskTemplateDefaultFieldValue... defaultFieldValues) {
        if (this.defaultFieldValues == null) {
            setDefaultFieldValues(new java.util.ArrayList<TaskTemplateDefaultFieldValue>(defaultFieldValues.length));
        }
        for (TaskTemplateDefaultFieldValue ele : defaultFieldValues) {
            this.defaultFieldValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Default value for the field.
     * </p>
     * 
     * @param defaultFieldValues
     *        Default value for the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskTemplateDefaults withDefaultFieldValues(java.util.Collection<TaskTemplateDefaultFieldValue> defaultFieldValues) {
        setDefaultFieldValues(defaultFieldValues);
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
        if (getDefaultFieldValues() != null)
            sb.append("DefaultFieldValues: ").append(getDefaultFieldValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskTemplateDefaults == false)
            return false;
        TaskTemplateDefaults other = (TaskTemplateDefaults) obj;
        if (other.getDefaultFieldValues() == null ^ this.getDefaultFieldValues() == null)
            return false;
        if (other.getDefaultFieldValues() != null && other.getDefaultFieldValues().equals(this.getDefaultFieldValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultFieldValues() == null) ? 0 : getDefaultFieldValues().hashCode());
        return hashCode;
    }

    @Override
    public TaskTemplateDefaults clone() {
        try {
            return (TaskTemplateDefaults) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.TaskTemplateDefaultsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
