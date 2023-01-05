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
 * Object to store detailed field information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/GetFieldResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFieldResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Description of the field.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the field.
     * </p>
     */
    private String fieldArn;
    /**
     * <p>
     * Unique identifier of the field.
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
     * Namespace of the field.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or control
     * access for this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * Type of the field.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Description of the field.
     * </p>
     * 
     * @param description
     *        Description of the field.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description of the field.
     * </p>
     * 
     * @return Description of the field.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description of the field.
     * </p>
     * 
     * @param description
     *        Description of the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFieldResponse withDescription(String description) {
        setDescription(description);
        return this;
    }

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

    public GetFieldResponse withFieldArn(String fieldArn) {
        setFieldArn(fieldArn);
        return this;
    }

    /**
     * <p>
     * Unique identifier of the field.
     * </p>
     * 
     * @param fieldId
     *        Unique identifier of the field.
     */

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    /**
     * <p>
     * Unique identifier of the field.
     * </p>
     * 
     * @return Unique identifier of the field.
     */

    public String getFieldId() {
        return this.fieldId;
    }

    /**
     * <p>
     * Unique identifier of the field.
     * </p>
     * 
     * @param fieldId
     *        Unique identifier of the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFieldResponse withFieldId(String fieldId) {
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

    public GetFieldResponse withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Namespace of the field.
     * </p>
     * 
     * @param namespace
     *        Namespace of the field.
     * @see FieldNamespace
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * Namespace of the field.
     * </p>
     * 
     * @return Namespace of the field.
     * @see FieldNamespace
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * Namespace of the field.
     * </p>
     * 
     * @param namespace
     *        Namespace of the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FieldNamespace
     */

    public GetFieldResponse withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * Namespace of the field.
     * </p>
     * 
     * @param namespace
     *        Namespace of the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FieldNamespace
     */

    public GetFieldResponse withNamespace(FieldNamespace namespace) {
        this.namespace = namespace.toString();
        return this;
    }

    /**
     * <p>
     * A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or control
     * access for this resource.
     * </p>
     * 
     * @return A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or
     *         control access for this resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or control
     * access for this resource.
     * </p>
     * 
     * @param tags
     *        A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or
     *        control access for this resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or control
     * access for this resource.
     * </p>
     * 
     * @param tags
     *        A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or
     *        control access for this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFieldResponse withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetFieldResponse#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetFieldResponse addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFieldResponse clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Type of the field.
     * </p>
     * 
     * @param type
     *        Type of the field.
     * @see FieldType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Type of the field.
     * </p>
     * 
     * @return Type of the field.
     * @see FieldType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Type of the field.
     * </p>
     * 
     * @param type
     *        Type of the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FieldType
     */

    public GetFieldResponse withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Type of the field.
     * </p>
     * 
     * @param type
     *        Type of the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FieldType
     */

    public GetFieldResponse withType(FieldType type) {
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getFieldArn() != null)
            sb.append("FieldArn: ").append(getFieldArn()).append(",");
        if (getFieldId() != null)
            sb.append("FieldId: ").append(getFieldId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof GetFieldResponse == false)
            return false;
        GetFieldResponse other = (GetFieldResponse) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFieldArn() == null) ? 0 : getFieldArn().hashCode());
        hashCode = prime * hashCode + ((getFieldId() == null) ? 0 : getFieldId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public GetFieldResponse clone() {
        try {
            return (GetFieldResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcases.model.transform.GetFieldResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
