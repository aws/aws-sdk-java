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
package com.amazonaws.services.dynamodbv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BackupSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BackupSummaryJsonUnmarshaller implements Unmarshaller<BackupSummary, JsonUnmarshallerContext> {

    public BackupSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        BackupSummary backupSummary = new BackupSummary();

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
                if (context.testExpression("TableName", targetDepth)) {
                    context.nextToken();
                    backupSummary.setTableName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TableId", targetDepth)) {
                    context.nextToken();
                    backupSummary.setTableId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TableArn", targetDepth)) {
                    context.nextToken();
                    backupSummary.setTableArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BackupArn", targetDepth)) {
                    context.nextToken();
                    backupSummary.setBackupArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BackupName", targetDepth)) {
                    context.nextToken();
                    backupSummary.setBackupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BackupCreationDateTime", targetDepth)) {
                    context.nextToken();
                    backupSummary.setBackupCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("BackupExpiryDateTime", targetDepth)) {
                    context.nextToken();
                    backupSummary.setBackupExpiryDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("BackupStatus", targetDepth)) {
                    context.nextToken();
                    backupSummary.setBackupStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BackupType", targetDepth)) {
                    context.nextToken();
                    backupSummary.setBackupType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BackupSizeBytes", targetDepth)) {
                    context.nextToken();
                    backupSummary.setBackupSizeBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return backupSummary;
    }

    private static BackupSummaryJsonUnmarshaller instance;

    public static BackupSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BackupSummaryJsonUnmarshaller();
        return instance;
    }
}
