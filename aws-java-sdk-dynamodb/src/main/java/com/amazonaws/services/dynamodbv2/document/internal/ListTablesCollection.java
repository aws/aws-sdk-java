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
import com.amazonaws.services.dynamodbv2.document.Page;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.TableCollection;
import com.amazonaws.services.dynamodbv2.document.spec.ListTablesSpec;
import com.amazonaws.services.dynamodbv2.model.ListTablesRequest;
import com.amazonaws.services.dynamodbv2.model.ListTablesResult;

class ListTablesCollection extends TableCollection<ListTablesResult> {

    private final AmazonDynamoDB client;
    private final ListTablesSpec spec;
    private final String startKey;

    public ListTablesCollection(AmazonDynamoDB client, ListTablesSpec spec) {
        this.client = client;
        this.spec = spec;
        this.startKey = spec.getExclusiveStartTableName();
    }

    @Override
    public Page<Table, ListTablesResult> firstPage() {
        ListTablesRequest request = spec.getRequest();
        request.setExclusiveStartTableName(startKey);

        request.setLimit(InternalUtils.minimum(
                spec.getMaxResultSize(),
                spec.getMaxPageSize()));

        ListTablesResult result = client.listTables(request);
        setLastLowLevelResult(result);
        return new ListTablesPage(client, spec, request, 0, result);
    }

    @Override
    public Integer getMaxResultSize() {
        return spec.getMaxResultSize();
    }
}
