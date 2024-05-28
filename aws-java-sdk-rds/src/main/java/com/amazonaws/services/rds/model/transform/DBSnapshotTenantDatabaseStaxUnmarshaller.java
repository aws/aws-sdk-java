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
 * DBSnapshotTenantDatabase StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBSnapshotTenantDatabaseStaxUnmarshaller implements Unmarshaller<DBSnapshotTenantDatabase, StaxUnmarshallerContext> {

    public DBSnapshotTenantDatabase unmarshall(StaxUnmarshallerContext context) throws Exception {
        DBSnapshotTenantDatabase dBSnapshotTenantDatabase = new DBSnapshotTenantDatabase();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 3;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return dBSnapshotTenantDatabase;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("DBSnapshotIdentifier", targetDepth)) {
                    dBSnapshotTenantDatabase.setDBSnapshotIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBInstanceIdentifier", targetDepth)) {
                    dBSnapshotTenantDatabase.setDBInstanceIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DbiResourceId", targetDepth)) {
                    dBSnapshotTenantDatabase.setDbiResourceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EngineName", targetDepth)) {
                    dBSnapshotTenantDatabase.setEngineName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SnapshotType", targetDepth)) {
                    dBSnapshotTenantDatabase.setSnapshotType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TenantDatabaseCreateTime", targetDepth)) {
                    dBSnapshotTenantDatabase.setTenantDatabaseCreateTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("TenantDBName", targetDepth)) {
                    dBSnapshotTenantDatabase.setTenantDBName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MasterUsername", targetDepth)) {
                    dBSnapshotTenantDatabase.setMasterUsername(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TenantDatabaseResourceId", targetDepth)) {
                    dBSnapshotTenantDatabase.setTenantDatabaseResourceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CharacterSetName", targetDepth)) {
                    dBSnapshotTenantDatabase.setCharacterSetName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBSnapshotTenantDatabaseARN", targetDepth)) {
                    dBSnapshotTenantDatabase.setDBSnapshotTenantDatabaseARN(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NcharCharacterSetName", targetDepth)) {
                    dBSnapshotTenantDatabase.setNcharCharacterSetName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TagList", targetDepth)) {
                    dBSnapshotTenantDatabase.withTagList(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("TagList/Tag", targetDepth)) {
                    dBSnapshotTenantDatabase.withTagList(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return dBSnapshotTenantDatabase;
                }
            }
        }
    }

    private static DBSnapshotTenantDatabaseStaxUnmarshaller instance;

    public static DBSnapshotTenantDatabaseStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DBSnapshotTenantDatabaseStaxUnmarshaller();
        return instance;
    }
}
