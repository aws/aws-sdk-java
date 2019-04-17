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
import com.amazonaws.services.ec2.model.transform.ImportSnapshotRequestMarshaller;

/**
 * <p>
 * Contains the parameters for ImportSnapshot.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportSnapshotRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ImportSnapshotRequest> {

    /**
     * <p>
     * The client-specific data.
     * </p>
     */
    private ClientData clientData;
    /**
     * <p>
     * Token to enable idempotency for VM import requests.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The description string for the import snapshot task.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Information about the disk container.
     * </p>
     */
    private SnapshotDiskContainer diskContainer;
    /**
     * <p>
     * Specifies whether the destination snapshot of the imported image should be encrypted. The default CMK for EBS is
     * used unless you specify a non-default AWS Key Management Service (AWS KMS) CMK using <code>KmsKeyId</code>. For
     * more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS
     * Encryption</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p>
     * An identifier for the AWS Key Management Service (AWS KMS) customer master key (CMK) to use when creating the
     * encrypted snapshot. This parameter is only required if you want to use a non-default CMK; if this parameter is
     * not specified, the default CMK for EBS is used. If a <code>KmsKeyId</code> is specified, the
     * <code>Encrypted</code> flag must also be set.
     * </p>
     * <p>
     * The CMK identifier may be provided in any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of the CMK, the
     * AWS account ID of the CMK owner, the <code>alias</code> namespace, and then the CMK alias. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN using key ID. The ID ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of the CMK,
     * the AWS account ID of the CMK owner, the <code>key</code> namespace, and then the CMK ID. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN using key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of the
     * CMK, the AWS account ID of the CMK owner, the <code>alias</code> namespace, and then the CMK alias. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS parses <code>KmsKeyId</code> asynchronously, meaning that the action you call may appear to complete even
     * though you provided an invalid identifier. This action will eventually report failure.
     * </p>
     * <p>
     * The specified CMK must exist in the region that the snapshot is being copied to.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The name of the role to use when not using the default role, 'vmimport'.
     * </p>
     */
    private String roleName;

    /**
     * <p>
     * The client-specific data.
     * </p>
     * 
     * @param clientData
     *        The client-specific data.
     */

    public void setClientData(ClientData clientData) {
        this.clientData = clientData;
    }

    /**
     * <p>
     * The client-specific data.
     * </p>
     * 
     * @return The client-specific data.
     */

    public ClientData getClientData() {
        return this.clientData;
    }

    /**
     * <p>
     * The client-specific data.
     * </p>
     * 
     * @param clientData
     *        The client-specific data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportSnapshotRequest withClientData(ClientData clientData) {
        setClientData(clientData);
        return this;
    }

    /**
     * <p>
     * Token to enable idempotency for VM import requests.
     * </p>
     * 
     * @param clientToken
     *        Token to enable idempotency for VM import requests.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Token to enable idempotency for VM import requests.
     * </p>
     * 
     * @return Token to enable idempotency for VM import requests.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Token to enable idempotency for VM import requests.
     * </p>
     * 
     * @param clientToken
     *        Token to enable idempotency for VM import requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportSnapshotRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The description string for the import snapshot task.
     * </p>
     * 
     * @param description
     *        The description string for the import snapshot task.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description string for the import snapshot task.
     * </p>
     * 
     * @return The description string for the import snapshot task.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description string for the import snapshot task.
     * </p>
     * 
     * @param description
     *        The description string for the import snapshot task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportSnapshotRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Information about the disk container.
     * </p>
     * 
     * @param diskContainer
     *        Information about the disk container.
     */

    public void setDiskContainer(SnapshotDiskContainer diskContainer) {
        this.diskContainer = diskContainer;
    }

    /**
     * <p>
     * Information about the disk container.
     * </p>
     * 
     * @return Information about the disk container.
     */

    public SnapshotDiskContainer getDiskContainer() {
        return this.diskContainer;
    }

    /**
     * <p>
     * Information about the disk container.
     * </p>
     * 
     * @param diskContainer
     *        Information about the disk container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportSnapshotRequest withDiskContainer(SnapshotDiskContainer diskContainer) {
        setDiskContainer(diskContainer);
        return this;
    }

    /**
     * <p>
     * Specifies whether the destination snapshot of the imported image should be encrypted. The default CMK for EBS is
     * used unless you specify a non-default AWS Key Management Service (AWS KMS) CMK using <code>KmsKeyId</code>. For
     * more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS
     * Encryption</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param encrypted
     *        Specifies whether the destination snapshot of the imported image should be encrypted. The default CMK for
     *        EBS is used unless you specify a non-default AWS Key Management Service (AWS KMS) CMK using
     *        <code>KmsKeyId</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in
     *        the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Specifies whether the destination snapshot of the imported image should be encrypted. The default CMK for EBS is
     * used unless you specify a non-default AWS Key Management Service (AWS KMS) CMK using <code>KmsKeyId</code>. For
     * more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS
     * Encryption</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return Specifies whether the destination snapshot of the imported image should be encrypted. The default CMK for
     *         EBS is used unless you specify a non-default AWS Key Management Service (AWS KMS) CMK using
     *         <code>KmsKeyId</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a>
     *         in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * Specifies whether the destination snapshot of the imported image should be encrypted. The default CMK for EBS is
     * used unless you specify a non-default AWS Key Management Service (AWS KMS) CMK using <code>KmsKeyId</code>. For
     * more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS
     * Encryption</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param encrypted
     *        Specifies whether the destination snapshot of the imported image should be encrypted. The default CMK for
     *        EBS is used unless you specify a non-default AWS Key Management Service (AWS KMS) CMK using
     *        <code>KmsKeyId</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in
     *        the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportSnapshotRequest withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * Specifies whether the destination snapshot of the imported image should be encrypted. The default CMK for EBS is
     * used unless you specify a non-default AWS Key Management Service (AWS KMS) CMK using <code>KmsKeyId</code>. For
     * more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS
     * Encryption</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return Specifies whether the destination snapshot of the imported image should be encrypted. The default CMK for
     *         EBS is used unless you specify a non-default AWS Key Management Service (AWS KMS) CMK using
     *         <code>KmsKeyId</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a>
     *         in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * An identifier for the AWS Key Management Service (AWS KMS) customer master key (CMK) to use when creating the
     * encrypted snapshot. This parameter is only required if you want to use a non-default CMK; if this parameter is
     * not specified, the default CMK for EBS is used. If a <code>KmsKeyId</code> is specified, the
     * <code>Encrypted</code> flag must also be set.
     * </p>
     * <p>
     * The CMK identifier may be provided in any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of the CMK, the
     * AWS account ID of the CMK owner, the <code>alias</code> namespace, and then the CMK alias. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN using key ID. The ID ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of the CMK,
     * the AWS account ID of the CMK owner, the <code>key</code> namespace, and then the CMK ID. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN using key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of the
     * CMK, the AWS account ID of the CMK owner, the <code>alias</code> namespace, and then the CMK alias. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS parses <code>KmsKeyId</code> asynchronously, meaning that the action you call may appear to complete even
     * though you provided an invalid identifier. This action will eventually report failure.
     * </p>
     * <p>
     * The specified CMK must exist in the region that the snapshot is being copied to.
     * </p>
     * 
     * @param kmsKeyId
     *        An identifier for the AWS Key Management Service (AWS KMS) customer master key (CMK) to use when creating
     *        the encrypted snapshot. This parameter is only required if you want to use a non-default CMK; if this
     *        parameter is not specified, the default CMK for EBS is used. If a <code>KmsKeyId</code> is specified, the
     *        <code>Encrypted</code> flag must also be set. </p>
     *        <p>
     *        The CMK identifier may be provided in any of the following formats:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of the
     *        CMK, the AWS account ID of the CMK owner, the <code>alias</code> namespace, and then the CMK alias. For
     *        example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARN using key ID. The ID ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of
     *        the CMK, the AWS account ID of the CMK owner, the <code>key</code> namespace, and then the CMK ID. For
     *        example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARN using key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the region
     *        of the CMK, the AWS account ID of the CMK owner, the <code>alias</code> namespace, and then the CMK alias.
     *        For example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        AWS parses <code>KmsKeyId</code> asynchronously, meaning that the action you call may appear to complete
     *        even though you provided an invalid identifier. This action will eventually report failure.
     *        </p>
     *        <p>
     *        The specified CMK must exist in the region that the snapshot is being copied to.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * An identifier for the AWS Key Management Service (AWS KMS) customer master key (CMK) to use when creating the
     * encrypted snapshot. This parameter is only required if you want to use a non-default CMK; if this parameter is
     * not specified, the default CMK for EBS is used. If a <code>KmsKeyId</code> is specified, the
     * <code>Encrypted</code> flag must also be set.
     * </p>
     * <p>
     * The CMK identifier may be provided in any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of the CMK, the
     * AWS account ID of the CMK owner, the <code>alias</code> namespace, and then the CMK alias. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN using key ID. The ID ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of the CMK,
     * the AWS account ID of the CMK owner, the <code>key</code> namespace, and then the CMK ID. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN using key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of the
     * CMK, the AWS account ID of the CMK owner, the <code>alias</code> namespace, and then the CMK alias. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS parses <code>KmsKeyId</code> asynchronously, meaning that the action you call may appear to complete even
     * though you provided an invalid identifier. This action will eventually report failure.
     * </p>
     * <p>
     * The specified CMK must exist in the region that the snapshot is being copied to.
     * </p>
     * 
     * @return An identifier for the AWS Key Management Service (AWS KMS) customer master key (CMK) to use when creating
     *         the encrypted snapshot. This parameter is only required if you want to use a non-default CMK; if this
     *         parameter is not specified, the default CMK for EBS is used. If a <code>KmsKeyId</code> is specified, the
     *         <code>Encrypted</code> flag must also be set. </p>
     *         <p>
     *         The CMK identifier may be provided in any of the following formats:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of the
     *         CMK, the AWS account ID of the CMK owner, the <code>alias</code> namespace, and then the CMK alias. For
     *         example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ARN using key ID. The ID ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of
     *         the CMK, the AWS account ID of the CMK owner, the <code>key</code> namespace, and then the CMK ID. For
     *         example,
     *         arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ARN using key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the
     *         region of the CMK, the AWS account ID of the CMK owner, the <code>alias</code> namespace, and then the
     *         CMK alias. For example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         AWS parses <code>KmsKeyId</code> asynchronously, meaning that the action you call may appear to complete
     *         even though you provided an invalid identifier. This action will eventually report failure.
     *         </p>
     *         <p>
     *         The specified CMK must exist in the region that the snapshot is being copied to.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * An identifier for the AWS Key Management Service (AWS KMS) customer master key (CMK) to use when creating the
     * encrypted snapshot. This parameter is only required if you want to use a non-default CMK; if this parameter is
     * not specified, the default CMK for EBS is used. If a <code>KmsKeyId</code> is specified, the
     * <code>Encrypted</code> flag must also be set.
     * </p>
     * <p>
     * The CMK identifier may be provided in any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of the CMK, the
     * AWS account ID of the CMK owner, the <code>alias</code> namespace, and then the CMK alias. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN using key ID. The ID ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of the CMK,
     * the AWS account ID of the CMK owner, the <code>key</code> namespace, and then the CMK ID. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN using key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of the
     * CMK, the AWS account ID of the CMK owner, the <code>alias</code> namespace, and then the CMK alias. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS parses <code>KmsKeyId</code> asynchronously, meaning that the action you call may appear to complete even
     * though you provided an invalid identifier. This action will eventually report failure.
     * </p>
     * <p>
     * The specified CMK must exist in the region that the snapshot is being copied to.
     * </p>
     * 
     * @param kmsKeyId
     *        An identifier for the AWS Key Management Service (AWS KMS) customer master key (CMK) to use when creating
     *        the encrypted snapshot. This parameter is only required if you want to use a non-default CMK; if this
     *        parameter is not specified, the default CMK for EBS is used. If a <code>KmsKeyId</code> is specified, the
     *        <code>Encrypted</code> flag must also be set. </p>
     *        <p>
     *        The CMK identifier may be provided in any of the following formats:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of the
     *        CMK, the AWS account ID of the CMK owner, the <code>alias</code> namespace, and then the CMK alias. For
     *        example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARN using key ID. The ID ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of
     *        the CMK, the AWS account ID of the CMK owner, the <code>key</code> namespace, and then the CMK ID. For
     *        example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARN using key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the region
     *        of the CMK, the AWS account ID of the CMK owner, the <code>alias</code> namespace, and then the CMK alias.
     *        For example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        AWS parses <code>KmsKeyId</code> asynchronously, meaning that the action you call may appear to complete
     *        even though you provided an invalid identifier. This action will eventually report failure.
     *        </p>
     *        <p>
     *        The specified CMK must exist in the region that the snapshot is being copied to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportSnapshotRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The name of the role to use when not using the default role, 'vmimport'.
     * </p>
     * 
     * @param roleName
     *        The name of the role to use when not using the default role, 'vmimport'.
     */

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The name of the role to use when not using the default role, 'vmimport'.
     * </p>
     * 
     * @return The name of the role to use when not using the default role, 'vmimport'.
     */

    public String getRoleName() {
        return this.roleName;
    }

    /**
     * <p>
     * The name of the role to use when not using the default role, 'vmimport'.
     * </p>
     * 
     * @param roleName
     *        The name of the role to use when not using the default role, 'vmimport'.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportSnapshotRequest withRoleName(String roleName) {
        setRoleName(roleName);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ImportSnapshotRequest> getDryRunRequest() {
        Request<ImportSnapshotRequest> request = new ImportSnapshotRequestMarshaller().marshall(this);
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
        if (getClientData() != null)
            sb.append("ClientData: ").append(getClientData()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDiskContainer() != null)
            sb.append("DiskContainer: ").append(getDiskContainer()).append(",");
        if (getEncrypted() != null)
            sb.append("Encrypted: ").append(getEncrypted()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getRoleName() != null)
            sb.append("RoleName: ").append(getRoleName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportSnapshotRequest == false)
            return false;
        ImportSnapshotRequest other = (ImportSnapshotRequest) obj;
        if (other.getClientData() == null ^ this.getClientData() == null)
            return false;
        if (other.getClientData() != null && other.getClientData().equals(this.getClientData()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDiskContainer() == null ^ this.getDiskContainer() == null)
            return false;
        if (other.getDiskContainer() != null && other.getDiskContainer().equals(this.getDiskContainer()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientData() == null) ? 0 : getClientData().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDiskContainer() == null) ? 0 : getDiskContainer().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        return hashCode;
    }

    @Override
    public ImportSnapshotRequest clone() {
        return (ImportSnapshotRequest) super.clone();
    }
}
