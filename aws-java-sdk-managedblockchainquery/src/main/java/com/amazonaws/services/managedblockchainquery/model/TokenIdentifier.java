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
package com.amazonaws.services.managedblockchainquery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The container for the identifier for the token including the unique token ID and its blockchain network.
 * </p>
 * <note>
 * <p>
 * Only the native tokens BTC and ETH, and the ERC-20, ERC-721, and ERC 1155 token standards are supported.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/TokenIdentifier"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TokenIdentifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The blockchain network of the token.
     * </p>
     */
    private String network;
    /**
     * <p>
     * This is the token's contract address.
     * </p>
     */
    private String contractAddress;
    /**
     * <p>
     * The unique identifier of the token.
     * </p>
     * <note>
     * <p>
     * For native tokens, use the 3 character abbreviation that best matches your token. For example, btc for Bitcoin,
     * eth for Ether, etc. For all other token types you must specify the <code>tokenId</code> in the 64 character
     * hexadecimal <code>tokenid</code> format.
     * </p>
     * </note>
     */
    private String tokenId;

    /**
     * <p>
     * The blockchain network of the token.
     * </p>
     * 
     * @param network
     *        The blockchain network of the token.
     * @see QueryNetwork
     */

    public void setNetwork(String network) {
        this.network = network;
    }

    /**
     * <p>
     * The blockchain network of the token.
     * </p>
     * 
     * @return The blockchain network of the token.
     * @see QueryNetwork
     */

    public String getNetwork() {
        return this.network;
    }

    /**
     * <p>
     * The blockchain network of the token.
     * </p>
     * 
     * @param network
     *        The blockchain network of the token.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryNetwork
     */

    public TokenIdentifier withNetwork(String network) {
        setNetwork(network);
        return this;
    }

    /**
     * <p>
     * The blockchain network of the token.
     * </p>
     * 
     * @param network
     *        The blockchain network of the token.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryNetwork
     */

    public TokenIdentifier withNetwork(QueryNetwork network) {
        this.network = network.toString();
        return this;
    }

    /**
     * <p>
     * This is the token's contract address.
     * </p>
     * 
     * @param contractAddress
     *        This is the token's contract address.
     */

    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }

    /**
     * <p>
     * This is the token's contract address.
     * </p>
     * 
     * @return This is the token's contract address.
     */

    public String getContractAddress() {
        return this.contractAddress;
    }

    /**
     * <p>
     * This is the token's contract address.
     * </p>
     * 
     * @param contractAddress
     *        This is the token's contract address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TokenIdentifier withContractAddress(String contractAddress) {
        setContractAddress(contractAddress);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the token.
     * </p>
     * <note>
     * <p>
     * For native tokens, use the 3 character abbreviation that best matches your token. For example, btc for Bitcoin,
     * eth for Ether, etc. For all other token types you must specify the <code>tokenId</code> in the 64 character
     * hexadecimal <code>tokenid</code> format.
     * </p>
     * </note>
     * 
     * @param tokenId
     *        The unique identifier of the token.</p> <note>
     *        <p>
     *        For native tokens, use the 3 character abbreviation that best matches your token. For example, btc for
     *        Bitcoin, eth for Ether, etc. For all other token types you must specify the <code>tokenId</code> in the 64
     *        character hexadecimal <code>tokenid</code> format.
     *        </p>
     */

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    /**
     * <p>
     * The unique identifier of the token.
     * </p>
     * <note>
     * <p>
     * For native tokens, use the 3 character abbreviation that best matches your token. For example, btc for Bitcoin,
     * eth for Ether, etc. For all other token types you must specify the <code>tokenId</code> in the 64 character
     * hexadecimal <code>tokenid</code> format.
     * </p>
     * </note>
     * 
     * @return The unique identifier of the token.</p> <note>
     *         <p>
     *         For native tokens, use the 3 character abbreviation that best matches your token. For example, btc for
     *         Bitcoin, eth for Ether, etc. For all other token types you must specify the <code>tokenId</code> in the
     *         64 character hexadecimal <code>tokenid</code> format.
     *         </p>
     */

    public String getTokenId() {
        return this.tokenId;
    }

    /**
     * <p>
     * The unique identifier of the token.
     * </p>
     * <note>
     * <p>
     * For native tokens, use the 3 character abbreviation that best matches your token. For example, btc for Bitcoin,
     * eth for Ether, etc. For all other token types you must specify the <code>tokenId</code> in the 64 character
     * hexadecimal <code>tokenid</code> format.
     * </p>
     * </note>
     * 
     * @param tokenId
     *        The unique identifier of the token.</p> <note>
     *        <p>
     *        For native tokens, use the 3 character abbreviation that best matches your token. For example, btc for
     *        Bitcoin, eth for Ether, etc. For all other token types you must specify the <code>tokenId</code> in the 64
     *        character hexadecimal <code>tokenid</code> format.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TokenIdentifier withTokenId(String tokenId) {
        setTokenId(tokenId);
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
        if (getNetwork() != null)
            sb.append("Network: ").append(getNetwork()).append(",");
        if (getContractAddress() != null)
            sb.append("ContractAddress: ").append(getContractAddress()).append(",");
        if (getTokenId() != null)
            sb.append("TokenId: ").append(getTokenId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TokenIdentifier == false)
            return false;
        TokenIdentifier other = (TokenIdentifier) obj;
        if (other.getNetwork() == null ^ this.getNetwork() == null)
            return false;
        if (other.getNetwork() != null && other.getNetwork().equals(this.getNetwork()) == false)
            return false;
        if (other.getContractAddress() == null ^ this.getContractAddress() == null)
            return false;
        if (other.getContractAddress() != null && other.getContractAddress().equals(this.getContractAddress()) == false)
            return false;
        if (other.getTokenId() == null ^ this.getTokenId() == null)
            return false;
        if (other.getTokenId() != null && other.getTokenId().equals(this.getTokenId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetwork() == null) ? 0 : getNetwork().hashCode());
        hashCode = prime * hashCode + ((getContractAddress() == null) ? 0 : getContractAddress().hashCode());
        hashCode = prime * hashCode + ((getTokenId() == null) ? 0 : getTokenId().hashCode());
        return hashCode;
    }

    @Override
    public TokenIdentifier clone() {
        try {
            return (TokenIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchainquery.model.transform.TokenIdentifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
