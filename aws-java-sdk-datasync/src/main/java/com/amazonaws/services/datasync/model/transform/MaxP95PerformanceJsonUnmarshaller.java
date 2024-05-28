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
package com.amazonaws.services.datasync.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.datasync.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MaxP95Performance JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MaxP95PerformanceJsonUnmarshaller implements Unmarshaller<MaxP95Performance, JsonUnmarshallerContext> {

    public MaxP95Performance unmarshall(JsonUnmarshallerContext context) throws Exception {
        MaxP95Performance maxP95Performance = new MaxP95Performance();

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
                if (context.testExpression("IopsRead", targetDepth)) {
                    context.nextToken();
                    maxP95Performance.setIopsRead(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("IopsWrite", targetDepth)) {
                    context.nextToken();
                    maxP95Performance.setIopsWrite(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("IopsOther", targetDepth)) {
                    context.nextToken();
                    maxP95Performance.setIopsOther(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("IopsTotal", targetDepth)) {
                    context.nextToken();
                    maxP95Performance.setIopsTotal(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("ThroughputRead", targetDepth)) {
                    context.nextToken();
                    maxP95Performance.setThroughputRead(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("ThroughputWrite", targetDepth)) {
                    context.nextToken();
                    maxP95Performance.setThroughputWrite(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("ThroughputOther", targetDepth)) {
                    context.nextToken();
                    maxP95Performance.setThroughputOther(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("ThroughputTotal", targetDepth)) {
                    context.nextToken();
                    maxP95Performance.setThroughputTotal(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("LatencyRead", targetDepth)) {
                    context.nextToken();
                    maxP95Performance.setLatencyRead(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("LatencyWrite", targetDepth)) {
                    context.nextToken();
                    maxP95Performance.setLatencyWrite(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("LatencyOther", targetDepth)) {
                    context.nextToken();
                    maxP95Performance.setLatencyOther(context.getUnmarshaller(Double.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return maxP95Performance;
    }

    private static MaxP95PerformanceJsonUnmarshaller instance;

    public static MaxP95PerformanceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MaxP95PerformanceJsonUnmarshaller();
        return instance;
    }
}
