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
package com.amazonaws.services.ec2.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * CapacityBlockOffering StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CapacityBlockOfferingStaxUnmarshaller implements Unmarshaller<CapacityBlockOffering, StaxUnmarshallerContext> {

    public CapacityBlockOffering unmarshall(StaxUnmarshallerContext context) throws Exception {
        CapacityBlockOffering capacityBlockOffering = new CapacityBlockOffering();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return capacityBlockOffering;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("capacityBlockOfferingId", targetDepth)) {
                    capacityBlockOffering.setCapacityBlockOfferingId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceType", targetDepth)) {
                    capacityBlockOffering.setInstanceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("availabilityZone", targetDepth)) {
                    capacityBlockOffering.setAvailabilityZone(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceCount", targetDepth)) {
                    capacityBlockOffering.setInstanceCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("startDate", targetDepth)) {
                    capacityBlockOffering.setStartDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("endDate", targetDepth)) {
                    capacityBlockOffering.setEndDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("capacityBlockDurationHours", targetDepth)) {
                    capacityBlockOffering.setCapacityBlockDurationHours(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("upfrontFee", targetDepth)) {
                    capacityBlockOffering.setUpfrontFee(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("currencyCode", targetDepth)) {
                    capacityBlockOffering.setCurrencyCode(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tenancy", targetDepth)) {
                    capacityBlockOffering.setTenancy(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return capacityBlockOffering;
                }
            }
        }
    }

    private static CapacityBlockOfferingStaxUnmarshaller instance;

    public static CapacityBlockOfferingStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CapacityBlockOfferingStaxUnmarshaller();
        return instance;
    }
}
