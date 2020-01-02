/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ReplicaAutoScalingDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicaAutoScalingDescriptionJsonUnmarshaller implements Unmarshaller<ReplicaAutoScalingDescription, JsonUnmarshallerContext> {

    public ReplicaAutoScalingDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReplicaAutoScalingDescription replicaAutoScalingDescription = new ReplicaAutoScalingDescription();

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
                    replicaAutoScalingDescription.setRegionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GlobalSecondaryIndexes", targetDepth)) {
                    context.nextToken();
                    replicaAutoScalingDescription.setGlobalSecondaryIndexes(new ListUnmarshaller<ReplicaGlobalSecondaryIndexAutoScalingDescription>(
                            ReplicaGlobalSecondaryIndexAutoScalingDescriptionJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("ReplicaProvisionedReadCapacityAutoScalingSettings", targetDepth)) {
                    context.nextToken();
                    replicaAutoScalingDescription.setReplicaProvisionedReadCapacityAutoScalingSettings(AutoScalingSettingsDescriptionJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("ReplicaProvisionedWriteCapacityAutoScalingSettings", targetDepth)) {
                    context.nextToken();
                    replicaAutoScalingDescription.setReplicaProvisionedWriteCapacityAutoScalingSettings(AutoScalingSettingsDescriptionJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("ReplicaStatus", targetDepth)) {
                    context.nextToken();
                    replicaAutoScalingDescription.setReplicaStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return replicaAutoScalingDescription;
    }

    private static ReplicaAutoScalingDescriptionJsonUnmarshaller instance;

    public static ReplicaAutoScalingDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReplicaAutoScalingDescriptionJsonUnmarshaller();
        return instance;
    }
}
