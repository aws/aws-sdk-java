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
package com.amazonaws.services.opensearch.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.opensearch.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ClusterConfig JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterConfigJsonUnmarshaller implements Unmarshaller<ClusterConfig, JsonUnmarshallerContext> {

    public ClusterConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        ClusterConfig clusterConfig = new ClusterConfig();

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
                if (context.testExpression("InstanceType", targetDepth)) {
                    context.nextToken();
                    clusterConfig.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceCount", targetDepth)) {
                    context.nextToken();
                    clusterConfig.setInstanceCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DedicatedMasterEnabled", targetDepth)) {
                    context.nextToken();
                    clusterConfig.setDedicatedMasterEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ZoneAwarenessEnabled", targetDepth)) {
                    context.nextToken();
                    clusterConfig.setZoneAwarenessEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ZoneAwarenessConfig", targetDepth)) {
                    context.nextToken();
                    clusterConfig.setZoneAwarenessConfig(ZoneAwarenessConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DedicatedMasterType", targetDepth)) {
                    context.nextToken();
                    clusterConfig.setDedicatedMasterType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DedicatedMasterCount", targetDepth)) {
                    context.nextToken();
                    clusterConfig.setDedicatedMasterCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("WarmEnabled", targetDepth)) {
                    context.nextToken();
                    clusterConfig.setWarmEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("WarmType", targetDepth)) {
                    context.nextToken();
                    clusterConfig.setWarmType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WarmCount", targetDepth)) {
                    context.nextToken();
                    clusterConfig.setWarmCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ColdStorageOptions", targetDepth)) {
                    context.nextToken();
                    clusterConfig.setColdStorageOptions(ColdStorageOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return clusterConfig;
    }

    private static ClusterConfigJsonUnmarshaller instance;

    public static ClusterConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ClusterConfigJsonUnmarshaller();
        return instance;
    }
}
