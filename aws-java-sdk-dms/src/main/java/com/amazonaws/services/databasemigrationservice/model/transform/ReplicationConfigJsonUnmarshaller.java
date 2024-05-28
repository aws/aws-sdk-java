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
 * ReplicationConfig JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationConfigJsonUnmarshaller implements Unmarshaller<ReplicationConfig, JsonUnmarshallerContext> {

    public ReplicationConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReplicationConfig replicationConfig = new ReplicationConfig();

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
                    replicationConfig.setReplicationConfigIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationConfigArn", targetDepth)) {
                    context.nextToken();
                    replicationConfig.setReplicationConfigArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceEndpointArn", targetDepth)) {
                    context.nextToken();
                    replicationConfig.setSourceEndpointArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetEndpointArn", targetDepth)) {
                    context.nextToken();
                    replicationConfig.setTargetEndpointArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationType", targetDepth)) {
                    context.nextToken();
                    replicationConfig.setReplicationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ComputeConfig", targetDepth)) {
                    context.nextToken();
                    replicationConfig.setComputeConfig(ComputeConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ReplicationSettings", targetDepth)) {
                    context.nextToken();
                    replicationConfig.setReplicationSettings(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SupplementalSettings", targetDepth)) {
                    context.nextToken();
                    replicationConfig.setSupplementalSettings(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TableMappings", targetDepth)) {
                    context.nextToken();
                    replicationConfig.setTableMappings(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationConfigCreateTime", targetDepth)) {
                    context.nextToken();
                    replicationConfig.setReplicationConfigCreateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ReplicationConfigUpdateTime", targetDepth)) {
                    context.nextToken();
                    replicationConfig.setReplicationConfigUpdateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return replicationConfig;
    }

    private static ReplicationConfigJsonUnmarshaller instance;

    public static ReplicationConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationConfigJsonUnmarshaller();
        return instance;
    }
}
