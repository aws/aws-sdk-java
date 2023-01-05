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
package com.amazonaws.services.iottwinmaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iottwinmaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetComponentTypeResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetComponentTypeResultJsonUnmarshaller implements Unmarshaller<GetComponentTypeResult, JsonUnmarshallerContext> {

    public GetComponentTypeResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetComponentTypeResult getComponentTypeResult = new GetComponentTypeResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getComponentTypeResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("workspaceId", targetDepth)) {
                    context.nextToken();
                    getComponentTypeResult.setWorkspaceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("isSingleton", targetDepth)) {
                    context.nextToken();
                    getComponentTypeResult.setIsSingleton(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("componentTypeId", targetDepth)) {
                    context.nextToken();
                    getComponentTypeResult.setComponentTypeId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    getComponentTypeResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("propertyDefinitions", targetDepth)) {
                    context.nextToken();
                    getComponentTypeResult.setPropertyDefinitions(new MapUnmarshaller<String, PropertyDefinitionResponse>(
                            context.getUnmarshaller(String.class), PropertyDefinitionResponseJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("extendsFrom", targetDepth)) {
                    context.nextToken();
                    getComponentTypeResult.setExtendsFrom(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("functions", targetDepth)) {
                    context.nextToken();
                    getComponentTypeResult.setFunctions(new MapUnmarshaller<String, FunctionResponse>(context.getUnmarshaller(String.class),
                            FunctionResponseJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    context.nextToken();
                    getComponentTypeResult.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updateDateTime", targetDepth)) {
                    context.nextToken();
                    getComponentTypeResult.setUpdateDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    getComponentTypeResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("isAbstract", targetDepth)) {
                    context.nextToken();
                    getComponentTypeResult.setIsAbstract(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("isSchemaInitialized", targetDepth)) {
                    context.nextToken();
                    getComponentTypeResult.setIsSchemaInitialized(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getComponentTypeResult.setStatus(StatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("propertyGroups", targetDepth)) {
                    context.nextToken();
                    getComponentTypeResult.setPropertyGroups(new MapUnmarshaller<String, PropertyGroupResponse>(context.getUnmarshaller(String.class),
                            PropertyGroupResponseJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("syncSource", targetDepth)) {
                    context.nextToken();
                    getComponentTypeResult.setSyncSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("componentTypeName", targetDepth)) {
                    context.nextToken();
                    getComponentTypeResult.setComponentTypeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getComponentTypeResult;
    }

    private static GetComponentTypeResultJsonUnmarshaller instance;

    public static GetComponentTypeResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetComponentTypeResultJsonUnmarshaller();
        return instance;
    }
}
