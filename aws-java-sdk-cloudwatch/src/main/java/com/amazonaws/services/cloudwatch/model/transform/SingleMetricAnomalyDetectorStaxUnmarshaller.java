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
package com.amazonaws.services.cloudwatch.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * SingleMetricAnomalyDetector StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SingleMetricAnomalyDetectorStaxUnmarshaller implements Unmarshaller<SingleMetricAnomalyDetector, StaxUnmarshallerContext> {

    public SingleMetricAnomalyDetector unmarshall(StaxUnmarshallerContext context) throws Exception {
        SingleMetricAnomalyDetector singleMetricAnomalyDetector = new SingleMetricAnomalyDetector();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return singleMetricAnomalyDetector;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Namespace", targetDepth)) {
                    singleMetricAnomalyDetector.setNamespace(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MetricName", targetDepth)) {
                    singleMetricAnomalyDetector.setMetricName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Dimensions", targetDepth)) {
                    singleMetricAnomalyDetector.withDimensions(new ArrayList<Dimension>());
                    continue;
                }

                if (context.testExpression("Dimensions/member", targetDepth)) {
                    singleMetricAnomalyDetector.withDimensions(DimensionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Stat", targetDepth)) {
                    singleMetricAnomalyDetector.setStat(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return singleMetricAnomalyDetector;
                }
            }
        }
    }

    private static SingleMetricAnomalyDetectorStaxUnmarshaller instance;

    public static SingleMetricAnomalyDetectorStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new SingleMetricAnomalyDetectorStaxUnmarshaller();
        return instance;
    }
}
