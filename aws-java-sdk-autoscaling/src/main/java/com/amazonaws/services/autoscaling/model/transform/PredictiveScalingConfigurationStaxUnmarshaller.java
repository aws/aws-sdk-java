/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * PredictiveScalingConfiguration StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PredictiveScalingConfigurationStaxUnmarshaller implements Unmarshaller<PredictiveScalingConfiguration, StaxUnmarshallerContext> {

    public PredictiveScalingConfiguration unmarshall(StaxUnmarshallerContext context) throws Exception {
        PredictiveScalingConfiguration predictiveScalingConfiguration = new PredictiveScalingConfiguration();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return predictiveScalingConfiguration;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("MetricSpecifications", targetDepth)) {
                    predictiveScalingConfiguration.withMetricSpecifications(new ArrayList<PredictiveScalingMetricSpecification>());
                    continue;
                }

                if (context.testExpression("MetricSpecifications/member", targetDepth)) {
                    predictiveScalingConfiguration.withMetricSpecifications(PredictiveScalingMetricSpecificationStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }

                if (context.testExpression("Mode", targetDepth)) {
                    predictiveScalingConfiguration.setMode(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SchedulingBufferTime", targetDepth)) {
                    predictiveScalingConfiguration.setSchedulingBufferTime(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MaxCapacityBreachBehavior", targetDepth)) {
                    predictiveScalingConfiguration.setMaxCapacityBreachBehavior(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MaxCapacityBuffer", targetDepth)) {
                    predictiveScalingConfiguration.setMaxCapacityBuffer(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return predictiveScalingConfiguration;
                }
            }
        }
    }

    private static PredictiveScalingConfigurationStaxUnmarshaller instance;

    public static PredictiveScalingConfigurationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new PredictiveScalingConfigurationStaxUnmarshaller();
        return instance;
    }
}
