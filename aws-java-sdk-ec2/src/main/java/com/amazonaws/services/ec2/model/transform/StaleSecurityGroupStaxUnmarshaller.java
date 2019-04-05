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
 * StaleSecurityGroup StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StaleSecurityGroupStaxUnmarshaller implements Unmarshaller<StaleSecurityGroup, StaxUnmarshallerContext> {

    public StaleSecurityGroup unmarshall(StaxUnmarshallerContext context) throws Exception {
        StaleSecurityGroup staleSecurityGroup = new StaleSecurityGroup();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return staleSecurityGroup;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("description", targetDepth)) {
                    staleSecurityGroup.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("groupId", targetDepth)) {
                    staleSecurityGroup.setGroupId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("groupName", targetDepth)) {
                    staleSecurityGroup.setGroupName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("staleIpPermissions", targetDepth)) {
                    staleSecurityGroup.withStaleIpPermissions(new ArrayList<StaleIpPermission>());
                    continue;
                }

                if (context.testExpression("staleIpPermissions/item", targetDepth)) {
                    staleSecurityGroup.withStaleIpPermissions(StaleIpPermissionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("staleIpPermissionsEgress", targetDepth)) {
                    staleSecurityGroup.withStaleIpPermissionsEgress(new ArrayList<StaleIpPermission>());
                    continue;
                }

                if (context.testExpression("staleIpPermissionsEgress/item", targetDepth)) {
                    staleSecurityGroup.withStaleIpPermissionsEgress(StaleIpPermissionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("vpcId", targetDepth)) {
                    staleSecurityGroup.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return staleSecurityGroup;
                }
            }
        }
    }

    private static StaleSecurityGroupStaxUnmarshaller instance;

    public static StaleSecurityGroupStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new StaleSecurityGroupStaxUnmarshaller();
        return instance;
    }
}
