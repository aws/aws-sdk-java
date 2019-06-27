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
 * The entire transaction request was canceled.
 * </p>
 * <p>
 * DynamoDB cancels a <code>TransactWriteItems</code> request under the following circumstances:
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
 * The aggregate size of the items in the transaction exceeds 4 MBs.
 * </p>
 * </li>
 * <li>
 * <p>
 * There is a user error, such as an invalid data format.
 * </p>
 * </li>
 * </ul>
 * <p>
 * DynamoDB cancels a <code>TransactGetItems</code> request under the following circumstances:
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
 * The aggregate size of the items in the transaction exceeds 4 MBs.
 * </p>
 * </li>
 * <li>
 * <p>
 * There is a user error, such as an invalid data format.
 * </p>
 * </li>
 * </ul>
 * <note>
 * <p>
 * If using Java, DynamoDB lists the cancellation reasons on the <code>CancellationReasons</code> property. This
 * property is not set for other languages. Transaction cancellation reasons are ordered in the order of requested
 * items, if an item has no error it will have <code>NONE</code> code and <code>Null</code> message.
 * </p>
 * </note>
 * <p>
 * Cancellation reason codes and possible error messages:
 * </p>
 * <ul>
 * <li>
 * <p>
 * No Errors:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Code: <code>NONE</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * Message: <code>null</code>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * Conditional Check Failed:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Code: <code>ConditionalCheckFailed</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * Message: The conditional request failed.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * Item Collection Size Limit Exceeded:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Code: <code>ItemCollectionSizeLimitExceeded</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * Message: Collection size exceeded.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * Transaction Conflict:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Code: <code>TransactionConflict</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * Message: Transaction is ongoing for the item.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * Provisioned Throughput Exceeded:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Code: <code>ProvisionedThroughputExceeded</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * Messages:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The level of configured provisioned throughput for the table was exceeded. Consider increasing your provisioning
 * level with the UpdateTable API.
 * </p>
 * <note>
 * <p>
 * This Message is received when provisioned throughput is exceeded is on a provisioned DynamoDB table.
 * </p>
 * </note></li>
 * <li>
 * <p>
 * The level of configured provisioned throughput for one or more global secondary indexes of the table was exceeded.
 * Consider increasing your provisioning level for the under-provisioned global secondary indexes with the UpdateTable
 * API.
 * </p>
 * <note>
 * <p>
 * This message is returned when provisioned throughput is exceeded is on a provisioned GSI.
 * </p>
 * </note></li>
 * </ul>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * Throttling Error:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Code: <code>ThrottlingError</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * Messages:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Throughput exceeds the current capacity of your table or index. DynamoDB is automatically scaling your table or index
 * so please try again shortly. If exceptions persist, check if you have a hot key:
 * https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/bp-partition-key-design.html.
 * </p>
 * <note>
 * <p>
 * This message is returned when writes get throttled on an On-Demand table as DynamoDB is automatically scaling the
 * table.
 * </p>
 * </note></li>
 * <li>
 * <p>
 * Throughput exceeds the current capacity for one or more global secondary indexes. DynamoDB is automatically scaling
 * your index so please try again shortly.
 * </p>
 * <note>
 * <p>
 * This message is returned when when writes get throttled on an On-Demand GSI as DynamoDB is automatically scaling the
 * GSI.
 * </p>
 * </note></li>
 * </ul>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * Validation Error:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Code: <code>ValidationError</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * Messages:
 * </p>
 * <ul>
 * <li>
 * <p>
 * One or more parameter values were invalid.
 * </p>
 * </li>
 * <li>
 * <p>
 * The update expression attempted to update the secondary index key beyond allowed size limits.
 * </p>
 * </li>
 * <li>
 * <p>
 * The update expression attempted to update the secondary index key to unsupported type.
 * </p>
 * </li>
 * <li>
 * <p>
 * An operand in the update expression has an incorrect data type.
 * </p>
 * </li>
 * <li>
 * <p>
 * Item size to update has exceeded the maximum allowed size.
 * </p>
 * </li>
 * <li>
 * <p>
 * Number overflow. Attempting to store a number with magnitude larger than supported range.
 * </p>
 * </li>
 * <li>
 * <p>
 * Type mismatch for attribute to update.
 * </p>
 * </li>
 * <li>
 * <p>
 * Nesting Levels have exceeded supported limits.
 * </p>
 * </li>
 * <li>
 * <p>
 * The document path provided in the update expression is invalid for update.
 * </p>
 * </li>
 * <li>
 * <p>
 * The provided expression refers to an attribute that does not exist in the item.
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
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
