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

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.amazonaws.event.ProgressListener;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.services.dynamodbv2.document.TableWriteItems;
import com.amazonaws.services.dynamodbv2.model.BatchWriteItemRequest;
import com.amazonaws.services.dynamodbv2.model.ReturnConsumedCapacity;
import com.amazonaws.services.dynamodbv2.model.WriteRequest;

/**
 * Full parameter specification for the BatchWriteItem API.
 */
public class BatchWriteItemSpec extends AbstractSpec<BatchWriteItemRequest> {
    private Collection<TableWriteItems> tableWriteItems;
    private Map<String, List<WriteRequest>> unprocessedItems;

    public BatchWriteItemSpec() {
        super(new BatchWriteItemRequest());
    }

    public Collection<TableWriteItems> getTableWriteItems() {
        return tableWriteItems;
    }

    public BatchWriteItemSpec withTableWriteItems(
            TableWriteItems ... tableWriteItems) {
        if (tableWriteItems == null)
            this.tableWriteItems = null;
        else {
            Set<String> names = new LinkedHashSet<String>();
            for (TableWriteItems e: tableWriteItems)
                names.add(e.getTableName());
            if (names.size() != tableWriteItems.length) {
                throw new IllegalArgumentException(
                    "table names must not duplicate in the list of TableWriteItems");
            }
            this.tableWriteItems = Arrays.asList(tableWriteItems);
        }
        return this;
    }


    public String getReturnConsumedCapacity() {
        return getRequest().getReturnConsumedCapacity();
    }


    public BatchWriteItemSpec withReturnConsumedCapacity(ReturnConsumedCapacity capacity) {
        getRequest().withReturnConsumedCapacity(capacity);
        return this;
    }

    @Override
    public BatchWriteItemSpec withProgressListener(ProgressListener progressListener) {
        setProgressListener(progressListener);
        return this;
    }

    @Override
    public BatchWriteItemSpec withRequestMetricCollector(
            RequestMetricCollector requestMetricCollector) {
        setRequestMetricCollector(requestMetricCollector);
        return this;
    }

    public Map<String, List<WriteRequest>> getUnprocessedItems() {
        return unprocessedItems;
    }

    public BatchWriteItemSpec withUnprocessedItems(
            Map<String, List<WriteRequest>> unprocessedItems) {
        this.unprocessedItems = Collections.unmodifiableMap(
                new LinkedHashMap<String, List<WriteRequest>>(unprocessedItems));
        return this;
    }
}
