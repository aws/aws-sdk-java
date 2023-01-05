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
 * Ipam StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpamStaxUnmarshaller implements Unmarshaller<Ipam, StaxUnmarshallerContext> {

    public Ipam unmarshall(StaxUnmarshallerContext context) throws Exception {
        Ipam ipam = new Ipam();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return ipam;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ownerId", targetDepth)) {
                    ipam.setOwnerId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipamId", targetDepth)) {
                    ipam.setIpamId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipamArn", targetDepth)) {
                    ipam.setIpamArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipamRegion", targetDepth)) {
                    ipam.setIpamRegion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("publicDefaultScopeId", targetDepth)) {
                    ipam.setPublicDefaultScopeId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("privateDefaultScopeId", targetDepth)) {
                    ipam.setPrivateDefaultScopeId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("scopeCount", targetDepth)) {
                    ipam.setScopeCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("description", targetDepth)) {
                    ipam.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("operatingRegionSet", targetDepth)) {
                    ipam.withOperatingRegions(new ArrayList<IpamOperatingRegion>());
                    continue;
                }

                if (context.testExpression("operatingRegionSet/item", targetDepth)) {
                    ipam.withOperatingRegions(IpamOperatingRegionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("state", targetDepth)) {
                    ipam.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tagSet", targetDepth)) {
                    ipam.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("tagSet/item", targetDepth)) {
                    ipam.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return ipam;
                }
            }
        }
    }

    private static IpamStaxUnmarshaller instance;

    public static IpamStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new IpamStaxUnmarshaller();
        return instance;
    }
}
