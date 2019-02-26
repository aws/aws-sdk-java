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
import com.amazonaws.services.dynamodbv2.document.TableCollection;
import com.amazonaws.services.dynamodbv2.document.api.ListTablesApi;
import com.amazonaws.services.dynamodbv2.document.spec.ListTablesSpec;
import com.amazonaws.services.dynamodbv2.model.ListTablesResult;

/**
 * The implementation for <code>ListTablesApi</code>.
 */
public class ListTablesImpl implements ListTablesApi {
    private final AmazonDynamoDB client;

    public ListTablesImpl(AmazonDynamoDB client) { 
        this.client = client;
    }

    @Override
    public TableCollection<ListTablesResult> listTables(ListTablesSpec spec) {
        return doList(spec);
    }

    @Override
    public TableCollection<ListTablesResult> listTables() {
        return doList(new ListTablesSpec());
    }

    @Override
    public TableCollection<ListTablesResult> listTables(String exclusiveStartTableName) {
        return doList(new ListTablesSpec()
            .withExclusiveStartTableName(exclusiveStartTableName));
    }

    @Override
    public TableCollection<ListTablesResult> listTables(String exclusiveStartTableName,
            int maxResultSize) {
        return doList(new ListTablesSpec()
            .withExclusiveStartTableName(exclusiveStartTableName)
            .withMaxResultSize(maxResultSize));
    }

    @Override
    public TableCollection<ListTablesResult> listTables(int maxResultSize) {
        return doList(new ListTablesSpec()
            .withMaxResultSize(maxResultSize));
    }

    private TableCollection<ListTablesResult> doList(ListTablesSpec spec) {
        return new ListTablesCollection(client, spec);
    }
}
