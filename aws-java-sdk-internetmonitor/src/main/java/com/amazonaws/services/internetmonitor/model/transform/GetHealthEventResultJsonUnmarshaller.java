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
package com.amazonaws.services.internetmonitor.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.internetmonitor.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetHealthEventResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetHealthEventResultJsonUnmarshaller implements Unmarshaller<GetHealthEventResult, JsonUnmarshallerContext> {

    public GetHealthEventResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetHealthEventResult getHealthEventResult = new GetHealthEventResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getHealthEventResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("EventArn", targetDepth)) {
                    context.nextToken();
                    getHealthEventResult.setEventArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EventId", targetDepth)) {
                    context.nextToken();
                    getHealthEventResult.setEventId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartedAt", targetDepth)) {
                    context.nextToken();
                    getHealthEventResult.setStartedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("EndedAt", targetDepth)) {
                    context.nextToken();
                    getHealthEventResult.setEndedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    getHealthEventResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedAt", targetDepth)) {
                    context.nextToken();
                    getHealthEventResult.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("ImpactedLocations", targetDepth)) {
                    context.nextToken();
                    getHealthEventResult.setImpactedLocations(new ListUnmarshaller<ImpactedLocation>(ImpactedLocationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    getHealthEventResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PercentOfTotalTrafficImpacted", targetDepth)) {
                    context.nextToken();
                    getHealthEventResult.setPercentOfTotalTrafficImpacted(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("ImpactType", targetDepth)) {
                    context.nextToken();
                    getHealthEventResult.setImpactType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HealthScoreThreshold", targetDepth)) {
                    context.nextToken();
                    getHealthEventResult.setHealthScoreThreshold(context.getUnmarshaller(Double.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getHealthEventResult;
    }

    private static GetHealthEventResultJsonUnmarshaller instance;

    public static GetHealthEventResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetHealthEventResultJsonUnmarshaller();
        return instance;
    }
}
