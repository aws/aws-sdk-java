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
 * RemoveSchemaVersionMetadataResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveSchemaVersionMetadataResultJsonUnmarshaller implements Unmarshaller<RemoveSchemaVersionMetadataResult, JsonUnmarshallerContext> {

    public RemoveSchemaVersionMetadataResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        RemoveSchemaVersionMetadataResult removeSchemaVersionMetadataResult = new RemoveSchemaVersionMetadataResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return removeSchemaVersionMetadataResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("SchemaArn", targetDepth)) {
                    context.nextToken();
                    removeSchemaVersionMetadataResult.setSchemaArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SchemaName", targetDepth)) {
                    context.nextToken();
                    removeSchemaVersionMetadataResult.setSchemaName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RegistryName", targetDepth)) {
                    context.nextToken();
                    removeSchemaVersionMetadataResult.setRegistryName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LatestVersion", targetDepth)) {
                    context.nextToken();
                    removeSchemaVersionMetadataResult.setLatestVersion(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("VersionNumber", targetDepth)) {
                    context.nextToken();
                    removeSchemaVersionMetadataResult.setVersionNumber(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("SchemaVersionId", targetDepth)) {
                    context.nextToken();
                    removeSchemaVersionMetadataResult.setSchemaVersionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MetadataKey", targetDepth)) {
                    context.nextToken();
                    removeSchemaVersionMetadataResult.setMetadataKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MetadataValue", targetDepth)) {
                    context.nextToken();
                    removeSchemaVersionMetadataResult.setMetadataValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return removeSchemaVersionMetadataResult;
    }

    private static RemoveSchemaVersionMetadataResultJsonUnmarshaller instance;

    public static RemoveSchemaVersionMetadataResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RemoveSchemaVersionMetadataResultJsonUnmarshaller();
        return instance;
    }
}
