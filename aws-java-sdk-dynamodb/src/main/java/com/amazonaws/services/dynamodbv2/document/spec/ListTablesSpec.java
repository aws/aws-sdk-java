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
package com.amazonaws.services.dynamodbv2.document.spec;

import com.amazonaws.event.ProgressListener;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.services.dynamodbv2.model.ListTablesRequest;

/**
 * Full parameter specification for the ListTables API.
 */
public class ListTablesSpec extends AbstractCollectionSpec<ListTablesRequest> {

    public ListTablesSpec() {
        super(new ListTablesRequest());
    }

    public String getExclusiveStartTableName() {
        return getRequest().getExclusiveStartTableName();
    }

    public ListTablesSpec withExclusiveStartTableName(String exclusiveStartTableName) {
        getRequest().setExclusiveStartTableName(exclusiveStartTableName);
        return this;
    }

    @Override
    public ListTablesSpec withMaxResultSize(Integer maxResultSize) {
        setMaxResultSize(maxResultSize);
        return this;
    }

    @Override
    public ListTablesSpec withMaxResultSize(int maxResultSize) {
        setMaxResultSize(maxResultSize);
        return this;
    }

    @Override
    public ListTablesSpec withMaxPageSize(Integer maxPageSize) {
        setMaxPageSize(maxPageSize);
        return this;
    }

    @Override
    public ListTablesSpec withMaxPageSize(int maxPageSize) {
        setMaxPageSize(maxPageSize);
        return this;
    }

    @Override
    public ListTablesSpec withProgressListener(ProgressListener progressListener) {
        setProgressListener(progressListener);
        return this;
    }

    @Override
    public ListTablesSpec withRequestMetricCollector(
            RequestMetricCollector requestMetricCollector) {
        setRequestMetricCollector(requestMetricCollector);
        return this;
    }
}
