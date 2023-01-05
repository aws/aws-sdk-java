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
package com.amazonaws.services.omics.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.omics.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetAnnotationImportJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAnnotationImportJobResultJsonUnmarshaller implements Unmarshaller<GetAnnotationImportJobResult, JsonUnmarshallerContext> {

    public GetAnnotationImportJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetAnnotationImportJobResult getAnnotationImportJobResult = new GetAnnotationImportJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getAnnotationImportJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("completionTime", targetDepth)) {
                    context.nextToken();
                    getAnnotationImportJobResult.setCompletionTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    getAnnotationImportJobResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("destinationName", targetDepth)) {
                    context.nextToken();
                    getAnnotationImportJobResult.setDestinationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("formatOptions", targetDepth)) {
                    context.nextToken();
                    getAnnotationImportJobResult.setFormatOptions(FormatOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    getAnnotationImportJobResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("items", targetDepth)) {
                    context.nextToken();
                    getAnnotationImportJobResult.setItems(new ListUnmarshaller<AnnotationImportItemDetail>(AnnotationImportItemDetailJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    context.nextToken();
                    getAnnotationImportJobResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("runLeftNormalization", targetDepth)) {
                    context.nextToken();
                    getAnnotationImportJobResult.setRunLeftNormalization(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getAnnotationImportJobResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusMessage", targetDepth)) {
                    context.nextToken();
                    getAnnotationImportJobResult.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updateTime", targetDepth)) {
                    context.nextToken();
                    getAnnotationImportJobResult.setUpdateTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getAnnotationImportJobResult;
    }

    private static GetAnnotationImportJobResultJsonUnmarshaller instance;

    public static GetAnnotationImportJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetAnnotationImportJobResultJsonUnmarshaller();
        return instance;
    }
}
