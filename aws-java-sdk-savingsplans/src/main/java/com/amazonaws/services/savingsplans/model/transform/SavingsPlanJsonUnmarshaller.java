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
 * SavingsPlan JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SavingsPlanJsonUnmarshaller implements Unmarshaller<SavingsPlan, JsonUnmarshallerContext> {

    public SavingsPlan unmarshall(JsonUnmarshallerContext context) throws Exception {
        SavingsPlan savingsPlan = new SavingsPlan();

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
                    savingsPlan.setOfferingId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("savingsPlanId", targetDepth)) {
                    context.nextToken();
                    savingsPlan.setSavingsPlanId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("savingsPlanArn", targetDepth)) {
                    context.nextToken();
                    savingsPlan.setSavingsPlanArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    savingsPlan.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("start", targetDepth)) {
                    context.nextToken();
                    savingsPlan.setStart(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("end", targetDepth)) {
                    context.nextToken();
                    savingsPlan.setEnd(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    context.nextToken();
                    savingsPlan.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("region", targetDepth)) {
                    context.nextToken();
                    savingsPlan.setRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ec2InstanceFamily", targetDepth)) {
                    context.nextToken();
                    savingsPlan.setEc2InstanceFamily(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("savingsPlanType", targetDepth)) {
                    context.nextToken();
                    savingsPlan.setSavingsPlanType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("paymentOption", targetDepth)) {
                    context.nextToken();
                    savingsPlan.setPaymentOption(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("productTypes", targetDepth)) {
                    context.nextToken();
                    savingsPlan.setProductTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("currency", targetDepth)) {
                    context.nextToken();
                    savingsPlan.setCurrency(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("commitment", targetDepth)) {
                    context.nextToken();
                    savingsPlan.setCommitment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("upfrontPaymentAmount", targetDepth)) {
                    context.nextToken();
                    savingsPlan.setUpfrontPaymentAmount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("recurringPaymentAmount", targetDepth)) {
                    context.nextToken();
                    savingsPlan.setRecurringPaymentAmount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("termDurationInSeconds", targetDepth)) {
                    context.nextToken();
                    savingsPlan.setTermDurationInSeconds(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    savingsPlan.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return savingsPlan;
    }

    private static SavingsPlanJsonUnmarshaller instance;

    public static SavingsPlanJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SavingsPlanJsonUnmarshaller();
        return instance;
    }
}
