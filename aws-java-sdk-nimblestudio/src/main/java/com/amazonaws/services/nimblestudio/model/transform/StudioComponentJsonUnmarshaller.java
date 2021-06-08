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
package com.amazonaws.services.nimblestudio.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.nimblestudio.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StudioComponent JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StudioComponentJsonUnmarshaller implements Unmarshaller<StudioComponent, JsonUnmarshallerContext> {

    public StudioComponent unmarshall(JsonUnmarshallerContext context) throws Exception {
        StudioComponent studioComponent = new StudioComponent();

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
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    studioComponent.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("configuration", targetDepth)) {
                    context.nextToken();
                    studioComponent.setConfiguration(StudioComponentConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    studioComponent.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("createdBy", targetDepth)) {
                    context.nextToken();
                    studioComponent.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    studioComponent.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ec2SecurityGroupIds", targetDepth)) {
                    context.nextToken();
                    studioComponent.setEc2SecurityGroupIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("initializationScripts", targetDepth)) {
                    context.nextToken();
                    studioComponent.setInitializationScripts(new ListUnmarshaller<StudioComponentInitializationScript>(
                            StudioComponentInitializationScriptJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    studioComponent.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scriptParameters", targetDepth)) {
                    context.nextToken();
                    studioComponent.setScriptParameters(new ListUnmarshaller<ScriptParameterKeyValue>(ScriptParameterKeyValueJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    context.nextToken();
                    studioComponent.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusCode", targetDepth)) {
                    context.nextToken();
                    studioComponent.setStatusCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusMessage", targetDepth)) {
                    context.nextToken();
                    studioComponent.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("studioComponentId", targetDepth)) {
                    context.nextToken();
                    studioComponent.setStudioComponentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("subtype", targetDepth)) {
                    context.nextToken();
                    studioComponent.setSubtype(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    studioComponent.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    studioComponent.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    studioComponent.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("updatedBy", targetDepth)) {
                    context.nextToken();
                    studioComponent.setUpdatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return studioComponent;
    }

    private static StudioComponentJsonUnmarshaller instance;

    public static StudioComponentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StudioComponentJsonUnmarshaller();
        return instance;
    }
}
