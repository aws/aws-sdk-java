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
package com.amazonaws.services.robomaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.robomaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateWorldExportJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorldExportJobResultJsonUnmarshaller implements Unmarshaller<CreateWorldExportJobResult, JsonUnmarshallerContext> {

    public CreateWorldExportJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateWorldExportJobResult createWorldExportJobResult = new CreateWorldExportJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createWorldExportJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    createWorldExportJobResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    createWorldExportJobResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    createWorldExportJobResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("failureCode", targetDepth)) {
                    context.nextToken();
                    createWorldExportJobResult.setFailureCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clientRequestToken", targetDepth)) {
                    context.nextToken();
                    createWorldExportJobResult.setClientRequestToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outputLocation", targetDepth)) {
                    context.nextToken();
                    createWorldExportJobResult.setOutputLocation(OutputLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("iamRole", targetDepth)) {
                    context.nextToken();
                    createWorldExportJobResult.setIamRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    createWorldExportJobResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createWorldExportJobResult;
    }

    private static CreateWorldExportJobResultJsonUnmarshaller instance;

    public static CreateWorldExportJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateWorldExportJobResultJsonUnmarshaller();
        return instance;
    }
}
