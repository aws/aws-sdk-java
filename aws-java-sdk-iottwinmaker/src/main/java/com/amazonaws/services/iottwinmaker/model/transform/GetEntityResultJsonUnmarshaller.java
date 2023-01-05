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
 * GetEntityResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEntityResultJsonUnmarshaller implements Unmarshaller<GetEntityResult, JsonUnmarshallerContext> {

    public GetEntityResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetEntityResult getEntityResult = new GetEntityResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getEntityResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("entityId", targetDepth)) {
                    context.nextToken();
                    getEntityResult.setEntityId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("entityName", targetDepth)) {
                    context.nextToken();
                    getEntityResult.setEntityName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    getEntityResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getEntityResult.setStatus(StatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("workspaceId", targetDepth)) {
                    context.nextToken();
                    getEntityResult.setWorkspaceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    getEntityResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("components", targetDepth)) {
                    context.nextToken();
                    getEntityResult.setComponents(new MapUnmarshaller<String, ComponentResponse>(context.getUnmarshaller(String.class),
                            ComponentResponseJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("parentEntityId", targetDepth)) {
                    context.nextToken();
                    getEntityResult.setParentEntityId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hasChildEntities", targetDepth)) {
                    context.nextToken();
                    getEntityResult.setHasChildEntities(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    context.nextToken();
                    getEntityResult.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updateDateTime", targetDepth)) {
                    context.nextToken();
                    getEntityResult.setUpdateDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("syncSource", targetDepth)) {
                    context.nextToken();
                    getEntityResult.setSyncSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getEntityResult;
    }

    private static GetEntityResultJsonUnmarshaller instance;

    public static GetEntityResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetEntityResultJsonUnmarshaller();
        return instance;
    }
}
