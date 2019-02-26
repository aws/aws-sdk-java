/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.datamodeling;

import java.util.Map;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;

public class TestParameters<T>
        implements AttributeTransformer.Parameters<T> {

    private Map<String, AttributeValue> attributeValues;

    public TestParameters() {
        this(null);
    }

    public TestParameters(Map<String, AttributeValue> attributeValues) {
        this.attributeValues = attributeValues;
    }

    public Map<String, AttributeValue> getAttributeValues() {
        return attributeValues;
    }

    public boolean isPartialUpdate() {
        return false;
    }

    public Class<T> getModelClass() {
        return null;
    }

    public DynamoDBMapperConfig getMapperConfig() {
        return null;
    }

    public String getTableName() {
        return null;
    }

    public String getHashKeyName() {
        return null;
    }

    public String getRangeKeyName() {
        return null;
    }
}
