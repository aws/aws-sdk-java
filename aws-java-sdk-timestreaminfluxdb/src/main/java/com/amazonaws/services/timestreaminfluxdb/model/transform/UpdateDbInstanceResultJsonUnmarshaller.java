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
package com.amazonaws.services.timestreaminfluxdb.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.timestreaminfluxdb.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateDbInstanceResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDbInstanceResultJsonUnmarshaller implements Unmarshaller<UpdateDbInstanceResult, JsonUnmarshallerContext> {

    public UpdateDbInstanceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateDbInstanceResult updateDbInstanceResult = new UpdateDbInstanceResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateDbInstanceResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    updateDbInstanceResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    updateDbInstanceResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    updateDbInstanceResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    updateDbInstanceResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("endpoint", targetDepth)) {
                    context.nextToken();
                    updateDbInstanceResult.setEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dbInstanceType", targetDepth)) {
                    context.nextToken();
                    updateDbInstanceResult.setDbInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dbStorageType", targetDepth)) {
                    context.nextToken();
                    updateDbInstanceResult.setDbStorageType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("allocatedStorage", targetDepth)) {
                    context.nextToken();
                    updateDbInstanceResult.setAllocatedStorage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("deploymentType", targetDepth)) {
                    context.nextToken();
                    updateDbInstanceResult.setDeploymentType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vpcSubnetIds", targetDepth)) {
                    context.nextToken();
                    updateDbInstanceResult.setVpcSubnetIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("publiclyAccessible", targetDepth)) {
                    context.nextToken();
                    updateDbInstanceResult.setPubliclyAccessible(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("vpcSecurityGroupIds", targetDepth)) {
                    context.nextToken();
                    updateDbInstanceResult.setVpcSecurityGroupIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("dbParameterGroupIdentifier", targetDepth)) {
                    context.nextToken();
                    updateDbInstanceResult.setDbParameterGroupIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("availabilityZone", targetDepth)) {
                    context.nextToken();
                    updateDbInstanceResult.setAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("secondaryAvailabilityZone", targetDepth)) {
                    context.nextToken();
                    updateDbInstanceResult.setSecondaryAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("logDeliveryConfiguration", targetDepth)) {
                    context.nextToken();
                    updateDbInstanceResult.setLogDeliveryConfiguration(LogDeliveryConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("influxAuthParametersSecretArn", targetDepth)) {
                    context.nextToken();
                    updateDbInstanceResult.setInfluxAuthParametersSecretArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateDbInstanceResult;
    }

    private static UpdateDbInstanceResultJsonUnmarshaller instance;

    public static UpdateDbInstanceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateDbInstanceResultJsonUnmarshaller();
        return instance;
    }
}
