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
package com.amazonaws.services.rds.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DBInstanceAutomatedBackup StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBInstanceAutomatedBackupStaxUnmarshaller implements Unmarshaller<DBInstanceAutomatedBackup, StaxUnmarshallerContext> {

    public DBInstanceAutomatedBackup unmarshall(StaxUnmarshallerContext context) throws Exception {
        DBInstanceAutomatedBackup dBInstanceAutomatedBackup = new DBInstanceAutomatedBackup();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 3;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return dBInstanceAutomatedBackup;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("DBInstanceArn", targetDepth)) {
                    dBInstanceAutomatedBackup.setDBInstanceArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DbiResourceId", targetDepth)) {
                    dBInstanceAutomatedBackup.setDbiResourceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Region", targetDepth)) {
                    dBInstanceAutomatedBackup.setRegion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBInstanceIdentifier", targetDepth)) {
                    dBInstanceAutomatedBackup.setDBInstanceIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RestoreWindow", targetDepth)) {
                    dBInstanceAutomatedBackup.setRestoreWindow(RestoreWindowStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AllocatedStorage", targetDepth)) {
                    dBInstanceAutomatedBackup.setAllocatedStorage(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    dBInstanceAutomatedBackup.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Port", targetDepth)) {
                    dBInstanceAutomatedBackup.setPort(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AvailabilityZone", targetDepth)) {
                    dBInstanceAutomatedBackup.setAvailabilityZone(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("VpcId", targetDepth)) {
                    dBInstanceAutomatedBackup.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("InstanceCreateTime", targetDepth)) {
                    dBInstanceAutomatedBackup.setInstanceCreateTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("MasterUsername", targetDepth)) {
                    dBInstanceAutomatedBackup.setMasterUsername(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Engine", targetDepth)) {
                    dBInstanceAutomatedBackup.setEngine(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EngineVersion", targetDepth)) {
                    dBInstanceAutomatedBackup.setEngineVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LicenseModel", targetDepth)) {
                    dBInstanceAutomatedBackup.setLicenseModel(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Iops", targetDepth)) {
                    dBInstanceAutomatedBackup.setIops(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("OptionGroupName", targetDepth)) {
                    dBInstanceAutomatedBackup.setOptionGroupName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TdeCredentialArn", targetDepth)) {
                    dBInstanceAutomatedBackup.setTdeCredentialArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Encrypted", targetDepth)) {
                    dBInstanceAutomatedBackup.setEncrypted(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StorageType", targetDepth)) {
                    dBInstanceAutomatedBackup.setStorageType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("KmsKeyId", targetDepth)) {
                    dBInstanceAutomatedBackup.setKmsKeyId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Timezone", targetDepth)) {
                    dBInstanceAutomatedBackup.setTimezone(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IAMDatabaseAuthenticationEnabled", targetDepth)) {
                    dBInstanceAutomatedBackup.setIAMDatabaseAuthenticationEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return dBInstanceAutomatedBackup;
                }
            }
        }
    }

    private static DBInstanceAutomatedBackupStaxUnmarshaller instance;

    public static DBInstanceAutomatedBackupStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DBInstanceAutomatedBackupStaxUnmarshaller();
        return instance;
    }
}
