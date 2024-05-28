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
package com.amazonaws.services.qbusiness.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.qbusiness.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetWebExperienceResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWebExperienceResultJsonUnmarshaller implements Unmarshaller<GetWebExperienceResult, JsonUnmarshallerContext> {

    public GetWebExperienceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetWebExperienceResult getWebExperienceResult = new GetWebExperienceResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getWebExperienceResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("applicationId", targetDepth)) {
                    context.nextToken();
                    getWebExperienceResult.setApplicationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("webExperienceId", targetDepth)) {
                    context.nextToken();
                    getWebExperienceResult.setWebExperienceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("webExperienceArn", targetDepth)) {
                    context.nextToken();
                    getWebExperienceResult.setWebExperienceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("defaultEndpoint", targetDepth)) {
                    context.nextToken();
                    getWebExperienceResult.setDefaultEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getWebExperienceResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    getWebExperienceResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    getWebExperienceResult.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("title", targetDepth)) {
                    context.nextToken();
                    getWebExperienceResult.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("subtitle", targetDepth)) {
                    context.nextToken();
                    getWebExperienceResult.setSubtitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("welcomeMessage", targetDepth)) {
                    context.nextToken();
                    getWebExperienceResult.setWelcomeMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("samplePromptsControlMode", targetDepth)) {
                    context.nextToken();
                    getWebExperienceResult.setSamplePromptsControlMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    context.nextToken();
                    getWebExperienceResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("authenticationConfiguration", targetDepth)) {
                    context.nextToken();
                    getWebExperienceResult.setAuthenticationConfiguration(WebExperienceAuthConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("error", targetDepth)) {
                    context.nextToken();
                    getWebExperienceResult.setError(ErrorDetailJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getWebExperienceResult;
    }

    private static GetWebExperienceResultJsonUnmarshaller instance;

    public static GetWebExperienceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetWebExperienceResultJsonUnmarshaller();
        return instance;
    }
}
