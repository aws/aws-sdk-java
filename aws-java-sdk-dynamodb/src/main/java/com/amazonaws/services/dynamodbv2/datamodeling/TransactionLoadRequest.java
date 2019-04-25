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

/**
 * Represents objects to load using {@link DynamoDBMapper#transactionLoad(TransactionLoadRequest)} operation.
 */
@NotThreadSafe
public class TransactionLoadRequest {
    /**
     * Key objects, corresponding to the classes to load, with their primary key values set.
     */
    private final List<Object> objectsToLoad;

    /**
     * Projection expressions for loading specific item attributes. By default, all item attributes are loaded.
     */
    private final List<DynamoDBTransactionLoadExpression> objectLoadExpressions;

    public TransactionLoadRequest() {
        objectsToLoad = new ArrayList<Object>();
        objectLoadExpressions = new ArrayList<DynamoDBTransactionLoadExpression>();
    }

    /**
     * Adds specified key to list of objects to load. All item attributes will be loaded.
     */
    public TransactionLoadRequest addLoad(Object key) {
        objectsToLoad.add(key);
        objectLoadExpressions.add(null);
        return this;
    }

    /**
     * Adds specified key to list of objects to load. Item attributes will be loaded as specified by transactLoadExpression.
     */
    public TransactionLoadRequest addLoad(Object key, DynamoDBTransactionLoadExpression transactLoadExpression) {
        objectsToLoad.add(key);
        objectLoadExpressions.add(transactLoadExpression);
        return this;
    }

    /**
     * Key objects corresponding to the classes to load.
     */
    public List<Object> getObjectsToLoad() {
        return objectsToLoad;
    }

    /**
     * Projection expressions for loading specific item attributes.
     */
    public List<DynamoDBTransactionLoadExpression> getObjectLoadExpressions() {
        return objectLoadExpressions;
    }
}
