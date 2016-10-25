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
package com.amazonaws.services.devicefarm.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.devicefarm.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * DevicePoolCompatibilityResultMarshaller
 */
public class DevicePoolCompatibilityResultJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(DevicePoolCompatibilityResult devicePoolCompatibilityResult, StructuredJsonGenerator jsonGenerator) {

        if (devicePoolCompatibilityResult == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (devicePoolCompatibilityResult.getDevice() != null) {
                jsonGenerator.writeFieldName("device");
                DeviceJsonMarshaller.getInstance().marshall(devicePoolCompatibilityResult.getDevice(), jsonGenerator);
            }
            if (devicePoolCompatibilityResult.getCompatible() != null) {
                jsonGenerator.writeFieldName("compatible").writeValue(devicePoolCompatibilityResult.getCompatible());
            }

            java.util.List<IncompatibilityMessage> incompatibilityMessagesList = devicePoolCompatibilityResult.getIncompatibilityMessages();
            if (incompatibilityMessagesList != null) {
                jsonGenerator.writeFieldName("incompatibilityMessages");
                jsonGenerator.writeStartArray();
                for (IncompatibilityMessage incompatibilityMessagesListValue : incompatibilityMessagesList) {
                    if (incompatibilityMessagesListValue != null) {

                        IncompatibilityMessageJsonMarshaller.getInstance().marshall(incompatibilityMessagesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DevicePoolCompatibilityResultJsonMarshaller instance;

    public static DevicePoolCompatibilityResultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DevicePoolCompatibilityResultJsonMarshaller();
        return instance;
    }

}
