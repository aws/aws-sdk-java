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
package com.amazonaws.services.glue.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetSchemaResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSchemaResultJsonUnmarshaller implements Unmarshaller<GetSchemaResult, JsonUnmarshallerContext> {

    public GetSchemaResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetSchemaResult getSchemaResult = new GetSchemaResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getSchemaResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("RegistryName", targetDepth)) {
                    context.nextToken();
                    getSchemaResult.setRegistryName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RegistryArn", targetDepth)) {
                    context.nextToken();
                    getSchemaResult.setRegistryArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SchemaName", targetDepth)) {
                    context.nextToken();
                    getSchemaResult.setSchemaName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SchemaArn", targetDepth)) {
                    context.nextToken();
                    getSchemaResult.setSchemaArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    getSchemaResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataFormat", targetDepth)) {
                    context.nextToken();
                    getSchemaResult.setDataFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Compatibility", targetDepth)) {
                    context.nextToken();
                    getSchemaResult.setCompatibility(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SchemaCheckpoint", targetDepth)) {
                    context.nextToken();
                    getSchemaResult.setSchemaCheckpoint(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("LatestSchemaVersion", targetDepth)) {
                    context.nextToken();
                    getSchemaResult.setLatestSchemaVersion(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("NextSchemaVersion", targetDepth)) {
                    context.nextToken();
                    getSchemaResult.setNextSchemaVersion(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("SchemaStatus", targetDepth)) {
                    context.nextToken();
                    getSchemaResult.setSchemaStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    context.nextToken();
                    getSchemaResult.setCreatedTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UpdatedTime", targetDepth)) {
                    context.nextToken();
                    getSchemaResult.setUpdatedTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getSchemaResult;
    }

    private static GetSchemaResultJsonUnmarshaller instance;

    public static GetSchemaResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetSchemaResultJsonUnmarshaller();
        return instance;
    }
}
