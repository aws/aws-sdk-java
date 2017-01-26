/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CopyDBSnapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyDBSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the source DB snapshot.
     * </p>
     * <p>
     * If you are copying from a shared manual DB snapshot, this must be the ARN of the shared DB snapshot.
     * </p>
     * <p>
     * You cannot copy an encrypted, shared DB snapshot from one AWS region to another.
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
     * Example: <code>arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20130805</code>
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
     * The AWS KMS key ID for an encrypted DB snapshot. The KMS key ID is the Amazon Resource Name (ARN), KMS key
     * identifier, or the KMS key alias for the KMS encryption key.
     * </p>
     * <p>
     * If you copy an unencrypted DB snapshot and specify a value for the <code>KmsKeyId</code> parameter, Amazon RDS
     * encrypts the target DB snapshot using the specified KMS encryption key.
     * </p>
     * <p>
     * If you copy an encrypted DB snapshot from your AWS account, you can specify a value for <code>KmsKeyId</code> to
     * encrypt the copy with a new KMS encryption key. If you don't specify a value for <code>KmsKeyId</code>, then the
     * copy of the DB snapshot is encrypted with the same KMS key as the source DB snapshot.
     * </p>
     * <p>
     * If you copy an encrypted snapshot to a different AWS region, then you must specify a KMS key for the destination
     * AWS region.
     * </p>
     * <p>
     * If you copy an encrypted DB snapshot that is shared from another AWS account, then you must specify a value for
     * <code>KmsKeyId</code>.
     * </p>
     * <p>
     * To copy an encrypted DB snapshot to another region, you must set <code>KmsKeyId</code> to the KMS key ID used to
     * encrypt the copy of the DB snapshot in the destination region. KMS encryption keys are specific to the region
     * that they are created in, and you cannot use encryption keys from one region in another region.
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
     * The URL that contains a Signature Version 4 signed request for the <code>CopyDBSnapshot</code> API action in the
     * AWS region that contains the source DB snapshot to copy. The <code>PreSignedUrl</code> parameter must be used
     * when copying an encrypted DB snapshot from another AWS region.
     * </p>
     * <p>
     * The presigned URL must be a valid request for the <code>CopyDBSnapshot</code> API action that can be executed in
     * the source region that contains the encrypted DB snapshot to be copied. The presigned URL request must contain
     * the following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The AWS Region that the encrypted DB snapshot will be copied to. This region is
     * the same one where the <code>CopyDBSnapshot</code> action is called that contains this presigned URL.
     * </p>
     * <p>
     * For example, if you copy an encrypted DB snapshot from the us-west-2 region to the us-east-1 region, then you
     * will call the <code>CopyDBSnapshot</code> action in the us-east-1 region and provide a presigned URL that
     * contains a call to the <code>CopyDBSnapshot</code> action in the us-west-2 region. For this example, the
     * <code>DestinationRegion</code> in the presigned URL must be set to the us-east-1 region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The KMS key identifier for the key to use to encrypt the copy of the DB snapshot in the
     * destination region. This is the same identifier for both the <code>CopyDBSnapshot</code> action that is called in
     * the destination region, and the action contained in the presigned URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBSnapshotIdentifier</code> - The DB snapshot identifier for the encrypted snapshot to be copied.
     * This identifier must be in the Amazon Resource Name (ARN) format for the source region. For example, if you are
     * copying an encrypted DB snapshot from the us-west-2 region, then your <code>SourceDBSnapshotIdentifier</code>
     * would look like Example:
     * <code>arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20161115</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"> Authenticating Requests:
     * Using Query Parameters (AWS Signature Version 4)</a> and <a
     * href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing
     * Process</a>.
     * </p>
     */
    private String preSignedUrl;
    /** The region where the source snapshot is located. */
    private String sourceRegion;

    /**
     * <p>
     * The identifier for the source DB snapshot.
     * </p>
     * <p>
     * If you are copying from a shared manual DB snapshot, this must be the ARN of the shared DB snapshot.
     * </p>
     * <p>
     * You cannot copy an encrypted, shared DB snapshot from one AWS region to another.
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
     * Example: <code>arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20130805</code>
     * </p>
     * 
     * @param sourceDBSnapshotIdentifier
     *        The identifier for the source DB snapshot.</p>
     *        <p>
     *        If you are copying from a shared manual DB snapshot, this must be the ARN of the shared DB snapshot.
     *        </p>
     *        <p>
     *        You cannot copy an encrypted, shared DB snapshot from one AWS region to another.
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
     *        Example: <code>arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20130805</code>
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
     * You cannot copy an encrypted, shared DB snapshot from one AWS region to another.
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
     * Example: <code>arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20130805</code>
     * </p>
     * 
     * @return The identifier for the source DB snapshot.</p>
     *         <p>
     *         If you are copying from a shared manual DB snapshot, this must be the ARN of the shared DB snapshot.
     *         </p>
     *         <p>
     *         You cannot copy an encrypted, shared DB snapshot from one AWS region to another.
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
     *         Example: <code>arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20130805</code>
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
     * You cannot copy an encrypted, shared DB snapshot from one AWS region to another.
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
     * Example: <code>arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20130805</code>
     * </p>
     * 
     * @param sourceDBSnapshotIdentifier
     *        The identifier for the source DB snapshot.</p>
     *        <p>
     *        If you are copying from a shared manual DB snapshot, this must be the ARN of the shared DB snapshot.
     *        </p>
     *        <p>
     *        You cannot copy an encrypted, shared DB snapshot from one AWS region to another.
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
     *        Example: <code>arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20130805</code>
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
     * The AWS KMS key ID for an encrypted DB snapshot. The KMS key ID is the Amazon Resource Name (ARN), KMS key
     * identifier, or the KMS key alias for the KMS encryption key.
     * </p>
     * <p>
     * If you copy an unencrypted DB snapshot and specify a value for the <code>KmsKeyId</code> parameter, Amazon RDS
     * encrypts the target DB snapshot using the specified KMS encryption key.
     * </p>
     * <p>
     * If you copy an encrypted DB snapshot from your AWS account, you can specify a value for <code>KmsKeyId</code> to
     * encrypt the copy with a new KMS encryption key. If you don't specify a value for <code>KmsKeyId</code>, then the
     * copy of the DB snapshot is encrypted with the same KMS key as the source DB snapshot.
     * </p>
     * <p>
     * If you copy an encrypted snapshot to a different AWS region, then you must specify a KMS key for the destination
     * AWS region.
     * </p>
     * <p>
     * If you copy an encrypted DB snapshot that is shared from another AWS account, then you must specify a value for
     * <code>KmsKeyId</code>.
     * </p>
     * <p>
     * To copy an encrypted DB snapshot to another region, you must set <code>KmsKeyId</code> to the KMS key ID used to
     * encrypt the copy of the DB snapshot in the destination region. KMS encryption keys are specific to the region
     * that they are created in, and you cannot use encryption keys from one region in another region.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS KMS key ID for an encrypted DB snapshot. The KMS key ID is the Amazon Resource Name (ARN), KMS key
     *        identifier, or the KMS key alias for the KMS encryption key. </p>
     *        <p>
     *        If you copy an unencrypted DB snapshot and specify a value for the <code>KmsKeyId</code> parameter, Amazon
     *        RDS encrypts the target DB snapshot using the specified KMS encryption key.
     *        </p>
     *        <p>
     *        If you copy an encrypted DB snapshot from your AWS account, you can specify a value for
     *        <code>KmsKeyId</code> to encrypt the copy with a new KMS encryption key. If you don't specify a value for
     *        <code>KmsKeyId</code>, then the copy of the DB snapshot is encrypted with the same KMS key as the source
     *        DB snapshot.
     *        </p>
     *        <p>
     *        If you copy an encrypted snapshot to a different AWS region, then you must specify a KMS key for the
     *        destination AWS region.
     *        </p>
     *        <p>
     *        If you copy an encrypted DB snapshot that is shared from another AWS account, then you must specify a
     *        value for <code>KmsKeyId</code>.
     *        </p>
     *        <p>
     *        To copy an encrypted DB snapshot to another region, you must set <code>KmsKeyId</code> to the KMS key ID
     *        used to encrypt the copy of the DB snapshot in the destination region. KMS encryption keys are specific to
     *        the region that they are created in, and you cannot use encryption keys from one region in another region.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key ID for an encrypted DB snapshot. The KMS key ID is the Amazon Resource Name (ARN), KMS key
     * identifier, or the KMS key alias for the KMS encryption key.
     * </p>
     * <p>
     * If you copy an unencrypted DB snapshot and specify a value for the <code>KmsKeyId</code> parameter, Amazon RDS
     * encrypts the target DB snapshot using the specified KMS encryption key.
     * </p>
     * <p>
     * If you copy an encrypted DB snapshot from your AWS account, you can specify a value for <code>KmsKeyId</code> to
     * encrypt the copy with a new KMS encryption key. If you don't specify a value for <code>KmsKeyId</code>, then the
     * copy of the DB snapshot is encrypted with the same KMS key as the source DB snapshot.
     * </p>
     * <p>
     * If you copy an encrypted snapshot to a different AWS region, then you must specify a KMS key for the destination
     * AWS region.
     * </p>
     * <p>
     * If you copy an encrypted DB snapshot that is shared from another AWS account, then you must specify a value for
     * <code>KmsKeyId</code>.
     * </p>
     * <p>
     * To copy an encrypted DB snapshot to another region, you must set <code>KmsKeyId</code> to the KMS key ID used to
     * encrypt the copy of the DB snapshot in the destination region. KMS encryption keys are specific to the region
     * that they are created in, and you cannot use encryption keys from one region in another region.
     * </p>
     * 
     * @return The AWS KMS key ID for an encrypted DB snapshot. The KMS key ID is the Amazon Resource Name (ARN), KMS
     *         key identifier, or the KMS key alias for the KMS encryption key. </p>
     *         <p>
     *         If you copy an unencrypted DB snapshot and specify a value for the <code>KmsKeyId</code> parameter,
     *         Amazon RDS encrypts the target DB snapshot using the specified KMS encryption key.
     *         </p>
     *         <p>
     *         If you copy an encrypted DB snapshot from your AWS account, you can specify a value for
     *         <code>KmsKeyId</code> to encrypt the copy with a new KMS encryption key. If you don't specify a value for
     *         <code>KmsKeyId</code>, then the copy of the DB snapshot is encrypted with the same KMS key as the source
     *         DB snapshot.
     *         </p>
     *         <p>
     *         If you copy an encrypted snapshot to a different AWS region, then you must specify a KMS key for the
     *         destination AWS region.
     *         </p>
     *         <p>
     *         If you copy an encrypted DB snapshot that is shared from another AWS account, then you must specify a
     *         value for <code>KmsKeyId</code>.
     *         </p>
     *         <p>
     *         To copy an encrypted DB snapshot to another region, you must set <code>KmsKeyId</code> to the KMS key ID
     *         used to encrypt the copy of the DB snapshot in the destination region. KMS encryption keys are specific
     *         to the region that they are created in, and you cannot use encryption keys from one region in another
     *         region.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key ID for an encrypted DB snapshot. The KMS key ID is the Amazon Resource Name (ARN), KMS key
     * identifier, or the KMS key alias for the KMS encryption key.
     * </p>
     * <p>
     * If you copy an unencrypted DB snapshot and specify a value for the <code>KmsKeyId</code> parameter, Amazon RDS
     * encrypts the target DB snapshot using the specified KMS encryption key.
     * </p>
     * <p>
     * If you copy an encrypted DB snapshot from your AWS account, you can specify a value for <code>KmsKeyId</code> to
     * encrypt the copy with a new KMS encryption key. If you don't specify a value for <code>KmsKeyId</code>, then the
     * copy of the DB snapshot is encrypted with the same KMS key as the source DB snapshot.
     * </p>
     * <p>
     * If you copy an encrypted snapshot to a different AWS region, then you must specify a KMS key for the destination
     * AWS region.
     * </p>
     * <p>
     * If you copy an encrypted DB snapshot that is shared from another AWS account, then you must specify a value for
     * <code>KmsKeyId</code>.
     * </p>
     * <p>
     * To copy an encrypted DB snapshot to another region, you must set <code>KmsKeyId</code> to the KMS key ID used to
     * encrypt the copy of the DB snapshot in the destination region. KMS encryption keys are specific to the region
     * that they are created in, and you cannot use encryption keys from one region in another region.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS KMS key ID for an encrypted DB snapshot. The KMS key ID is the Amazon Resource Name (ARN), KMS key
     *        identifier, or the KMS key alias for the KMS encryption key. </p>
     *        <p>
     *        If you copy an unencrypted DB snapshot and specify a value for the <code>KmsKeyId</code> parameter, Amazon
     *        RDS encrypts the target DB snapshot using the specified KMS encryption key.
     *        </p>
     *        <p>
     *        If you copy an encrypted DB snapshot from your AWS account, you can specify a value for
     *        <code>KmsKeyId</code> to encrypt the copy with a new KMS encryption key. If you don't specify a value for
     *        <code>KmsKeyId</code>, then the copy of the DB snapshot is encrypted with the same KMS key as the source
     *        DB snapshot.
     *        </p>
     *        <p>
     *        If you copy an encrypted snapshot to a different AWS region, then you must specify a KMS key for the
     *        destination AWS region.
     *        </p>
     *        <p>
     *        If you copy an encrypted DB snapshot that is shared from another AWS account, then you must specify a
     *        value for <code>KmsKeyId</code>.
     *        </p>
     *        <p>
     *        To copy an encrypted DB snapshot to another region, you must set <code>KmsKeyId</code> to the KMS key ID
     *        used to encrypt the copy of the DB snapshot in the destination region. KMS encryption keys are specific to
     *        the region that they are created in, and you cannot use encryption keys from one region in another region.
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
     * <p>
     * The URL that contains a Signature Version 4 signed request for the <code>CopyDBSnapshot</code> API action in the
     * AWS region that contains the source DB snapshot to copy. The <code>PreSignedUrl</code> parameter must be used
     * when copying an encrypted DB snapshot from another AWS region.
     * </p>
     * <p>
     * The presigned URL must be a valid request for the <code>CopyDBSnapshot</code> API action that can be executed in
     * the source region that contains the encrypted DB snapshot to be copied. The presigned URL request must contain
     * the following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The AWS Region that the encrypted DB snapshot will be copied to. This region is
     * the same one where the <code>CopyDBSnapshot</code> action is called that contains this presigned URL.
     * </p>
     * <p>
     * For example, if you copy an encrypted DB snapshot from the us-west-2 region to the us-east-1 region, then you
     * will call the <code>CopyDBSnapshot</code> action in the us-east-1 region and provide a presigned URL that
     * contains a call to the <code>CopyDBSnapshot</code> action in the us-west-2 region. For this example, the
     * <code>DestinationRegion</code> in the presigned URL must be set to the us-east-1 region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The KMS key identifier for the key to use to encrypt the copy of the DB snapshot in the
     * destination region. This is the same identifier for both the <code>CopyDBSnapshot</code> action that is called in
     * the destination region, and the action contained in the presigned URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBSnapshotIdentifier</code> - The DB snapshot identifier for the encrypted snapshot to be copied.
     * This identifier must be in the Amazon Resource Name (ARN) format for the source region. For example, if you are
     * copying an encrypted DB snapshot from the us-west-2 region, then your <code>SourceDBSnapshotIdentifier</code>
     * would look like Example:
     * <code>arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20161115</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"> Authenticating Requests:
     * Using Query Parameters (AWS Signature Version 4)</a> and <a
     * href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing
     * Process</a>.
     * </p>
     * 
     * @param preSignedUrl
     *        The URL that contains a Signature Version 4 signed request for the <code>CopyDBSnapshot</code> API action
     *        in the AWS region that contains the source DB snapshot to copy. The <code>PreSignedUrl</code> parameter
     *        must be used when copying an encrypted DB snapshot from another AWS region.</p>
     *        <p>
     *        The presigned URL must be a valid request for the <code>CopyDBSnapshot</code> API action that can be
     *        executed in the source region that contains the encrypted DB snapshot to be copied. The presigned URL
     *        request must contain the following parameter values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DestinationRegion</code> - The AWS Region that the encrypted DB snapshot will be copied to. This
     *        region is the same one where the <code>CopyDBSnapshot</code> action is called that contains this presigned
     *        URL.
     *        </p>
     *        <p>
     *        For example, if you copy an encrypted DB snapshot from the us-west-2 region to the us-east-1 region, then
     *        you will call the <code>CopyDBSnapshot</code> action in the us-east-1 region and provide a presigned URL
     *        that contains a call to the <code>CopyDBSnapshot</code> action in the us-west-2 region. For this example,
     *        the <code>DestinationRegion</code> in the presigned URL must be set to the us-east-1 region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KmsKeyId</code> - The KMS key identifier for the key to use to encrypt the copy of the DB snapshot
     *        in the destination region. This is the same identifier for both the <code>CopyDBSnapshot</code> action
     *        that is called in the destination region, and the action contained in the presigned URL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SourceDBSnapshotIdentifier</code> - The DB snapshot identifier for the encrypted snapshot to be
     *        copied. This identifier must be in the Amazon Resource Name (ARN) format for the source region. For
     *        example, if you are copying an encrypted DB snapshot from the us-west-2 region, then your
     *        <code>SourceDBSnapshotIdentifier</code> would look like Example:
     *        <code>arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20161115</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To learn how to generate a Signature Version 4 signed request, see <a
     *        href="http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"> Authenticating
     *        Requests: Using Query Parameters (AWS Signature Version 4)</a> and <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing
     *        Process</a>.
     */

    public void setPreSignedUrl(String preSignedUrl) {
        this.preSignedUrl = preSignedUrl;
    }

    /**
     * <p>
     * The URL that contains a Signature Version 4 signed request for the <code>CopyDBSnapshot</code> API action in the
     * AWS region that contains the source DB snapshot to copy. The <code>PreSignedUrl</code> parameter must be used
     * when copying an encrypted DB snapshot from another AWS region.
     * </p>
     * <p>
     * The presigned URL must be a valid request for the <code>CopyDBSnapshot</code> API action that can be executed in
     * the source region that contains the encrypted DB snapshot to be copied. The presigned URL request must contain
     * the following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The AWS Region that the encrypted DB snapshot will be copied to. This region is
     * the same one where the <code>CopyDBSnapshot</code> action is called that contains this presigned URL.
     * </p>
     * <p>
     * For example, if you copy an encrypted DB snapshot from the us-west-2 region to the us-east-1 region, then you
     * will call the <code>CopyDBSnapshot</code> action in the us-east-1 region and provide a presigned URL that
     * contains a call to the <code>CopyDBSnapshot</code> action in the us-west-2 region. For this example, the
     * <code>DestinationRegion</code> in the presigned URL must be set to the us-east-1 region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The KMS key identifier for the key to use to encrypt the copy of the DB snapshot in the
     * destination region. This is the same identifier for both the <code>CopyDBSnapshot</code> action that is called in
     * the destination region, and the action contained in the presigned URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBSnapshotIdentifier</code> - The DB snapshot identifier for the encrypted snapshot to be copied.
     * This identifier must be in the Amazon Resource Name (ARN) format for the source region. For example, if you are
     * copying an encrypted DB snapshot from the us-west-2 region, then your <code>SourceDBSnapshotIdentifier</code>
     * would look like Example:
     * <code>arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20161115</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"> Authenticating Requests:
     * Using Query Parameters (AWS Signature Version 4)</a> and <a
     * href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing
     * Process</a>.
     * </p>
     * 
     * @return The URL that contains a Signature Version 4 signed request for the <code>CopyDBSnapshot</code> API action
     *         in the AWS region that contains the source DB snapshot to copy. The <code>PreSignedUrl</code> parameter
     *         must be used when copying an encrypted DB snapshot from another AWS region.</p>
     *         <p>
     *         The presigned URL must be a valid request for the <code>CopyDBSnapshot</code> API action that can be
     *         executed in the source region that contains the encrypted DB snapshot to be copied. The presigned URL
     *         request must contain the following parameter values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DestinationRegion</code> - The AWS Region that the encrypted DB snapshot will be copied to. This
     *         region is the same one where the <code>CopyDBSnapshot</code> action is called that contains this
     *         presigned URL.
     *         </p>
     *         <p>
     *         For example, if you copy an encrypted DB snapshot from the us-west-2 region to the us-east-1 region, then
     *         you will call the <code>CopyDBSnapshot</code> action in the us-east-1 region and provide a presigned URL
     *         that contains a call to the <code>CopyDBSnapshot</code> action in the us-west-2 region. For this example,
     *         the <code>DestinationRegion</code> in the presigned URL must be set to the us-east-1 region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>KmsKeyId</code> - The KMS key identifier for the key to use to encrypt the copy of the DB snapshot
     *         in the destination region. This is the same identifier for both the <code>CopyDBSnapshot</code> action
     *         that is called in the destination region, and the action contained in the presigned URL.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SourceDBSnapshotIdentifier</code> - The DB snapshot identifier for the encrypted snapshot to be
     *         copied. This identifier must be in the Amazon Resource Name (ARN) format for the source region. For
     *         example, if you are copying an encrypted DB snapshot from the us-west-2 region, then your
     *         <code>SourceDBSnapshotIdentifier</code> would look like Example:
     *         <code>arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20161115</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To learn how to generate a Signature Version 4 signed request, see <a
     *         href="http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"> Authenticating
     *         Requests: Using Query Parameters (AWS Signature Version 4)</a> and <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing
     *         Process</a>.
     */

    public String getPreSignedUrl() {
        return this.preSignedUrl;
    }

    /**
     * <p>
     * The URL that contains a Signature Version 4 signed request for the <code>CopyDBSnapshot</code> API action in the
     * AWS region that contains the source DB snapshot to copy. The <code>PreSignedUrl</code> parameter must be used
     * when copying an encrypted DB snapshot from another AWS region.
     * </p>
     * <p>
     * The presigned URL must be a valid request for the <code>CopyDBSnapshot</code> API action that can be executed in
     * the source region that contains the encrypted DB snapshot to be copied. The presigned URL request must contain
     * the following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The AWS Region that the encrypted DB snapshot will be copied to. This region is
     * the same one where the <code>CopyDBSnapshot</code> action is called that contains this presigned URL.
     * </p>
     * <p>
     * For example, if you copy an encrypted DB snapshot from the us-west-2 region to the us-east-1 region, then you
     * will call the <code>CopyDBSnapshot</code> action in the us-east-1 region and provide a presigned URL that
     * contains a call to the <code>CopyDBSnapshot</code> action in the us-west-2 region. For this example, the
     * <code>DestinationRegion</code> in the presigned URL must be set to the us-east-1 region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The KMS key identifier for the key to use to encrypt the copy of the DB snapshot in the
     * destination region. This is the same identifier for both the <code>CopyDBSnapshot</code> action that is called in
     * the destination region, and the action contained in the presigned URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBSnapshotIdentifier</code> - The DB snapshot identifier for the encrypted snapshot to be copied.
     * This identifier must be in the Amazon Resource Name (ARN) format for the source region. For example, if you are
     * copying an encrypted DB snapshot from the us-west-2 region, then your <code>SourceDBSnapshotIdentifier</code>
     * would look like Example:
     * <code>arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20161115</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"> Authenticating Requests:
     * Using Query Parameters (AWS Signature Version 4)</a> and <a
     * href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing
     * Process</a>.
     * </p>
     * 
     * @param preSignedUrl
     *        The URL that contains a Signature Version 4 signed request for the <code>CopyDBSnapshot</code> API action
     *        in the AWS region that contains the source DB snapshot to copy. The <code>PreSignedUrl</code> parameter
     *        must be used when copying an encrypted DB snapshot from another AWS region.</p>
     *        <p>
     *        The presigned URL must be a valid request for the <code>CopyDBSnapshot</code> API action that can be
     *        executed in the source region that contains the encrypted DB snapshot to be copied. The presigned URL
     *        request must contain the following parameter values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DestinationRegion</code> - The AWS Region that the encrypted DB snapshot will be copied to. This
     *        region is the same one where the <code>CopyDBSnapshot</code> action is called that contains this presigned
     *        URL.
     *        </p>
     *        <p>
     *        For example, if you copy an encrypted DB snapshot from the us-west-2 region to the us-east-1 region, then
     *        you will call the <code>CopyDBSnapshot</code> action in the us-east-1 region and provide a presigned URL
     *        that contains a call to the <code>CopyDBSnapshot</code> action in the us-west-2 region. For this example,
     *        the <code>DestinationRegion</code> in the presigned URL must be set to the us-east-1 region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KmsKeyId</code> - The KMS key identifier for the key to use to encrypt the copy of the DB snapshot
     *        in the destination region. This is the same identifier for both the <code>CopyDBSnapshot</code> action
     *        that is called in the destination region, and the action contained in the presigned URL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SourceDBSnapshotIdentifier</code> - The DB snapshot identifier for the encrypted snapshot to be
     *        copied. This identifier must be in the Amazon Resource Name (ARN) format for the source region. For
     *        example, if you are copying an encrypted DB snapshot from the us-west-2 region, then your
     *        <code>SourceDBSnapshotIdentifier</code> would look like Example:
     *        <code>arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20161115</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To learn how to generate a Signature Version 4 signed request, see <a
     *        href="http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"> Authenticating
     *        Requests: Using Query Parameters (AWS Signature Version 4)</a> and <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing
     *        Process</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDBSnapshotRequest withPreSignedUrl(String preSignedUrl) {
        setPreSignedUrl(preSignedUrl);
        return this;
    }

    /**
     * The region where the source snapshot is located.
     * 
     * @param sourceRegion
     *        The region where the source snapshot is located.
     */

    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    /**
     * The region where the source snapshot is located.
     * 
     * @return The region where the source snapshot is located.
     */

    public String getSourceRegion() {
        return this.sourceRegion;
    }

    /**
     * The region where the source snapshot is located.
     * 
     * @param sourceRegion
     *        The region where the source snapshot is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDBSnapshotRequest withSourceRegion(String sourceRegion) {
        setSourceRegion(sourceRegion);
        return this;
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
            sb.append("SourceDBSnapshotIdentifier: ").append(getSourceDBSnapshotIdentifier()).append(",");
        if (getTargetDBSnapshotIdentifier() != null)
            sb.append("TargetDBSnapshotIdentifier: ").append(getTargetDBSnapshotIdentifier()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getCopyTags() != null)
            sb.append("CopyTags: ").append(getCopyTags()).append(",");
        if (getPreSignedUrl() != null)
            sb.append("PreSignedUrl: ").append(getPreSignedUrl()).append(",");
        if (getSourceRegion() != null)
            sb.append("SourceRegion: ").append(getSourceRegion());
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
        if (other.getPreSignedUrl() == null ^ this.getPreSignedUrl() == null)
            return false;
        if (other.getPreSignedUrl() != null && other.getPreSignedUrl().equals(this.getPreSignedUrl()) == false)
            return false;
        if (other.getSourceRegion() == null ^ this.getSourceRegion() == null)
            return false;
        if (other.getSourceRegion() != null && other.getSourceRegion().equals(this.getSourceRegion()) == false)
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
        hashCode = prime * hashCode + ((getPreSignedUrl() == null) ? 0 : getPreSignedUrl().hashCode());
        hashCode = prime * hashCode + ((getSourceRegion() == null) ? 0 : getSourceRegion().hashCode());
        return hashCode;
    }

    @Override
    public CopyDBSnapshotRequest clone() {
        return (CopyDBSnapshotRequest) super.clone();
    }

}
