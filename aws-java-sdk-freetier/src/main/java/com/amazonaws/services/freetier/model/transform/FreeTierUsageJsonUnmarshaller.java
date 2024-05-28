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
package com.amazonaws.services.freetier.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.freetier.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * FreeTierUsage JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FreeTierUsageJsonUnmarshaller implements Unmarshaller<FreeTierUsage, JsonUnmarshallerContext> {

    public FreeTierUsage unmarshall(JsonUnmarshallerContext context) throws Exception {
        FreeTierUsage freeTierUsage = new FreeTierUsage();

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
                if (context.testExpression("actualUsageAmount", targetDepth)) {
                    context.nextToken();
                    freeTierUsage.setActualUsageAmount(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    freeTierUsage.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("forecastedUsageAmount", targetDepth)) {
                    context.nextToken();
                    freeTierUsage.setForecastedUsageAmount(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("freeTierType", targetDepth)) {
                    context.nextToken();
                    freeTierUsage.setFreeTierType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("limit", targetDepth)) {
                    context.nextToken();
                    freeTierUsage.setLimit(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("operation", targetDepth)) {
                    context.nextToken();
                    freeTierUsage.setOperation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("region", targetDepth)) {
                    context.nextToken();
                    freeTierUsage.setRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("service", targetDepth)) {
                    context.nextToken();
                    freeTierUsage.setService(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("unit", targetDepth)) {
                    context.nextToken();
                    freeTierUsage.setUnit(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("usageType", targetDepth)) {
                    context.nextToken();
                    freeTierUsage.setUsageType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return freeTierUsage;
    }

    private static FreeTierUsageJsonUnmarshaller instance;

    public static FreeTierUsageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FreeTierUsageJsonUnmarshaller();
        return instance;
    }
}
