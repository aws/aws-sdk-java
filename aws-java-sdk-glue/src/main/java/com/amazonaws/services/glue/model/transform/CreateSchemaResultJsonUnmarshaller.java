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
 * CreateSchemaResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSchemaResultJsonUnmarshaller implements Unmarshaller<CreateSchemaResult, JsonUnmarshallerContext> {

    public CreateSchemaResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateSchemaResult createSchemaResult = new CreateSchemaResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createSchemaResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("RegistryName", targetDepth)) {
                    context.nextToken();
                    createSchemaResult.setRegistryName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RegistryArn", targetDepth)) {
                    context.nextToken();
                    createSchemaResult.setRegistryArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SchemaName", targetDepth)) {
                    context.nextToken();
                    createSchemaResult.setSchemaName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SchemaArn", targetDepth)) {
                    context.nextToken();
                    createSchemaResult.setSchemaArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    createSchemaResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataFormat", targetDepth)) {
                    context.nextToken();
                    createSchemaResult.setDataFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Compatibility", targetDepth)) {
                    context.nextToken();
                    createSchemaResult.setCompatibility(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SchemaCheckpoint", targetDepth)) {
                    context.nextToken();
                    createSchemaResult.setSchemaCheckpoint(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("LatestSchemaVersion", targetDepth)) {
                    context.nextToken();
                    createSchemaResult.setLatestSchemaVersion(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("NextSchemaVersion", targetDepth)) {
                    context.nextToken();
                    createSchemaResult.setNextSchemaVersion(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("SchemaStatus", targetDepth)) {
                    context.nextToken();
                    createSchemaResult.setSchemaStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    createSchemaResult
                            .setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                                    .unmarshall(context));
                }
                if (context.testExpression("SchemaVersionId", targetDepth)) {
                    context.nextToken();
                    createSchemaResult.setSchemaVersionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SchemaVersionStatus", targetDepth)) {
                    context.nextToken();
                    createSchemaResult.setSchemaVersionStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createSchemaResult;
    }

    private static CreateSchemaResultJsonUnmarshaller instance;

    public static CreateSchemaResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateSchemaResultJsonUnmarshaller();
        return instance;
    }
}
