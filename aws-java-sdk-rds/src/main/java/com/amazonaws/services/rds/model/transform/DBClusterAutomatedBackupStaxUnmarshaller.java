/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DBClusterAutomatedBackup StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBClusterAutomatedBackupStaxUnmarshaller implements Unmarshaller<DBClusterAutomatedBackup, StaxUnmarshallerContext> {

    public DBClusterAutomatedBackup unmarshall(StaxUnmarshallerContext context) throws Exception {
        DBClusterAutomatedBackup dBClusterAutomatedBackup = new DBClusterAutomatedBackup();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 3;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return dBClusterAutomatedBackup;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Engine", targetDepth)) {
                    dBClusterAutomatedBackup.setEngine(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("VpcId", targetDepth)) {
                    dBClusterAutomatedBackup.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBClusterAutomatedBackupsArn", targetDepth)) {
                    dBClusterAutomatedBackup.setDBClusterAutomatedBackupsArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBClusterIdentifier", targetDepth)) {
                    dBClusterAutomatedBackup.setDBClusterIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RestoreWindow", targetDepth)) {
                    dBClusterAutomatedBackup.setRestoreWindow(RestoreWindowStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MasterUsername", targetDepth)) {
                    dBClusterAutomatedBackup.setMasterUsername(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DbClusterResourceId", targetDepth)) {
                    dBClusterAutomatedBackup.setDbClusterResourceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Region", targetDepth)) {
                    dBClusterAutomatedBackup.setRegion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LicenseModel", targetDepth)) {
                    dBClusterAutomatedBackup.setLicenseModel(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    dBClusterAutomatedBackup.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IAMDatabaseAuthenticationEnabled", targetDepth)) {
                    dBClusterAutomatedBackup.setIAMDatabaseAuthenticationEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ClusterCreateTime", targetDepth)) {
                    dBClusterAutomatedBackup.setClusterCreateTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("StorageEncrypted", targetDepth)) {
                    dBClusterAutomatedBackup.setStorageEncrypted(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AllocatedStorage", targetDepth)) {
                    dBClusterAutomatedBackup.setAllocatedStorage(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EngineVersion", targetDepth)) {
                    dBClusterAutomatedBackup.setEngineVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBClusterArn", targetDepth)) {
                    dBClusterAutomatedBackup.setDBClusterArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("BackupRetentionPeriod", targetDepth)) {
                    dBClusterAutomatedBackup.setBackupRetentionPeriod(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EngineMode", targetDepth)) {
                    dBClusterAutomatedBackup.setEngineMode(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AvailabilityZones", targetDepth)) {
                    dBClusterAutomatedBackup.withAvailabilityZones(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("AvailabilityZones/AvailabilityZone", targetDepth)) {
                    dBClusterAutomatedBackup.withAvailabilityZones(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Port", targetDepth)) {
                    dBClusterAutomatedBackup.setPort(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("KmsKeyId", targetDepth)) {
                    dBClusterAutomatedBackup.setKmsKeyId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StorageType", targetDepth)) {
                    dBClusterAutomatedBackup.setStorageType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Iops", targetDepth)) {
                    dBClusterAutomatedBackup.setIops(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AwsBackupRecoveryPointArn", targetDepth)) {
                    dBClusterAutomatedBackup.setAwsBackupRecoveryPointArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StorageThroughput", targetDepth)) {
                    dBClusterAutomatedBackup.setStorageThroughput(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return dBClusterAutomatedBackup;
                }
            }
        }
    }

    private static DBClusterAutomatedBackupStaxUnmarshaller instance;

    public static DBClusterAutomatedBackupStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DBClusterAutomatedBackupStaxUnmarshaller();
        return instance;
    }
}
