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
 * ReplicaSettingsDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicaSettingsDescriptionJsonUnmarshaller implements Unmarshaller<ReplicaSettingsDescription, JsonUnmarshallerContext> {

    public ReplicaSettingsDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReplicaSettingsDescription replicaSettingsDescription = new ReplicaSettingsDescription();

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
                if (context.testExpression("RegionName", targetDepth)) {
                    context.nextToken();
                    replicaSettingsDescription.setRegionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicaStatus", targetDepth)) {
                    context.nextToken();
                    replicaSettingsDescription.setReplicaStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicaBillingModeSummary", targetDepth)) {
                    context.nextToken();
                    replicaSettingsDescription.setReplicaBillingModeSummary(BillingModeSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ReplicaProvisionedReadCapacityUnits", targetDepth)) {
                    context.nextToken();
                    replicaSettingsDescription.setReplicaProvisionedReadCapacityUnits(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("ReplicaProvisionedReadCapacityAutoScalingSettings", targetDepth)) {
                    context.nextToken();
                    replicaSettingsDescription.setReplicaProvisionedReadCapacityAutoScalingSettings(AutoScalingSettingsDescriptionJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("ReplicaProvisionedWriteCapacityUnits", targetDepth)) {
                    context.nextToken();
                    replicaSettingsDescription.setReplicaProvisionedWriteCapacityUnits(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("ReplicaProvisionedWriteCapacityAutoScalingSettings", targetDepth)) {
                    context.nextToken();
                    replicaSettingsDescription.setReplicaProvisionedWriteCapacityAutoScalingSettings(AutoScalingSettingsDescriptionJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("ReplicaGlobalSecondaryIndexSettings", targetDepth)) {
                    context.nextToken();
                    replicaSettingsDescription.setReplicaGlobalSecondaryIndexSettings(new ListUnmarshaller<ReplicaGlobalSecondaryIndexSettingsDescription>(
                            ReplicaGlobalSecondaryIndexSettingsDescriptionJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return replicaSettingsDescription;
    }

    private static ReplicaSettingsDescriptionJsonUnmarshaller instance;

    public static ReplicaSettingsDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReplicaSettingsDescriptionJsonUnmarshaller();
        return instance;
    }
}
