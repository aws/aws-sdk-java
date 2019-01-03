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
 * FleetData StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FleetDataStaxUnmarshaller implements Unmarshaller<FleetData, StaxUnmarshallerContext> {

    public FleetData unmarshall(StaxUnmarshallerContext context) throws Exception {
        FleetData fleetData = new FleetData();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return fleetData;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("activityStatus", targetDepth)) {
                    fleetData.setActivityStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("createTime", targetDepth)) {
                    fleetData.setCreateTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("fleetId", targetDepth)) {
                    fleetData.setFleetId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("fleetState", targetDepth)) {
                    fleetData.setFleetState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("clientToken", targetDepth)) {
                    fleetData.setClientToken(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("excessCapacityTerminationPolicy", targetDepth)) {
                    fleetData.setExcessCapacityTerminationPolicy(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("fulfilledCapacity", targetDepth)) {
                    fleetData.setFulfilledCapacity(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("fulfilledOnDemandCapacity", targetDepth)) {
                    fleetData.setFulfilledOnDemandCapacity(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("launchTemplateConfigs", targetDepth)) {
                    fleetData.withLaunchTemplateConfigs(new ArrayList<FleetLaunchTemplateConfig>());
                    continue;
                }

                if (context.testExpression("launchTemplateConfigs/item", targetDepth)) {
                    fleetData.withLaunchTemplateConfigs(FleetLaunchTemplateConfigStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("targetCapacitySpecification", targetDepth)) {
                    fleetData.setTargetCapacitySpecification(TargetCapacitySpecificationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("terminateInstancesWithExpiration", targetDepth)) {
                    fleetData.setTerminateInstancesWithExpiration(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("type", targetDepth)) {
                    fleetData.setType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("validFrom", targetDepth)) {
                    fleetData.setValidFrom(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("validUntil", targetDepth)) {
                    fleetData.setValidUntil(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("replaceUnhealthyInstances", targetDepth)) {
                    fleetData.setReplaceUnhealthyInstances(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("spotOptions", targetDepth)) {
                    fleetData.setSpotOptions(SpotOptionsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("onDemandOptions", targetDepth)) {
                    fleetData.setOnDemandOptions(OnDemandOptionsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tagSet", targetDepth)) {
                    fleetData.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("tagSet/item", targetDepth)) {
                    fleetData.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("errorSet", targetDepth)) {
                    fleetData.withErrors(new ArrayList<DescribeFleetError>());
                    continue;
                }

                if (context.testExpression("errorSet/item", targetDepth)) {
                    fleetData.withErrors(DescribeFleetErrorStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("fleetInstanceSet", targetDepth)) {
                    fleetData.withInstances(new ArrayList<DescribeFleetsInstances>());
                    continue;
                }

                if (context.testExpression("fleetInstanceSet/item", targetDepth)) {
                    fleetData.withInstances(DescribeFleetsInstancesStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return fleetData;
                }
            }
        }
    }

    private static FleetDataStaxUnmarshaller instance;

    public static FleetDataStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new FleetDataStaxUnmarshaller();
        return instance;
    }
}
