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
 * DescribeReplicationInstanceTaskLogsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReplicationInstanceTaskLogsResultJsonUnmarshaller implements
        Unmarshaller<DescribeReplicationInstanceTaskLogsResult, JsonUnmarshallerContext> {

    public DescribeReplicationInstanceTaskLogsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeReplicationInstanceTaskLogsResult describeReplicationInstanceTaskLogsResult = new DescribeReplicationInstanceTaskLogsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeReplicationInstanceTaskLogsResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ReplicationInstanceArn", targetDepth)) {
                    context.nextToken();
                    describeReplicationInstanceTaskLogsResult.setReplicationInstanceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationInstanceTaskLogs", targetDepth)) {
                    context.nextToken();
                    describeReplicationInstanceTaskLogsResult.setReplicationInstanceTaskLogs(new ListUnmarshaller<ReplicationInstanceTaskLog>(
                            ReplicationInstanceTaskLogJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Marker", targetDepth)) {
                    context.nextToken();
                    describeReplicationInstanceTaskLogsResult.setMarker(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeReplicationInstanceTaskLogsResult;
    }

    private static DescribeReplicationInstanceTaskLogsResultJsonUnmarshaller instance;

    public static DescribeReplicationInstanceTaskLogsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeReplicationInstanceTaskLogsResultJsonUnmarshaller();
        return instance;
    }
}
