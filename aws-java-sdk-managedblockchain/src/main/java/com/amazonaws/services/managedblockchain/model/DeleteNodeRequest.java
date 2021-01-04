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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/DeleteNode" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteNodeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the network that the node is on.
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
     * Applies only to Hyperledger Fabric and is required for Hyperledger Fabric.
     * </p>
     */
    private String memberId;
    /**
     * <p>
     * The unique identifier of the node.
     * </p>
     */
    private String nodeId;

    /**
     * <p>
     * The unique identifier of the network that the node is on.
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
     *        The unique identifier of the network that the node is on.</p>
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
     * The unique identifier of the network that the node is on.
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
     * @return The unique identifier of the network that the node is on.</p>
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
     * The unique identifier of the network that the node is on.
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
     *        The unique identifier of the network that the node is on.</p>
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

    public DeleteNodeRequest withNetworkId(String networkId) {
        setNetworkId(networkId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the member that owns this node.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric and is required for Hyperledger Fabric.
     * </p>
     * 
     * @param memberId
     *        The unique identifier of the member that owns this node.</p>
     *        <p>
     *        Applies only to Hyperledger Fabric and is required for Hyperledger Fabric.
     */

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * <p>
     * The unique identifier of the member that owns this node.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric and is required for Hyperledger Fabric.
     * </p>
     * 
     * @return The unique identifier of the member that owns this node.</p>
     *         <p>
     *         Applies only to Hyperledger Fabric and is required for Hyperledger Fabric.
     */

    public String getMemberId() {
        return this.memberId;
    }

    /**
     * <p>
     * The unique identifier of the member that owns this node.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric and is required for Hyperledger Fabric.
     * </p>
     * 
     * @param memberId
     *        The unique identifier of the member that owns this node.</p>
     *        <p>
     *        Applies only to Hyperledger Fabric and is required for Hyperledger Fabric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteNodeRequest withMemberId(String memberId) {
        setMemberId(memberId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the node.
     * </p>
     * 
     * @param nodeId
     *        The unique identifier of the node.
     */

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * <p>
     * The unique identifier of the node.
     * </p>
     * 
     * @return The unique identifier of the node.
     */

    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * <p>
     * The unique identifier of the node.
     * </p>
     * 
     * @param nodeId
     *        The unique identifier of the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteNodeRequest withNodeId(String nodeId) {
        setNodeId(nodeId);
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
        if (getNetworkId() != null)
            sb.append("NetworkId: ").append(getNetworkId()).append(",");
        if (getMemberId() != null)
            sb.append("MemberId: ").append(getMemberId()).append(",");
        if (getNodeId() != null)
            sb.append("NodeId: ").append(getNodeId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteNodeRequest == false)
            return false;
        DeleteNodeRequest other = (DeleteNodeRequest) obj;
        if (other.getNetworkId() == null ^ this.getNetworkId() == null)
            return false;
        if (other.getNetworkId() != null && other.getNetworkId().equals(this.getNetworkId()) == false)
            return false;
        if (other.getMemberId() == null ^ this.getMemberId() == null)
            return false;
        if (other.getMemberId() != null && other.getMemberId().equals(this.getMemberId()) == false)
            return false;
        if (other.getNodeId() == null ^ this.getNodeId() == null)
            return false;
        if (other.getNodeId() != null && other.getNodeId().equals(this.getNodeId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkId() == null) ? 0 : getNetworkId().hashCode());
        hashCode = prime * hashCode + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        hashCode = prime * hashCode + ((getNodeId() == null) ? 0 : getNodeId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteNodeRequest clone() {
        return (DeleteNodeRequest) super.clone();
    }

}
