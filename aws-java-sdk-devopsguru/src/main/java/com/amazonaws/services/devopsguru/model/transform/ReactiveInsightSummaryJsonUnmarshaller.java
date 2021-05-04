/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devopsguru.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.devopsguru.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ReactiveInsightSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReactiveInsightSummaryJsonUnmarshaller implements Unmarshaller<ReactiveInsightSummary, JsonUnmarshallerContext> {

    public ReactiveInsightSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReactiveInsightSummary reactiveInsightSummary = new ReactiveInsightSummary();

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
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    reactiveInsightSummary.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    reactiveInsightSummary.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Severity", targetDepth)) {
                    context.nextToken();
                    reactiveInsightSummary.setSeverity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    reactiveInsightSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InsightTimeRange", targetDepth)) {
                    context.nextToken();
                    reactiveInsightSummary.setInsightTimeRange(InsightTimeRangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ResourceCollection", targetDepth)) {
                    context.nextToken();
                    reactiveInsightSummary.setResourceCollection(ResourceCollectionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ServiceCollection", targetDepth)) {
                    context.nextToken();
                    reactiveInsightSummary.setServiceCollection(ServiceCollectionJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return reactiveInsightSummary;
    }

    private static ReactiveInsightSummaryJsonUnmarshaller instance;

    public static ReactiveInsightSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReactiveInsightSummaryJsonUnmarshaller();
        return instance;
    }
}
