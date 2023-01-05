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
 * Snapshot JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnapshotJsonUnmarshaller implements Unmarshaller<Snapshot, JsonUnmarshallerContext> {

    public Snapshot unmarshall(JsonUnmarshallerContext context) throws Exception {
        Snapshot snapshot = new Snapshot();

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
                if (context.testExpression("accountsWithProvisionedRestoreAccess", targetDepth)) {
                    context.nextToken();
                    snapshot.setAccountsWithProvisionedRestoreAccess(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("accountsWithRestoreAccess", targetDepth)) {
                    context.nextToken();
                    snapshot.setAccountsWithRestoreAccess(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("actualIncrementalBackupSizeInMegaBytes", targetDepth)) {
                    context.nextToken();
                    snapshot.setActualIncrementalBackupSizeInMegaBytes(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("adminUsername", targetDepth)) {
                    context.nextToken();
                    snapshot.setAdminUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("backupProgressInMegaBytes", targetDepth)) {
                    context.nextToken();
                    snapshot.setBackupProgressInMegaBytes(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("currentBackupRateInMegaBytesPerSecond", targetDepth)) {
                    context.nextToken();
                    snapshot.setCurrentBackupRateInMegaBytesPerSecond(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("elapsedTimeInSeconds", targetDepth)) {
                    context.nextToken();
                    snapshot.setElapsedTimeInSeconds(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("estimatedSecondsToCompletion", targetDepth)) {
                    context.nextToken();
                    snapshot.setEstimatedSecondsToCompletion(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("kmsKeyId", targetDepth)) {
                    context.nextToken();
                    snapshot.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("namespaceArn", targetDepth)) {
                    context.nextToken();
                    snapshot.setNamespaceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("namespaceName", targetDepth)) {
                    context.nextToken();
                    snapshot.setNamespaceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ownerAccount", targetDepth)) {
                    context.nextToken();
                    snapshot.setOwnerAccount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("snapshotArn", targetDepth)) {
                    context.nextToken();
                    snapshot.setSnapshotArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("snapshotCreateTime", targetDepth)) {
                    context.nextToken();
                    snapshot.setSnapshotCreateTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("snapshotName", targetDepth)) {
                    context.nextToken();
                    snapshot.setSnapshotName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("snapshotRemainingDays", targetDepth)) {
                    context.nextToken();
                    snapshot.setSnapshotRemainingDays(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("snapshotRetentionPeriod", targetDepth)) {
                    context.nextToken();
                    snapshot.setSnapshotRetentionPeriod(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("snapshotRetentionStartTime", targetDepth)) {
                    context.nextToken();
                    snapshot.setSnapshotRetentionStartTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    snapshot.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("totalBackupSizeInMegaBytes", targetDepth)) {
                    context.nextToken();
                    snapshot.setTotalBackupSizeInMegaBytes(context.getUnmarshaller(Double.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return snapshot;
    }

    private static SnapshotJsonUnmarshaller instance;

    public static SnapshotJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SnapshotJsonUnmarshaller();
        return instance;
    }
}
