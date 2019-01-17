/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.model;

import javax.annotation.Generated;

/**
 * <p>
 * The entire transaction request was rejected.
 * </p>
 * <p>
 * DynamoDB rejects a <code>TransactWriteItems</code> request under the following circumstances:
 * </p>
 * <ul>
 * <li>
 * <p>
 * A condition in one of the condition expressions is not met.
 * </p>
 * </li>
 * <li>
 * <p>
 * A table in the <code>TransactWriteItems</code> request is in a different account or region.
 * </p>
 * </li>
 * <li>
 * <p>
 * More than one action in the <code>TransactWriteItems</code> operation targets the same item.
 * </p>
 * </li>
 * <li>
 * <p>
 * There is insufficient provisioned capacity for the transaction to be completed.
 * </p>
 * </li>
 * <li>
 * <p>
 * An item size becomes too large (larger than 400 KB), or a local secondary index (LSI) becomes too large, or a similar
 * validation error occurs because of changes made by the transaction.
 * </p>
 * </li>
 * <li>
 * <p>
 * There is a user error, such as an invalid data format.
 * </p>
 * </li>
 * </ul>
 * <p>
 * DynamoDB rejects a <code>TransactGetItems</code> request under the following circumstances:
 * </p>
 * <ul>
 * <li>
 * <p>
 * There is an ongoing <code>TransactGetItems</code> operation that conflicts with a concurrent <code>PutItem</code>,
 * <code>UpdateItem</code>, <code>DeleteItem</code> or <code>TransactWriteItems</code> request. In this case the
 * <code>TransactGetItems</code> operation fails with a <code>TransactionCanceledException</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * A table in the <code>TransactGetItems</code> request is in a different account or region.
 * </p>
 * </li>
 * <li>
 * <p>
 * There is insufficient provisioned capacity for the transaction to be completed.
 * </p>
 * </li>
 * <li>
 * <p>
 * There is a user error, such as an invalid data format.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransactionCanceledException extends com.amazonaws.services.dynamodbv2.model.AmazonDynamoDBException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * A list of cancellation reasons.
     * </p>
     */
    private java.util.List<CancellationReason> cancellationReasons;

    /**
     * Constructs a new TransactionCanceledException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public TransactionCanceledException(String message) {
        super(message);
    }

    /**
     * <p>
     * A list of cancellation reasons.
     * </p>
     * 
     * @return A list of cancellation reasons.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("CancellationReasons")
    public java.util.List<CancellationReason> getCancellationReasons() {
        return cancellationReasons;
    }

    /**
     * <p>
     * A list of cancellation reasons.
     * </p>
     * 
     * @param cancellationReasons
     *        A list of cancellation reasons.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("CancellationReasons")
    public void setCancellationReasons(java.util.Collection<CancellationReason> cancellationReasons) {
        if (cancellationReasons == null) {
            this.cancellationReasons = null;
            return;
        }

        this.cancellationReasons = new java.util.ArrayList<CancellationReason>(cancellationReasons);
    }

    /**
     * <p>
     * A list of cancellation reasons.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCancellationReasons(java.util.Collection)} or {@link #withCancellationReasons(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param cancellationReasons
     *        A list of cancellation reasons.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransactionCanceledException withCancellationReasons(CancellationReason... cancellationReasons) {
        if (this.cancellationReasons == null) {
            setCancellationReasons(new java.util.ArrayList<CancellationReason>(cancellationReasons.length));
        }
        for (CancellationReason ele : cancellationReasons) {
            this.cancellationReasons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of cancellation reasons.
     * </p>
     * 
     * @param cancellationReasons
     *        A list of cancellation reasons.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransactionCanceledException withCancellationReasons(java.util.Collection<CancellationReason> cancellationReasons) {
        setCancellationReasons(cancellationReasons);
        return this;
    }

}
