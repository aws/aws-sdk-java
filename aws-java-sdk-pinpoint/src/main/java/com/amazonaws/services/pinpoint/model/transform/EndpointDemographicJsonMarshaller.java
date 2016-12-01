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
 * EndpointDemographicMarshaller
 */
public class EndpointDemographicJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(EndpointDemographic endpointDemographic, StructuredJsonGenerator jsonGenerator) {

        if (endpointDemographic == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (endpointDemographic.getAppVersion() != null) {
                jsonGenerator.writeFieldName("AppVersion").writeValue(endpointDemographic.getAppVersion());
            }
            if (endpointDemographic.getLocale() != null) {
                jsonGenerator.writeFieldName("Locale").writeValue(endpointDemographic.getLocale());
            }
            if (endpointDemographic.getMake() != null) {
                jsonGenerator.writeFieldName("Make").writeValue(endpointDemographic.getMake());
            }
            if (endpointDemographic.getModel() != null) {
                jsonGenerator.writeFieldName("Model").writeValue(endpointDemographic.getModel());
            }
            if (endpointDemographic.getModelVersion() != null) {
                jsonGenerator.writeFieldName("ModelVersion").writeValue(endpointDemographic.getModelVersion());
            }
            if (endpointDemographic.getPlatform() != null) {
                jsonGenerator.writeFieldName("Platform").writeValue(endpointDemographic.getPlatform());
            }
            if (endpointDemographic.getPlatformVersion() != null) {
                jsonGenerator.writeFieldName("PlatformVersion").writeValue(endpointDemographic.getPlatformVersion());
            }
            if (endpointDemographic.getTimezone() != null) {
                jsonGenerator.writeFieldName("Timezone").writeValue(endpointDemographic.getTimezone());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static EndpointDemographicJsonMarshaller instance;

    public static EndpointDemographicJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EndpointDemographicJsonMarshaller();
        return instance;
    }

}
