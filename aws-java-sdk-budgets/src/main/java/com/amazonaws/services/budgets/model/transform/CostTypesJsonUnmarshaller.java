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
package com.amazonaws.services.budgets.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.budgets.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CostTypes JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CostTypesJsonUnmarshaller implements Unmarshaller<CostTypes, JsonUnmarshallerContext> {

    public CostTypes unmarshall(JsonUnmarshallerContext context) throws Exception {
        CostTypes costTypes = new CostTypes();

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
                if (context.testExpression("IncludeTax", targetDepth)) {
                    context.nextToken();
                    costTypes.setIncludeTax(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IncludeSubscription", targetDepth)) {
                    context.nextToken();
                    costTypes.setIncludeSubscription(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("UseBlended", targetDepth)) {
                    context.nextToken();
                    costTypes.setUseBlended(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IncludeRefund", targetDepth)) {
                    context.nextToken();
                    costTypes.setIncludeRefund(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IncludeCredit", targetDepth)) {
                    context.nextToken();
                    costTypes.setIncludeCredit(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IncludeUpfront", targetDepth)) {
                    context.nextToken();
                    costTypes.setIncludeUpfront(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IncludeRecurring", targetDepth)) {
                    context.nextToken();
                    costTypes.setIncludeRecurring(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IncludeOtherSubscription", targetDepth)) {
                    context.nextToken();
                    costTypes.setIncludeOtherSubscription(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IncludeSupport", targetDepth)) {
                    context.nextToken();
                    costTypes.setIncludeSupport(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IncludeDiscount", targetDepth)) {
                    context.nextToken();
                    costTypes.setIncludeDiscount(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("UseAmortized", targetDepth)) {
                    context.nextToken();
                    costTypes.setUseAmortized(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return costTypes;
    }

    private static CostTypesJsonUnmarshaller instance;

    public static CostTypesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CostTypesJsonUnmarshaller();
        return instance;
    }
}
