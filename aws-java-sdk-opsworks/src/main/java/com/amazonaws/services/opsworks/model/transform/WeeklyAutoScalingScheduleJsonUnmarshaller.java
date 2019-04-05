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
package com.amazonaws.services.opsworks.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * WeeklyAutoScalingSchedule JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WeeklyAutoScalingScheduleJsonUnmarshaller implements Unmarshaller<WeeklyAutoScalingSchedule, JsonUnmarshallerContext> {

    public WeeklyAutoScalingSchedule unmarshall(JsonUnmarshallerContext context) throws Exception {
        WeeklyAutoScalingSchedule weeklyAutoScalingSchedule = new WeeklyAutoScalingSchedule();

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
                if (context.testExpression("Monday", targetDepth)) {
                    context.nextToken();
                    weeklyAutoScalingSchedule.setMonday(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("Tuesday", targetDepth)) {
                    context.nextToken();
                    weeklyAutoScalingSchedule.setTuesday(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("Wednesday", targetDepth)) {
                    context.nextToken();
                    weeklyAutoScalingSchedule.setWednesday(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("Thursday", targetDepth)) {
                    context.nextToken();
                    weeklyAutoScalingSchedule.setThursday(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("Friday", targetDepth)) {
                    context.nextToken();
                    weeklyAutoScalingSchedule.setFriday(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("Saturday", targetDepth)) {
                    context.nextToken();
                    weeklyAutoScalingSchedule.setSaturday(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("Sunday", targetDepth)) {
                    context.nextToken();
                    weeklyAutoScalingSchedule.setSunday(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return weeklyAutoScalingSchedule;
    }

    private static WeeklyAutoScalingScheduleJsonUnmarshaller instance;

    public static WeeklyAutoScalingScheduleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WeeklyAutoScalingScheduleJsonUnmarshaller();
        return instance;
    }
}
