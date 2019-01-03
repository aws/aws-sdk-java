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
package com.amazonaws.services.cloudwatch.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * MetricDataResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricDataResultStaxUnmarshaller implements Unmarshaller<MetricDataResult, StaxUnmarshallerContext> {

    public MetricDataResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        MetricDataResult metricDataResult = new MetricDataResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return metricDataResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Id", targetDepth)) {
                    metricDataResult.setId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Label", targetDepth)) {
                    metricDataResult.setLabel(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Timestamps", targetDepth)) {
                    metricDataResult.withTimestamps(new ArrayList<java.util.Date>());
                    continue;
                }

                if (context.testExpression("Timestamps/member", targetDepth)) {
                    metricDataResult.withTimestamps(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("Values", targetDepth)) {
                    metricDataResult.withValues(new ArrayList<Double>());
                    continue;
                }

                if (context.testExpression("Values/member", targetDepth)) {
                    metricDataResult.withValues(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StatusCode", targetDepth)) {
                    metricDataResult.setStatusCode(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Messages", targetDepth)) {
                    metricDataResult.withMessages(new ArrayList<MessageData>());
                    continue;
                }

                if (context.testExpression("Messages/member", targetDepth)) {
                    metricDataResult.withMessages(MessageDataStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return metricDataResult;
                }
            }
        }
    }

    private static MetricDataResultStaxUnmarshaller instance;

    public static MetricDataResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new MetricDataResultStaxUnmarshaller();
        return instance;
    }
}
