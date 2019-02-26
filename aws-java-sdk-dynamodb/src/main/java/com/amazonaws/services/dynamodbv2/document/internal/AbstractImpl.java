/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.document.internal;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.document.Table;

/**
 * Internal common base class for API implementations.
 */
abstract class AbstractImpl {
    private final Table table;
    private final AmazonDynamoDB client;

    protected AbstractImpl(AmazonDynamoDB client, Table table) { 
        this.client = client;
        this.table = table;
    }

    /**
     * Returns the owning table.
     */
    public final Table getTable() {
        return table;
    }

    final AmazonDynamoDB getClient() {
        return client;
    }
}
