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
package com.amazonaws.services.serverlessapplicationrepository.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.serverlessapplicationrepository.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetCloudFormationTemplateResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCloudFormationTemplateResultJsonUnmarshaller implements Unmarshaller<GetCloudFormationTemplateResult, JsonUnmarshallerContext> {

    public GetCloudFormationTemplateResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetCloudFormationTemplateResult getCloudFormationTemplateResult = new GetCloudFormationTemplateResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getCloudFormationTemplateResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("applicationId", targetDepth)) {
                    context.nextToken();
                    getCloudFormationTemplateResult.setApplicationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    getCloudFormationTemplateResult.setCreationTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("expirationTime", targetDepth)) {
                    context.nextToken();
                    getCloudFormationTemplateResult.setExpirationTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("semanticVersion", targetDepth)) {
                    context.nextToken();
                    getCloudFormationTemplateResult.setSemanticVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getCloudFormationTemplateResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("templateId", targetDepth)) {
                    context.nextToken();
                    getCloudFormationTemplateResult.setTemplateId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("templateUrl", targetDepth)) {
                    context.nextToken();
                    getCloudFormationTemplateResult.setTemplateUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getCloudFormationTemplateResult;
    }

    private static GetCloudFormationTemplateResultJsonUnmarshaller instance;

    public static GetCloudFormationTemplateResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetCloudFormationTemplateResultJsonUnmarshaller();
        return instance;
    }
}
