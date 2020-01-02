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
package com.amazonaws.services.costexplorer.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.costexplorer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CurrentInstance JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CurrentInstanceJsonUnmarshaller implements Unmarshaller<CurrentInstance, JsonUnmarshallerContext> {

    public CurrentInstance unmarshall(JsonUnmarshallerContext context) throws Exception {
        CurrentInstance currentInstance = new CurrentInstance();

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
                if (context.testExpression("ResourceId", targetDepth)) {
                    context.nextToken();
                    currentInstance.setResourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    currentInstance.setTags(new ListUnmarshaller<TagValues>(TagValuesJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("ResourceDetails", targetDepth)) {
                    context.nextToken();
                    currentInstance.setResourceDetails(ResourceDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ResourceUtilization", targetDepth)) {
                    context.nextToken();
                    currentInstance.setResourceUtilization(ResourceUtilizationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ReservationCoveredHoursInLookbackPeriod", targetDepth)) {
                    context.nextToken();
                    currentInstance.setReservationCoveredHoursInLookbackPeriod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SavingsPlansCoveredHoursInLookbackPeriod", targetDepth)) {
                    context.nextToken();
                    currentInstance.setSavingsPlansCoveredHoursInLookbackPeriod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OnDemandHoursInLookbackPeriod", targetDepth)) {
                    context.nextToken();
                    currentInstance.setOnDemandHoursInLookbackPeriod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TotalRunningHoursInLookbackPeriod", targetDepth)) {
                    context.nextToken();
                    currentInstance.setTotalRunningHoursInLookbackPeriod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MonthlyCost", targetDepth)) {
                    context.nextToken();
                    currentInstance.setMonthlyCost(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrencyCode", targetDepth)) {
                    context.nextToken();
                    currentInstance.setCurrencyCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return currentInstance;
    }

    private static CurrentInstanceJsonUnmarshaller instance;

    public static CurrentInstanceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CurrentInstanceJsonUnmarshaller();
        return instance;
    }
}
