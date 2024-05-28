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
 * DescribeReplicatorResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReplicatorResultJsonUnmarshaller implements Unmarshaller<DescribeReplicatorResult, JsonUnmarshallerContext> {

    public DescribeReplicatorResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeReplicatorResult describeReplicatorResult = new DescribeReplicatorResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeReplicatorResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    describeReplicatorResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("currentVersion", targetDepth)) {
                    context.nextToken();
                    describeReplicatorResult.setCurrentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("isReplicatorReference", targetDepth)) {
                    context.nextToken();
                    describeReplicatorResult.setIsReplicatorReference(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("kafkaClusters", targetDepth)) {
                    context.nextToken();
                    describeReplicatorResult.setKafkaClusters(new ListUnmarshaller<KafkaClusterDescription>(KafkaClusterDescriptionJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("replicationInfoList", targetDepth)) {
                    context.nextToken();
                    describeReplicatorResult.setReplicationInfoList(new ListUnmarshaller<ReplicationInfoDescription>(ReplicationInfoDescriptionJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("replicatorArn", targetDepth)) {
                    context.nextToken();
                    describeReplicatorResult.setReplicatorArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("replicatorDescription", targetDepth)) {
                    context.nextToken();
                    describeReplicatorResult.setReplicatorDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("replicatorName", targetDepth)) {
                    context.nextToken();
                    describeReplicatorResult.setReplicatorName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("replicatorResourceArn", targetDepth)) {
                    context.nextToken();
                    describeReplicatorResult.setReplicatorResourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("replicatorState", targetDepth)) {
                    context.nextToken();
                    describeReplicatorResult.setReplicatorState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serviceExecutionRoleArn", targetDepth)) {
                    context.nextToken();
                    describeReplicatorResult.setServiceExecutionRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stateInfo", targetDepth)) {
                    context.nextToken();
                    describeReplicatorResult.setStateInfo(ReplicationStateInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    describeReplicatorResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeReplicatorResult;
    }

    private static DescribeReplicatorResultJsonUnmarshaller instance;

    public static DescribeReplicatorResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeReplicatorResultJsonUnmarshaller();
        return instance;
    }
}
