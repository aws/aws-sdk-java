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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Object for the summarized details of the field.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/FieldSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FieldSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the field.
     * </p>
     */
    private String fieldArn;
    /**
     * <p>
     * The unique identifier of a field.
     * </p>
     */
    private String fieldId;
    /**
     * <p>
     * Name of the field.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The namespace of a field.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The type of a field.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the field.
     * </p>
     * 
     * @param fieldArn
     *        The Amazon Resource Name (ARN) of the field.
     */

    public void setFieldArn(String fieldArn) {
        this.fieldArn = fieldArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the field.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the field.
     */

    public String getFieldArn() {
        return this.fieldArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the field.
     * </p>
     * 
     * @param fieldArn
     *        The Amazon Resource Name (ARN) of the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldSummary withFieldArn(String fieldArn) {
        setFieldArn(fieldArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of a field.
     * </p>
     * 
     * @param fieldId
     *        The unique identifier of a field.
     */

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    /**
     * <p>
     * The unique identifier of a field.
     * </p>
     * 
     * @return The unique identifier of a field.
     */

    public String getFieldId() {
        return this.fieldId;
    }

    /**
     * <p>
     * The unique identifier of a field.
     * </p>
     * 
     * @param fieldId
     *        The unique identifier of a field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldSummary withFieldId(String fieldId) {
        setFieldId(fieldId);
        return this;
    }

    /**
     * <p>
     * Name of the field.
     * </p>
     * 
     * @param name
     *        Name of the field.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the field.
     * </p>
     * 
     * @return Name of the field.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the field.
     * </p>
     * 
     * @param name
     *        Name of the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The namespace of a field.
     * </p>
     * 
     * @param namespace
     *        The namespace of a field.
     * @see FieldNamespace
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace of a field.
     * </p>
     * 
     * @return The namespace of a field.
     * @see FieldNamespace
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace of a field.
     * </p>
     * 
     * @param namespace
     *        The namespace of a field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FieldNamespace
     */

    public FieldSummary withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The namespace of a field.
     * </p>
     * 
     * @param namespace
     *        The namespace of a field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FieldNamespace
     */

    public FieldSummary withNamespace(FieldNamespace namespace) {
        this.namespace = namespace.toString();
        return this;
    }

    /**
     * <p>
     * The type of a field.
     * </p>
     * 
     * @param type
     *        The type of a field.
     * @see FieldType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of a field.
     * </p>
     * 
     * @return The type of a field.
     * @see FieldType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of a field.
     * </p>
     * 
     * @param type
     *        The type of a field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FieldType
     */

    public FieldSummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of a field.
     * </p>
     * 
     * @param type
     *        The type of a field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FieldType
     */

    public FieldSummary withType(FieldType type) {
        this.type = type.toString();
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
        if (getFieldArn() != null)
            sb.append("FieldArn: ").append(getFieldArn()).append(",");
        if (getFieldId() != null)
            sb.append("FieldId: ").append(getFieldId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FieldSummary == false)
            return false;
        FieldSummary other = (FieldSummary) obj;
        if (other.getFieldArn() == null ^ this.getFieldArn() == null)
            return false;
        if (other.getFieldArn() != null && other.getFieldArn().equals(this.getFieldArn()) == false)
            return false;
        if (other.getFieldId() == null ^ this.getFieldId() == null)
            return false;
        if (other.getFieldId() != null && other.getFieldId().equals(this.getFieldId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldArn() == null) ? 0 : getFieldArn().hashCode());
        hashCode = prime * hashCode + ((getFieldId() == null) ? 0 : getFieldId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public FieldSummary clone() {
        try {
            return (FieldSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcases.model.transform.FieldSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
