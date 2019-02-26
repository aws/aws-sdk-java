/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.dynamodbv2.document.ScanOutcome;
import com.amazonaws.services.dynamodbv2.document.api.ScanApi;
import com.amazonaws.services.dynamodbv2.document.spec.ScanSpec;

/**
 * The implementation for <code>ScanApi</code> for an index.
 */
public class IndexScanImpl extends ScanImpl implements ScanApi {
    private final Index index;

    public IndexScanImpl(AmazonDynamoDB client, Index index) { 
        super(client, index.getTable());
        this.index = index;
    }

    @Override
    protected ItemCollection<ScanOutcome> doScan(ScanSpec spec) {
        spec.getRequest().setIndexName(index.getIndexName());
        return super.doScan(spec);
    }
}
