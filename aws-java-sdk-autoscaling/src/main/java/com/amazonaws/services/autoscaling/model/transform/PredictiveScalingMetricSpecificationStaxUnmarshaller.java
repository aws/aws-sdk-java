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

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * PredictiveScalingMetricSpecification StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PredictiveScalingMetricSpecificationStaxUnmarshaller implements Unmarshaller<PredictiveScalingMetricSpecification, StaxUnmarshallerContext> {

    public PredictiveScalingMetricSpecification unmarshall(StaxUnmarshallerContext context) throws Exception {
        PredictiveScalingMetricSpecification predictiveScalingMetricSpecification = new PredictiveScalingMetricSpecification();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return predictiveScalingMetricSpecification;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("TargetValue", targetDepth)) {
                    predictiveScalingMetricSpecification.setTargetValue(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PredefinedMetricPairSpecification", targetDepth)) {
                    predictiveScalingMetricSpecification.setPredefinedMetricPairSpecification(PredictiveScalingPredefinedMetricPairStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PredefinedScalingMetricSpecification", targetDepth)) {
                    predictiveScalingMetricSpecification.setPredefinedScalingMetricSpecification(PredictiveScalingPredefinedScalingMetricStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PredefinedLoadMetricSpecification", targetDepth)) {
                    predictiveScalingMetricSpecification.setPredefinedLoadMetricSpecification(PredictiveScalingPredefinedLoadMetricStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return predictiveScalingMetricSpecification;
                }
            }
        }
    }

    private static PredictiveScalingMetricSpecificationStaxUnmarshaller instance;

    public static PredictiveScalingMetricSpecificationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new PredictiveScalingMetricSpecificationStaxUnmarshaller();
        return instance;
    }
}
