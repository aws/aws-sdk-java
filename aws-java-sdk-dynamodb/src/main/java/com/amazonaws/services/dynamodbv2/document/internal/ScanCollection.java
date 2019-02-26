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

import java.util.LinkedHashMap;
import java.util.Map;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.ItemCollection;
import com.amazonaws.services.dynamodbv2.document.Page;
import com.amazonaws.services.dynamodbv2.document.ScanOutcome;
import com.amazonaws.services.dynamodbv2.document.spec.ScanSpec;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ScanRequest;
import com.amazonaws.services.dynamodbv2.model.ScanResult;

class ScanCollection extends ItemCollection<ScanOutcome> {

    private final AmazonDynamoDB client;
    private final ScanSpec spec;
    private final Map<String, AttributeValue> startKey;

    public ScanCollection(AmazonDynamoDB client, ScanSpec spec) {
        this.client = client;
        this.spec = spec;
        Map<String, AttributeValue> startKey = spec.getRequest()
                .getExclusiveStartKey();
        this.startKey = startKey == null ? null : new LinkedHashMap<String, AttributeValue>(startKey);
    }

    @Override
    public Page<Item, ScanOutcome> firstPage() {
        ScanRequest request = spec.getRequest();
        request.setExclusiveStartKey(startKey);

        request.setLimit(InternalUtils.minimum(
                spec.getMaxResultSize(),
                spec.getMaxPageSize()));

        ScanResult result = client.scan(request);
        ScanOutcome outcome = new ScanOutcome(result);
        setLastLowLevelResult(outcome);
        return new ScanPage(client, spec, request, 0, outcome);
    }

    @Override
    public Integer getMaxResultSize() {
        return spec.getMaxResultSize();
    }

    protected void setLastLowLevelResult(ScanOutcome lowLevelResult) {
        super.setLastLowLevelResult(lowLevelResult);
        ScanResult result = lowLevelResult.getScanResult();
        accumulateStats(result.getConsumedCapacity(), result.getCount(),
                result.getScannedCount());
    }
}
