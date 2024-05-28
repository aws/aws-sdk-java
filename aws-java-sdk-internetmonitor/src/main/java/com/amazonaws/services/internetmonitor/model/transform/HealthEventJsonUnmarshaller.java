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
 * HealthEvent JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HealthEventJsonUnmarshaller implements Unmarshaller<HealthEvent, JsonUnmarshallerContext> {

    public HealthEvent unmarshall(JsonUnmarshallerContext context) throws Exception {
        HealthEvent healthEvent = new HealthEvent();

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
                if (context.testExpression("EventArn", targetDepth)) {
                    context.nextToken();
                    healthEvent.setEventArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EventId", targetDepth)) {
                    context.nextToken();
                    healthEvent.setEventId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartedAt", targetDepth)) {
                    context.nextToken();
                    healthEvent.setStartedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("EndedAt", targetDepth)) {
                    context.nextToken();
                    healthEvent.setEndedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    healthEvent.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedAt", targetDepth)) {
                    context.nextToken();
                    healthEvent.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("ImpactedLocations", targetDepth)) {
                    context.nextToken();
                    healthEvent.setImpactedLocations(new ListUnmarshaller<ImpactedLocation>(ImpactedLocationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    healthEvent.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PercentOfTotalTrafficImpacted", targetDepth)) {
                    context.nextToken();
                    healthEvent.setPercentOfTotalTrafficImpacted(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("ImpactType", targetDepth)) {
                    context.nextToken();
                    healthEvent.setImpactType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HealthScoreThreshold", targetDepth)) {
                    context.nextToken();
                    healthEvent.setHealthScoreThreshold(context.getUnmarshaller(Double.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return healthEvent;
    }

    private static HealthEventJsonUnmarshaller instance;

    public static HealthEventJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HealthEventJsonUnmarshaller();
        return instance;
    }
}
