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
 * ApplicationMarshaller
 */
public class ApplicationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Application application, StructuredJsonGenerator jsonGenerator) {

        if (application == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (application.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(application.getName());
            }
            if (application.getDisplayName() != null) {
                jsonGenerator.writeFieldName("DisplayName").writeValue(application.getDisplayName());
            }
            if (application.getIconURL() != null) {
                jsonGenerator.writeFieldName("IconURL").writeValue(application.getIconURL());
            }
            if (application.getLaunchPath() != null) {
                jsonGenerator.writeFieldName("LaunchPath").writeValue(application.getLaunchPath());
            }
            if (application.getLaunchParameters() != null) {
                jsonGenerator.writeFieldName("LaunchParameters").writeValue(application.getLaunchParameters());
            }
            if (application.getEnabled() != null) {
                jsonGenerator.writeFieldName("Enabled").writeValue(application.getEnabled());
            }

            java.util.Map<String, String> metadataMap = application.getMetadata();
            if (metadataMap != null) {
                jsonGenerator.writeFieldName("Metadata");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> metadataMapValue : metadataMap.entrySet()) {
                    if (metadataMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(metadataMapValue.getKey());

                        jsonGenerator.writeValue(metadataMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ApplicationJsonMarshaller instance;

    public static ApplicationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ApplicationJsonMarshaller();
        return instance;
    }

}
