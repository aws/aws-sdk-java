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
 * StaleIpPermission StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StaleIpPermissionStaxUnmarshaller implements Unmarshaller<StaleIpPermission, StaxUnmarshallerContext> {

    public StaleIpPermission unmarshall(StaxUnmarshallerContext context) throws Exception {
        StaleIpPermission staleIpPermission = new StaleIpPermission();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return staleIpPermission;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("fromPort", targetDepth)) {
                    staleIpPermission.setFromPort(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipProtocol", targetDepth)) {
                    staleIpPermission.setIpProtocol(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipRanges", targetDepth)) {
                    staleIpPermission.withIpRanges(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("ipRanges/item", targetDepth)) {
                    staleIpPermission.withIpRanges(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("prefixListIds", targetDepth)) {
                    staleIpPermission.withPrefixListIds(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("prefixListIds/item", targetDepth)) {
                    staleIpPermission.withPrefixListIds(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("toPort", targetDepth)) {
                    staleIpPermission.setToPort(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("groups", targetDepth)) {
                    staleIpPermission.withUserIdGroupPairs(new ArrayList<UserIdGroupPair>());
                    continue;
                }

                if (context.testExpression("groups/item", targetDepth)) {
                    staleIpPermission.withUserIdGroupPairs(UserIdGroupPairStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return staleIpPermission;
                }
            }
        }
    }

    private static StaleIpPermissionStaxUnmarshaller instance;

    public static StaleIpPermissionStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new StaleIpPermissionStaxUnmarshaller();
        return instance;
    }
}
