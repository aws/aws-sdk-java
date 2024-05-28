/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * SnowflakeNodeData JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnowflakeNodeDataJsonUnmarshaller implements Unmarshaller<SnowflakeNodeData, JsonUnmarshallerContext> {

    public SnowflakeNodeData unmarshall(JsonUnmarshallerContext context) throws Exception {
        SnowflakeNodeData snowflakeNodeData = new SnowflakeNodeData();

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
                if (context.testExpression("SourceType", targetDepth)) {
                    context.nextToken();
                    snowflakeNodeData.setSourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Connection", targetDepth)) {
                    context.nextToken();
                    snowflakeNodeData.setConnection(OptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Schema", targetDepth)) {
                    context.nextToken();
                    snowflakeNodeData.setSchema(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Table", targetDepth)) {
                    context.nextToken();
                    snowflakeNodeData.setTable(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Database", targetDepth)) {
                    context.nextToken();
                    snowflakeNodeData.setDatabase(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TempDir", targetDepth)) {
                    context.nextToken();
                    snowflakeNodeData.setTempDir(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IamRole", targetDepth)) {
                    context.nextToken();
                    snowflakeNodeData.setIamRole(OptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AdditionalOptions", targetDepth)) {
                    context.nextToken();
                    snowflakeNodeData.setAdditionalOptions(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("SampleQuery", targetDepth)) {
                    context.nextToken();
                    snowflakeNodeData.setSampleQuery(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PreAction", targetDepth)) {
                    context.nextToken();
                    snowflakeNodeData.setPreAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PostAction", targetDepth)) {
                    context.nextToken();
                    snowflakeNodeData.setPostAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Action", targetDepth)) {
                    context.nextToken();
                    snowflakeNodeData.setAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Upsert", targetDepth)) {
                    context.nextToken();
                    snowflakeNodeData.setUpsert(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("MergeAction", targetDepth)) {
                    context.nextToken();
                    snowflakeNodeData.setMergeAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MergeWhenMatched", targetDepth)) {
                    context.nextToken();
                    snowflakeNodeData.setMergeWhenMatched(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MergeWhenNotMatched", targetDepth)) {
                    context.nextToken();
                    snowflakeNodeData.setMergeWhenNotMatched(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MergeClause", targetDepth)) {
                    context.nextToken();
                    snowflakeNodeData.setMergeClause(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StagingTable", targetDepth)) {
                    context.nextToken();
                    snowflakeNodeData.setStagingTable(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SelectedColumns", targetDepth)) {
                    context.nextToken();
                    snowflakeNodeData.setSelectedColumns(new ListUnmarshaller<Option>(OptionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("AutoPushdown", targetDepth)) {
                    context.nextToken();
                    snowflakeNodeData.setAutoPushdown(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("TableSchema", targetDepth)) {
                    context.nextToken();
                    snowflakeNodeData.setTableSchema(new ListUnmarshaller<Option>(OptionJsonUnmarshaller.getInstance())

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

        return snowflakeNodeData;
    }

    private static SnowflakeNodeDataJsonUnmarshaller instance;

    public static SnowflakeNodeDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SnowflakeNodeDataJsonUnmarshaller();
        return instance;
    }
}
