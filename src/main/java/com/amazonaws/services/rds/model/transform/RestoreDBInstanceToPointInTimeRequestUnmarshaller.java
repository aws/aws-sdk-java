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
 * Restore D B Instance To Point In Time Request Unmarshaller
 */
public class RestoreDBInstanceToPointInTimeRequestUnmarshaller implements Unmarshaller<RestoreDBInstanceToPointInTimeRequest, Node> {

    public RestoreDBInstanceToPointInTimeRequest unmarshall(Node node) throws Exception {
        if (node == null) return null;

        RestoreDBInstanceToPointInTimeRequest restoreDBInstanceToPointInTimeRequest = new RestoreDBInstanceToPointInTimeRequest();

        
        Node sourceDBInstanceIdentifierNode = XpathUtils.asNode("SourceDBInstanceIdentifier", node);
        restoreDBInstanceToPointInTimeRequest.setSourceDBInstanceIdentifier(new StringUnmarshaller().unmarshall(sourceDBInstanceIdentifierNode));
    
        Node targetDBInstanceIdentifierNode = XpathUtils.asNode("TargetDBInstanceIdentifier", node);
        restoreDBInstanceToPointInTimeRequest.setTargetDBInstanceIdentifier(new StringUnmarshaller().unmarshall(targetDBInstanceIdentifierNode));
    
        Node restoreTimeNode = XpathUtils.asNode("RestoreTime", node);
        restoreDBInstanceToPointInTimeRequest.setRestoreTime(new DateUnmarshaller().unmarshall(restoreTimeNode));
    
        Node useLatestRestorableTimeNode = XpathUtils.asNode("UseLatestRestorableTime", node);
        restoreDBInstanceToPointInTimeRequest.setUseLatestRestorableTime(new BooleanUnmarshaller().unmarshall(useLatestRestorableTimeNode));
    
        Node dBInstanceClassNode = XpathUtils.asNode("DBInstanceClass", node);
        restoreDBInstanceToPointInTimeRequest.setDBInstanceClass(new StringUnmarshaller().unmarshall(dBInstanceClassNode));
    
        Node portNode = XpathUtils.asNode("Port", node);
        restoreDBInstanceToPointInTimeRequest.setPort(new IntegerUnmarshaller().unmarshall(portNode));
    
        Node availabilityZoneNode = XpathUtils.asNode("AvailabilityZone", node);
        restoreDBInstanceToPointInTimeRequest.setAvailabilityZone(new StringUnmarshaller().unmarshall(availabilityZoneNode));
    
        Node multiAZNode = XpathUtils.asNode("MultiAZ", node);
        restoreDBInstanceToPointInTimeRequest.setMultiAZ(new BooleanUnmarshaller().unmarshall(multiAZNode));
    

        return restoreDBInstanceToPointInTimeRequest;
    }
}
    