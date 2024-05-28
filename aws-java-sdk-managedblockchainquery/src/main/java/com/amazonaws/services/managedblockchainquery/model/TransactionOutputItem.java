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
 * The container of the transaction output.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/TransactionOutputItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransactionOutputItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The hash of a transaction. It is generated when a transaction is created.
     * </p>
     */
    private String transactionHash;
    /**
     * <p>
     * The identifier of a Bitcoin transaction. It is generated when a transaction is created.
     * </p>
     */
    private String transactionId;
    /**
     * <p>
     * The blockchain network where the transaction occurred.
     * </p>
     */
    private String network;
    /**
     * <p>
     * The time when the transaction occurred.
     * </p>
     */
    private java.util.Date transactionTimestamp;
    /**
     * <p>
     * Specifies whether to list transactions that have not reached Finality.
     * </p>
     */
    private String confirmationStatus;

    /**
     * <p>
     * The hash of a transaction. It is generated when a transaction is created.
     * </p>
     * 
     * @param transactionHash
     *        The hash of a transaction. It is generated when a transaction is created.
     */

    public void setTransactionHash(String transactionHash) {
        this.transactionHash = transactionHash;
    }

    /**
     * <p>
     * The hash of a transaction. It is generated when a transaction is created.
     * </p>
     * 
     * @return The hash of a transaction. It is generated when a transaction is created.
     */

    public String getTransactionHash() {
        return this.transactionHash;
    }

    /**
     * <p>
     * The hash of a transaction. It is generated when a transaction is created.
     * </p>
     * 
     * @param transactionHash
     *        The hash of a transaction. It is generated when a transaction is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransactionOutputItem withTransactionHash(String transactionHash) {
        setTransactionHash(transactionHash);
        return this;
    }

    /**
     * <p>
     * The identifier of a Bitcoin transaction. It is generated when a transaction is created.
     * </p>
     * 
     * @param transactionId
     *        The identifier of a Bitcoin transaction. It is generated when a transaction is created.
     */

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * <p>
     * The identifier of a Bitcoin transaction. It is generated when a transaction is created.
     * </p>
     * 
     * @return The identifier of a Bitcoin transaction. It is generated when a transaction is created.
     */

    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     * <p>
     * The identifier of a Bitcoin transaction. It is generated when a transaction is created.
     * </p>
     * 
     * @param transactionId
     *        The identifier of a Bitcoin transaction. It is generated when a transaction is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransactionOutputItem withTransactionId(String transactionId) {
        setTransactionId(transactionId);
        return this;
    }

    /**
     * <p>
     * The blockchain network where the transaction occurred.
     * </p>
     * 
     * @param network
     *        The blockchain network where the transaction occurred.
     * @see QueryNetwork
     */

    public void setNetwork(String network) {
        this.network = network;
    }

    /**
     * <p>
     * The blockchain network where the transaction occurred.
     * </p>
     * 
     * @return The blockchain network where the transaction occurred.
     * @see QueryNetwork
     */

    public String getNetwork() {
        return this.network;
    }

    /**
     * <p>
     * The blockchain network where the transaction occurred.
     * </p>
     * 
     * @param network
     *        The blockchain network where the transaction occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryNetwork
     */

    public TransactionOutputItem withNetwork(String network) {
        setNetwork(network);
        return this;
    }

    /**
     * <p>
     * The blockchain network where the transaction occurred.
     * </p>
     * 
     * @param network
     *        The blockchain network where the transaction occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryNetwork
     */

    public TransactionOutputItem withNetwork(QueryNetwork network) {
        this.network = network.toString();
        return this;
    }

    /**
     * <p>
     * The time when the transaction occurred.
     * </p>
     * 
     * @param transactionTimestamp
     *        The time when the transaction occurred.
     */

    public void setTransactionTimestamp(java.util.Date transactionTimestamp) {
        this.transactionTimestamp = transactionTimestamp;
    }

    /**
     * <p>
     * The time when the transaction occurred.
     * </p>
     * 
     * @return The time when the transaction occurred.
     */

    public java.util.Date getTransactionTimestamp() {
        return this.transactionTimestamp;
    }

    /**
     * <p>
     * The time when the transaction occurred.
     * </p>
     * 
     * @param transactionTimestamp
     *        The time when the transaction occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransactionOutputItem withTransactionTimestamp(java.util.Date transactionTimestamp) {
        setTransactionTimestamp(transactionTimestamp);
        return this;
    }

    /**
     * <p>
     * Specifies whether to list transactions that have not reached Finality.
     * </p>
     * 
     * @param confirmationStatus
     *        Specifies whether to list transactions that have not reached Finality.
     * @see ConfirmationStatus
     */

    public void setConfirmationStatus(String confirmationStatus) {
        this.confirmationStatus = confirmationStatus;
    }

    /**
     * <p>
     * Specifies whether to list transactions that have not reached Finality.
     * </p>
     * 
     * @return Specifies whether to list transactions that have not reached Finality.
     * @see ConfirmationStatus
     */

    public String getConfirmationStatus() {
        return this.confirmationStatus;
    }

    /**
     * <p>
     * Specifies whether to list transactions that have not reached Finality.
     * </p>
     * 
     * @param confirmationStatus
     *        Specifies whether to list transactions that have not reached Finality.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfirmationStatus
     */

    public TransactionOutputItem withConfirmationStatus(String confirmationStatus) {
        setConfirmationStatus(confirmationStatus);
        return this;
    }

    /**
     * <p>
     * Specifies whether to list transactions that have not reached Finality.
     * </p>
     * 
     * @param confirmationStatus
     *        Specifies whether to list transactions that have not reached Finality.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfirmationStatus
     */

    public TransactionOutputItem withConfirmationStatus(ConfirmationStatus confirmationStatus) {
        this.confirmationStatus = confirmationStatus.toString();
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
        if (getTransactionHash() != null)
            sb.append("TransactionHash: ").append(getTransactionHash()).append(",");
        if (getTransactionId() != null)
            sb.append("TransactionId: ").append(getTransactionId()).append(",");
        if (getNetwork() != null)
            sb.append("Network: ").append(getNetwork()).append(",");
        if (getTransactionTimestamp() != null)
            sb.append("TransactionTimestamp: ").append(getTransactionTimestamp()).append(",");
        if (getConfirmationStatus() != null)
            sb.append("ConfirmationStatus: ").append(getConfirmationStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransactionOutputItem == false)
            return false;
        TransactionOutputItem other = (TransactionOutputItem) obj;
        if (other.getTransactionHash() == null ^ this.getTransactionHash() == null)
            return false;
        if (other.getTransactionHash() != null && other.getTransactionHash().equals(this.getTransactionHash()) == false)
            return false;
        if (other.getTransactionId() == null ^ this.getTransactionId() == null)
            return false;
        if (other.getTransactionId() != null && other.getTransactionId().equals(this.getTransactionId()) == false)
            return false;
        if (other.getNetwork() == null ^ this.getNetwork() == null)
            return false;
        if (other.getNetwork() != null && other.getNetwork().equals(this.getNetwork()) == false)
            return false;
        if (other.getTransactionTimestamp() == null ^ this.getTransactionTimestamp() == null)
            return false;
        if (other.getTransactionTimestamp() != null && other.getTransactionTimestamp().equals(this.getTransactionTimestamp()) == false)
            return false;
        if (other.getConfirmationStatus() == null ^ this.getConfirmationStatus() == null)
            return false;
        if (other.getConfirmationStatus() != null && other.getConfirmationStatus().equals(this.getConfirmationStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransactionHash() == null) ? 0 : getTransactionHash().hashCode());
        hashCode = prime * hashCode + ((getTransactionId() == null) ? 0 : getTransactionId().hashCode());
        hashCode = prime * hashCode + ((getNetwork() == null) ? 0 : getNetwork().hashCode());
        hashCode = prime * hashCode + ((getTransactionTimestamp() == null) ? 0 : getTransactionTimestamp().hashCode());
        hashCode = prime * hashCode + ((getConfirmationStatus() == null) ? 0 : getConfirmationStatus().hashCode());
        return hashCode;
    }

    @Override
    public TransactionOutputItem clone() {
        try {
            return (TransactionOutputItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchainquery.model.transform.TransactionOutputItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
