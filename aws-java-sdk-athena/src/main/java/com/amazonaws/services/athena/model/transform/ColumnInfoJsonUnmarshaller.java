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
package com.amazonaws.services.athena.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.athena.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ColumnInfo JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColumnInfoJsonUnmarshaller implements Unmarshaller<ColumnInfo, JsonUnmarshallerContext> {

    public ColumnInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        ColumnInfo columnInfo = new ColumnInfo();

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
                if (context.testExpression("CatalogName", targetDepth)) {
                    context.nextToken();
                    columnInfo.setCatalogName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SchemaName", targetDepth)) {
                    context.nextToken();
                    columnInfo.setSchemaName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TableName", targetDepth)) {
                    context.nextToken();
                    columnInfo.setTableName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    columnInfo.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Label", targetDepth)) {
                    context.nextToken();
                    columnInfo.setLabel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    columnInfo.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Precision", targetDepth)) {
                    context.nextToken();
                    columnInfo.setPrecision(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Scale", targetDepth)) {
                    context.nextToken();
                    columnInfo.setScale(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Nullable", targetDepth)) {
                    context.nextToken();
                    columnInfo.setNullable(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CaseSensitive", targetDepth)) {
                    context.nextToken();
                    columnInfo.setCaseSensitive(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return columnInfo;
    }

    private static ColumnInfoJsonUnmarshaller instance;

    public static ColumnInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ColumnInfoJsonUnmarshaller();
        return instance;
    }
}
