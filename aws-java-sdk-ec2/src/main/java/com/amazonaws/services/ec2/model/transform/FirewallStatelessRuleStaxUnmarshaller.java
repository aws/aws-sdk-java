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
 * FirewallStatelessRule StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FirewallStatelessRuleStaxUnmarshaller implements Unmarshaller<FirewallStatelessRule, StaxUnmarshallerContext> {

    public FirewallStatelessRule unmarshall(StaxUnmarshallerContext context) throws Exception {
        FirewallStatelessRule firewallStatelessRule = new FirewallStatelessRule();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return firewallStatelessRule;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ruleGroupArn", targetDepth)) {
                    firewallStatelessRule.setRuleGroupArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("sourceSet", targetDepth)) {
                    firewallStatelessRule.withSources(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("sourceSet/item", targetDepth)) {
                    firewallStatelessRule.withSources(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("destinationSet", targetDepth)) {
                    firewallStatelessRule.withDestinations(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("destinationSet/item", targetDepth)) {
                    firewallStatelessRule.withDestinations(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("sourcePortSet", targetDepth)) {
                    firewallStatelessRule.withSourcePorts(new ArrayList<PortRange>());
                    continue;
                }

                if (context.testExpression("sourcePortSet/item", targetDepth)) {
                    firewallStatelessRule.withSourcePorts(PortRangeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("destinationPortSet", targetDepth)) {
                    firewallStatelessRule.withDestinationPorts(new ArrayList<PortRange>());
                    continue;
                }

                if (context.testExpression("destinationPortSet/item", targetDepth)) {
                    firewallStatelessRule.withDestinationPorts(PortRangeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("protocolSet", targetDepth)) {
                    firewallStatelessRule.withProtocols(new ArrayList<Integer>());
                    continue;
                }

                if (context.testExpression("protocolSet/item", targetDepth)) {
                    firewallStatelessRule.withProtocols(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ruleAction", targetDepth)) {
                    firewallStatelessRule.setRuleAction(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("priority", targetDepth)) {
                    firewallStatelessRule.setPriority(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return firewallStatelessRule;
                }
            }
        }
    }

    private static FirewallStatelessRuleStaxUnmarshaller instance;

    public static FirewallStatelessRuleStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new FirewallStatelessRuleStaxUnmarshaller();
        return instance;
    }
}
