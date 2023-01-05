/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iottwinmaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iottwinmaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PricingPlan JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PricingPlanJsonUnmarshaller implements Unmarshaller<PricingPlan, JsonUnmarshallerContext> {

    public PricingPlan unmarshall(JsonUnmarshallerContext context) throws Exception {
        PricingPlan pricingPlan = new PricingPlan();

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
                if (context.testExpression("billableEntityCount", targetDepth)) {
                    context.nextToken();
                    pricingPlan.setBillableEntityCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("bundleInformation", targetDepth)) {
                    context.nextToken();
                    pricingPlan.setBundleInformation(BundleInformationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("effectiveDateTime", targetDepth)) {
                    context.nextToken();
                    pricingPlan.setEffectiveDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("pricingMode", targetDepth)) {
                    context.nextToken();
                    pricingPlan.setPricingMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updateDateTime", targetDepth)) {
                    context.nextToken();
                    pricingPlan.setUpdateDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updateReason", targetDepth)) {
                    context.nextToken();
                    pricingPlan.setUpdateReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return pricingPlan;
    }

    private static PricingPlanJsonUnmarshaller instance;

    public static PricingPlanJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PricingPlanJsonUnmarshaller();
        return instance;
    }
}
