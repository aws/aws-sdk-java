/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 */
public class CopyDBSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the source DB snapshot.
     * </p>
     * <p>
     * If you are copying from a shared manual DB snapshot, this must be the ARN of the shared DB snapshot.
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
     * If the source snapshot is in the same region as the copy, specify a valid DB snapshot identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source snapshot is in a different region than the copy, specify a valid DB snapshot ARN. For more
     * information, go to <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_CopySnapshot.html">
     * Copying a DB Snapshot</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>rds:mydb-2012-04-02-00-01</code>
     * </p>
     * <p>
     * Example: <code>arn:aws:rds:rr-regn-1:123456789012:snapshot:mysql-instance1-snapshot-20130805</code>
     * </p>
     */
    private String sourceDBSnapshotIdentifier;
    /**
     * <p>
     * The identifier for the copied snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cannot be null, empty, or blank
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 255 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-db-snapshot</code>
     * </p>
     */
    private String targetDBSnapshotIdentifier;
    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key identifier for an encrypted DB snapshot. The KMS key identifier is
     * the Amazon Resource Name (ARN) or the KMS key alias for the KMS encryption key.
     * </p>
     * <p>
     * If you copy an unencrypted DB snapshot and specify a value for the <code>KmsKeyId</code> parameter, Amazon RDS
     * encrypts the target DB snapshot using the specified KMS encryption key.
     * </p>
     * <p>
     * If you copy an encrypted DB snapshot from your AWS account, you can specify a value for <code>KmsKeyId</code> to
     * encrypt the copy with a new KMS encryption key. If you don't specify a value for <code>KmsKeyId</code> then the
     * copy of the DB snapshot is encrypted with the same KMS key as the source DB snapshot.
     * </p>
     * <p>
     * If you copy an encrypted DB snapshot that is shared from another AWS account, then you must specify a value for
     * <code>KmsKeyId</code>.
     * </p>
     */
    private String kmsKeyId;

    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * True to copy all tags from the source DB snapshot to the target DB snapshot; otherwise false. The default is
     * false.
     * </p>
     */
    private Boolean copyTags;

    /**
     * <p>
     * The identifier for the source DB snapshot.
     * </p>
     * <p>
     * If you are copying from a shared manual DB snapshot, this must be the ARN of the shared DB snapshot.
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
     * If the source snapshot is in the same region as the copy, specify a valid DB snapshot identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source snapshot is in a different region than the copy, specify a valid DB snapshot ARN. For more
     * information, go to <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_CopySnapshot.html">
     * Copying a DB Snapshot</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>rds:mydb-2012-04-02-00-01</code>
     * </p>
     * <p>
     * Example: <code>arn:aws:rds:rr-regn-1:123456789012:snapshot:mysql-instance1-snapshot-20130805</code>
     * </p>
     * 
     * @param sourceDBSnapshotIdentifier
     *        The identifier for the source DB snapshot.</p>
     *        <p>
     *        If you are copying from a shared manual DB snapshot, this must be the ARN of the shared DB snapshot.
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
     *        If the source snapshot is in the same region as the copy, specify a valid DB snapshot identifier.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source snapshot is in a different region than the copy, specify a valid DB snapshot ARN. For more
     *        information, go to <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_CopySnapshot.html">
     *        Copying a DB Snapshot</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>rds:mydb-2012-04-02-00-01</code>
     *        </p>
     *        <p>
     *        Example: <code>arn:aws:rds:rr-regn-1:123456789012:snapshot:mysql-instance1-snapshot-20130805</code>
     */

    public void setSourceDBSnapshotIdentifier(String sourceDBSnapshotIdentifier) {
        this.sourceDBSnapshotIdentifier = sourceDBSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier for the source DB snapshot.
     * </p>
     * <p>
     * If you are copying from a shared manual DB snapshot, this must be the ARN of the shared DB snapshot.
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
     * If the source snapshot is in the same region as the copy, specify a valid DB snapshot identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source snapshot is in a different region than the copy, specify a valid DB snapshot ARN. For more
     * information, go to <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_CopySnapshot.html">
     * Copying a DB Snapshot</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>rds:mydb-2012-04-02-00-01</code>
     * </p>
     * <p>
     * Example: <code>arn:aws:rds:rr-regn-1:123456789012:snapshot:mysql-instance1-snapshot-20130805</code>
     * </p>
     * 
     * @return The identifier for the source DB snapshot.</p>
     *         <p>
     *         If you are copying from a shared manual DB snapshot, this must be the ARN of the shared DB snapshot.
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
     *         If the source snapshot is in the same region as the copy, specify a valid DB snapshot identifier.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the source snapshot is in a different region than the copy, specify a valid DB snapshot ARN. For more
     *         information, go to <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_CopySnapshot.html"> Copying a DB
     *         Snapshot</a>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>rds:mydb-2012-04-02-00-01</code>
     *         </p>
     *         <p>
     *         Example: <code>arn:aws:rds:rr-regn-1:123456789012:snapshot:mysql-instance1-snapshot-20130805</code>
     */

    public String getSourceDBSnapshotIdentifier() {
        return this.sourceDBSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier for the source DB snapshot.
     * </p>
     * <p>
     * If you are copying from a shared manual DB snapshot, this must be the ARN of the shared DB snapshot.
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
     * If the source snapshot is in the same region as the copy, specify a valid DB snapshot identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source snapshot is in a different region than the copy, specify a valid DB snapshot ARN. For more
     * information, go to <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_CopySnapshot.html">
     * Copying a DB Snapshot</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>rds:mydb-2012-04-02-00-01</code>
     * </p>
     * <p>
     * Example: <code>arn:aws:rds:rr-regn-1:123456789012:snapshot:mysql-instance1-snapshot-20130805</code>
     * </p>
     * 
     * @param sourceDBSnapshotIdentifier
     *        The identifier for the source DB snapshot.</p>
     *        <p>
     *        If you are copying from a shared manual DB snapshot, this must be the ARN of the shared DB snapshot.
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
     *        If the source snapshot is in the same region as the copy, specify a valid DB snapshot identifier.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source snapshot is in a different region than the copy, specify a valid DB snapshot ARN. For more
     *        information, go to <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_CopySnapshot.html">
     *        Copying a DB Snapshot</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>rds:mydb-2012-04-02-00-01</code>
     *        </p>
     *        <p>
     *        Example: <code>arn:aws:rds:rr-regn-1:123456789012:snapshot:mysql-instance1-snapshot-20130805</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDBSnapshotRequest withSourceDBSnapshotIdentifier(String sourceDBSnapshotIdentifier) {
        setSourceDBSnapshotIdentifier(sourceDBSnapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier for the copied snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cannot be null, empty, or blank
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 255 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-db-snapshot</code>
     * </p>
     * 
     * @param targetDBSnapshotIdentifier
     *        The identifier for the copied snapshot.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Cannot be null, empty, or blank
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain from 1 to 255 alphanumeric characters or hyphens
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>my-db-snapshot</code>
     */

    public void setTargetDBSnapshotIdentifier(String targetDBSnapshotIdentifier) {
        this.targetDBSnapshotIdentifier = targetDBSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier for the copied snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cannot be null, empty, or blank
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 255 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-db-snapshot</code>
     * </p>
     * 
     * @return The identifier for the copied snapshot.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Cannot be null, empty, or blank
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must contain from 1 to 255 alphanumeric characters or hyphens
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot end with a hyphen or contain two consecutive hyphens
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>my-db-snapshot</code>
     */

    public String getTargetDBSnapshotIdentifier() {
        return this.targetDBSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier for the copied snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cannot be null, empty, or blank
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 255 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-db-snapshot</code>
     * </p>
     * 
     * @param targetDBSnapshotIdentifier
     *        The identifier for the copied snapshot.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Cannot be null, empty, or blank
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain from 1 to 255 alphanumeric characters or hyphens
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>my-db-snapshot</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDBSnapshotRequest withTargetDBSnapshotIdentifier(String targetDBSnapshotIdentifier) {
        setTargetDBSnapshotIdentifier(targetDBSnapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key identifier for an encrypted DB snapshot. The KMS key identifier is
     * the Amazon Resource Name (ARN) or the KMS key alias for the KMS encryption key.
     * </p>
     * <p>
     * If you copy an unencrypted DB snapshot and specify a value for the <code>KmsKeyId</code> parameter, Amazon RDS
     * encrypts the target DB snapshot using the specified KMS encryption key.
     * </p>
     * <p>
     * If you copy an encrypted DB snapshot from your AWS account, you can specify a value for <code>KmsKeyId</code> to
     * encrypt the copy with a new KMS encryption key. If you don't specify a value for <code>KmsKeyId</code> then the
     * copy of the DB snapshot is encrypted with the same KMS key as the source DB snapshot.
     * </p>
     * <p>
     * If you copy an encrypted DB snapshot that is shared from another AWS account, then you must specify a value for
     * <code>KmsKeyId</code>.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS Key Management Service (AWS KMS) key identifier for an encrypted DB snapshot. The KMS key
     *        identifier is the Amazon Resource Name (ARN) or the KMS key alias for the KMS encryption key.</p>
     *        <p>
     *        If you copy an unencrypted DB snapshot and specify a value for the <code>KmsKeyId</code> parameter, Amazon
     *        RDS encrypts the target DB snapshot using the specified KMS encryption key.
     *        </p>
     *        <p>
     *        If you copy an encrypted DB snapshot from your AWS account, you can specify a value for
     *        <code>KmsKeyId</code> to encrypt the copy with a new KMS encryption key. If you don't specify a value for
     *        <code>KmsKeyId</code> then the copy of the DB snapshot is encrypted with the same KMS key as the source DB
     *        snapshot.
     *        </p>
     *        <p>
     *        If you copy an encrypted DB snapshot that is shared from another AWS account, then you must specify a
     *        value for <code>KmsKeyId</code>.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key identifier for an encrypted DB snapshot. The KMS key identifier is
     * the Amazon Resource Name (ARN) or the KMS key alias for the KMS encryption key.
     * </p>
     * <p>
     * If you copy an unencrypted DB snapshot and specify a value for the <code>KmsKeyId</code> parameter, Amazon RDS
     * encrypts the target DB snapshot using the specified KMS encryption key.
     * </p>
     * <p>
     * If you copy an encrypted DB snapshot from your AWS account, you can specify a value for <code>KmsKeyId</code> to
     * encrypt the copy with a new KMS encryption key. If you don't specify a value for <code>KmsKeyId</code> then the
     * copy of the DB snapshot is encrypted with the same KMS key as the source DB snapshot.
     * </p>
     * <p>
     * If you copy an encrypted DB snapshot that is shared from another AWS account, then you must specify a value for
     * <code>KmsKeyId</code>.
     * </p>
     * 
     * @return The AWS Key Management Service (AWS KMS) key identifier for an encrypted DB snapshot. The KMS key
     *         identifier is the Amazon Resource Name (ARN) or the KMS key alias for the KMS encryption key.</p>
     *         <p>
     *         If you copy an unencrypted DB snapshot and specify a value for the <code>KmsKeyId</code> parameter,
     *         Amazon RDS encrypts the target DB snapshot using the specified KMS encryption key.
     *         </p>
     *         <p>
     *         If you copy an encrypted DB snapshot from your AWS account, you can specify a value for
     *         <code>KmsKeyId</code> to encrypt the copy with a new KMS encryption key. If you don't specify a value for
     *         <code>KmsKeyId</code> then the copy of the DB snapshot is encrypted with the same KMS key as the source
     *         DB snapshot.
     *         </p>
     *         <p>
     *         If you copy an encrypted DB snapshot that is shared from another AWS account, then you must specify a
     *         value for <code>KmsKeyId</code>.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key identifier for an encrypted DB snapshot. The KMS key identifier is
     * the Amazon Resource Name (ARN) or the KMS key alias for the KMS encryption key.
     * </p>
     * <p>
     * If you copy an unencrypted DB snapshot and specify a value for the <code>KmsKeyId</code> parameter, Amazon RDS
     * encrypts the target DB snapshot using the specified KMS encryption key.
     * </p>
     * <p>
     * If you copy an encrypted DB snapshot from your AWS account, you can specify a value for <code>KmsKeyId</code> to
     * encrypt the copy with a new KMS encryption key. If you don't specify a value for <code>KmsKeyId</code> then the
     * copy of the DB snapshot is encrypted with the same KMS key as the source DB snapshot.
     * </p>
     * <p>
     * If you copy an encrypted DB snapshot that is shared from another AWS account, then you must specify a value for
     * <code>KmsKeyId</code>.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS Key Management Service (AWS KMS) key identifier for an encrypted DB snapshot. The KMS key
     *        identifier is the Amazon Resource Name (ARN) or the KMS key alias for the KMS encryption key.</p>
     *        <p>
     *        If you copy an unencrypted DB snapshot and specify a value for the <code>KmsKeyId</code> parameter, Amazon
     *        RDS encrypts the target DB snapshot using the specified KMS encryption key.
     *        </p>
     *        <p>
     *        If you copy an encrypted DB snapshot from your AWS account, you can specify a value for
     *        <code>KmsKeyId</code> to encrypt the copy with a new KMS encryption key. If you don't specify a value for
     *        <code>KmsKeyId</code> then the copy of the DB snapshot is encrypted with the same KMS key as the source DB
     *        snapshot.
     *        </p>
     *        <p>
     *        If you copy an encrypted DB snapshot that is shared from another AWS account, then you must specify a
     *        value for <code>KmsKeyId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDBSnapshotRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * @param tags
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
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDBSnapshotRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDBSnapshotRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * True to copy all tags from the source DB snapshot to the target DB snapshot; otherwise false. The default is
     * false.
     * </p>
     * 
     * @param copyTags
     *        True to copy all tags from the source DB snapshot to the target DB snapshot; otherwise false. The default
     *        is false.
     */

    public void setCopyTags(Boolean copyTags) {
        this.copyTags = copyTags;
    }

    /**
     * <p>
     * True to copy all tags from the source DB snapshot to the target DB snapshot; otherwise false. The default is
     * false.
     * </p>
     * 
     * @return True to copy all tags from the source DB snapshot to the target DB snapshot; otherwise false. The default
     *         is false.
     */

    public Boolean getCopyTags() {
        return this.copyTags;
    }

    /**
     * <p>
     * True to copy all tags from the source DB snapshot to the target DB snapshot; otherwise false. The default is
     * false.
     * </p>
     * 
     * @param copyTags
     *        True to copy all tags from the source DB snapshot to the target DB snapshot; otherwise false. The default
     *        is false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDBSnapshotRequest withCopyTags(Boolean copyTags) {
        setCopyTags(copyTags);
        return this;
    }

    /**
     * <p>
     * True to copy all tags from the source DB snapshot to the target DB snapshot; otherwise false. The default is
     * false.
     * </p>
     * 
     * @return True to copy all tags from the source DB snapshot to the target DB snapshot; otherwise false. The default
     *         is false.
     */

    public Boolean isCopyTags() {
        return this.copyTags;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSourceDBSnapshotIdentifier() != null)
            sb.append("SourceDBSnapshotIdentifier: " + getSourceDBSnapshotIdentifier() + ",");
        if (getTargetDBSnapshotIdentifier() != null)
            sb.append("TargetDBSnapshotIdentifier: " + getTargetDBSnapshotIdentifier() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getCopyTags() != null)
            sb.append("CopyTags: " + getCopyTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyDBSnapshotRequest == false)
            return false;
        CopyDBSnapshotRequest other = (CopyDBSnapshotRequest) obj;
        if (other.getSourceDBSnapshotIdentifier() == null ^ this.getSourceDBSnapshotIdentifier() == null)
            return false;
        if (other.getSourceDBSnapshotIdentifier() != null && other.getSourceDBSnapshotIdentifier().equals(this.getSourceDBSnapshotIdentifier()) == false)
            return false;
        if (other.getTargetDBSnapshotIdentifier() == null ^ this.getTargetDBSnapshotIdentifier() == null)
            return false;
        if (other.getTargetDBSnapshotIdentifier() != null && other.getTargetDBSnapshotIdentifier().equals(this.getTargetDBSnapshotIdentifier()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getCopyTags() == null ^ this.getCopyTags() == null)
            return false;
        if (other.getCopyTags() != null && other.getCopyTags().equals(this.getCopyTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceDBSnapshotIdentifier() == null) ? 0 : getSourceDBSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTargetDBSnapshotIdentifier() == null) ? 0 : getTargetDBSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getCopyTags() == null) ? 0 : getCopyTags().hashCode());
        return hashCode;
    }

    @Override
    public CopyDBSnapshotRequest clone() {
        return (CopyDBSnapshotRequest) super.clone();
    }
}
