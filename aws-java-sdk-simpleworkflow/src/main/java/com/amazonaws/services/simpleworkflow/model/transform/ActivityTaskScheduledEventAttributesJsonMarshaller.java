/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simpleworkflow.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ActivityTaskScheduledEventAttributesMarshaller
 */
public class ActivityTaskScheduledEventAttributesJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ActivityTaskScheduledEventAttributes activityTaskScheduledEventAttributes, StructuredJsonGenerator jsonGenerator) {

        if (activityTaskScheduledEventAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (activityTaskScheduledEventAttributes.getActivityType() != null) {
                jsonGenerator.writeFieldName("activityType");
                ActivityTypeJsonMarshaller.getInstance().marshall(activityTaskScheduledEventAttributes.getActivityType(), jsonGenerator);
            }
            if (activityTaskScheduledEventAttributes.getActivityId() != null) {
                jsonGenerator.writeFieldName("activityId").writeValue(activityTaskScheduledEventAttributes.getActivityId());
            }
            if (activityTaskScheduledEventAttributes.getInput() != null) {
                jsonGenerator.writeFieldName("input").writeValue(activityTaskScheduledEventAttributes.getInput());
            }
            if (activityTaskScheduledEventAttributes.getControl() != null) {
                jsonGenerator.writeFieldName("control").writeValue(activityTaskScheduledEventAttributes.getControl());
            }
            if (activityTaskScheduledEventAttributes.getScheduleToStartTimeout() != null) {
                jsonGenerator.writeFieldName("scheduleToStartTimeout").writeValue(activityTaskScheduledEventAttributes.getScheduleToStartTimeout());
            }
            if (activityTaskScheduledEventAttributes.getScheduleToCloseTimeout() != null) {
                jsonGenerator.writeFieldName("scheduleToCloseTimeout").writeValue(activityTaskScheduledEventAttributes.getScheduleToCloseTimeout());
            }
            if (activityTaskScheduledEventAttributes.getStartToCloseTimeout() != null) {
                jsonGenerator.writeFieldName("startToCloseTimeout").writeValue(activityTaskScheduledEventAttributes.getStartToCloseTimeout());
            }
            if (activityTaskScheduledEventAttributes.getTaskList() != null) {
                jsonGenerator.writeFieldName("taskList");
                TaskListJsonMarshaller.getInstance().marshall(activityTaskScheduledEventAttributes.getTaskList(), jsonGenerator);
            }
            if (activityTaskScheduledEventAttributes.getTaskPriority() != null) {
                jsonGenerator.writeFieldName("taskPriority").writeValue(activityTaskScheduledEventAttributes.getTaskPriority());
            }
            if (activityTaskScheduledEventAttributes.getDecisionTaskCompletedEventId() != null) {
                jsonGenerator.writeFieldName("decisionTaskCompletedEventId").writeValue(activityTaskScheduledEventAttributes.getDecisionTaskCompletedEventId());
            }
            if (activityTaskScheduledEventAttributes.getHeartbeatTimeout() != null) {
                jsonGenerator.writeFieldName("heartbeatTimeout").writeValue(activityTaskScheduledEventAttributes.getHeartbeatTimeout());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ActivityTaskScheduledEventAttributesJsonMarshaller instance;

    public static ActivityTaskScheduledEventAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ActivityTaskScheduledEventAttributesJsonMarshaller();
        return instance;
    }

}
