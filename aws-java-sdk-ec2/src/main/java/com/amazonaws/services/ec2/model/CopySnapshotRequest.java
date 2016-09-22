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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CopySnapshotRequestMarshaller;

/**
 * <p>
 * Contains the parameters for CopySnapshot.
 * </p>
 */
public class CopySnapshotRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CopySnapshotRequest> {

    /**
     * <p>
     * The ID of the region that contains the snapshot to be copied.
     * </p>
     */
    private String sourceRegion;
    /**
     * <p>
     * The ID of the EBS snapshot to copy.
     * </p>
     */
    private String sourceSnapshotId;
    /**
     * <p>
     * A description for the EBS snapshot.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The destination region to use in the <code>PresignedUrl</code> parameter of a snapshot copy operation. This
     * parameter is only valid for specifying the destination region in a <code>PresignedUrl</code> parameter, where it
     * is required.
     * </p>
     * <note>
     * <p>
     * <code>CopySnapshot</code> sends the snapshot copy to the regional endpoint that you send the HTTP request to,
     * such as <code>ec2.us-east-1.amazonaws.com</code> (in the AWS CLI, this is specified with the
     * <code>--region</code> parameter or the default region in your AWS configuration file).
     * </p>
     * </note>
     */
    private String destinationRegion;
    /**
     * <p>
     * The pre-signed URL that facilitates copying an encrypted snapshot. This parameter is only required when copying
     * an encrypted snapshot with the Amazon EC2 Query API; it is available as an optional parameter in all other cases.
     * The <code>PresignedUrl</code> should use the snapshot source endpoint, the <code>CopySnapshot</code> action, and
     * include the <code>SourceRegion</code>, <code>SourceSnapshotId</code>, and <code>DestinationRegion</code>
     * parameters. The <code>PresignedUrl</code> must be signed using AWS Signature Version 4. Because EBS snapshots are
     * stored in Amazon S3, the signing algorithm for this parameter uses the same logic that is described in <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating Requests by
     * Using Query Parameters (AWS Signature Version 4)</a> in the <i>Amazon Simple Storage Service API Reference</i>.
     * An invalid or improperly signed <code>PresignedUrl</code> will cause the copy operation to fail asynchronously,
     * and the snapshot will move to an <code>error</code> state.
     * </p>
     */
    private String presignedUrl;
    /**
     * <p>
     * Specifies whether the destination snapshot should be encrypted. You can encrypt a copy of an unencrypted snapshot
     * using this flag, but you cannot use it to create an unencrypted copy from an encrypted snapshot. Your default CMK
     * for EBS is used unless a non-default AWS Key Management Service (AWS KMS) CMK is specified with
     * <code>KmsKeyId</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p>
     * The full ARN of the AWS Key Management Service (AWS KMS) CMK to use when creating the snapshot copy. This
     * parameter is only required if you want to use a non-default CMK; if this parameter is not specified, the default
     * CMK for EBS is used. The ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of the CMK,
     * the AWS account ID of the CMK owner, the <code>key</code> namespace, and then the CMK ID. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>. The specified
     * CMK must exist in the region that the snapshot is being copied to. If a <code>KmsKeyId</code> is specified, the
     * <code>Encrypted</code> flag must also be set.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The ID of the region that contains the snapshot to be copied.
     * </p>
     * 
     * @param sourceRegion
     *        The ID of the region that contains the snapshot to be copied.
     */

    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    /**
     * <p>
     * The ID of the region that contains the snapshot to be copied.
     * </p>
     * 
     * @return The ID of the region that contains the snapshot to be copied.
     */

    public String getSourceRegion() {
        return this.sourceRegion;
    }

    /**
     * <p>
     * The ID of the region that contains the snapshot to be copied.
     * </p>
     * 
     * @param sourceRegion
     *        The ID of the region that contains the snapshot to be copied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopySnapshotRequest withSourceRegion(String sourceRegion) {
        setSourceRegion(sourceRegion);
        return this;
    }

    /**
     * <p>
     * The ID of the EBS snapshot to copy.
     * </p>
     * 
     * @param sourceSnapshotId
     *        The ID of the EBS snapshot to copy.
     */

