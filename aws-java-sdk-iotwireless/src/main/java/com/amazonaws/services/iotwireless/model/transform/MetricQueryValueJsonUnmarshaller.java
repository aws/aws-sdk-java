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
package com.amazonaws.services.iotwireless.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotwireless.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MetricQueryValue JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricQueryValueJsonUnmarshaller implements Unmarshaller<MetricQueryValue, JsonUnmarshallerContext> {

    public MetricQueryValue unmarshall(JsonUnmarshallerContext context) throws Exception {
        MetricQueryValue metricQueryValue = new MetricQueryValue();

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
                if (context.testExpression("Min", targetDepth)) {
                    context.nextToken();
                    metricQueryValue.setMin(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("Max", targetDepth)) {
                    context.nextToken();
                    metricQueryValue.setMax(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("Sum", targetDepth)) {
                    context.nextToken();
                    metricQueryValue.setSum(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("Avg", targetDepth)) {
                    context.nextToken();
                    metricQueryValue.setAvg(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("Std", targetDepth)) {
                    context.nextToken();
                    metricQueryValue.setStd(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("P90", targetDepth)) {
                    context.nextToken();
                    metricQueryValue.setP90(context.getUnmarshaller(Double.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return metricQueryValue;
    }

    private static MetricQueryValueJsonUnmarshaller instance;

    public static MetricQueryValueJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MetricQueryValueJsonUnmarshaller();
        return instance;
    }
}
