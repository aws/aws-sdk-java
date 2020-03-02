/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.schemas.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/CreateSchema" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSchemaRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String content;
    /**
     * <p>
     * A description of the schema.
     * </p>
     */
    private String description;

    private String registryName;

    private String schemaName;
    /**
     * <p>
     * Tags associated with the schema.
     * </p>
     */
    private java.util.Map<String, String> tags;

    private String type;

    /**
     * @param content
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return
     */

    public String getContent() {
        return this.content;
    }

    /**
     * @param content
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSchemaRequest withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * A description of the schema.
     * </p>
     * 
     * @param description
     *        A description of the schema.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the schema.
     * </p>
     * 
     * @return A description of the schema.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the schema.
     * </p>
     * 
     * @param description
     *        A description of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSchemaRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * @param registryName
     */

    public void setRegistryName(String registryName) {
        this.registryName = registryName;
    }

    /**
     * @return
     */

    public String getRegistryName() {
        return this.registryName;
    }

    /**
     * @param registryName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSchemaRequest withRegistryName(String registryName) {
        setRegistryName(registryName);
        return this;
    }

    /**
     * @param schemaName
     */

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    /**
     * @return
     */

    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * @param schemaName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSchemaRequest withSchemaName(String schemaName) {
        setSchemaName(schemaName);
        return this;
    }

    /**
     * <p>
     * Tags associated with the schema.
     * </p>
     * 
     * @return Tags associated with the schema.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags associated with the schema.
     * </p>
     * 
     * @param tags
     *        Tags associated with the schema.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags associated with the schema.
     * </p>
     * 
     * @param tags
     *        Tags associated with the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSchemaRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateSchemaRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateSchemaRequest addTagsEntry(String key, String value) {
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

    public CreateSchemaRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * @param type
     * @see Type
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return
     * @see Type
     */

    public String getType() {
        return this.type;
    }

    /**
     * @param type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public CreateSchemaRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * @param type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public CreateSchemaRequest withType(Type type) {
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
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRegistryName() != null)
            sb.append("RegistryName: ").append(getRegistryName()).append(",");
        if (getSchemaName() != null)
            sb.append("SchemaName: ").append(getSchemaName()).append(",");
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

        if (obj instanceof CreateSchemaRequest == false)
            return false;
        CreateSchemaRequest other = (CreateSchemaRequest) obj;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRegistryName() == null ^ this.getRegistryName() == null)
            return false;
        if (other.getRegistryName() != null && other.getRegistryName().equals(this.getRegistryName()) == false)
            return false;
        if (other.getSchemaName() == null ^ this.getSchemaName() == null)
            return false;
        if (other.getSchemaName() != null && other.getSchemaName().equals(this.getSchemaName()) == false)
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

        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRegistryName() == null) ? 0 : getRegistryName().hashCode());
        hashCode = prime * hashCode + ((getSchemaName() == null) ? 0 : getSchemaName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public CreateSchemaRequest clone() {
        return (CreateSchemaRequest) super.clone();
    }

}
