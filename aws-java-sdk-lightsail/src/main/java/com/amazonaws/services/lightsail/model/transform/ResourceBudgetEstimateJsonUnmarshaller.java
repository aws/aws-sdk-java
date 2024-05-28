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
package com.amazonaws.services.lightsail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ResourceBudgetEstimate JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceBudgetEstimateJsonUnmarshaller implements Unmarshaller<ResourceBudgetEstimate, JsonUnmarshallerContext> {

    public ResourceBudgetEstimate unmarshall(JsonUnmarshallerContext context) throws Exception {
        ResourceBudgetEstimate resourceBudgetEstimate = new ResourceBudgetEstimate();

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
                if (context.testExpression("resourceName", targetDepth)) {
                    context.nextToken();
                    resourceBudgetEstimate.setResourceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceType", targetDepth)) {
                    context.nextToken();
                    resourceBudgetEstimate.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("costEstimates", targetDepth)) {
                    context.nextToken();
                    resourceBudgetEstimate.setCostEstimates(new ListUnmarshaller<CostEstimate>(CostEstimateJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    resourceBudgetEstimate.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("endTime", targetDepth)) {
                    context.nextToken();
                    resourceBudgetEstimate.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return resourceBudgetEstimate;
    }

    private static ResourceBudgetEstimateJsonUnmarshaller instance;

    public static ResourceBudgetEstimateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResourceBudgetEstimateJsonUnmarshaller();
        return instance;
    }
}
