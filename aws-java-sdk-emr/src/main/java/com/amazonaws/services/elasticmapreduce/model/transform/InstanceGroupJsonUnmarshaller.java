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
 * InstanceGroup JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceGroupJsonUnmarshaller implements Unmarshaller<InstanceGroup, JsonUnmarshallerContext> {

    public InstanceGroup unmarshall(JsonUnmarshallerContext context) throws Exception {
        InstanceGroup instanceGroup = new InstanceGroup();

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
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    instanceGroup.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    instanceGroup.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Market", targetDepth)) {
                    context.nextToken();
                    instanceGroup.setMarket(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceGroupType", targetDepth)) {
                    context.nextToken();
                    instanceGroup.setInstanceGroupType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BidPrice", targetDepth)) {
                    context.nextToken();
                    instanceGroup.setBidPrice(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceType", targetDepth)) {
                    context.nextToken();
                    instanceGroup.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RequestedInstanceCount", targetDepth)) {
                    context.nextToken();
                    instanceGroup.setRequestedInstanceCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("RunningInstanceCount", targetDepth)) {
                    context.nextToken();
                    instanceGroup.setRunningInstanceCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    instanceGroup.setStatus(InstanceGroupStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Configurations", targetDepth)) {
                    context.nextToken();
                    instanceGroup.setConfigurations(new ListUnmarshaller<Configuration>(ConfigurationJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("ConfigurationsVersion", targetDepth)) {
                    context.nextToken();
                    instanceGroup.setConfigurationsVersion(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("LastSuccessfullyAppliedConfigurations", targetDepth)) {
                    context.nextToken();
                    instanceGroup.setLastSuccessfullyAppliedConfigurations(new ListUnmarshaller<Configuration>(ConfigurationJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("LastSuccessfullyAppliedConfigurationsVersion", targetDepth)) {
                    context.nextToken();
                    instanceGroup.setLastSuccessfullyAppliedConfigurationsVersion(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("EbsBlockDevices", targetDepth)) {
                    context.nextToken();
                    instanceGroup.setEbsBlockDevices(new ListUnmarshaller<EbsBlockDevice>(EbsBlockDeviceJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("EbsOptimized", targetDepth)) {
                    context.nextToken();
                    instanceGroup.setEbsOptimized(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ShrinkPolicy", targetDepth)) {
                    context.nextToken();
                    instanceGroup.setShrinkPolicy(ShrinkPolicyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AutoScalingPolicy", targetDepth)) {
                    context.nextToken();
                    instanceGroup.setAutoScalingPolicy(AutoScalingPolicyDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return instanceGroup;
    }

    private static InstanceGroupJsonUnmarshaller instance;

    public static InstanceGroupJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceGroupJsonUnmarshaller();
        return instance;
    }
}
