/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The properties of the Accessor.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/Accessor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Accessor implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the accessor.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The type of the accessor.
     * </p>
     * <note>
     * <p>
     * Currently, accessor type is restricted to <code>BILLING_TOKEN</code>.
     * </p>
     * </note>
     */
    private String type;
    /**
     * <p>
     * The billing token is a property of the Accessor. Use this token to when making calls to the blockchain network.
     * The billing token is used to track your accessor token for billing requests.
     * </p>
     */
    private String billingToken;
    /**
     * <p>
     * The current status of the accessor.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The creation date and time of the accessor.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the accessor. For more information about ARNs and their format, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The tags assigned to the Accessor.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html">Tagging
     * Resources</a> in the <i>Amazon Managed Blockchain Ethereum Developer Guide</i>, or <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html"
     * >Tagging Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The blockchain network that the Accessor token is created for.
     * </p>
     */
    private String networkType;

    /**
     * <p>
     * The unique identifier of the accessor.
     * </p>
     * 
     * @param id
     *        The unique identifier of the accessor.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of the accessor.
     * </p>
     * 
     * @return The unique identifier of the accessor.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier of the accessor.
     * </p>
     * 
     * @param id
     *        The unique identifier of the accessor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Accessor withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The type of the accessor.
     * </p>
     * <note>
     * <p>
     * Currently, accessor type is restricted to <code>BILLING_TOKEN</code>.
     * </p>
     * </note>
     * 
     * @param type
     *        The type of the accessor.</p> <note>
     *        <p>
     *        Currently, accessor type is restricted to <code>BILLING_TOKEN</code>.
     *        </p>
     * @see AccessorType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the accessor.
     * </p>
     * <note>
     * <p>
     * Currently, accessor type is restricted to <code>BILLING_TOKEN</code>.
     * </p>
     * </note>
     * 
     * @return The type of the accessor.</p> <note>
     *         <p>
     *         Currently, accessor type is restricted to <code>BILLING_TOKEN</code>.
     *         </p>
     * @see AccessorType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the accessor.
     * </p>
     * <note>
     * <p>
     * Currently, accessor type is restricted to <code>BILLING_TOKEN</code>.
     * </p>
     * </note>
     * 
     * @param type
     *        The type of the accessor.</p> <note>
     *        <p>
     *        Currently, accessor type is restricted to <code>BILLING_TOKEN</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessorType
     */

    public Accessor withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the accessor.
     * </p>
     * <note>
     * <p>
     * Currently, accessor type is restricted to <code>BILLING_TOKEN</code>.
     * </p>
     * </note>
     * 
     * @param type
     *        The type of the accessor.</p> <note>
     *        <p>
     *        Currently, accessor type is restricted to <code>BILLING_TOKEN</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessorType
     */

    public Accessor withType(AccessorType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The billing token is a property of the Accessor. Use this token to when making calls to the blockchain network.
     * The billing token is used to track your accessor token for billing requests.
     * </p>
     * 
     * @param billingToken
     *        The billing token is a property of the Accessor. Use this token to when making calls to the blockchain
     *        network. The billing token is used to track your accessor token for billing requests.
     */

    public void setBillingToken(String billingToken) {
        this.billingToken = billingToken;
    }

    /**
     * <p>
     * The billing token is a property of the Accessor. Use this token to when making calls to the blockchain network.
     * The billing token is used to track your accessor token for billing requests.
     * </p>
     * 
     * @return The billing token is a property of the Accessor. Use this token to when making calls to the blockchain
     *         network. The billing token is used to track your accessor token for billing requests.
     */

    public String getBillingToken() {
        return this.billingToken;
    }

    /**
     * <p>
     * The billing token is a property of the Accessor. Use this token to when making calls to the blockchain network.
     * The billing token is used to track your accessor token for billing requests.
     * </p>
     * 
     * @param billingToken
     *        The billing token is a property of the Accessor. Use this token to when making calls to the blockchain
     *        network. The billing token is used to track your accessor token for billing requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Accessor withBillingToken(String billingToken) {
        setBillingToken(billingToken);
        return this;
    }

    /**
     * <p>
     * The current status of the accessor.
     * </p>
     * 
     * @param status
     *        The current status of the accessor.
     * @see AccessorStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the accessor.
     * </p>
     * 
     * @return The current status of the accessor.
     * @see AccessorStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the accessor.
     * </p>
     * 
     * @param status
     *        The current status of the accessor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessorStatus
     */

    public Accessor withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the accessor.
     * </p>
     * 
     * @param status
     *        The current status of the accessor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessorStatus
     */

    public Accessor withStatus(AccessorStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The creation date and time of the accessor.
     * </p>
     * 
     * @param creationDate
     *        The creation date and time of the accessor.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The creation date and time of the accessor.
     * </p>
     * 
     * @return The creation date and time of the accessor.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The creation date and time of the accessor.
     * </p>
     * 
     * @param creationDate
     *        The creation date and time of the accessor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Accessor withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the accessor. For more information about ARNs and their format, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the accessor. For more information about ARNs and their format, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the accessor. For more information about ARNs and their format, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the accessor. For more information about ARNs and their format, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the accessor. For more information about ARNs and their format, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the accessor. For more information about ARNs and their format, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Accessor withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The tags assigned to the Accessor.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html">Tagging
     * Resources</a> in the <i>Amazon Managed Blockchain Ethereum Developer Guide</i>, or <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html"
     * >Tagging Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.
     * </p>
     * 
     * @return The tags assigned to the Accessor.</p>
     *         <p>
     *         For more information about tags, see <a
     *         href="https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html">Tagging
     *         Resources</a> in the <i>Amazon Managed Blockchain Ethereum Developer Guide</i>, or <a href=
     *         "https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html"
     *         >Tagging Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the Accessor.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html">Tagging
     * Resources</a> in the <i>Amazon Managed Blockchain Ethereum Developer Guide</i>, or <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html"
     * >Tagging Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the Accessor.</p>
     *        <p>
     *        For more information about tags, see <a
     *        href="https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html">Tagging
     *        Resources</a> in the <i>Amazon Managed Blockchain Ethereum Developer Guide</i>, or <a href=
     *        "https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html"
     *        >Tagging Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags assigned to the Accessor.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html">Tagging
     * Resources</a> in the <i>Amazon Managed Blockchain Ethereum Developer Guide</i>, or <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html"
     * >Tagging Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the Accessor.</p>
     *        <p>
     *        For more information about tags, see <a
     *        href="https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html">Tagging
     *        Resources</a> in the <i>Amazon Managed Blockchain Ethereum Developer Guide</i>, or <a href=
     *        "https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html"
     *        >Tagging Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Accessor withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Accessor#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Accessor addTagsEntry(String key, String value) {
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

    public Accessor clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The blockchain network that the Accessor token is created for.
     * </p>
     * 
     * @param networkType
     *        The blockchain network that the Accessor token is created for.
     * @see AccessorNetworkType
     */

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    /**
     * <p>
     * The blockchain network that the Accessor token is created for.
     * </p>
     * 
     * @return The blockchain network that the Accessor token is created for.
     * @see AccessorNetworkType
     */

    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * <p>
     * The blockchain network that the Accessor token is created for.
     * </p>
     * 
     * @param networkType
     *        The blockchain network that the Accessor token is created for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessorNetworkType
     */

    public Accessor withNetworkType(String networkType) {
        setNetworkType(networkType);
        return this;
    }

    /**
     * <p>
     * The blockchain network that the Accessor token is created for.
     * </p>
     * 
     * @param networkType
     *        The blockchain network that the Accessor token is created for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessorNetworkType
     */

    public Accessor withNetworkType(AccessorNetworkType networkType) {
        this.networkType = networkType.toString();
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getBillingToken() != null)
            sb.append("BillingToken: ").append(getBillingToken()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getNetworkType() != null)
            sb.append("NetworkType: ").append(getNetworkType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Accessor == false)
            return false;
        Accessor other = (Accessor) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getBillingToken() == null ^ this.getBillingToken() == null)
            return false;
        if (other.getBillingToken() != null && other.getBillingToken().equals(this.getBillingToken()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getNetworkType() == null ^ this.getNetworkType() == null)
            return false;
        if (other.getNetworkType() != null && other.getNetworkType().equals(this.getNetworkType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getBillingToken() == null) ? 0 : getBillingToken().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getNetworkType() == null) ? 0 : getNetworkType().hashCode());
        return hashCode;
    }

    @Override
    public Accessor clone() {
        try {
            return (Accessor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchain.model.transform.AccessorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
