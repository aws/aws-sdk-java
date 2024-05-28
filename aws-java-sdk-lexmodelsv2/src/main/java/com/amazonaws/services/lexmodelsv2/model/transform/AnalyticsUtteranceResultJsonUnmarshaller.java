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
package com.amazonaws.services.lexmodelsv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lexmodelsv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AnalyticsUtteranceResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalyticsUtteranceResultJsonUnmarshaller implements Unmarshaller<AnalyticsUtteranceResult, JsonUnmarshallerContext> {

    public AnalyticsUtteranceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        AnalyticsUtteranceResult analyticsUtteranceResult = new AnalyticsUtteranceResult();

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
                if (context.testExpression("binKeys", targetDepth)) {
                    context.nextToken();
                    analyticsUtteranceResult.setBinKeys(new ListUnmarshaller<AnalyticsBinKey>(AnalyticsBinKeyJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("groupByKeys", targetDepth)) {
                    context.nextToken();
                    analyticsUtteranceResult.setGroupByKeys(new ListUnmarshaller<AnalyticsUtteranceGroupByKey>(AnalyticsUtteranceGroupByKeyJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("metricsResults", targetDepth)) {
                    context.nextToken();
                    analyticsUtteranceResult.setMetricsResults(new ListUnmarshaller<AnalyticsUtteranceMetricResult>(
                            AnalyticsUtteranceMetricResultJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("attributeResults", targetDepth)) {
                    context.nextToken();
                    analyticsUtteranceResult.setAttributeResults(new ListUnmarshaller<AnalyticsUtteranceAttributeResult>(
                            AnalyticsUtteranceAttributeResultJsonUnmarshaller.getInstance())

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

        return analyticsUtteranceResult;
    }

    private static AnalyticsUtteranceResultJsonUnmarshaller instance;

    public static AnalyticsUtteranceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AnalyticsUtteranceResultJsonUnmarshaller();
        return instance;
    }
}
