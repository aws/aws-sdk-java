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
 * ActivityTaskCanceledEventAttributesMarshaller
 */
public class ActivityTaskCanceledEventAttributesJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ActivityTaskCanceledEventAttributes activityTaskCanceledEventAttributes, StructuredJsonGenerator jsonGenerator) {

        if (activityTaskCanceledEventAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (activityTaskCanceledEventAttributes.getDetails() != null) {
                jsonGenerator.writeFieldName("details").writeValue(activityTaskCanceledEventAttributes.getDetails());
            }
            if (activityTaskCanceledEventAttributes.getScheduledEventId() != null) {
                jsonGenerator.writeFieldName("scheduledEventId").writeValue(activityTaskCanceledEventAttributes.getScheduledEventId());
            }
            if (activityTaskCanceledEventAttributes.getStartedEventId() != null) {
                jsonGenerator.writeFieldName("startedEventId").writeValue(activityTaskCanceledEventAttributes.getStartedEventId());
            }
            if (activityTaskCanceledEventAttributes.getLatestCancelRequestedEventId() != null) {
                jsonGenerator.writeFieldName("latestCancelRequestedEventId").writeValue(activityTaskCanceledEventAttributes.getLatestCancelRequestedEventId());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ActivityTaskCanceledEventAttributesJsonMarshaller instance;

    public static ActivityTaskCanceledEventAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ActivityTaskCanceledEventAttributesJsonMarshaller();
        return instance;
    }

}
