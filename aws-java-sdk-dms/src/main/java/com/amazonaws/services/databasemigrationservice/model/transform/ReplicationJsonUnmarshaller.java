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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Replication JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationJsonUnmarshaller implements Unmarshaller<Replication, JsonUnmarshallerContext> {

    public Replication unmarshall(JsonUnmarshallerContext context) throws Exception {
        Replication replication = new Replication();

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
                if (context.testExpression("ReplicationConfigIdentifier", targetDepth)) {
                    context.nextToken();
                    replication.setReplicationConfigIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationConfigArn", targetDepth)) {
                    context.nextToken();
                    replication.setReplicationConfigArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceEndpointArn", targetDepth)) {
                    context.nextToken();
                    replication.setSourceEndpointArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetEndpointArn", targetDepth)) {
                    context.nextToken();
                    replication.setTargetEndpointArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationType", targetDepth)) {
                    context.nextToken();
                    replication.setReplicationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    replication.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProvisionData", targetDepth)) {
                    context.nextToken();
                    replication.setProvisionData(ProvisionDataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StopReason", targetDepth)) {
                    context.nextToken();
                    replication.setStopReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureMessages", targetDepth)) {
                    context.nextToken();
                    replication.setFailureMessages(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ReplicationStats", targetDepth)) {
                    context.nextToken();
                    replication.setReplicationStats(ReplicationStatsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StartReplicationType", targetDepth)) {
                    context.nextToken();
                    replication.setStartReplicationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CdcStartTime", targetDepth)) {
                    context.nextToken();
                    replication.setCdcStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CdcStartPosition", targetDepth)) {
                    context.nextToken();
                    replication.setCdcStartPosition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CdcStopPosition", targetDepth)) {
                    context.nextToken();
                    replication.setCdcStopPosition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RecoveryCheckpoint", targetDepth)) {
                    context.nextToken();
                    replication.setRecoveryCheckpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationCreateTime", targetDepth)) {
                    context.nextToken();
                    replication.setReplicationCreateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ReplicationUpdateTime", targetDepth)) {
                    context.nextToken();
                    replication.setReplicationUpdateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ReplicationLastStopTime", targetDepth)) {
                    context.nextToken();
                    replication.setReplicationLastStopTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ReplicationDeprovisionTime", targetDepth)) {
                    context.nextToken();
                    replication.setReplicationDeprovisionTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return replication;
    }

    private static ReplicationJsonUnmarshaller instance;

    public static ReplicationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationJsonUnmarshaller();
        return instance;
    }
}
