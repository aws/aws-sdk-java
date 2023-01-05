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
package com.amazonaws.services.ec2.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * VerifiedAccessEndpointLoadBalancerOptions StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerifiedAccessEndpointLoadBalancerOptionsStaxUnmarshaller implements
        Unmarshaller<VerifiedAccessEndpointLoadBalancerOptions, StaxUnmarshallerContext> {

    public VerifiedAccessEndpointLoadBalancerOptions unmarshall(StaxUnmarshallerContext context) throws Exception {
        VerifiedAccessEndpointLoadBalancerOptions verifiedAccessEndpointLoadBalancerOptions = new VerifiedAccessEndpointLoadBalancerOptions();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return verifiedAccessEndpointLoadBalancerOptions;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("protocol", targetDepth)) {
                    verifiedAccessEndpointLoadBalancerOptions.setProtocol(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("port", targetDepth)) {
                    verifiedAccessEndpointLoadBalancerOptions.setPort(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("loadBalancerArn", targetDepth)) {
                    verifiedAccessEndpointLoadBalancerOptions.setLoadBalancerArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("subnetIdSet", targetDepth)) {
                    verifiedAccessEndpointLoadBalancerOptions.withSubnetIds(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("subnetIdSet/item", targetDepth)) {
                    verifiedAccessEndpointLoadBalancerOptions.withSubnetIds(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return verifiedAccessEndpointLoadBalancerOptions;
                }
            }
        }
    }

    private static VerifiedAccessEndpointLoadBalancerOptionsStaxUnmarshaller instance;

    public static VerifiedAccessEndpointLoadBalancerOptionsStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new VerifiedAccessEndpointLoadBalancerOptionsStaxUnmarshaller();
        return instance;
    }
}
