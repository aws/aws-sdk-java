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
 * TableInput JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableInputJsonUnmarshaller implements Unmarshaller<TableInput, JsonUnmarshallerContext> {

    public TableInput unmarshall(JsonUnmarshallerContext context) throws Exception {
        TableInput tableInput = new TableInput();

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
                    tableInput.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    tableInput.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Owner", targetDepth)) {
                    context.nextToken();
                    tableInput.setOwner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastAccessTime", targetDepth)) {
                    context.nextToken();
                    tableInput.setLastAccessTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastAnalyzedTime", targetDepth)) {
                    context.nextToken();
                    tableInput.setLastAnalyzedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Retention", targetDepth)) {
                    context.nextToken();
                    tableInput.setRetention(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("StorageDescriptor", targetDepth)) {
                    context.nextToken();
                    tableInput.setStorageDescriptor(StorageDescriptorJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PartitionKeys", targetDepth)) {
                    context.nextToken();
                    tableInput.setPartitionKeys(new ListUnmarshaller<Column>(ColumnJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("ViewOriginalText", targetDepth)) {
                    context.nextToken();
                    tableInput.setViewOriginalText(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ViewExpandedText", targetDepth)) {
                    context.nextToken();
                    tableInput.setViewExpandedText(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TableType", targetDepth)) {
                    context.nextToken();
                    tableInput.setTableType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Parameters", targetDepth)) {
                    context.nextToken();
                    tableInput.setParameters(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return tableInput;
    }

    private static TableInputJsonUnmarshaller instance;

    public static TableInputJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TableInputJsonUnmarshaller();
        return instance;
    }
}
