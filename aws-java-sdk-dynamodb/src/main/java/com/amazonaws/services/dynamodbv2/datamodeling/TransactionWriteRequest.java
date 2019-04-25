/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.datamodeling;

import java.util.ArrayList;
import java.util.List;

import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.services.dynamodbv2.model.ReturnValuesOnConditionCheckFailure;

/**
 * Represents objects to write using {@link DynamoDBMapper#transactionWrite(TransactionWriteRequest)} operation.
 */
@NotThreadSafe
public class TransactionWriteRequest {

    /**
     * List of TransactionWriteOperations where each TransactionWriteOperation represents a write operation to be executed on an object as part of
     * this transactional write request.
     */
    private final List<TransactionWriteOperation> transactionWriteOperations;

    /**
     * Token used to support idempotency on server side. For more information, please refer:
     * https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_TransactWriteItems.html
     */
    private String idempotencyToken;

    public TransactionWriteRequest() {
        transactionWriteOperations = new ArrayList<TransactionWriteOperation>();
    }

    /**
     * Adds put operation (to be executed on object) to the list of transaction write operations.
     * If the corresponding item exists, it will be overwritten.
     */
    public TransactionWriteRequest addPut(Object object) {
        return addPut(object, null /* transactionWriteExpression */);
    }

    /**
     * Adds put operation (to be executed on object) to the list of transaction write operations.
     * transactionWriteExpression is used to conditionally put object.
     */
    public TransactionWriteRequest addPut(Object object, DynamoDBTransactionWriteExpression transactionWriteExpression) {
        return addPut(object, transactionWriteExpression, null /* returnValuesOnConditionCheckFailure */);
    }

    /**
     * Adds put operation (to be executed on object) to the list of transaction write operations.
     * transactionWriteExpression is used to conditionally put object.
     * returnValuesOnConditionCheckFailure specifies which attributes values (of existing item) should be returned if condition check fails.
     */
    public TransactionWriteRequest addPut(Object object,
                                          DynamoDBTransactionWriteExpression transactionWriteExpression,
                                          ReturnValuesOnConditionCheckFailure returnValuesOnConditionCheckFailure) {
        transactionWriteOperations.add(new TransactionWriteOperation(object, TransactionWriteOperationType.Put, transactionWriteExpression, returnValuesOnConditionCheckFailure));
        return this;
    }

    /**
     * Adds update operation (to be executed on object) to the list of transaction write operations.
     */
    public TransactionWriteRequest addUpdate(Object object) {
        return addUpdate(object, null /* transactionWriteExpression */);
    }

    /**
     * Adds update operation (to be executed on object) to the list of transaction write operations.
     * transactionWriteExpression is used to conditionally update object.
     */
    public TransactionWriteRequest addUpdate(Object object, DynamoDBTransactionWriteExpression transactionWriteExpression) {
        return addUpdate(object, transactionWriteExpression, null /* returnValuesOnConditionCheckFailure */);
    }

    /**
     * Adds update operation (to be executed on object) to the list of transaction write operations.
     * transactionWriteExpression is used to conditionally update object.
     * returnValuesOnConditionCheckFailure specifies which attributes values (of existing item) should be returned if condition check fails.
     */
    public TransactionWriteRequest addUpdate(Object object,
                                             DynamoDBTransactionWriteExpression transactionWriteExpression,
                                             ReturnValuesOnConditionCheckFailure returnValuesOnConditionCheckFailure) {
        transactionWriteOperations.add(new TransactionWriteOperation(object, TransactionWriteOperationType.Update, transactionWriteExpression, returnValuesOnConditionCheckFailure));
        return this;
    }

    /**
     * Adds delete operation (to be executed on the object represented by key) to the list of transaction write operations.
     */
    public TransactionWriteRequest addDelete(Object key) {
        return addDelete(key, null /* transactionWriteExpression */);
    }

    /**
     * Adds delete operation (to be executed on the object represented by key) to the list of transaction write operations.
     * transactionWriteExpression is used to conditionally delete the object represented by key.
     */
    public TransactionWriteRequest addDelete(Object key, DynamoDBTransactionWriteExpression transactionWriteExpression) {
        return addDelete(key, transactionWriteExpression, null /* returnValuesOnConditionCheckFailure */);
    }

