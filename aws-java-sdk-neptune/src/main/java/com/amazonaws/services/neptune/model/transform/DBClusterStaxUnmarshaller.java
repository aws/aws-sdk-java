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
package com.amazonaws.services.neptune.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.neptune.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DBCluster StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBClusterStaxUnmarshaller implements Unmarshaller<DBCluster, StaxUnmarshallerContext> {

    public DBCluster unmarshall(StaxUnmarshallerContext context) throws Exception {
        DBCluster dBCluster = new DBCluster();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 3;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return dBCluster;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("AllocatedStorage", targetDepth)) {
                    dBCluster.setAllocatedStorage(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AvailabilityZones", targetDepth)) {
                    dBCluster.withAvailabilityZones(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("AvailabilityZones/AvailabilityZone", targetDepth)) {
                    dBCluster.withAvailabilityZones(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("BackupRetentionPeriod", targetDepth)) {
                    dBCluster.setBackupRetentionPeriod(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CharacterSetName", targetDepth)) {
                    dBCluster.setCharacterSetName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DatabaseName", targetDepth)) {
                    dBCluster.setDatabaseName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBClusterIdentifier", targetDepth)) {
                    dBCluster.setDBClusterIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBClusterParameterGroup", targetDepth)) {
                    dBCluster.setDBClusterParameterGroup(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBSubnetGroup", targetDepth)) {
                    dBCluster.setDBSubnetGroup(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    dBCluster.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PercentProgress", targetDepth)) {
                    dBCluster.setPercentProgress(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EarliestRestorableTime", targetDepth)) {
                    dBCluster.setEarliestRestorableTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("Endpoint", targetDepth)) {
                    dBCluster.setEndpoint(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ReaderEndpoint", targetDepth)) {
                    dBCluster.setReaderEndpoint(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MultiAZ", targetDepth)) {
                    dBCluster.setMultiAZ(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Engine", targetDepth)) {
                    dBCluster.setEngine(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EngineVersion", targetDepth)) {
                    dBCluster.setEngineVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LatestRestorableTime", targetDepth)) {
                    dBCluster.setLatestRestorableTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("Port", targetDepth)) {
                    dBCluster.setPort(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MasterUsername", targetDepth)) {
                    dBCluster.setMasterUsername(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBClusterOptionGroupMemberships", targetDepth)) {
                    dBCluster.withDBClusterOptionGroupMemberships(new ArrayList<DBClusterOptionGroupStatus>());
                    continue;
                }

                if (context.testExpression("DBClusterOptionGroupMemberships/DBClusterOptionGroup", targetDepth)) {
                    dBCluster.withDBClusterOptionGroupMemberships(DBClusterOptionGroupStatusStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PreferredBackupWindow", targetDepth)) {
                    dBCluster.setPreferredBackupWindow(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PreferredMaintenanceWindow", targetDepth)) {
                    dBCluster.setPreferredMaintenanceWindow(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ReplicationSourceIdentifier", targetDepth)) {
                    dBCluster.setReplicationSourceIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ReadReplicaIdentifiers", targetDepth)) {
                    dBCluster.withReadReplicaIdentifiers(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("ReadReplicaIdentifiers/ReadReplicaIdentifier", targetDepth)) {
                    dBCluster.withReadReplicaIdentifiers(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBClusterMembers", targetDepth)) {
                    dBCluster.withDBClusterMembers(new ArrayList<DBClusterMember>());
                    continue;
                }

                if (context.testExpression("DBClusterMembers/DBClusterMember", targetDepth)) {
                    dBCluster.withDBClusterMembers(DBClusterMemberStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("VpcSecurityGroups", targetDepth)) {
                    dBCluster.withVpcSecurityGroups(new ArrayList<VpcSecurityGroupMembership>());
                    continue;
                }

                if (context.testExpression("VpcSecurityGroups/VpcSecurityGroupMembership", targetDepth)) {
                    dBCluster.withVpcSecurityGroups(VpcSecurityGroupMembershipStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("HostedZoneId", targetDepth)) {
                    dBCluster.setHostedZoneId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StorageEncrypted", targetDepth)) {
                    dBCluster.setStorageEncrypted(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("KmsKeyId", targetDepth)) {
                    dBCluster.setKmsKeyId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DbClusterResourceId", targetDepth)) {
                    dBCluster.setDbClusterResourceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBClusterArn", targetDepth)) {
                    dBCluster.setDBClusterArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AssociatedRoles", targetDepth)) {
                    dBCluster.withAssociatedRoles(new ArrayList<DBClusterRole>());
                    continue;
                }

                if (context.testExpression("AssociatedRoles/DBClusterRole", targetDepth)) {
                    dBCluster.withAssociatedRoles(DBClusterRoleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IAMDatabaseAuthenticationEnabled", targetDepth)) {
                    dBCluster.setIAMDatabaseAuthenticationEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CloneGroupId", targetDepth)) {
                    dBCluster.setCloneGroupId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ClusterCreateTime", targetDepth)) {
                    dBCluster.setClusterCreateTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return dBCluster;
                }
            }
        }
    }

    private static DBClusterStaxUnmarshaller instance;

    public static DBClusterStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DBClusterStaxUnmarshaller();
        return instance;
    }
}
