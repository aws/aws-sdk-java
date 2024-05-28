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
package com.amazonaws.services.ram.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ram.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ReplacePermissionAssociationsWork JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplacePermissionAssociationsWorkJsonUnmarshaller implements Unmarshaller<ReplacePermissionAssociationsWork, JsonUnmarshallerContext> {

    public ReplacePermissionAssociationsWork unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReplacePermissionAssociationsWork replacePermissionAssociationsWork = new ReplacePermissionAssociationsWork();

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
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    replacePermissionAssociationsWork.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fromPermissionArn", targetDepth)) {
                    context.nextToken();
                    replacePermissionAssociationsWork.setFromPermissionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fromPermissionVersion", targetDepth)) {
                    context.nextToken();
                    replacePermissionAssociationsWork.setFromPermissionVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("toPermissionArn", targetDepth)) {
                    context.nextToken();
                    replacePermissionAssociationsWork.setToPermissionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("toPermissionVersion", targetDepth)) {
                    context.nextToken();
                    replacePermissionAssociationsWork.setToPermissionVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    replacePermissionAssociationsWork.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusMessage", targetDepth)) {
                    context.nextToken();
                    replacePermissionAssociationsWork.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    replacePermissionAssociationsWork.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedTime", targetDepth)) {
                    context.nextToken();
                    replacePermissionAssociationsWork.setLastUpdatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return replacePermissionAssociationsWork;
    }

    private static ReplacePermissionAssociationsWorkJsonUnmarshaller instance;

    public static ReplacePermissionAssociationsWorkJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReplacePermissionAssociationsWorkJsonUnmarshaller();
        return instance;
    }
}
