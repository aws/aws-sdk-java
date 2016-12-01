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
package com.amazonaws.services.stepfunctions.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.stepfunctions.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ActivityScheduledEventDetailsMarshaller
 */
public class ActivityScheduledEventDetailsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ActivityScheduledEventDetails activityScheduledEventDetails, StructuredJsonGenerator jsonGenerator) {

        if (activityScheduledEventDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (activityScheduledEventDetails.getResource() != null) {
                jsonGenerator.writeFieldName("resource").writeValue(activityScheduledEventDetails.getResource());
            }
            if (activityScheduledEventDetails.getInput() != null) {
                jsonGenerator.writeFieldName("input").writeValue(activityScheduledEventDetails.getInput());
            }
            if (activityScheduledEventDetails.getTimeoutInSeconds() != null) {
                jsonGenerator.writeFieldName("timeoutInSeconds").writeValue(activityScheduledEventDetails.getTimeoutInSeconds());
            }
            if (activityScheduledEventDetails.getHeartbeatInSeconds() != null) {
                jsonGenerator.writeFieldName("heartbeatInSeconds").writeValue(activityScheduledEventDetails.getHeartbeatInSeconds());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ActivityScheduledEventDetailsJsonMarshaller instance;

    public static ActivityScheduledEventDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ActivityScheduledEventDetailsJsonMarshaller();
        return instance;
    }

}
