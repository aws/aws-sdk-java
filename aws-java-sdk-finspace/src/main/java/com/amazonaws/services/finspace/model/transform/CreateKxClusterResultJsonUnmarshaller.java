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
package com.amazonaws.services.finspace.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.finspace.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateKxClusterResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateKxClusterResultJsonUnmarshaller implements Unmarshaller<CreateKxClusterResult, JsonUnmarshallerContext> {

    public CreateKxClusterResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateKxClusterResult createKxClusterResult = new CreateKxClusterResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createKxClusterResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("environmentId", targetDepth)) {
                    context.nextToken();
                    createKxClusterResult.setEnvironmentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    createKxClusterResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusReason", targetDepth)) {
                    context.nextToken();
                    createKxClusterResult.setStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clusterName", targetDepth)) {
                    context.nextToken();
                    createKxClusterResult.setClusterName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clusterType", targetDepth)) {
                    context.nextToken();
                    createKxClusterResult.setClusterType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tickerplantLogConfiguration", targetDepth)) {
                    context.nextToken();
                    createKxClusterResult.setTickerplantLogConfiguration(TickerplantLogConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("volumes", targetDepth)) {
                    context.nextToken();
                    createKxClusterResult.setVolumes(new ListUnmarshaller<Volume>(VolumeJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("databases", targetDepth)) {
                    context.nextToken();
                    createKxClusterResult.setDatabases(new ListUnmarshaller<KxDatabaseConfiguration>(KxDatabaseConfigurationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("cacheStorageConfigurations", targetDepth)) {
                    context.nextToken();
                    createKxClusterResult.setCacheStorageConfigurations(new ListUnmarshaller<KxCacheStorageConfiguration>(
                            KxCacheStorageConfigurationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("autoScalingConfiguration", targetDepth)) {
                    context.nextToken();
                    createKxClusterResult.setAutoScalingConfiguration(AutoScalingConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("clusterDescription", targetDepth)) {
                    context.nextToken();
                    createKxClusterResult.setClusterDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("capacityConfiguration", targetDepth)) {
                    context.nextToken();
                    createKxClusterResult.setCapacityConfiguration(CapacityConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("releaseLabel", targetDepth)) {
                    context.nextToken();
                    createKxClusterResult.setReleaseLabel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vpcConfiguration", targetDepth)) {
                    context.nextToken();
                    createKxClusterResult.setVpcConfiguration(VpcConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("initializationScript", targetDepth)) {
                    context.nextToken();
                    createKxClusterResult.setInitializationScript(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("commandLineArguments", targetDepth)) {
                    context.nextToken();
                    createKxClusterResult.setCommandLineArguments(new ListUnmarshaller<KxCommandLineArgument>(KxCommandLineArgumentJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("code", targetDepth)) {
                    context.nextToken();
                    createKxClusterResult.setCode(CodeConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("executionRole", targetDepth)) {
                    context.nextToken();
                    createKxClusterResult.setExecutionRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastModifiedTimestamp", targetDepth)) {
                    context.nextToken();
                    createKxClusterResult.setLastModifiedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("savedownStorageConfiguration", targetDepth)) {
                    context.nextToken();
                    createKxClusterResult.setSavedownStorageConfiguration(KxSavedownStorageConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("azMode", targetDepth)) {
                    context.nextToken();
                    createKxClusterResult.setAzMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("availabilityZoneId", targetDepth)) {
                    context.nextToken();
                    createKxClusterResult.setAvailabilityZoneId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdTimestamp", targetDepth)) {
                    context.nextToken();
                    createKxClusterResult.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("scalingGroupConfiguration", targetDepth)) {
                    context.nextToken();
                    createKxClusterResult.setScalingGroupConfiguration(KxScalingGroupConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createKxClusterResult;
    }

    private static CreateKxClusterResultJsonUnmarshaller instance;

    public static CreateKxClusterResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateKxClusterResultJsonUnmarshaller();
        return instance;
    }
}
