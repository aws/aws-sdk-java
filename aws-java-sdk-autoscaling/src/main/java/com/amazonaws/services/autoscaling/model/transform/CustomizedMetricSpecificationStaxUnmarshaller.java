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

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * CustomizedMetricSpecification StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomizedMetricSpecificationStaxUnmarshaller implements Unmarshaller<CustomizedMetricSpecification, StaxUnmarshallerContext> {

    public CustomizedMetricSpecification unmarshall(StaxUnmarshallerContext context) throws Exception {
        CustomizedMetricSpecification customizedMetricSpecification = new CustomizedMetricSpecification();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return customizedMetricSpecification;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("MetricName", targetDepth)) {
                    customizedMetricSpecification.setMetricName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Namespace", targetDepth)) {
                    customizedMetricSpecification.setNamespace(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Dimensions", targetDepth)) {
                    customizedMetricSpecification.withDimensions(new ArrayList<MetricDimension>());
                    continue;
                }

                if (context.testExpression("Dimensions/member", targetDepth)) {
                    customizedMetricSpecification.withDimensions(MetricDimensionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Statistic", targetDepth)) {
                    customizedMetricSpecification.setStatistic(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Unit", targetDepth)) {
                    customizedMetricSpecification.setUnit(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return customizedMetricSpecification;
                }
            }
        }
    }

    private static CustomizedMetricSpecificationStaxUnmarshaller instance;

    public static CustomizedMetricSpecificationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CustomizedMetricSpecificationStaxUnmarshaller();
        return instance;
    }
}
