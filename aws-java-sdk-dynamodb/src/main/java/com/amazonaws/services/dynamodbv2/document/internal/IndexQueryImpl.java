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
import com.amazonaws.services.dynamodbv2.document.Index;
import com.amazonaws.services.dynamodbv2.document.ItemCollection;
import com.amazonaws.services.dynamodbv2.document.QueryOutcome;
import com.amazonaws.services.dynamodbv2.document.api.QueryApi;
import com.amazonaws.services.dynamodbv2.document.spec.QuerySpec;

/**
 * The implementation for <code>QueryApi</code> for an index.
 */
public class IndexQueryImpl extends QueryImpl implements QueryApi {
    private final Index index;

    public IndexQueryImpl(AmazonDynamoDB client, Index index) { 
        super(client, index.getTable());
        this.index = index;
    }

    @Override
    protected ItemCollection<QueryOutcome> doQuery(QuerySpec spec) {
        spec.getRequest().setIndexName(index.getIndexName());
        return super.doQuery(spec);
    }
}
