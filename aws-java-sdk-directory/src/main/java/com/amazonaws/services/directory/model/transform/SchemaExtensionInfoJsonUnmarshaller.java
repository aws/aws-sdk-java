/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directory.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.directory.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SchemaExtensionInfo JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SchemaExtensionInfoJsonUnmarshaller implements Unmarshaller<SchemaExtensionInfo, JsonUnmarshallerContext> {

    public SchemaExtensionInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        SchemaExtensionInfo schemaExtensionInfo = new SchemaExtensionInfo();

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
                if (context.testExpression("DirectoryId", targetDepth)) {
                    context.nextToken();
                    schemaExtensionInfo.setDirectoryId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SchemaExtensionId", targetDepth)) {
                    context.nextToken();
                    schemaExtensionInfo.setSchemaExtensionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    schemaExtensionInfo.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SchemaExtensionStatus", targetDepth)) {
                    context.nextToken();
                    schemaExtensionInfo.setSchemaExtensionStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SchemaExtensionStatusReason", targetDepth)) {
                    context.nextToken();
                    schemaExtensionInfo.setSchemaExtensionStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartDateTime", targetDepth)) {
                    context.nextToken();
                    schemaExtensionInfo.setStartDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndDateTime", targetDepth)) {
                    context.nextToken();
                    schemaExtensionInfo.setEndDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return schemaExtensionInfo;
    }

    private static SchemaExtensionInfoJsonUnmarshaller instance;

    public static SchemaExtensionInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SchemaExtensionInfoJsonUnmarshaller();
        return instance;
    }
}
