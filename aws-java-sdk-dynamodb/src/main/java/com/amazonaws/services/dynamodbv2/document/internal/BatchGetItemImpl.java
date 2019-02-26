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
import com.amazonaws.services.dynamodbv2.document.BatchGetItemOutcome;
import com.amazonaws.services.dynamodbv2.document.PrimaryKey;
import com.amazonaws.services.dynamodbv2.document.TableKeysAndAttributes;
import com.amazonaws.services.dynamodbv2.document.api.BatchGetItemApi;
import com.amazonaws.services.dynamodbv2.document.spec.BatchGetItemSpec;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.BatchGetItemRequest;
import com.amazonaws.services.dynamodbv2.model.BatchGetItemResult;
import com.amazonaws.services.dynamodbv2.model.KeysAndAttributes;
import com.amazonaws.services.dynamodbv2.model.ReturnConsumedCapacity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The implementation for <code>BatchGetItemApi</code>.
 */
public class BatchGetItemImpl implements BatchGetItemApi {
    private final AmazonDynamoDB client;

    public BatchGetItemImpl(AmazonDynamoDB client) {
        this.client = client;
    }

    @Override
    public BatchGetItemOutcome batchGetItem(
            ReturnConsumedCapacity returnConsumedCapacity,
            TableKeysAndAttributes ... tableKeysAndAttributes) {
        return doBatchGetItem(new BatchGetItemSpec()
            .withReturnConsumedCapacity(returnConsumedCapacity)
            .withTableKeyAndAttributes(tableKeysAndAttributes));
    }

    @Override
    public BatchGetItemOutcome batchGetItem(
            TableKeysAndAttributes ... tableKeysAndAttributes) {
        return doBatchGetItem(new BatchGetItemSpec()
            .withTableKeyAndAttributes(tableKeysAndAttributes));
    }

    @Override
    public BatchGetItemOutcome batchGetItem(BatchGetItemSpec spec) {
        return doBatchGetItem(spec);
    }

    private BatchGetItemOutcome doBatchGetItem(BatchGetItemSpec spec) {
        final Collection<TableKeysAndAttributes> tableKeysAndAttributesCol =
                spec.getTableKeysAndAttributes();
        // Unprocessed keys take precedence
        Map<String, KeysAndAttributes> requestItems = spec.getUnprocessedKeys();
        if (requestItems == null || requestItems.size() == 0) {
            // handle new requests only if there is no unprocessed keys
            requestItems = new LinkedHashMap<String, KeysAndAttributes>();
        } else {
            requestItems = new LinkedHashMap<String, KeysAndAttributes>(requestItems);
        }
        if (tableKeysAndAttributesCol != null) {
            for (TableKeysAndAttributes tableKeysAndAttributes: tableKeysAndAttributesCol) {
                // attributes against one table
                final Set<String> attrNames = tableKeysAndAttributes.getAttributeNames();
                // primary keys against one table
                final List<PrimaryKey> pks = tableKeysAndAttributes.getPrimaryKeys();
                final List<Map<String,AttributeValue>> keys = new ArrayList<Map<String,AttributeValue>>(pks.size());
                for (PrimaryKey pk: pks)
                    keys.add(InternalUtils.toAttributeValueMap(pk));
                final KeysAndAttributes keysAndAttrs = new KeysAndAttributes()
                    .withAttributesToGet(attrNames)
                    .withConsistentRead(tableKeysAndAttributes.isConsistentRead())
                    .withKeys(keys)
                    .withProjectionExpression(tableKeysAndAttributes.getProjectionExpression())
                    .withExpressionAttributeNames(tableKeysAndAttributes.getNameMap())
                    ;
                requestItems.put(tableKeysAndAttributes.getTableName(), keysAndAttrs);
            }
        }
        BatchGetItemRequest req = spec.getRequest()
                                  .withRequestItems(requestItems);
        BatchGetItemResult result = client.batchGetItem(req);
        return new BatchGetItemOutcome(result);
    }

    @Override
    public BatchGetItemOutcome batchGetItemUnprocessed(
            ReturnConsumedCapacity returnConsumedCapacity,
            Map<String, KeysAndAttributes> unprocessedKeys) {
        return doBatchGetItem(new BatchGetItemSpec()
                .withReturnConsumedCapacity(returnConsumedCapacity)
                .withUnprocessedKeys(unprocessedKeys));
    }

    @Override
    public BatchGetItemOutcome batchGetItemUnprocessed(
            Map<String, KeysAndAttributes> unprocessedKeys) {
        return doBatchGetItem(new BatchGetItemSpec()
                .withUnprocessedKeys(unprocessedKeys));
    }
}
