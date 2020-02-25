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
package com.amazonaws.services.neptune.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/CopyDBClusterSnapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyDBClusterSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the DB cluster snapshot to copy. This parameter is not case-sensitive.
     * </p>
     * <p>
     * You can't copy from one AWS Region to another.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must specify a valid system snapshot in the "available" state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify a valid DB snapshot identifier.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster-snapshot1</code>
     * </p>
     */
    private String sourceDBClusterSnapshotIdentifier;
    /**
     * <p>
     * The identifier of the new DB cluster snapshot to create from the source DB cluster snapshot. This parameter is
     * not case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster-snapshot2</code>
     * </p>
     */
    private String targetDBClusterSnapshotIdentifier;
    /**
     * <p>
     * The AWS AWS KMS key ID for an encrypted DB cluster snapshot. The KMS key ID is the Amazon Resource Name (ARN),
     * KMS key identifier, or the KMS key alias for the KMS encryption key.
     * </p>
     * <p>
     * If you copy an encrypted DB cluster snapshot from your AWS account, you can specify a value for
     * <code>KmsKeyId</code> to encrypt the copy with a new KMS encryption key. If you don't specify a value for
     * <code>KmsKeyId</code>, then the copy of the DB cluster snapshot is encrypted with the same KMS key as the source
     * DB cluster snapshot.
     * </p>
     * <p>
     * If you copy an encrypted DB cluster snapshot that is shared from another AWS account, then you must specify a
     * value for <code>KmsKeyId</code>.
     * </p>
     * <p>
     * KMS encryption keys are specific to the AWS Region that they are created in, and you can't use encryption keys
     * from one AWS Region in another AWS Region.
     * </p>
     * <p>
     * You cannot encrypt an unencrypted DB cluster snapshot when you copy it. If you try to copy an unencrypted DB
     * cluster snapshot and specify a value for the KmsKeyId parameter, an error is returned.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * Not currently supported.
     * </p>
     */
    private String preSignedUrl;
    /**
     * <p>
     * True to copy all tags from the source DB cluster snapshot to the target DB cluster snapshot, and otherwise false.
     * The default is false.
     * </p>
     */
    private Boolean copyTags;
    /**
     * <p>
     * The tags to assign to the new DB cluster snapshot copy.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The identifier of the DB cluster snapshot to copy. This parameter is not case-sensitive.
     * </p>
     * <p>
     * You can't copy from one AWS Region to another.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must specify a valid system snapshot in the "available" state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify a valid DB snapshot identifier.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster-snapshot1</code>
     * </p>
     * 
     * @param sourceDBClusterSnapshotIdentifier
     *        The identifier of the DB cluster snapshot to copy. This parameter is not case-sensitive.</p>
     *        <p>
     *        You can't copy from one AWS Region to another.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must specify a valid system snapshot in the "available" state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify a valid DB snapshot identifier.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>my-cluster-snapshot1</code>
     */

    public void setSourceDBClusterSnapshotIdentifier(String sourceDBClusterSnapshotIdentifier) {
        this.sourceDBClusterSnapshotIdentifier = sourceDBClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the DB cluster snapshot to copy. This parameter is not case-sensitive.
     * </p>
     * <p>
     * You can't copy from one AWS Region to another.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must specify a valid system snapshot in the "available" state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify a valid DB snapshot identifier.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster-snapshot1</code>
     * </p>
     * 
     * @return The identifier of the DB cluster snapshot to copy. This parameter is not case-sensitive.</p>
     *         <p>
     *         You can't copy from one AWS Region to another.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must specify a valid system snapshot in the "available" state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specify a valid DB snapshot identifier.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>my-cluster-snapshot1</code>
     */

    public String getSourceDBClusterSnapshotIdentifier() {
        return this.sourceDBClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the DB cluster snapshot to copy. This parameter is not case-sensitive.
     * </p>
     * <p>
     * You can't copy from one AWS Region to another.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must specify a valid system snapshot in the "available" state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify a valid DB snapshot identifier.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster-snapshot1</code>
     * </p>
     * 
     * @param sourceDBClusterSnapshotIdentifier
     *        The identifier of the DB cluster snapshot to copy. This parameter is not case-sensitive.</p>
     *        <p>
     *        You can't copy from one AWS Region to another.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must specify a valid system snapshot in the "available" state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify a valid DB snapshot identifier.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>my-cluster-snapshot1</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDBClusterSnapshotRequest withSourceDBClusterSnapshotIdentifier(String sourceDBClusterSnapshotIdentifier) {
        setSourceDBClusterSnapshotIdentifier(sourceDBClusterSnapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the new DB cluster snapshot to create from the source DB cluster snapshot. This parameter is
     * not case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster-snapshot2</code>
     * </p>
     * 
     * @param targetDBClusterSnapshotIdentifier
     *        The identifier of the new DB cluster snapshot to create from the source DB cluster snapshot. This
     *        parameter is not case-sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 letters, numbers, or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>my-cluster-snapshot2</code>
     */

    public void setTargetDBClusterSnapshotIdentifier(String targetDBClusterSnapshotIdentifier) {
        this.targetDBClusterSnapshotIdentifier = targetDBClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the new DB cluster snapshot to create from the source DB cluster snapshot. This parameter is
     * not case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster-snapshot2</code>
     * </p>
     * 
     * @return The identifier of the new DB cluster snapshot to create from the source DB cluster snapshot. This
     *         parameter is not case-sensitive.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 1 to 63 letters, numbers, or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>my-cluster-snapshot2</code>
     */

    public String getTargetDBClusterSnapshotIdentifier() {
        return this.targetDBClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the new DB cluster snapshot to create from the source DB cluster snapshot. This parameter is
     * not case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster-snapshot2</code>
     * </p>
     * 
     * @param targetDBClusterSnapshotIdentifier
     *        The identifier of the new DB cluster snapshot to create from the source DB cluster snapshot. This
     *        parameter is not case-sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 letters, numbers, or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>my-cluster-snapshot2</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDBClusterSnapshotRequest withTargetDBClusterSnapshotIdentifier(String targetDBClusterSnapshotIdentifier) {
        setTargetDBClusterSnapshotIdentifier(targetDBClusterSnapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * The AWS AWS KMS key ID for an encrypted DB cluster snapshot. The KMS key ID is the Amazon Resource Name (ARN),
     * KMS key identifier, or the KMS key alias for the KMS encryption key.
     * </p>
     * <p>
     * If you copy an encrypted DB cluster snapshot from your AWS account, you can specify a value for
     * <code>KmsKeyId</code> to encrypt the copy with a new KMS encryption key. If you don't specify a value for
     * <code>KmsKeyId</code>, then the copy of the DB cluster snapshot is encrypted with the same KMS key as the source
     * DB cluster snapshot.
     * </p>
     * <p>
     * If you copy an encrypted DB cluster snapshot that is shared from another AWS account, then you must specify a
     * value for <code>KmsKeyId</code>.
     * </p>
     * <p>
     * KMS encryption keys are specific to the AWS Region that they are created in, and you can't use encryption keys
     * from one AWS Region in another AWS Region.
     * </p>
     * <p>
     * You cannot encrypt an unencrypted DB cluster snapshot when you copy it. If you try to copy an unencrypted DB
     * cluster snapshot and specify a value for the KmsKeyId parameter, an error is returned.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS AWS KMS key ID for an encrypted DB cluster snapshot. The KMS key ID is the Amazon Resource Name
     *        (ARN), KMS key identifier, or the KMS key alias for the KMS encryption key.</p>
     *        <p>
     *        If you copy an encrypted DB cluster snapshot from your AWS account, you can specify a value for
     *        <code>KmsKeyId</code> to encrypt the copy with a new KMS encryption key. If you don't specify a value for
     *        <code>KmsKeyId</code>, then the copy of the DB cluster snapshot is encrypted with the same KMS key as the
     *        source DB cluster snapshot.
     *        </p>
     *        <p>
     *        If you copy an encrypted DB cluster snapshot that is shared from another AWS account, then you must
     *        specify a value for <code>KmsKeyId</code>.
     *        </p>
     *        <p>
     *        KMS encryption keys are specific to the AWS Region that they are created in, and you can't use encryption
     *        keys from one AWS Region in another AWS Region.
     *        </p>
     *        <p>
     *        You cannot encrypt an unencrypted DB cluster snapshot when you copy it. If you try to copy an unencrypted
     *        DB cluster snapshot and specify a value for the KmsKeyId parameter, an error is returned.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS AWS KMS key ID for an encrypted DB cluster snapshot. The KMS key ID is the Amazon Resource Name (ARN),
     * KMS key identifier, or the KMS key alias for the KMS encryption key.
     * </p>
     * <p>
     * If you copy an encrypted DB cluster snapshot from your AWS account, you can specify a value for
     * <code>KmsKeyId</code> to encrypt the copy with a new KMS encryption key. If you don't specify a value for
     * <code>KmsKeyId</code>, then the copy of the DB cluster snapshot is encrypted with the same KMS key as the source
     * DB cluster snapshot.
     * </p>
     * <p>
     * If you copy an encrypted DB cluster snapshot that is shared from another AWS account, then you must specify a
     * value for <code>KmsKeyId</code>.
     * </p>
     * <p>
     * KMS encryption keys are specific to the AWS Region that they are created in, and you can't use encryption keys
     * from one AWS Region in another AWS Region.
     * </p>
     * <p>
     * You cannot encrypt an unencrypted DB cluster snapshot when you copy it. If you try to copy an unencrypted DB
     * cluster snapshot and specify a value for the KmsKeyId parameter, an error is returned.
     * </p>
     * 
     * @return The AWS AWS KMS key ID for an encrypted DB cluster snapshot. The KMS key ID is the Amazon Resource Name
     *         (ARN), KMS key identifier, or the KMS key alias for the KMS encryption key.</p>
     *         <p>
     *         If you copy an encrypted DB cluster snapshot from your AWS account, you can specify a value for
     *         <code>KmsKeyId</code> to encrypt the copy with a new KMS encryption key. If you don't specify a value for
     *         <code>KmsKeyId</code>, then the copy of the DB cluster snapshot is encrypted with the same KMS key as the
     *         source DB cluster snapshot.
     *         </p>
     *         <p>
     *         If you copy an encrypted DB cluster snapshot that is shared from another AWS account, then you must
     *         specify a value for <code>KmsKeyId</code>.
     *         </p>
     *         <p>
     *         KMS encryption keys are specific to the AWS Region that they are created in, and you can't use encryption
     *         keys from one AWS Region in another AWS Region.
     *         </p>
     *         <p>
     *         You cannot encrypt an unencrypted DB cluster snapshot when you copy it. If you try to copy an unencrypted
     *         DB cluster snapshot and specify a value for the KmsKeyId parameter, an error is returned.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The AWS AWS KMS key ID for an encrypted DB cluster snapshot. The KMS key ID is the Amazon Resource Name (ARN),
     * KMS key identifier, or the KMS key alias for the KMS encryption key.
     * </p>
     * <p>
     * If you copy an encrypted DB cluster snapshot from your AWS account, you can specify a value for
     * <code>KmsKeyId</code> to encrypt the copy with a new KMS encryption key. If you don't specify a value for
     * <code>KmsKeyId</code>, then the copy of the DB cluster snapshot is encrypted with the same KMS key as the source
     * DB cluster snapshot.
     * </p>
     * <p>
     * If you copy an encrypted DB cluster snapshot that is shared from another AWS account, then you must specify a
     * value for <code>KmsKeyId</code>.
     * </p>
     * <p>
     * KMS encryption keys are specific to the AWS Region that they are created in, and you can't use encryption keys
     * from one AWS Region in another AWS Region.
     * </p>
     * <p>
     * You cannot encrypt an unencrypted DB cluster snapshot when you copy it. If you try to copy an unencrypted DB
     * cluster snapshot and specify a value for the KmsKeyId parameter, an error is returned.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS AWS KMS key ID for an encrypted DB cluster snapshot. The KMS key ID is the Amazon Resource Name
     *        (ARN), KMS key identifier, or the KMS key alias for the KMS encryption key.</p>
     *        <p>
     *        If you copy an encrypted DB cluster snapshot from your AWS account, you can specify a value for
     *        <code>KmsKeyId</code> to encrypt the copy with a new KMS encryption key. If you don't specify a value for
     *        <code>KmsKeyId</code>, then the copy of the DB cluster snapshot is encrypted with the same KMS key as the
     *        source DB cluster snapshot.
     *        </p>
     *        <p>
     *        If you copy an encrypted DB cluster snapshot that is shared from another AWS account, then you must
     *        specify a value for <code>KmsKeyId</code>.
     *        </p>
     *        <p>
     *        KMS encryption keys are specific to the AWS Region that they are created in, and you can't use encryption
     *        keys from one AWS Region in another AWS Region.
     *        </p>
     *        <p>
     *        You cannot encrypt an unencrypted DB cluster snapshot when you copy it. If you try to copy an unencrypted
     *        DB cluster snapshot and specify a value for the KmsKeyId parameter, an error is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDBClusterSnapshotRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Not currently supported.
     * </p>
     * 
     * @param preSignedUrl
     *        Not currently supported.
     */

    public void setPreSignedUrl(String preSignedUrl) {
        this.preSignedUrl = preSignedUrl;
    }

    /**
     * <p>
     * Not currently supported.
     * </p>
     * 
     * @return Not currently supported.
     */

    public String getPreSignedUrl() {
        return this.preSignedUrl;
    }

    /**
     * <p>
     * Not currently supported.
     * </p>
     * 
     * @param preSignedUrl
     *        Not currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDBClusterSnapshotRequest withPreSignedUrl(String preSignedUrl) {
        setPreSignedUrl(preSignedUrl);
        return this;
    }

    /**
     * <p>
     * True to copy all tags from the source DB cluster snapshot to the target DB cluster snapshot, and otherwise false.
     * The default is false.
     * </p>
     * 
     * @param copyTags
     *        True to copy all tags from the source DB cluster snapshot to the target DB cluster snapshot, and otherwise
     *        false. The default is false.
     */

    public void setCopyTags(Boolean copyTags) {
        this.copyTags = copyTags;
    }

    /**
     * <p>
     * True to copy all tags from the source DB cluster snapshot to the target DB cluster snapshot, and otherwise false.
     * The default is false.
     * </p>
     * 
     * @return True to copy all tags from the source DB cluster snapshot to the target DB cluster snapshot, and
     *         otherwise false. The default is false.
     */

    public Boolean getCopyTags() {
        return this.copyTags;
    }

    /**
     * <p>
     * True to copy all tags from the source DB cluster snapshot to the target DB cluster snapshot, and otherwise false.
     * The default is false.
     * </p>
     * 
     * @param copyTags
     *        True to copy all tags from the source DB cluster snapshot to the target DB cluster snapshot, and otherwise
     *        false. The default is false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDBClusterSnapshotRequest withCopyTags(Boolean copyTags) {
        setCopyTags(copyTags);
        return this;
    }

    /**
     * <p>
     * True to copy all tags from the source DB cluster snapshot to the target DB cluster snapshot, and otherwise false.
     * The default is false.
     * </p>
     * 
     * @return True to copy all tags from the source DB cluster snapshot to the target DB cluster snapshot, and
     *         otherwise false. The default is false.
     */

    public Boolean isCopyTags() {
        return this.copyTags;
    }

    /**
     * <p>
     * The tags to assign to the new DB cluster snapshot copy.
     * </p>
     * 
     * @return The tags to assign to the new DB cluster snapshot copy.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to assign to the new DB cluster snapshot copy.
     * </p>
     * 
     * @param tags
     *        The tags to assign to the new DB cluster snapshot copy.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags to assign to the new DB cluster snapshot copy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to assign to the new DB cluster snapshot copy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDBClusterSnapshotRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to assign to the new DB cluster snapshot copy.
     * </p>
     * 
     * @param tags
     *        The tags to assign to the new DB cluster snapshot copy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDBClusterSnapshotRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getSourceDBClusterSnapshotIdentifier() != null)
            sb.append("SourceDBClusterSnapshotIdentifier: ").append(getSourceDBClusterSnapshotIdentifier()).append(",");
        if (getTargetDBClusterSnapshotIdentifier() != null)
            sb.append("TargetDBClusterSnapshotIdentifier: ").append(getTargetDBClusterSnapshotIdentifier()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getPreSignedUrl() != null)
            sb.append("PreSignedUrl: ").append(getPreSignedUrl()).append(",");
        if (getCopyTags() != null)
            sb.append("CopyTags: ").append(getCopyTags()).append(",");
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

        if (obj instanceof CopyDBClusterSnapshotRequest == false)
            return false;
        CopyDBClusterSnapshotRequest other = (CopyDBClusterSnapshotRequest) obj;
        if (other.getSourceDBClusterSnapshotIdentifier() == null ^ this.getSourceDBClusterSnapshotIdentifier() == null)
            return false;
        if (other.getSourceDBClusterSnapshotIdentifier() != null
                && other.getSourceDBClusterSnapshotIdentifier().equals(this.getSourceDBClusterSnapshotIdentifier()) == false)
            return false;
        if (other.getTargetDBClusterSnapshotIdentifier() == null ^ this.getTargetDBClusterSnapshotIdentifier() == null)
            return false;
        if (other.getTargetDBClusterSnapshotIdentifier() != null
                && other.getTargetDBClusterSnapshotIdentifier().equals(this.getTargetDBClusterSnapshotIdentifier()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getPreSignedUrl() == null ^ this.getPreSignedUrl() == null)
            return false;
        if (other.getPreSignedUrl() != null && other.getPreSignedUrl().equals(this.getPreSignedUrl()) == false)
            return false;
        if (other.getCopyTags() == null ^ this.getCopyTags() == null)
            return false;
        if (other.getCopyTags() != null && other.getCopyTags().equals(this.getCopyTags()) == false)
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

        hashCode = prime * hashCode + ((getSourceDBClusterSnapshotIdentifier() == null) ? 0 : getSourceDBClusterSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTargetDBClusterSnapshotIdentifier() == null) ? 0 : getTargetDBClusterSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getPreSignedUrl() == null) ? 0 : getPreSignedUrl().hashCode());
        hashCode = prime * hashCode + ((getCopyTags() == null) ? 0 : getCopyTags().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CopyDBClusterSnapshotRequest clone() {
        return (CopyDBClusterSnapshotRequest) super.clone();
    }

}
