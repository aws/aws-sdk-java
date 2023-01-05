/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.resiliencehub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.resiliencehub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TestRecommendation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestRecommendationJsonUnmarshaller implements Unmarshaller<TestRecommendation, JsonUnmarshallerContext> {

    public TestRecommendation unmarshall(JsonUnmarshallerContext context) throws Exception {
        TestRecommendation testRecommendation = new TestRecommendation();

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
                if (context.testExpression("appComponentName", targetDepth)) {
                    context.nextToken();
                    testRecommendation.setAppComponentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dependsOnAlarms", targetDepth)) {
                    context.nextToken();
                    testRecommendation.setDependsOnAlarms(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    testRecommendation.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("intent", targetDepth)) {
                    context.nextToken();
                    testRecommendation.setIntent(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("items", targetDepth)) {
                    context.nextToken();
                    testRecommendation.setItems(new ListUnmarshaller<RecommendationItem>(RecommendationItemJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    testRecommendation.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("prerequisite", targetDepth)) {
                    context.nextToken();
                    testRecommendation.setPrerequisite(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("recommendationId", targetDepth)) {
                    context.nextToken();
                    testRecommendation.setRecommendationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("referenceId", targetDepth)) {
                    context.nextToken();
                    testRecommendation.setReferenceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("risk", targetDepth)) {
                    context.nextToken();
                    testRecommendation.setRisk(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    testRecommendation.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return testRecommendation;
    }

    private static TestRecommendationJsonUnmarshaller instance;

    public static TestRecommendationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TestRecommendationJsonUnmarshaller();
        return instance;
    }
}
