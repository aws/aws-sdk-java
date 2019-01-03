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

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DescribeDBInstanceAutomatedBackupsResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBInstanceAutomatedBackupsResultStaxUnmarshaller implements
        Unmarshaller<DescribeDBInstanceAutomatedBackupsResult, StaxUnmarshallerContext> {

    public DescribeDBInstanceAutomatedBackupsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeDBInstanceAutomatedBackupsResult describeDBInstanceAutomatedBackupsResult = new DescribeDBInstanceAutomatedBackupsResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeDBInstanceAutomatedBackupsResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Marker", targetDepth)) {
                    describeDBInstanceAutomatedBackupsResult.setMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBInstanceAutomatedBackups", targetDepth)) {
                    describeDBInstanceAutomatedBackupsResult.withDBInstanceAutomatedBackups(new ArrayList<DBInstanceAutomatedBackup>());
                    continue;
                }

                if (context.testExpression("DBInstanceAutomatedBackups/DBInstanceAutomatedBackup", targetDepth)) {
                    describeDBInstanceAutomatedBackupsResult.withDBInstanceAutomatedBackups(DBInstanceAutomatedBackupStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeDBInstanceAutomatedBackupsResult;
                }
            }
        }
    }

    private static DescribeDBInstanceAutomatedBackupsResultStaxUnmarshaller instance;

    public static DescribeDBInstanceAutomatedBackupsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeDBInstanceAutomatedBackupsResultStaxUnmarshaller();
        return instance;
    }
}
