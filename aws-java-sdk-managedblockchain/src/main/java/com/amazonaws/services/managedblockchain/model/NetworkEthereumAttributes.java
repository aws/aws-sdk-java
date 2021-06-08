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
 * Attributes of Ethereum for a network.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/NetworkEthereumAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkEthereumAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Ethereum <code>CHAIN_ID</code> associated with the Ethereum network. Chain IDs are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * mainnet = <code>1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * rinkeby = <code>4</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ropsten = <code>3</code>
     * </p>
     * </li>
     * </ul>
     */
    private String chainId;

    /**
     * <p>
     * The Ethereum <code>CHAIN_ID</code> associated with the Ethereum network. Chain IDs are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * mainnet = <code>1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * rinkeby = <code>4</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ropsten = <code>3</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param chainId
     *        The Ethereum <code>CHAIN_ID</code> associated with the Ethereum network. Chain IDs are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        mainnet = <code>1</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        rinkeby = <code>4</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ropsten = <code>3</code>
     *        </p>
     *        </li>
     */

    public void setChainId(String chainId) {
        this.chainId = chainId;
    }

    /**
     * <p>
     * The Ethereum <code>CHAIN_ID</code> associated with the Ethereum network. Chain IDs are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * mainnet = <code>1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * rinkeby = <code>4</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ropsten = <code>3</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Ethereum <code>CHAIN_ID</code> associated with the Ethereum network. Chain IDs are as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         mainnet = <code>1</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         rinkeby = <code>4</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ropsten = <code>3</code>
     *         </p>
     *         </li>
     */

    public String getChainId() {
        return this.chainId;
    }

    /**
     * <p>
     * The Ethereum <code>CHAIN_ID</code> associated with the Ethereum network. Chain IDs are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * mainnet = <code>1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * rinkeby = <code>4</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ropsten = <code>3</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param chainId
     *        The Ethereum <code>CHAIN_ID</code> associated with the Ethereum network. Chain IDs are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        mainnet = <code>1</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        rinkeby = <code>4</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ropsten = <code>3</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkEthereumAttributes withChainId(String chainId) {
        setChainId(chainId);
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
        if (getChainId() != null)
            sb.append("ChainId: ").append(getChainId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkEthereumAttributes == false)
            return false;
        NetworkEthereumAttributes other = (NetworkEthereumAttributes) obj;
        if (other.getChainId() == null ^ this.getChainId() == null)
            return false;
        if (other.getChainId() != null && other.getChainId().equals(this.getChainId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChainId() == null) ? 0 : getChainId().hashCode());
        return hashCode;
    }

    @Override
    public NetworkEthereumAttributes clone() {
        try {
            return (NetworkEthereumAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchain.model.transform.NetworkEthereumAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
