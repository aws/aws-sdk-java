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
 * Restore D B Instance From D B Snapshot Request Unmarshaller
 */
public class RestoreDBInstanceFromDBSnapshotRequestUnmarshaller implements Unmarshaller<RestoreDBInstanceFromDBSnapshotRequest, Node> {

    public RestoreDBInstanceFromDBSnapshotRequest unmarshall(Node node) throws Exception {
        if (node == null) return null;

        RestoreDBInstanceFromDBSnapshotRequest restoreDBInstanceFromDBSnapshotRequest = new RestoreDBInstanceFromDBSnapshotRequest();

        
        Node dBInstanceIdentifierNode = XpathUtils.asNode("DBInstanceIdentifier", node);
        restoreDBInstanceFromDBSnapshotRequest.setDBInstanceIdentifier(new StringUnmarshaller().unmarshall(dBInstanceIdentifierNode));
    
        Node dBSnapshotIdentifierNode = XpathUtils.asNode("DBSnapshotIdentifier", node);
        restoreDBInstanceFromDBSnapshotRequest.setDBSnapshotIdentifier(new StringUnmarshaller().unmarshall(dBSnapshotIdentifierNode));
    
        Node dBInstanceClassNode = XpathUtils.asNode("DBInstanceClass", node);
        restoreDBInstanceFromDBSnapshotRequest.setDBInstanceClass(new StringUnmarshaller().unmarshall(dBInstanceClassNode));
    
        Node portNode = XpathUtils.asNode("Port", node);
        restoreDBInstanceFromDBSnapshotRequest.setPort(new IntegerUnmarshaller().unmarshall(portNode));
    
        Node availabilityZoneNode = XpathUtils.asNode("AvailabilityZone", node);
        restoreDBInstanceFromDBSnapshotRequest.setAvailabilityZone(new StringUnmarshaller().unmarshall(availabilityZoneNode));
    
        Node multiAZNode = XpathUtils.asNode("MultiAZ", node);
        restoreDBInstanceFromDBSnapshotRequest.setMultiAZ(new BooleanUnmarshaller().unmarshall(multiAZNode));
    

        return restoreDBInstanceFromDBSnapshotRequest;
    }
}
    