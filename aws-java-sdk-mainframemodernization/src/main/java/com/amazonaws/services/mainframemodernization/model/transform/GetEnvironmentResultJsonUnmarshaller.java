/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mainframemodernization.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mainframemodernization.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetEnvironmentResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEnvironmentResultJsonUnmarshaller implements Unmarshaller<GetEnvironmentResult, JsonUnmarshallerContext> {

    public GetEnvironmentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetEnvironmentResult getEnvironmentResult = new GetEnvironmentResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getEnvironmentResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("actualCapacity", targetDepth)) {
                    context.nextToken();
                    getEnvironmentResult.setActualCapacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    getEnvironmentResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    getEnvironmentResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("engineType", targetDepth)) {
                    context.nextToken();
                    getEnvironmentResult.setEngineType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("engineVersion", targetDepth)) {
                    context.nextToken();
                    getEnvironmentResult.setEngineVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("environmentArn", targetDepth)) {
                    context.nextToken();
                    getEnvironmentResult.setEnvironmentArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("environmentId", targetDepth)) {
                    context.nextToken();
                    getEnvironmentResult.setEnvironmentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("highAvailabilityConfig", targetDepth)) {
                    context.nextToken();
                    getEnvironmentResult.setHighAvailabilityConfig(HighAvailabilityConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("instanceType", targetDepth)) {
                    context.nextToken();
                    getEnvironmentResult.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("kmsKeyId", targetDepth)) {
                    context.nextToken();
                    getEnvironmentResult.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("loadBalancerArn", targetDepth)) {
                    context.nextToken();
                    getEnvironmentResult.setLoadBalancerArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    getEnvironmentResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pendingMaintenance", targetDepth)) {
                    context.nextToken();
                    getEnvironmentResult.setPendingMaintenance(PendingMaintenanceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("preferredMaintenanceWindow", targetDepth)) {
                    context.nextToken();
                    getEnvironmentResult.setPreferredMaintenanceWindow(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("publiclyAccessible", targetDepth)) {
                    context.nextToken();
                    getEnvironmentResult.setPubliclyAccessible(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("securityGroupIds", targetDepth)) {
                    context.nextToken();
                    getEnvironmentResult.setSecurityGroupIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getEnvironmentResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusReason", targetDepth)) {
                    context.nextToken();
                    getEnvironmentResult.setStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("storageConfigurations", targetDepth)) {
                    context.nextToken();
                    getEnvironmentResult
                            .setStorageConfigurations(new ListUnmarshaller<StorageConfiguration>(StorageConfigurationJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("subnetIds", targetDepth)) {
                    context.nextToken();
                    getEnvironmentResult.setSubnetIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    getEnvironmentResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("vpcId", targetDepth)) {
                    context.nextToken();
                    getEnvironmentResult.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getEnvironmentResult;
    }

    private static GetEnvironmentResultJsonUnmarshaller instance;

    public static GetEnvironmentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetEnvironmentResultJsonUnmarshaller();
        return instance;
    }
}
