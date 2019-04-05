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
package com.amazonaws.services.glue.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Table JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableJsonUnmarshaller implements Unmarshaller<Table, JsonUnmarshallerContext> {

    public Table unmarshall(JsonUnmarshallerContext context) throws Exception {
        Table table = new Table();

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
                    table.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DatabaseName", targetDepth)) {
                    context.nextToken();
                    table.setDatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    table.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Owner", targetDepth)) {
                    context.nextToken();
                    table.setOwner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreateTime", targetDepth)) {
                    context.nextToken();
                    table.setCreateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("UpdateTime", targetDepth)) {
                    context.nextToken();
                    table.setUpdateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastAccessTime", targetDepth)) {
                    context.nextToken();
                    table.setLastAccessTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastAnalyzedTime", targetDepth)) {
                    context.nextToken();
                    table.setLastAnalyzedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Retention", targetDepth)) {
                    context.nextToken();
                    table.setRetention(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("StorageDescriptor", targetDepth)) {
                    context.nextToken();
                    table.setStorageDescriptor(StorageDescriptorJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PartitionKeys", targetDepth)) {
                    context.nextToken();
                    table.setPartitionKeys(new ListUnmarshaller<Column>(ColumnJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("ViewOriginalText", targetDepth)) {
                    context.nextToken();
                    table.setViewOriginalText(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ViewExpandedText", targetDepth)) {
                    context.nextToken();
                    table.setViewExpandedText(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TableType", targetDepth)) {
                    context.nextToken();
                    table.setTableType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Parameters", targetDepth)) {
                    context.nextToken();
                    table.setParameters(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("CreatedBy", targetDepth)) {
                    context.nextToken();
                    table.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return table;
    }

    private static TableJsonUnmarshaller instance;

    public static TableJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TableJsonUnmarshaller();
        return instance;
    }
}
