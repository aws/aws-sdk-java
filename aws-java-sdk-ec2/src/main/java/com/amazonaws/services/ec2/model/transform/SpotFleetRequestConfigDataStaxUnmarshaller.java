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
package com.amazonaws.services.ec2.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * SpotFleetRequestConfigData StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpotFleetRequestConfigDataStaxUnmarshaller implements Unmarshaller<SpotFleetRequestConfigData, StaxUnmarshallerContext> {

    public SpotFleetRequestConfigData unmarshall(StaxUnmarshallerContext context) throws Exception {
        SpotFleetRequestConfigData spotFleetRequestConfigData = new SpotFleetRequestConfigData();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return spotFleetRequestConfigData;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("allocationStrategy", targetDepth)) {
                    spotFleetRequestConfigData.setAllocationStrategy(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("onDemandAllocationStrategy", targetDepth)) {
                    spotFleetRequestConfigData.setOnDemandAllocationStrategy(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("clientToken", targetDepth)) {
                    spotFleetRequestConfigData.setClientToken(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("excessCapacityTerminationPolicy", targetDepth)) {
                    spotFleetRequestConfigData.setExcessCapacityTerminationPolicy(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("fulfilledCapacity", targetDepth)) {
                    spotFleetRequestConfigData.setFulfilledCapacity(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("onDemandFulfilledCapacity", targetDepth)) {
                    spotFleetRequestConfigData.setOnDemandFulfilledCapacity(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("iamFleetRole", targetDepth)) {
                    spotFleetRequestConfigData.setIamFleetRole(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("launchSpecifications", targetDepth)) {
                    spotFleetRequestConfigData.withLaunchSpecifications(new ArrayList<SpotFleetLaunchSpecification>());
                    continue;
                }

                if (context.testExpression("launchSpecifications/item", targetDepth)) {
                    spotFleetRequestConfigData.withLaunchSpecifications(SpotFleetLaunchSpecificationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("launchTemplateConfigs", targetDepth)) {
                    spotFleetRequestConfigData.withLaunchTemplateConfigs(new ArrayList<LaunchTemplateConfig>());
                    continue;
                }

                if (context.testExpression("launchTemplateConfigs/item", targetDepth)) {
                    spotFleetRequestConfigData.withLaunchTemplateConfigs(LaunchTemplateConfigStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("spotPrice", targetDepth)) {
                    spotFleetRequestConfigData.setSpotPrice(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("targetCapacity", targetDepth)) {
                    spotFleetRequestConfigData.setTargetCapacity(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("onDemandTargetCapacity", targetDepth)) {
                    spotFleetRequestConfigData.setOnDemandTargetCapacity(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("terminateInstancesWithExpiration", targetDepth)) {
                    spotFleetRequestConfigData.setTerminateInstancesWithExpiration(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("type", targetDepth)) {
                    spotFleetRequestConfigData.setType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("validFrom", targetDepth)) {
                    spotFleetRequestConfigData.setValidFrom(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("validUntil", targetDepth)) {
                    spotFleetRequestConfigData.setValidUntil(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("replaceUnhealthyInstances", targetDepth)) {
                    spotFleetRequestConfigData.setReplaceUnhealthyInstances(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceInterruptionBehavior", targetDepth)) {
                    spotFleetRequestConfigData.setInstanceInterruptionBehavior(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("loadBalancersConfig", targetDepth)) {
                    spotFleetRequestConfigData.setLoadBalancersConfig(LoadBalancersConfigStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instancePoolsToUseCount", targetDepth)) {
                    spotFleetRequestConfigData.setInstancePoolsToUseCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return spotFleetRequestConfigData;
                }
            }
        }
    }

    private static SpotFleetRequestConfigDataStaxUnmarshaller instance;

    public static SpotFleetRequestConfigDataStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new SpotFleetRequestConfigDataStaxUnmarshaller();
        return instance;
    }
}
