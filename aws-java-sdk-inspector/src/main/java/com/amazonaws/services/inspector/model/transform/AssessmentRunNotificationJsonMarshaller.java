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
package com.amazonaws.services.inspector.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * AssessmentRunNotificationMarshaller
 */
public class AssessmentRunNotificationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(AssessmentRunNotification assessmentRunNotification, StructuredJsonGenerator jsonGenerator) {

        if (assessmentRunNotification == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (assessmentRunNotification.getDate() != null) {
                jsonGenerator.writeFieldName("date").writeValue(assessmentRunNotification.getDate());
            }
            if (assessmentRunNotification.getEvent() != null) {
                jsonGenerator.writeFieldName("event").writeValue(assessmentRunNotification.getEvent());
            }
            if (assessmentRunNotification.getMessage() != null) {
                jsonGenerator.writeFieldName("message").writeValue(assessmentRunNotification.getMessage());
            }
            if (assessmentRunNotification.getError() != null) {
                jsonGenerator.writeFieldName("error").writeValue(assessmentRunNotification.getError());
            }
            if (assessmentRunNotification.getSnsTopicArn() != null) {
                jsonGenerator.writeFieldName("snsTopicArn").writeValue(assessmentRunNotification.getSnsTopicArn());
            }
            if (assessmentRunNotification.getSnsPublishStatusCode() != null) {
                jsonGenerator.writeFieldName("snsPublishStatusCode").writeValue(assessmentRunNotification.getSnsPublishStatusCode());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AssessmentRunNotificationJsonMarshaller instance;

    public static AssessmentRunNotificationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AssessmentRunNotificationJsonMarshaller();
        return instance;
    }

}
