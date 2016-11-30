/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lightsail.model.transform;

import java.util.Map;
import java.util.Map.Entry;
import java.math.*;
import java.nio.ByteBuffer;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MetricDatapoint JSON Unmarshaller
 */
public class MetricDatapointJsonUnmarshaller implements Unmarshaller<MetricDatapoint, JsonUnmarshallerContext> {

    public MetricDatapoint unmarshall(JsonUnmarshallerContext context) throws Exception {
        MetricDatapoint metricDatapoint = new MetricDatapoint();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("average", targetDepth)) {
                    context.nextToken();
                    metricDatapoint.setAverage(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("maximum", targetDepth)) {
                    context.nextToken();
                    metricDatapoint.setMaximum(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("minimum", targetDepth)) {
                    context.nextToken();
                    metricDatapoint.setMinimum(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("sampleCount", targetDepth)) {
                    context.nextToken();
                    metricDatapoint.setSampleCount(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("sum", targetDepth)) {
                    context.nextToken();
                    metricDatapoint.setSum(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("timestamp", targetDepth)) {
                    context.nextToken();
                    metricDatapoint.setTimestamp(context.getUnmarshaller(java.util.Date.class).unmarshall(context));
                }
                if (context.testExpression("unit", targetDepth)) {
                    context.nextToken();
                    metricDatapoint.setUnit(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return metricDatapoint;
    }

    private static MetricDatapointJsonUnmarshaller instance;

    public static MetricDatapointJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MetricDatapointJsonUnmarshaller();
        return instance;
    }
}
