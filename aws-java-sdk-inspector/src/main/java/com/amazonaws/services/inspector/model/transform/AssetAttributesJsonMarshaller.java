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
package com.amazonaws.services.inspector.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * AssetAttributesMarshaller
 */
public class AssetAttributesJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(AssetAttributes assetAttributes, StructuredJsonGenerator jsonGenerator) {

        if (assetAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (assetAttributes.getSchemaVersion() != null) {
                jsonGenerator.writeFieldName("schemaVersion").writeValue(assetAttributes.getSchemaVersion());
            }
            if (assetAttributes.getAgentId() != null) {
                jsonGenerator.writeFieldName("agentId").writeValue(assetAttributes.getAgentId());
            }
            if (assetAttributes.getAutoScalingGroup() != null) {
                jsonGenerator.writeFieldName("autoScalingGroup").writeValue(assetAttributes.getAutoScalingGroup());
            }
            if (assetAttributes.getAmiId() != null) {
                jsonGenerator.writeFieldName("amiId").writeValue(assetAttributes.getAmiId());
            }
            if (assetAttributes.getHostname() != null) {
                jsonGenerator.writeFieldName("hostname").writeValue(assetAttributes.getHostname());
            }

            java.util.List<String> ipv4AddressesList = assetAttributes.getIpv4Addresses();
            if (ipv4AddressesList != null) {
                jsonGenerator.writeFieldName("ipv4Addresses");
                jsonGenerator.writeStartArray();
                for (String ipv4AddressesListValue : ipv4AddressesList) {
                    if (ipv4AddressesListValue != null) {
                        jsonGenerator.writeValue(ipv4AddressesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AssetAttributesJsonMarshaller instance;

    public static AssetAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AssetAttributesJsonMarshaller();
        return instance;
    }

}
