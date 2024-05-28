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
 * IpamResourceDiscovery StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpamResourceDiscoveryStaxUnmarshaller implements Unmarshaller<IpamResourceDiscovery, StaxUnmarshallerContext> {

    public IpamResourceDiscovery unmarshall(StaxUnmarshallerContext context) throws Exception {
        IpamResourceDiscovery ipamResourceDiscovery = new IpamResourceDiscovery();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return ipamResourceDiscovery;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ownerId", targetDepth)) {
                    ipamResourceDiscovery.setOwnerId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipamResourceDiscoveryId", targetDepth)) {
                    ipamResourceDiscovery.setIpamResourceDiscoveryId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipamResourceDiscoveryArn", targetDepth)) {
                    ipamResourceDiscovery.setIpamResourceDiscoveryArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipamResourceDiscoveryRegion", targetDepth)) {
                    ipamResourceDiscovery.setIpamResourceDiscoveryRegion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("description", targetDepth)) {
                    ipamResourceDiscovery.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("operatingRegionSet", targetDepth)) {
                    ipamResourceDiscovery.withOperatingRegions(new ArrayList<IpamOperatingRegion>());
                    continue;
                }

                if (context.testExpression("operatingRegionSet/item", targetDepth)) {
                    ipamResourceDiscovery.withOperatingRegions(IpamOperatingRegionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("isDefault", targetDepth)) {
                    ipamResourceDiscovery.setIsDefault(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("state", targetDepth)) {
                    ipamResourceDiscovery.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tagSet", targetDepth)) {
                    ipamResourceDiscovery.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("tagSet/item", targetDepth)) {
                    ipamResourceDiscovery.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return ipamResourceDiscovery;
                }
            }
        }
    }

    private static IpamResourceDiscoveryStaxUnmarshaller instance;

    public static IpamResourceDiscoveryStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new IpamResourceDiscoveryStaxUnmarshaller();
        return instance;
    }
}
