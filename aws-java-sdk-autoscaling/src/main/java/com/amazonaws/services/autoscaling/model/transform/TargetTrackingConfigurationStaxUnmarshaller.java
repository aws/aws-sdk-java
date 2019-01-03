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
 * TargetTrackingConfiguration StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetTrackingConfigurationStaxUnmarshaller implements Unmarshaller<TargetTrackingConfiguration, StaxUnmarshallerContext> {

    public TargetTrackingConfiguration unmarshall(StaxUnmarshallerContext context) throws Exception {
        TargetTrackingConfiguration targetTrackingConfiguration = new TargetTrackingConfiguration();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return targetTrackingConfiguration;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("PredefinedMetricSpecification", targetDepth)) {
                    targetTrackingConfiguration.setPredefinedMetricSpecification(PredefinedMetricSpecificationStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("CustomizedMetricSpecification", targetDepth)) {
                    targetTrackingConfiguration.setCustomizedMetricSpecification(CustomizedMetricSpecificationStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("TargetValue", targetDepth)) {
                    targetTrackingConfiguration.setTargetValue(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DisableScaleIn", targetDepth)) {
                    targetTrackingConfiguration.setDisableScaleIn(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return targetTrackingConfiguration;
                }
            }
        }
    }

    private static TargetTrackingConfigurationStaxUnmarshaller instance;

    public static TargetTrackingConfigurationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new TargetTrackingConfigurationStaxUnmarshaller();
        return instance;
    }
}
