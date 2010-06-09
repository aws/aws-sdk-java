/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rds.model.transform;

import org.w3c.dom.*;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.SimpleTypeUnmarshallers.*;
import com.amazonaws.util.XpathUtils;

/**
 * D B Instance Unmarshaller
 */
public class DBInstanceUnmarshaller implements Unmarshaller<DBInstance, Node> {

    public DBInstance unmarshall(Node node) throws Exception {
        if (node == null) return null;

        DBInstance dBInstance = new DBInstance();

        
        Node dBInstanceIdentifierNode = XpathUtils.asNode("DBInstanceIdentifier", node);
        dBInstance.setDBInstanceIdentifier(new StringUnmarshaller().unmarshall(dBInstanceIdentifierNode));
    
        Node dBInstanceClassNode = XpathUtils.asNode("DBInstanceClass", node);
        dBInstance.setDBInstanceClass(new StringUnmarshaller().unmarshall(dBInstanceClassNode));
    
        Node engineNode = XpathUtils.asNode("Engine", node);
        dBInstance.setEngine(new StringUnmarshaller().unmarshall(engineNode));
    
        Node dBInstanceStatusNode = XpathUtils.asNode("DBInstanceStatus", node);
        dBInstance.setDBInstanceStatus(new StringUnmarshaller().unmarshall(dBInstanceStatusNode));
    
        Node masterUsernameNode = XpathUtils.asNode("MasterUsername", node);
        dBInstance.setMasterUsername(new StringUnmarshaller().unmarshall(masterUsernameNode));
    
        Node dBNameNode = XpathUtils.asNode("DBName", node);
        dBInstance.setDBName(new StringUnmarshaller().unmarshall(dBNameNode));
    
        Node endpointNode = XpathUtils.asNode("Endpoint", node);
        dBInstance.setEndpoint(new EndpointUnmarshaller().unmarshall(endpointNode));
    
        Node allocatedStorageNode = XpathUtils.asNode("AllocatedStorage", node);
        dBInstance.setAllocatedStorage(new IntegerUnmarshaller().unmarshall(allocatedStorageNode));
    
        Node instanceCreateTimeNode = XpathUtils.asNode("InstanceCreateTime", node);
        dBInstance.setInstanceCreateTime(new DateUnmarshaller().unmarshall(instanceCreateTimeNode));
    
        Node preferredBackupWindowNode = XpathUtils.asNode("PreferredBackupWindow", node);
        dBInstance.setPreferredBackupWindow(new StringUnmarshaller().unmarshall(preferredBackupWindowNode));
    
        Node backupRetentionPeriodNode = XpathUtils.asNode("BackupRetentionPeriod", node);
        dBInstance.setBackupRetentionPeriod(new IntegerUnmarshaller().unmarshall(backupRetentionPeriodNode));
    
        NodeList dBSecurityGroupsNodes = XpathUtils.asNodeList("DBSecurityGroups/DBSecurityGroup", node);
        for (int dBSecurityGroupsIndex = 0; dBSecurityGroupsIndex < XpathUtils.nodeLength(dBSecurityGroupsNodes); ++dBSecurityGroupsIndex) {
            Node dBSecurityGroupsNode = dBSecurityGroupsNodes.item(dBSecurityGroupsIndex);
            dBInstance.getDBSecurityGroups().add(new DBSecurityGroupMembershipUnmarshaller().unmarshall(dBSecurityGroupsNode));
            dBSecurityGroupsNode.getParentNode().removeChild(dBSecurityGroupsNode);
        }
    
        NodeList dBParameterGroupsNodes = XpathUtils.asNodeList("DBParameterGroups/DBParameterGroup", node);
        for (int dBParameterGroupsIndex = 0; dBParameterGroupsIndex < XpathUtils.nodeLength(dBParameterGroupsNodes); ++dBParameterGroupsIndex) {
            Node dBParameterGroupsNode = dBParameterGroupsNodes.item(dBParameterGroupsIndex);
            dBInstance.getDBParameterGroups().add(new DBParameterGroupStatusUnmarshaller().unmarshall(dBParameterGroupsNode));
            dBParameterGroupsNode.getParentNode().removeChild(dBParameterGroupsNode);
        }
    
        Node availabilityZoneNode = XpathUtils.asNode("AvailabilityZone", node);
        dBInstance.setAvailabilityZone(new StringUnmarshaller().unmarshall(availabilityZoneNode));
    
        Node preferredMaintenanceWindowNode = XpathUtils.asNode("PreferredMaintenanceWindow", node);
        dBInstance.setPreferredMaintenanceWindow(new StringUnmarshaller().unmarshall(preferredMaintenanceWindowNode));
    
        Node pendingModifiedValuesNode = XpathUtils.asNode("PendingModifiedValues", node);
        dBInstance.setPendingModifiedValues(new PendingModifiedValuesUnmarshaller().unmarshall(pendingModifiedValuesNode));
    
        Node latestRestorableTimeNode = XpathUtils.asNode("LatestRestorableTime", node);
        dBInstance.setLatestRestorableTime(new DateUnmarshaller().unmarshall(latestRestorableTimeNode));
    
        Node multiAZNode = XpathUtils.asNode("MultiAZ", node);
        dBInstance.setMultiAZ(new BooleanUnmarshaller().unmarshall(multiAZNode));
    

        return dBInstance;
    }
}
    