    public void setSourceSnapshotId(String sourceSnapshotId) {
        this.sourceSnapshotId = sourceSnapshotId;
    }

    /**
     * <p>
     * The ID of the EBS snapshot to copy.
     * </p>
     * 
     * @return The ID of the EBS snapshot to copy.
     */

    public String getSourceSnapshotId() {
        return this.sourceSnapshotId;
    }

    /**
     * <p>
     * The ID of the EBS snapshot to copy.
     * </p>
     * 
     * @param sourceSnapshotId
     *        The ID of the EBS snapshot to copy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopySnapshotRequest withSourceSnapshotId(String sourceSnapshotId) {
        setSourceSnapshotId(sourceSnapshotId);
        return this;
    }

    /**
     * <p>
     * A description for the EBS snapshot.
     * </p>
     * 
     * @param description
     *        A description for the EBS snapshot.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the EBS snapshot.
     * </p>
     * 
     * @return A description for the EBS snapshot.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the EBS snapshot.
     * </p>
     * 
     * @param description
     *        A description for the EBS snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopySnapshotRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The destination region to use in the <code>PresignedUrl</code> parameter of a snapshot copy operation. This
     * parameter is only valid for specifying the destination region in a <code>PresignedUrl</code> parameter, where it
     * is required.
     * </p>
     * <note>
     * <p>
     * <code>CopySnapshot</code> sends the snapshot copy to the regional endpoint that you send the HTTP request to,
     * such as <code>ec2.us-east-1.amazonaws.com</code> (in the AWS CLI, this is specified with the
     * <code>--region</code> parameter or the default region in your AWS configuration file).
     * </p>
     * </note>
     * 
     * @param destinationRegion
     *        The destination region to use in the <code>PresignedUrl</code> parameter of a snapshot copy operation.
     *        This parameter is only valid for specifying the destination region in a <code>PresignedUrl</code>
     *        parameter, where it is required.</p> <note>
     *        <p>
     *        <code>CopySnapshot</code> sends the snapshot copy to the regional endpoint that you send the HTTP request
     *        to, such as <code>ec2.us-east-1.amazonaws.com</code> (in the AWS CLI, this is specified with the
     *        <code>--region</code> parameter or the default region in your AWS configuration file).
     *        </p>
     */

    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }

    /**
     * <p>
     * The destination region to use in the <code>PresignedUrl</code> parameter of a snapshot copy operation. This
     * parameter is only valid for specifying the destination region in a <code>PresignedUrl</code> parameter, where it
     * is required.
     * </p>
     * <note>
     * <p>
     * <code>CopySnapshot</code> sends the snapshot copy to the regional endpoint that you send the HTTP request to,
     * such as <code>ec2.us-east-1.amazonaws.com</code> (in the AWS CLI, this is specified with the
     * <code>--region</code> parameter or the default region in your AWS configuration file).
     * </p>
     * </note>
     * 
     * @return The destination region to use in the <code>PresignedUrl</code> parameter of a snapshot copy operation.
     *         This parameter is only valid for specifying the destination region in a <code>PresignedUrl</code>
     *         parameter, where it is required.</p> <note>
     *         <p>
     *         <code>CopySnapshot</code> sends the snapshot copy to the regional endpoint that you send the HTTP request
     *         to, such as <code>ec2.us-east-1.amazonaws.com</code> (in the AWS CLI, this is specified with the
     *         <code>--region</code> parameter or the default region in your AWS configuration file).
     *         </p>
     */

    public String getDestinationRegion() {
        return this.destinationRegion;
    }

    /**
     * <p>
     * The destination region to use in the <code>PresignedUrl</code> parameter of a snapshot copy operation. This
     * parameter is only valid for specifying the destination region in a <code>PresignedUrl</code> parameter, where it
     * is required.
     * </p>
     * <note>
     * <p>
     * <code>CopySnapshot</code> sends the snapshot copy to the regional endpoint that you send the HTTP request to,
     * such as <code>ec2.us-east-1.amazonaws.com</code> (in the AWS CLI, this is specified with the
     * <code>--region</code> parameter or the default region in your AWS configuration file).
     * </p>
     * </note>
     * 
     * @param destinationRegion
     *        The destination region to use in the <code>PresignedUrl</code> parameter of a snapshot copy operation.
     *        This parameter is only valid for specifying the destination region in a <code>PresignedUrl</code>
     *        parameter, where it is required.</p> <note>
     *        <p>
     *        <code>CopySnapshot</code> sends the snapshot copy to the regional endpoint that you send the HTTP request
     *        to, such as <code>ec2.us-east-1.amazonaws.com</code> (in the AWS CLI, this is specified with the
     *        <code>--region</code> parameter or the default region in your AWS configuration file).
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopySnapshotRequest withDestinationRegion(String destinationRegion) {
        setDestinationRegion(destinationRegion);
        return this;
    }

    /**
     * <p>
     * The pre-signed URL that facilitates copying an encrypted snapshot. This parameter is only required when copying
     * an encrypted snapshot with the Amazon EC2 Query API; it is available as an optional parameter in all other cases.
     * The <code>PresignedUrl</code> should use the snapshot source endpoint, the <code>CopySnapshot</code> action, and
     * include the <code>SourceRegion</code>, <code>SourceSnapshotId</code>, and <code>DestinationRegion</code>
     * parameters. The <code>PresignedUrl</code> must be signed using AWS Signature Version 4. Because EBS snapshots are
     * stored in Amazon S3, the signing algorithm for this parameter uses the same logic that is described in <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating Requests by
     * Using Query Parameters (AWS Signature Version 4)</a> in the <i>Amazon Simple Storage Service API Reference</i>.
     * An invalid or improperly signed <code>PresignedUrl</code> will cause the copy operation to fail asynchronously,
     * and the snapshot will move to an <code>error</code> state.
     * </p>
     * 
     * @param presignedUrl
     *        The pre-signed URL that facilitates copying an encrypted snapshot. This parameter is only required when
     *        copying an encrypted snapshot with the Amazon EC2 Query API; it is available as an optional parameter in
     *        all other cases. The <code>PresignedUrl</code> should use the snapshot source endpoint, the
     *        <code>CopySnapshot</code> action, and include the <code>SourceRegion</code>, <code>SourceSnapshotId</code>
     *        , and <code>DestinationRegion</code> parameters. The <code>PresignedUrl</code> must be signed using AWS
     *        Signature Version 4. Because EBS snapshots are stored in Amazon S3, the signing algorithm for this
     *        parameter uses the same logic that is described in <a
     *        href="http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating Requests
     *        by Using Query Parameters (AWS Signature Version 4)</a> in the <i>Amazon Simple Storage Service API
     *        Reference</i>. An invalid or improperly signed <code>PresignedUrl</code> will cause the copy operation to
     *        fail asynchronously, and the snapshot will move to an <code>error</code> state.
     */

    public void setPresignedUrl(String presignedUrl) {
        this.presignedUrl = presignedUrl;
    }

    /**
     * <p>
     * The pre-signed URL that facilitates copying an encrypted snapshot. This parameter is only required when copying
     * an encrypted snapshot with the Amazon EC2 Query API; it is available as an optional parameter in all other cases.
     * The <code>PresignedUrl</code> should use the snapshot source endpoint, the <code>CopySnapshot</code> action, and
     * include the <code>SourceRegion</code>, <code>SourceSnapshotId</code>, and <code>DestinationRegion</code>
     * parameters. The <code>PresignedUrl</code> must be signed using AWS Signature Version 4. Because EBS snapshots are
     * stored in Amazon S3, the signing algorithm for this parameter uses the same logic that is described in <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating Requests by
     * Using Query Parameters (AWS Signature Version 4)</a> in the <i>Amazon Simple Storage Service API Reference</i>.
     * An invalid or improperly signed <code>PresignedUrl</code> will cause the copy operation to fail asynchronously,
     * and the snapshot will move to an <code>error</code> state.
     * </p>
     * 
     * @return The pre-signed URL that facilitates copying an encrypted snapshot. This parameter is only required when
     *         copying an encrypted snapshot with the Amazon EC2 Query API; it is available as an optional parameter in
     *         all other cases. The <code>PresignedUrl</code> should use the snapshot source endpoint, the
     *         <code>CopySnapshot</code> action, and include the <code>SourceRegion</code>,
     *         <code>SourceSnapshotId</code>, and <code>DestinationRegion</code> parameters. The
     *         <code>PresignedUrl</code> must be signed using AWS Signature Version 4. Because EBS snapshots are stored
     *         in Amazon S3, the signing algorithm for this parameter uses the same logic that is described in <a
     *         href="http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating
     *         Requests by Using Query Parameters (AWS Signature Version 4)</a> in the <i>Amazon Simple Storage Service
     *         API Reference</i>. An invalid or improperly signed <code>PresignedUrl</code> will cause the copy
     *         operation to fail asynchronously, and the snapshot will move to an <code>error</code> state.
     */

    public String getPresignedUrl() {
        return this.presignedUrl;
    }

    /**
     * <p>
     * The pre-signed URL that facilitates copying an encrypted snapshot. This parameter is only required when copying
     * an encrypted snapshot with the Amazon EC2 Query API; it is available as an optional parameter in all other cases.
     * The <code>PresignedUrl</code> should use the snapshot source endpoint, the <code>CopySnapshot</code> action, and
     * include the <code>SourceRegion</code>, <code>SourceSnapshotId</code>, and <code>DestinationRegion</code>
     * parameters. The <code>PresignedUrl</code> must be signed using AWS Signature Version 4. Because EBS snapshots are
     * stored in Amazon S3, the signing algorithm for this parameter uses the same logic that is described in <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating Requests by
     * Using Query Parameters (AWS Signature Version 4)</a> in the <i>Amazon Simple Storage Service API Reference</i>.
     * An invalid or improperly signed <code>PresignedUrl</code> will cause the copy operation to fail asynchronously,
     * and the snapshot will move to an <code>error</code> state.
     * </p>
     * 
     * @param presignedUrl
     *        The pre-signed URL that facilitates copying an encrypted snapshot. This parameter is only required when
     *        copying an encrypted snapshot with the Amazon EC2 Query API; it is available as an optional parameter in
     *        all other cases. The <code>PresignedUrl</code> should use the snapshot source endpoint, the
     *        <code>CopySnapshot</code> action, and include the <code>SourceRegion</code>, <code>SourceSnapshotId</code>
     *        , and <code>DestinationRegion</code> parameters. The <code>PresignedUrl</code> must be signed using AWS
     *        Signature Version 4. Because EBS snapshots are stored in Amazon S3, the signing algorithm for this
     *        parameter uses the same logic that is described in <a
     *        href="http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating Requests
     *        by Using Query Parameters (AWS Signature Version 4)</a> in the <i>Amazon Simple Storage Service API
     *        Reference</i>. An invalid or improperly signed <code>PresignedUrl</code> will cause the copy operation to
     *        fail asynchronously, and the snapshot will move to an <code>error</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopySnapshotRequest withPresignedUrl(String presignedUrl) {
        setPresignedUrl(presignedUrl);
        return this;
    }

    /**
     * <p>
     * Specifies whether the destination snapshot should be encrypted. You can encrypt a copy of an unencrypted snapshot
     * using this flag, but you cannot use it to create an unencrypted copy from an encrypted snapshot. Your default CMK
     * for EBS is used unless a non-default AWS Key Management Service (AWS KMS) CMK is specified with
     * <code>KmsKeyId</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param encrypted
     *        Specifies whether the destination snapshot should be encrypted. You can encrypt a copy of an unencrypted
     *        snapshot using this flag, but you cannot use it to create an unencrypted copy from an encrypted snapshot.
     *        Your default CMK for EBS is used unless a non-default AWS Key Management Service (AWS KMS) CMK is
     *        specified with <code>KmsKeyId</code>. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in
     *        the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Specifies whether the destination snapshot should be encrypted. You can encrypt a copy of an unencrypted snapshot
     * using this flag, but you cannot use it to create an unencrypted copy from an encrypted snapshot. Your default CMK
     * for EBS is used unless a non-default AWS Key Management Service (AWS KMS) CMK is specified with
     * <code>KmsKeyId</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return Specifies whether the destination snapshot should be encrypted. You can encrypt a copy of an unencrypted
     *         snapshot using this flag, but you cannot use it to create an unencrypted copy from an encrypted snapshot.
     *         Your default CMK for EBS is used unless a non-default AWS Key Management Service (AWS KMS) CMK is
     *         specified with <code>KmsKeyId</code>. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in
     *         the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * Specifies whether the destination snapshot should be encrypted. You can encrypt a copy of an unencrypted snapshot
     * using this flag, but you cannot use it to create an unencrypted copy from an encrypted snapshot. Your default CMK
     * for EBS is used unless a non-default AWS Key Management Service (AWS KMS) CMK is specified with
     * <code>KmsKeyId</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param encrypted
     *        Specifies whether the destination snapshot should be encrypted. You can encrypt a copy of an unencrypted
     *        snapshot using this flag, but you cannot use it to create an unencrypted copy from an encrypted snapshot.
     *        Your default CMK for EBS is used unless a non-default AWS Key Management Service (AWS KMS) CMK is
     *        specified with <code>KmsKeyId</code>. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in
     *        the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopySnapshotRequest withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * Specifies whether the destination snapshot should be encrypted. You can encrypt a copy of an unencrypted snapshot
     * using this flag, but you cannot use it to create an unencrypted copy from an encrypted snapshot. Your default CMK
     * for EBS is used unless a non-default AWS Key Management Service (AWS KMS) CMK is specified with
     * <code>KmsKeyId</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return Specifies whether the destination snapshot should be encrypted. You can encrypt a copy of an unencrypted
     *         snapshot using this flag, but you cannot use it to create an unencrypted copy from an encrypted snapshot.
     *         Your default CMK for EBS is used unless a non-default AWS Key Management Service (AWS KMS) CMK is
     *         specified with <code>KmsKeyId</code>. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in
     *         the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * The full ARN of the AWS Key Management Service (AWS KMS) CMK to use when creating the snapshot copy. This
     * parameter is only required if you want to use a non-default CMK; if this parameter is not specified, the default
     * CMK for EBS is used. The ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of the CMK,
     * the AWS account ID of the CMK owner, the <code>key</code> namespace, and then the CMK ID. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>. The specified
     * CMK must exist in the region that the snapshot is being copied to. If a <code>KmsKeyId</code> is specified, the
     * <code>Encrypted</code> flag must also be set.
     * </p>
     * 
     * @param kmsKeyId
     *        The full ARN of the AWS Key Management Service (AWS KMS) CMK to use when creating the snapshot copy. This
     *        parameter is only required if you want to use a non-default CMK; if this parameter is not specified, the
     *        default CMK for EBS is used. The ARN contains the <code>arn:aws:kms</code> namespace, followed by the
     *        region of the CMK, the AWS account ID of the CMK owner, the <code>key</code> namespace, and then the CMK
     *        ID. For example,
     *        arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>. The
     *        specified CMK must exist in the region that the snapshot is being copied to. If a <code>KmsKeyId</code> is
     *        specified, the <code>Encrypted</code> flag must also be set.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The full ARN of the AWS Key Management Service (AWS KMS) CMK to use when creating the snapshot copy. This
     * parameter is only required if you want to use a non-default CMK; if this parameter is not specified, the default
     * CMK for EBS is used. The ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of the CMK,
     * the AWS account ID of the CMK owner, the <code>key</code> namespace, and then the CMK ID. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>. The specified
     * CMK must exist in the region that the snapshot is being copied to. If a <code>KmsKeyId</code> is specified, the
     * <code>Encrypted</code> flag must also be set.
     * </p>
     * 
     * @return The full ARN of the AWS Key Management Service (AWS KMS) CMK to use when creating the snapshot copy. This
     *         parameter is only required if you want to use a non-default CMK; if this parameter is not specified, the
     *         default CMK for EBS is used. The ARN contains the <code>arn:aws:kms</code> namespace, followed by the
     *         region of the CMK, the AWS account ID of the CMK owner, the <code>key</code> namespace, and then the CMK
     *         ID. For example,
     *         arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>. The
     *         specified CMK must exist in the region that the snapshot is being copied to. If a <code>KmsKeyId</code>
     *         is specified, the <code>Encrypted</code> flag must also be set.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The full ARN of the AWS Key Management Service (AWS KMS) CMK to use when creating the snapshot copy. This
     * parameter is only required if you want to use a non-default CMK; if this parameter is not specified, the default
     * CMK for EBS is used. The ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of the CMK,
     * the AWS account ID of the CMK owner, the <code>key</code> namespace, and then the CMK ID. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>. The specified
     * CMK must exist in the region that the snapshot is being copied to. If a <code>KmsKeyId</code> is specified, the
     * <code>Encrypted</code> flag must also be set.
     * </p>
     * 
     * @param kmsKeyId
     *        The full ARN of the AWS Key Management Service (AWS KMS) CMK to use when creating the snapshot copy. This
     *        parameter is only required if you want to use a non-default CMK; if this parameter is not specified, the
     *        default CMK for EBS is used. The ARN contains the <code>arn:aws:kms</code> namespace, followed by the
     *        region of the CMK, the AWS account ID of the CMK owner, the <code>key</code> namespace, and then the CMK
     *        ID. For example,
     *        arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>. The
     *        specified CMK must exist in the region that the snapshot is being copied to. If a <code>KmsKeyId</code> is
     *        specified, the <code>Encrypted</code> flag must also be set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopySnapshotRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CopySnapshotRequest> getDryRunRequest() {
        Request<CopySnapshotRequest> request = new CopySnapshotRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getSourceRegion() != null)
            sb.append("SourceRegion: " + getSourceRegion() + ",");
        if (getSourceSnapshotId() != null)
            sb.append("SourceSnapshotId: " + getSourceSnapshotId() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDestinationRegion() != null)
            sb.append("DestinationRegion: " + getDestinationRegion() + ",");
        if (getPresignedUrl() != null)
            sb.append("PresignedUrl: " + getPresignedUrl() + ",");
        if (getEncrypted() != null)
            sb.append("Encrypted: " + getEncrypted() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopySnapshotRequest == false)
            return false;
        CopySnapshotRequest other = (CopySnapshotRequest) obj;
        if (other.getSourceRegion() == null ^ this.getSourceRegion() == null)
            return false;
        if (other.getSourceRegion() != null && other.getSourceRegion().equals(this.getSourceRegion()) == false)
            return false;
        if (other.getSourceSnapshotId() == null ^ this.getSourceSnapshotId() == null)
            return false;
        if (other.getSourceSnapshotId() != null && other.getSourceSnapshotId().equals(this.getSourceSnapshotId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDestinationRegion() == null ^ this.getDestinationRegion() == null)
            return false;
        if (other.getDestinationRegion() != null && other.getDestinationRegion().equals(this.getDestinationRegion()) == false)
            return false;
        if (other.getPresignedUrl() == null ^ this.getPresignedUrl() == null)
            return false;
        if (other.getPresignedUrl() != null && other.getPresignedUrl().equals(this.getPresignedUrl()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceRegion() == null) ? 0 : getSourceRegion().hashCode());
        hashCode = prime * hashCode + ((getSourceSnapshotId() == null) ? 0 : getSourceSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDestinationRegion() == null) ? 0 : getDestinationRegion().hashCode());
        hashCode = prime * hashCode + ((getPresignedUrl() == null) ? 0 : getPresignedUrl().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public CopySnapshotRequest clone() {
        return (CopySnapshotRequest) super.clone();
    }
}
