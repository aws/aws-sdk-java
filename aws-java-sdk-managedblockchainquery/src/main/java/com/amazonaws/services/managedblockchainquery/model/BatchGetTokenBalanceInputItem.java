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
 * The container for the input for getting a token balance.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/BatchGetTokenBalanceInputItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetTokenBalanceInputItem implements Serializable, Cloneable, StructuredPojo {

    private TokenIdentifier tokenIdentifier;

    private OwnerIdentifier ownerIdentifier;

    private BlockchainInstant atBlockchainInstant;

    /**
     * @param tokenIdentifier
     */

    public void setTokenIdentifier(TokenIdentifier tokenIdentifier) {
        this.tokenIdentifier = tokenIdentifier;
    }

    /**
     * @return
     */

    public TokenIdentifier getTokenIdentifier() {
        return this.tokenIdentifier;
    }

    /**
     * @param tokenIdentifier
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetTokenBalanceInputItem withTokenIdentifier(TokenIdentifier tokenIdentifier) {
        setTokenIdentifier(tokenIdentifier);
        return this;
    }

    /**
     * @param ownerIdentifier
     */

    public void setOwnerIdentifier(OwnerIdentifier ownerIdentifier) {
        this.ownerIdentifier = ownerIdentifier;
    }

    /**
     * @return
     */

    public OwnerIdentifier getOwnerIdentifier() {
        return this.ownerIdentifier;
    }

    /**
     * @param ownerIdentifier
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetTokenBalanceInputItem withOwnerIdentifier(OwnerIdentifier ownerIdentifier) {
        setOwnerIdentifier(ownerIdentifier);
        return this;
    }

    /**
     * @param atBlockchainInstant
     */

    public void setAtBlockchainInstant(BlockchainInstant atBlockchainInstant) {
        this.atBlockchainInstant = atBlockchainInstant;
    }

    /**
     * @return
     */

    public BlockchainInstant getAtBlockchainInstant() {
        return this.atBlockchainInstant;
    }

    /**
     * @param atBlockchainInstant
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetTokenBalanceInputItem withAtBlockchainInstant(BlockchainInstant atBlockchainInstant) {
        setAtBlockchainInstant(atBlockchainInstant);
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
        if (getTokenIdentifier() != null)
            sb.append("TokenIdentifier: ").append(getTokenIdentifier()).append(",");
        if (getOwnerIdentifier() != null)
            sb.append("OwnerIdentifier: ").append(getOwnerIdentifier()).append(",");
        if (getAtBlockchainInstant() != null)
            sb.append("AtBlockchainInstant: ").append(getAtBlockchainInstant());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetTokenBalanceInputItem == false)
            return false;
        BatchGetTokenBalanceInputItem other = (BatchGetTokenBalanceInputItem) obj;
        if (other.getTokenIdentifier() == null ^ this.getTokenIdentifier() == null)
            return false;
        if (other.getTokenIdentifier() != null && other.getTokenIdentifier().equals(this.getTokenIdentifier()) == false)
            return false;
        if (other.getOwnerIdentifier() == null ^ this.getOwnerIdentifier() == null)
            return false;
        if (other.getOwnerIdentifier() != null && other.getOwnerIdentifier().equals(this.getOwnerIdentifier()) == false)
            return false;
        if (other.getAtBlockchainInstant() == null ^ this.getAtBlockchainInstant() == null)
            return false;
        if (other.getAtBlockchainInstant() != null && other.getAtBlockchainInstant().equals(this.getAtBlockchainInstant()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTokenIdentifier() == null) ? 0 : getTokenIdentifier().hashCode());
        hashCode = prime * hashCode + ((getOwnerIdentifier() == null) ? 0 : getOwnerIdentifier().hashCode());
        hashCode = prime * hashCode + ((getAtBlockchainInstant() == null) ? 0 : getAtBlockchainInstant().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetTokenBalanceInputItem clone() {
        try {
            return (BatchGetTokenBalanceInputItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchainquery.model.transform.BatchGetTokenBalanceInputItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
