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
 * Create D B Instance Request Unmarshaller
 */
public class CreateDBInstanceRequestUnmarshaller implements Unmarshaller<CreateDBInstanceRequest, Node> {

    public CreateDBInstanceRequest unmarshall(Node node) throws Exception {
        if (node == null) return null;

        CreateDBInstanceRequest createDBInstanceRequest = new CreateDBInstanceRequest();

        
        Node dBNameNode = XpathUtils.asNode("DBName", node);
        createDBInstanceRequest.setDBName(new StringUnmarshaller().unmarshall(dBNameNode));
    
        Node dBInstanceIdentifierNode = XpathUtils.asNode("DBInstanceIdentifier", node);
        createDBInstanceRequest.setDBInstanceIdentifier(new StringUnmarshaller().unmarshall(dBInstanceIdentifierNode));
    
        Node allocatedStorageNode = XpathUtils.asNode("AllocatedStorage", node);
        createDBInstanceRequest.setAllocatedStorage(new IntegerUnmarshaller().unmarshall(allocatedStorageNode));
    
        Node dBInstanceClassNode = XpathUtils.asNode("DBInstanceClass", node);
        createDBInstanceRequest.setDBInstanceClass(new StringUnmarshaller().unmarshall(dBInstanceClassNode));
    
        Node engineNode = XpathUtils.asNode("Engine", node);
        createDBInstanceRequest.setEngine(new StringUnmarshaller().unmarshall(engineNode));
    
        Node masterUsernameNode = XpathUtils.asNode("MasterUsername", node);
        createDBInstanceRequest.setMasterUsername(new StringUnmarshaller().unmarshall(masterUsernameNode));
    
        Node masterUserPasswordNode = XpathUtils.asNode("MasterUserPassword", node);
        createDBInstanceRequest.setMasterUserPassword(new StringUnmarshaller().unmarshall(masterUserPasswordNode));
    
        NodeList dBSecurityGroupsNodes = XpathUtils.asNodeList("DBSecurityGroups/DBSecurityGroupName", node);
        for (int dBSecurityGroupsIndex = 0; dBSecurityGroupsIndex < XpathUtils.nodeLength(dBSecurityGroupsNodes); ++dBSecurityGroupsIndex) {
            Node dBSecurityGroupsNode = dBSecurityGroupsNodes.item(dBSecurityGroupsIndex);
            createDBInstanceRequest.getDBSecurityGroups().add(new StringUnmarshaller().unmarshall(dBSecurityGroupsNode));
            dBSecurityGroupsNode.getParentNode().removeChild(dBSecurityGroupsNode);
        }
    
        Node availabilityZoneNode = XpathUtils.asNode("AvailabilityZone", node);
        createDBInstanceRequest.setAvailabilityZone(new StringUnmarshaller().unmarshall(availabilityZoneNode));
    
        Node preferredMaintenanceWindowNode = XpathUtils.asNode("PreferredMaintenanceWindow", node);
        createDBInstanceRequest.setPreferredMaintenanceWindow(new StringUnmarshaller().unmarshall(preferredMaintenanceWindowNode));
    
        Node dBParameterGroupNameNode = XpathUtils.asNode("DBParameterGroupName", node);
        createDBInstanceRequest.setDBParameterGroupName(new StringUnmarshaller().unmarshall(dBParameterGroupNameNode));
    
        Node backupRetentionPeriodNode = XpathUtils.asNode("BackupRetentionPeriod", node);
        createDBInstanceRequest.setBackupRetentionPeriod(new IntegerUnmarshaller().unmarshall(backupRetentionPeriodNode));
    
        Node preferredBackupWindowNode = XpathUtils.asNode("PreferredBackupWindow", node);
        createDBInstanceRequest.setPreferredBackupWindow(new StringUnmarshaller().unmarshall(preferredBackupWindowNode));
    
        Node portNode = XpathUtils.asNode("Port", node);
        createDBInstanceRequest.setPort(new IntegerUnmarshaller().unmarshall(portNode));
    
        Node multiAZNode = XpathUtils.asNode("MultiAZ", node);
        createDBInstanceRequest.setMultiAZ(new BooleanUnmarshaller().unmarshall(multiAZNode));
    

        return createDBInstanceRequest;
    }
}
    