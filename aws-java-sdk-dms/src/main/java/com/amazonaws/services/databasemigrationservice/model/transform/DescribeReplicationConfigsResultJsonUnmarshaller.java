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
 * DescribeReplicationConfigsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReplicationConfigsResultJsonUnmarshaller implements Unmarshaller<DescribeReplicationConfigsResult, JsonUnmarshallerContext> {

    public DescribeReplicationConfigsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeReplicationConfigsResult describeReplicationConfigsResult = new DescribeReplicationConfigsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeReplicationConfigsResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Marker", targetDepth)) {
                    context.nextToken();
                    describeReplicationConfigsResult.setMarker(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationConfigs", targetDepth)) {
                    context.nextToken();
                    describeReplicationConfigsResult.setReplicationConfigs(new ListUnmarshaller<ReplicationConfig>(ReplicationConfigJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeReplicationConfigsResult;
    }

    private static DescribeReplicationConfigsResultJsonUnmarshaller instance;

    public static DescribeReplicationConfigsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeReplicationConfigsResultJsonUnmarshaller();
        return instance;
    }
}
