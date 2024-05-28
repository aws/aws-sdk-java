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

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DBShardGroup StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBShardGroupStaxUnmarshaller implements Unmarshaller<DBShardGroup, StaxUnmarshallerContext> {

    public DBShardGroup unmarshall(StaxUnmarshallerContext context) throws Exception {
        DBShardGroup dBShardGroup = new DBShardGroup();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return dBShardGroup;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("DBShardGroupResourceId", targetDepth)) {
                    dBShardGroup.setDBShardGroupResourceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBShardGroupIdentifier", targetDepth)) {
                    dBShardGroup.setDBShardGroupIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBClusterIdentifier", targetDepth)) {
                    dBShardGroup.setDBClusterIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MaxACU", targetDepth)) {
                    dBShardGroup.setMaxACU(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ComputeRedundancy", targetDepth)) {
                    dBShardGroup.setComputeRedundancy(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    dBShardGroup.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PubliclyAccessible", targetDepth)) {
                    dBShardGroup.setPubliclyAccessible(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Endpoint", targetDepth)) {
                    dBShardGroup.setEndpoint(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return dBShardGroup;
                }
            }
        }
    }

    private static DBShardGroupStaxUnmarshaller instance;

    public static DBShardGroupStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DBShardGroupStaxUnmarshaller();
        return instance;
    }
}
