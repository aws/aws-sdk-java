/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.personalize.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.personalize.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Solution JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SolutionJsonUnmarshaller implements Unmarshaller<Solution, JsonUnmarshallerContext> {

    public Solution unmarshall(JsonUnmarshallerContext context) throws Exception {
        Solution solution = new Solution();

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
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    solution.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("solutionArn", targetDepth)) {
                    context.nextToken();
                    solution.setSolutionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("performHPO", targetDepth)) {
                    context.nextToken();
                    solution.setPerformHPO(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("performAutoML", targetDepth)) {
                    context.nextToken();
                    solution.setPerformAutoML(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("recipeArn", targetDepth)) {
                    context.nextToken();
                    solution.setRecipeArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("datasetGroupArn", targetDepth)) {
                    context.nextToken();
                    solution.setDatasetGroupArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eventType", targetDepth)) {
                    context.nextToken();
                    solution.setEventType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("solutionConfig", targetDepth)) {
                    context.nextToken();
                    solution.setSolutionConfig(SolutionConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("autoMLResult", targetDepth)) {
                    context.nextToken();
                    solution.setAutoMLResult(AutoMLResultJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    solution.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    context.nextToken();
                    solution.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDateTime", targetDepth)) {
                    context.nextToken();
                    solution.setLastUpdatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("latestSolutionVersion", targetDepth)) {
                    context.nextToken();
                    solution.setLatestSolutionVersion(SolutionVersionSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return solution;
    }

    private static SolutionJsonUnmarshaller instance;

    public static SolutionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SolutionJsonUnmarshaller();
        return instance;
    }
}
