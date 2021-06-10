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
package com.amazonaws.services.managedblockchain.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration properties of the member.
 * </p>
 * <p>
 * Applies only to Hyperledger Fabric.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/MemberConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MemberConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the member.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An optional description of the member.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Configuration properties of the blockchain framework relevant to the member.
     * </p>
     */
    private MemberFrameworkConfiguration frameworkConfiguration;
    /**
     * <p>
     * Configuration properties for logging events associated with a member of a Managed Blockchain network.
     * </p>
     */
    private MemberLogPublishingConfiguration logPublishingConfiguration;
    /**
     * <p>
     * Tags assigned to the member. Tags consist of a key and optional value. For more information about tags, see <a
     * href
     * ="https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html">Tagging
     * Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.
     * </p>
     * <p>
     * When specifying tags during creation, you can specify multiple key-value pairs in a single request, with an
     * overall maximum of 50 tags added to each resource.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the customer managed key in AWS Key Management Service (AWS KMS) to use for
     * encryption at rest in the member. This parameter is inherited by any nodes that this member creates.
     * </p>
     * <p>
     * Use one of the following options to specify this parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Undefined or empty string</b> - The member uses an AWS owned KMS key for encryption by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>A valid symmetric customer managed KMS key</b> - The member uses the specified key for encryption.
     * </p>
     * <p>
     * Amazon Managed Blockchain doesn't support asymmetric keys. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using symmetric and
     * asymmetric keys</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * The following is an example of a KMS key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     */
    private String kmsKeyArn;

    /**
     * <p>
     * The name of the member.
     * </p>
     * 
     * @param name
     *        The name of the member.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the member.
     * </p>
     * 
     * @return The name of the member.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the member.
     * </p>
     * 
     * @param name
     *        The name of the member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberConfiguration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An optional description of the member.
     * </p>
     * 
     * @param description
     *        An optional description of the member.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description of the member.
     * </p>
     * 
     * @return An optional description of the member.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An optional description of the member.
     * </p>
     * 
     * @param description
     *        An optional description of the member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberConfiguration withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Configuration properties of the blockchain framework relevant to the member.
     * </p>
     * 
     * @param frameworkConfiguration
     *        Configuration properties of the blockchain framework relevant to the member.
     */

    public void setFrameworkConfiguration(MemberFrameworkConfiguration frameworkConfiguration) {
        this.frameworkConfiguration = frameworkConfiguration;
    }

    /**
     * <p>
     * Configuration properties of the blockchain framework relevant to the member.
     * </p>
     * 
     * @return Configuration properties of the blockchain framework relevant to the member.
     */

    public MemberFrameworkConfiguration getFrameworkConfiguration() {
        return this.frameworkConfiguration;
    }

    /**
     * <p>
     * Configuration properties of the blockchain framework relevant to the member.
     * </p>
     * 
     * @param frameworkConfiguration
     *        Configuration properties of the blockchain framework relevant to the member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberConfiguration withFrameworkConfiguration(MemberFrameworkConfiguration frameworkConfiguration) {
        setFrameworkConfiguration(frameworkConfiguration);
        return this;
    }

    /**
     * <p>
     * Configuration properties for logging events associated with a member of a Managed Blockchain network.
     * </p>
     * 
     * @param logPublishingConfiguration
     *        Configuration properties for logging events associated with a member of a Managed Blockchain network.
     */

    public void setLogPublishingConfiguration(MemberLogPublishingConfiguration logPublishingConfiguration) {
        this.logPublishingConfiguration = logPublishingConfiguration;
    }

    /**
     * <p>
     * Configuration properties for logging events associated with a member of a Managed Blockchain network.
     * </p>
     * 
     * @return Configuration properties for logging events associated with a member of a Managed Blockchain network.
     */

    public MemberLogPublishingConfiguration getLogPublishingConfiguration() {
        return this.logPublishingConfiguration;
    }

    /**
     * <p>
     * Configuration properties for logging events associated with a member of a Managed Blockchain network.
     * </p>
     * 
     * @param logPublishingConfiguration
     *        Configuration properties for logging events associated with a member of a Managed Blockchain network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberConfiguration withLogPublishingConfiguration(MemberLogPublishingConfiguration logPublishingConfiguration) {
        setLogPublishingConfiguration(logPublishingConfiguration);
        return this;
    }

    /**
     * <p>
     * Tags assigned to the member. Tags consist of a key and optional value. For more information about tags, see <a
     * href
     * ="https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html">Tagging
     * Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.
     * </p>
     * <p>
     * When specifying tags during creation, you can specify multiple key-value pairs in a single request, with an
     * overall maximum of 50 tags added to each resource.
     * </p>
     * 
     * @return Tags assigned to the member. Tags consist of a key and optional value. For more information about tags,
     *         see <a href=
     *         "https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html"
     *         >Tagging Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.</p>
     *         <p>
     *         When specifying tags during creation, you can specify multiple key-value pairs in a single request, with
     *         an overall maximum of 50 tags added to each resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags assigned to the member. Tags consist of a key and optional value. For more information about tags, see <a
     * href
     * ="https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html">Tagging
     * Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.
     * </p>
     * <p>
     * When specifying tags during creation, you can specify multiple key-value pairs in a single request, with an
     * overall maximum of 50 tags added to each resource.
     * </p>
     * 
     * @param tags
     *        Tags assigned to the member. Tags consist of a key and optional value. For more information about tags,
     *        see <a href=
     *        "https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html"
     *        >Tagging Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.</p>
     *        <p>
     *        When specifying tags during creation, you can specify multiple key-value pairs in a single request, with
     *        an overall maximum of 50 tags added to each resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags assigned to the member. Tags consist of a key and optional value. For more information about tags, see <a
     * href
     * ="https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html">Tagging
     * Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.
     * </p>
     * <p>
     * When specifying tags during creation, you can specify multiple key-value pairs in a single request, with an
     * overall maximum of 50 tags added to each resource.
     * </p>
     * 
     * @param tags
     *        Tags assigned to the member. Tags consist of a key and optional value. For more information about tags,
     *        see <a href=
     *        "https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html"
     *        >Tagging Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.</p>
     *        <p>
     *        When specifying tags during creation, you can specify multiple key-value pairs in a single request, with
     *        an overall maximum of 50 tags added to each resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberConfiguration withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see MemberConfiguration#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public MemberConfiguration addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberConfiguration clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the customer managed key in AWS Key Management Service (AWS KMS) to use for
     * encryption at rest in the member. This parameter is inherited by any nodes that this member creates.
     * </p>
     * <p>
     * Use one of the following options to specify this parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Undefined or empty string</b> - The member uses an AWS owned KMS key for encryption by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>A valid symmetric customer managed KMS key</b> - The member uses the specified key for encryption.
     * </p>
     * <p>
     * Amazon Managed Blockchain doesn't support asymmetric keys. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using symmetric and
     * asymmetric keys</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * The following is an example of a KMS key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the customer managed key in AWS Key Management Service (AWS KMS) to use
     *        for encryption at rest in the member. This parameter is inherited by any nodes that this member
     *        creates.</p>
     *        <p>
     *        Use one of the following options to specify this parameter:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Undefined or empty string</b> - The member uses an AWS owned KMS key for encryption by default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>A valid symmetric customer managed KMS key</b> - The member uses the specified key for encryption.
     *        </p>
     *        <p>
     *        Amazon Managed Blockchain doesn't support asymmetric keys. For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using symmetric and
     *        asymmetric keys</a> in the <i>AWS Key Management Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        The following is an example of a KMS key ARN:
     *        <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the customer managed key in AWS Key Management Service (AWS KMS) to use for
     * encryption at rest in the member. This parameter is inherited by any nodes that this member creates.
     * </p>
     * <p>
     * Use one of the following options to specify this parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Undefined or empty string</b> - The member uses an AWS owned KMS key for encryption by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>A valid symmetric customer managed KMS key</b> - The member uses the specified key for encryption.
     * </p>
     * <p>
     * Amazon Managed Blockchain doesn't support asymmetric keys. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using symmetric and
     * asymmetric keys</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * The following is an example of a KMS key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) of the customer managed key in AWS Key Management Service (AWS KMS) to use
     *         for encryption at rest in the member. This parameter is inherited by any nodes that this member
     *         creates.</p>
     *         <p>
     *         Use one of the following options to specify this parameter:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Undefined or empty string</b> - The member uses an AWS owned KMS key for encryption by default.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>A valid symmetric customer managed KMS key</b> - The member uses the specified key for encryption.
     *         </p>
     *         <p>
     *         Amazon Managed Blockchain doesn't support asymmetric keys. For more information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using symmetric
     *         and asymmetric keys</a> in the <i>AWS Key Management Service Developer Guide</i>.
     *         </p>
     *         <p>
     *         The following is an example of a KMS key ARN:
     *         <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the customer managed key in AWS Key Management Service (AWS KMS) to use for
     * encryption at rest in the member. This parameter is inherited by any nodes that this member creates.
     * </p>
     * <p>
     * Use one of the following options to specify this parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Undefined or empty string</b> - The member uses an AWS owned KMS key for encryption by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>A valid symmetric customer managed KMS key</b> - The member uses the specified key for encryption.
     * </p>
     * <p>
     * Amazon Managed Blockchain doesn't support asymmetric keys. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using symmetric and
     * asymmetric keys</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * The following is an example of a KMS key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the customer managed key in AWS Key Management Service (AWS KMS) to use
     *        for encryption at rest in the member. This parameter is inherited by any nodes that this member
     *        creates.</p>
     *        <p>
     *        Use one of the following options to specify this parameter:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Undefined or empty string</b> - The member uses an AWS owned KMS key for encryption by default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>A valid symmetric customer managed KMS key</b> - The member uses the specified key for encryption.
     *        </p>
     *        <p>
     *        Amazon Managed Blockchain doesn't support asymmetric keys. For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using symmetric and
     *        asymmetric keys</a> in the <i>AWS Key Management Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        The following is an example of a KMS key ARN:
     *        <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberConfiguration withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getFrameworkConfiguration() != null)
            sb.append("FrameworkConfiguration: ").append(getFrameworkConfiguration()).append(",");
        if (getLogPublishingConfiguration() != null)
            sb.append("LogPublishingConfiguration: ").append(getLogPublishingConfiguration()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MemberConfiguration == false)
            return false;
        MemberConfiguration other = (MemberConfiguration) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFrameworkConfiguration() == null ^ this.getFrameworkConfiguration() == null)
            return false;
        if (other.getFrameworkConfiguration() != null && other.getFrameworkConfiguration().equals(this.getFrameworkConfiguration()) == false)
            return false;
        if (other.getLogPublishingConfiguration() == null ^ this.getLogPublishingConfiguration() == null)
            return false;
        if (other.getLogPublishingConfiguration() != null && other.getLogPublishingConfiguration().equals(this.getLogPublishingConfiguration()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFrameworkConfiguration() == null) ? 0 : getFrameworkConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLogPublishingConfiguration() == null) ? 0 : getLogPublishingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public MemberConfiguration clone() {
        try {
            return (MemberConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchain.model.transform.MemberConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
