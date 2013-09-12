/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.dynamodb.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.dynamodb.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Table Description JSON Unmarshaller
 */
@Deprecated
public class TableDescriptionJsonUnmarshaller implements Unmarshaller<TableDescription, JsonUnmarshallerContext> {

    

    public TableDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        TableDescription tableDescription = new TableDescription();

        
        
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("TableName", targetDepth)) {
                    context.nextToken();
                    tableDescription.setTableName(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("KeySchema", targetDepth)) {
                    context.nextToken();
                    tableDescription.setKeySchema(KeySchemaJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TableStatus", targetDepth)) {
                    context.nextToken();
                    tableDescription.setTableStatus(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreationDateTime", targetDepth)) {
                    context.nextToken();
                    tableDescription.setCreationDateTime(DateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ProvisionedThroughput", targetDepth)) {
                    context.nextToken();
                    tableDescription.setProvisionedThroughput(ProvisionedThroughputDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TableSizeBytes", targetDepth)) {
                    context.nextToken();
                    tableDescription.setTableSizeBytes(LongJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ItemCount", targetDepth)) {
                    context.nextToken();
                    tableDescription.setItemCount(LongJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getCurrentDepth() <= originalDepth) break;
            }
            

            token = context.nextToken();
        }
        
        return tableDescription;
    }

    private static TableDescriptionJsonUnmarshaller instance;
    public static TableDescriptionJsonUnmarshaller getInstance() {
        if (instance == null) instance = new TableDescriptionJsonUnmarshaller();
        return instance;
    }
}
    