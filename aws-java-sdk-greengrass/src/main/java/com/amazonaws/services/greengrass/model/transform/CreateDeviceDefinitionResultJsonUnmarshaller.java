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
package com.amazonaws.services.greengrass.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.greengrass.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateDeviceDefinitionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDeviceDefinitionResultJsonUnmarshaller implements Unmarshaller<CreateDeviceDefinitionResult, JsonUnmarshallerContext> {

    public CreateDeviceDefinitionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateDeviceDefinitionResult createDeviceDefinitionResult = new CreateDeviceDefinitionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createDeviceDefinitionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    createDeviceDefinitionResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTimestamp", targetDepth)) {
                    context.nextToken();
                    createDeviceDefinitionResult.setCreationTimestamp(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    createDeviceDefinitionResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastUpdatedTimestamp", targetDepth)) {
                    context.nextToken();
                    createDeviceDefinitionResult.setLastUpdatedTimestamp(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LatestVersion", targetDepth)) {
                    context.nextToken();
                    createDeviceDefinitionResult.setLatestVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LatestVersionArn", targetDepth)) {
                    context.nextToken();
                    createDeviceDefinitionResult.setLatestVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    createDeviceDefinitionResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createDeviceDefinitionResult;
    }

    private static CreateDeviceDefinitionResultJsonUnmarshaller instance;

    public static CreateDeviceDefinitionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateDeviceDefinitionResultJsonUnmarshaller();
        return instance;
    }
}
