/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.customerprofiles.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.customerprofiles.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ScheduledTriggerProperties JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledTriggerPropertiesJsonUnmarshaller implements Unmarshaller<ScheduledTriggerProperties, JsonUnmarshallerContext> {

    public ScheduledTriggerProperties unmarshall(JsonUnmarshallerContext context) throws Exception {
        ScheduledTriggerProperties scheduledTriggerProperties = new ScheduledTriggerProperties();

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
                if (context.testExpression("ScheduleExpression", targetDepth)) {
                    context.nextToken();
                    scheduledTriggerProperties.setScheduleExpression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataPullMode", targetDepth)) {
                    context.nextToken();
                    scheduledTriggerProperties.setDataPullMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScheduleStartTime", targetDepth)) {
                    context.nextToken();
                    scheduledTriggerProperties.setScheduleStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ScheduleEndTime", targetDepth)) {
                    context.nextToken();
                    scheduledTriggerProperties.setScheduleEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Timezone", targetDepth)) {
                    context.nextToken();
                    scheduledTriggerProperties.setTimezone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScheduleOffset", targetDepth)) {
                    context.nextToken();
                    scheduledTriggerProperties.setScheduleOffset(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("FirstExecutionFrom", targetDepth)) {
                    context.nextToken();
                    scheduledTriggerProperties.setFirstExecutionFrom(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return scheduledTriggerProperties;
    }

    private static ScheduledTriggerPropertiesJsonUnmarshaller instance;

    public static ScheduledTriggerPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ScheduledTriggerPropertiesJsonUnmarshaller();
        return instance;
    }
}
