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

import static com.amazonaws.services.dynamodbv2.document.internal.InternalUtils.toAttributeValueMap;
import static com.amazonaws.services.dynamodbv2.document.internal.InternalUtils.toAttributeValues;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.document.BatchWriteItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PrimaryKey;
import com.amazonaws.services.dynamodbv2.document.TableWriteItems;
import com.amazonaws.services.dynamodbv2.document.api.BatchWriteItemApi;
import com.amazonaws.services.dynamodbv2.document.spec.BatchWriteItemSpec;
import com.amazonaws.services.dynamodbv2.model.BatchWriteItemRequest;
import com.amazonaws.services.dynamodbv2.model.BatchWriteItemResult;
import com.amazonaws.services.dynamodbv2.model.DeleteRequest;
import com.amazonaws.services.dynamodbv2.model.PutRequest;
import com.amazonaws.services.dynamodbv2.model.WriteRequest;

/**
 * The implementation for <code>BatchWriteItemApi</code>.
 */
public class BatchWriteItemImpl implements BatchWriteItemApi {
    private final AmazonDynamoDB client;

    public BatchWriteItemImpl(AmazonDynamoDB client) {
        this.client = client;
    }

    @Override
    public BatchWriteItemOutcome batchWriteItem(
            TableWriteItems... tableWriteItems) {
        return doBatchWriteItem(new BatchWriteItemSpec()
                .withTableWriteItems(tableWriteItems));
    }

    @Override
    public BatchWriteItemOutcome batchWriteItem(BatchWriteItemSpec spec) {
        return doBatchWriteItem(spec);
    }

    @Override
    public BatchWriteItemOutcome batchWriteItemUnprocessed(
            Map<String, List<WriteRequest>> unprocessedItems) {
        return doBatchWriteItem(new BatchWriteItemSpec()
                .withUnprocessedItems(unprocessedItems));
    }

    private BatchWriteItemOutcome doBatchWriteItem(BatchWriteItemSpec spec) {
        final Collection<TableWriteItems> tableWriteItemsCol =
                spec.getTableWriteItems();
        // Unprocessed items take precedence
        Map<String, List<WriteRequest>> requestItems = spec.getUnprocessedItems();
        if (requestItems == null || requestItems.size() == 0) {
            // handle new requests only if there is no unprocessed items
            requestItems = new LinkedHashMap<String, List<WriteRequest>>();
        } else {
            requestItems = new LinkedHashMap<String, List<WriteRequest>>(requestItems);
        }
        if (tableWriteItemsCol != null) {
            for (TableWriteItems tableWriteItems: tableWriteItemsCol) {
                // items to be put to a single table
                Collection<Item> itemsToPut = tableWriteItems.getItemsToPut();
                // primary keys to deleted in a single table
                final List<PrimaryKey> pksToDelete =
                        tableWriteItems.getPrimaryKeysToDelete();
                // Merge them into a list of write requests to a single table
                final int numPut = itemsToPut == null ? 0 : itemsToPut.size();
                final int numDel = pksToDelete == null ? 0 : pksToDelete.size();
                final List<WriteRequest> writeRequests =
                    new ArrayList<WriteRequest>(numPut + numDel);
                // Put requests for a single table
                if (itemsToPut != null) {
                    for (Item item: itemsToPut) {
                        writeRequests.add(new WriteRequest()
                            .withPutRequest(new PutRequest()
                                .withItem(toAttributeValues(item))));
                    }
                }
                // Delete requests for a single table
                if (pksToDelete != null) {
                    for (PrimaryKey pkToDelete: pksToDelete) {
                        writeRequests.add(new WriteRequest()
                            .withDeleteRequest(new DeleteRequest()
                                .withKey(toAttributeValueMap(pkToDelete))));
                    }
                }
                requestItems.put(tableWriteItems.getTableName(), writeRequests);
            }
        }
        BatchWriteItemRequest req = spec.getRequest()
                .withRequestItems(requestItems);
        BatchWriteItemResult result = client.batchWriteItem(req);
        return new BatchWriteItemOutcome(result);
    }
}
