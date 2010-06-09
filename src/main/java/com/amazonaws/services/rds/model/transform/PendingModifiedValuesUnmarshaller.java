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
 * Pending Modified Values Unmarshaller
 */
public class PendingModifiedValuesUnmarshaller implements Unmarshaller<PendingModifiedValues, Node> {

    public PendingModifiedValues unmarshall(Node node) throws Exception {
        if (node == null) return null;

        PendingModifiedValues pendingModifiedValues = new PendingModifiedValues();

        
        Node dBInstanceClassNode = XpathUtils.asNode("DBInstanceClass", node);
        pendingModifiedValues.setDBInstanceClass(new StringUnmarshaller().unmarshall(dBInstanceClassNode));
    
        Node allocatedStorageNode = XpathUtils.asNode("AllocatedStorage", node);
        pendingModifiedValues.setAllocatedStorage(new IntegerUnmarshaller().unmarshall(allocatedStorageNode));
    
        Node masterUserPasswordNode = XpathUtils.asNode("MasterUserPassword", node);
        pendingModifiedValues.setMasterUserPassword(new StringUnmarshaller().unmarshall(masterUserPasswordNode));
    
        Node portNode = XpathUtils.asNode("Port", node);
        pendingModifiedValues.setPort(new IntegerUnmarshaller().unmarshall(portNode));
    
        Node backupRetentionPeriodNode = XpathUtils.asNode("BackupRetentionPeriod", node);
        pendingModifiedValues.setBackupRetentionPeriod(new IntegerUnmarshaller().unmarshall(backupRetentionPeriodNode));
    
        Node multiAZNode = XpathUtils.asNode("MultiAZ", node);
        pendingModifiedValues.setMultiAZ(new BooleanUnmarshaller().unmarshall(multiAZNode));
    

        return pendingModifiedValues;
    }
}
    