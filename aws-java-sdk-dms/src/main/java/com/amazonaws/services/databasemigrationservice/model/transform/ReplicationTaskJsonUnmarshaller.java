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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ReplicationTask JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationTaskJsonUnmarshaller implements Unmarshaller<ReplicationTask, JsonUnmarshallerContext> {

    public ReplicationTask unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReplicationTask replicationTask = new ReplicationTask();

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
                if (context.testExpression("ReplicationTaskIdentifier", targetDepth)) {
                    context.nextToken();
                    replicationTask.setReplicationTaskIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceEndpointArn", targetDepth)) {
                    context.nextToken();
                    replicationTask.setSourceEndpointArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetEndpointArn", targetDepth)) {
                    context.nextToken();
                    replicationTask.setTargetEndpointArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationInstanceArn", targetDepth)) {
                    context.nextToken();
                    replicationTask.setReplicationInstanceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MigrationType", targetDepth)) {
                    context.nextToken();
                    replicationTask.setMigrationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TableMappings", targetDepth)) {
                    context.nextToken();
                    replicationTask.setTableMappings(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationTaskSettings", targetDepth)) {
                    context.nextToken();
                    replicationTask.setReplicationTaskSettings(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    replicationTask.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastFailureMessage", targetDepth)) {
                    context.nextToken();
                    replicationTask.setLastFailureMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StopReason", targetDepth)) {
                    context.nextToken();
                    replicationTask.setStopReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationTaskCreationDate", targetDepth)) {
                    context.nextToken();
                    replicationTask.setReplicationTaskCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ReplicationTaskStartDate", targetDepth)) {
                    context.nextToken();
                    replicationTask.setReplicationTaskStartDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CdcStartPosition", targetDepth)) {
                    context.nextToken();
                    replicationTask.setCdcStartPosition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CdcStopPosition", targetDepth)) {
                    context.nextToken();
                    replicationTask.setCdcStopPosition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RecoveryCheckpoint", targetDepth)) {
                    context.nextToken();
                    replicationTask.setRecoveryCheckpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationTaskArn", targetDepth)) {
                    context.nextToken();
                    replicationTask.setReplicationTaskArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationTaskStats", targetDepth)) {
                    context.nextToken();
                    replicationTask.setReplicationTaskStats(ReplicationTaskStatsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return replicationTask;
    }

    private static ReplicationTaskJsonUnmarshaller instance;

    public static ReplicationTaskJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationTaskJsonUnmarshaller();
        return instance;
    }
}
