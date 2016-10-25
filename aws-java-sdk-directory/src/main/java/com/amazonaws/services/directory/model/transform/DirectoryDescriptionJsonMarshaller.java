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
 * DirectoryDescriptionMarshaller
 */
public class DirectoryDescriptionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(DirectoryDescription directoryDescription, StructuredJsonGenerator jsonGenerator) {

        if (directoryDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (directoryDescription.getDirectoryId() != null) {
                jsonGenerator.writeFieldName("DirectoryId").writeValue(directoryDescription.getDirectoryId());
            }
            if (directoryDescription.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(directoryDescription.getName());
            }
            if (directoryDescription.getShortName() != null) {
                jsonGenerator.writeFieldName("ShortName").writeValue(directoryDescription.getShortName());
            }
            if (directoryDescription.getSize() != null) {
                jsonGenerator.writeFieldName("Size").writeValue(directoryDescription.getSize());
            }
            if (directoryDescription.getAlias() != null) {
                jsonGenerator.writeFieldName("Alias").writeValue(directoryDescription.getAlias());
            }
            if (directoryDescription.getAccessUrl() != null) {
                jsonGenerator.writeFieldName("AccessUrl").writeValue(directoryDescription.getAccessUrl());
            }
            if (directoryDescription.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(directoryDescription.getDescription());
            }

            com.amazonaws.internal.SdkInternalList<String> dnsIpAddrsList = (com.amazonaws.internal.SdkInternalList<String>) directoryDescription
                    .getDnsIpAddrs();
            if (!dnsIpAddrsList.isEmpty() || !dnsIpAddrsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("DnsIpAddrs");
                jsonGenerator.writeStartArray();
                for (String dnsIpAddrsListValue : dnsIpAddrsList) {
                    if (dnsIpAddrsListValue != null) {
                        jsonGenerator.writeValue(dnsIpAddrsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (directoryDescription.getStage() != null) {
                jsonGenerator.writeFieldName("Stage").writeValue(directoryDescription.getStage());
            }
            if (directoryDescription.getLaunchTime() != null) {
                jsonGenerator.writeFieldName("LaunchTime").writeValue(directoryDescription.getLaunchTime());
            }
            if (directoryDescription.getStageLastUpdatedDateTime() != null) {
                jsonGenerator.writeFieldName("StageLastUpdatedDateTime").writeValue(directoryDescription.getStageLastUpdatedDateTime());
            }
            if (directoryDescription.getType() != null) {
                jsonGenerator.writeFieldName("Type").writeValue(directoryDescription.getType());
            }
            if (directoryDescription.getVpcSettings() != null) {
                jsonGenerator.writeFieldName("VpcSettings");
                DirectoryVpcSettingsDescriptionJsonMarshaller.getInstance().marshall(directoryDescription.getVpcSettings(), jsonGenerator);
            }
            if (directoryDescription.getConnectSettings() != null) {
                jsonGenerator.writeFieldName("ConnectSettings");
                DirectoryConnectSettingsDescriptionJsonMarshaller.getInstance().marshall(directoryDescription.getConnectSettings(), jsonGenerator);
            }
            if (directoryDescription.getRadiusSettings() != null) {
                jsonGenerator.writeFieldName("RadiusSettings");
                RadiusSettingsJsonMarshaller.getInstance().marshall(directoryDescription.getRadiusSettings(), jsonGenerator);
            }
            if (directoryDescription.getRadiusStatus() != null) {
                jsonGenerator.writeFieldName("RadiusStatus").writeValue(directoryDescription.getRadiusStatus());
            }
            if (directoryDescription.getStageReason() != null) {
                jsonGenerator.writeFieldName("StageReason").writeValue(directoryDescription.getStageReason());
            }
            if (directoryDescription.getSsoEnabled() != null) {
                jsonGenerator.writeFieldName("SsoEnabled").writeValue(directoryDescription.getSsoEnabled());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DirectoryDescriptionJsonMarshaller instance;

    public static DirectoryDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DirectoryDescriptionJsonMarshaller();
        return instance;
    }

}
