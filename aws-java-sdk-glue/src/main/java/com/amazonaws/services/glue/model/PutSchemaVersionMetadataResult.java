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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/PutSchemaVersionMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutSchemaVersionMetadataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the schema.
     * </p>
     */
    private String schemaArn;
    /**
     * <p>
     * The name for the schema.
     * </p>
     */
    private String schemaName;
    /**
     * <p>
     * The name for the registry.
     * </p>
     */
    private String registryName;
    /**
     * <p>
     * The latest version of the schema.
     * </p>
     */
    private Boolean latestVersion;
    /**
     * <p>
     * The version number of the schema.
     * </p>
     */
    private Long versionNumber;
    /**
     * <p>
     * The unique version ID of the schema version.
     * </p>
     */
    private String schemaVersionId;
    /**
     * <p>
     * The metadata key.
     * </p>
     */
    private String metadataKey;
    /**
     * <p>
     * The value of the metadata key.
     * </p>
     */
    private String metadataValue;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the schema.
     * </p>
     * 
     * @param schemaArn
     *        The Amazon Resource Name (ARN) for the schema.
     */

    public void setSchemaArn(String schemaArn) {
        this.schemaArn = schemaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the schema.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the schema.
     */

    public String getSchemaArn() {
        return this.schemaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the schema.
     * </p>
     * 
     * @param schemaArn
     *        The Amazon Resource Name (ARN) for the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSchemaVersionMetadataResult withSchemaArn(String schemaArn) {
        setSchemaArn(schemaArn);
        return this;
    }

    /**
     * <p>
     * The name for the schema.
     * </p>
     * 
     * @param schemaName
     *        The name for the schema.
     */

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    /**
     * <p>
     * The name for the schema.
     * </p>
     * 
     * @return The name for the schema.
     */

    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * <p>
     * The name for the schema.
     * </p>
     * 
     * @param schemaName
     *        The name for the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSchemaVersionMetadataResult withSchemaName(String schemaName) {
        setSchemaName(schemaName);
        return this;
    }

    /**
     * <p>
     * The name for the registry.
     * </p>
     * 
     * @param registryName
     *        The name for the registry.
     */

    public void setRegistryName(String registryName) {
        this.registryName = registryName;
    }

    /**
     * <p>
     * The name for the registry.
     * </p>
     * 
     * @return The name for the registry.
     */

    public String getRegistryName() {
        return this.registryName;
    }

    /**
     * <p>
     * The name for the registry.
     * </p>
     * 
     * @param registryName
     *        The name for the registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSchemaVersionMetadataResult withRegistryName(String registryName) {
        setRegistryName(registryName);
        return this;
    }

    /**
     * <p>
     * The latest version of the schema.
     * </p>
     * 
     * @param latestVersion
     *        The latest version of the schema.
     */

    public void setLatestVersion(Boolean latestVersion) {
        this.latestVersion = latestVersion;
    }

    /**
     * <p>
     * The latest version of the schema.
     * </p>
     * 
     * @return The latest version of the schema.
     */

    public Boolean getLatestVersion() {
        return this.latestVersion;
    }

    /**
     * <p>
     * The latest version of the schema.
     * </p>
     * 
     * @param latestVersion
     *        The latest version of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSchemaVersionMetadataResult withLatestVersion(Boolean latestVersion) {
        setLatestVersion(latestVersion);
        return this;
    }

    /**
     * <p>
     * The latest version of the schema.
     * </p>
     * 
     * @return The latest version of the schema.
     */

    public Boolean isLatestVersion() {
        return this.latestVersion;
    }

    /**
     * <p>
     * The version number of the schema.
     * </p>
     * 
     * @param versionNumber
     *        The version number of the schema.
     */

    public void setVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * <p>
     * The version number of the schema.
     * </p>
     * 
     * @return The version number of the schema.
     */

    public Long getVersionNumber() {
        return this.versionNumber;
    }

    /**
     * <p>
     * The version number of the schema.
     * </p>
     * 
     * @param versionNumber
     *        The version number of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSchemaVersionMetadataResult withVersionNumber(Long versionNumber) {
        setVersionNumber(versionNumber);
        return this;
    }

    /**
     * <p>
     * The unique version ID of the schema version.
     * </p>
     * 
     * @param schemaVersionId
     *        The unique version ID of the schema version.
     */

    public void setSchemaVersionId(String schemaVersionId) {
        this.schemaVersionId = schemaVersionId;
    }

    /**
     * <p>
     * The unique version ID of the schema version.
     * </p>
     * 
     * @return The unique version ID of the schema version.
     */

    public String getSchemaVersionId() {
        return this.schemaVersionId;
    }

    /**
     * <p>
     * The unique version ID of the schema version.
     * </p>
     * 
     * @param schemaVersionId
     *        The unique version ID of the schema version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSchemaVersionMetadataResult withSchemaVersionId(String schemaVersionId) {
        setSchemaVersionId(schemaVersionId);
        return this;
    }

    /**
     * <p>
     * The metadata key.
     * </p>
     * 
     * @param metadataKey
     *        The metadata key.
     */

    public void setMetadataKey(String metadataKey) {
        this.metadataKey = metadataKey;
    }

    /**
     * <p>
     * The metadata key.
     * </p>
     * 
     * @return The metadata key.
     */

    public String getMetadataKey() {
        return this.metadataKey;
    }

    /**
     * <p>
     * The metadata key.
     * </p>
     * 
     * @param metadataKey
     *        The metadata key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSchemaVersionMetadataResult withMetadataKey(String metadataKey) {
        setMetadataKey(metadataKey);
        return this;
    }

    /**
     * <p>
     * The value of the metadata key.
     * </p>
     * 
     * @param metadataValue
     *        The value of the metadata key.
     */

    public void setMetadataValue(String metadataValue) {
        this.metadataValue = metadataValue;
    }

    /**
     * <p>
     * The value of the metadata key.
     * </p>
     * 
     * @return The value of the metadata key.
     */

    public String getMetadataValue() {
        return this.metadataValue;
    }

    /**
     * <p>
     * The value of the metadata key.
     * </p>
     * 
     * @param metadataValue
     *        The value of the metadata key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSchemaVersionMetadataResult withMetadataValue(String metadataValue) {
        setMetadataValue(metadataValue);
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
        if (getSchemaArn() != null)
            sb.append("SchemaArn: ").append(getSchemaArn()).append(",");
        if (getSchemaName() != null)
            sb.append("SchemaName: ").append(getSchemaName()).append(",");
        if (getRegistryName() != null)
            sb.append("RegistryName: ").append(getRegistryName()).append(",");
        if (getLatestVersion() != null)
            sb.append("LatestVersion: ").append(getLatestVersion()).append(",");
        if (getVersionNumber() != null)
            sb.append("VersionNumber: ").append(getVersionNumber()).append(",");
        if (getSchemaVersionId() != null)
            sb.append("SchemaVersionId: ").append(getSchemaVersionId()).append(",");
        if (getMetadataKey() != null)
            sb.append("MetadataKey: ").append(getMetadataKey()).append(",");
        if (getMetadataValue() != null)
            sb.append("MetadataValue: ").append(getMetadataValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutSchemaVersionMetadataResult == false)
            return false;
        PutSchemaVersionMetadataResult other = (PutSchemaVersionMetadataResult) obj;
        if (other.getSchemaArn() == null ^ this.getSchemaArn() == null)
            return false;
        if (other.getSchemaArn() != null && other.getSchemaArn().equals(this.getSchemaArn()) == false)
            return false;
        if (other.getSchemaName() == null ^ this.getSchemaName() == null)
            return false;
        if (other.getSchemaName() != null && other.getSchemaName().equals(this.getSchemaName()) == false)
            return false;
        if (other.getRegistryName() == null ^ this.getRegistryName() == null)
            return false;
        if (other.getRegistryName() != null && other.getRegistryName().equals(this.getRegistryName()) == false)
            return false;
        if (other.getLatestVersion() == null ^ this.getLatestVersion() == null)
            return false;
        if (other.getLatestVersion() != null && other.getLatestVersion().equals(this.getLatestVersion()) == false)
            return false;
        if (other.getVersionNumber() == null ^ this.getVersionNumber() == null)
            return false;
        if (other.getVersionNumber() != null && other.getVersionNumber().equals(this.getVersionNumber()) == false)
            return false;
        if (other.getSchemaVersionId() == null ^ this.getSchemaVersionId() == null)
            return false;
        if (other.getSchemaVersionId() != null && other.getSchemaVersionId().equals(this.getSchemaVersionId()) == false)
            return false;
        if (other.getMetadataKey() == null ^ this.getMetadataKey() == null)
            return false;
        if (other.getMetadataKey() != null && other.getMetadataKey().equals(this.getMetadataKey()) == false)
            return false;
        if (other.getMetadataValue() == null ^ this.getMetadataValue() == null)
            return false;
        if (other.getMetadataValue() != null && other.getMetadataValue().equals(this.getMetadataValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchemaArn() == null) ? 0 : getSchemaArn().hashCode());
        hashCode = prime * hashCode + ((getSchemaName() == null) ? 0 : getSchemaName().hashCode());
        hashCode = prime * hashCode + ((getRegistryName() == null) ? 0 : getRegistryName().hashCode());
        hashCode = prime * hashCode + ((getLatestVersion() == null) ? 0 : getLatestVersion().hashCode());
        hashCode = prime * hashCode + ((getVersionNumber() == null) ? 0 : getVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getSchemaVersionId() == null) ? 0 : getSchemaVersionId().hashCode());
        hashCode = prime * hashCode + ((getMetadataKey() == null) ? 0 : getMetadataKey().hashCode());
        hashCode = prime * hashCode + ((getMetadataValue() == null) ? 0 : getMetadataValue().hashCode());
        return hashCode;
    }

    @Override
    public PutSchemaVersionMetadataResult clone() {
        try {
            return (PutSchemaVersionMetadataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
