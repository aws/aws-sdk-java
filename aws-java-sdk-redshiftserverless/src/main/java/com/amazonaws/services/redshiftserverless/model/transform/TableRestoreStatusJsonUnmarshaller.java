/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshiftserverless.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.redshiftserverless.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TableRestoreStatus JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableRestoreStatusJsonUnmarshaller implements Unmarshaller<TableRestoreStatus, JsonUnmarshallerContext> {

    public TableRestoreStatus unmarshall(JsonUnmarshallerContext context) throws Exception {
        TableRestoreStatus tableRestoreStatus = new TableRestoreStatus();

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
                if (context.testExpression("message", targetDepth)) {
                    context.nextToken();
                    tableRestoreStatus.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("namespaceName", targetDepth)) {
                    context.nextToken();
                    tableRestoreStatus.setNamespaceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("newTableName", targetDepth)) {
                    context.nextToken();
                    tableRestoreStatus.setNewTableName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("progressInMegaBytes", targetDepth)) {
                    context.nextToken();
                    tableRestoreStatus.setProgressInMegaBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("requestTime", targetDepth)) {
                    context.nextToken();
                    tableRestoreStatus.setRequestTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("snapshotName", targetDepth)) {
                    context.nextToken();
                    tableRestoreStatus.setSnapshotName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceDatabaseName", targetDepth)) {
                    context.nextToken();
                    tableRestoreStatus.setSourceDatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceSchemaName", targetDepth)) {
                    context.nextToken();
                    tableRestoreStatus.setSourceSchemaName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceTableName", targetDepth)) {
                    context.nextToken();
                    tableRestoreStatus.setSourceTableName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    tableRestoreStatus.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tableRestoreRequestId", targetDepth)) {
                    context.nextToken();
                    tableRestoreStatus.setTableRestoreRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("targetDatabaseName", targetDepth)) {
                    context.nextToken();
                    tableRestoreStatus.setTargetDatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("targetSchemaName", targetDepth)) {
                    context.nextToken();
                    tableRestoreStatus.setTargetSchemaName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("totalDataInMegaBytes", targetDepth)) {
                    context.nextToken();
                    tableRestoreStatus.setTotalDataInMegaBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("workgroupName", targetDepth)) {
                    context.nextToken();
                    tableRestoreStatus.setWorkgroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return tableRestoreStatus;
    }

    private static TableRestoreStatusJsonUnmarshaller instance;

    public static TableRestoreStatusJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TableRestoreStatusJsonUnmarshaller();
        return instance;
    }
}
