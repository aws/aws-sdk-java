/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes a single task template field.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/TaskTemplateField" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskTemplateField implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the field.
     * </p>
     */
    private TaskTemplateFieldIdentifier id;
    /**
     * <p>
     * The description of the field.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Indicates the type of field.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A list of options for a single select field.
     * </p>
     */
    private java.util.List<String> singleSelectOptions;

    /**
     * <p>
     * The unique identifier for the field.
     * </p>
     * 
     * @param id
     *        The unique identifier for the field.
     */

    public void setId(TaskTemplateFieldIdentifier id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the field.
     * </p>
     * 
     * @return The unique identifier for the field.
     */

    public TaskTemplateFieldIdentifier getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the field.
     * </p>
     * 
     * @param id
     *        The unique identifier for the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskTemplateField withId(TaskTemplateFieldIdentifier id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The description of the field.
     * </p>
     * 
     * @param description
     *        The description of the field.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the field.
     * </p>
     * 
     * @return The description of the field.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the field.
     * </p>
     * 
     * @param description
     *        The description of the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskTemplateField withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Indicates the type of field.
     * </p>
     * 
     * @param type
     *        Indicates the type of field.
     * @see TaskTemplateFieldType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Indicates the type of field.
     * </p>
     * 
     * @return Indicates the type of field.
     * @see TaskTemplateFieldType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Indicates the type of field.
     * </p>
     * 
     * @param type
     *        Indicates the type of field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskTemplateFieldType
     */

    public TaskTemplateField withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Indicates the type of field.
     * </p>
     * 
     * @param type
     *        Indicates the type of field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskTemplateFieldType
     */

    public TaskTemplateField withType(TaskTemplateFieldType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A list of options for a single select field.
     * </p>
     * 
     * @return A list of options for a single select field.
     */

    public java.util.List<String> getSingleSelectOptions() {
        return singleSelectOptions;
    }

    /**
     * <p>
     * A list of options for a single select field.
     * </p>
     * 
     * @param singleSelectOptions
     *        A list of options for a single select field.
     */

    public void setSingleSelectOptions(java.util.Collection<String> singleSelectOptions) {
        if (singleSelectOptions == null) {
            this.singleSelectOptions = null;
            return;
        }

        this.singleSelectOptions = new java.util.ArrayList<String>(singleSelectOptions);
    }

    /**
     * <p>
     * A list of options for a single select field.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSingleSelectOptions(java.util.Collection)} or {@link #withSingleSelectOptions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param singleSelectOptions
     *        A list of options for a single select field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskTemplateField withSingleSelectOptions(String... singleSelectOptions) {
        if (this.singleSelectOptions == null) {
            setSingleSelectOptions(new java.util.ArrayList<String>(singleSelectOptions.length));
        }
        for (String ele : singleSelectOptions) {
            this.singleSelectOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of options for a single select field.
     * </p>
     * 
     * @param singleSelectOptions
     *        A list of options for a single select field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskTemplateField withSingleSelectOptions(java.util.Collection<String> singleSelectOptions) {
        setSingleSelectOptions(singleSelectOptions);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getSingleSelectOptions() != null)
            sb.append("SingleSelectOptions: ").append(getSingleSelectOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskTemplateField == false)
            return false;
        TaskTemplateField other = (TaskTemplateField) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getSingleSelectOptions() == null ^ this.getSingleSelectOptions() == null)
            return false;
        if (other.getSingleSelectOptions() != null && other.getSingleSelectOptions().equals(this.getSingleSelectOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getSingleSelectOptions() == null) ? 0 : getSingleSelectOptions().hashCode());
        return hashCode;
    }

    @Override
    public TaskTemplateField clone() {
        try {
            return (TaskTemplateField) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.TaskTemplateFieldMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
