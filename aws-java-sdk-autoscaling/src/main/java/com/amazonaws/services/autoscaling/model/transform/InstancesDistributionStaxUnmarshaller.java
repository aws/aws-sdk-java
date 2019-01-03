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
package com.amazonaws.services.autoscaling.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * InstancesDistribution StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstancesDistributionStaxUnmarshaller implements Unmarshaller<InstancesDistribution, StaxUnmarshallerContext> {

    public InstancesDistribution unmarshall(StaxUnmarshallerContext context) throws Exception {
        InstancesDistribution instancesDistribution = new InstancesDistribution();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return instancesDistribution;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("OnDemandAllocationStrategy", targetDepth)) {
                    instancesDistribution.setOnDemandAllocationStrategy(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("OnDemandBaseCapacity", targetDepth)) {
                    instancesDistribution.setOnDemandBaseCapacity(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("OnDemandPercentageAboveBaseCapacity", targetDepth)) {
                    instancesDistribution.setOnDemandPercentageAboveBaseCapacity(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SpotAllocationStrategy", targetDepth)) {
                    instancesDistribution.setSpotAllocationStrategy(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SpotInstancePools", targetDepth)) {
                    instancesDistribution.setSpotInstancePools(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SpotMaxPrice", targetDepth)) {
                    instancesDistribution.setSpotMaxPrice(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return instancesDistribution;
                }
            }
        }
    }

    private static InstancesDistributionStaxUnmarshaller instance;

    public static InstancesDistributionStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstancesDistributionStaxUnmarshaller();
        return instance;
    }
}
