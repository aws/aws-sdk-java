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
package com.amazonaws.services.cloudtrail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cloudtrail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ListInsightsMetricDataResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInsightsMetricDataResultJsonUnmarshaller implements Unmarshaller<ListInsightsMetricDataResult, JsonUnmarshallerContext> {

    public ListInsightsMetricDataResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListInsightsMetricDataResult listInsightsMetricDataResult = new ListInsightsMetricDataResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return listInsightsMetricDataResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("EventSource", targetDepth)) {
                    context.nextToken();
                    listInsightsMetricDataResult.setEventSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EventName", targetDepth)) {
                    context.nextToken();
                    listInsightsMetricDataResult.setEventName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InsightType", targetDepth)) {
                    context.nextToken();
                    listInsightsMetricDataResult.setInsightType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ErrorCode", targetDepth)) {
                    context.nextToken();
                    listInsightsMetricDataResult.setErrorCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Timestamps", targetDepth)) {
                    context.nextToken();
                    listInsightsMetricDataResult.setTimestamps(new ListUnmarshaller<java.util.Date>(DateJsonUnmarshallerFactory.getInstance("unixTimestamp"))

                    .unmarshall(context));
                }
                if (context.testExpression("Values", targetDepth)) {
                    context.nextToken();
                    listInsightsMetricDataResult.setValues(new ListUnmarshaller<Double>(context.getUnmarshaller(Double.class))

                    .unmarshall(context));
                }
                if (context.testExpression("NextToken", targetDepth)) {
                    context.nextToken();
                    listInsightsMetricDataResult.setNextToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return listInsightsMetricDataResult;
    }

    private static ListInsightsMetricDataResultJsonUnmarshaller instance;

    public static ListInsightsMetricDataResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListInsightsMetricDataResultJsonUnmarshaller();
        return instance;
    }
}
