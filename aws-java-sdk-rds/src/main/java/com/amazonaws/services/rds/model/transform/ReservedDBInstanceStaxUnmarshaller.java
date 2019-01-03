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
 * ReservedDBInstance StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservedDBInstanceStaxUnmarshaller implements Unmarshaller<ReservedDBInstance, StaxUnmarshallerContext> {

    public ReservedDBInstance unmarshall(StaxUnmarshallerContext context) throws Exception {
        ReservedDBInstance reservedDBInstance = new ReservedDBInstance();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 3;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return reservedDBInstance;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ReservedDBInstanceId", targetDepth)) {
                    reservedDBInstance.setReservedDBInstanceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ReservedDBInstancesOfferingId", targetDepth)) {
                    reservedDBInstance.setReservedDBInstancesOfferingId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBInstanceClass", targetDepth)) {
                    reservedDBInstance.setDBInstanceClass(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StartTime", targetDepth)) {
                    reservedDBInstance.setStartTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("Duration", targetDepth)) {
                    reservedDBInstance.setDuration(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("FixedPrice", targetDepth)) {
                    reservedDBInstance.setFixedPrice(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("UsagePrice", targetDepth)) {
                    reservedDBInstance.setUsagePrice(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CurrencyCode", targetDepth)) {
                    reservedDBInstance.setCurrencyCode(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBInstanceCount", targetDepth)) {
                    reservedDBInstance.setDBInstanceCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ProductDescription", targetDepth)) {
                    reservedDBInstance.setProductDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("OfferingType", targetDepth)) {
                    reservedDBInstance.setOfferingType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MultiAZ", targetDepth)) {
                    reservedDBInstance.setMultiAZ(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("State", targetDepth)) {
                    reservedDBInstance.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RecurringCharges", targetDepth)) {
                    reservedDBInstance.withRecurringCharges(new ArrayList<RecurringCharge>());
                    continue;
                }

                if (context.testExpression("RecurringCharges/RecurringCharge", targetDepth)) {
                    reservedDBInstance.withRecurringCharges(RecurringChargeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ReservedDBInstanceArn", targetDepth)) {
                    reservedDBInstance.setReservedDBInstanceArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return reservedDBInstance;
                }
            }
        }
    }

    private static ReservedDBInstanceStaxUnmarshaller instance;

    public static ReservedDBInstanceStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReservedDBInstanceStaxUnmarshaller();
        return instance;
    }
}
