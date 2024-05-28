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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CopyServerlessCacheSnapshot"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyServerlessCacheSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the existing serverless cache’s snapshot to be copied. Available for Redis only.
     * </p>
     */
    private String sourceServerlessCacheSnapshotName;
    /**
     * <p>
     * The identifier for the snapshot to be created. Available for Redis only.
     * </p>
     */
    private String targetServerlessCacheSnapshotName;
    /**
     * <p>
     * The identifier of the KMS key used to encrypt the target snapshot. Available for Redis only.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * A list of tags to be added to the target snapshot resource. A tag is a key-value pair. Available for Redis only.
     * Default: NULL
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The identifier of the existing serverless cache’s snapshot to be copied. Available for Redis only.
     * </p>
     * 
     * @param sourceServerlessCacheSnapshotName
     *        The identifier of the existing serverless cache’s snapshot to be copied. Available for Redis only.
     */

    public void setSourceServerlessCacheSnapshotName(String sourceServerlessCacheSnapshotName) {
        this.sourceServerlessCacheSnapshotName = sourceServerlessCacheSnapshotName;
    }

    /**
     * <p>
     * The identifier of the existing serverless cache’s snapshot to be copied. Available for Redis only.
     * </p>
     * 
     * @return The identifier of the existing serverless cache’s snapshot to be copied. Available for Redis only.
     */

    public String getSourceServerlessCacheSnapshotName() {
        return this.sourceServerlessCacheSnapshotName;
    }

    /**
     * <p>
     * The identifier of the existing serverless cache’s snapshot to be copied. Available for Redis only.
     * </p>
     * 
     * @param sourceServerlessCacheSnapshotName
     *        The identifier of the existing serverless cache’s snapshot to be copied. Available for Redis only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyServerlessCacheSnapshotRequest withSourceServerlessCacheSnapshotName(String sourceServerlessCacheSnapshotName) {
        setSourceServerlessCacheSnapshotName(sourceServerlessCacheSnapshotName);
        return this;
    }

    /**
     * <p>
     * The identifier for the snapshot to be created. Available for Redis only.
     * </p>
     * 
     * @param targetServerlessCacheSnapshotName
     *        The identifier for the snapshot to be created. Available for Redis only.
     */

    public void setTargetServerlessCacheSnapshotName(String targetServerlessCacheSnapshotName) {
        this.targetServerlessCacheSnapshotName = targetServerlessCacheSnapshotName;
    }

    /**
     * <p>
     * The identifier for the snapshot to be created. Available for Redis only.
     * </p>
     * 
     * @return The identifier for the snapshot to be created. Available for Redis only.
     */

    public String getTargetServerlessCacheSnapshotName() {
        return this.targetServerlessCacheSnapshotName;
    }

    /**
     * <p>
     * The identifier for the snapshot to be created. Available for Redis only.
     * </p>
     * 
     * @param targetServerlessCacheSnapshotName
     *        The identifier for the snapshot to be created. Available for Redis only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyServerlessCacheSnapshotRequest withTargetServerlessCacheSnapshotName(String targetServerlessCacheSnapshotName) {
        setTargetServerlessCacheSnapshotName(targetServerlessCacheSnapshotName);
        return this;
    }

    /**
     * <p>
     * The identifier of the KMS key used to encrypt the target snapshot. Available for Redis only.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier of the KMS key used to encrypt the target snapshot. Available for Redis only.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The identifier of the KMS key used to encrypt the target snapshot. Available for Redis only.
     * </p>
     * 
     * @return The identifier of the KMS key used to encrypt the target snapshot. Available for Redis only.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The identifier of the KMS key used to encrypt the target snapshot. Available for Redis only.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier of the KMS key used to encrypt the target snapshot. Available for Redis only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyServerlessCacheSnapshotRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * A list of tags to be added to the target snapshot resource. A tag is a key-value pair. Available for Redis only.
     * Default: NULL
     * </p>
     * 
     * @return A list of tags to be added to the target snapshot resource. A tag is a key-value pair. Available for
     *         Redis only. Default: NULL
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of tags to be added to the target snapshot resource. A tag is a key-value pair. Available for Redis only.
     * Default: NULL
     * </p>
     * 
     * @param tags
     *        A list of tags to be added to the target snapshot resource. A tag is a key-value pair. Available for Redis
     *        only. Default: NULL
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
     * A list of tags to be added to the target snapshot resource. A tag is a key-value pair. Available for Redis only.
     * Default: NULL
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags to be added to the target snapshot resource. A tag is a key-value pair. Available for Redis
     *        only. Default: NULL
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyServerlessCacheSnapshotRequest withTags(Tag... tags) {
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
     * A list of tags to be added to the target snapshot resource. A tag is a key-value pair. Available for Redis only.
     * Default: NULL
     * </p>
     * 
     * @param tags
     *        A list of tags to be added to the target snapshot resource. A tag is a key-value pair. Available for Redis
     *        only. Default: NULL
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyServerlessCacheSnapshotRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getSourceServerlessCacheSnapshotName() != null)
            sb.append("SourceServerlessCacheSnapshotName: ").append(getSourceServerlessCacheSnapshotName()).append(",");
        if (getTargetServerlessCacheSnapshotName() != null)
            sb.append("TargetServerlessCacheSnapshotName: ").append(getTargetServerlessCacheSnapshotName()).append(",");
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

        if (obj instanceof CopyServerlessCacheSnapshotRequest == false)
            return false;
        CopyServerlessCacheSnapshotRequest other = (CopyServerlessCacheSnapshotRequest) obj;
        if (other.getSourceServerlessCacheSnapshotName() == null ^ this.getSourceServerlessCacheSnapshotName() == null)
            return false;
        if (other.getSourceServerlessCacheSnapshotName() != null
                && other.getSourceServerlessCacheSnapshotName().equals(this.getSourceServerlessCacheSnapshotName()) == false)
            return false;
        if (other.getTargetServerlessCacheSnapshotName() == null ^ this.getTargetServerlessCacheSnapshotName() == null)
            return false;
        if (other.getTargetServerlessCacheSnapshotName() != null
                && other.getTargetServerlessCacheSnapshotName().equals(this.getTargetServerlessCacheSnapshotName()) == false)
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

        hashCode = prime * hashCode + ((getSourceServerlessCacheSnapshotName() == null) ? 0 : getSourceServerlessCacheSnapshotName().hashCode());
        hashCode = prime * hashCode + ((getTargetServerlessCacheSnapshotName() == null) ? 0 : getTargetServerlessCacheSnapshotName().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CopyServerlessCacheSnapshotRequest clone() {
        return (CopyServerlessCacheSnapshotRequest) super.clone();
    }

}
