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
 * ComputeConfig JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComputeConfigJsonUnmarshaller implements Unmarshaller<ComputeConfig, JsonUnmarshallerContext> {

    public ComputeConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        ComputeConfig computeConfig = new ComputeConfig();

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
                if (context.testExpression("AvailabilityZone", targetDepth)) {
                    context.nextToken();
                    computeConfig.setAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DnsNameServers", targetDepth)) {
                    context.nextToken();
                    computeConfig.setDnsNameServers(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    context.nextToken();
                    computeConfig.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxCapacityUnits", targetDepth)) {
                    context.nextToken();
                    computeConfig.setMaxCapacityUnits(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MinCapacityUnits", targetDepth)) {
                    context.nextToken();
                    computeConfig.setMinCapacityUnits(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MultiAZ", targetDepth)) {
                    context.nextToken();
                    computeConfig.setMultiAZ(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("PreferredMaintenanceWindow", targetDepth)) {
                    context.nextToken();
                    computeConfig.setPreferredMaintenanceWindow(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationSubnetGroupId", targetDepth)) {
                    context.nextToken();
                    computeConfig.setReplicationSubnetGroupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcSecurityGroupIds", targetDepth)) {
                    context.nextToken();
                    computeConfig.setVpcSecurityGroupIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return computeConfig;
    }

    private static ComputeConfigJsonUnmarshaller instance;

    public static ComputeConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ComputeConfigJsonUnmarshaller();
        return instance;
    }
}
