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

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * TrafficMirrorFilterRule StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrafficMirrorFilterRuleStaxUnmarshaller implements Unmarshaller<TrafficMirrorFilterRule, StaxUnmarshallerContext> {

    public TrafficMirrorFilterRule unmarshall(StaxUnmarshallerContext context) throws Exception {
        TrafficMirrorFilterRule trafficMirrorFilterRule = new TrafficMirrorFilterRule();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return trafficMirrorFilterRule;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("trafficMirrorFilterRuleId", targetDepth)) {
                    trafficMirrorFilterRule.setTrafficMirrorFilterRuleId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("trafficMirrorFilterId", targetDepth)) {
                    trafficMirrorFilterRule.setTrafficMirrorFilterId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("trafficDirection", targetDepth)) {
                    trafficMirrorFilterRule.setTrafficDirection(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ruleNumber", targetDepth)) {
                    trafficMirrorFilterRule.setRuleNumber(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ruleAction", targetDepth)) {
                    trafficMirrorFilterRule.setRuleAction(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("protocol", targetDepth)) {
                    trafficMirrorFilterRule.setProtocol(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("destinationPortRange", targetDepth)) {
                    trafficMirrorFilterRule.setDestinationPortRange(TrafficMirrorPortRangeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("sourcePortRange", targetDepth)) {
                    trafficMirrorFilterRule.setSourcePortRange(TrafficMirrorPortRangeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("destinationCidrBlock", targetDepth)) {
                    trafficMirrorFilterRule.setDestinationCidrBlock(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("sourceCidrBlock", targetDepth)) {
                    trafficMirrorFilterRule.setSourceCidrBlock(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("description", targetDepth)) {
                    trafficMirrorFilterRule.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return trafficMirrorFilterRule;
                }
            }
        }
    }

    private static TrafficMirrorFilterRuleStaxUnmarshaller instance;

    public static TrafficMirrorFilterRuleStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new TrafficMirrorFilterRuleStaxUnmarshaller();
        return instance;
    }
}
