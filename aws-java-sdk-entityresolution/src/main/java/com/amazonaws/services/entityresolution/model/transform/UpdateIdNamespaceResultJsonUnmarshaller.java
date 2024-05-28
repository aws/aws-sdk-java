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
package com.amazonaws.services.entityresolution.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.entityresolution.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateIdNamespaceResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateIdNamespaceResultJsonUnmarshaller implements Unmarshaller<UpdateIdNamespaceResult, JsonUnmarshallerContext> {

    public UpdateIdNamespaceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateIdNamespaceResult updateIdNamespaceResult = new UpdateIdNamespaceResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateIdNamespaceResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    updateIdNamespaceResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    updateIdNamespaceResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("idMappingWorkflowProperties", targetDepth)) {
                    context.nextToken();
                    updateIdNamespaceResult.setIdMappingWorkflowProperties(new ListUnmarshaller<IdNamespaceIdMappingWorkflowProperties>(
                            IdNamespaceIdMappingWorkflowPropertiesJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("idNamespaceArn", targetDepth)) {
                    context.nextToken();
                    updateIdNamespaceResult.setIdNamespaceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("idNamespaceName", targetDepth)) {
                    context.nextToken();
                    updateIdNamespaceResult.setIdNamespaceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("inputSourceConfig", targetDepth)) {
                    context.nextToken();
                    updateIdNamespaceResult.setInputSourceConfig(new ListUnmarshaller<IdNamespaceInputSource>(IdNamespaceInputSourceJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    context.nextToken();
                    updateIdNamespaceResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    updateIdNamespaceResult.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    updateIdNamespaceResult.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateIdNamespaceResult;
    }

    private static UpdateIdNamespaceResultJsonUnmarshaller instance;

    public static UpdateIdNamespaceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateIdNamespaceResultJsonUnmarshaller();
        return instance;
    }
}
