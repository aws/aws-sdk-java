/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.savingsplans.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.savingsplans.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SavingsPlanOffering JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SavingsPlanOfferingJsonUnmarshaller implements Unmarshaller<SavingsPlanOffering, JsonUnmarshallerContext> {

    public SavingsPlanOffering unmarshall(JsonUnmarshallerContext context) throws Exception {
        SavingsPlanOffering savingsPlanOffering = new SavingsPlanOffering();

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
                if (context.testExpression("offeringId", targetDepth)) {
                    context.nextToken();
                    savingsPlanOffering.setOfferingId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("productTypes", targetDepth)) {
                    context.nextToken();
                    savingsPlanOffering.setProductTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("planType", targetDepth)) {
                    context.nextToken();
                    savingsPlanOffering.setPlanType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    savingsPlanOffering.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("paymentOption", targetDepth)) {
                    context.nextToken();
                    savingsPlanOffering.setPaymentOption(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("durationSeconds", targetDepth)) {
                    context.nextToken();
                    savingsPlanOffering.setDurationSeconds(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("currency", targetDepth)) {
                    context.nextToken();
                    savingsPlanOffering.setCurrency(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serviceCode", targetDepth)) {
                    context.nextToken();
                    savingsPlanOffering.setServiceCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("usageType", targetDepth)) {
                    context.nextToken();
                    savingsPlanOffering.setUsageType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("operation", targetDepth)) {
                    context.nextToken();
                    savingsPlanOffering.setOperation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("properties", targetDepth)) {
                    context.nextToken();
                    savingsPlanOffering.setProperties(new ListUnmarshaller<SavingsPlanOfferingProperty>(SavingsPlanOfferingPropertyJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return savingsPlanOffering;
    }

    private static SavingsPlanOfferingJsonUnmarshaller instance;

    public static SavingsPlanOfferingJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SavingsPlanOfferingJsonUnmarshaller();
        return instance;
    }
}
