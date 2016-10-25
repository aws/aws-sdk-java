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
package com.amazonaws.services.elastictranscoder.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elastictranscoder.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * NotificationsMarshaller
 */
public class NotificationsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Notifications notifications, StructuredJsonGenerator jsonGenerator) {

        if (notifications == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (notifications.getProgressing() != null) {
                jsonGenerator.writeFieldName("Progressing").writeValue(notifications.getProgressing());
            }
            if (notifications.getCompleted() != null) {
                jsonGenerator.writeFieldName("Completed").writeValue(notifications.getCompleted());
            }
            if (notifications.getWarning() != null) {
                jsonGenerator.writeFieldName("Warning").writeValue(notifications.getWarning());
            }
            if (notifications.getError() != null) {
                jsonGenerator.writeFieldName("Error").writeValue(notifications.getError());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static NotificationsJsonMarshaller instance;

    public static NotificationsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NotificationsJsonMarshaller();
        return instance;
    }

}
