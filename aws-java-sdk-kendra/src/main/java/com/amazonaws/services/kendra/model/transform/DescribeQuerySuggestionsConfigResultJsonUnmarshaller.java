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
package com.amazonaws.services.kendra.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeQuerySuggestionsConfigResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeQuerySuggestionsConfigResultJsonUnmarshaller implements Unmarshaller<DescribeQuerySuggestionsConfigResult, JsonUnmarshallerContext> {

    public DescribeQuerySuggestionsConfigResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeQuerySuggestionsConfigResult describeQuerySuggestionsConfigResult = new DescribeQuerySuggestionsConfigResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeQuerySuggestionsConfigResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Mode", targetDepth)) {
                    context.nextToken();
                    describeQuerySuggestionsConfigResult.setMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    describeQuerySuggestionsConfigResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QueryLogLookBackWindowInDays", targetDepth)) {
                    context.nextToken();
                    describeQuerySuggestionsConfigResult.setQueryLogLookBackWindowInDays(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("IncludeQueriesWithoutUserInformation", targetDepth)) {
                    context.nextToken();
                    describeQuerySuggestionsConfigResult.setIncludeQueriesWithoutUserInformation(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("MinimumNumberOfQueryingUsers", targetDepth)) {
                    context.nextToken();
                    describeQuerySuggestionsConfigResult.setMinimumNumberOfQueryingUsers(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MinimumQueryCount", targetDepth)) {
                    context.nextToken();
                    describeQuerySuggestionsConfigResult.setMinimumQueryCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("LastSuggestionsBuildTime", targetDepth)) {
                    context.nextToken();
                    describeQuerySuggestionsConfigResult.setLastSuggestionsBuildTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(
                            context));
                }
                if (context.testExpression("LastClearTime", targetDepth)) {
                    context.nextToken();
                    describeQuerySuggestionsConfigResult.setLastClearTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TotalSuggestionsCount", targetDepth)) {
                    context.nextToken();
                    describeQuerySuggestionsConfigResult.setTotalSuggestionsCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeQuerySuggestionsConfigResult;
    }

    private static DescribeQuerySuggestionsConfigResultJsonUnmarshaller instance;

    public static DescribeQuerySuggestionsConfigResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeQuerySuggestionsConfigResultJsonUnmarshaller();
        return instance;
    }
}
