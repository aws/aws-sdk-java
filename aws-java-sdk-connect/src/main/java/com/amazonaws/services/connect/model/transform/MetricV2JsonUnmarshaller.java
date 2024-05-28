/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.connect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MetricV2 JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricV2JsonUnmarshaller implements Unmarshaller<MetricV2, JsonUnmarshallerContext> {

    public MetricV2 unmarshall(JsonUnmarshallerContext context) throws Exception {
        MetricV2 metricV2 = new MetricV2();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    metricV2.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Threshold", targetDepth)) {
                    context.nextToken();
                    metricV2.setThreshold(new ListUnmarshaller<ThresholdV2>(ThresholdV2JsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("MetricFilters", targetDepth)) {
                    context.nextToken();
                    metricV2.setMetricFilters(new ListUnmarshaller<MetricFilterV2>(MetricFilterV2JsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return metricV2;
    }

    private static MetricV2JsonUnmarshaller instance;

    public static MetricV2JsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MetricV2JsonUnmarshaller();
        return instance;
    }
}
