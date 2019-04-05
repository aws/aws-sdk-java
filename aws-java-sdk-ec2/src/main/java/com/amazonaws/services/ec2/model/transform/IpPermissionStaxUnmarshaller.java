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
 * IpPermission StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpPermissionStaxUnmarshaller implements Unmarshaller<IpPermission, StaxUnmarshallerContext> {

    public IpPermission unmarshall(StaxUnmarshallerContext context) throws Exception {
        IpPermission ipPermission = new IpPermission();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return ipPermission;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("fromPort", targetDepth)) {
                    ipPermission.setFromPort(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipProtocol", targetDepth)) {
                    ipPermission.setIpProtocol(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipv6Ranges", targetDepth)) {
                    ipPermission.withIpv6Ranges(new ArrayList<Ipv6Range>());
                    continue;
                }

                if (context.testExpression("ipv6Ranges/item", targetDepth)) {
                    ipPermission.withIpv6Ranges(Ipv6RangeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("prefixListIds", targetDepth)) {
                    ipPermission.withPrefixListIds(new ArrayList<PrefixListId>());
                    continue;
                }

                if (context.testExpression("prefixListIds/item", targetDepth)) {
                    ipPermission.withPrefixListIds(PrefixListIdStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("toPort", targetDepth)) {
                    ipPermission.setToPort(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("groups", targetDepth)) {
                    ipPermission.withUserIdGroupPairs(new ArrayList<UserIdGroupPair>());
                    continue;
                }

                if (context.testExpression("groups/item", targetDepth)) {
                    ipPermission.withUserIdGroupPairs(UserIdGroupPairStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipRanges", targetDepth)) {
                    ipPermission.withIpv4Ranges(new ArrayList<IpRange>());
                    continue;
                }

                if (context.testExpression("ipRanges/item", targetDepth)) {
                    ipPermission.withIpv4Ranges(IpRangeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return ipPermission;
                }
            }
        }
    }

    private static IpPermissionStaxUnmarshaller instance;

    public static IpPermissionStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new IpPermissionStaxUnmarshaller();
        return instance;
    }
}
