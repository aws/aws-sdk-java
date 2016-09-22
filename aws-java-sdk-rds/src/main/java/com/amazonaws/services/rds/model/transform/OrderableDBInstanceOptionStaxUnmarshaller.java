/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * OrderableDBInstanceOption StAX Unmarshaller
 */
public class OrderableDBInstanceOptionStaxUnmarshaller implements Unmarshaller<OrderableDBInstanceOption, StaxUnmarshallerContext> {

    public OrderableDBInstanceOption unmarshall(StaxUnmarshallerContext context) throws Exception {
        OrderableDBInstanceOption orderableDBInstanceOption = new OrderableDBInstanceOption();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 3;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return orderableDBInstanceOption;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Engine", targetDepth)) {
                    orderableDBInstanceOption.setEngine(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EngineVersion", targetDepth)) {
                    orderableDBInstanceOption.setEngineVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBInstanceClass", targetDepth)) {
                    orderableDBInstanceOption.setDBInstanceClass(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LicenseModel", targetDepth)) {
                    orderableDBInstanceOption.setLicenseModel(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AvailabilityZones/AvailabilityZone", targetDepth)) {
                    orderableDBInstanceOption.withAvailabilityZones(AvailabilityZoneStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MultiAZCapable", targetDepth)) {
                    orderableDBInstanceOption.setMultiAZCapable(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ReadReplicaCapable", targetDepth)) {
                    orderableDBInstanceOption.setReadReplicaCapable(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Vpc", targetDepth)) {
                    orderableDBInstanceOption.setVpc(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportsStorageEncryption", targetDepth)) {
                    orderableDBInstanceOption.setSupportsStorageEncryption(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StorageType", targetDepth)) {
                    orderableDBInstanceOption.setStorageType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportsIops", targetDepth)) {
                    orderableDBInstanceOption.setSupportsIops(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportsEnhancedMonitoring", targetDepth)) {
                    orderableDBInstanceOption.setSupportsEnhancedMonitoring(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return orderableDBInstanceOption;
                }
            }
        }
    }

    private static OrderableDBInstanceOptionStaxUnmarshaller instance;

    public static OrderableDBInstanceOptionStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new OrderableDBInstanceOptionStaxUnmarshaller();
        return instance;
    }
}
