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
 * GlobalCluster StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GlobalClusterStaxUnmarshaller implements Unmarshaller<GlobalCluster, StaxUnmarshallerContext> {

    public GlobalCluster unmarshall(StaxUnmarshallerContext context) throws Exception {
        GlobalCluster globalCluster = new GlobalCluster();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 3;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return globalCluster;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("GlobalClusterIdentifier", targetDepth)) {
                    globalCluster.setGlobalClusterIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("GlobalClusterResourceId", targetDepth)) {
                    globalCluster.setGlobalClusterResourceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("GlobalClusterArn", targetDepth)) {
                    globalCluster.setGlobalClusterArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    globalCluster.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Engine", targetDepth)) {
                    globalCluster.setEngine(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EngineVersion", targetDepth)) {
                    globalCluster.setEngineVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DatabaseName", targetDepth)) {
                    globalCluster.setDatabaseName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StorageEncrypted", targetDepth)) {
                    globalCluster.setStorageEncrypted(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DeletionProtection", targetDepth)) {
                    globalCluster.setDeletionProtection(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("GlobalClusterMembers", targetDepth)) {
                    globalCluster.withGlobalClusterMembers(new ArrayList<GlobalClusterMember>());
                    continue;
                }

                if (context.testExpression("GlobalClusterMembers/GlobalClusterMember", targetDepth)) {
                    globalCluster.withGlobalClusterMembers(GlobalClusterMemberStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return globalCluster;
                }
            }
        }
    }

    private static GlobalClusterStaxUnmarshaller instance;

    public static GlobalClusterStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GlobalClusterStaxUnmarshaller();
        return instance;
    }
}
