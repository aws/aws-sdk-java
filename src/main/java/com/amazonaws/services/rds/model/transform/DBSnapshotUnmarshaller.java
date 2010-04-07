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
 * D B Snapshot Unmarshaller
 */
public class DBSnapshotUnmarshaller implements Unmarshaller<DBSnapshot, Node> {

    public DBSnapshot unmarshall(Node node) throws Exception {
        if (node == null) return null;

        DBSnapshot dBSnapshot = new DBSnapshot();

        
        Node dBSnapshotIdentifierNode = XpathUtils.asNode("DBSnapshotIdentifier", node);
        dBSnapshot.setDBSnapshotIdentifier(new StringUnmarshaller().unmarshall(dBSnapshotIdentifierNode));
    
        Node dBInstanceIdentifierNode = XpathUtils.asNode("DBInstanceIdentifier", node);
        dBSnapshot.setDBInstanceIdentifier(new StringUnmarshaller().unmarshall(dBInstanceIdentifierNode));
    
        Node snapshotCreateTimeNode = XpathUtils.asNode("SnapshotCreateTime", node);
        dBSnapshot.setSnapshotCreateTime(new DateUnmarshaller().unmarshall(snapshotCreateTimeNode));
    
        Node engineNode = XpathUtils.asNode("Engine", node);
        dBSnapshot.setEngine(new StringUnmarshaller().unmarshall(engineNode));
    
        Node allocatedStorageNode = XpathUtils.asNode("AllocatedStorage", node);
        dBSnapshot.setAllocatedStorage(new IntegerUnmarshaller().unmarshall(allocatedStorageNode));
    
        Node statusNode = XpathUtils.asNode("Status", node);
        dBSnapshot.setStatus(new StringUnmarshaller().unmarshall(statusNode));
    
        Node portNode = XpathUtils.asNode("Port", node);
        dBSnapshot.setPort(new IntegerUnmarshaller().unmarshall(portNode));
    
        Node availabilityZoneNode = XpathUtils.asNode("AvailabilityZone", node);
        dBSnapshot.setAvailabilityZone(new StringUnmarshaller().unmarshall(availabilityZoneNode));
    
        Node instanceCreateTimeNode = XpathUtils.asNode("InstanceCreateTime", node);
        dBSnapshot.setInstanceCreateTime(new DateUnmarshaller().unmarshall(instanceCreateTimeNode));
    
        Node masterUsernameNode = XpathUtils.asNode("MasterUsername", node);
        dBSnapshot.setMasterUsername(new StringUnmarshaller().unmarshall(masterUsernameNode));
    

        return dBSnapshot;
    }
}
    