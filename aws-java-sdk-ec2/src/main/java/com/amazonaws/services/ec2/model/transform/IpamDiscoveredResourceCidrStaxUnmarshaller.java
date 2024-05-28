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
 * IpamDiscoveredResourceCidr StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpamDiscoveredResourceCidrStaxUnmarshaller implements Unmarshaller<IpamDiscoveredResourceCidr, StaxUnmarshallerContext> {

    public IpamDiscoveredResourceCidr unmarshall(StaxUnmarshallerContext context) throws Exception {
        IpamDiscoveredResourceCidr ipamDiscoveredResourceCidr = new IpamDiscoveredResourceCidr();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return ipamDiscoveredResourceCidr;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ipamResourceDiscoveryId", targetDepth)) {
                    ipamDiscoveredResourceCidr.setIpamResourceDiscoveryId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("resourceRegion", targetDepth)) {
                    ipamDiscoveredResourceCidr.setResourceRegion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("resourceId", targetDepth)) {
                    ipamDiscoveredResourceCidr.setResourceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("resourceOwnerId", targetDepth)) {
                    ipamDiscoveredResourceCidr.setResourceOwnerId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("resourceCidr", targetDepth)) {
                    ipamDiscoveredResourceCidr.setResourceCidr(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("resourceType", targetDepth)) {
                    ipamDiscoveredResourceCidr.setResourceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("resourceTagSet", targetDepth)) {
                    ipamDiscoveredResourceCidr.withResourceTags(new ArrayList<IpamResourceTag>());
                    continue;
                }

                if (context.testExpression("resourceTagSet/item", targetDepth)) {
                    ipamDiscoveredResourceCidr.withResourceTags(IpamResourceTagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipUsage", targetDepth)) {
                    ipamDiscoveredResourceCidr.setIpUsage(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("vpcId", targetDepth)) {
                    ipamDiscoveredResourceCidr.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("sampleTime", targetDepth)) {
                    ipamDiscoveredResourceCidr.setSampleTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return ipamDiscoveredResourceCidr;
                }
            }
        }
    }

    private static IpamDiscoveredResourceCidrStaxUnmarshaller instance;

    public static IpamDiscoveredResourceCidrStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new IpamDiscoveredResourceCidrStaxUnmarshaller();
        return instance;
    }
}
