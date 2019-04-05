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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InstanceGroupConfig JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceGroupConfigJsonUnmarshaller implements Unmarshaller<InstanceGroupConfig, JsonUnmarshallerContext> {

    public InstanceGroupConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        InstanceGroupConfig instanceGroupConfig = new InstanceGroupConfig();

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
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    instanceGroupConfig.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Market", targetDepth)) {
                    context.nextToken();
                    instanceGroupConfig.setMarket(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceRole", targetDepth)) {
                    context.nextToken();
                    instanceGroupConfig.setInstanceRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BidPrice", targetDepth)) {
                    context.nextToken();
                    instanceGroupConfig.setBidPrice(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceType", targetDepth)) {
                    context.nextToken();
                    instanceGroupConfig.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceCount", targetDepth)) {
                    context.nextToken();
                    instanceGroupConfig.setInstanceCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Configurations", targetDepth)) {
                    context.nextToken();
                    instanceGroupConfig.setConfigurations(new ListUnmarshaller<Configuration>(ConfigurationJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("EbsConfiguration", targetDepth)) {
                    context.nextToken();
                    instanceGroupConfig.setEbsConfiguration(EbsConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AutoScalingPolicy", targetDepth)) {
                    context.nextToken();
                    instanceGroupConfig.setAutoScalingPolicy(AutoScalingPolicyJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return instanceGroupConfig;
    }

    private static InstanceGroupConfigJsonUnmarshaller instance;

    public static InstanceGroupConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceGroupConfigJsonUnmarshaller();
        return instance;
    }
}
