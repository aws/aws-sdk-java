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
 * GetIdNamespaceResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIdNamespaceResultJsonUnmarshaller implements Unmarshaller<GetIdNamespaceResult, JsonUnmarshallerContext> {

    public GetIdNamespaceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetIdNamespaceResult getIdNamespaceResult = new GetIdNamespaceResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getIdNamespaceResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    getIdNamespaceResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    getIdNamespaceResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("idMappingWorkflowProperties", targetDepth)) {
                    context.nextToken();
                    getIdNamespaceResult.setIdMappingWorkflowProperties(new ListUnmarshaller<IdNamespaceIdMappingWorkflowProperties>(
                            IdNamespaceIdMappingWorkflowPropertiesJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("idNamespaceArn", targetDepth)) {
                    context.nextToken();
                    getIdNamespaceResult.setIdNamespaceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("idNamespaceName", targetDepth)) {
                    context.nextToken();
                    getIdNamespaceResult.setIdNamespaceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("inputSourceConfig", targetDepth)) {
                    context.nextToken();
                    getIdNamespaceResult
                            .setInputSourceConfig(new ListUnmarshaller<IdNamespaceInputSource>(IdNamespaceInputSourceJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    context.nextToken();
                    getIdNamespaceResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    getIdNamespaceResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    getIdNamespaceResult.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    getIdNamespaceResult.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getIdNamespaceResult;
    }

    private static GetIdNamespaceResultJsonUnmarshaller instance;

    public static GetIdNamespaceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetIdNamespaceResultJsonUnmarshaller();
        return instance;
    }
}
