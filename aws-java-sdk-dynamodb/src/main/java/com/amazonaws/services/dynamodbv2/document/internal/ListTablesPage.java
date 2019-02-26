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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.document.Page;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.spec.ListTablesSpec;
import com.amazonaws.services.dynamodbv2.model.ListTablesRequest;
import com.amazonaws.services.dynamodbv2.model.ListTablesResult;

class ListTablesPage extends Page<Table, ListTablesResult> {
    private final AmazonDynamoDB client;
    private final ListTablesSpec spec;
    private final ListTablesRequest request;
    private final int index;
    private final String lastEvaluatedKey;

    public ListTablesPage(
            AmazonDynamoDB client,
            ListTablesSpec spec,
            ListTablesRequest request,
            int index,
            ListTablesResult result) {
        super(Collections.unmodifiableList(
                toTableList(client, result.getTableNames())),
            result);
        this.client = client;
        this.spec = spec;
        this.request = request;
        this.index = index;
        Integer max = spec.getMaxResultSize();
        if (max != null && (index + result.getTableNames().size()) > max) {
            this.lastEvaluatedKey = null;
        } else {
            this.lastEvaluatedKey = result.getLastEvaluatedTableName();
        }
    }

    @Override
    public boolean hasNextPage() {
        if (lastEvaluatedKey == null)
            return false;
        Integer max = spec.getMaxResultSize();
        if (max == null)
            return true;
        return nextRequestLimit(max.intValue()) > 0;
    }

    private int nextRequestLimit(int max) {
        int nextIndex = index + this.size();
        return InternalUtils.minimum(
                max - nextIndex,
                spec.getMaxPageSize());
    }

    @Override
    public Page<Table,ListTablesResult> nextPage() {
        if (lastEvaluatedKey == null) {
            throw new NoSuchElementException("No more pages");
        }
        final Integer max = spec.getMaxResultSize();
        if (max != null) {
            int nextLimit = nextRequestLimit(max.intValue());
            if (nextLimit == 0)
                throw new NoSuchElementException("No more pages");
            request.setLimit(nextLimit);
        }
        request.setExclusiveStartTableName(lastEvaluatedKey);
        ListTablesResult result = client.listTables(request);
        final int nextIndex = index + this.size();
        return new ListTablesPage(client, spec, request, nextIndex, result);
    }

    private static List<Table> toTableList(AmazonDynamoDB client, List<String> tableNames) {
        if (tableNames == null)
            return null;
        List<Table> result = new ArrayList<Table>(tableNames.size());
        for (String tableName: tableNames)
            result.add(new Table(client, tableName));
        return result;
    }
}
