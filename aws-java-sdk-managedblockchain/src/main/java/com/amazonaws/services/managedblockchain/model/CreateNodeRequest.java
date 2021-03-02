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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/CreateNode" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateNodeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent
     * operation completes no more than one time. This identifier is required only if you make a service request
     * directly using an HTTP client. It is generated automatically if you use an AWS SDK or the AWS CLI.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The unique identifier of the network for the node.
     * </p>
     * <p>
     * Ethereum public networks have the following <code>NetworkId</code>s:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>n-ethereum-mainnet</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>n-ethereum-rinkeby</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>n-ethereum-ropsten</code>
     * </p>
     * </li>
     * </ul>
     */
    private String networkId;
    /**
     * <p>
     * The unique identifier of the member that owns this node.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric.
     * </p>
     */
    private String memberId;
    /**
     * <p>
     * The properties of a node configuration.
     * </p>
     */
    private NodeConfiguration nodeConfiguration;
    /**
     * <p>
     * Tags to assign to the node. Each tag consists of a key and optional value.
     * </p>
     * <p>
     * When specifying tags during creation, you can specify multiple key-value pairs in a single request, with an
     * overall maximum of 50 tags added to each resource.
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
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent
     * operation completes no more than one time. This identifier is required only if you make a service request
     * directly using an HTTP client. It is generated automatically if you use an AWS SDK or the AWS CLI.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An
     *        idempotent operation completes no more than one time. This identifier is required only if you make a
     *        service request directly using an HTTP client. It is generated automatically if you use an AWS SDK or the
     *        AWS CLI.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent
     * operation completes no more than one time. This identifier is required only if you make a service request
     * directly using an HTTP client. It is generated automatically if you use an AWS SDK or the AWS CLI.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An
     *         idempotent operation completes no more than one time. This identifier is required only if you make a
     *         service request directly using an HTTP client. It is generated automatically if you use an AWS SDK or the
     *         AWS CLI.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent
     * operation completes no more than one time. This identifier is required only if you make a service request
     * directly using an HTTP client. It is generated automatically if you use an AWS SDK or the AWS CLI.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An
     *        idempotent operation completes no more than one time. This identifier is required only if you make a
     *        service request directly using an HTTP client. It is generated automatically if you use an AWS SDK or the
     *        AWS CLI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNodeRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the network for the node.
     * </p>
     * <p>
     * Ethereum public networks have the following <code>NetworkId</code>s:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>n-ethereum-mainnet</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>n-ethereum-rinkeby</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>n-ethereum-ropsten</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param networkId
     *        The unique identifier of the network for the node.</p>
     *        <p>
     *        Ethereum public networks have the following <code>NetworkId</code>s:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>n-ethereum-mainnet</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>n-ethereum-rinkeby</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>n-ethereum-ropsten</code>
     *        </p>
     *        </li>
     */

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    /**
     * <p>
     * The unique identifier of the network for the node.
     * </p>
     * <p>
     * Ethereum public networks have the following <code>NetworkId</code>s:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>n-ethereum-mainnet</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>n-ethereum-rinkeby</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>n-ethereum-ropsten</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The unique identifier of the network for the node.</p>
     *         <p>
     *         Ethereum public networks have the following <code>NetworkId</code>s:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>n-ethereum-mainnet</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>n-ethereum-rinkeby</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>n-ethereum-ropsten</code>
     *         </p>
     *         </li>
     */

    public String getNetworkId() {
        return this.networkId;
    }

    /**
     * <p>
     * The unique identifier of the network for the node.
     * </p>
     * <p>
     * Ethereum public networks have the following <code>NetworkId</code>s:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>n-ethereum-mainnet</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>n-ethereum-rinkeby</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>n-ethereum-ropsten</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param networkId
     *        The unique identifier of the network for the node.</p>
     *        <p>
     *        Ethereum public networks have the following <code>NetworkId</code>s:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>n-ethereum-mainnet</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>n-ethereum-rinkeby</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>n-ethereum-ropsten</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNodeRequest withNetworkId(String networkId) {
        setNetworkId(networkId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the member that owns this node.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric.
     * </p>
     * 
     * @param memberId
     *        The unique identifier of the member that owns this node.</p>
     *        <p>
     *        Applies only to Hyperledger Fabric.
     */

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * <p>
     * The unique identifier of the member that owns this node.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric.
     * </p>
     * 
     * @return The unique identifier of the member that owns this node.</p>
     *         <p>
     *         Applies only to Hyperledger Fabric.
     */

    public String getMemberId() {
        return this.memberId;
    }

    /**
     * <p>
     * The unique identifier of the member that owns this node.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric.
     * </p>
     * 
     * @param memberId
     *        The unique identifier of the member that owns this node.</p>
     *        <p>
     *        Applies only to Hyperledger Fabric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNodeRequest withMemberId(String memberId) {
        setMemberId(memberId);
        return this;
    }

    /**
     * <p>
     * The properties of a node configuration.
     * </p>
     * 
     * @param nodeConfiguration
     *        The properties of a node configuration.
     */

    public void setNodeConfiguration(NodeConfiguration nodeConfiguration) {
        this.nodeConfiguration = nodeConfiguration;
    }

    /**
     * <p>
     * The properties of a node configuration.
     * </p>
     * 
     * @return The properties of a node configuration.
     */

    public NodeConfiguration getNodeConfiguration() {
        return this.nodeConfiguration;
    }

    /**
     * <p>
     * The properties of a node configuration.
     * </p>
     * 
     * @param nodeConfiguration
     *        The properties of a node configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNodeRequest withNodeConfiguration(NodeConfiguration nodeConfiguration) {
        setNodeConfiguration(nodeConfiguration);
        return this;
    }

    /**
     * <p>
     * Tags to assign to the node. Each tag consists of a key and optional value.
     * </p>
     * <p>
     * When specifying tags during creation, you can specify multiple key-value pairs in a single request, with an
     * overall maximum of 50 tags added to each resource.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html">Tagging
     * Resources</a> in the <i>Amazon Managed Blockchain Ethereum Developer Guide</i>, or <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html"
     * >Tagging Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.
     * </p>
     * 
     * @return Tags to assign to the node. Each tag consists of a key and optional value.</p>
     *         <p>
     *         When specifying tags during creation, you can specify multiple key-value pairs in a single request, with
     *         an overall maximum of 50 tags added to each resource.
     *         </p>
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
     * Tags to assign to the node. Each tag consists of a key and optional value.
     * </p>
     * <p>
     * When specifying tags during creation, you can specify multiple key-value pairs in a single request, with an
     * overall maximum of 50 tags added to each resource.
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
     *        Tags to assign to the node. Each tag consists of a key and optional value.</p>
     *        <p>
     *        When specifying tags during creation, you can specify multiple key-value pairs in a single request, with
     *        an overall maximum of 50 tags added to each resource.
     *        </p>
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
     * Tags to assign to the node. Each tag consists of a key and optional value.
     * </p>
     * <p>
     * When specifying tags during creation, you can specify multiple key-value pairs in a single request, with an
     * overall maximum of 50 tags added to each resource.
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
     *        Tags to assign to the node. Each tag consists of a key and optional value.</p>
     *        <p>
     *        When specifying tags during creation, you can specify multiple key-value pairs in a single request, with
     *        an overall maximum of 50 tags added to each resource.
     *        </p>
     *        <p>
     *        For more information about tags, see <a
     *        href="https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html">Tagging
     *        Resources</a> in the <i>Amazon Managed Blockchain Ethereum Developer Guide</i>, or <a href=
     *        "https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html"
     *        >Tagging Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNodeRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateNodeRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateNodeRequest addTagsEntry(String key, String value) {
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

    public CreateNodeRequest clearTagsEntries() {
        this.tags = null;
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getNetworkId() != null)
            sb.append("NetworkId: ").append(getNetworkId()).append(",");
        if (getMemberId() != null)
            sb.append("MemberId: ").append(getMemberId()).append(",");
        if (getNodeConfiguration() != null)
            sb.append("NodeConfiguration: ").append(getNodeConfiguration()).append(",");
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

        if (obj instanceof CreateNodeRequest == false)
            return false;
        CreateNodeRequest other = (CreateNodeRequest) obj;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getNetworkId() == null ^ this.getNetworkId() == null)
            return false;
        if (other.getNetworkId() != null && other.getNetworkId().equals(this.getNetworkId()) == false)
            return false;
        if (other.getMemberId() == null ^ this.getMemberId() == null)
            return false;
        if (other.getMemberId() != null && other.getMemberId().equals(this.getMemberId()) == false)
            return false;
        if (other.getNodeConfiguration() == null ^ this.getNodeConfiguration() == null)
            return false;
        if (other.getNodeConfiguration() != null && other.getNodeConfiguration().equals(this.getNodeConfiguration()) == false)
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

        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getNetworkId() == null) ? 0 : getNetworkId().hashCode());
        hashCode = prime * hashCode + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        hashCode = prime * hashCode + ((getNodeConfiguration() == null) ? 0 : getNodeConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateNodeRequest clone() {
        return (CreateNodeRequest) super.clone();
    }

}
