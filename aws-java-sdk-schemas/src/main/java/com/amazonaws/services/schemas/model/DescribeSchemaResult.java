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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/DescribeSchema" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSchemaResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String content;
    /**
     * <p>
     * The description of the schema.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The date and time that schema was modified.
     * </p>
     */
    private java.util.Date lastModified;
    /**
     * <p>
     * The ARN of the schema.
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
     * The version number of the schema
     * </p>
     */
    private String schemaVersion;
    /**
     * <p>
     * Tags associated with the resource.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The type of the schema.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The date the schema version was created.
     * </p>
     */
    private java.util.Date versionCreatedDate;

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

    public DescribeSchemaResult withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The description of the schema.
     * </p>
     * 
     * @param description
     *        The description of the schema.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the schema.
     * </p>
     * 
     * @return The description of the schema.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the schema.
     * </p>
     * 
     * @param description
     *        The description of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSchemaResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The date and time that schema was modified.
     * </p>
     * 
     * @param lastModified
     *        The date and time that schema was modified.
     */

    public void setLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * The date and time that schema was modified.
     * </p>
     * 
     * @return The date and time that schema was modified.
     */

    public java.util.Date getLastModified() {
        return this.lastModified;
    }

    /**
     * <p>
     * The date and time that schema was modified.
     * </p>
     * 
     * @param lastModified
     *        The date and time that schema was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSchemaResult withLastModified(java.util.Date lastModified) {
        setLastModified(lastModified);
        return this;
    }

    /**
     * <p>
     * The ARN of the schema.
     * </p>
     * 
     * @param schemaArn
     *        The ARN of the schema.
     */

    public void setSchemaArn(String schemaArn) {
        this.schemaArn = schemaArn;
    }

    /**
     * <p>
     * The ARN of the schema.
     * </p>
     * 
     * @return The ARN of the schema.
     */

    public String getSchemaArn() {
        return this.schemaArn;
    }

    /**
     * <p>
     * The ARN of the schema.
     * </p>
     * 
     * @param schemaArn
     *        The ARN of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSchemaResult withSchemaArn(String schemaArn) {
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

    public DescribeSchemaResult withSchemaName(String schemaName) {
        setSchemaName(schemaName);
        return this;
    }

    /**
     * <p>
     * The version number of the schema
     * </p>
     * 
     * @param schemaVersion
     *        The version number of the schema
     */

    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    /**
     * <p>
     * The version number of the schema
     * </p>
     * 
     * @return The version number of the schema
     */

    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    /**
     * <p>
     * The version number of the schema
     * </p>
     * 
     * @param schemaVersion
     *        The version number of the schema
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSchemaResult withSchemaVersion(String schemaVersion) {
        setSchemaVersion(schemaVersion);
        return this;
    }

    /**
     * <p>
     * Tags associated with the resource.
     * </p>
     * 
     * @return Tags associated with the resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags associated with the resource.
     * </p>
     * 
     * @param tags
     *        Tags associated with the resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags associated with the resource.
     * </p>
     * 
     * @param tags
     *        Tags associated with the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSchemaResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see DescribeSchemaResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSchemaResult addTagsEntry(String key, String value) {
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

    public DescribeSchemaResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The type of the schema.
     * </p>
     * 
     * @param type
     *        The type of the schema.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the schema.
     * </p>
     * 
     * @return The type of the schema.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the schema.
     * </p>
     * 
     * @param type
     *        The type of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSchemaResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The date the schema version was created.
     * </p>
     * 
     * @param versionCreatedDate
     *        The date the schema version was created.
     */

    public void setVersionCreatedDate(java.util.Date versionCreatedDate) {
        this.versionCreatedDate = versionCreatedDate;
    }

    /**
     * <p>
     * The date the schema version was created.
     * </p>
     * 
     * @return The date the schema version was created.
     */

    public java.util.Date getVersionCreatedDate() {
        return this.versionCreatedDate;
    }

    /**
     * <p>
     * The date the schema version was created.
     * </p>
     * 
     * @param versionCreatedDate
     *        The date the schema version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSchemaResult withVersionCreatedDate(java.util.Date versionCreatedDate) {
        setVersionCreatedDate(versionCreatedDate);
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
        if (getLastModified() != null)
            sb.append("LastModified: ").append(getLastModified()).append(",");
        if (getSchemaArn() != null)
            sb.append("SchemaArn: ").append(getSchemaArn()).append(",");
        if (getSchemaName() != null)
            sb.append("SchemaName: ").append(getSchemaName()).append(",");
        if (getSchemaVersion() != null)
            sb.append("SchemaVersion: ").append(getSchemaVersion()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getVersionCreatedDate() != null)
            sb.append("VersionCreatedDate: ").append(getVersionCreatedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSchemaResult == false)
            return false;
        DescribeSchemaResult other = (DescribeSchemaResult) obj;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        if (other.getSchemaArn() == null ^ this.getSchemaArn() == null)
            return false;
        if (other.getSchemaArn() != null && other.getSchemaArn().equals(this.getSchemaArn()) == false)
            return false;
        if (other.getSchemaName() == null ^ this.getSchemaName() == null)
            return false;
        if (other.getSchemaName() != null && other.getSchemaName().equals(this.getSchemaName()) == false)
            return false;
        if (other.getSchemaVersion() == null ^ this.getSchemaVersion() == null)
            return false;
        if (other.getSchemaVersion() != null && other.getSchemaVersion().equals(this.getSchemaVersion()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getVersionCreatedDate() == null ^ this.getVersionCreatedDate() == null)
            return false;
        if (other.getVersionCreatedDate() != null && other.getVersionCreatedDate().equals(this.getVersionCreatedDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        hashCode = prime * hashCode + ((getSchemaArn() == null) ? 0 : getSchemaArn().hashCode());
        hashCode = prime * hashCode + ((getSchemaName() == null) ? 0 : getSchemaName().hashCode());
        hashCode = prime * hashCode + ((getSchemaVersion() == null) ? 0 : getSchemaVersion().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getVersionCreatedDate() == null) ? 0 : getVersionCreatedDate().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSchemaResult clone() {
        try {
            return (DescribeSchemaResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
