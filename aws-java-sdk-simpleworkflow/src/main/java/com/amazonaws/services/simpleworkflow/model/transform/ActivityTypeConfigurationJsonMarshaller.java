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
 * ActivityTypeConfigurationMarshaller
 */
public class ActivityTypeConfigurationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ActivityTypeConfiguration activityTypeConfiguration, StructuredJsonGenerator jsonGenerator) {

        if (activityTypeConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (activityTypeConfiguration.getDefaultTaskStartToCloseTimeout() != null) {
                jsonGenerator.writeFieldName("defaultTaskStartToCloseTimeout").writeValue(activityTypeConfiguration.getDefaultTaskStartToCloseTimeout());
            }
            if (activityTypeConfiguration.getDefaultTaskHeartbeatTimeout() != null) {
                jsonGenerator.writeFieldName("defaultTaskHeartbeatTimeout").writeValue(activityTypeConfiguration.getDefaultTaskHeartbeatTimeout());
            }
            if (activityTypeConfiguration.getDefaultTaskList() != null) {
                jsonGenerator.writeFieldName("defaultTaskList");
                TaskListJsonMarshaller.getInstance().marshall(activityTypeConfiguration.getDefaultTaskList(), jsonGenerator);
            }
            if (activityTypeConfiguration.getDefaultTaskPriority() != null) {
                jsonGenerator.writeFieldName("defaultTaskPriority").writeValue(activityTypeConfiguration.getDefaultTaskPriority());
            }
            if (activityTypeConfiguration.getDefaultTaskScheduleToStartTimeout() != null) {
                jsonGenerator.writeFieldName("defaultTaskScheduleToStartTimeout").writeValue(activityTypeConfiguration.getDefaultTaskScheduleToStartTimeout());
            }
            if (activityTypeConfiguration.getDefaultTaskScheduleToCloseTimeout() != null) {
                jsonGenerator.writeFieldName("defaultTaskScheduleToCloseTimeout").writeValue(activityTypeConfiguration.getDefaultTaskScheduleToCloseTimeout());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ActivityTypeConfigurationJsonMarshaller instance;

    public static ActivityTypeConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ActivityTypeConfigurationJsonMarshaller();
        return instance;
    }

}
