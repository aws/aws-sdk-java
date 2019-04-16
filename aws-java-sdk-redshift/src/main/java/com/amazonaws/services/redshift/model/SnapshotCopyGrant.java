/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The snapshot copy grant that grants Amazon Redshift permission to encrypt copied snapshots with the specified
 * customer master key (CMK) from AWS KMS in the destination region.
 * </p>
 * <p>
 * For more information about managing snapshot copy grants, go to <a
 * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-db-encryption.html">Amazon Redshift Database
 * Encryption</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/SnapshotCopyGrant" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnapshotCopyGrant implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the snapshot copy grant.
     * </p>
     */
    private String snapshotCopyGrantName;
    /**
     * <p>
     * The unique identifier of the customer master key (CMK) in AWS KMS to which Amazon Redshift is granted permission.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * A list of tag instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The name of the snapshot copy grant.
     * </p>
     * 
     * @param snapshotCopyGrantName
     *        The name of the snapshot copy grant.
     */

    public void setSnapshotCopyGrantName(String snapshotCopyGrantName) {
        this.snapshotCopyGrantName = snapshotCopyGrantName;
    }

    /**
     * <p>
     * The name of the snapshot copy grant.
     * </p>
     * 
     * @return The name of the snapshot copy grant.
     */

    public String getSnapshotCopyGrantName() {
        return this.snapshotCopyGrantName;
    }

    /**
     * <p>
     * The name of the snapshot copy grant.
     * </p>
     * 
     * @param snapshotCopyGrantName
     *        The name of the snapshot copy grant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotCopyGrant withSnapshotCopyGrantName(String snapshotCopyGrantName) {
        setSnapshotCopyGrantName(snapshotCopyGrantName);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the customer master key (CMK) in AWS KMS to which Amazon Redshift is granted permission.
     * </p>
     * 
     * @param kmsKeyId
     *        The unique identifier of the customer master key (CMK) in AWS KMS to which Amazon Redshift is granted
     *        permission.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The unique identifier of the customer master key (CMK) in AWS KMS to which Amazon Redshift is granted permission.
     * </p>
     * 
     * @return The unique identifier of the customer master key (CMK) in AWS KMS to which Amazon Redshift is granted
     *         permission.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The unique identifier of the customer master key (CMK) in AWS KMS to which Amazon Redshift is granted permission.
     * </p>
     * 
     * @param kmsKeyId
     *        The unique identifier of the customer master key (CMK) in AWS KMS to which Amazon Redshift is granted
     *        permission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotCopyGrant withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     * 
     * @return A list of tag instances.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     * 
     * @param tags
     *        A list of tag instances.
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
     * A list of tag instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tag instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotCopyGrant withTags(Tag... tags) {
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
     * A list of tag instances.
     * </p>
     * 
     * @param tags
     *        A list of tag instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotCopyGrant withTags(java.util.Collection<Tag> tags) {
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
        if (getSnapshotCopyGrantName() != null)
            sb.append("SnapshotCopyGrantName: ").append(getSnapshotCopyGrantName()).append(",");
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

        if (obj instanceof SnapshotCopyGrant == false)
            return false;
        SnapshotCopyGrant other = (SnapshotCopyGrant) obj;
        if (other.getSnapshotCopyGrantName() == null ^ this.getSnapshotCopyGrantName() == null)
            return false;
        if (other.getSnapshotCopyGrantName() != null && other.getSnapshotCopyGrantName().equals(this.getSnapshotCopyGrantName()) == false)
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

        hashCode = prime * hashCode + ((getSnapshotCopyGrantName() == null) ? 0 : getSnapshotCopyGrantName().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public SnapshotCopyGrant clone() {
        try {
            return (SnapshotCopyGrant) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
