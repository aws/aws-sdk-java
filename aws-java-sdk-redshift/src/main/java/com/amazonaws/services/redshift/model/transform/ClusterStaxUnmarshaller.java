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
package com.amazonaws.services.redshift.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * Cluster StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterStaxUnmarshaller implements Unmarshaller<Cluster, StaxUnmarshallerContext> {

    public Cluster unmarshall(StaxUnmarshallerContext context) throws Exception {
        Cluster cluster = new Cluster();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 3;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return cluster;

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
                    cluster.setClusterCreateTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("AutomatedSnapshotRetentionPeriod", targetDepth)) {
                    cluster.setAutomatedSnapshotRetentionPeriod(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ManualSnapshotRetentionPeriod", targetDepth)) {
                    cluster.setManualSnapshotRetentionPeriod(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ClusterSecurityGroups", targetDepth)) {
                    cluster.withClusterSecurityGroups(new ArrayList<ClusterSecurityGroupMembership>());
                    continue;
                }

                if (context.testExpression("ClusterSecurityGroups/ClusterSecurityGroup", targetDepth)) {
                    cluster.withClusterSecurityGroups(ClusterSecurityGroupMembershipStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("VpcSecurityGroups", targetDepth)) {
                    cluster.withVpcSecurityGroups(new ArrayList<VpcSecurityGroupMembership>());
                    continue;
                }

                if (context.testExpression("VpcSecurityGroups/VpcSecurityGroup", targetDepth)) {
                    cluster.withVpcSecurityGroups(VpcSecurityGroupMembershipStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ClusterParameterGroups", targetDepth)) {
                    cluster.withClusterParameterGroups(new ArrayList<ClusterParameterGroupStatus>());
                    continue;
                }

                if (context.testExpression("ClusterParameterGroups/ClusterParameterGroup", targetDepth)) {
                    cluster.withClusterParameterGroups(ClusterParameterGroupStatusStaxUnmarshaller.getInstance().unmarshall(context));
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

                if (context.testExpression("DataTransferProgress", targetDepth)) {
                    cluster.setDataTransferProgress(DataTransferProgressStaxUnmarshaller.getInstance().unmarshall(context));
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

                if (context.testExpression("ClusterNodes", targetDepth)) {
                    cluster.withClusterNodes(new ArrayList<ClusterNode>());
                    continue;
                }

                if (context.testExpression("ClusterNodes/member", targetDepth)) {
                    cluster.withClusterNodes(ClusterNodeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ElasticIpStatus", targetDepth)) {
                    cluster.setElasticIpStatus(ElasticIpStatusStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ClusterRevisionNumber", targetDepth)) {
                    cluster.setClusterRevisionNumber(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Tags", targetDepth)) {
                    cluster.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("Tags/Tag", targetDepth)) {
                    cluster.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("KmsKeyId", targetDepth)) {
                    cluster.setKmsKeyId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EnhancedVpcRouting", targetDepth)) {
                    cluster.setEnhancedVpcRouting(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IamRoles", targetDepth)) {
                    cluster.withIamRoles(new ArrayList<ClusterIamRole>());
                    continue;
                }

                if (context.testExpression("IamRoles/ClusterIamRole", targetDepth)) {
                    cluster.withIamRoles(ClusterIamRoleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PendingActions", targetDepth)) {
                    cluster.withPendingActions(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("PendingActions/member", targetDepth)) {
                    cluster.withPendingActions(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MaintenanceTrackName", targetDepth)) {
                    cluster.setMaintenanceTrackName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ElasticResizeNumberOfNodeOptions", targetDepth)) {
                    cluster.setElasticResizeNumberOfNodeOptions(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DeferredMaintenanceWindows", targetDepth)) {
                    cluster.withDeferredMaintenanceWindows(new ArrayList<DeferredMaintenanceWindow>());
                    continue;
                }

                if (context.testExpression("DeferredMaintenanceWindows/DeferredMaintenanceWindow", targetDepth)) {
                    cluster.withDeferredMaintenanceWindows(DeferredMaintenanceWindowStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SnapshotScheduleIdentifier", targetDepth)) {
                    cluster.setSnapshotScheduleIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SnapshotScheduleState", targetDepth)) {
                    cluster.setSnapshotScheduleState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ResizeInfo", targetDepth)) {
                    cluster.setResizeInfo(ResizeInfoStaxUnmarshaller.getInstance().unmarshall(context));
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
        if (instance == null)
            instance = new ClusterStaxUnmarshaller();
        return instance;
    }
}
