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
package com.amazonaws.services.pinpoint.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * MessageMarshaller
 */
public class MessageJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Message message, StructuredJsonGenerator jsonGenerator) {

        if (message == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (message.getAction() != null) {
                jsonGenerator.writeFieldName("Action").writeValue(message.getAction());
            }
            if (message.getBody() != null) {
                jsonGenerator.writeFieldName("Body").writeValue(message.getBody());
            }
            if (message.getImageIconUrl() != null) {
                jsonGenerator.writeFieldName("ImageIconUrl").writeValue(message.getImageIconUrl());
            }
            if (message.getImageUrl() != null) {
                jsonGenerator.writeFieldName("ImageUrl").writeValue(message.getImageUrl());
            }
            if (message.getJsonBody() != null) {
                jsonGenerator.writeFieldName("JsonBody").writeValue(message.getJsonBody());
            }
            if (message.getMediaUrl() != null) {
                jsonGenerator.writeFieldName("MediaUrl").writeValue(message.getMediaUrl());
            }
            if (message.getSilentPush() != null) {
                jsonGenerator.writeFieldName("SilentPush").writeValue(message.getSilentPush());
            }
            if (message.getTitle() != null) {
                jsonGenerator.writeFieldName("Title").writeValue(message.getTitle());
            }
            if (message.getUrl() != null) {
                jsonGenerator.writeFieldName("Url").writeValue(message.getUrl());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static MessageJsonMarshaller instance;

    public static MessageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MessageJsonMarshaller();
        return instance;
    }

}
