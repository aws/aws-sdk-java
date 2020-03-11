/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.dynamodbv2.utils;

import com.amazonaws.services.dynamodbv2.datamodeling.AttributeTransformer;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

import java.util.HashMap;
import java.util.Map;

public class AttributeAdder implements AttributeTransformer {

    private int start;
    private final String additionalAttribute;

    public AttributeAdder(String attributeName, int start) {
        this.additionalAttribute = attributeName;
        this.start = start;
    }

    @Override
    public Map<String, AttributeValue> transform(final Parameters<?> parameters) {
        Map<String, AttributeValue> rval = new HashMap<String, AttributeValue>(parameters.getAttributeValues());
        rval.put(additionalAttribute, new AttributeValue().withN(String.valueOf(start++)));
        return rval;
    }

    @Override
    public Map<String, AttributeValue> untransform(final Parameters<?> parameters) {
        Map<String, AttributeValue> rval = new HashMap<String, AttributeValue>(parameters.getAttributeValues());
        rval.remove(additionalAttribute);
        return rval;
    }

}
