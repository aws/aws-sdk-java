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
package com.amazonaws.services.simpleemail.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DescribeConfigurationSetResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConfigurationSetResultStaxUnmarshaller implements Unmarshaller<DescribeConfigurationSetResult, StaxUnmarshallerContext> {

    public DescribeConfigurationSetResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeConfigurationSetResult describeConfigurationSetResult = new DescribeConfigurationSetResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeConfigurationSetResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ConfigurationSet", targetDepth)) {
                    describeConfigurationSetResult.setConfigurationSet(ConfigurationSetStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EventDestinations", targetDepth)) {
                    describeConfigurationSetResult.withEventDestinations(new ArrayList<EventDestination>());
                    continue;
                }

                if (context.testExpression("EventDestinations/member", targetDepth)) {
                    describeConfigurationSetResult.withEventDestinations(EventDestinationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TrackingOptions", targetDepth)) {
                    describeConfigurationSetResult.setTrackingOptions(TrackingOptionsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ReputationOptions", targetDepth)) {
                    describeConfigurationSetResult.setReputationOptions(ReputationOptionsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeConfigurationSetResult;
                }
            }
        }
    }

    private static DescribeConfigurationSetResultStaxUnmarshaller instance;

    public static DescribeConfigurationSetResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeConfigurationSetResultStaxUnmarshaller();
        return instance;
    }
}
