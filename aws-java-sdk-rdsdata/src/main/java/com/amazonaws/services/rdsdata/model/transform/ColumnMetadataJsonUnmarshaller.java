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
package com.amazonaws.services.rdsdata.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.rdsdata.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ColumnMetadata JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColumnMetadataJsonUnmarshaller implements Unmarshaller<ColumnMetadata, JsonUnmarshallerContext> {

    public ColumnMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        ColumnMetadata columnMetadata = new ColumnMetadata();

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
                if (context.testExpression("arrayBaseColumnType", targetDepth)) {
                    context.nextToken();
                    columnMetadata.setArrayBaseColumnType(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("isAutoIncrement", targetDepth)) {
                    context.nextToken();
                    columnMetadata.setIsAutoIncrement(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("isCaseSensitive", targetDepth)) {
                    context.nextToken();
                    columnMetadata.setIsCaseSensitive(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("isCurrency", targetDepth)) {
                    context.nextToken();
                    columnMetadata.setIsCurrency(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("isSigned", targetDepth)) {
                    context.nextToken();
                    columnMetadata.setIsSigned(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("label", targetDepth)) {
                    context.nextToken();
                    columnMetadata.setLabel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    columnMetadata.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("nullable", targetDepth)) {
                    context.nextToken();
                    columnMetadata.setNullable(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("precision", targetDepth)) {
                    context.nextToken();
                    columnMetadata.setPrecision(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("scale", targetDepth)) {
                    context.nextToken();
                    columnMetadata.setScale(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("schemaName", targetDepth)) {
                    context.nextToken();
                    columnMetadata.setSchemaName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tableName", targetDepth)) {
                    context.nextToken();
                    columnMetadata.setTableName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    columnMetadata.setType(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("typeName", targetDepth)) {
                    context.nextToken();
                    columnMetadata.setTypeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return columnMetadata;
    }

    private static ColumnMetadataJsonUnmarshaller instance;

    public static ColumnMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ColumnMetadataJsonUnmarshaller();
        return instance;
    }
}
