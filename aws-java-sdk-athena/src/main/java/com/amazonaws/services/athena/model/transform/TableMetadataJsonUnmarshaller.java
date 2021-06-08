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
package com.amazonaws.services.athena.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.athena.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TableMetadata JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableMetadataJsonUnmarshaller implements Unmarshaller<TableMetadata, JsonUnmarshallerContext> {

    public TableMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        TableMetadata tableMetadata = new TableMetadata();

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
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    tableMetadata.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreateTime", targetDepth)) {
                    context.nextToken();
                    tableMetadata.setCreateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastAccessTime", targetDepth)) {
                    context.nextToken();
                    tableMetadata.setLastAccessTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TableType", targetDepth)) {
                    context.nextToken();
                    tableMetadata.setTableType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Columns", targetDepth)) {
                    context.nextToken();
                    tableMetadata.setColumns(new ListUnmarshaller<Column>(ColumnJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("PartitionKeys", targetDepth)) {
                    context.nextToken();
                    tableMetadata.setPartitionKeys(new ListUnmarshaller<Column>(ColumnJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Parameters", targetDepth)) {
                    context.nextToken();
                    tableMetadata.setParameters(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
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

        return tableMetadata;
    }

    private static TableMetadataJsonUnmarshaller instance;

    public static TableMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TableMetadataJsonUnmarshaller();
        return instance;
    }
}
