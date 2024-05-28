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
 * AmazonRedshiftNodeData JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonRedshiftNodeDataJsonUnmarshaller implements Unmarshaller<AmazonRedshiftNodeData, JsonUnmarshallerContext> {

    public AmazonRedshiftNodeData unmarshall(JsonUnmarshallerContext context) throws Exception {
        AmazonRedshiftNodeData amazonRedshiftNodeData = new AmazonRedshiftNodeData();

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
                if (context.testExpression("AccessType", targetDepth)) {
                    context.nextToken();
                    amazonRedshiftNodeData.setAccessType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceType", targetDepth)) {
                    context.nextToken();
                    amazonRedshiftNodeData.setSourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Connection", targetDepth)) {
                    context.nextToken();
                    amazonRedshiftNodeData.setConnection(OptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Schema", targetDepth)) {
                    context.nextToken();
                    amazonRedshiftNodeData.setSchema(OptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Table", targetDepth)) {
                    context.nextToken();
                    amazonRedshiftNodeData.setTable(OptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CatalogDatabase", targetDepth)) {
                    context.nextToken();
                    amazonRedshiftNodeData.setCatalogDatabase(OptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CatalogTable", targetDepth)) {
                    context.nextToken();
                    amazonRedshiftNodeData.setCatalogTable(OptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CatalogRedshiftSchema", targetDepth)) {
                    context.nextToken();
                    amazonRedshiftNodeData.setCatalogRedshiftSchema(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CatalogRedshiftTable", targetDepth)) {
                    context.nextToken();
                    amazonRedshiftNodeData.setCatalogRedshiftTable(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TempDir", targetDepth)) {
                    context.nextToken();
                    amazonRedshiftNodeData.setTempDir(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IamRole", targetDepth)) {
                    context.nextToken();
                    amazonRedshiftNodeData.setIamRole(OptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AdvancedOptions", targetDepth)) {
                    context.nextToken();
                    amazonRedshiftNodeData.setAdvancedOptions(new ListUnmarshaller<AmazonRedshiftAdvancedOption>(AmazonRedshiftAdvancedOptionJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("SampleQuery", targetDepth)) {
                    context.nextToken();
                    amazonRedshiftNodeData.setSampleQuery(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PreAction", targetDepth)) {
                    context.nextToken();
                    amazonRedshiftNodeData.setPreAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PostAction", targetDepth)) {
                    context.nextToken();
                    amazonRedshiftNodeData.setPostAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Action", targetDepth)) {
                    context.nextToken();
                    amazonRedshiftNodeData.setAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TablePrefix", targetDepth)) {
                    context.nextToken();
                    amazonRedshiftNodeData.setTablePrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Upsert", targetDepth)) {
                    context.nextToken();
                    amazonRedshiftNodeData.setUpsert(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("MergeAction", targetDepth)) {
                    context.nextToken();
                    amazonRedshiftNodeData.setMergeAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MergeWhenMatched", targetDepth)) {
                    context.nextToken();
                    amazonRedshiftNodeData.setMergeWhenMatched(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MergeWhenNotMatched", targetDepth)) {
                    context.nextToken();
                    amazonRedshiftNodeData.setMergeWhenNotMatched(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MergeClause", targetDepth)) {
                    context.nextToken();
                    amazonRedshiftNodeData.setMergeClause(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CrawlerConnection", targetDepth)) {
                    context.nextToken();
                    amazonRedshiftNodeData.setCrawlerConnection(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TableSchema", targetDepth)) {
                    context.nextToken();
                    amazonRedshiftNodeData.setTableSchema(new ListUnmarshaller<Option>(OptionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("StagingTable", targetDepth)) {
                    context.nextToken();
                    amazonRedshiftNodeData.setStagingTable(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SelectedColumns", targetDepth)) {
                    context.nextToken();
                    amazonRedshiftNodeData.setSelectedColumns(new ListUnmarshaller<Option>(OptionJsonUnmarshaller.getInstance())

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

        return amazonRedshiftNodeData;
    }

    private static AmazonRedshiftNodeDataJsonUnmarshaller instance;

    public static AmazonRedshiftNodeDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AmazonRedshiftNodeDataJsonUnmarshaller();
        return instance;
    }
}