    /**
     * Adds delete operation (to be executed on the object represented by key) to the list of transaction write operations.
     * transactionWriteExpression is used to conditionally delete the object represented by key.
     * returnValuesOnConditionCheckFailure specifies which attributes values (of existing item) should be returned if condition check fails.
     */
    public TransactionWriteRequest addDelete(Object key,
                                             DynamoDBTransactionWriteExpression transactionWriteExpression,
                                             ReturnValuesOnConditionCheckFailure returnValuesOnConditionCheckFailure ) {
        transactionWriteOperations.add(new TransactionWriteOperation(key, TransactionWriteOperationType.Delete, transactionWriteExpression, returnValuesOnConditionCheckFailure));
        return this;
    }

    /**
     * Adds conditionCheck operation (to be executed on the object represented by key) to the list of transaction write operations.
     * transactionWriteExpression is used to condition check on the object represented by key.
     */
    public TransactionWriteRequest addConditionCheck(Object key, DynamoDBTransactionWriteExpression transactionWriteExpression) {
        return addConditionCheck(key, transactionWriteExpression, null /* returnValuesOnConditionCheckFailure */);
    }

    /**
     * Adds conditionCheck operation (to be executed on the object represented by key) to the list of transaction write operations.
     * transactionWriteExpression is used to condition check on the object represented by key.
     * returnValuesOnConditionCheckFailure specifies which attributes values (of existing item) should be returned if condition check fails.
     */
    public TransactionWriteRequest addConditionCheck(Object key,
                                                     DynamoDBTransactionWriteExpression transactionWriteExpression,
                                                     ReturnValuesOnConditionCheckFailure returnValuesOnConditionCheckFailure) {
        transactionWriteOperations.add(new TransactionWriteOperation(key, TransactionWriteOperationType.ConditionCheck, transactionWriteExpression, returnValuesOnConditionCheckFailure));
        return this;
    }

    /**
     * Token used to support idempotency on server side. For more information, please refer:
     * https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_TransactWriteItems.html
     */
    public TransactionWriteRequest withIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
        return this;
    }

    /**
     * List of TransactionWriteOperations to be executed as part of this transactional write request.
     */
    public List<TransactionWriteOperation> getTransactionWriteOperations() {
        return transactionWriteOperations;
    }

    /**
     * Token used to support idempotency on server side.
     */
    public String getIdempotencyToken() {
        return idempotencyToken;
    }

    /**
     * Represents a write operation to be executed on an object as part of a transactional write request.
     */
    public static class TransactionWriteOperation {
        private Object object;
        private TransactionWriteOperationType transactionWriteOperationType;
        private DynamoDBTransactionWriteExpression dynamoDBTransactionWriteExpression;
        private ReturnValuesOnConditionCheckFailure returnValuesOnConditionCheckFailure;

        public TransactionWriteOperation(Object object,
                                         TransactionWriteOperationType transactionWriteOperationType,
                                         DynamoDBTransactionWriteExpression dynamoDBTransactionWriteExpression,
                                         ReturnValuesOnConditionCheckFailure returnValuesOnConditionCheckFailure) {
            this.object = object;
            this.transactionWriteOperationType = transactionWriteOperationType;
            this.dynamoDBTransactionWriteExpression = dynamoDBTransactionWriteExpression;
            this.returnValuesOnConditionCheckFailure = returnValuesOnConditionCheckFailure;
        }

        /**
         * Object on which this operation would be executed.
         */
        public Object getObject() {
            return object;
        }

        /**
         * Type of this operation.
         */
        public TransactionWriteOperationType getTransactionWriteOperationType() {
            return transactionWriteOperationType;
        }

        /**
         * Write expression for conditionally executing this operation.
         */
        public DynamoDBTransactionWriteExpression getDynamoDBTransactionWriteExpression() {
           return dynamoDBTransactionWriteExpression;
        }

        /**
         * Return value type that specifies which attributes values (of existing item) should be returned if condition check fails.
         */
        public ReturnValuesOnConditionCheckFailure getReturnValuesOnConditionCheckFailure() {
            return returnValuesOnConditionCheckFailure;
        }

    }

    /**
     * Operation type for transactional write operations.
     */
    public enum TransactionWriteOperationType {
        Put,
        Update,
        ConditionCheck,
        Delete
    }
}
