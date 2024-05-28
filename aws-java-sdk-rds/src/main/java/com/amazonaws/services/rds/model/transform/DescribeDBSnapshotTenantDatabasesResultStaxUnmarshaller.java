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
 * DescribeDBSnapshotTenantDatabasesResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBSnapshotTenantDatabasesResultStaxUnmarshaller implements Unmarshaller<DescribeDBSnapshotTenantDatabasesResult, StaxUnmarshallerContext> {

    public DescribeDBSnapshotTenantDatabasesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeDBSnapshotTenantDatabasesResult describeDBSnapshotTenantDatabasesResult = new DescribeDBSnapshotTenantDatabasesResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeDBSnapshotTenantDatabasesResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Marker", targetDepth)) {
                    describeDBSnapshotTenantDatabasesResult.setMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBSnapshotTenantDatabases", targetDepth)) {
                    describeDBSnapshotTenantDatabasesResult.withDBSnapshotTenantDatabases(new ArrayList<DBSnapshotTenantDatabase>());
                    continue;
                }

                if (context.testExpression("DBSnapshotTenantDatabases/DBSnapshotTenantDatabase", targetDepth)) {
                    describeDBSnapshotTenantDatabasesResult.withDBSnapshotTenantDatabases(DBSnapshotTenantDatabaseStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeDBSnapshotTenantDatabasesResult;
                }
            }
        }
    }

    private static DescribeDBSnapshotTenantDatabasesResultStaxUnmarshaller instance;

    public static DescribeDBSnapshotTenantDatabasesResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeDBSnapshotTenantDatabasesResultStaxUnmarshaller();
        return instance;
    }
}
