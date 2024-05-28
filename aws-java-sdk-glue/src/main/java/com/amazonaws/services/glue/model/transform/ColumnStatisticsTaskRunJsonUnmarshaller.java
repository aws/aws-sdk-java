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
 * ColumnStatisticsTaskRun JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColumnStatisticsTaskRunJsonUnmarshaller implements Unmarshaller<ColumnStatisticsTaskRun, JsonUnmarshallerContext> {

    public ColumnStatisticsTaskRun unmarshall(JsonUnmarshallerContext context) throws Exception {
        ColumnStatisticsTaskRun columnStatisticsTaskRun = new ColumnStatisticsTaskRun();

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
                if (context.testExpression("CustomerId", targetDepth)) {
                    context.nextToken();
                    columnStatisticsTaskRun.setCustomerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ColumnStatisticsTaskRunId", targetDepth)) {
                    context.nextToken();
                    columnStatisticsTaskRun.setColumnStatisticsTaskRunId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DatabaseName", targetDepth)) {
                    context.nextToken();
                    columnStatisticsTaskRun.setDatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TableName", targetDepth)) {
                    context.nextToken();
                    columnStatisticsTaskRun.setTableName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ColumnNameList", targetDepth)) {
                    context.nextToken();
                    columnStatisticsTaskRun.setColumnNameList(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("CatalogID", targetDepth)) {
                    context.nextToken();
                    columnStatisticsTaskRun.setCatalogID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Role", targetDepth)) {
                    context.nextToken();
                    columnStatisticsTaskRun.setRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SampleSize", targetDepth)) {
                    context.nextToken();
                    columnStatisticsTaskRun.setSampleSize(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("SecurityConfiguration", targetDepth)) {
                    context.nextToken();
                    columnStatisticsTaskRun.setSecurityConfiguration(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NumberOfWorkers", targetDepth)) {
                    context.nextToken();
                    columnStatisticsTaskRun.setNumberOfWorkers(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("WorkerType", targetDepth)) {
                    context.nextToken();
                    columnStatisticsTaskRun.setWorkerType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    columnStatisticsTaskRun.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    columnStatisticsTaskRun.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdated", targetDepth)) {
                    context.nextToken();
                    columnStatisticsTaskRun.setLastUpdated(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    context.nextToken();
                    columnStatisticsTaskRun.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    context.nextToken();
                    columnStatisticsTaskRun.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ErrorMessage", targetDepth)) {
                    context.nextToken();
                    columnStatisticsTaskRun.setErrorMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DPUSeconds", targetDepth)) {
                    context.nextToken();
                    columnStatisticsTaskRun.setDPUSeconds(context.getUnmarshaller(Double.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return columnStatisticsTaskRun;
    }

    private static ColumnStatisticsTaskRunJsonUnmarshaller instance;

    public static ColumnStatisticsTaskRunJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ColumnStatisticsTaskRunJsonUnmarshaller();
        return instance;
    }
}
