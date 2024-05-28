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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetRestoreJobMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRestoreJobMetadataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * This is a unique identifier of a restore job within Backup.
     * </p>
     */
    private String restoreJobId;
    /**
     * <p>
     * This contains the metadata of the specified backup job.
     * </p>
     */
    private java.util.Map<String, String> metadata;

    /**
     * <p>
     * This is a unique identifier of a restore job within Backup.
     * </p>
     * 
     * @param restoreJobId
     *        This is a unique identifier of a restore job within Backup.
     */

    public void setRestoreJobId(String restoreJobId) {
        this.restoreJobId = restoreJobId;
    }

    /**
     * <p>
     * This is a unique identifier of a restore job within Backup.
     * </p>
     * 
     * @return This is a unique identifier of a restore job within Backup.
     */

    public String getRestoreJobId() {
        return this.restoreJobId;
    }

    /**
     * <p>
     * This is a unique identifier of a restore job within Backup.
     * </p>
     * 
     * @param restoreJobId
     *        This is a unique identifier of a restore job within Backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRestoreJobMetadataResult withRestoreJobId(String restoreJobId) {
        setRestoreJobId(restoreJobId);
        return this;
    }

    /**
     * <p>
     * This contains the metadata of the specified backup job.
     * </p>
     * 
     * @return This contains the metadata of the specified backup job.
     */

    public java.util.Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * This contains the metadata of the specified backup job.
     * </p>
     * 
     * @param metadata
     *        This contains the metadata of the specified backup job.
     */

    public void setMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * This contains the metadata of the specified backup job.
     * </p>
     * 
     * @param metadata
     *        This contains the metadata of the specified backup job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRestoreJobMetadataResult withMetadata(java.util.Map<String, String> metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * Add a single Metadata entry
     *
     * @see GetRestoreJobMetadataResult#withMetadata
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetRestoreJobMetadataResult addMetadataEntry(String key, String value) {
        if (null == this.metadata) {
            this.metadata = new java.util.HashMap<String, String>();
        }
        if (this.metadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.metadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Metadata.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRestoreJobMetadataResult clearMetadataEntries() {
        this.metadata = null;
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
        if (getRestoreJobId() != null)
            sb.append("RestoreJobId: ").append(getRestoreJobId()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRestoreJobMetadataResult == false)
            return false;
        GetRestoreJobMetadataResult other = (GetRestoreJobMetadataResult) obj;
        if (other.getRestoreJobId() == null ^ this.getRestoreJobId() == null)
            return false;
        if (other.getRestoreJobId() != null && other.getRestoreJobId().equals(this.getRestoreJobId()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestoreJobId() == null) ? 0 : getRestoreJobId().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        return hashCode;
    }

    @Override
    public GetRestoreJobMetadataResult clone() {
        try {
            return (GetRestoreJobMetadataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
