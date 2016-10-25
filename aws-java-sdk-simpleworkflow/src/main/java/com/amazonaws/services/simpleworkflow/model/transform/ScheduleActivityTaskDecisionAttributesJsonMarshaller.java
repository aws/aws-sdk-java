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
 * ScheduleActivityTaskDecisionAttributesMarshaller
 */
public class ScheduleActivityTaskDecisionAttributesJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ScheduleActivityTaskDecisionAttributes scheduleActivityTaskDecisionAttributes, StructuredJsonGenerator jsonGenerator) {

        if (scheduleActivityTaskDecisionAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (scheduleActivityTaskDecisionAttributes.getActivityType() != null) {
                jsonGenerator.writeFieldName("activityType");
                ActivityTypeJsonMarshaller.getInstance().marshall(scheduleActivityTaskDecisionAttributes.getActivityType(), jsonGenerator);
            }
            if (scheduleActivityTaskDecisionAttributes.getActivityId() != null) {
                jsonGenerator.writeFieldName("activityId").writeValue(scheduleActivityTaskDecisionAttributes.getActivityId());
            }
            if (scheduleActivityTaskDecisionAttributes.getControl() != null) {
                jsonGenerator.writeFieldName("control").writeValue(scheduleActivityTaskDecisionAttributes.getControl());
            }
            if (scheduleActivityTaskDecisionAttributes.getInput() != null) {
                jsonGenerator.writeFieldName("input").writeValue(scheduleActivityTaskDecisionAttributes.getInput());
            }
            if (scheduleActivityTaskDecisionAttributes.getScheduleToCloseTimeout() != null) {
                jsonGenerator.writeFieldName("scheduleToCloseTimeout").writeValue(scheduleActivityTaskDecisionAttributes.getScheduleToCloseTimeout());
            }
            if (scheduleActivityTaskDecisionAttributes.getTaskList() != null) {
                jsonGenerator.writeFieldName("taskList");
                TaskListJsonMarshaller.getInstance().marshall(scheduleActivityTaskDecisionAttributes.getTaskList(), jsonGenerator);
            }
            if (scheduleActivityTaskDecisionAttributes.getTaskPriority() != null) {
                jsonGenerator.writeFieldName("taskPriority").writeValue(scheduleActivityTaskDecisionAttributes.getTaskPriority());
            }
            if (scheduleActivityTaskDecisionAttributes.getScheduleToStartTimeout() != null) {
                jsonGenerator.writeFieldName("scheduleToStartTimeout").writeValue(scheduleActivityTaskDecisionAttributes.getScheduleToStartTimeout());
            }
            if (scheduleActivityTaskDecisionAttributes.getStartToCloseTimeout() != null) {
                jsonGenerator.writeFieldName("startToCloseTimeout").writeValue(scheduleActivityTaskDecisionAttributes.getStartToCloseTimeout());
            }
            if (scheduleActivityTaskDecisionAttributes.getHeartbeatTimeout() != null) {
                jsonGenerator.writeFieldName("heartbeatTimeout").writeValue(scheduleActivityTaskDecisionAttributes.getHeartbeatTimeout());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ScheduleActivityTaskDecisionAttributesJsonMarshaller instance;

    public static ScheduleActivityTaskDecisionAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ScheduleActivityTaskDecisionAttributesJsonMarshaller();
        return instance;
    }

}
