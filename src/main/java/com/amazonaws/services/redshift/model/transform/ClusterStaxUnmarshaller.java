/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.redshift.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * Cluster StAX Unmarshaller
 */
public class ClusterStaxUnmarshaller implements Unmarshaller<Cluster, StaxUnmarshallerContext> {

    public Cluster unmarshall(StaxUnmarshallerContext context) throws Exception {
        Cluster cluster = new Cluster();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        
        if (context.isStartOfDocument()) targetDepth += 2;
        

        if (context.isStartOfDocument()) targetDepth++;
        

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return cluster;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("ClusterIdentifier", targetDepth)) {
                    cluster.setClusterIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("NodeType", targetDepth)) {
                    cluster.setNodeType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ClusterStatus", targetDepth)) {
                    cluster.setClusterStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ModifyStatus", targetDepth)) {
                    cluster.setModifyStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("MasterUsername", targetDepth)) {
                    cluster.setMasterUsername(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DBName", targetDepth)) {
                    cluster.setDBName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Endpoint", targetDepth)) {
                    cluster.setEndpoint(EndpointStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ClusterCreateTime", targetDepth)) {
                    cluster.setClusterCreateTime(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("AutomatedSnapshotRetentionPeriod", targetDepth)) {
                    cluster.setAutomatedSnapshotRetentionPeriod(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ClusterSecurityGroups/ClusterSecurityGroup", targetDepth)) {
                    cluster.getClusterSecurityGroups().add(ClusterSecurityGroupMembershipStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("VpcSecurityGroups/VpcSecurityGroup", targetDepth)) {
                    cluster.getVpcSecurityGroups().add(VpcSecurityGroupMembershipStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ClusterParameterGroups/ClusterParameterGroup", targetDepth)) {
                    cluster.getClusterParameterGroups().add(ClusterParameterGroupStatusStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ClusterSubnetGroupName", targetDepth)) {
                    cluster.setClusterSubnetGroupName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    cluster.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("AvailabilityZone", targetDepth)) {
                    cluster.setAvailabilityZone(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("PreferredMaintenanceWindow", targetDepth)) {
                    cluster.setPreferredMaintenanceWindow(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("PendingModifiedValues", targetDepth)) {
                    cluster.setPendingModifiedValues(PendingModifiedValuesStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ClusterVersion", targetDepth)) {
                    cluster.setClusterVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("AllowVersionUpgrade", targetDepth)) {
                    cluster.setAllowVersionUpgrade(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("NumberOfNodes", targetDepth)) {
                    cluster.setNumberOfNodes(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("PubliclyAccessible", targetDepth)) {
                    cluster.setPubliclyAccessible(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Encrypted", targetDepth)) {
                    cluster.setEncrypted(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("RestoreStatus", targetDepth)) {
                    cluster.setRestoreStatus(RestoreStatusStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("HsmStatus", targetDepth)) {
                    cluster.setHsmStatus(HsmStatusStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ClusterSnapshotCopyStatus", targetDepth)) {
                    cluster.setClusterSnapshotCopyStatus(ClusterSnapshotCopyStatusStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ClusterPublicKey", targetDepth)) {
                    cluster.setClusterPublicKey(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ClusterNodes/member", targetDepth)) {
                    cluster.getClusterNodes().add(ClusterNodeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ElasticIpStatus", targetDepth)) {
                    cluster.setElasticIpStatus(ElasticIpStatusStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return cluster;
                }
            }
        }
    }

    private static ClusterStaxUnmarshaller instance;
    public static ClusterStaxUnmarshaller getInstance() {
        if (instance == null) instance = new ClusterStaxUnmarshaller();
        return instance;
    }
}
    