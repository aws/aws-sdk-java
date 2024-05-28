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
 * There are two possible types of transactions used for this data type:
 * </p>
 * <ul>
 * <li>
 * <p>
 * A Bitcoin transaction is a movement of BTC from one address to another.
 * </p>
 * </li>
 * <li>
 * <p>
 * An Ethereum transaction refers to an action initiated by an externally owned account, which is an account managed by
 * a human, not a contract. For example, if Bob sends Alice 1 ETH, Bob's account must be debited and Alice's must be
 * credited. This state-changing action occurs within a transaction.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/Transaction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Transaction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The blockchain network where the transaction occurred.
     * </p>
     */
    private String network;
    /**
     * <p>
     * The block hash is a unique identifier for a block. It is a fixed-size string that is calculated by using the
     * information in the block. The block hash is used to verify the integrity of the data in the block.
     * </p>
     */
    private String blockHash;
    /**
     * <p>
     * The hash of a transaction. It is generated when a transaction is created.
     * </p>
     */
    private String transactionHash;
    /**
     * <p>
     * The block number in which the transaction is recorded.
     * </p>
     */
    private String blockNumber;
    /**
     * <p>
     * The <code>Timestamp</code> of the transaction.
     * </p>
     */
    private java.util.Date transactionTimestamp;
    /**
     * <p>
     * The index of the transaction within a blockchain.
     * </p>
     */
    private Long transactionIndex;
    /**
     * <p>
     * The number of transactions in the block.
     * </p>
     */
    private Long numberOfTransactions;
    /**
     * <p>
     * The identifier of the transaction. It is generated whenever a transaction is verified and added to the
     * blockchain.
     * </p>
     */
    private String to;
    /**
     * <p>
     * The initiator of the transaction. It is either in the form a public key or a contract address.
     * </p>
     */
    private String from;
    /**
     * <p>
     * The blockchain address for the contract.
     * </p>
     */
    private String contractAddress;
    /**
     * <p>
     * The amount of gas used for the transaction.
     * </p>
     */
    private String gasUsed;
    /**
     * <p>
     * The amount of gas used up to the specified point in the block.
     * </p>
     */
    private String cumulativeGasUsed;
    /**
     * <p>
     * The effective gas price.
     * </p>
     */
    private String effectiveGasPrice;
    /**
     * <p>
     * The signature of the transaction. The Z coordinate of a point V.
     * </p>
     */
    private Integer signatureV;
    /**
     * <p>
     * The signature of the transaction. The X coordinate of a point R.
     * </p>
     */
    private String signatureR;
    /**
     * <p>
     * The signature of the transaction. The Y coordinate of a point S.
     * </p>
     */
    private String signatureS;
    /**
     * <p>
     * The transaction fee.
     * </p>
     */
    private String transactionFee;
    /**
     * <p>
     * The identifier of a Bitcoin transaction. It is generated when a transaction is created.
     * </p>
     */
    private String transactionId;
    /**
     * <p>
     * Specifies whether the transaction has reached Finality.
     * </p>
     */
    private String confirmationStatus;
    /**
     * <p>
     * Identifies whether the transaction has succeeded or failed.
     * </p>
     */
    private String executionStatus;

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

    public Transaction withNetwork(String network) {
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

    public Transaction withNetwork(QueryNetwork network) {
        this.network = network.toString();
        return this;
    }

    /**
     * <p>
     * The block hash is a unique identifier for a block. It is a fixed-size string that is calculated by using the
     * information in the block. The block hash is used to verify the integrity of the data in the block.
     * </p>
     * 
     * @param blockHash
     *        The block hash is a unique identifier for a block. It is a fixed-size string that is calculated by using
     *        the information in the block. The block hash is used to verify the integrity of the data in the block.
     */

    public void setBlockHash(String blockHash) {
        this.blockHash = blockHash;
    }

    /**
     * <p>
     * The block hash is a unique identifier for a block. It is a fixed-size string that is calculated by using the
     * information in the block. The block hash is used to verify the integrity of the data in the block.
     * </p>
     * 
     * @return The block hash is a unique identifier for a block. It is a fixed-size string that is calculated by using
     *         the information in the block. The block hash is used to verify the integrity of the data in the block.
     */

    public String getBlockHash() {
        return this.blockHash;
    }

    /**
     * <p>
     * The block hash is a unique identifier for a block. It is a fixed-size string that is calculated by using the
     * information in the block. The block hash is used to verify the integrity of the data in the block.
     * </p>
     * 
     * @param blockHash
     *        The block hash is a unique identifier for a block. It is a fixed-size string that is calculated by using
     *        the information in the block. The block hash is used to verify the integrity of the data in the block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transaction withBlockHash(String blockHash) {
        setBlockHash(blockHash);
        return this;
    }

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

    public Transaction withTransactionHash(String transactionHash) {
        setTransactionHash(transactionHash);
        return this;
    }

    /**
     * <p>
     * The block number in which the transaction is recorded.
     * </p>
     * 
     * @param blockNumber
     *        The block number in which the transaction is recorded.
     */

    public void setBlockNumber(String blockNumber) {
        this.blockNumber = blockNumber;
    }

    /**
     * <p>
     * The block number in which the transaction is recorded.
     * </p>
     * 
     * @return The block number in which the transaction is recorded.
     */

    public String getBlockNumber() {
        return this.blockNumber;
    }

    /**
     * <p>
     * The block number in which the transaction is recorded.
     * </p>
     * 
     * @param blockNumber
     *        The block number in which the transaction is recorded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transaction withBlockNumber(String blockNumber) {
        setBlockNumber(blockNumber);
        return this;
    }

    /**
     * <p>
     * The <code>Timestamp</code> of the transaction.
     * </p>
     * 
     * @param transactionTimestamp
     *        The <code>Timestamp</code> of the transaction.
     */

    public void setTransactionTimestamp(java.util.Date transactionTimestamp) {
        this.transactionTimestamp = transactionTimestamp;
    }

    /**
     * <p>
     * The <code>Timestamp</code> of the transaction.
     * </p>
     * 
     * @return The <code>Timestamp</code> of the transaction.
     */

    public java.util.Date getTransactionTimestamp() {
        return this.transactionTimestamp;
    }

    /**
     * <p>
     * The <code>Timestamp</code> of the transaction.
     * </p>
     * 
     * @param transactionTimestamp
     *        The <code>Timestamp</code> of the transaction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transaction withTransactionTimestamp(java.util.Date transactionTimestamp) {
        setTransactionTimestamp(transactionTimestamp);
        return this;
    }

    /**
     * <p>
     * The index of the transaction within a blockchain.
     * </p>
     * 
     * @param transactionIndex
     *        The index of the transaction within a blockchain.
     */

    public void setTransactionIndex(Long transactionIndex) {
        this.transactionIndex = transactionIndex;
    }

    /**
     * <p>
     * The index of the transaction within a blockchain.
     * </p>
     * 
     * @return The index of the transaction within a blockchain.
     */

    public Long getTransactionIndex() {
        return this.transactionIndex;
    }

    /**
     * <p>
     * The index of the transaction within a blockchain.
     * </p>
     * 
     * @param transactionIndex
     *        The index of the transaction within a blockchain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transaction withTransactionIndex(Long transactionIndex) {
        setTransactionIndex(transactionIndex);
        return this;
    }

    /**
     * <p>
     * The number of transactions in the block.
     * </p>
     * 
     * @param numberOfTransactions
     *        The number of transactions in the block.
     */

    public void setNumberOfTransactions(Long numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
    }

    /**
     * <p>
     * The number of transactions in the block.
     * </p>
     * 
     * @return The number of transactions in the block.
     */

    public Long getNumberOfTransactions() {
        return this.numberOfTransactions;
    }

    /**
     * <p>
     * The number of transactions in the block.
     * </p>
     * 
     * @param numberOfTransactions
     *        The number of transactions in the block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transaction withNumberOfTransactions(Long numberOfTransactions) {
        setNumberOfTransactions(numberOfTransactions);
        return this;
    }

    /**
     * <p>
     * The identifier of the transaction. It is generated whenever a transaction is verified and added to the
     * blockchain.
     * </p>
     * 
     * @param to
     *        The identifier of the transaction. It is generated whenever a transaction is verified and added to the
     *        blockchain.
     */

    public void setTo(String to) {
        this.to = to;
    }

    /**
     * <p>
     * The identifier of the transaction. It is generated whenever a transaction is verified and added to the
     * blockchain.
     * </p>
     * 
     * @return The identifier of the transaction. It is generated whenever a transaction is verified and added to the
     *         blockchain.
     */

    public String getTo() {
        return this.to;
    }

    /**
     * <p>
     * The identifier of the transaction. It is generated whenever a transaction is verified and added to the
     * blockchain.
     * </p>
     * 
     * @param to
     *        The identifier of the transaction. It is generated whenever a transaction is verified and added to the
     *        blockchain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transaction withTo(String to) {
        setTo(to);
        return this;
    }

    /**
     * <p>
     * The initiator of the transaction. It is either in the form a public key or a contract address.
     * </p>
     * 
     * @param from
     *        The initiator of the transaction. It is either in the form a public key or a contract address.
     */

    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * <p>
     * The initiator of the transaction. It is either in the form a public key or a contract address.
     * </p>
     * 
     * @return The initiator of the transaction. It is either in the form a public key or a contract address.
     */

    public String getFrom() {
        return this.from;
    }

    /**
     * <p>
     * The initiator of the transaction. It is either in the form a public key or a contract address.
     * </p>
     * 
     * @param from
     *        The initiator of the transaction. It is either in the form a public key or a contract address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transaction withFrom(String from) {
        setFrom(from);
        return this;
    }

    /**
     * <p>
     * The blockchain address for the contract.
     * </p>
     * 
     * @param contractAddress
     *        The blockchain address for the contract.
     */

    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }

    /**
     * <p>
     * The blockchain address for the contract.
     * </p>
     * 
     * @return The blockchain address for the contract.
     */

    public String getContractAddress() {
        return this.contractAddress;
    }

    /**
     * <p>
     * The blockchain address for the contract.
     * </p>
     * 
     * @param contractAddress
     *        The blockchain address for the contract.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transaction withContractAddress(String contractAddress) {
        setContractAddress(contractAddress);
        return this;
    }

    /**
     * <p>
     * The amount of gas used for the transaction.
     * </p>
     * 
     * @param gasUsed
     *        The amount of gas used for the transaction.
     */

    public void setGasUsed(String gasUsed) {
        this.gasUsed = gasUsed;
    }

    /**
     * <p>
     * The amount of gas used for the transaction.
     * </p>
     * 
     * @return The amount of gas used for the transaction.
     */

    public String getGasUsed() {
        return this.gasUsed;
    }

    /**
     * <p>
     * The amount of gas used for the transaction.
     * </p>
     * 
     * @param gasUsed
     *        The amount of gas used for the transaction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transaction withGasUsed(String gasUsed) {
        setGasUsed(gasUsed);
        return this;
    }

    /**
     * <p>
     * The amount of gas used up to the specified point in the block.
     * </p>
     * 
     * @param cumulativeGasUsed
     *        The amount of gas used up to the specified point in the block.
     */

    public void setCumulativeGasUsed(String cumulativeGasUsed) {
        this.cumulativeGasUsed = cumulativeGasUsed;
    }

    /**
     * <p>
     * The amount of gas used up to the specified point in the block.
     * </p>
     * 
     * @return The amount of gas used up to the specified point in the block.
     */

    public String getCumulativeGasUsed() {
        return this.cumulativeGasUsed;
    }

    /**
     * <p>
     * The amount of gas used up to the specified point in the block.
     * </p>
     * 
     * @param cumulativeGasUsed
     *        The amount of gas used up to the specified point in the block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transaction withCumulativeGasUsed(String cumulativeGasUsed) {
        setCumulativeGasUsed(cumulativeGasUsed);
        return this;
    }

    /**
     * <p>
     * The effective gas price.
     * </p>
     * 
     * @param effectiveGasPrice
     *        The effective gas price.
     */

    public void setEffectiveGasPrice(String effectiveGasPrice) {
        this.effectiveGasPrice = effectiveGasPrice;
    }

    /**
     * <p>
     * The effective gas price.
     * </p>
     * 
     * @return The effective gas price.
     */

    public String getEffectiveGasPrice() {
        return this.effectiveGasPrice;
    }

    /**
     * <p>
     * The effective gas price.
     * </p>
     * 
     * @param effectiveGasPrice
     *        The effective gas price.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transaction withEffectiveGasPrice(String effectiveGasPrice) {
        setEffectiveGasPrice(effectiveGasPrice);
        return this;
    }

    /**
     * <p>
     * The signature of the transaction. The Z coordinate of a point V.
     * </p>
     * 
     * @param signatureV
     *        The signature of the transaction. The Z coordinate of a point V.
     */

    public void setSignatureV(Integer signatureV) {
        this.signatureV = signatureV;
    }

    /**
     * <p>
     * The signature of the transaction. The Z coordinate of a point V.
     * </p>
     * 
     * @return The signature of the transaction. The Z coordinate of a point V.
     */

    public Integer getSignatureV() {
        return this.signatureV;
    }

    /**
     * <p>
     * The signature of the transaction. The Z coordinate of a point V.
     * </p>
     * 
     * @param signatureV
     *        The signature of the transaction. The Z coordinate of a point V.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transaction withSignatureV(Integer signatureV) {
        setSignatureV(signatureV);
        return this;
    }

    /**
     * <p>
     * The signature of the transaction. The X coordinate of a point R.
     * </p>
     * 
     * @param signatureR
     *        The signature of the transaction. The X coordinate of a point R.
     */

    public void setSignatureR(String signatureR) {
        this.signatureR = signatureR;
    }

    /**
     * <p>
     * The signature of the transaction. The X coordinate of a point R.
     * </p>
     * 
     * @return The signature of the transaction. The X coordinate of a point R.
     */

    public String getSignatureR() {
        return this.signatureR;
    }

    /**
     * <p>
     * The signature of the transaction. The X coordinate of a point R.
     * </p>
     * 
     * @param signatureR
     *        The signature of the transaction. The X coordinate of a point R.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transaction withSignatureR(String signatureR) {
        setSignatureR(signatureR);
        return this;
    }

    /**
     * <p>
     * The signature of the transaction. The Y coordinate of a point S.
     * </p>
     * 
     * @param signatureS
     *        The signature of the transaction. The Y coordinate of a point S.
     */

    public void setSignatureS(String signatureS) {
        this.signatureS = signatureS;
    }

    /**
     * <p>
     * The signature of the transaction. The Y coordinate of a point S.
     * </p>
     * 
     * @return The signature of the transaction. The Y coordinate of a point S.
     */

    public String getSignatureS() {
        return this.signatureS;
    }

    /**
     * <p>
     * The signature of the transaction. The Y coordinate of a point S.
     * </p>
     * 
     * @param signatureS
     *        The signature of the transaction. The Y coordinate of a point S.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transaction withSignatureS(String signatureS) {
        setSignatureS(signatureS);
        return this;
    }

    /**
     * <p>
     * The transaction fee.
     * </p>
     * 
     * @param transactionFee
     *        The transaction fee.
     */

    public void setTransactionFee(String transactionFee) {
        this.transactionFee = transactionFee;
    }

    /**
     * <p>
     * The transaction fee.
     * </p>
     * 
     * @return The transaction fee.
     */

    public String getTransactionFee() {
        return this.transactionFee;
    }

    /**
     * <p>
     * The transaction fee.
     * </p>
     * 
     * @param transactionFee
     *        The transaction fee.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transaction withTransactionFee(String transactionFee) {
        setTransactionFee(transactionFee);
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

    public Transaction withTransactionId(String transactionId) {
        setTransactionId(transactionId);
        return this;
    }

    /**
     * <p>
     * Specifies whether the transaction has reached Finality.
     * </p>
     * 
     * @param confirmationStatus
     *        Specifies whether the transaction has reached Finality.
     * @see ConfirmationStatus
     */

    public void setConfirmationStatus(String confirmationStatus) {
        this.confirmationStatus = confirmationStatus;
    }

    /**
     * <p>
     * Specifies whether the transaction has reached Finality.
     * </p>
     * 
     * @return Specifies whether the transaction has reached Finality.
     * @see ConfirmationStatus
     */

    public String getConfirmationStatus() {
        return this.confirmationStatus;
    }

    /**
     * <p>
     * Specifies whether the transaction has reached Finality.
     * </p>
     * 
     * @param confirmationStatus
     *        Specifies whether the transaction has reached Finality.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfirmationStatus
     */

    public Transaction withConfirmationStatus(String confirmationStatus) {
        setConfirmationStatus(confirmationStatus);
        return this;
    }

    /**
     * <p>
     * Specifies whether the transaction has reached Finality.
     * </p>
     * 
     * @param confirmationStatus
     *        Specifies whether the transaction has reached Finality.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfirmationStatus
     */

    public Transaction withConfirmationStatus(ConfirmationStatus confirmationStatus) {
        this.confirmationStatus = confirmationStatus.toString();
        return this;
    }

    /**
     * <p>
     * Identifies whether the transaction has succeeded or failed.
     * </p>
     * 
     * @param executionStatus
     *        Identifies whether the transaction has succeeded or failed.
     * @see ExecutionStatus
     */

    public void setExecutionStatus(String executionStatus) {
        this.executionStatus = executionStatus;
    }

    /**
     * <p>
     * Identifies whether the transaction has succeeded or failed.
     * </p>
     * 
     * @return Identifies whether the transaction has succeeded or failed.
     * @see ExecutionStatus
     */

    public String getExecutionStatus() {
        return this.executionStatus;
    }

    /**
     * <p>
     * Identifies whether the transaction has succeeded or failed.
     * </p>
     * 
     * @param executionStatus
     *        Identifies whether the transaction has succeeded or failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionStatus
     */

    public Transaction withExecutionStatus(String executionStatus) {
        setExecutionStatus(executionStatus);
        return this;
    }

    /**
     * <p>
     * Identifies whether the transaction has succeeded or failed.
     * </p>
     * 
     * @param executionStatus
     *        Identifies whether the transaction has succeeded or failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionStatus
     */

    public Transaction withExecutionStatus(ExecutionStatus executionStatus) {
        this.executionStatus = executionStatus.toString();
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
        if (getBlockHash() != null)
            sb.append("BlockHash: ").append(getBlockHash()).append(",");
        if (getTransactionHash() != null)
            sb.append("TransactionHash: ").append(getTransactionHash()).append(",");
        if (getBlockNumber() != null)
            sb.append("BlockNumber: ").append(getBlockNumber()).append(",");
        if (getTransactionTimestamp() != null)
            sb.append("TransactionTimestamp: ").append(getTransactionTimestamp()).append(",");
        if (getTransactionIndex() != null)
            sb.append("TransactionIndex: ").append(getTransactionIndex()).append(",");
        if (getNumberOfTransactions() != null)
            sb.append("NumberOfTransactions: ").append(getNumberOfTransactions()).append(",");
        if (getTo() != null)
            sb.append("To: ").append(getTo()).append(",");
        if (getFrom() != null)
            sb.append("From: ").append(getFrom()).append(",");
        if (getContractAddress() != null)
            sb.append("ContractAddress: ").append(getContractAddress()).append(",");
        if (getGasUsed() != null)
            sb.append("GasUsed: ").append(getGasUsed()).append(",");
        if (getCumulativeGasUsed() != null)
            sb.append("CumulativeGasUsed: ").append(getCumulativeGasUsed()).append(",");
        if (getEffectiveGasPrice() != null)
            sb.append("EffectiveGasPrice: ").append(getEffectiveGasPrice()).append(",");
        if (getSignatureV() != null)
            sb.append("SignatureV: ").append(getSignatureV()).append(",");
        if (getSignatureR() != null)
            sb.append("SignatureR: ").append(getSignatureR()).append(",");
        if (getSignatureS() != null)
            sb.append("SignatureS: ").append(getSignatureS()).append(",");
        if (getTransactionFee() != null)
            sb.append("TransactionFee: ").append(getTransactionFee()).append(",");
        if (getTransactionId() != null)
            sb.append("TransactionId: ").append(getTransactionId()).append(",");
        if (getConfirmationStatus() != null)
            sb.append("ConfirmationStatus: ").append(getConfirmationStatus()).append(",");
        if (getExecutionStatus() != null)
            sb.append("ExecutionStatus: ").append(getExecutionStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Transaction == false)
            return false;
        Transaction other = (Transaction) obj;
        if (other.getNetwork() == null ^ this.getNetwork() == null)
            return false;
        if (other.getNetwork() != null && other.getNetwork().equals(this.getNetwork()) == false)
            return false;
        if (other.getBlockHash() == null ^ this.getBlockHash() == null)
            return false;
        if (other.getBlockHash() != null && other.getBlockHash().equals(this.getBlockHash()) == false)
            return false;
        if (other.getTransactionHash() == null ^ this.getTransactionHash() == null)
            return false;
        if (other.getTransactionHash() != null && other.getTransactionHash().equals(this.getTransactionHash()) == false)
            return false;
        if (other.getBlockNumber() == null ^ this.getBlockNumber() == null)
            return false;
        if (other.getBlockNumber() != null && other.getBlockNumber().equals(this.getBlockNumber()) == false)
            return false;
        if (other.getTransactionTimestamp() == null ^ this.getTransactionTimestamp() == null)
            return false;
        if (other.getTransactionTimestamp() != null && other.getTransactionTimestamp().equals(this.getTransactionTimestamp()) == false)
            return false;
        if (other.getTransactionIndex() == null ^ this.getTransactionIndex() == null)
            return false;
        if (other.getTransactionIndex() != null && other.getTransactionIndex().equals(this.getTransactionIndex()) == false)
            return false;
        if (other.getNumberOfTransactions() == null ^ this.getNumberOfTransactions() == null)
            return false;
        if (other.getNumberOfTransactions() != null && other.getNumberOfTransactions().equals(this.getNumberOfTransactions()) == false)
            return false;
        if (other.getTo() == null ^ this.getTo() == null)
            return false;
        if (other.getTo() != null && other.getTo().equals(this.getTo()) == false)
            return false;
        if (other.getFrom() == null ^ this.getFrom() == null)
            return false;
        if (other.getFrom() != null && other.getFrom().equals(this.getFrom()) == false)
            return false;
        if (other.getContractAddress() == null ^ this.getContractAddress() == null)
            return false;
        if (other.getContractAddress() != null && other.getContractAddress().equals(this.getContractAddress()) == false)
            return false;
        if (other.getGasUsed() == null ^ this.getGasUsed() == null)
            return false;
        if (other.getGasUsed() != null && other.getGasUsed().equals(this.getGasUsed()) == false)
            return false;
        if (other.getCumulativeGasUsed() == null ^ this.getCumulativeGasUsed() == null)
            return false;
        if (other.getCumulativeGasUsed() != null && other.getCumulativeGasUsed().equals(this.getCumulativeGasUsed()) == false)
            return false;
        if (other.getEffectiveGasPrice() == null ^ this.getEffectiveGasPrice() == null)
            return false;
        if (other.getEffectiveGasPrice() != null && other.getEffectiveGasPrice().equals(this.getEffectiveGasPrice()) == false)
            return false;
        if (other.getSignatureV() == null ^ this.getSignatureV() == null)
            return false;
        if (other.getSignatureV() != null && other.getSignatureV().equals(this.getSignatureV()) == false)
            return false;
        if (other.getSignatureR() == null ^ this.getSignatureR() == null)
            return false;
        if (other.getSignatureR() != null && other.getSignatureR().equals(this.getSignatureR()) == false)
            return false;
        if (other.getSignatureS() == null ^ this.getSignatureS() == null)
            return false;
        if (other.getSignatureS() != null && other.getSignatureS().equals(this.getSignatureS()) == false)
            return false;
        if (other.getTransactionFee() == null ^ this.getTransactionFee() == null)
            return false;
        if (other.getTransactionFee() != null && other.getTransactionFee().equals(this.getTransactionFee()) == false)
            return false;
        if (other.getTransactionId() == null ^ this.getTransactionId() == null)
            return false;
        if (other.getTransactionId() != null && other.getTransactionId().equals(this.getTransactionId()) == false)
            return false;
        if (other.getConfirmationStatus() == null ^ this.getConfirmationStatus() == null)
            return false;
        if (other.getConfirmationStatus() != null && other.getConfirmationStatus().equals(this.getConfirmationStatus()) == false)
            return false;
        if (other.getExecutionStatus() == null ^ this.getExecutionStatus() == null)
            return false;
        if (other.getExecutionStatus() != null && other.getExecutionStatus().equals(this.getExecutionStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetwork() == null) ? 0 : getNetwork().hashCode());
        hashCode = prime * hashCode + ((getBlockHash() == null) ? 0 : getBlockHash().hashCode());
        hashCode = prime * hashCode + ((getTransactionHash() == null) ? 0 : getTransactionHash().hashCode());
        hashCode = prime * hashCode + ((getBlockNumber() == null) ? 0 : getBlockNumber().hashCode());
        hashCode = prime * hashCode + ((getTransactionTimestamp() == null) ? 0 : getTransactionTimestamp().hashCode());
        hashCode = prime * hashCode + ((getTransactionIndex() == null) ? 0 : getTransactionIndex().hashCode());
        hashCode = prime * hashCode + ((getNumberOfTransactions() == null) ? 0 : getNumberOfTransactions().hashCode());
        hashCode = prime * hashCode + ((getTo() == null) ? 0 : getTo().hashCode());
        hashCode = prime * hashCode + ((getFrom() == null) ? 0 : getFrom().hashCode());
        hashCode = prime * hashCode + ((getContractAddress() == null) ? 0 : getContractAddress().hashCode());
        hashCode = prime * hashCode + ((getGasUsed() == null) ? 0 : getGasUsed().hashCode());
        hashCode = prime * hashCode + ((getCumulativeGasUsed() == null) ? 0 : getCumulativeGasUsed().hashCode());
        hashCode = prime * hashCode + ((getEffectiveGasPrice() == null) ? 0 : getEffectiveGasPrice().hashCode());
        hashCode = prime * hashCode + ((getSignatureV() == null) ? 0 : getSignatureV().hashCode());
        hashCode = prime * hashCode + ((getSignatureR() == null) ? 0 : getSignatureR().hashCode());
        hashCode = prime * hashCode + ((getSignatureS() == null) ? 0 : getSignatureS().hashCode());
        hashCode = prime * hashCode + ((getTransactionFee() == null) ? 0 : getTransactionFee().hashCode());
        hashCode = prime * hashCode + ((getTransactionId() == null) ? 0 : getTransactionId().hashCode());
        hashCode = prime * hashCode + ((getConfirmationStatus() == null) ? 0 : getConfirmationStatus().hashCode());
        hashCode = prime * hashCode + ((getExecutionStatus() == null) ? 0 : getExecutionStatus().hashCode());
        return hashCode;
    }

    @Override
    public Transaction clone() {
        try {
            return (Transaction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchainquery.model.transform.TransactionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
