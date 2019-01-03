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

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * Snapshot StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnapshotStaxUnmarshaller implements Unmarshaller<Snapshot, StaxUnmarshallerContext> {

    public Snapshot unmarshall(StaxUnmarshallerContext context) throws Exception {
        Snapshot snapshot = new Snapshot();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 3;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return snapshot;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("SnapshotName", targetDepth)) {
                    snapshot.setSnapshotName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ReplicationGroupId", targetDepth)) {
                    snapshot.setReplicationGroupId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ReplicationGroupDescription", targetDepth)) {
                    snapshot.setReplicationGroupDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CacheClusterId", targetDepth)) {
                    snapshot.setCacheClusterId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SnapshotStatus", targetDepth)) {
                    snapshot.setSnapshotStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SnapshotSource", targetDepth)) {
                    snapshot.setSnapshotSource(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CacheNodeType", targetDepth)) {
                    snapshot.setCacheNodeType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Engine", targetDepth)) {
                    snapshot.setEngine(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EngineVersion", targetDepth)) {
                    snapshot.setEngineVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NumCacheNodes", targetDepth)) {
                    snapshot.setNumCacheNodes(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PreferredAvailabilityZone", targetDepth)) {
                    snapshot.setPreferredAvailabilityZone(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CacheClusterCreateTime", targetDepth)) {
                    snapshot.setCacheClusterCreateTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("PreferredMaintenanceWindow", targetDepth)) {
                    snapshot.setPreferredMaintenanceWindow(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TopicArn", targetDepth)) {
                    snapshot.setTopicArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Port", targetDepth)) {
                    snapshot.setPort(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CacheParameterGroupName", targetDepth)) {
                    snapshot.setCacheParameterGroupName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CacheSubnetGroupName", targetDepth)) {
                    snapshot.setCacheSubnetGroupName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("VpcId", targetDepth)) {
                    snapshot.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AutoMinorVersionUpgrade", targetDepth)) {
                    snapshot.setAutoMinorVersionUpgrade(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SnapshotRetentionLimit", targetDepth)) {
                    snapshot.setSnapshotRetentionLimit(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SnapshotWindow", targetDepth)) {
                    snapshot.setSnapshotWindow(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NumNodeGroups", targetDepth)) {
                    snapshot.setNumNodeGroups(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AutomaticFailover", targetDepth)) {
                    snapshot.setAutomaticFailover(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NodeSnapshots", targetDepth)) {
                    snapshot.withNodeSnapshots(new ArrayList<NodeSnapshot>());
                    continue;
                }

                if (context.testExpression("NodeSnapshots/NodeSnapshot", targetDepth)) {
                    snapshot.withNodeSnapshots(NodeSnapshotStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return snapshot;
                }
            }
        }
    }

    private static SnapshotStaxUnmarshaller instance;

    public static SnapshotStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new SnapshotStaxUnmarshaller();
        return instance;
    }
}
