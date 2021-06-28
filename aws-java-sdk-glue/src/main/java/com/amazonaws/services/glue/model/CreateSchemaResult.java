/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateSchema" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSchemaResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the registry.
     * </p>
     */
    private String registryName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the registry.
     * </p>
     */
    private String registryArn;
    /**
     * <p>
     * The name of the schema.
     * </p>
     */
    private String schemaName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schema.
     * </p>
     */
    private String schemaArn;
    /**
     * <p>
     * A description of the schema if specified when created.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The data format of the schema definition. Currently <code>AVRO</code> and <code>JSON</code> are supported.
     * </p>
     */
    private String dataFormat;
    /**
     * <p>
     * The schema compatibility mode.
     * </p>
     */
    private String compatibility;
    /**
     * <p>
     * The version number of the checkpoint (the last time the compatibility mode was changed).
     * </p>
     */
    private Long schemaCheckpoint;
    /**
     * <p>
     * The latest version of the schema associated with the returned schema definition.
     * </p>
     */
    private Long latestSchemaVersion;
    /**
     * <p>
     * The next version of the schema associated with the returned schema definition.
     * </p>
     */
    private Long nextSchemaVersion;
    /**
     * <p>
     * The status of the schema.
     * </p>
     */
    private String schemaStatus;
    /**
     * <p>
     * The tags for the schema.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The unique identifier of the first schema version.
     * </p>
     */
    private String schemaVersionId;
    /**
     * <p>
     * The status of the first schema version created.
     * </p>
     */
    private String schemaVersionStatus;

    /**
     * <p>
     * The name of the registry.
     * </p>
     * 
     * @param registryName
     *        The name of the registry.
     */

    public void setRegistryName(String registryName) {
        this.registryName = registryName;
    }

    /**
     * <p>
     * The name of the registry.
     * </p>
     * 
     * @return The name of the registry.
     */

    public String getRegistryName() {
        return this.registryName;
    }

    /**
     * <p>
     * The name of the registry.
     * </p>
     * 
     * @param registryName
     *        The name of the registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSchemaResult withRegistryName(String registryName) {
        setRegistryName(registryName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the registry.
     * </p>
     * 
     * @param registryArn
     *        The Amazon Resource Name (ARN) of the registry.
     */

    public void setRegistryArn(String registryArn) {
        this.registryArn = registryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the registry.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the registry.
     */

    public String getRegistryArn() {
        return this.registryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the registry.
     * </p>
     * 
     * @param registryArn
     *        The Amazon Resource Name (ARN) of the registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSchemaResult withRegistryArn(String registryArn) {
        setRegistryArn(registryArn);
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

    public CreateSchemaResult withSchemaName(String schemaName) {
        setSchemaName(schemaName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schema.
     * </p>
     * 
     * @param schemaArn
     *        The Amazon Resource Name (ARN) of the schema.
     */

    public void setSchemaArn(String schemaArn) {
        this.schemaArn = schemaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schema.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the schema.
     */

    public String getSchemaArn() {
        return this.schemaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schema.
     * </p>
     * 
     * @param schemaArn
     *        The Amazon Resource Name (ARN) of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSchemaResult withSchemaArn(String schemaArn) {
        setSchemaArn(schemaArn);
        return this;
    }

    /**
     * <p>
     * A description of the schema if specified when created.
     * </p>
     * 
     * @param description
     *        A description of the schema if specified when created.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the schema if specified when created.
     * </p>
     * 
     * @return A description of the schema if specified when created.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the schema if specified when created.
     * </p>
     * 
     * @param description
     *        A description of the schema if specified when created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSchemaResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The data format of the schema definition. Currently <code>AVRO</code> and <code>JSON</code> are supported.
     * </p>
     * 
     * @param dataFormat
     *        The data format of the schema definition. Currently <code>AVRO</code> and <code>JSON</code> are supported.
     * @see DataFormat
     */

    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    /**
     * <p>
     * The data format of the schema definition. Currently <code>AVRO</code> and <code>JSON</code> are supported.
     * </p>
     * 
     * @return The data format of the schema definition. Currently <code>AVRO</code> and <code>JSON</code> are
     *         supported.
     * @see DataFormat
     */

    public String getDataFormat() {
        return this.dataFormat;
    }

    /**
     * <p>
     * The data format of the schema definition. Currently <code>AVRO</code> and <code>JSON</code> are supported.
     * </p>
     * 
     * @param dataFormat
     *        The data format of the schema definition. Currently <code>AVRO</code> and <code>JSON</code> are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataFormat
     */

    public CreateSchemaResult withDataFormat(String dataFormat) {
        setDataFormat(dataFormat);
        return this;
    }

    /**
     * <p>
     * The data format of the schema definition. Currently <code>AVRO</code> and <code>JSON</code> are supported.
     * </p>
     * 
     * @param dataFormat
     *        The data format of the schema definition. Currently <code>AVRO</code> and <code>JSON</code> are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataFormat
     */

    public CreateSchemaResult withDataFormat(DataFormat dataFormat) {
        this.dataFormat = dataFormat.toString();
        return this;
    }

    /**
     * <p>
     * The schema compatibility mode.
     * </p>
     * 
     * @param compatibility
     *        The schema compatibility mode.
     * @see Compatibility
     */

    public void setCompatibility(String compatibility) {
        this.compatibility = compatibility;
    }

    /**
     * <p>
     * The schema compatibility mode.
     * </p>
     * 
     * @return The schema compatibility mode.
     * @see Compatibility
     */

    public String getCompatibility() {
        return this.compatibility;
    }

    /**
     * <p>
     * The schema compatibility mode.
     * </p>
     * 
     * @param compatibility
     *        The schema compatibility mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Compatibility
     */

    public CreateSchemaResult withCompatibility(String compatibility) {
        setCompatibility(compatibility);
        return this;
    }

    /**
     * <p>
     * The schema compatibility mode.
     * </p>
     * 
     * @param compatibility
     *        The schema compatibility mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Compatibility
     */

    public CreateSchemaResult withCompatibility(Compatibility compatibility) {
        this.compatibility = compatibility.toString();
        return this;
    }

    /**
     * <p>
     * The version number of the checkpoint (the last time the compatibility mode was changed).
     * </p>
     * 
     * @param schemaCheckpoint
     *        The version number of the checkpoint (the last time the compatibility mode was changed).
     */

    public void setSchemaCheckpoint(Long schemaCheckpoint) {
        this.schemaCheckpoint = schemaCheckpoint;
    }

    /**
     * <p>
     * The version number of the checkpoint (the last time the compatibility mode was changed).
     * </p>
     * 
     * @return The version number of the checkpoint (the last time the compatibility mode was changed).
     */

    public Long getSchemaCheckpoint() {
        return this.schemaCheckpoint;
    }

    /**
     * <p>
     * The version number of the checkpoint (the last time the compatibility mode was changed).
     * </p>
     * 
     * @param schemaCheckpoint
     *        The version number of the checkpoint (the last time the compatibility mode was changed).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSchemaResult withSchemaCheckpoint(Long schemaCheckpoint) {
        setSchemaCheckpoint(schemaCheckpoint);
        return this;
    }

    /**
     * <p>
     * The latest version of the schema associated with the returned schema definition.
     * </p>
     * 
     * @param latestSchemaVersion
     *        The latest version of the schema associated with the returned schema definition.
     */

    public void setLatestSchemaVersion(Long latestSchemaVersion) {
        this.latestSchemaVersion = latestSchemaVersion;
    }

    /**
     * <p>
     * The latest version of the schema associated with the returned schema definition.
     * </p>
     * 
     * @return The latest version of the schema associated with the returned schema definition.
     */

    public Long getLatestSchemaVersion() {
        return this.latestSchemaVersion;
    }

    /**
     * <p>
     * The latest version of the schema associated with the returned schema definition.
     * </p>
     * 
     * @param latestSchemaVersion
     *        The latest version of the schema associated with the returned schema definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSchemaResult withLatestSchemaVersion(Long latestSchemaVersion) {
        setLatestSchemaVersion(latestSchemaVersion);
        return this;
    }

    /**
     * <p>
     * The next version of the schema associated with the returned schema definition.
     * </p>
     * 
     * @param nextSchemaVersion
     *        The next version of the schema associated with the returned schema definition.
     */

    public void setNextSchemaVersion(Long nextSchemaVersion) {
        this.nextSchemaVersion = nextSchemaVersion;
    }

    /**
     * <p>
     * The next version of the schema associated with the returned schema definition.
     * </p>
     * 
     * @return The next version of the schema associated with the returned schema definition.
     */

    public Long getNextSchemaVersion() {
        return this.nextSchemaVersion;
    }

    /**
     * <p>
     * The next version of the schema associated with the returned schema definition.
     * </p>
     * 
     * @param nextSchemaVersion
     *        The next version of the schema associated with the returned schema definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSchemaResult withNextSchemaVersion(Long nextSchemaVersion) {
        setNextSchemaVersion(nextSchemaVersion);
        return this;
    }

    /**
     * <p>
     * The status of the schema.
     * </p>
     * 
     * @param schemaStatus
     *        The status of the schema.
     * @see SchemaStatus
     */

    public void setSchemaStatus(String schemaStatus) {
        this.schemaStatus = schemaStatus;
    }

    /**
     * <p>
     * The status of the schema.
     * </p>
     * 
     * @return The status of the schema.
     * @see SchemaStatus
     */

    public String getSchemaStatus() {
        return this.schemaStatus;
    }

    /**
     * <p>
     * The status of the schema.
     * </p>
     * 
     * @param schemaStatus
     *        The status of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaStatus
     */

    public CreateSchemaResult withSchemaStatus(String schemaStatus) {
        setSchemaStatus(schemaStatus);
        return this;
    }

    /**
     * <p>
     * The status of the schema.
     * </p>
     * 
     * @param schemaStatus
     *        The status of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaStatus
     */

    public CreateSchemaResult withSchemaStatus(SchemaStatus schemaStatus) {
        this.schemaStatus = schemaStatus.toString();
        return this;
    }

    /**
     * <p>
     * The tags for the schema.
     * </p>
     * 
     * @return The tags for the schema.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the schema.
     * </p>
     * 
     * @param tags
     *        The tags for the schema.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags for the schema.
     * </p>
     * 
     * @param tags
     *        The tags for the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSchemaResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateSchemaResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateSchemaResult addTagsEntry(String key, String value) {
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

    public CreateSchemaResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The unique identifier of the first schema version.
     * </p>
     * 
     * @param schemaVersionId
     *        The unique identifier of the first schema version.
     */

    public void setSchemaVersionId(String schemaVersionId) {
        this.schemaVersionId = schemaVersionId;
    }

    /**
     * <p>
     * The unique identifier of the first schema version.
     * </p>
     * 
     * @return The unique identifier of the first schema version.
     */

    public String getSchemaVersionId() {
        return this.schemaVersionId;
    }

    /**
     * <p>
     * The unique identifier of the first schema version.
     * </p>
     * 
     * @param schemaVersionId
     *        The unique identifier of the first schema version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSchemaResult withSchemaVersionId(String schemaVersionId) {
        setSchemaVersionId(schemaVersionId);
        return this;
    }

    /**
     * <p>
     * The status of the first schema version created.
     * </p>
     * 
     * @param schemaVersionStatus
     *        The status of the first schema version created.
     * @see SchemaVersionStatus
     */

    public void setSchemaVersionStatus(String schemaVersionStatus) {
        this.schemaVersionStatus = schemaVersionStatus;
    }

    /**
     * <p>
     * The status of the first schema version created.
     * </p>
     * 
     * @return The status of the first schema version created.
     * @see SchemaVersionStatus
     */

    public String getSchemaVersionStatus() {
        return this.schemaVersionStatus;
    }

    /**
     * <p>
     * The status of the first schema version created.
     * </p>
     * 
     * @param schemaVersionStatus
     *        The status of the first schema version created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaVersionStatus
     */

    public CreateSchemaResult withSchemaVersionStatus(String schemaVersionStatus) {
        setSchemaVersionStatus(schemaVersionStatus);
        return this;
    }

    /**
     * <p>
     * The status of the first schema version created.
     * </p>
     * 
     * @param schemaVersionStatus
     *        The status of the first schema version created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaVersionStatus
     */

    public CreateSchemaResult withSchemaVersionStatus(SchemaVersionStatus schemaVersionStatus) {
        this.schemaVersionStatus = schemaVersionStatus.toString();
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
        if (getRegistryName() != null)
            sb.append("RegistryName: ").append(getRegistryName()).append(",");
        if (getRegistryArn() != null)
            sb.append("RegistryArn: ").append(getRegistryArn()).append(",");
        if (getSchemaName() != null)
            sb.append("SchemaName: ").append(getSchemaName()).append(",");
        if (getSchemaArn() != null)
            sb.append("SchemaArn: ").append(getSchemaArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDataFormat() != null)
            sb.append("DataFormat: ").append(getDataFormat()).append(",");
        if (getCompatibility() != null)
            sb.append("Compatibility: ").append(getCompatibility()).append(",");
        if (getSchemaCheckpoint() != null)
            sb.append("SchemaCheckpoint: ").append(getSchemaCheckpoint()).append(",");
        if (getLatestSchemaVersion() != null)
            sb.append("LatestSchemaVersion: ").append(getLatestSchemaVersion()).append(",");
        if (getNextSchemaVersion() != null)
            sb.append("NextSchemaVersion: ").append(getNextSchemaVersion()).append(",");
        if (getSchemaStatus() != null)
            sb.append("SchemaStatus: ").append(getSchemaStatus()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getSchemaVersionId() != null)
            sb.append("SchemaVersionId: ").append(getSchemaVersionId()).append(",");
        if (getSchemaVersionStatus() != null)
            sb.append("SchemaVersionStatus: ").append(getSchemaVersionStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSchemaResult == false)
            return false;
        CreateSchemaResult other = (CreateSchemaResult) obj;
        if (other.getRegistryName() == null ^ this.getRegistryName() == null)
            return false;
        if (other.getRegistryName() != null && other.getRegistryName().equals(this.getRegistryName()) == false)
            return false;
        if (other.getRegistryArn() == null ^ this.getRegistryArn() == null)
            return false;
        if (other.getRegistryArn() != null && other.getRegistryArn().equals(this.getRegistryArn()) == false)
            return false;
        if (other.getSchemaName() == null ^ this.getSchemaName() == null)
            return false;
        if (other.getSchemaName() != null && other.getSchemaName().equals(this.getSchemaName()) == false)
            return false;
        if (other.getSchemaArn() == null ^ this.getSchemaArn() == null)
            return false;
        if (other.getSchemaArn() != null && other.getSchemaArn().equals(this.getSchemaArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDataFormat() == null ^ this.getDataFormat() == null)
            return false;
        if (other.getDataFormat() != null && other.getDataFormat().equals(this.getDataFormat()) == false)
            return false;
        if (other.getCompatibility() == null ^ this.getCompatibility() == null)
            return false;
        if (other.getCompatibility() != null && other.getCompatibility().equals(this.getCompatibility()) == false)
            return false;
        if (other.getSchemaCheckpoint() == null ^ this.getSchemaCheckpoint() == null)
            return false;
        if (other.getSchemaCheckpoint() != null && other.getSchemaCheckpoint().equals(this.getSchemaCheckpoint()) == false)
            return false;
        if (other.getLatestSchemaVersion() == null ^ this.getLatestSchemaVersion() == null)
            return false;
        if (other.getLatestSchemaVersion() != null && other.getLatestSchemaVersion().equals(this.getLatestSchemaVersion()) == false)
            return false;
        if (other.getNextSchemaVersion() == null ^ this.getNextSchemaVersion() == null)
            return false;
        if (other.getNextSchemaVersion() != null && other.getNextSchemaVersion().equals(this.getNextSchemaVersion()) == false)
            return false;
        if (other.getSchemaStatus() == null ^ this.getSchemaStatus() == null)
            return false;
        if (other.getSchemaStatus() != null && other.getSchemaStatus().equals(this.getSchemaStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getSchemaVersionId() == null ^ this.getSchemaVersionId() == null)
            return false;
        if (other.getSchemaVersionId() != null && other.getSchemaVersionId().equals(this.getSchemaVersionId()) == false)
            return false;
        if (other.getSchemaVersionStatus() == null ^ this.getSchemaVersionStatus() == null)
            return false;
        if (other.getSchemaVersionStatus() != null && other.getSchemaVersionStatus().equals(this.getSchemaVersionStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistryName() == null) ? 0 : getRegistryName().hashCode());
        hashCode = prime * hashCode + ((getRegistryArn() == null) ? 0 : getRegistryArn().hashCode());
        hashCode = prime * hashCode + ((getSchemaName() == null) ? 0 : getSchemaName().hashCode());
        hashCode = prime * hashCode + ((getSchemaArn() == null) ? 0 : getSchemaArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDataFormat() == null) ? 0 : getDataFormat().hashCode());
        hashCode = prime * hashCode + ((getCompatibility() == null) ? 0 : getCompatibility().hashCode());
        hashCode = prime * hashCode + ((getSchemaCheckpoint() == null) ? 0 : getSchemaCheckpoint().hashCode());
        hashCode = prime * hashCode + ((getLatestSchemaVersion() == null) ? 0 : getLatestSchemaVersion().hashCode());
        hashCode = prime * hashCode + ((getNextSchemaVersion() == null) ? 0 : getNextSchemaVersion().hashCode());
        hashCode = prime * hashCode + ((getSchemaStatus() == null) ? 0 : getSchemaStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getSchemaVersionId() == null) ? 0 : getSchemaVersionId().hashCode());
        hashCode = prime * hashCode + ((getSchemaVersionStatus() == null) ? 0 : getSchemaVersionStatus().hashCode());
        return hashCode;
    }

    @Override
    public CreateSchemaResult clone() {
        try {
            return (CreateSchemaResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
