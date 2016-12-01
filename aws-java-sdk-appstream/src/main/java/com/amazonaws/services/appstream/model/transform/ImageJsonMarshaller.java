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
package com.amazonaws.services.appstream.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appstream.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ImageMarshaller
 */
public class ImageJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Image image, StructuredJsonGenerator jsonGenerator) {

        if (image == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (image.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(image.getName());
            }
            if (image.getArn() != null) {
                jsonGenerator.writeFieldName("Arn").writeValue(image.getArn());
            }
            if (image.getBaseImageArn() != null) {
                jsonGenerator.writeFieldName("BaseImageArn").writeValue(image.getBaseImageArn());
            }
            if (image.getDisplayName() != null) {
                jsonGenerator.writeFieldName("DisplayName").writeValue(image.getDisplayName());
            }
            if (image.getState() != null) {
                jsonGenerator.writeFieldName("State").writeValue(image.getState());
            }
            if (image.getVisibility() != null) {
                jsonGenerator.writeFieldName("Visibility").writeValue(image.getVisibility());
            }
            if (image.getPlatform() != null) {
                jsonGenerator.writeFieldName("Platform").writeValue(image.getPlatform());
            }
            if (image.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(image.getDescription());
            }
            if (image.getStateChangeReason() != null) {
                jsonGenerator.writeFieldName("StateChangeReason");
                ImageStateChangeReasonJsonMarshaller.getInstance().marshall(image.getStateChangeReason(), jsonGenerator);
            }

            java.util.List<Application> applicationsList = image.getApplications();
            if (applicationsList != null) {
                jsonGenerator.writeFieldName("Applications");
                jsonGenerator.writeStartArray();
                for (Application applicationsListValue : applicationsList) {
                    if (applicationsListValue != null) {

                        ApplicationJsonMarshaller.getInstance().marshall(applicationsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (image.getCreatedTime() != null) {
                jsonGenerator.writeFieldName("CreatedTime").writeValue(image.getCreatedTime());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ImageJsonMarshaller instance;

    public static ImageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ImageJsonMarshaller();
        return instance;
    }

}
