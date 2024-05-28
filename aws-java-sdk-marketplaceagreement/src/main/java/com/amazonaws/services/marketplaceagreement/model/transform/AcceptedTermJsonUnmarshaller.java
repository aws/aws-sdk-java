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
package com.amazonaws.services.marketplaceagreement.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.marketplaceagreement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AcceptedTerm JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AcceptedTermJsonUnmarshaller implements Unmarshaller<AcceptedTerm, JsonUnmarshallerContext> {

    public AcceptedTerm unmarshall(JsonUnmarshallerContext context) throws Exception {
        AcceptedTerm acceptedTerm = new AcceptedTerm();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("byolPricingTerm", targetDepth)) {
                    context.nextToken();
                    acceptedTerm.setByolPricingTerm(ByolPricingTermJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("configurableUpfrontPricingTerm", targetDepth)) {
                    context.nextToken();
                    acceptedTerm.setConfigurableUpfrontPricingTerm(ConfigurableUpfrontPricingTermJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("fixedUpfrontPricingTerm", targetDepth)) {
                    context.nextToken();
                    acceptedTerm.setFixedUpfrontPricingTerm(FixedUpfrontPricingTermJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("freeTrialPricingTerm", targetDepth)) {
                    context.nextToken();
                    acceptedTerm.setFreeTrialPricingTerm(FreeTrialPricingTermJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("legalTerm", targetDepth)) {
                    context.nextToken();
                    acceptedTerm.setLegalTerm(LegalTermJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("paymentScheduleTerm", targetDepth)) {
                    context.nextToken();
                    acceptedTerm.setPaymentScheduleTerm(PaymentScheduleTermJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("recurringPaymentTerm", targetDepth)) {
                    context.nextToken();
                    acceptedTerm.setRecurringPaymentTerm(RecurringPaymentTermJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("renewalTerm", targetDepth)) {
                    context.nextToken();
                    acceptedTerm.setRenewalTerm(RenewalTermJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("supportTerm", targetDepth)) {
                    context.nextToken();
                    acceptedTerm.setSupportTerm(SupportTermJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("usageBasedPricingTerm", targetDepth)) {
                    context.nextToken();
                    acceptedTerm.setUsageBasedPricingTerm(UsageBasedPricingTermJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("validityTerm", targetDepth)) {
                    context.nextToken();
                    acceptedTerm.setValidityTerm(ValidityTermJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return acceptedTerm;
    }

    private static AcceptedTermJsonUnmarshaller instance;

    public static AcceptedTermJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AcceptedTermJsonUnmarshaller();
        return instance;
    }
}
