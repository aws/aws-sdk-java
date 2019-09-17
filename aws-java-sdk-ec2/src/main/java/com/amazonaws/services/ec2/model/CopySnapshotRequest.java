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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CopySnapshotRequestMarshaller;

/**
 * <p>
 * Contains the parameters for CopySnapshot.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopySnapshotRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CopySnapshotRequest> {

    /**
     * <p>
     * A description for the EBS snapshot.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The destination Region to use in the <code>PresignedUrl</code> parameter of a snapshot copy operation. This
     * parameter is only valid for specifying the destination Region in a <code>PresignedUrl</code> parameter, where it
     * is required.
     * </p>
     * <p>
     * The snapshot copy is sent to the regional endpoint that you sent the HTTP request to (for example,
     * <code>ec2.us-east-1.amazonaws.com</code>). With the AWS CLI, this is specified using the <code>--region</code>
     * parameter or the default Region in your AWS configuration file.
     * </p>
     */
    private String destinationRegion;
    /**
     * <p>
     * To encrypt a copy of an unencrypted snapshot if encryption by default is not enabled, enable encryption using
     * this parameter. Otherwise, omit this parameter. Encrypted snapshots are encrypted, even if you omit this
     * parameter and encryption by default is not enabled. You cannot set this parameter to false. For more information,
     * see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p>
     * The identifier of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use for Amazon EBS
     * encryption. If this parameter is not specified, your AWS managed CMK for EBS is used. If <code>KmsKeyId</code> is
     * specified, the encrypted state must be <code>true</code>.
     * </p>
     * <p>
     * You can specify the CMK using any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. For example, alias/ExampleAlias.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN. For example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS authenticates the CMK asynchronously. Therefore, if you specify an ID, alias, or ARN that is not valid, the
     * action can appear to complete, but eventually fails.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * When you copy an encrypted source snapshot using the Amazon EC2 Query API, you must supply a pre-signed URL. This
     * parameter is optional for unencrypted snapshots. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html">Query Requests</a>.
     * </p>
     * <p>
     * The <code>PresignedUrl</code> should use the snapshot source endpoint, the <code>CopySnapshot</code> action, and
     * include the <code>SourceRegion</code>, <code>SourceSnapshotId</code>, and <code>DestinationRegion</code>
     * parameters. The <code>PresignedUrl</code> must be signed using AWS Signature Version 4. Because EBS snapshots are
     * stored in Amazon S3, the signing algorithm for this parameter uses the same logic that is described in <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating Requests by
     * Using Query Parameters (AWS Signature Version 4)</a> in the <i>Amazon Simple Storage Service API Reference</i>.
     * An invalid or improperly signed <code>PresignedUrl</code> will cause the copy operation to fail asynchronously,
     * and the snapshot will move to an <code>error</code> state.
     * </p>
     */
    private String presignedUrl;
    /**
     * <p>
     * The ID of the Region that contains the snapshot to be copied.
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
     * The destination Region to use in the <code>PresignedUrl</code> parameter of a snapshot copy operation. This
     * parameter is only valid for specifying the destination Region in a <code>PresignedUrl</code> parameter, where it
     * is required.
     * </p>
     * <p>
     * The snapshot copy is sent to the regional endpoint that you sent the HTTP request to (for example,
     * <code>ec2.us-east-1.amazonaws.com</code>). With the AWS CLI, this is specified using the <code>--region</code>
     * parameter or the default Region in your AWS configuration file.
     * </p>
     * 
     * @param destinationRegion
     *        The destination Region to use in the <code>PresignedUrl</code> parameter of a snapshot copy operation.
     *        This parameter is only valid for specifying the destination Region in a <code>PresignedUrl</code>
     *        parameter, where it is required.</p>
     *        <p>
     *        The snapshot copy is sent to the regional endpoint that you sent the HTTP request to (for example,
     *        <code>ec2.us-east-1.amazonaws.com</code>). With the AWS CLI, this is specified using the
     *        <code>--region</code> parameter or the default Region in your AWS configuration file.
     */

    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }

    /**
     * <p>
     * The destination Region to use in the <code>PresignedUrl</code> parameter of a snapshot copy operation. This
     * parameter is only valid for specifying the destination Region in a <code>PresignedUrl</code> parameter, where it
     * is required.
     * </p>
     * <p>
     * The snapshot copy is sent to the regional endpoint that you sent the HTTP request to (for example,
     * <code>ec2.us-east-1.amazonaws.com</code>). With the AWS CLI, this is specified using the <code>--region</code>
     * parameter or the default Region in your AWS configuration file.
     * </p>
     * 
     * @return The destination Region to use in the <code>PresignedUrl</code> parameter of a snapshot copy operation.
     *         This parameter is only valid for specifying the destination Region in a <code>PresignedUrl</code>
     *         parameter, where it is required.</p>
     *         <p>
     *         The snapshot copy is sent to the regional endpoint that you sent the HTTP request to (for example,
     *         <code>ec2.us-east-1.amazonaws.com</code>). With the AWS CLI, this is specified using the
     *         <code>--region</code> parameter or the default Region in your AWS configuration file.
     */

    public String getDestinationRegion() {
        return this.destinationRegion;
    }

    /**
     * <p>
     * The destination Region to use in the <code>PresignedUrl</code> parameter of a snapshot copy operation. This
     * parameter is only valid for specifying the destination Region in a <code>PresignedUrl</code> parameter, where it
     * is required.
     * </p>
     * <p>
     * The snapshot copy is sent to the regional endpoint that you sent the HTTP request to (for example,
     * <code>ec2.us-east-1.amazonaws.com</code>). With the AWS CLI, this is specified using the <code>--region</code>
     * parameter or the default Region in your AWS configuration file.
     * </p>
     * 
     * @param destinationRegion
     *        The destination Region to use in the <code>PresignedUrl</code> parameter of a snapshot copy operation.
     *        This parameter is only valid for specifying the destination Region in a <code>PresignedUrl</code>
     *        parameter, where it is required.</p>
     *        <p>
     *        The snapshot copy is sent to the regional endpoint that you sent the HTTP request to (for example,
     *        <code>ec2.us-east-1.amazonaws.com</code>). With the AWS CLI, this is specified using the
     *        <code>--region</code> parameter or the default Region in your AWS configuration file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopySnapshotRequest withDestinationRegion(String destinationRegion) {
        setDestinationRegion(destinationRegion);
        return this;
    }

    /**
     * <p>
     * To encrypt a copy of an unencrypted snapshot if encryption by default is not enabled, enable encryption using
     * this parameter. Otherwise, omit this parameter. Encrypted snapshots are encrypted, even if you omit this
     * parameter and encryption by default is not enabled. You cannot set this parameter to false. For more information,
     * see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param encrypted
     *        To encrypt a copy of an unencrypted snapshot if encryption by default is not enabled, enable encryption
     *        using this parameter. Otherwise, omit this parameter. Encrypted snapshots are encrypted, even if you omit
     *        this parameter and encryption by default is not enabled. You cannot set this parameter to false. For more
     *        information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     *        EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * To encrypt a copy of an unencrypted snapshot if encryption by default is not enabled, enable encryption using
     * this parameter. Otherwise, omit this parameter. Encrypted snapshots are encrypted, even if you omit this
     * parameter and encryption by default is not enabled. You cannot set this parameter to false. For more information,
     * see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return To encrypt a copy of an unencrypted snapshot if encryption by default is not enabled, enable encryption
     *         using this parameter. Otherwise, omit this parameter. Encrypted snapshots are encrypted, even if you omit
     *         this parameter and encryption by default is not enabled. You cannot set this parameter to false. For more
     *         information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     *         EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * To encrypt a copy of an unencrypted snapshot if encryption by default is not enabled, enable encryption using
     * this parameter. Otherwise, omit this parameter. Encrypted snapshots are encrypted, even if you omit this
     * parameter and encryption by default is not enabled. You cannot set this parameter to false. For more information,
     * see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param encrypted
     *        To encrypt a copy of an unencrypted snapshot if encryption by default is not enabled, enable encryption
     *        using this parameter. Otherwise, omit this parameter. Encrypted snapshots are encrypted, even if you omit
     *        this parameter and encryption by default is not enabled. You cannot set this parameter to false. For more
     *        information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     *        EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopySnapshotRequest withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * To encrypt a copy of an unencrypted snapshot if encryption by default is not enabled, enable encryption using
     * this parameter. Otherwise, omit this parameter. Encrypted snapshots are encrypted, even if you omit this
     * parameter and encryption by default is not enabled. You cannot set this parameter to false. For more information,
     * see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return To encrypt a copy of an unencrypted snapshot if encryption by default is not enabled, enable encryption
     *         using this parameter. Otherwise, omit this parameter. Encrypted snapshots are encrypted, even if you omit
     *         this parameter and encryption by default is not enabled. You cannot set this parameter to false. For more
     *         information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     *         EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * The identifier of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use for Amazon EBS
     * encryption. If this parameter is not specified, your AWS managed CMK for EBS is used. If <code>KmsKeyId</code> is
     * specified, the encrypted state must be <code>true</code>.
     * </p>
     * <p>
     * You can specify the CMK using any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. For example, alias/ExampleAlias.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN. For example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS authenticates the CMK asynchronously. Therefore, if you specify an ID, alias, or ARN that is not valid, the
     * action can appear to complete, but eventually fails.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use for Amazon EBS
     *        encryption. If this parameter is not specified, your AWS managed CMK for EBS is used. If
     *        <code>KmsKeyId</code> is specified, the encrypted state must be <code>true</code>.</p>
     *        <p>
     *        You can specify the CMK using any of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key alias. For example, alias/ExampleAlias.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key ARN. For example,
     *        arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias ARN. For example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        AWS authenticates the CMK asynchronously. Therefore, if you specify an ID, alias, or ARN that is not
     *        valid, the action can appear to complete, but eventually fails.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The identifier of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use for Amazon EBS
     * encryption. If this parameter is not specified, your AWS managed CMK for EBS is used. If <code>KmsKeyId</code> is
     * specified, the encrypted state must be <code>true</code>.
     * </p>
     * <p>
     * You can specify the CMK using any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. For example, alias/ExampleAlias.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN. For example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS authenticates the CMK asynchronously. Therefore, if you specify an ID, alias, or ARN that is not valid, the
     * action can appear to complete, but eventually fails.
     * </p>
     * 
     * @return The identifier of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use for Amazon
     *         EBS encryption. If this parameter is not specified, your AWS managed CMK for EBS is used. If
     *         <code>KmsKeyId</code> is specified, the encrypted state must be <code>true</code>.</p>
     *         <p>
     *         You can specify the CMK using any of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key alias. For example, alias/ExampleAlias.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key ARN. For example,
     *         arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias ARN. For example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         AWS authenticates the CMK asynchronously. Therefore, if you specify an ID, alias, or ARN that is not
     *         valid, the action can appear to complete, but eventually fails.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The identifier of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use for Amazon EBS
     * encryption. If this parameter is not specified, your AWS managed CMK for EBS is used. If <code>KmsKeyId</code> is
     * specified, the encrypted state must be <code>true</code>.
     * </p>
     * <p>
     * You can specify the CMK using any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. For example, alias/ExampleAlias.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN. For example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS authenticates the CMK asynchronously. Therefore, if you specify an ID, alias, or ARN that is not valid, the
     * action can appear to complete, but eventually fails.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use for Amazon EBS
     *        encryption. If this parameter is not specified, your AWS managed CMK for EBS is used. If
     *        <code>KmsKeyId</code> is specified, the encrypted state must be <code>true</code>.</p>
     *        <p>
     *        You can specify the CMK using any of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key alias. For example, alias/ExampleAlias.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key ARN. For example,
     *        arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias ARN. For example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        AWS authenticates the CMK asynchronously. Therefore, if you specify an ID, alias, or ARN that is not
     *        valid, the action can appear to complete, but eventually fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopySnapshotRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * When you copy an encrypted source snapshot using the Amazon EC2 Query API, you must supply a pre-signed URL. This
     * parameter is optional for unencrypted snapshots. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html">Query Requests</a>.
     * </p>
     * <p>
     * The <code>PresignedUrl</code> should use the snapshot source endpoint, the <code>CopySnapshot</code> action, and
     * include the <code>SourceRegion</code>, <code>SourceSnapshotId</code>, and <code>DestinationRegion</code>
     * parameters. The <code>PresignedUrl</code> must be signed using AWS Signature Version 4. Because EBS snapshots are
     * stored in Amazon S3, the signing algorithm for this parameter uses the same logic that is described in <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating Requests by
     * Using Query Parameters (AWS Signature Version 4)</a> in the <i>Amazon Simple Storage Service API Reference</i>.
     * An invalid or improperly signed <code>PresignedUrl</code> will cause the copy operation to fail asynchronously,
     * and the snapshot will move to an <code>error</code> state.
     * </p>
     * 
     * @param presignedUrl
     *        When you copy an encrypted source snapshot using the Amazon EC2 Query API, you must supply a pre-signed
     *        URL. This parameter is optional for unencrypted snapshots. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html">Query Requests</a>.</p>
     *        <p>
     *        The <code>PresignedUrl</code> should use the snapshot source endpoint, the <code>CopySnapshot</code>
     *        action, and include the <code>SourceRegion</code>, <code>SourceSnapshotId</code>, and
     *        <code>DestinationRegion</code> parameters. The <code>PresignedUrl</code> must be signed using AWS
     *        Signature Version 4. Because EBS snapshots are stored in Amazon S3, the signing algorithm for this
     *        parameter uses the same logic that is described in <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating
     *        Requests by Using Query Parameters (AWS Signature Version 4)</a> in the <i>Amazon Simple Storage Service
     *        API Reference</i>. An invalid or improperly signed <code>PresignedUrl</code> will cause the copy operation
     *        to fail asynchronously, and the snapshot will move to an <code>error</code> state.
     */

    public void setPresignedUrl(String presignedUrl) {
        this.presignedUrl = presignedUrl;
    }

    /**
     * <p>
     * When you copy an encrypted source snapshot using the Amazon EC2 Query API, you must supply a pre-signed URL. This
     * parameter is optional for unencrypted snapshots. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html">Query Requests</a>.
     * </p>
     * <p>
     * The <code>PresignedUrl</code> should use the snapshot source endpoint, the <code>CopySnapshot</code> action, and
     * include the <code>SourceRegion</code>, <code>SourceSnapshotId</code>, and <code>DestinationRegion</code>
     * parameters. The <code>PresignedUrl</code> must be signed using AWS Signature Version 4. Because EBS snapshots are
     * stored in Amazon S3, the signing algorithm for this parameter uses the same logic that is described in <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating Requests by
     * Using Query Parameters (AWS Signature Version 4)</a> in the <i>Amazon Simple Storage Service API Reference</i>.
     * An invalid or improperly signed <code>PresignedUrl</code> will cause the copy operation to fail asynchronously,
     * and the snapshot will move to an <code>error</code> state.
     * </p>
     * 
     * @return When you copy an encrypted source snapshot using the Amazon EC2 Query API, you must supply a pre-signed
     *         URL. This parameter is optional for unencrypted snapshots. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html">Query Requests</a>.</p>
     *         <p>
     *         The <code>PresignedUrl</code> should use the snapshot source endpoint, the <code>CopySnapshot</code>
     *         action, and include the <code>SourceRegion</code>, <code>SourceSnapshotId</code>, and
     *         <code>DestinationRegion</code> parameters. The <code>PresignedUrl</code> must be signed using AWS
     *         Signature Version 4. Because EBS snapshots are stored in Amazon S3, the signing algorithm for this
     *         parameter uses the same logic that is described in <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating
     *         Requests by Using Query Parameters (AWS Signature Version 4)</a> in the <i>Amazon Simple Storage Service
     *         API Reference</i>. An invalid or improperly signed <code>PresignedUrl</code> will cause the copy
     *         operation to fail asynchronously, and the snapshot will move to an <code>error</code> state.
     */

    public String getPresignedUrl() {
        return this.presignedUrl;
    }

    /**
     * <p>
     * When you copy an encrypted source snapshot using the Amazon EC2 Query API, you must supply a pre-signed URL. This
     * parameter is optional for unencrypted snapshots. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html">Query Requests</a>.
     * </p>
     * <p>
     * The <code>PresignedUrl</code> should use the snapshot source endpoint, the <code>CopySnapshot</code> action, and
     * include the <code>SourceRegion</code>, <code>SourceSnapshotId</code>, and <code>DestinationRegion</code>
     * parameters. The <code>PresignedUrl</code> must be signed using AWS Signature Version 4. Because EBS snapshots are
     * stored in Amazon S3, the signing algorithm for this parameter uses the same logic that is described in <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating Requests by
     * Using Query Parameters (AWS Signature Version 4)</a> in the <i>Amazon Simple Storage Service API Reference</i>.
     * An invalid or improperly signed <code>PresignedUrl</code> will cause the copy operation to fail asynchronously,
     * and the snapshot will move to an <code>error</code> state.
     * </p>
     * 
     * @param presignedUrl
     *        When you copy an encrypted source snapshot using the Amazon EC2 Query API, you must supply a pre-signed
     *        URL. This parameter is optional for unencrypted snapshots. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html">Query Requests</a>.</p>
     *        <p>
     *        The <code>PresignedUrl</code> should use the snapshot source endpoint, the <code>CopySnapshot</code>
     *        action, and include the <code>SourceRegion</code>, <code>SourceSnapshotId</code>, and
     *        <code>DestinationRegion</code> parameters. The <code>PresignedUrl</code> must be signed using AWS
     *        Signature Version 4. Because EBS snapshots are stored in Amazon S3, the signing algorithm for this
     *        parameter uses the same logic that is described in <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating
     *        Requests by Using Query Parameters (AWS Signature Version 4)</a> in the <i>Amazon Simple Storage Service
     *        API Reference</i>. An invalid or improperly signed <code>PresignedUrl</code> will cause the copy operation
     *        to fail asynchronously, and the snapshot will move to an <code>error</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopySnapshotRequest withPresignedUrl(String presignedUrl) {
        setPresignedUrl(presignedUrl);
        return this;
    }

    /**
     * <p>
     * The ID of the Region that contains the snapshot to be copied.
     * </p>
     * 
     * @param sourceRegion
     *        The ID of the Region that contains the snapshot to be copied.
     */

    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    /**
     * <p>
     * The ID of the Region that contains the snapshot to be copied.
     * </p>
     * 
     * @return The ID of the Region that contains the snapshot to be copied.
     */

    public String getSourceRegion() {
        return this.sourceRegion;
    }

    /**
     * <p>
     * The ID of the Region that contains the snapshot to be copied.
     * </p>
     * 
     * @param sourceRegion
     *        The ID of the Region that contains the snapshot to be copied.
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDestinationRegion() != null)
            sb.append("DestinationRegion: ").append(getDestinationRegion()).append(",");
        if (getEncrypted() != null)
            sb.append("Encrypted: ").append(getEncrypted()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getPresignedUrl() != null)
            sb.append("PresignedUrl: ").append(getPresignedUrl()).append(",");
        if (getSourceRegion() != null)
            sb.append("SourceRegion: ").append(getSourceRegion()).append(",");
        if (getSourceSnapshotId() != null)
            sb.append("SourceSnapshotId: ").append(getSourceSnapshotId());
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
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDestinationRegion() == null ^ this.getDestinationRegion() == null)
            return false;
        if (other.getDestinationRegion() != null && other.getDestinationRegion().equals(this.getDestinationRegion()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getPresignedUrl() == null ^ this.getPresignedUrl() == null)
            return false;
        if (other.getPresignedUrl() != null && other.getPresignedUrl().equals(this.getPresignedUrl()) == false)
            return false;
        if (other.getSourceRegion() == null ^ this.getSourceRegion() == null)
            return false;
        if (other.getSourceRegion() != null && other.getSourceRegion().equals(this.getSourceRegion()) == false)
            return false;
        if (other.getSourceSnapshotId() == null ^ this.getSourceSnapshotId() == null)
            return false;
        if (other.getSourceSnapshotId() != null && other.getSourceSnapshotId().equals(this.getSourceSnapshotId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDestinationRegion() == null) ? 0 : getDestinationRegion().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getPresignedUrl() == null) ? 0 : getPresignedUrl().hashCode());
        hashCode = prime * hashCode + ((getSourceRegion() == null) ? 0 : getSourceRegion().hashCode());
        hashCode = prime * hashCode + ((getSourceSnapshotId() == null) ? 0 : getSourceSnapshotId().hashCode());
        return hashCode;
    }

    @Override
    public CopySnapshotRequest clone() {
        return (CopySnapshotRequest) super.clone();
    }
}
