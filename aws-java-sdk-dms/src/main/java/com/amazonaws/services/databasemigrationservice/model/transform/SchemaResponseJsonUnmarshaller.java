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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SchemaResponse JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SchemaResponseJsonUnmarshaller implements Unmarshaller<SchemaResponse, JsonUnmarshallerContext> {

    public SchemaResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        SchemaResponse schemaResponse = new SchemaResponse();

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
                if (context.testExpression("CodeLineCount", targetDepth)) {
                    context.nextToken();
                    schemaResponse.setCodeLineCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("CodeSize", targetDepth)) {
                    context.nextToken();
                    schemaResponse.setCodeSize(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Complexity", targetDepth)) {
                    context.nextToken();
                    schemaResponse.setComplexity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Server", targetDepth)) {
                    context.nextToken();
                    schemaResponse.setServer(ServerShortInfoResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DatabaseInstance", targetDepth)) {
                    context.nextToken();
                    schemaResponse.setDatabaseInstance(DatabaseShortInfoResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SchemaId", targetDepth)) {
                    context.nextToken();
                    schemaResponse.setSchemaId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SchemaName", targetDepth)) {
                    context.nextToken();
                    schemaResponse.setSchemaName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OriginalSchema", targetDepth)) {
                    context.nextToken();
                    schemaResponse.setOriginalSchema(SchemaShortInfoResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Similarity", targetDepth)) {
                    context.nextToken();
                    schemaResponse.setSimilarity(context.getUnmarshaller(Double.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return schemaResponse;
    }

    private static SchemaResponseJsonUnmarshaller instance;

    public static SchemaResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SchemaResponseJsonUnmarshaller();
        return instance;
    }
}
