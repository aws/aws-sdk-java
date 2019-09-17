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
package com.amazonaws.services.applicationinsights.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.applicationinsights.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Problem JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProblemJsonUnmarshaller implements Unmarshaller<Problem, JsonUnmarshallerContext> {

    public Problem unmarshall(JsonUnmarshallerContext context) throws Exception {
        Problem problem = new Problem();

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
                    problem.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Title", targetDepth)) {
                    context.nextToken();
                    problem.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Insights", targetDepth)) {
                    context.nextToken();
                    problem.setInsights(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    problem.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AffectedResource", targetDepth)) {
                    context.nextToken();
                    problem.setAffectedResource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    context.nextToken();
                    problem.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    context.nextToken();
                    problem.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("SeverityLevel", targetDepth)) {
                    context.nextToken();
                    problem.setSeverityLevel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceGroupName", targetDepth)) {
                    context.nextToken();
                    problem.setResourceGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Feedback", targetDepth)) {
                    context.nextToken();
                    problem.setFeedback(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
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

        return problem;
    }

    private static ProblemJsonUnmarshaller instance;

    public static ProblemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProblemJsonUnmarshaller();
        return instance;
    }
}
