/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * D B Instance StAX Unmarshaller
 */
public class DBInstanceStaxUnmarshaller implements Unmarshaller<DBInstance, StaxUnmarshallerContext> {

    public DBInstance unmarshall(StaxUnmarshallerContext context) throws Exception {
        DBInstance dBInstance = new DBInstance();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        
        if (context.isStartOfDocument()) targetDepth += 2;
        

        if (context.isStartOfDocument()) targetDepth++;
        

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return dBInstance;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("DBInstanceIdentifier", targetDepth)) {
                    dBInstance.setDBInstanceIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DBInstanceClass", targetDepth)) {
                    dBInstance.setDBInstanceClass(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Engine", targetDepth)) {
                    dBInstance.setEngine(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DBInstanceStatus", targetDepth)) {
                    dBInstance.setDBInstanceStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("MasterUsername", targetDepth)) {
                    dBInstance.setMasterUsername(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DBName", targetDepth)) {
                    dBInstance.setDBName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Endpoint", targetDepth)) {
                    dBInstance.setEndpoint(EndpointStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("AllocatedStorage", targetDepth)) {
                    dBInstance.setAllocatedStorage(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("InstanceCreateTime", targetDepth)) {
                    dBInstance.setInstanceCreateTime(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("PreferredBackupWindow", targetDepth)) {
                    dBInstance.setPreferredBackupWindow(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("BackupRetentionPeriod", targetDepth)) {
                    dBInstance.setBackupRetentionPeriod(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DBSecurityGroups/DBSecurityGroup", targetDepth)) {
                    dBInstance.getDBSecurityGroups().add(DBSecurityGroupMembershipStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DBParameterGroups/DBParameterGroup", targetDepth)) {
                    dBInstance.getDBParameterGroups().add(DBParameterGroupStatusStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("AvailabilityZone", targetDepth)) {
                    dBInstance.setAvailabilityZone(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DBSubnetGroup", targetDepth)) {
                    dBInstance.setDBSubnetGroup(DBSubnetGroupStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("PreferredMaintenanceWindow", targetDepth)) {
                    dBInstance.setPreferredMaintenanceWindow(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("PendingModifiedValues", targetDepth)) {
                    dBInstance.setPendingModifiedValues(PendingModifiedValuesStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("LatestRestorableTime", targetDepth)) {
                    dBInstance.setLatestRestorableTime(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("MultiAZ", targetDepth)) {
                    dBInstance.setMultiAZ(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("EngineVersion", targetDepth)) {
                    dBInstance.setEngineVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("AutoMinorVersionUpgrade", targetDepth)) {
                    dBInstance.setAutoMinorVersionUpgrade(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ReadReplicaSourceDBInstanceIdentifier", targetDepth)) {
                    dBInstance.setReadReplicaSourceDBInstanceIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ReadReplicaDBInstanceIdentifiers/ReadReplicaDBInstanceIdentifier", targetDepth)) {
                    dBInstance.getReadReplicaDBInstanceIdentifiers().add(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("LicenseModel", targetDepth)) {
                    dBInstance.setLicenseModel(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return dBInstance;
                }
            }
        }
    }

    private static DBInstanceStaxUnmarshaller instance;
    public static DBInstanceStaxUnmarshaller getInstance() {
        if (instance == null) instance = new DBInstanceStaxUnmarshaller();
        return instance;
    }
}
    