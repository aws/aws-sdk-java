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
package com.amazonaws.services.docdb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input to <a>CopyDBClusterSnapshot</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/CopyDBClusterSnapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyDBClusterSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the cluster snapshot to copy. This parameter is not case sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must specify a valid system snapshot in the <i>available</i> state.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source snapshot is in the same Region as the copy, specify a valid snapshot identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source snapshot is in a different Region than the copy, specify a valid cluster snapshot ARN.
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
     * The identifier of the new cluster snapshot to create from the source cluster snapshot. This parameter is not case
     * sensitive.
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
     * The first character must be a letter.
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
     * The KMS key ID for an encrypted cluster snapshot. The KMS key ID is the Amazon Resource Name (ARN), KMS key
     * identifier, or the KMS key alias for the KMS encryption key.
     * </p>
     * <p>
     * If you copy an encrypted cluster snapshot from your account, you can specify a value for <code>KmsKeyId</code> to
     * encrypt the copy with a new KMS encryption key. If you don't specify a value for <code>KmsKeyId</code>, then the
     * copy of the cluster snapshot is encrypted with the same KMS key as the source cluster snapshot.
     * </p>
     * <p>
     * If you copy an encrypted cluster snapshot that is shared from another account, then you must specify a value for
     * <code>KmsKeyId</code>.
     * </p>
     * <p>
     * To copy an encrypted cluster snapshot to another Region, set <code>KmsKeyId</code> to the KMS key ID that you
     * want to use to encrypt the copy of the cluster snapshot in the destination Region. KMS encryption keys are
     * specific to the Region that they are created in, and you can't use encryption keys from one Region in another
     * Region.
     * </p>
     * <p>
     * If you copy an unencrypted cluster snapshot and specify a value for the <code>KmsKeyId</code> parameter, an error
     * is returned.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The URL that contains a Signature Version 4 signed request for the<code>CopyDBClusterSnapshot</code> API action
     * in the Region that contains the source cluster snapshot to copy. You must use the <code>PreSignedUrl</code>
     * parameter when copying a cluster snapshot from another Region.
     * </p>
     * <p>
     * If you are using an Amazon Web Services SDK tool or the CLI, you can specify <code>SourceRegion</code> (or
     * <code>--source-region</code> for the CLI) instead of specifying <code>PreSignedUrl</code> manually. Specifying
     * <code>SourceRegion</code> autogenerates a pre-signed URL that is a valid request for the operation that can be
     * executed in the source Region.
     * </p>
     * <p>
     * The presigned URL must be a valid request for the <code>CopyDBClusterSnapshot</code> API action that can be
     * executed in the source Region that contains the cluster snapshot to be copied. The presigned URL request must
     * contain the following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SourceRegion</code> - The ID of the region that contains the snapshot to be copied.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBClusterSnapshotIdentifier</code> - The identifier for the the encrypted cluster snapshot to be
     * copied. This identifier must be in the Amazon Resource Name (ARN) format for the source Region. For example, if
     * you are copying an encrypted cluster snapshot from the us-east-1 Region, then your
     * <code>SourceDBClusterSnapshotIdentifier</code> looks something like the following:
     * <code>arn:aws:rds:us-east-1:12345678012:sample-cluster:sample-cluster-snapshot</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TargetDBClusterSnapshotIdentifier</code> - The identifier for the new cluster snapshot to be created. This
     * parameter isn't case sensitive.
     * </p>
     * </li>
     * </ul>
     */
    private String preSignedUrl;
    /**
     * <p>
     * Set to <code>true</code> to copy all tags from the source cluster snapshot to the target cluster snapshot, and
     * otherwise <code>false</code>. The default is <code>false</code>.
     * </p>
     */
    private Boolean copyTags;
    /**
     * <p>
     * The tags to be assigned to the cluster snapshot.
     * </p>
     */
    private java.util.List<Tag> tags;
    /** The region where the source instance is located. */
    private String sourceRegion;

    /**
     * <p>
     * The identifier of the cluster snapshot to copy. This parameter is not case sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must specify a valid system snapshot in the <i>available</i> state.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source snapshot is in the same Region as the copy, specify a valid snapshot identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source snapshot is in a different Region than the copy, specify a valid cluster snapshot ARN.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster-snapshot1</code>
     * </p>
     * 
     * @param sourceDBClusterSnapshotIdentifier
     *        The identifier of the cluster snapshot to copy. This parameter is not case sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must specify a valid system snapshot in the <i>available</i> state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source snapshot is in the same Region as the copy, specify a valid snapshot identifier.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source snapshot is in a different Region than the copy, specify a valid cluster snapshot ARN.
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
     * The identifier of the cluster snapshot to copy. This parameter is not case sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must specify a valid system snapshot in the <i>available</i> state.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source snapshot is in the same Region as the copy, specify a valid snapshot identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source snapshot is in a different Region than the copy, specify a valid cluster snapshot ARN.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster-snapshot1</code>
     * </p>
     * 
     * @return The identifier of the cluster snapshot to copy. This parameter is not case sensitive.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must specify a valid system snapshot in the <i>available</i> state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the source snapshot is in the same Region as the copy, specify a valid snapshot identifier.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the source snapshot is in a different Region than the copy, specify a valid cluster snapshot ARN.
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
     * The identifier of the cluster snapshot to copy. This parameter is not case sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must specify a valid system snapshot in the <i>available</i> state.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source snapshot is in the same Region as the copy, specify a valid snapshot identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source snapshot is in a different Region than the copy, specify a valid cluster snapshot ARN.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster-snapshot1</code>
     * </p>
     * 
     * @param sourceDBClusterSnapshotIdentifier
     *        The identifier of the cluster snapshot to copy. This parameter is not case sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must specify a valid system snapshot in the <i>available</i> state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source snapshot is in the same Region as the copy, specify a valid snapshot identifier.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source snapshot is in a different Region than the copy, specify a valid cluster snapshot ARN.
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
     * The identifier of the new cluster snapshot to create from the source cluster snapshot. This parameter is not case
     * sensitive.
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
     * The first character must be a letter.
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
     *        The identifier of the new cluster snapshot to create from the source cluster snapshot. This parameter is
     *        not case sensitive.</p>
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
     *        The first character must be a letter.
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
     * The identifier of the new cluster snapshot to create from the source cluster snapshot. This parameter is not case
     * sensitive.
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
     * The first character must be a letter.
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
     * @return The identifier of the new cluster snapshot to create from the source cluster snapshot. This parameter is
     *         not case sensitive.</p>
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
     *         The first character must be a letter.
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
     * The identifier of the new cluster snapshot to create from the source cluster snapshot. This parameter is not case
     * sensitive.
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
     * The first character must be a letter.
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
     *        The identifier of the new cluster snapshot to create from the source cluster snapshot. This parameter is
     *        not case sensitive.</p>
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
     *        The first character must be a letter.
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
     * The KMS key ID for an encrypted cluster snapshot. The KMS key ID is the Amazon Resource Name (ARN), KMS key
     * identifier, or the KMS key alias for the KMS encryption key.
     * </p>
     * <p>
     * If you copy an encrypted cluster snapshot from your account, you can specify a value for <code>KmsKeyId</code> to
     * encrypt the copy with a new KMS encryption key. If you don't specify a value for <code>KmsKeyId</code>, then the
     * copy of the cluster snapshot is encrypted with the same KMS key as the source cluster snapshot.
     * </p>
     * <p>
     * If you copy an encrypted cluster snapshot that is shared from another account, then you must specify a value for
     * <code>KmsKeyId</code>.
     * </p>
     * <p>
     * To copy an encrypted cluster snapshot to another Region, set <code>KmsKeyId</code> to the KMS key ID that you
     * want to use to encrypt the copy of the cluster snapshot in the destination Region. KMS encryption keys are
     * specific to the Region that they are created in, and you can't use encryption keys from one Region in another
     * Region.
     * </p>
     * <p>
     * If you copy an unencrypted cluster snapshot and specify a value for the <code>KmsKeyId</code> parameter, an error
     * is returned.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key ID for an encrypted cluster snapshot. The KMS key ID is the Amazon Resource Name (ARN), KMS
     *        key identifier, or the KMS key alias for the KMS encryption key. </p>
     *        <p>
     *        If you copy an encrypted cluster snapshot from your account, you can specify a value for
     *        <code>KmsKeyId</code> to encrypt the copy with a new KMS encryption key. If you don't specify a value for
     *        <code>KmsKeyId</code>, then the copy of the cluster snapshot is encrypted with the same KMS key as the
     *        source cluster snapshot.
     *        </p>
     *        <p>
     *        If you copy an encrypted cluster snapshot that is shared from another account, then you must specify a
     *        value for <code>KmsKeyId</code>.
     *        </p>
     *        <p>
     *        To copy an encrypted cluster snapshot to another Region, set <code>KmsKeyId</code> to the KMS key ID that
     *        you want to use to encrypt the copy of the cluster snapshot in the destination Region. KMS encryption keys
     *        are specific to the Region that they are created in, and you can't use encryption keys from one Region in
     *        another Region.
     *        </p>
     *        <p>
     *        If you copy an unencrypted cluster snapshot and specify a value for the <code>KmsKeyId</code> parameter,
     *        an error is returned.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The KMS key ID for an encrypted cluster snapshot. The KMS key ID is the Amazon Resource Name (ARN), KMS key
     * identifier, or the KMS key alias for the KMS encryption key.
     * </p>
     * <p>
     * If you copy an encrypted cluster snapshot from your account, you can specify a value for <code>KmsKeyId</code> to
     * encrypt the copy with a new KMS encryption key. If you don't specify a value for <code>KmsKeyId</code>, then the
     * copy of the cluster snapshot is encrypted with the same KMS key as the source cluster snapshot.
     * </p>
     * <p>
     * If you copy an encrypted cluster snapshot that is shared from another account, then you must specify a value for
     * <code>KmsKeyId</code>.
     * </p>
     * <p>
     * To copy an encrypted cluster snapshot to another Region, set <code>KmsKeyId</code> to the KMS key ID that you
     * want to use to encrypt the copy of the cluster snapshot in the destination Region. KMS encryption keys are
     * specific to the Region that they are created in, and you can't use encryption keys from one Region in another
     * Region.
     * </p>
     * <p>
     * If you copy an unencrypted cluster snapshot and specify a value for the <code>KmsKeyId</code> parameter, an error
     * is returned.
     * </p>
     * 
     * @return The KMS key ID for an encrypted cluster snapshot. The KMS key ID is the Amazon Resource Name (ARN), KMS
     *         key identifier, or the KMS key alias for the KMS encryption key. </p>
     *         <p>
     *         If you copy an encrypted cluster snapshot from your account, you can specify a value for
     *         <code>KmsKeyId</code> to encrypt the copy with a new KMS encryption key. If you don't specify a value for
     *         <code>KmsKeyId</code>, then the copy of the cluster snapshot is encrypted with the same KMS key as the
     *         source cluster snapshot.
     *         </p>
     *         <p>
     *         If you copy an encrypted cluster snapshot that is shared from another account, then you must specify a
     *         value for <code>KmsKeyId</code>.
     *         </p>
     *         <p>
     *         To copy an encrypted cluster snapshot to another Region, set <code>KmsKeyId</code> to the KMS key ID that
     *         you want to use to encrypt the copy of the cluster snapshot in the destination Region. KMS encryption
     *         keys are specific to the Region that they are created in, and you can't use encryption keys from one
     *         Region in another Region.
     *         </p>
     *         <p>
     *         If you copy an unencrypted cluster snapshot and specify a value for the <code>KmsKeyId</code> parameter,
     *         an error is returned.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The KMS key ID for an encrypted cluster snapshot. The KMS key ID is the Amazon Resource Name (ARN), KMS key
     * identifier, or the KMS key alias for the KMS encryption key.
     * </p>
     * <p>
     * If you copy an encrypted cluster snapshot from your account, you can specify a value for <code>KmsKeyId</code> to
     * encrypt the copy with a new KMS encryption key. If you don't specify a value for <code>KmsKeyId</code>, then the
     * copy of the cluster snapshot is encrypted with the same KMS key as the source cluster snapshot.
     * </p>
     * <p>
     * If you copy an encrypted cluster snapshot that is shared from another account, then you must specify a value for
     * <code>KmsKeyId</code>.
     * </p>
     * <p>
     * To copy an encrypted cluster snapshot to another Region, set <code>KmsKeyId</code> to the KMS key ID that you
     * want to use to encrypt the copy of the cluster snapshot in the destination Region. KMS encryption keys are
     * specific to the Region that they are created in, and you can't use encryption keys from one Region in another
     * Region.
     * </p>
     * <p>
     * If you copy an unencrypted cluster snapshot and specify a value for the <code>KmsKeyId</code> parameter, an error
     * is returned.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key ID for an encrypted cluster snapshot. The KMS key ID is the Amazon Resource Name (ARN), KMS
     *        key identifier, or the KMS key alias for the KMS encryption key. </p>
     *        <p>
     *        If you copy an encrypted cluster snapshot from your account, you can specify a value for
     *        <code>KmsKeyId</code> to encrypt the copy with a new KMS encryption key. If you don't specify a value for
     *        <code>KmsKeyId</code>, then the copy of the cluster snapshot is encrypted with the same KMS key as the
     *        source cluster snapshot.
     *        </p>
     *        <p>
     *        If you copy an encrypted cluster snapshot that is shared from another account, then you must specify a
     *        value for <code>KmsKeyId</code>.
     *        </p>
     *        <p>
     *        To copy an encrypted cluster snapshot to another Region, set <code>KmsKeyId</code> to the KMS key ID that
     *        you want to use to encrypt the copy of the cluster snapshot in the destination Region. KMS encryption keys
     *        are specific to the Region that they are created in, and you can't use encryption keys from one Region in
     *        another Region.
     *        </p>
     *        <p>
     *        If you copy an unencrypted cluster snapshot and specify a value for the <code>KmsKeyId</code> parameter,
     *        an error is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDBClusterSnapshotRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The URL that contains a Signature Version 4 signed request for the<code>CopyDBClusterSnapshot</code> API action
     * in the Region that contains the source cluster snapshot to copy. You must use the <code>PreSignedUrl</code>
     * parameter when copying a cluster snapshot from another Region.
     * </p>
     * <p>
     * If you are using an Amazon Web Services SDK tool or the CLI, you can specify <code>SourceRegion</code> (or
     * <code>--source-region</code> for the CLI) instead of specifying <code>PreSignedUrl</code> manually. Specifying
     * <code>SourceRegion</code> autogenerates a pre-signed URL that is a valid request for the operation that can be
     * executed in the source Region.
     * </p>
     * <p>
     * The presigned URL must be a valid request for the <code>CopyDBClusterSnapshot</code> API action that can be
     * executed in the source Region that contains the cluster snapshot to be copied. The presigned URL request must
     * contain the following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SourceRegion</code> - The ID of the region that contains the snapshot to be copied.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBClusterSnapshotIdentifier</code> - The identifier for the the encrypted cluster snapshot to be
     * copied. This identifier must be in the Amazon Resource Name (ARN) format for the source Region. For example, if
     * you are copying an encrypted cluster snapshot from the us-east-1 Region, then your
     * <code>SourceDBClusterSnapshotIdentifier</code> looks something like the following:
     * <code>arn:aws:rds:us-east-1:12345678012:sample-cluster:sample-cluster-snapshot</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TargetDBClusterSnapshotIdentifier</code> - The identifier for the new cluster snapshot to be created. This
     * parameter isn't case sensitive.
     * </p>
     * </li>
     * </ul>
     * 
     * @param preSignedUrl
     *        The URL that contains a Signature Version 4 signed request for the<code>CopyDBClusterSnapshot</code> API
     *        action in the Region that contains the source cluster snapshot to copy. You must use the
     *        <code>PreSignedUrl</code> parameter when copying a cluster snapshot from another Region.</p>
     *        <p>
     *        If you are using an Amazon Web Services SDK tool or the CLI, you can specify <code>SourceRegion</code> (or
     *        <code>--source-region</code> for the CLI) instead of specifying <code>PreSignedUrl</code> manually.
     *        Specifying <code>SourceRegion</code> autogenerates a pre-signed URL that is a valid request for the
     *        operation that can be executed in the source Region.
     *        </p>
     *        <p>
     *        The presigned URL must be a valid request for the <code>CopyDBClusterSnapshot</code> API action that can
     *        be executed in the source Region that contains the cluster snapshot to be copied. The presigned URL
     *        request must contain the following parameter values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SourceRegion</code> - The ID of the region that contains the snapshot to be copied.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SourceDBClusterSnapshotIdentifier</code> - The identifier for the the encrypted cluster snapshot to
     *        be copied. This identifier must be in the Amazon Resource Name (ARN) format for the source Region. For
     *        example, if you are copying an encrypted cluster snapshot from the us-east-1 Region, then your
     *        <code>SourceDBClusterSnapshotIdentifier</code> looks something like the following:
     *        <code>arn:aws:rds:us-east-1:12345678012:sample-cluster:sample-cluster-snapshot</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TargetDBClusterSnapshotIdentifier</code> - The identifier for the new cluster snapshot to be
     *        created. This parameter isn't case sensitive.
     *        </p>
     *        </li>
     */

    public void setPreSignedUrl(String preSignedUrl) {
        this.preSignedUrl = preSignedUrl;
    }

    /**
     * <p>
     * The URL that contains a Signature Version 4 signed request for the<code>CopyDBClusterSnapshot</code> API action
     * in the Region that contains the source cluster snapshot to copy. You must use the <code>PreSignedUrl</code>
     * parameter when copying a cluster snapshot from another Region.
     * </p>
     * <p>
     * If you are using an Amazon Web Services SDK tool or the CLI, you can specify <code>SourceRegion</code> (or
     * <code>--source-region</code> for the CLI) instead of specifying <code>PreSignedUrl</code> manually. Specifying
     * <code>SourceRegion</code> autogenerates a pre-signed URL that is a valid request for the operation that can be
     * executed in the source Region.
     * </p>
     * <p>
     * The presigned URL must be a valid request for the <code>CopyDBClusterSnapshot</code> API action that can be
     * executed in the source Region that contains the cluster snapshot to be copied. The presigned URL request must
     * contain the following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SourceRegion</code> - The ID of the region that contains the snapshot to be copied.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBClusterSnapshotIdentifier</code> - The identifier for the the encrypted cluster snapshot to be
     * copied. This identifier must be in the Amazon Resource Name (ARN) format for the source Region. For example, if
     * you are copying an encrypted cluster snapshot from the us-east-1 Region, then your
     * <code>SourceDBClusterSnapshotIdentifier</code> looks something like the following:
     * <code>arn:aws:rds:us-east-1:12345678012:sample-cluster:sample-cluster-snapshot</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TargetDBClusterSnapshotIdentifier</code> - The identifier for the new cluster snapshot to be created. This
     * parameter isn't case sensitive.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The URL that contains a Signature Version 4 signed request for the<code>CopyDBClusterSnapshot</code> API
     *         action in the Region that contains the source cluster snapshot to copy. You must use the
     *         <code>PreSignedUrl</code> parameter when copying a cluster snapshot from another Region.</p>
     *         <p>
     *         If you are using an Amazon Web Services SDK tool or the CLI, you can specify <code>SourceRegion</code>
     *         (or <code>--source-region</code> for the CLI) instead of specifying <code>PreSignedUrl</code> manually.
     *         Specifying <code>SourceRegion</code> autogenerates a pre-signed URL that is a valid request for the
     *         operation that can be executed in the source Region.
     *         </p>
     *         <p>
     *         The presigned URL must be a valid request for the <code>CopyDBClusterSnapshot</code> API action that can
     *         be executed in the source Region that contains the cluster snapshot to be copied. The presigned URL
     *         request must contain the following parameter values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SourceRegion</code> - The ID of the region that contains the snapshot to be copied.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SourceDBClusterSnapshotIdentifier</code> - The identifier for the the encrypted cluster snapshot to
     *         be copied. This identifier must be in the Amazon Resource Name (ARN) format for the source Region. For
     *         example, if you are copying an encrypted cluster snapshot from the us-east-1 Region, then your
     *         <code>SourceDBClusterSnapshotIdentifier</code> looks something like the following:
     *         <code>arn:aws:rds:us-east-1:12345678012:sample-cluster:sample-cluster-snapshot</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TargetDBClusterSnapshotIdentifier</code> - The identifier for the new cluster snapshot to be
     *         created. This parameter isn't case sensitive.
     *         </p>
     *         </li>
     */

    public String getPreSignedUrl() {
        return this.preSignedUrl;
    }

    /**
     * <p>
     * The URL that contains a Signature Version 4 signed request for the<code>CopyDBClusterSnapshot</code> API action
     * in the Region that contains the source cluster snapshot to copy. You must use the <code>PreSignedUrl</code>
     * parameter when copying a cluster snapshot from another Region.
     * </p>
     * <p>
     * If you are using an Amazon Web Services SDK tool or the CLI, you can specify <code>SourceRegion</code> (or
     * <code>--source-region</code> for the CLI) instead of specifying <code>PreSignedUrl</code> manually. Specifying
     * <code>SourceRegion</code> autogenerates a pre-signed URL that is a valid request for the operation that can be
     * executed in the source Region.
     * </p>
     * <p>
     * The presigned URL must be a valid request for the <code>CopyDBClusterSnapshot</code> API action that can be
     * executed in the source Region that contains the cluster snapshot to be copied. The presigned URL request must
     * contain the following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SourceRegion</code> - The ID of the region that contains the snapshot to be copied.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBClusterSnapshotIdentifier</code> - The identifier for the the encrypted cluster snapshot to be
     * copied. This identifier must be in the Amazon Resource Name (ARN) format for the source Region. For example, if
     * you are copying an encrypted cluster snapshot from the us-east-1 Region, then your
     * <code>SourceDBClusterSnapshotIdentifier</code> looks something like the following:
     * <code>arn:aws:rds:us-east-1:12345678012:sample-cluster:sample-cluster-snapshot</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TargetDBClusterSnapshotIdentifier</code> - The identifier for the new cluster snapshot to be created. This
     * parameter isn't case sensitive.
     * </p>
     * </li>
     * </ul>
     * 
     * @param preSignedUrl
     *        The URL that contains a Signature Version 4 signed request for the<code>CopyDBClusterSnapshot</code> API
     *        action in the Region that contains the source cluster snapshot to copy. You must use the
     *        <code>PreSignedUrl</code> parameter when copying a cluster snapshot from another Region.</p>
     *        <p>
     *        If you are using an Amazon Web Services SDK tool or the CLI, you can specify <code>SourceRegion</code> (or
     *        <code>--source-region</code> for the CLI) instead of specifying <code>PreSignedUrl</code> manually.
     *        Specifying <code>SourceRegion</code> autogenerates a pre-signed URL that is a valid request for the
     *        operation that can be executed in the source Region.
     *        </p>
     *        <p>
     *        The presigned URL must be a valid request for the <code>CopyDBClusterSnapshot</code> API action that can
     *        be executed in the source Region that contains the cluster snapshot to be copied. The presigned URL
     *        request must contain the following parameter values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SourceRegion</code> - The ID of the region that contains the snapshot to be copied.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SourceDBClusterSnapshotIdentifier</code> - The identifier for the the encrypted cluster snapshot to
     *        be copied. This identifier must be in the Amazon Resource Name (ARN) format for the source Region. For
     *        example, if you are copying an encrypted cluster snapshot from the us-east-1 Region, then your
     *        <code>SourceDBClusterSnapshotIdentifier</code> looks something like the following:
     *        <code>arn:aws:rds:us-east-1:12345678012:sample-cluster:sample-cluster-snapshot</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TargetDBClusterSnapshotIdentifier</code> - The identifier for the new cluster snapshot to be
     *        created. This parameter isn't case sensitive.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDBClusterSnapshotRequest withPreSignedUrl(String preSignedUrl) {
        setPreSignedUrl(preSignedUrl);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to copy all tags from the source cluster snapshot to the target cluster snapshot, and
     * otherwise <code>false</code>. The default is <code>false</code>.
     * </p>
     * 
     * @param copyTags
     *        Set to <code>true</code> to copy all tags from the source cluster snapshot to the target cluster snapshot,
     *        and otherwise <code>false</code>. The default is <code>false</code>.
     */

    public void setCopyTags(Boolean copyTags) {
        this.copyTags = copyTags;
    }

    /**
     * <p>
     * Set to <code>true</code> to copy all tags from the source cluster snapshot to the target cluster snapshot, and
     * otherwise <code>false</code>. The default is <code>false</code>.
     * </p>
     * 
     * @return Set to <code>true</code> to copy all tags from the source cluster snapshot to the target cluster
     *         snapshot, and otherwise <code>false</code>. The default is <code>false</code>.
     */

    public Boolean getCopyTags() {
        return this.copyTags;
    }

    /**
     * <p>
     * Set to <code>true</code> to copy all tags from the source cluster snapshot to the target cluster snapshot, and
     * otherwise <code>false</code>. The default is <code>false</code>.
     * </p>
     * 
     * @param copyTags
     *        Set to <code>true</code> to copy all tags from the source cluster snapshot to the target cluster snapshot,
     *        and otherwise <code>false</code>. The default is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDBClusterSnapshotRequest withCopyTags(Boolean copyTags) {
        setCopyTags(copyTags);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to copy all tags from the source cluster snapshot to the target cluster snapshot, and
     * otherwise <code>false</code>. The default is <code>false</code>.
     * </p>
     * 
     * @return Set to <code>true</code> to copy all tags from the source cluster snapshot to the target cluster
     *         snapshot, and otherwise <code>false</code>. The default is <code>false</code>.
     */

    public Boolean isCopyTags() {
        return this.copyTags;
    }

    /**
     * <p>
     * The tags to be assigned to the cluster snapshot.
     * </p>
     * 
     * @return The tags to be assigned to the cluster snapshot.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to be assigned to the cluster snapshot.
     * </p>
     * 
     * @param tags
     *        The tags to be assigned to the cluster snapshot.
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
     * The tags to be assigned to the cluster snapshot.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to be assigned to the cluster snapshot.
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
     * The tags to be assigned to the cluster snapshot.
     * </p>
     * 
     * @param tags
     *        The tags to be assigned to the cluster snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDBClusterSnapshotRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * The region where the source instance is located.
     * 
     * @param sourceRegion
     *        The region where the source instance is located.
     */

    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    /**
     * The region where the source instance is located.
     * 
     * @return The region where the source instance is located.
     */

    public String getSourceRegion() {
        return this.sourceRegion;
    }

    /**
     * The region where the source instance is located.
     * 
     * @param sourceRegion
     *        The region where the source instance is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDBClusterSnapshotRequest withSourceRegion(String sourceRegion) {
        setSourceRegion(sourceRegion);
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
            sb.append("Tags: ").append(getTags()).append(",");
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

        hashCode = prime * hashCode + ((getSourceDBClusterSnapshotIdentifier() == null) ? 0 : getSourceDBClusterSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTargetDBClusterSnapshotIdentifier() == null) ? 0 : getTargetDBClusterSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getPreSignedUrl() == null) ? 0 : getPreSignedUrl().hashCode());
        hashCode = prime * hashCode + ((getCopyTags() == null) ? 0 : getCopyTags().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getSourceRegion() == null) ? 0 : getSourceRegion().hashCode());
        return hashCode;
    }

    @Override
    public CopyDBClusterSnapshotRequest clone() {
        return (CopyDBClusterSnapshotRequest) super.clone();
    }

}
