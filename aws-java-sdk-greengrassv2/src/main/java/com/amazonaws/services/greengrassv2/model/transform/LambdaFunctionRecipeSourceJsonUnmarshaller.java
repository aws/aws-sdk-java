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
package com.amazonaws.services.greengrassv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.greengrassv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * LambdaFunctionRecipeSource JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaFunctionRecipeSourceJsonUnmarshaller implements Unmarshaller<LambdaFunctionRecipeSource, JsonUnmarshallerContext> {

    public LambdaFunctionRecipeSource unmarshall(JsonUnmarshallerContext context) throws Exception {
        LambdaFunctionRecipeSource lambdaFunctionRecipeSource = new LambdaFunctionRecipeSource();

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
                if (context.testExpression("lambdaArn", targetDepth)) {
                    context.nextToken();
                    lambdaFunctionRecipeSource.setLambdaArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("componentName", targetDepth)) {
                    context.nextToken();
                    lambdaFunctionRecipeSource.setComponentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("componentVersion", targetDepth)) {
                    context.nextToken();
                    lambdaFunctionRecipeSource.setComponentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("componentPlatforms", targetDepth)) {
                    context.nextToken();
                    lambdaFunctionRecipeSource.setComponentPlatforms(new ListUnmarshaller<ComponentPlatform>(ComponentPlatformJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("componentDependencies", targetDepth)) {
                    context.nextToken();
                    lambdaFunctionRecipeSource.setComponentDependencies(new MapUnmarshaller<String, ComponentDependencyRequirement>(context
                            .getUnmarshaller(String.class), ComponentDependencyRequirementJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("componentLambdaParameters", targetDepth)) {
                    context.nextToken();
                    lambdaFunctionRecipeSource.setComponentLambdaParameters(LambdaExecutionParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return lambdaFunctionRecipeSource;
    }

    private static LambdaFunctionRecipeSourceJsonUnmarshaller instance;

    public static LambdaFunctionRecipeSourceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LambdaFunctionRecipeSourceJsonUnmarshaller();
        return instance;
    }
}
