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
 * This is the container for the unique public address on the blockchain.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/AddressIdentifierFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddressIdentifierFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The container for the recipient address of the transaction.
     * </p>
     */
    private java.util.List<String> transactionEventToAddress;

    /**
     * <p>
     * The container for the recipient address of the transaction.
     * </p>
     * 
     * @return The container for the recipient address of the transaction.
     */

    public java.util.List<String> getTransactionEventToAddress() {
        return transactionEventToAddress;
    }

    /**
     * <p>
     * The container for the recipient address of the transaction.
     * </p>
     * 
     * @param transactionEventToAddress
     *        The container for the recipient address of the transaction.
     */

    public void setTransactionEventToAddress(java.util.Collection<String> transactionEventToAddress) {
        if (transactionEventToAddress == null) {
            this.transactionEventToAddress = null;
            return;
        }

        this.transactionEventToAddress = new java.util.ArrayList<String>(transactionEventToAddress);
    }

    /**
     * <p>
     * The container for the recipient address of the transaction.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTransactionEventToAddress(java.util.Collection)} or
     * {@link #withTransactionEventToAddress(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param transactionEventToAddress
     *        The container for the recipient address of the transaction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddressIdentifierFilter withTransactionEventToAddress(String... transactionEventToAddress) {
        if (this.transactionEventToAddress == null) {
            setTransactionEventToAddress(new java.util.ArrayList<String>(transactionEventToAddress.length));
        }
        for (String ele : transactionEventToAddress) {
            this.transactionEventToAddress.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The container for the recipient address of the transaction.
     * </p>
     * 
     * @param transactionEventToAddress
     *        The container for the recipient address of the transaction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddressIdentifierFilter withTransactionEventToAddress(java.util.Collection<String> transactionEventToAddress) {
        setTransactionEventToAddress(transactionEventToAddress);
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
        if (getTransactionEventToAddress() != null)
            sb.append("TransactionEventToAddress: ").append(getTransactionEventToAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddressIdentifierFilter == false)
            return false;
        AddressIdentifierFilter other = (AddressIdentifierFilter) obj;
        if (other.getTransactionEventToAddress() == null ^ this.getTransactionEventToAddress() == null)
            return false;
        if (other.getTransactionEventToAddress() != null && other.getTransactionEventToAddress().equals(this.getTransactionEventToAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransactionEventToAddress() == null) ? 0 : getTransactionEventToAddress().hashCode());
        return hashCode;
    }

    @Override
    public AddressIdentifierFilter clone() {
        try {
            return (AddressIdentifierFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchainquery.model.transform.AddressIdentifierFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
