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
package com.amazonaws.services.directory.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directory.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * RadiusSettingsMarshaller
 */
public class RadiusSettingsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(RadiusSettings radiusSettings, StructuredJsonGenerator jsonGenerator) {

        if (radiusSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            com.amazonaws.internal.SdkInternalList<String> radiusServersList = (com.amazonaws.internal.SdkInternalList<String>) radiusSettings
                    .getRadiusServers();
            if (!radiusServersList.isEmpty() || !radiusServersList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("RadiusServers");
                jsonGenerator.writeStartArray();
                for (String radiusServersListValue : radiusServersList) {
                    if (radiusServersListValue != null) {
                        jsonGenerator.writeValue(radiusServersListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (radiusSettings.getRadiusPort() != null) {
                jsonGenerator.writeFieldName("RadiusPort").writeValue(radiusSettings.getRadiusPort());
            }
            if (radiusSettings.getRadiusTimeout() != null) {
                jsonGenerator.writeFieldName("RadiusTimeout").writeValue(radiusSettings.getRadiusTimeout());
            }
            if (radiusSettings.getRadiusRetries() != null) {
                jsonGenerator.writeFieldName("RadiusRetries").writeValue(radiusSettings.getRadiusRetries());
            }
            if (radiusSettings.getSharedSecret() != null) {
                jsonGenerator.writeFieldName("SharedSecret").writeValue(radiusSettings.getSharedSecret());
            }
            if (radiusSettings.getAuthenticationProtocol() != null) {
                jsonGenerator.writeFieldName("AuthenticationProtocol").writeValue(radiusSettings.getAuthenticationProtocol());
            }
            if (radiusSettings.getDisplayLabel() != null) {
                jsonGenerator.writeFieldName("DisplayLabel").writeValue(radiusSettings.getDisplayLabel());
            }
            if (radiusSettings.getUseSameUsername() != null) {
                jsonGenerator.writeFieldName("UseSameUsername").writeValue(radiusSettings.getUseSameUsername());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static RadiusSettingsJsonMarshaller instance;

    public static RadiusSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RadiusSettingsJsonMarshaller();
        return instance;
    }

}
