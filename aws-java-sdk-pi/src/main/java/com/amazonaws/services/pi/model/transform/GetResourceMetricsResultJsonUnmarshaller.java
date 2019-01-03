/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pi.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pi.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetResourceMetricsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourceMetricsResultJsonUnmarshaller implements Unmarshaller<GetResourceMetricsResult, JsonUnmarshallerContext> {

    public GetResourceMetricsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetResourceMetricsResult getResourceMetricsResult = new GetResourceMetricsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getResourceMetricsResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("AlignedStartTime", targetDepth)) {
                    context.nextToken();
                    getResourceMetricsResult.setAlignedStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("AlignedEndTime", targetDepth)) {
                    context.nextToken();
                    getResourceMetricsResult.setAlignedEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Identifier", targetDepth)) {
                    context.nextToken();
                    getResourceMetricsResult.setIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MetricList", targetDepth)) {
                    context.nextToken();
                    getResourceMetricsResult.setMetricList(new ListUnmarshaller<MetricKeyDataPoints>(MetricKeyDataPointsJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("NextToken", targetDepth)) {
                    context.nextToken();
                    getResourceMetricsResult.setNextToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getResourceMetricsResult;
    }

    private static GetResourceMetricsResultJsonUnmarshaller instance;

    public static GetResourceMetricsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetResourceMetricsResultJsonUnmarshaller();
        return instance;
    }
}
