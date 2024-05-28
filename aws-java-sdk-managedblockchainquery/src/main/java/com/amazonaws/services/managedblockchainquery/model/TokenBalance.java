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
 * The balance of the token.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/TokenBalance"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TokenBalance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The container for the identifier of the owner.
     * </p>
     */
    private OwnerIdentifier ownerIdentifier;
    /**
     * <p>
     * The identifier for the token, including the unique token ID and its blockchain network.
     * </p>
     */
    private TokenIdentifier tokenIdentifier;
    /**
     * <p>
     * The container of the token balance.
     * </p>
     */
    private String balance;
    /**
     * <p>
     * The time for when the TokenBalance is requested or the current time if a time is not provided in the request.
     * </p>
     * <note>
     * <p>
     * This time will only be recorded up to the second.
     * </p>
     * </note>
     */
    private BlockchainInstant atBlockchainInstant;
    /**
     * <p>
     * The <code>Timestamp</code> of the last transaction at which the balance for the token in the wallet was updated.
     * </p>
     */
    private BlockchainInstant lastUpdatedTime;

    /**
     * <p>
     * The container for the identifier of the owner.
     * </p>
     * 
     * @param ownerIdentifier
     *        The container for the identifier of the owner.
     */

    public void setOwnerIdentifier(OwnerIdentifier ownerIdentifier) {
        this.ownerIdentifier = ownerIdentifier;
    }

    /**
     * <p>
     * The container for the identifier of the owner.
     * </p>
     * 
     * @return The container for the identifier of the owner.
     */

    public OwnerIdentifier getOwnerIdentifier() {
        return this.ownerIdentifier;
    }

    /**
     * <p>
     * The container for the identifier of the owner.
     * </p>
     * 
     * @param ownerIdentifier
     *        The container for the identifier of the owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TokenBalance withOwnerIdentifier(OwnerIdentifier ownerIdentifier) {
        setOwnerIdentifier(ownerIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier for the token, including the unique token ID and its blockchain network.
     * </p>
     * 
     * @param tokenIdentifier
     *        The identifier for the token, including the unique token ID and its blockchain network.
     */

    public void setTokenIdentifier(TokenIdentifier tokenIdentifier) {
        this.tokenIdentifier = tokenIdentifier;
    }

    /**
     * <p>
     * The identifier for the token, including the unique token ID and its blockchain network.
     * </p>
     * 
     * @return The identifier for the token, including the unique token ID and its blockchain network.
     */

    public TokenIdentifier getTokenIdentifier() {
        return this.tokenIdentifier;
    }

    /**
     * <p>
     * The identifier for the token, including the unique token ID and its blockchain network.
     * </p>
     * 
     * @param tokenIdentifier
     *        The identifier for the token, including the unique token ID and its blockchain network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TokenBalance withTokenIdentifier(TokenIdentifier tokenIdentifier) {
        setTokenIdentifier(tokenIdentifier);
        return this;
    }

    /**
     * <p>
     * The container of the token balance.
     * </p>
     * 
     * @param balance
     *        The container of the token balance.
     */

    public void setBalance(String balance) {
        this.balance = balance;
    }

    /**
     * <p>
     * The container of the token balance.
     * </p>
     * 
     * @return The container of the token balance.
     */

    public String getBalance() {
        return this.balance;
    }

    /**
     * <p>
     * The container of the token balance.
     * </p>
     * 
     * @param balance
     *        The container of the token balance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TokenBalance withBalance(String balance) {
        setBalance(balance);
        return this;
    }

    /**
     * <p>
     * The time for when the TokenBalance is requested or the current time if a time is not provided in the request.
     * </p>
     * <note>
     * <p>
     * This time will only be recorded up to the second.
     * </p>
     * </note>
     * 
     * @param atBlockchainInstant
     *        The time for when the TokenBalance is requested or the current time if a time is not provided in the
     *        request.</p> <note>
     *        <p>
     *        This time will only be recorded up to the second.
     *        </p>
     */

    public void setAtBlockchainInstant(BlockchainInstant atBlockchainInstant) {
        this.atBlockchainInstant = atBlockchainInstant;
    }

    /**
     * <p>
     * The time for when the TokenBalance is requested or the current time if a time is not provided in the request.
     * </p>
     * <note>
     * <p>
     * This time will only be recorded up to the second.
     * </p>
     * </note>
     * 
     * @return The time for when the TokenBalance is requested or the current time if a time is not provided in the
     *         request.</p> <note>
     *         <p>
     *         This time will only be recorded up to the second.
     *         </p>
     */

    public BlockchainInstant getAtBlockchainInstant() {
        return this.atBlockchainInstant;
    }

    /**
     * <p>
     * The time for when the TokenBalance is requested or the current time if a time is not provided in the request.
     * </p>
     * <note>
     * <p>
     * This time will only be recorded up to the second.
     * </p>
     * </note>
     * 
     * @param atBlockchainInstant
     *        The time for when the TokenBalance is requested or the current time if a time is not provided in the
     *        request.</p> <note>
     *        <p>
     *        This time will only be recorded up to the second.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TokenBalance withAtBlockchainInstant(BlockchainInstant atBlockchainInstant) {
        setAtBlockchainInstant(atBlockchainInstant);
        return this;
    }

    /**
     * <p>
     * The <code>Timestamp</code> of the last transaction at which the balance for the token in the wallet was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The <code>Timestamp</code> of the last transaction at which the balance for the token in the wallet was
     *        updated.
     */

    public void setLastUpdatedTime(BlockchainInstant lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The <code>Timestamp</code> of the last transaction at which the balance for the token in the wallet was updated.
     * </p>
     * 
     * @return The <code>Timestamp</code> of the last transaction at which the balance for the token in the wallet was
     *         updated.
     */

    public BlockchainInstant getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The <code>Timestamp</code> of the last transaction at which the balance for the token in the wallet was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The <code>Timestamp</code> of the last transaction at which the balance for the token in the wallet was
     *        updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TokenBalance withLastUpdatedTime(BlockchainInstant lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
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
        if (getOwnerIdentifier() != null)
            sb.append("OwnerIdentifier: ").append(getOwnerIdentifier()).append(",");
        if (getTokenIdentifier() != null)
            sb.append("TokenIdentifier: ").append(getTokenIdentifier()).append(",");
        if (getBalance() != null)
            sb.append("Balance: ").append(getBalance()).append(",");
        if (getAtBlockchainInstant() != null)
            sb.append("AtBlockchainInstant: ").append(getAtBlockchainInstant()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TokenBalance == false)
            return false;
        TokenBalance other = (TokenBalance) obj;
        if (other.getOwnerIdentifier() == null ^ this.getOwnerIdentifier() == null)
            return false;
        if (other.getOwnerIdentifier() != null && other.getOwnerIdentifier().equals(this.getOwnerIdentifier()) == false)
            return false;
        if (other.getTokenIdentifier() == null ^ this.getTokenIdentifier() == null)
            return false;
        if (other.getTokenIdentifier() != null && other.getTokenIdentifier().equals(this.getTokenIdentifier()) == false)
            return false;
        if (other.getBalance() == null ^ this.getBalance() == null)
            return false;
        if (other.getBalance() != null && other.getBalance().equals(this.getBalance()) == false)
            return false;
        if (other.getAtBlockchainInstant() == null ^ this.getAtBlockchainInstant() == null)
            return false;
        if (other.getAtBlockchainInstant() != null && other.getAtBlockchainInstant().equals(this.getAtBlockchainInstant()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwnerIdentifier() == null) ? 0 : getOwnerIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTokenIdentifier() == null) ? 0 : getTokenIdentifier().hashCode());
        hashCode = prime * hashCode + ((getBalance() == null) ? 0 : getBalance().hashCode());
        hashCode = prime * hashCode + ((getAtBlockchainInstant() == null) ? 0 : getAtBlockchainInstant().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public TokenBalance clone() {
        try {
            return (TokenBalance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchainquery.model.transform.TokenBalanceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
