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

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * UpdateAction StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateActionStaxUnmarshaller implements Unmarshaller<UpdateAction, StaxUnmarshallerContext> {

    public UpdateAction unmarshall(StaxUnmarshallerContext context) throws Exception {
        UpdateAction updateAction = new UpdateAction();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return updateAction;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ReplicationGroupId", targetDepth)) {
                    updateAction.setReplicationGroupId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CacheClusterId", targetDepth)) {
                    updateAction.setCacheClusterId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ServiceUpdateName", targetDepth)) {
                    updateAction.setServiceUpdateName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ServiceUpdateReleaseDate", targetDepth)) {
                    updateAction.setServiceUpdateReleaseDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("ServiceUpdateSeverity", targetDepth)) {
                    updateAction.setServiceUpdateSeverity(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ServiceUpdateStatus", targetDepth)) {
                    updateAction.setServiceUpdateStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ServiceUpdateRecommendedApplyByDate", targetDepth)) {
                    updateAction.setServiceUpdateRecommendedApplyByDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("ServiceUpdateType", targetDepth)) {
                    updateAction.setServiceUpdateType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("UpdateActionAvailableDate", targetDepth)) {
                    updateAction.setUpdateActionAvailableDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("UpdateActionStatus", targetDepth)) {
                    updateAction.setUpdateActionStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NodesUpdated", targetDepth)) {
                    updateAction.setNodesUpdated(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("UpdateActionStatusModifiedDate", targetDepth)) {
                    updateAction.setUpdateActionStatusModifiedDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("SlaMet", targetDepth)) {
                    updateAction.setSlaMet(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NodeGroupUpdateStatus", targetDepth)) {
                    updateAction.withNodeGroupUpdateStatus(new ArrayList<NodeGroupUpdateStatus>());
                    continue;
                }

                if (context.testExpression("NodeGroupUpdateStatus/NodeGroupUpdateStatus", targetDepth)) {
                    updateAction.withNodeGroupUpdateStatus(NodeGroupUpdateStatusStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CacheNodeUpdateStatus", targetDepth)) {
                    updateAction.withCacheNodeUpdateStatus(new ArrayList<CacheNodeUpdateStatus>());
                    continue;
                }

                if (context.testExpression("CacheNodeUpdateStatus/CacheNodeUpdateStatus", targetDepth)) {
                    updateAction.withCacheNodeUpdateStatus(CacheNodeUpdateStatusStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EstimatedUpdateTime", targetDepth)) {
                    updateAction.setEstimatedUpdateTime(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Engine", targetDepth)) {
                    updateAction.setEngine(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return updateAction;
                }
            }
        }
    }

    private static UpdateActionStaxUnmarshaller instance;

    public static UpdateActionStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateActionStaxUnmarshaller();
        return instance;
    }
}
