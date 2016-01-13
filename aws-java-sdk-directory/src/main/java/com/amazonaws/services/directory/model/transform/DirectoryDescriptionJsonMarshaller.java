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
 * DirectoryDescriptionMarshaller
 */
public class DirectoryDescriptionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(DirectoryDescription directoryDescription,
            JSONWriter jsonWriter) {
        if (directoryDescription == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (directoryDescription.getDirectoryId() != null) {
                jsonWriter.key("DirectoryId").value(
                        directoryDescription.getDirectoryId());
            }

            if (directoryDescription.getName() != null) {
                jsonWriter.key("Name").value(directoryDescription.getName());
            }

            if (directoryDescription.getShortName() != null) {
                jsonWriter.key("ShortName").value(
                        directoryDescription.getShortName());
            }

            if (directoryDescription.getSize() != null) {
                jsonWriter.key("Size").value(directoryDescription.getSize());
            }

            if (directoryDescription.getAlias() != null) {
                jsonWriter.key("Alias").value(directoryDescription.getAlias());
            }

            if (directoryDescription.getAccessUrl() != null) {
                jsonWriter.key("AccessUrl").value(
                        directoryDescription.getAccessUrl());
            }

            if (directoryDescription.getDescription() != null) {
                jsonWriter.key("Description").value(
                        directoryDescription.getDescription());
            }

            com.amazonaws.internal.SdkInternalList<String> dnsIpAddrsList = (com.amazonaws.internal.SdkInternalList<String>) directoryDescription
                    .getDnsIpAddrs();
            if (!dnsIpAddrsList.isEmpty() || !dnsIpAddrsList.isAutoConstruct()) {
                jsonWriter.key("DnsIpAddrs");
                jsonWriter.array();
                for (String dnsIpAddrsListValue : dnsIpAddrsList) {
                    if (dnsIpAddrsListValue != null) {
                        jsonWriter.value(dnsIpAddrsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            if (directoryDescription.getStage() != null) {
                jsonWriter.key("Stage").value(directoryDescription.getStage());
            }

            if (directoryDescription.getLaunchTime() != null) {
                jsonWriter.key("LaunchTime").value(
                        directoryDescription.getLaunchTime());
            }

            if (directoryDescription.getStageLastUpdatedDateTime() != null) {
                jsonWriter.key("StageLastUpdatedDateTime").value(
                        directoryDescription.getStageLastUpdatedDateTime());
            }

            if (directoryDescription.getType() != null) {
                jsonWriter.key("Type").value(directoryDescription.getType());
            }

            if (directoryDescription.getVpcSettings() != null) {
                jsonWriter.key("VpcSettings");
                DirectoryVpcSettingsDescriptionJsonMarshaller.getInstance()
                        .marshall(directoryDescription.getVpcSettings(),
                                jsonWriter);
            }

            if (directoryDescription.getConnectSettings() != null) {
                jsonWriter.key("ConnectSettings");
                DirectoryConnectSettingsDescriptionJsonMarshaller.getInstance()
                        .marshall(directoryDescription.getConnectSettings(),
                                jsonWriter);
            }

            if (directoryDescription.getRadiusSettings() != null) {
                jsonWriter.key("RadiusSettings");
                RadiusSettingsJsonMarshaller.getInstance().marshall(
                        directoryDescription.getRadiusSettings(), jsonWriter);
            }

            if (directoryDescription.getRadiusStatus() != null) {
                jsonWriter.key("RadiusStatus").value(
                        directoryDescription.getRadiusStatus());
            }

            if (directoryDescription.getStageReason() != null) {
                jsonWriter.key("StageReason").value(
                        directoryDescription.getStageReason());
            }

            if (directoryDescription.getSsoEnabled() != null) {
                jsonWriter.key("SsoEnabled").value(
                        directoryDescription.getSsoEnabled());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DirectoryDescriptionJsonMarshaller instance;

    public static DirectoryDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DirectoryDescriptionJsonMarshaller();
        return instance;
    }

}
