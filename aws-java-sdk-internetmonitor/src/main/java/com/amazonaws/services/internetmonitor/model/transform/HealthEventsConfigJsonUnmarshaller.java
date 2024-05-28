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
 * HealthEventsConfig JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HealthEventsConfigJsonUnmarshaller implements Unmarshaller<HealthEventsConfig, JsonUnmarshallerContext> {

    public HealthEventsConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        HealthEventsConfig healthEventsConfig = new HealthEventsConfig();

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
                if (context.testExpression("AvailabilityScoreThreshold", targetDepth)) {
                    context.nextToken();
                    healthEventsConfig.setAvailabilityScoreThreshold(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("PerformanceScoreThreshold", targetDepth)) {
                    context.nextToken();
                    healthEventsConfig.setPerformanceScoreThreshold(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("AvailabilityLocalHealthEventsConfig", targetDepth)) {
                    context.nextToken();
                    healthEventsConfig.setAvailabilityLocalHealthEventsConfig(LocalHealthEventsConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PerformanceLocalHealthEventsConfig", targetDepth)) {
                    context.nextToken();
                    healthEventsConfig.setPerformanceLocalHealthEventsConfig(LocalHealthEventsConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return healthEventsConfig;
    }

    private static HealthEventsConfigJsonUnmarshaller instance;

    public static HealthEventsConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HealthEventsConfigJsonUnmarshaller();
        return instance;
    }
}
