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
package com.amazonaws.services.ec2.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * Purchase StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PurchaseStaxUnmarshaller implements Unmarshaller<Purchase, StaxUnmarshallerContext> {

    public Purchase unmarshall(StaxUnmarshallerContext context) throws Exception {
        Purchase purchase = new Purchase();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return purchase;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("currencyCode", targetDepth)) {
                    purchase.setCurrencyCode(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("duration", targetDepth)) {
                    purchase.setDuration(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("hostIdSet", targetDepth)) {
                    purchase.withHostIdSet(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("hostIdSet/item", targetDepth)) {
                    purchase.withHostIdSet(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("hostReservationId", targetDepth)) {
                    purchase.setHostReservationId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("hourlyPrice", targetDepth)) {
                    purchase.setHourlyPrice(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceFamily", targetDepth)) {
                    purchase.setInstanceFamily(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("paymentOption", targetDepth)) {
                    purchase.setPaymentOption(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("upfrontPrice", targetDepth)) {
                    purchase.setUpfrontPrice(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return purchase;
                }
            }
        }
    }

    private static PurchaseStaxUnmarshaller instance;

    public static PurchaseStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new PurchaseStaxUnmarshaller();
        return instance;
    }
}
