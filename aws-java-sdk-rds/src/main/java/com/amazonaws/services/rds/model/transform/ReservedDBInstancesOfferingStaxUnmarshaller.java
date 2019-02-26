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
 * ReservedDBInstancesOffering StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservedDBInstancesOfferingStaxUnmarshaller implements Unmarshaller<ReservedDBInstancesOffering, StaxUnmarshallerContext> {

    public ReservedDBInstancesOffering unmarshall(StaxUnmarshallerContext context) throws Exception {
        ReservedDBInstancesOffering reservedDBInstancesOffering = new ReservedDBInstancesOffering();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 3;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return reservedDBInstancesOffering;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ReservedDBInstancesOfferingId", targetDepth)) {
                    reservedDBInstancesOffering.setReservedDBInstancesOfferingId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBInstanceClass", targetDepth)) {
                    reservedDBInstancesOffering.setDBInstanceClass(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Duration", targetDepth)) {
                    reservedDBInstancesOffering.setDuration(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("FixedPrice", targetDepth)) {
                    reservedDBInstancesOffering.setFixedPrice(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("UsagePrice", targetDepth)) {
                    reservedDBInstancesOffering.setUsagePrice(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CurrencyCode", targetDepth)) {
                    reservedDBInstancesOffering.setCurrencyCode(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ProductDescription", targetDepth)) {
                    reservedDBInstancesOffering.setProductDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("OfferingType", targetDepth)) {
                    reservedDBInstancesOffering.setOfferingType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MultiAZ", targetDepth)) {
                    reservedDBInstancesOffering.setMultiAZ(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RecurringCharges", targetDepth)) {
                    reservedDBInstancesOffering.withRecurringCharges(new ArrayList<RecurringCharge>());
                    continue;
                }

                if (context.testExpression("RecurringCharges/RecurringCharge", targetDepth)) {
                    reservedDBInstancesOffering.withRecurringCharges(RecurringChargeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return reservedDBInstancesOffering;
                }
            }
        }
    }

    private static ReservedDBInstancesOfferingStaxUnmarshaller instance;

    public static ReservedDBInstancesOfferingStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReservedDBInstancesOfferingStaxUnmarshaller();
        return instance;
    }
}
