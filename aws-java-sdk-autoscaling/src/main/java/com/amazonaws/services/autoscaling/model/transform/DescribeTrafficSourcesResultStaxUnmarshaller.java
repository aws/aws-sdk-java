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
package com.amazonaws.services.autoscaling.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DescribeTrafficSourcesResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTrafficSourcesResultStaxUnmarshaller implements Unmarshaller<DescribeTrafficSourcesResult, StaxUnmarshallerContext> {

    public DescribeTrafficSourcesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeTrafficSourcesResult describeTrafficSourcesResult = new DescribeTrafficSourcesResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeTrafficSourcesResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("TrafficSources", targetDepth)) {
                    describeTrafficSourcesResult.withTrafficSources(new ArrayList<TrafficSourceState>());
                    continue;
                }

                if (context.testExpression("TrafficSources/member", targetDepth)) {
                    describeTrafficSourcesResult.withTrafficSources(TrafficSourceStateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NextToken", targetDepth)) {
                    describeTrafficSourcesResult.setNextToken(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeTrafficSourcesResult;
                }
            }
        }
    }

    private static DescribeTrafficSourcesResultStaxUnmarshaller instance;

    public static DescribeTrafficSourcesResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeTrafficSourcesResultStaxUnmarshaller();
        return instance;
    }
}
