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
 * Describes a default field and its corresponding value.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/TaskTemplateDefaultFieldValue"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskTemplateDefaultFieldValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifier of a field.
     * </p>
     */
    private TaskTemplateFieldIdentifier id;
    /**
     * <p>
     * Default value for the field.
     * </p>
     */
    private String defaultValue;

    /**
     * <p>
     * Identifier of a field.
     * </p>
     * 
     * @param id
     *        Identifier of a field.
     */

    public void setId(TaskTemplateFieldIdentifier id) {
        this.id = id;
    }

    /**
     * <p>
     * Identifier of a field.
     * </p>
     * 
     * @return Identifier of a field.
     */

    public TaskTemplateFieldIdentifier getId() {
        return this.id;
    }

    /**
     * <p>
     * Identifier of a field.
     * </p>
     * 
     * @param id
     *        Identifier of a field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskTemplateDefaultFieldValue withId(TaskTemplateFieldIdentifier id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Default value for the field.
     * </p>
     * 
     * @param defaultValue
     *        Default value for the field.
     */

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * Default value for the field.
     * </p>
     * 
     * @return Default value for the field.
     */

    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * <p>
     * Default value for the field.
     * </p>
     * 
     * @param defaultValue
     *        Default value for the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskTemplateDefaultFieldValue withDefaultValue(String defaultValue) {
        setDefaultValue(defaultValue);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getDefaultValue() != null)
            sb.append("DefaultValue: ").append(getDefaultValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskTemplateDefaultFieldValue == false)
            return false;
        TaskTemplateDefaultFieldValue other = (TaskTemplateDefaultFieldValue) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        return hashCode;
    }

    @Override
    public TaskTemplateDefaultFieldValue clone() {
        try {
            return (TaskTemplateDefaultFieldValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.TaskTemplateDefaultFieldValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
