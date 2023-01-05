/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.ImportImageRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportImageRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ImportImageRequest> {

    /**
     * <p>
     * The architecture of the virtual machine.
     * </p>
     * <p>
     * Valid values: <code>i386</code> | <code>x86_64</code>
     * </p>
     */
    private String architecture;
    /**
     * <p>
     * The client-specific data.
     * </p>
     */
    private ClientData clientData;
    /**
     * <p>
     * The token to enable idempotency for VM import requests.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * A description string for the import image task.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Information about the disk containers.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ImageDiskContainer> diskContainers;
    /**
     * <p>
     * Specifies whether the destination AMI of the imported image should be encrypted. The default KMS key for EBS is
     * used unless you specify a non-default KMS key using <code>KmsKeyId</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p>
     * The target hypervisor platform.
     * </p>
     * <p>
     * Valid values: <code>xen</code>
     * </p>
     */
    private String hypervisor;
    /**
     * <p>
     * An identifier for the symmetric KMS key to use when creating the encrypted AMI. This parameter is only required
     * if you want to use a non-default KMS key; if this parameter is not specified, the default KMS key for EBS is
     * used. If a <code>KmsKeyId</code> is specified, the <code>Encrypted</code> flag must also be set.
     * </p>
     * <p>
     * The KMS key identifier may be provided in any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the Region of the key, the
     * Amazon Web Services account ID of the key owner, the <code>alias</code> namespace, and then the key alias. For
     * example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN using key ID. The ID ARN contains the <code>arn:aws:kms</code> namespace, followed by the Region of the key,
     * the Amazon Web Services account ID of the key owner, the <code>key</code> namespace, and then the key ID. For
     * example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN using key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the Region of the
     * key, the Amazon Web Services account ID of the key owner, the <code>alias</code> namespace, and then the key
     * alias. For example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Amazon Web Services parses <code>KmsKeyId</code> asynchronously, meaning that the action you call may appear to
     * complete even though you provided an invalid identifier. This action will eventually report failure.
     * </p>
     * <p>
     * The specified KMS key must exist in the Region that the AMI is being copied to.
     * </p>
     * <p>
     * Amazon EBS does not support asymmetric KMS keys.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The license type to be used for the Amazon Machine Image (AMI) after importing.
     * </p>
     * <p>
     * Specify <code>AWS</code> to replace the source-system license with an Amazon Web Services license or
     * <code>BYOL</code> to retain the source-system license. Leaving this parameter undefined is the same as choosing
     * <code>AWS</code> when importing a Windows Server operating system, and the same as choosing <code>BYOL</code>
     * when importing a Windows client operating system (such as Windows 10) or a Linux operating system.
     * </p>
     * <p>
     * To use <code>BYOL</code>, you must have existing licenses with rights to use these licenses in a third party
     * cloud, such as Amazon Web Services. For more information, see <a
     * href="https://docs.aws.amazon.com/vm-import/latest/userguide/vmimport-image-import.html#prerequisites-image"
     * >Prerequisites</a> in the VM Import/Export User Guide.
     * </p>
     */
    private String licenseType;
    /**
     * <p>
     * The operating system of the virtual machine.
     * </p>
     * <p>
     * Valid values: <code>Windows</code> | <code>Linux</code>
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The name of the role to use when not using the default role, 'vmimport'.
     * </p>
     */
    private String roleName;
    /**
     * <p>
     * The ARNs of the license configurations.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ImportImageLicenseConfigurationRequest> licenseSpecifications;
    /**
     * <p>
     * The tags to apply to the import image task during creation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;
    /**
     * <p>
     * The usage operation value. For more information, see <a
     * href="https://docs.aws.amazon.com/vm-import/latest/userguide/vmie_prereqs.html#prerequisites">Licensing
     * options</a> in the <i>VM Import/Export User Guide</i>.
     * </p>
     */
    private String usageOperation;
    /**
     * <p>
     * The boot mode of the virtual machine.
     * </p>
     */
    private String bootMode;

    /**
     * <p>
     * The architecture of the virtual machine.
     * </p>
     * <p>
     * Valid values: <code>i386</code> | <code>x86_64</code>
     * </p>
     * 
     * @param architecture
     *        The architecture of the virtual machine.</p>
     *        <p>
     *        Valid values: <code>i386</code> | <code>x86_64</code>
     */

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     * <p>
     * The architecture of the virtual machine.
     * </p>
     * <p>
     * Valid values: <code>i386</code> | <code>x86_64</code>
     * </p>
     * 
     * @return The architecture of the virtual machine.</p>
     *         <p>
     *         Valid values: <code>i386</code> | <code>x86_64</code>
     */

    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * <p>
     * The architecture of the virtual machine.
     * </p>
     * <p>
     * Valid values: <code>i386</code> | <code>x86_64</code>
     * </p>
     * 
     * @param architecture
     *        The architecture of the virtual machine.</p>
     *        <p>
     *        Valid values: <code>i386</code> | <code>x86_64</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageRequest withArchitecture(String architecture) {
        setArchitecture(architecture);
        return this;
    }

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

    public ImportImageRequest withClientData(ClientData clientData) {
        setClientData(clientData);
        return this;
    }

    /**
     * <p>
     * The token to enable idempotency for VM import requests.
     * </p>
     * 
     * @param clientToken
     *        The token to enable idempotency for VM import requests.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The token to enable idempotency for VM import requests.
     * </p>
     * 
     * @return The token to enable idempotency for VM import requests.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The token to enable idempotency for VM import requests.
     * </p>
     * 
     * @param clientToken
     *        The token to enable idempotency for VM import requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * A description string for the import image task.
     * </p>
     * 
     * @param description
     *        A description string for the import image task.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description string for the import image task.
     * </p>
     * 
     * @return A description string for the import image task.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description string for the import image task.
     * </p>
     * 
     * @param description
     *        A description string for the import image task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Information about the disk containers.
     * </p>
     * 
     * @return Information about the disk containers.
     */

    public java.util.List<ImageDiskContainer> getDiskContainers() {
        if (diskContainers == null) {
            diskContainers = new com.amazonaws.internal.SdkInternalList<ImageDiskContainer>();
        }
        return diskContainers;
    }

    /**
     * <p>
     * Information about the disk containers.
     * </p>
     * 
     * @param diskContainers
     *        Information about the disk containers.
     */

    public void setDiskContainers(java.util.Collection<ImageDiskContainer> diskContainers) {
        if (diskContainers == null) {
            this.diskContainers = null;
            return;
        }

        this.diskContainers = new com.amazonaws.internal.SdkInternalList<ImageDiskContainer>(diskContainers);
    }

    /**
     * <p>
     * Information about the disk containers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDiskContainers(java.util.Collection)} or {@link #withDiskContainers(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param diskContainers
     *        Information about the disk containers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageRequest withDiskContainers(ImageDiskContainer... diskContainers) {
        if (this.diskContainers == null) {
            setDiskContainers(new com.amazonaws.internal.SdkInternalList<ImageDiskContainer>(diskContainers.length));
        }
        for (ImageDiskContainer ele : diskContainers) {
            this.diskContainers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the disk containers.
     * </p>
     * 
     * @param diskContainers
     *        Information about the disk containers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageRequest withDiskContainers(java.util.Collection<ImageDiskContainer> diskContainers) {
        setDiskContainers(diskContainers);
        return this;
    }

    /**
     * <p>
     * Specifies whether the destination AMI of the imported image should be encrypted. The default KMS key for EBS is
     * used unless you specify a non-default KMS key using <code>KmsKeyId</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param encrypted
     *        Specifies whether the destination AMI of the imported image should be encrypted. The default KMS key for
     *        EBS is used unless you specify a non-default KMS key using <code>KmsKeyId</code>. For more information,
     *        see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS
     *        Encryption</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Specifies whether the destination AMI of the imported image should be encrypted. The default KMS key for EBS is
     * used unless you specify a non-default KMS key using <code>KmsKeyId</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return Specifies whether the destination AMI of the imported image should be encrypted. The default KMS key for
     *         EBS is used unless you specify a non-default KMS key using <code>KmsKeyId</code>. For more information,
     *         see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS
     *         Encryption</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * Specifies whether the destination AMI of the imported image should be encrypted. The default KMS key for EBS is
     * used unless you specify a non-default KMS key using <code>KmsKeyId</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param encrypted
     *        Specifies whether the destination AMI of the imported image should be encrypted. The default KMS key for
     *        EBS is used unless you specify a non-default KMS key using <code>KmsKeyId</code>. For more information,
     *        see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS
     *        Encryption</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageRequest withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * Specifies whether the destination AMI of the imported image should be encrypted. The default KMS key for EBS is
     * used unless you specify a non-default KMS key using <code>KmsKeyId</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return Specifies whether the destination AMI of the imported image should be encrypted. The default KMS key for
     *         EBS is used unless you specify a non-default KMS key using <code>KmsKeyId</code>. For more information,
     *         see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS
     *         Encryption</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * The target hypervisor platform.
     * </p>
     * <p>
     * Valid values: <code>xen</code>
     * </p>
     * 
     * @param hypervisor
     *        The target hypervisor platform.</p>
     *        <p>
     *        Valid values: <code>xen</code>
     */

    public void setHypervisor(String hypervisor) {
        this.hypervisor = hypervisor;
    }

    /**
     * <p>
     * The target hypervisor platform.
     * </p>
     * <p>
     * Valid values: <code>xen</code>
     * </p>
     * 
     * @return The target hypervisor platform.</p>
     *         <p>
     *         Valid values: <code>xen</code>
     */

    public String getHypervisor() {
        return this.hypervisor;
    }

    /**
     * <p>
     * The target hypervisor platform.
     * </p>
     * <p>
     * Valid values: <code>xen</code>
     * </p>
     * 
     * @param hypervisor
     *        The target hypervisor platform.</p>
     *        <p>
     *        Valid values: <code>xen</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageRequest withHypervisor(String hypervisor) {
        setHypervisor(hypervisor);
        return this;
    }

    /**
     * <p>
     * An identifier for the symmetric KMS key to use when creating the encrypted AMI. This parameter is only required
     * if you want to use a non-default KMS key; if this parameter is not specified, the default KMS key for EBS is
     * used. If a <code>KmsKeyId</code> is specified, the <code>Encrypted</code> flag must also be set.
     * </p>
     * <p>
     * The KMS key identifier may be provided in any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the Region of the key, the
     * Amazon Web Services account ID of the key owner, the <code>alias</code> namespace, and then the key alias. For
     * example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN using key ID. The ID ARN contains the <code>arn:aws:kms</code> namespace, followed by the Region of the key,
     * the Amazon Web Services account ID of the key owner, the <code>key</code> namespace, and then the key ID. For
     * example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN using key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the Region of the
     * key, the Amazon Web Services account ID of the key owner, the <code>alias</code> namespace, and then the key
     * alias. For example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Amazon Web Services parses <code>KmsKeyId</code> asynchronously, meaning that the action you call may appear to
     * complete even though you provided an invalid identifier. This action will eventually report failure.
     * </p>
     * <p>
     * The specified KMS key must exist in the Region that the AMI is being copied to.
     * </p>
     * <p>
     * Amazon EBS does not support asymmetric KMS keys.
     * </p>
     * 
     * @param kmsKeyId
     *        An identifier for the symmetric KMS key to use when creating the encrypted AMI. This parameter is only
     *        required if you want to use a non-default KMS key; if this parameter is not specified, the default KMS key
     *        for EBS is used. If a <code>KmsKeyId</code> is specified, the <code>Encrypted</code> flag must also be
     *        set. </p>
     *        <p>
     *        The KMS key identifier may be provided in any of the following formats:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the Region of the
     *        key, the Amazon Web Services account ID of the key owner, the <code>alias</code> namespace, and then the
     *        key alias. For example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARN using key ID. The ID ARN contains the <code>arn:aws:kms</code> namespace, followed by the Region of
     *        the key, the Amazon Web Services account ID of the key owner, the <code>key</code> namespace, and then the
     *        key ID. For example,
     *        arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARN using key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the Region
     *        of the key, the Amazon Web Services account ID of the key owner, the <code>alias</code> namespace, and
     *        then the key alias. For example,
     *        arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Amazon Web Services parses <code>KmsKeyId</code> asynchronously, meaning that the action you call may
     *        appear to complete even though you provided an invalid identifier. This action will eventually report
     *        failure.
     *        </p>
     *        <p>
     *        The specified KMS key must exist in the Region that the AMI is being copied to.
     *        </p>
     *        <p>
     *        Amazon EBS does not support asymmetric KMS keys.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * An identifier for the symmetric KMS key to use when creating the encrypted AMI. This parameter is only required
     * if you want to use a non-default KMS key; if this parameter is not specified, the default KMS key for EBS is
     * used. If a <code>KmsKeyId</code> is specified, the <code>Encrypted</code> flag must also be set.
     * </p>
     * <p>
     * The KMS key identifier may be provided in any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the Region of the key, the
     * Amazon Web Services account ID of the key owner, the <code>alias</code> namespace, and then the key alias. For
     * example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN using key ID. The ID ARN contains the <code>arn:aws:kms</code> namespace, followed by the Region of the key,
     * the Amazon Web Services account ID of the key owner, the <code>key</code> namespace, and then the key ID. For
     * example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN using key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the Region of the
     * key, the Amazon Web Services account ID of the key owner, the <code>alias</code> namespace, and then the key
     * alias. For example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Amazon Web Services parses <code>KmsKeyId</code> asynchronously, meaning that the action you call may appear to
     * complete even though you provided an invalid identifier. This action will eventually report failure.
     * </p>
     * <p>
     * The specified KMS key must exist in the Region that the AMI is being copied to.
     * </p>
     * <p>
     * Amazon EBS does not support asymmetric KMS keys.
     * </p>
     * 
     * @return An identifier for the symmetric KMS key to use when creating the encrypted AMI. This parameter is only
     *         required if you want to use a non-default KMS key; if this parameter is not specified, the default KMS
     *         key for EBS is used. If a <code>KmsKeyId</code> is specified, the <code>Encrypted</code> flag must also
     *         be set. </p>
     *         <p>
     *         The KMS key identifier may be provided in any of the following formats:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the Region of the
     *         key, the Amazon Web Services account ID of the key owner, the <code>alias</code> namespace, and then the
     *         key alias. For example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ARN using key ID. The ID ARN contains the <code>arn:aws:kms</code> namespace, followed by the Region of
     *         the key, the Amazon Web Services account ID of the key owner, the <code>key</code> namespace, and then
     *         the key ID. For example,
     *         arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ARN using key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the
     *         Region of the key, the Amazon Web Services account ID of the key owner, the <code>alias</code> namespace,
     *         and then the key alias. For example,
     *         arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Amazon Web Services parses <code>KmsKeyId</code> asynchronously, meaning that the action you call may
     *         appear to complete even though you provided an invalid identifier. This action will eventually report
     *         failure.
     *         </p>
     *         <p>
     *         The specified KMS key must exist in the Region that the AMI is being copied to.
     *         </p>
     *         <p>
     *         Amazon EBS does not support asymmetric KMS keys.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * An identifier for the symmetric KMS key to use when creating the encrypted AMI. This parameter is only required
     * if you want to use a non-default KMS key; if this parameter is not specified, the default KMS key for EBS is
     * used. If a <code>KmsKeyId</code> is specified, the <code>Encrypted</code> flag must also be set.
     * </p>
     * <p>
     * The KMS key identifier may be provided in any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the Region of the key, the
     * Amazon Web Services account ID of the key owner, the <code>alias</code> namespace, and then the key alias. For
     * example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN using key ID. The ID ARN contains the <code>arn:aws:kms</code> namespace, followed by the Region of the key,
     * the Amazon Web Services account ID of the key owner, the <code>key</code> namespace, and then the key ID. For
     * example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN using key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the Region of the
     * key, the Amazon Web Services account ID of the key owner, the <code>alias</code> namespace, and then the key
     * alias. For example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Amazon Web Services parses <code>KmsKeyId</code> asynchronously, meaning that the action you call may appear to
     * complete even though you provided an invalid identifier. This action will eventually report failure.
     * </p>
     * <p>
     * The specified KMS key must exist in the Region that the AMI is being copied to.
     * </p>
     * <p>
     * Amazon EBS does not support asymmetric KMS keys.
     * </p>
     * 
     * @param kmsKeyId
     *        An identifier for the symmetric KMS key to use when creating the encrypted AMI. This parameter is only
     *        required if you want to use a non-default KMS key; if this parameter is not specified, the default KMS key
     *        for EBS is used. If a <code>KmsKeyId</code> is specified, the <code>Encrypted</code> flag must also be
     *        set. </p>
     *        <p>
     *        The KMS key identifier may be provided in any of the following formats:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the Region of the
     *        key, the Amazon Web Services account ID of the key owner, the <code>alias</code> namespace, and then the
     *        key alias. For example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARN using key ID. The ID ARN contains the <code>arn:aws:kms</code> namespace, followed by the Region of
     *        the key, the Amazon Web Services account ID of the key owner, the <code>key</code> namespace, and then the
     *        key ID. For example,
     *        arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARN using key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the Region
     *        of the key, the Amazon Web Services account ID of the key owner, the <code>alias</code> namespace, and
     *        then the key alias. For example,
     *        arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Amazon Web Services parses <code>KmsKeyId</code> asynchronously, meaning that the action you call may
     *        appear to complete even though you provided an invalid identifier. This action will eventually report
     *        failure.
     *        </p>
     *        <p>
     *        The specified KMS key must exist in the Region that the AMI is being copied to.
     *        </p>
     *        <p>
     *        Amazon EBS does not support asymmetric KMS keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The license type to be used for the Amazon Machine Image (AMI) after importing.
     * </p>
     * <p>
     * Specify <code>AWS</code> to replace the source-system license with an Amazon Web Services license or
     * <code>BYOL</code> to retain the source-system license. Leaving this parameter undefined is the same as choosing
     * <code>AWS</code> when importing a Windows Server operating system, and the same as choosing <code>BYOL</code>
     * when importing a Windows client operating system (such as Windows 10) or a Linux operating system.
     * </p>
     * <p>
     * To use <code>BYOL</code>, you must have existing licenses with rights to use these licenses in a third party
     * cloud, such as Amazon Web Services. For more information, see <a
     * href="https://docs.aws.amazon.com/vm-import/latest/userguide/vmimport-image-import.html#prerequisites-image"
     * >Prerequisites</a> in the VM Import/Export User Guide.
     * </p>
     * 
     * @param licenseType
     *        The license type to be used for the Amazon Machine Image (AMI) after importing.</p>
     *        <p>
     *        Specify <code>AWS</code> to replace the source-system license with an Amazon Web Services license or
     *        <code>BYOL</code> to retain the source-system license. Leaving this parameter undefined is the same as
     *        choosing <code>AWS</code> when importing a Windows Server operating system, and the same as choosing
     *        <code>BYOL</code> when importing a Windows client operating system (such as Windows 10) or a Linux
     *        operating system.
     *        </p>
     *        <p>
     *        To use <code>BYOL</code>, you must have existing licenses with rights to use these licenses in a third
     *        party cloud, such as Amazon Web Services. For more information, see <a href=
     *        "https://docs.aws.amazon.com/vm-import/latest/userguide/vmimport-image-import.html#prerequisites-image"
     *        >Prerequisites</a> in the VM Import/Export User Guide.
     */

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    /**
     * <p>
     * The license type to be used for the Amazon Machine Image (AMI) after importing.
     * </p>
     * <p>
     * Specify <code>AWS</code> to replace the source-system license with an Amazon Web Services license or
     * <code>BYOL</code> to retain the source-system license. Leaving this parameter undefined is the same as choosing
     * <code>AWS</code> when importing a Windows Server operating system, and the same as choosing <code>BYOL</code>
     * when importing a Windows client operating system (such as Windows 10) or a Linux operating system.
     * </p>
     * <p>
     * To use <code>BYOL</code>, you must have existing licenses with rights to use these licenses in a third party
     * cloud, such as Amazon Web Services. For more information, see <a
     * href="https://docs.aws.amazon.com/vm-import/latest/userguide/vmimport-image-import.html#prerequisites-image"
     * >Prerequisites</a> in the VM Import/Export User Guide.
     * </p>
     * 
     * @return The license type to be used for the Amazon Machine Image (AMI) after importing.</p>
     *         <p>
     *         Specify <code>AWS</code> to replace the source-system license with an Amazon Web Services license or
     *         <code>BYOL</code> to retain the source-system license. Leaving this parameter undefined is the same as
     *         choosing <code>AWS</code> when importing a Windows Server operating system, and the same as choosing
     *         <code>BYOL</code> when importing a Windows client operating system (such as Windows 10) or a Linux
     *         operating system.
     *         </p>
     *         <p>
     *         To use <code>BYOL</code>, you must have existing licenses with rights to use these licenses in a third
     *         party cloud, such as Amazon Web Services. For more information, see <a href=
     *         "https://docs.aws.amazon.com/vm-import/latest/userguide/vmimport-image-import.html#prerequisites-image"
     *         >Prerequisites</a> in the VM Import/Export User Guide.
     */

    public String getLicenseType() {
        return this.licenseType;
    }

    /**
     * <p>
     * The license type to be used for the Amazon Machine Image (AMI) after importing.
     * </p>
     * <p>
     * Specify <code>AWS</code> to replace the source-system license with an Amazon Web Services license or
     * <code>BYOL</code> to retain the source-system license. Leaving this parameter undefined is the same as choosing
     * <code>AWS</code> when importing a Windows Server operating system, and the same as choosing <code>BYOL</code>
     * when importing a Windows client operating system (such as Windows 10) or a Linux operating system.
     * </p>
     * <p>
     * To use <code>BYOL</code>, you must have existing licenses with rights to use these licenses in a third party
     * cloud, such as Amazon Web Services. For more information, see <a
     * href="https://docs.aws.amazon.com/vm-import/latest/userguide/vmimport-image-import.html#prerequisites-image"
     * >Prerequisites</a> in the VM Import/Export User Guide.
     * </p>
     * 
     * @param licenseType
     *        The license type to be used for the Amazon Machine Image (AMI) after importing.</p>
     *        <p>
     *        Specify <code>AWS</code> to replace the source-system license with an Amazon Web Services license or
     *        <code>BYOL</code> to retain the source-system license. Leaving this parameter undefined is the same as
     *        choosing <code>AWS</code> when importing a Windows Server operating system, and the same as choosing
     *        <code>BYOL</code> when importing a Windows client operating system (such as Windows 10) or a Linux
     *        operating system.
     *        </p>
     *        <p>
     *        To use <code>BYOL</code>, you must have existing licenses with rights to use these licenses in a third
     *        party cloud, such as Amazon Web Services. For more information, see <a href=
     *        "https://docs.aws.amazon.com/vm-import/latest/userguide/vmimport-image-import.html#prerequisites-image"
     *        >Prerequisites</a> in the VM Import/Export User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageRequest withLicenseType(String licenseType) {
        setLicenseType(licenseType);
        return this;
    }

    /**
     * <p>
     * The operating system of the virtual machine.
     * </p>
     * <p>
     * Valid values: <code>Windows</code> | <code>Linux</code>
     * </p>
     * 
     * @param platform
     *        The operating system of the virtual machine.</p>
     *        <p>
     *        Valid values: <code>Windows</code> | <code>Linux</code>
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The operating system of the virtual machine.
     * </p>
     * <p>
     * Valid values: <code>Windows</code> | <code>Linux</code>
     * </p>
     * 
     * @return The operating system of the virtual machine.</p>
     *         <p>
     *         Valid values: <code>Windows</code> | <code>Linux</code>
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The operating system of the virtual machine.
     * </p>
     * <p>
     * Valid values: <code>Windows</code> | <code>Linux</code>
     * </p>
     * 
     * @param platform
     *        The operating system of the virtual machine.</p>
     *        <p>
     *        Valid values: <code>Windows</code> | <code>Linux</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageRequest withPlatform(String platform) {
        setPlatform(platform);
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

    public ImportImageRequest withRoleName(String roleName) {
        setRoleName(roleName);
        return this;
    }

    /**
     * <p>
     * The ARNs of the license configurations.
     * </p>
     * 
     * @return The ARNs of the license configurations.
     */

    public java.util.List<ImportImageLicenseConfigurationRequest> getLicenseSpecifications() {
        if (licenseSpecifications == null) {
            licenseSpecifications = new com.amazonaws.internal.SdkInternalList<ImportImageLicenseConfigurationRequest>();
        }
        return licenseSpecifications;
    }

    /**
     * <p>
     * The ARNs of the license configurations.
     * </p>
     * 
     * @param licenseSpecifications
     *        The ARNs of the license configurations.
     */

    public void setLicenseSpecifications(java.util.Collection<ImportImageLicenseConfigurationRequest> licenseSpecifications) {
        if (licenseSpecifications == null) {
            this.licenseSpecifications = null;
            return;
        }

        this.licenseSpecifications = new com.amazonaws.internal.SdkInternalList<ImportImageLicenseConfigurationRequest>(licenseSpecifications);
    }

    /**
     * <p>
     * The ARNs of the license configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLicenseSpecifications(java.util.Collection)} or
     * {@link #withLicenseSpecifications(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param licenseSpecifications
     *        The ARNs of the license configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageRequest withLicenseSpecifications(ImportImageLicenseConfigurationRequest... licenseSpecifications) {
        if (this.licenseSpecifications == null) {
            setLicenseSpecifications(new com.amazonaws.internal.SdkInternalList<ImportImageLicenseConfigurationRequest>(licenseSpecifications.length));
        }
        for (ImportImageLicenseConfigurationRequest ele : licenseSpecifications) {
            this.licenseSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARNs of the license configurations.
     * </p>
     * 
     * @param licenseSpecifications
     *        The ARNs of the license configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageRequest withLicenseSpecifications(java.util.Collection<ImportImageLicenseConfigurationRequest> licenseSpecifications) {
        setLicenseSpecifications(licenseSpecifications);
        return this;
    }

    /**
     * <p>
     * The tags to apply to the import image task during creation.
     * </p>
     * 
     * @return The tags to apply to the import image task during creation.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the import image task during creation.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the import image task during creation.
     */

    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to apply to the import image task during creation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the import image task during creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageRequest withTagSpecifications(TagSpecification... tagSpecifications) {
        if (this.tagSpecifications == null) {
            setTagSpecifications(new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications.length));
        }
        for (TagSpecification ele : tagSpecifications) {
            this.tagSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to the import image task during creation.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the import image task during creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * <p>
     * The usage operation value. For more information, see <a
     * href="https://docs.aws.amazon.com/vm-import/latest/userguide/vmie_prereqs.html#prerequisites">Licensing
     * options</a> in the <i>VM Import/Export User Guide</i>.
     * </p>
     * 
     * @param usageOperation
     *        The usage operation value. For more information, see <a
     *        href="https://docs.aws.amazon.com/vm-import/latest/userguide/vmie_prereqs.html#prerequisites">Licensing
     *        options</a> in the <i>VM Import/Export User Guide</i>.
     */

    public void setUsageOperation(String usageOperation) {
        this.usageOperation = usageOperation;
    }

    /**
     * <p>
     * The usage operation value. For more information, see <a
     * href="https://docs.aws.amazon.com/vm-import/latest/userguide/vmie_prereqs.html#prerequisites">Licensing
     * options</a> in the <i>VM Import/Export User Guide</i>.
     * </p>
     * 
     * @return The usage operation value. For more information, see <a
     *         href="https://docs.aws.amazon.com/vm-import/latest/userguide/vmie_prereqs.html#prerequisites">Licensing
     *         options</a> in the <i>VM Import/Export User Guide</i>.
     */

    public String getUsageOperation() {
        return this.usageOperation;
    }

    /**
     * <p>
     * The usage operation value. For more information, see <a
     * href="https://docs.aws.amazon.com/vm-import/latest/userguide/vmie_prereqs.html#prerequisites">Licensing
     * options</a> in the <i>VM Import/Export User Guide</i>.
     * </p>
     * 
     * @param usageOperation
     *        The usage operation value. For more information, see <a
     *        href="https://docs.aws.amazon.com/vm-import/latest/userguide/vmie_prereqs.html#prerequisites">Licensing
     *        options</a> in the <i>VM Import/Export User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageRequest withUsageOperation(String usageOperation) {
        setUsageOperation(usageOperation);
        return this;
    }

    /**
     * <p>
     * The boot mode of the virtual machine.
     * </p>
     * 
     * @param bootMode
     *        The boot mode of the virtual machine.
     * @see BootModeValues
     */

    public void setBootMode(String bootMode) {
        this.bootMode = bootMode;
    }

    /**
     * <p>
     * The boot mode of the virtual machine.
     * </p>
     * 
     * @return The boot mode of the virtual machine.
     * @see BootModeValues
     */

    public String getBootMode() {
        return this.bootMode;
    }

    /**
     * <p>
     * The boot mode of the virtual machine.
     * </p>
     * 
     * @param bootMode
     *        The boot mode of the virtual machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BootModeValues
     */

    public ImportImageRequest withBootMode(String bootMode) {
        setBootMode(bootMode);
        return this;
    }

    /**
     * <p>
     * The boot mode of the virtual machine.
     * </p>
     * 
     * @param bootMode
     *        The boot mode of the virtual machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BootModeValues
     */

    public ImportImageRequest withBootMode(BootModeValues bootMode) {
        this.bootMode = bootMode.toString();
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ImportImageRequest> getDryRunRequest() {
        Request<ImportImageRequest> request = new ImportImageRequestMarshaller().marshall(this);
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
        if (getArchitecture() != null)
            sb.append("Architecture: ").append(getArchitecture()).append(",");
        if (getClientData() != null)
            sb.append("ClientData: ").append(getClientData()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDiskContainers() != null)
            sb.append("DiskContainers: ").append(getDiskContainers()).append(",");
        if (getEncrypted() != null)
            sb.append("Encrypted: ").append(getEncrypted()).append(",");
        if (getHypervisor() != null)
            sb.append("Hypervisor: ").append(getHypervisor()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getLicenseType() != null)
            sb.append("LicenseType: ").append(getLicenseType()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getRoleName() != null)
            sb.append("RoleName: ").append(getRoleName()).append(",");
        if (getLicenseSpecifications() != null)
            sb.append("LicenseSpecifications: ").append(getLicenseSpecifications()).append(",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications()).append(",");
        if (getUsageOperation() != null)
            sb.append("UsageOperation: ").append(getUsageOperation()).append(",");
        if (getBootMode() != null)
            sb.append("BootMode: ").append(getBootMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportImageRequest == false)
            return false;
        ImportImageRequest other = (ImportImageRequest) obj;
        if (other.getArchitecture() == null ^ this.getArchitecture() == null)
            return false;
        if (other.getArchitecture() != null && other.getArchitecture().equals(this.getArchitecture()) == false)
            return false;
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
        if (other.getDiskContainers() == null ^ this.getDiskContainers() == null)
            return false;
        if (other.getDiskContainers() != null && other.getDiskContainers().equals(this.getDiskContainers()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getHypervisor() == null ^ this.getHypervisor() == null)
            return false;
        if (other.getHypervisor() != null && other.getHypervisor().equals(this.getHypervisor()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getLicenseType() == null ^ this.getLicenseType() == null)
            return false;
        if (other.getLicenseType() != null && other.getLicenseType().equals(this.getLicenseType()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        if (other.getLicenseSpecifications() == null ^ this.getLicenseSpecifications() == null)
            return false;
        if (other.getLicenseSpecifications() != null && other.getLicenseSpecifications().equals(this.getLicenseSpecifications()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        if (other.getUsageOperation() == null ^ this.getUsageOperation() == null)
            return false;
        if (other.getUsageOperation() != null && other.getUsageOperation().equals(this.getUsageOperation()) == false)
            return false;
        if (other.getBootMode() == null ^ this.getBootMode() == null)
            return false;
        if (other.getBootMode() != null && other.getBootMode().equals(this.getBootMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode());
        hashCode = prime * hashCode + ((getClientData() == null) ? 0 : getClientData().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDiskContainers() == null) ? 0 : getDiskContainers().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getHypervisor() == null) ? 0 : getHypervisor().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getLicenseType() == null) ? 0 : getLicenseType().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        hashCode = prime * hashCode + ((getLicenseSpecifications() == null) ? 0 : getLicenseSpecifications().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        hashCode = prime * hashCode + ((getUsageOperation() == null) ? 0 : getUsageOperation().hashCode());
        hashCode = prime * hashCode + ((getBootMode() == null) ? 0 : getBootMode().hashCode());
        return hashCode;
    }

    @Override
    public ImportImageRequest clone() {
        return (ImportImageRequest) super.clone();
    }
}
