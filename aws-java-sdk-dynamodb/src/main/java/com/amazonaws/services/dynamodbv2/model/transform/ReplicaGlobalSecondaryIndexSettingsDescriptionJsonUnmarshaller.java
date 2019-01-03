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
 * ReplicaGlobalSecondaryIndexSettingsDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicaGlobalSecondaryIndexSettingsDescriptionJsonUnmarshaller implements
        Unmarshaller<ReplicaGlobalSecondaryIndexSettingsDescription, JsonUnmarshallerContext> {

    public ReplicaGlobalSecondaryIndexSettingsDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReplicaGlobalSecondaryIndexSettingsDescription replicaGlobalSecondaryIndexSettingsDescription = new ReplicaGlobalSecondaryIndexSettingsDescription();

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
                if (context.testExpression("IndexName", targetDepth)) {
                    context.nextToken();
                    replicaGlobalSecondaryIndexSettingsDescription.setIndexName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IndexStatus", targetDepth)) {
                    context.nextToken();
                    replicaGlobalSecondaryIndexSettingsDescription.setIndexStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProvisionedReadCapacityUnits", targetDepth)) {
                    context.nextToken();
                    replicaGlobalSecondaryIndexSettingsDescription.setProvisionedReadCapacityUnits(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("ProvisionedReadCapacityAutoScalingSettings", targetDepth)) {
                    context.nextToken();
                    replicaGlobalSecondaryIndexSettingsDescription.setProvisionedReadCapacityAutoScalingSettings(AutoScalingSettingsDescriptionJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("ProvisionedWriteCapacityUnits", targetDepth)) {
                    context.nextToken();
                    replicaGlobalSecondaryIndexSettingsDescription.setProvisionedWriteCapacityUnits(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("ProvisionedWriteCapacityAutoScalingSettings", targetDepth)) {
                    context.nextToken();
                    replicaGlobalSecondaryIndexSettingsDescription
                            .setProvisionedWriteCapacityAutoScalingSettings(AutoScalingSettingsDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return replicaGlobalSecondaryIndexSettingsDescription;
    }

    private static ReplicaGlobalSecondaryIndexSettingsDescriptionJsonUnmarshaller instance;

    public static ReplicaGlobalSecondaryIndexSettingsDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReplicaGlobalSecondaryIndexSettingsDescriptionJsonUnmarshaller();
        return instance;
    }
}
