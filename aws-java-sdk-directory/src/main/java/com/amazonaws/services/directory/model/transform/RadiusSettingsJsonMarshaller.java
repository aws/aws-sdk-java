/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.directory.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.directory.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * RadiusSettingsMarshaller
 */
public class RadiusSettingsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(RadiusSettings radiusSettings, JSONWriter jsonWriter) {
        if (radiusSettings == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            com.amazonaws.internal.SdkInternalList<String> radiusServersList = (com.amazonaws.internal.SdkInternalList<String>) radiusSettings
                    .getRadiusServers();
            if (!radiusServersList.isEmpty()
                    || !radiusServersList.isAutoConstruct()) {
                jsonWriter.key("RadiusServers");
                jsonWriter.array();
                for (String radiusServersListValue : radiusServersList) {
                    if (radiusServersListValue != null) {
                        jsonWriter.value(radiusServersListValue);
                    }
                }
                jsonWriter.endArray();
            }

            if (radiusSettings.getRadiusPort() != null) {
                jsonWriter.key("RadiusPort").value(
                        radiusSettings.getRadiusPort());
            }

            if (radiusSettings.getRadiusTimeout() != null) {
                jsonWriter.key("RadiusTimeout").value(
                        radiusSettings.getRadiusTimeout());
            }

            if (radiusSettings.getRadiusRetries() != null) {
                jsonWriter.key("RadiusRetries").value(
                        radiusSettings.getRadiusRetries());
            }

            if (radiusSettings.getSharedSecret() != null) {
                jsonWriter.key("SharedSecret").value(
                        radiusSettings.getSharedSecret());
            }

            if (radiusSettings.getAuthenticationProtocol() != null) {
                jsonWriter.key("AuthenticationProtocol").value(
                        radiusSettings.getAuthenticationProtocol());
            }

            if (radiusSettings.getDisplayLabel() != null) {
                jsonWriter.key("DisplayLabel").value(
                        radiusSettings.getDisplayLabel());
            }

            if (radiusSettings.getUseSameUsername() != null) {
                jsonWriter.key("UseSameUsername").value(
                        radiusSettings.getUseSameUsername());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static RadiusSettingsJsonMarshaller instance;

    public static RadiusSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RadiusSettingsJsonMarshaller();
        return instance;
    }

}
