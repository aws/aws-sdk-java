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
 * DescribeAutoScalingGroupsResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAutoScalingGroupsResultStaxUnmarshaller implements Unmarshaller<DescribeAutoScalingGroupsResult, StaxUnmarshallerContext> {

    public DescribeAutoScalingGroupsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeAutoScalingGroupsResult describeAutoScalingGroupsResult = new DescribeAutoScalingGroupsResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeAutoScalingGroupsResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("AutoScalingGroups", targetDepth)) {
                    describeAutoScalingGroupsResult.withAutoScalingGroups(new ArrayList<AutoScalingGroup>());
                    continue;
                }

                if (context.testExpression("AutoScalingGroups/member", targetDepth)) {
                    describeAutoScalingGroupsResult.withAutoScalingGroups(AutoScalingGroupStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NextToken", targetDepth)) {
                    describeAutoScalingGroupsResult.setNextToken(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeAutoScalingGroupsResult;
                }
            }
        }
    }

    private static DescribeAutoScalingGroupsResultStaxUnmarshaller instance;

    public static DescribeAutoScalingGroupsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeAutoScalingGroupsResultStaxUnmarshaller();
        return instance;
    }
}
