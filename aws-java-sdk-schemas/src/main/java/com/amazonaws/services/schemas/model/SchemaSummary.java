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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of schema details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/SchemaSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SchemaSummary implements Serializable, Cloneable, StructuredPojo {

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
     * Tags associated with the schema.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The number of versions available for the schema.
     * </p>
     */
    private Long versionCount;

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

    public SchemaSummary withLastModified(java.util.Date lastModified) {
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

    public SchemaSummary withSchemaArn(String schemaArn) {
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

    public SchemaSummary withSchemaName(String schemaName) {
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

    public SchemaSummary withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see SchemaSummary#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SchemaSummary addTagsEntry(String key, String value) {
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

    public SchemaSummary clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The number of versions available for the schema.
     * </p>
     * 
     * @param versionCount
     *        The number of versions available for the schema.
     */

    public void setVersionCount(Long versionCount) {
        this.versionCount = versionCount;
    }

    /**
     * <p>
     * The number of versions available for the schema.
     * </p>
     * 
     * @return The number of versions available for the schema.
     */

    public Long getVersionCount() {
        return this.versionCount;
    }

    /**
     * <p>
     * The number of versions available for the schema.
     * </p>
     * 
     * @param versionCount
     *        The number of versions available for the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaSummary withVersionCount(Long versionCount) {
        setVersionCount(versionCount);
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
        if (getLastModified() != null)
            sb.append("LastModified: ").append(getLastModified()).append(",");
        if (getSchemaArn() != null)
            sb.append("SchemaArn: ").append(getSchemaArn()).append(",");
        if (getSchemaName() != null)
            sb.append("SchemaName: ").append(getSchemaName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getVersionCount() != null)
            sb.append("VersionCount: ").append(getVersionCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SchemaSummary == false)
            return false;
        SchemaSummary other = (SchemaSummary) obj;
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVersionCount() == null ^ this.getVersionCount() == null)
            return false;
        if (other.getVersionCount() != null && other.getVersionCount().equals(this.getVersionCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        hashCode = prime * hashCode + ((getSchemaArn() == null) ? 0 : getSchemaArn().hashCode());
        hashCode = prime * hashCode + ((getSchemaName() == null) ? 0 : getSchemaName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVersionCount() == null) ? 0 : getVersionCount().hashCode());
        return hashCode;
    }

    @Override
    public SchemaSummary clone() {
        try {
            return (SchemaSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.schemas.model.transform.SchemaSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
