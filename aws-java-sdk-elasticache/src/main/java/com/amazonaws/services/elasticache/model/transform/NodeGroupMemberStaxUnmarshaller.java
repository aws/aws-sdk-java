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
package com.amazonaws.services.elasticache.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * NodeGroupMember StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodeGroupMemberStaxUnmarshaller implements Unmarshaller<NodeGroupMember, StaxUnmarshallerContext> {

    public NodeGroupMember unmarshall(StaxUnmarshallerContext context) throws Exception {
        NodeGroupMember nodeGroupMember = new NodeGroupMember();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return nodeGroupMember;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("CacheClusterId", targetDepth)) {
                    nodeGroupMember.setCacheClusterId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CacheNodeId", targetDepth)) {
                    nodeGroupMember.setCacheNodeId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ReadEndpoint", targetDepth)) {
                    nodeGroupMember.setReadEndpoint(EndpointStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PreferredAvailabilityZone", targetDepth)) {
                    nodeGroupMember.setPreferredAvailabilityZone(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CurrentRole", targetDepth)) {
                    nodeGroupMember.setCurrentRole(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return nodeGroupMember;
                }
            }
        }
    }

    private static NodeGroupMemberStaxUnmarshaller instance;

    public static NodeGroupMemberStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new NodeGroupMemberStaxUnmarshaller();
        return instance;
    }
}
