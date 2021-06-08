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
 * PutSchemaVersionMetadataResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutSchemaVersionMetadataResultJsonUnmarshaller implements Unmarshaller<PutSchemaVersionMetadataResult, JsonUnmarshallerContext> {

    public PutSchemaVersionMetadataResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PutSchemaVersionMetadataResult putSchemaVersionMetadataResult = new PutSchemaVersionMetadataResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return putSchemaVersionMetadataResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("SchemaArn", targetDepth)) {
                    context.nextToken();
                    putSchemaVersionMetadataResult.setSchemaArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SchemaName", targetDepth)) {
                    context.nextToken();
                    putSchemaVersionMetadataResult.setSchemaName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RegistryName", targetDepth)) {
                    context.nextToken();
                    putSchemaVersionMetadataResult.setRegistryName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LatestVersion", targetDepth)) {
                    context.nextToken();
                    putSchemaVersionMetadataResult.setLatestVersion(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("VersionNumber", targetDepth)) {
                    context.nextToken();
                    putSchemaVersionMetadataResult.setVersionNumber(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("SchemaVersionId", targetDepth)) {
                    context.nextToken();
                    putSchemaVersionMetadataResult.setSchemaVersionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MetadataKey", targetDepth)) {
                    context.nextToken();
                    putSchemaVersionMetadataResult.setMetadataKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MetadataValue", targetDepth)) {
                    context.nextToken();
                    putSchemaVersionMetadataResult.setMetadataValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return putSchemaVersionMetadataResult;
    }

    private static PutSchemaVersionMetadataResultJsonUnmarshaller instance;

    public static PutSchemaVersionMetadataResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PutSchemaVersionMetadataResultJsonUnmarshaller();
        return instance;
    }
}
