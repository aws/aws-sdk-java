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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateServerlessCacheSnapshot"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateServerlessCacheSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the snapshot being created. Must be unique for the customer account. Available for Redis only. Must
     * be between 1 and 255 characters.
     * </p>
     */
    private String serverlessCacheSnapshotName;
    /**
     * <p>
     * The name of an existing serverless cache. The snapshot is created from this cache. Available for Redis only.
     * </p>
     */
    private String serverlessCacheName;
    /**
     * <p>
     * The ID of the KMS key used to encrypt the snapshot. Available for Redis only. Default: NULL
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * A list of tags to be added to the snapshot resource. A tag is a key-value pair. Available for Redis only.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The name for the snapshot being created. Must be unique for the customer account. Available for Redis only. Must
     * be between 1 and 255 characters.
     * </p>
     * 
     * @param serverlessCacheSnapshotName
     *        The name for the snapshot being created. Must be unique for the customer account. Available for Redis
     *        only. Must be between 1 and 255 characters.
     */

    public void setServerlessCacheSnapshotName(String serverlessCacheSnapshotName) {
        this.serverlessCacheSnapshotName = serverlessCacheSnapshotName;
    }

    /**
     * <p>
     * The name for the snapshot being created. Must be unique for the customer account. Available for Redis only. Must
     * be between 1 and 255 characters.
     * </p>
     * 
     * @return The name for the snapshot being created. Must be unique for the customer account. Available for Redis
     *         only. Must be between 1 and 255 characters.
     */

    public String getServerlessCacheSnapshotName() {
        return this.serverlessCacheSnapshotName;
    }

    /**
     * <p>
     * The name for the snapshot being created. Must be unique for the customer account. Available for Redis only. Must
     * be between 1 and 255 characters.
     * </p>
     * 
     * @param serverlessCacheSnapshotName
     *        The name for the snapshot being created. Must be unique for the customer account. Available for Redis
     *        only. Must be between 1 and 255 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerlessCacheSnapshotRequest withServerlessCacheSnapshotName(String serverlessCacheSnapshotName) {
        setServerlessCacheSnapshotName(serverlessCacheSnapshotName);
        return this;
    }

    /**
     * <p>
     * The name of an existing serverless cache. The snapshot is created from this cache. Available for Redis only.
     * </p>
     * 
     * @param serverlessCacheName
     *        The name of an existing serverless cache. The snapshot is created from this cache. Available for Redis
     *        only.
     */

    public void setServerlessCacheName(String serverlessCacheName) {
        this.serverlessCacheName = serverlessCacheName;
    }

    /**
     * <p>
     * The name of an existing serverless cache. The snapshot is created from this cache. Available for Redis only.
     * </p>
     * 
     * @return The name of an existing serverless cache. The snapshot is created from this cache. Available for Redis
     *         only.
     */

    public String getServerlessCacheName() {
        return this.serverlessCacheName;
    }

    /**
     * <p>
     * The name of an existing serverless cache. The snapshot is created from this cache. Available for Redis only.
     * </p>
     * 
     * @param serverlessCacheName
     *        The name of an existing serverless cache. The snapshot is created from this cache. Available for Redis
     *        only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerlessCacheSnapshotRequest withServerlessCacheName(String serverlessCacheName) {
        setServerlessCacheName(serverlessCacheName);
        return this;
    }

    /**
     * <p>
     * The ID of the KMS key used to encrypt the snapshot. Available for Redis only. Default: NULL
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the KMS key used to encrypt the snapshot. Available for Redis only. Default: NULL
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of the KMS key used to encrypt the snapshot. Available for Redis only. Default: NULL
     * </p>
     * 
     * @return The ID of the KMS key used to encrypt the snapshot. Available for Redis only. Default: NULL
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The ID of the KMS key used to encrypt the snapshot. Available for Redis only. Default: NULL
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the KMS key used to encrypt the snapshot. Available for Redis only. Default: NULL
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerlessCacheSnapshotRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * A list of tags to be added to the snapshot resource. A tag is a key-value pair. Available for Redis only.
     * </p>
     * 
     * @return A list of tags to be added to the snapshot resource. A tag is a key-value pair. Available for Redis only.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of tags to be added to the snapshot resource. A tag is a key-value pair. Available for Redis only.
     * </p>
     * 
     * @param tags
     *        A list of tags to be added to the snapshot resource. A tag is a key-value pair. Available for Redis only.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags to be added to the snapshot resource. A tag is a key-value pair. Available for Redis only.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags to be added to the snapshot resource. A tag is a key-value pair. Available for Redis only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerlessCacheSnapshotRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags to be added to the snapshot resource. A tag is a key-value pair. Available for Redis only.
     * </p>
     * 
     * @param tags
     *        A list of tags to be added to the snapshot resource. A tag is a key-value pair. Available for Redis only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerlessCacheSnapshotRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getServerlessCacheSnapshotName() != null)
            sb.append("ServerlessCacheSnapshotName: ").append(getServerlessCacheSnapshotName()).append(",");
        if (getServerlessCacheName() != null)
            sb.append("ServerlessCacheName: ").append(getServerlessCacheName()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateServerlessCacheSnapshotRequest == false)
            return false;
        CreateServerlessCacheSnapshotRequest other = (CreateServerlessCacheSnapshotRequest) obj;
        if (other.getServerlessCacheSnapshotName() == null ^ this.getServerlessCacheSnapshotName() == null)
            return false;
        if (other.getServerlessCacheSnapshotName() != null && other.getServerlessCacheSnapshotName().equals(this.getServerlessCacheSnapshotName()) == false)
            return false;
        if (other.getServerlessCacheName() == null ^ this.getServerlessCacheName() == null)
            return false;
        if (other.getServerlessCacheName() != null && other.getServerlessCacheName().equals(this.getServerlessCacheName()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerlessCacheSnapshotName() == null) ? 0 : getServerlessCacheSnapshotName().hashCode());
        hashCode = prime * hashCode + ((getServerlessCacheName() == null) ? 0 : getServerlessCacheName().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateServerlessCacheSnapshotRequest clone() {
        return (CreateServerlessCacheSnapshotRequest) super.clone();
    }

}
