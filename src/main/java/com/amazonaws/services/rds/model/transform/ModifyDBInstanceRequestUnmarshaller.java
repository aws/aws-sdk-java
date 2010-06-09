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
 * Modify D B Instance Request Unmarshaller
 */
public class ModifyDBInstanceRequestUnmarshaller implements Unmarshaller<ModifyDBInstanceRequest, Node> {

    public ModifyDBInstanceRequest unmarshall(Node node) throws Exception {
        if (node == null) return null;

        ModifyDBInstanceRequest modifyDBInstanceRequest = new ModifyDBInstanceRequest();

        
        Node dBInstanceIdentifierNode = XpathUtils.asNode("DBInstanceIdentifier", node);
        modifyDBInstanceRequest.setDBInstanceIdentifier(new StringUnmarshaller().unmarshall(dBInstanceIdentifierNode));
    
        Node allocatedStorageNode = XpathUtils.asNode("AllocatedStorage", node);
        modifyDBInstanceRequest.setAllocatedStorage(new IntegerUnmarshaller().unmarshall(allocatedStorageNode));
    
        Node dBInstanceClassNode = XpathUtils.asNode("DBInstanceClass", node);
        modifyDBInstanceRequest.setDBInstanceClass(new StringUnmarshaller().unmarshall(dBInstanceClassNode));
    
        NodeList dBSecurityGroupsNodes = XpathUtils.asNodeList("DBSecurityGroups/DBSecurityGroupName", node);
        for (int dBSecurityGroupsIndex = 0; dBSecurityGroupsIndex < XpathUtils.nodeLength(dBSecurityGroupsNodes); ++dBSecurityGroupsIndex) {
            Node dBSecurityGroupsNode = dBSecurityGroupsNodes.item(dBSecurityGroupsIndex);
            modifyDBInstanceRequest.getDBSecurityGroups().add(new StringUnmarshaller().unmarshall(dBSecurityGroupsNode));
            dBSecurityGroupsNode.getParentNode().removeChild(dBSecurityGroupsNode);
        }
    
        Node applyImmediatelyNode = XpathUtils.asNode("ApplyImmediately", node);
        modifyDBInstanceRequest.setApplyImmediately(new BooleanUnmarshaller().unmarshall(applyImmediatelyNode));
    
        Node masterUserPasswordNode = XpathUtils.asNode("MasterUserPassword", node);
        modifyDBInstanceRequest.setMasterUserPassword(new StringUnmarshaller().unmarshall(masterUserPasswordNode));
    
        Node dBParameterGroupNameNode = XpathUtils.asNode("DBParameterGroupName", node);
        modifyDBInstanceRequest.setDBParameterGroupName(new StringUnmarshaller().unmarshall(dBParameterGroupNameNode));
    
        Node backupRetentionPeriodNode = XpathUtils.asNode("BackupRetentionPeriod", node);
        modifyDBInstanceRequest.setBackupRetentionPeriod(new IntegerUnmarshaller().unmarshall(backupRetentionPeriodNode));
    
        Node preferredBackupWindowNode = XpathUtils.asNode("PreferredBackupWindow", node);
        modifyDBInstanceRequest.setPreferredBackupWindow(new StringUnmarshaller().unmarshall(preferredBackupWindowNode));
    
        Node preferredMaintenanceWindowNode = XpathUtils.asNode("PreferredMaintenanceWindow", node);
        modifyDBInstanceRequest.setPreferredMaintenanceWindow(new StringUnmarshaller().unmarshall(preferredMaintenanceWindowNode));
    
        Node multiAZNode = XpathUtils.asNode("MultiAZ", node);
        modifyDBInstanceRequest.setMultiAZ(new BooleanUnmarshaller().unmarshall(multiAZNode));
    

        return modifyDBInstanceRequest;
    }
}
    