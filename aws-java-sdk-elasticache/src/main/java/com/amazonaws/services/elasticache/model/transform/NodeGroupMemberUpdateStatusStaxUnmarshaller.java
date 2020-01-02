/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * NodeGroupMemberUpdateStatus StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodeGroupMemberUpdateStatusStaxUnmarshaller implements Unmarshaller<NodeGroupMemberUpdateStatus, StaxUnmarshallerContext> {

    public NodeGroupMemberUpdateStatus unmarshall(StaxUnmarshallerContext context) throws Exception {
        NodeGroupMemberUpdateStatus nodeGroupMemberUpdateStatus = new NodeGroupMemberUpdateStatus();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return nodeGroupMemberUpdateStatus;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("CacheClusterId", targetDepth)) {
                    nodeGroupMemberUpdateStatus.setCacheClusterId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CacheNodeId", targetDepth)) {
                    nodeGroupMemberUpdateStatus.setCacheNodeId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NodeUpdateStatus", targetDepth)) {
                    nodeGroupMemberUpdateStatus.setNodeUpdateStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NodeDeletionDate", targetDepth)) {
                    nodeGroupMemberUpdateStatus.setNodeDeletionDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("NodeUpdateStartDate", targetDepth)) {
                    nodeGroupMemberUpdateStatus.setNodeUpdateStartDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("NodeUpdateEndDate", targetDepth)) {
                    nodeGroupMemberUpdateStatus.setNodeUpdateEndDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("NodeUpdateInitiatedBy", targetDepth)) {
                    nodeGroupMemberUpdateStatus.setNodeUpdateInitiatedBy(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NodeUpdateInitiatedDate", targetDepth)) {
                    nodeGroupMemberUpdateStatus.setNodeUpdateInitiatedDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("NodeUpdateStatusModifiedDate", targetDepth)) {
                    nodeGroupMemberUpdateStatus.setNodeUpdateStatusModifiedDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return nodeGroupMemberUpdateStatus;
                }
            }
        }
    }

    private static NodeGroupMemberUpdateStatusStaxUnmarshaller instance;

    public static NodeGroupMemberUpdateStatusStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new NodeGroupMemberUpdateStatusStaxUnmarshaller();
        return instance;
    }
}
