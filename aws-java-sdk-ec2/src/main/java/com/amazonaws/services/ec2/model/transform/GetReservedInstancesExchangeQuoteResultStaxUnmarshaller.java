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
 * GetReservedInstancesExchangeQuoteResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetReservedInstancesExchangeQuoteResultStaxUnmarshaller implements Unmarshaller<GetReservedInstancesExchangeQuoteResult, StaxUnmarshallerContext> {

    public GetReservedInstancesExchangeQuoteResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        GetReservedInstancesExchangeQuoteResult getReservedInstancesExchangeQuoteResult = new GetReservedInstancesExchangeQuoteResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return getReservedInstancesExchangeQuoteResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("currencyCode", targetDepth)) {
                    getReservedInstancesExchangeQuoteResult.setCurrencyCode(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("isValidExchange", targetDepth)) {
                    getReservedInstancesExchangeQuoteResult.setIsValidExchange(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("outputReservedInstancesWillExpireAt", targetDepth)) {
                    getReservedInstancesExchangeQuoteResult.setOutputReservedInstancesWillExpireAt(DateStaxUnmarshallerFactory.getInstance("iso8601")
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("paymentDue", targetDepth)) {
                    getReservedInstancesExchangeQuoteResult.setPaymentDue(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("reservedInstanceValueRollup", targetDepth)) {
                    getReservedInstancesExchangeQuoteResult.setReservedInstanceValueRollup(ReservationValueStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("reservedInstanceValueSet", targetDepth)) {
                    getReservedInstancesExchangeQuoteResult.withReservedInstanceValueSet(new ArrayList<ReservedInstanceReservationValue>());
                    continue;
                }

                if (context.testExpression("reservedInstanceValueSet/item", targetDepth)) {
                    getReservedInstancesExchangeQuoteResult.withReservedInstanceValueSet(ReservedInstanceReservationValueStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("targetConfigurationValueRollup", targetDepth)) {
                    getReservedInstancesExchangeQuoteResult.setTargetConfigurationValueRollup(ReservationValueStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("targetConfigurationValueSet", targetDepth)) {
                    getReservedInstancesExchangeQuoteResult.withTargetConfigurationValueSet(new ArrayList<TargetReservationValue>());
                    continue;
                }

                if (context.testExpression("targetConfigurationValueSet/item", targetDepth)) {
                    getReservedInstancesExchangeQuoteResult.withTargetConfigurationValueSet(TargetReservationValueStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }

                if (context.testExpression("validationFailureReason", targetDepth)) {
                    getReservedInstancesExchangeQuoteResult.setValidationFailureReason(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return getReservedInstancesExchangeQuoteResult;
                }
            }
        }
    }

    private static GetReservedInstancesExchangeQuoteResultStaxUnmarshaller instance;

    public static GetReservedInstancesExchangeQuoteResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetReservedInstancesExchangeQuoteResultStaxUnmarshaller();
        return instance;
    }
}
