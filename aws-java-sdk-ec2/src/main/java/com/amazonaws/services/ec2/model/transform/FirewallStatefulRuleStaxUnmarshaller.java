/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * FirewallStatefulRule StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FirewallStatefulRuleStaxUnmarshaller implements Unmarshaller<FirewallStatefulRule, StaxUnmarshallerContext> {

    public FirewallStatefulRule unmarshall(StaxUnmarshallerContext context) throws Exception {
        FirewallStatefulRule firewallStatefulRule = new FirewallStatefulRule();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return firewallStatefulRule;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ruleGroupArn", targetDepth)) {
                    firewallStatefulRule.setRuleGroupArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("sourceSet", targetDepth)) {
                    firewallStatefulRule.withSources(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("sourceSet/item", targetDepth)) {
                    firewallStatefulRule.withSources(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("destinationSet", targetDepth)) {
                    firewallStatefulRule.withDestinations(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("destinationSet/item", targetDepth)) {
                    firewallStatefulRule.withDestinations(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("sourcePortSet", targetDepth)) {
                    firewallStatefulRule.withSourcePorts(new ArrayList<PortRange>());
                    continue;
                }

                if (context.testExpression("sourcePortSet/item", targetDepth)) {
                    firewallStatefulRule.withSourcePorts(PortRangeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("destinationPortSet", targetDepth)) {
                    firewallStatefulRule.withDestinationPorts(new ArrayList<PortRange>());
                    continue;
                }

                if (context.testExpression("destinationPortSet/item", targetDepth)) {
                    firewallStatefulRule.withDestinationPorts(PortRangeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("protocol", targetDepth)) {
                    firewallStatefulRule.setProtocol(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ruleAction", targetDepth)) {
                    firewallStatefulRule.setRuleAction(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("direction", targetDepth)) {
                    firewallStatefulRule.setDirection(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return firewallStatefulRule;
                }
            }
        }
    }

    private static FirewallStatefulRuleStaxUnmarshaller instance;

    public static FirewallStatefulRuleStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new FirewallStatefulRuleStaxUnmarshaller();
        return instance;
    }
}
