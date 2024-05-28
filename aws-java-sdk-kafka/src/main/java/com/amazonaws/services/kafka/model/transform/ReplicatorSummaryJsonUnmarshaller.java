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
package com.amazonaws.services.kafka.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kafka.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ReplicatorSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicatorSummaryJsonUnmarshaller implements Unmarshaller<ReplicatorSummary, JsonUnmarshallerContext> {

    public ReplicatorSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReplicatorSummary replicatorSummary = new ReplicatorSummary();

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
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    replicatorSummary.setCreationTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("currentVersion", targetDepth)) {
                    context.nextToken();
                    replicatorSummary.setCurrentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("isReplicatorReference", targetDepth)) {
                    context.nextToken();
                    replicatorSummary.setIsReplicatorReference(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("kafkaClustersSummary", targetDepth)) {
                    context.nextToken();
                    replicatorSummary.setKafkaClustersSummary(new ListUnmarshaller<KafkaClusterSummary>(KafkaClusterSummaryJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("replicationInfoSummaryList", targetDepth)) {
                    context.nextToken();
                    replicatorSummary.setReplicationInfoSummaryList(new ListUnmarshaller<ReplicationInfoSummary>(ReplicationInfoSummaryJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("replicatorArn", targetDepth)) {
                    context.nextToken();
                    replicatorSummary.setReplicatorArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("replicatorName", targetDepth)) {
                    context.nextToken();
                    replicatorSummary.setReplicatorName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("replicatorResourceArn", targetDepth)) {
                    context.nextToken();
                    replicatorSummary.setReplicatorResourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("replicatorState", targetDepth)) {
                    context.nextToken();
                    replicatorSummary.setReplicatorState(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return replicatorSummary;
    }

    private static ReplicatorSummaryJsonUnmarshaller instance;

    public static ReplicatorSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReplicatorSummaryJsonUnmarshaller();
        return instance;
    }
}
