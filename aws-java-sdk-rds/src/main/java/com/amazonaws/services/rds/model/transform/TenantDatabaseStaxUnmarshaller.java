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
 * TenantDatabase StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TenantDatabaseStaxUnmarshaller implements Unmarshaller<TenantDatabase, StaxUnmarshallerContext> {

    public TenantDatabase unmarshall(StaxUnmarshallerContext context) throws Exception {
        TenantDatabase tenantDatabase = new TenantDatabase();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 3;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return tenantDatabase;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("TenantDatabaseCreateTime", targetDepth)) {
                    tenantDatabase.setTenantDatabaseCreateTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBInstanceIdentifier", targetDepth)) {
                    tenantDatabase.setDBInstanceIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TenantDBName", targetDepth)) {
                    tenantDatabase.setTenantDBName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    tenantDatabase.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MasterUsername", targetDepth)) {
                    tenantDatabase.setMasterUsername(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DbiResourceId", targetDepth)) {
                    tenantDatabase.setDbiResourceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TenantDatabaseResourceId", targetDepth)) {
                    tenantDatabase.setTenantDatabaseResourceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TenantDatabaseARN", targetDepth)) {
                    tenantDatabase.setTenantDatabaseARN(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CharacterSetName", targetDepth)) {
                    tenantDatabase.setCharacterSetName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NcharCharacterSetName", targetDepth)) {
                    tenantDatabase.setNcharCharacterSetName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DeletionProtection", targetDepth)) {
                    tenantDatabase.setDeletionProtection(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PendingModifiedValues", targetDepth)) {
                    tenantDatabase.setPendingModifiedValues(TenantDatabasePendingModifiedValuesStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TagList", targetDepth)) {
                    tenantDatabase.withTagList(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("TagList/Tag", targetDepth)) {
                    tenantDatabase.withTagList(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return tenantDatabase;
                }
            }
        }
    }

    private static TenantDatabaseStaxUnmarshaller instance;

    public static TenantDatabaseStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new TenantDatabaseStaxUnmarshaller();
        return instance;
    }
}
