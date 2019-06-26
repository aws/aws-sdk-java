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
package com.amazonaws.services.ec2.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * TrafficMirrorFilter StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrafficMirrorFilterStaxUnmarshaller implements Unmarshaller<TrafficMirrorFilter, StaxUnmarshallerContext> {

    public TrafficMirrorFilter unmarshall(StaxUnmarshallerContext context) throws Exception {
        TrafficMirrorFilter trafficMirrorFilter = new TrafficMirrorFilter();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return trafficMirrorFilter;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("trafficMirrorFilterId", targetDepth)) {
                    trafficMirrorFilter.setTrafficMirrorFilterId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ingressFilterRuleSet", targetDepth)) {
                    trafficMirrorFilter.withIngressFilterRules(new ArrayList<TrafficMirrorFilterRule>());
                    continue;
                }

                if (context.testExpression("ingressFilterRuleSet/item", targetDepth)) {
                    trafficMirrorFilter.withIngressFilterRules(TrafficMirrorFilterRuleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("egressFilterRuleSet", targetDepth)) {
                    trafficMirrorFilter.withEgressFilterRules(new ArrayList<TrafficMirrorFilterRule>());
                    continue;
                }

                if (context.testExpression("egressFilterRuleSet/item", targetDepth)) {
                    trafficMirrorFilter.withEgressFilterRules(TrafficMirrorFilterRuleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("networkServiceSet", targetDepth)) {
                    trafficMirrorFilter.withNetworkServices(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("networkServiceSet/item", targetDepth)) {
                    trafficMirrorFilter.withNetworkServices(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("description", targetDepth)) {
                    trafficMirrorFilter.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tagSet", targetDepth)) {
                    trafficMirrorFilter.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("tagSet/item", targetDepth)) {
                    trafficMirrorFilter.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return trafficMirrorFilter;
                }
            }
        }
    }

    private static TrafficMirrorFilterStaxUnmarshaller instance;

    public static TrafficMirrorFilterStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new TrafficMirrorFilterStaxUnmarshaller();
        return instance;
    }
}
