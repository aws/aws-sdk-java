/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DescribeTrafficMirrorTargetsResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTrafficMirrorTargetsResultStaxUnmarshaller implements Unmarshaller<DescribeTrafficMirrorTargetsResult, StaxUnmarshallerContext> {

    public DescribeTrafficMirrorTargetsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeTrafficMirrorTargetsResult describeTrafficMirrorTargetsResult = new DescribeTrafficMirrorTargetsResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeTrafficMirrorTargetsResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("trafficMirrorTargetSet", targetDepth)) {
                    describeTrafficMirrorTargetsResult.withTrafficMirrorTargets(new ArrayList<TrafficMirrorTarget>());
                    continue;
                }

                if (context.testExpression("trafficMirrorTargetSet/item", targetDepth)) {
                    describeTrafficMirrorTargetsResult.withTrafficMirrorTargets(TrafficMirrorTargetStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("nextToken", targetDepth)) {
                    describeTrafficMirrorTargetsResult.setNextToken(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeTrafficMirrorTargetsResult;
                }
            }
        }
    }

    private static DescribeTrafficMirrorTargetsResultStaxUnmarshaller instance;

    public static DescribeTrafficMirrorTargetsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeTrafficMirrorTargetsResultStaxUnmarshaller();
        return instance;
    }
}
