/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.entityresolution.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/GetSchemaMapping" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSchemaMappingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The timestamp of when the <code>SchemaMapping</code> was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * A description of the schema.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Specifies whether the schema mapping has been applied to a workflow.
     * </p>
     */
    private Boolean hasWorkflows;
    /**
     * <p>
     * A list of <code>MappedInputFields</code>. Each <code>MappedInputField</code> corresponds to a column the source
     * data table, and contains column name plus additional information Venice uses for matching.
     * </p>
     */
    private java.util.List<SchemaInputAttribute> mappedInputFields;
    /**
     * <p>
     * The ARN (Amazon Resource Name) that Entity Resolution generated for the SchemaMapping.
     * </p>
     */
    private String schemaArn;
    /**
     * <p>
     * The name of the schema.
     * </p>
     */
    private String schemaName;
    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The timestamp of when the <code>SchemaMapping</code> was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The timestamp of when the <code>SchemaMapping</code> was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the <code>SchemaMapping</code> was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when the <code>SchemaMapping</code> was created.
     * </p>
     * 
     * @return The timestamp of when the <code>SchemaMapping</code> was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when the <code>SchemaMapping</code> was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the <code>SchemaMapping</code> was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSchemaMappingResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
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

    public GetSchemaMappingResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Specifies whether the schema mapping has been applied to a workflow.
     * </p>
     * 
     * @param hasWorkflows
     *        Specifies whether the schema mapping has been applied to a workflow.
     */

    public void setHasWorkflows(Boolean hasWorkflows) {
        this.hasWorkflows = hasWorkflows;
    }

    /**
     * <p>
     * Specifies whether the schema mapping has been applied to a workflow.
     * </p>
     * 
     * @return Specifies whether the schema mapping has been applied to a workflow.
     */

    public Boolean getHasWorkflows() {
        return this.hasWorkflows;
    }

    /**
     * <p>
     * Specifies whether the schema mapping has been applied to a workflow.
     * </p>
     * 
     * @param hasWorkflows
     *        Specifies whether the schema mapping has been applied to a workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSchemaMappingResult withHasWorkflows(Boolean hasWorkflows) {
        setHasWorkflows(hasWorkflows);
        return this;
    }

    /**
     * <p>
     * Specifies whether the schema mapping has been applied to a workflow.
     * </p>
     * 
     * @return Specifies whether the schema mapping has been applied to a workflow.
     */

    public Boolean isHasWorkflows() {
        return this.hasWorkflows;
    }

    /**
     * <p>
     * A list of <code>MappedInputFields</code>. Each <code>MappedInputField</code> corresponds to a column the source
     * data table, and contains column name plus additional information Venice uses for matching.
     * </p>
     * 
     * @return A list of <code>MappedInputFields</code>. Each <code>MappedInputField</code> corresponds to a column the
     *         source data table, and contains column name plus additional information Venice uses for matching.
     */

    public java.util.List<SchemaInputAttribute> getMappedInputFields() {
        return mappedInputFields;
    }

    /**
     * <p>
     * A list of <code>MappedInputFields</code>. Each <code>MappedInputField</code> corresponds to a column the source
     * data table, and contains column name plus additional information Venice uses for matching.
     * </p>
     * 
     * @param mappedInputFields
     *        A list of <code>MappedInputFields</code>. Each <code>MappedInputField</code> corresponds to a column the
     *        source data table, and contains column name plus additional information Venice uses for matching.
     */

    public void setMappedInputFields(java.util.Collection<SchemaInputAttribute> mappedInputFields) {
        if (mappedInputFields == null) {
            this.mappedInputFields = null;
            return;
        }

        this.mappedInputFields = new java.util.ArrayList<SchemaInputAttribute>(mappedInputFields);
    }

    /**
     * <p>
     * A list of <code>MappedInputFields</code>. Each <code>MappedInputField</code> corresponds to a column the source
     * data table, and contains column name plus additional information Venice uses for matching.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMappedInputFields(java.util.Collection)} or {@link #withMappedInputFields(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param mappedInputFields
     *        A list of <code>MappedInputFields</code>. Each <code>MappedInputField</code> corresponds to a column the
     *        source data table, and contains column name plus additional information Venice uses for matching.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSchemaMappingResult withMappedInputFields(SchemaInputAttribute... mappedInputFields) {
        if (this.mappedInputFields == null) {
            setMappedInputFields(new java.util.ArrayList<SchemaInputAttribute>(mappedInputFields.length));
        }
        for (SchemaInputAttribute ele : mappedInputFields) {
            this.mappedInputFields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>MappedInputFields</code>. Each <code>MappedInputField</code> corresponds to a column the source
     * data table, and contains column name plus additional information Venice uses for matching.
     * </p>
     * 
     * @param mappedInputFields
     *        A list of <code>MappedInputFields</code>. Each <code>MappedInputField</code> corresponds to a column the
     *        source data table, and contains column name plus additional information Venice uses for matching.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSchemaMappingResult withMappedInputFields(java.util.Collection<SchemaInputAttribute> mappedInputFields) {
        setMappedInputFields(mappedInputFields);
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) that Entity Resolution generated for the SchemaMapping.
     * </p>
     * 
     * @param schemaArn
     *        The ARN (Amazon Resource Name) that Entity Resolution generated for the SchemaMapping.
     */

    public void setSchemaArn(String schemaArn) {
        this.schemaArn = schemaArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) that Entity Resolution generated for the SchemaMapping.
     * </p>
     * 
     * @return The ARN (Amazon Resource Name) that Entity Resolution generated for the SchemaMapping.
     */

    public String getSchemaArn() {
        return this.schemaArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) that Entity Resolution generated for the SchemaMapping.
     * </p>
     * 
     * @param schemaArn
     *        The ARN (Amazon Resource Name) that Entity Resolution generated for the SchemaMapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSchemaMappingResult withSchemaArn(String schemaArn) {
        setSchemaArn(schemaArn);
        return this;
    }

    /**
     * <p>
     * The name of the schema.
     * </p>
     * 
     * @param schemaName
     *        The name of the schema.
     */

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    /**
     * <p>
     * The name of the schema.
     * </p>
     * 
     * @return The name of the schema.
     */

    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * <p>
     * The name of the schema.
     * </p>
     * 
     * @param schemaName
     *        The name of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSchemaMappingResult withSchemaName(String schemaName) {
        setSchemaName(schemaName);
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @return The tags used to organize, track, or control access for this resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSchemaMappingResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetSchemaMappingResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetSchemaMappingResult addTagsEntry(String key, String value) {
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

    public GetSchemaMappingResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The timestamp of when the <code>SchemaMapping</code> was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the <code>SchemaMapping</code> was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the <code>SchemaMapping</code> was last updated.
     * </p>
     * 
     * @return The timestamp of when the <code>SchemaMapping</code> was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the <code>SchemaMapping</code> was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the <code>SchemaMapping</code> was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSchemaMappingResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getHasWorkflows() != null)
            sb.append("HasWorkflows: ").append(getHasWorkflows()).append(",");
        if (getMappedInputFields() != null)
            sb.append("MappedInputFields: ").append(getMappedInputFields()).append(",");
        if (getSchemaArn() != null)
            sb.append("SchemaArn: ").append(getSchemaArn()).append(",");
        if (getSchemaName() != null)
            sb.append("SchemaName: ").append(getSchemaName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSchemaMappingResult == false)
            return false;
        GetSchemaMappingResult other = (GetSchemaMappingResult) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getHasWorkflows() == null ^ this.getHasWorkflows() == null)
            return false;
        if (other.getHasWorkflows() != null && other.getHasWorkflows().equals(this.getHasWorkflows()) == false)
            return false;
        if (other.getMappedInputFields() == null ^ this.getMappedInputFields() == null)
            return false;
        if (other.getMappedInputFields() != null && other.getMappedInputFields().equals(this.getMappedInputFields()) == false)
            return false;
        if (other.getSchemaArn() == null ^ this.getSchemaArn() == null)
            return false;
        if (other.getSchemaArn() != null && other.getSchemaArn().equals(this.getSchemaArn()) == false)
            return false;
        if (other.getSchemaName() == null ^ this.getSchemaName() == null)
            return false;
        if (other.getSchemaName() != null && other.getSchemaName().equals(this.getSchemaName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getHasWorkflows() == null) ? 0 : getHasWorkflows().hashCode());
        hashCode = prime * hashCode + ((getMappedInputFields() == null) ? 0 : getMappedInputFields().hashCode());
        hashCode = prime * hashCode + ((getSchemaArn() == null) ? 0 : getSchemaArn().hashCode());
        hashCode = prime * hashCode + ((getSchemaName() == null) ? 0 : getSchemaName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public GetSchemaMappingResult clone() {
        try {
            return (GetSchemaMappingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
