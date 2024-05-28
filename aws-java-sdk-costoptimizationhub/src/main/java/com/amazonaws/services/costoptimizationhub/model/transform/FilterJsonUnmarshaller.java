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
package com.amazonaws.services.costoptimizationhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.costoptimizationhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Filter JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilterJsonUnmarshaller implements Unmarshaller<Filter, JsonUnmarshallerContext> {

    public Filter unmarshall(JsonUnmarshallerContext context) throws Exception {
        Filter filter = new Filter();

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
                if (context.testExpression("accountIds", targetDepth)) {
                    context.nextToken();
                    filter.setAccountIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("actionTypes", targetDepth)) {
                    context.nextToken();
                    filter.setActionTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("implementationEfforts", targetDepth)) {
                    context.nextToken();
                    filter.setImplementationEfforts(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("recommendationIds", targetDepth)) {
                    context.nextToken();
                    filter.setRecommendationIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("regions", targetDepth)) {
                    context.nextToken();
                    filter.setRegions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("resourceArns", targetDepth)) {
                    context.nextToken();
                    filter.setResourceArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("resourceIds", targetDepth)) {
                    context.nextToken();
                    filter.setResourceIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("resourceTypes", targetDepth)) {
                    context.nextToken();
                    filter.setResourceTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("restartNeeded", targetDepth)) {
                    context.nextToken();
                    filter.setRestartNeeded(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("rollbackPossible", targetDepth)) {
                    context.nextToken();
                    filter.setRollbackPossible(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    filter.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

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

        return filter;
    }

    private static FilterJsonUnmarshaller instance;

    public static FilterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FilterJsonUnmarshaller();
        return instance;
    }
}
