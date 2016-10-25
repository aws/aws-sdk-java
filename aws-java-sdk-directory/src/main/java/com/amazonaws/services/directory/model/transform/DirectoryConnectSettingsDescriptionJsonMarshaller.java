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
 * DirectoryConnectSettingsDescriptionMarshaller
 */
public class DirectoryConnectSettingsDescriptionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(DirectoryConnectSettingsDescription directoryConnectSettingsDescription, StructuredJsonGenerator jsonGenerator) {

        if (directoryConnectSettingsDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (directoryConnectSettingsDescription.getVpcId() != null) {
                jsonGenerator.writeFieldName("VpcId").writeValue(directoryConnectSettingsDescription.getVpcId());
            }

            com.amazonaws.internal.SdkInternalList<String> subnetIdsList = (com.amazonaws.internal.SdkInternalList<String>) directoryConnectSettingsDescription
                    .getSubnetIds();
            if (!subnetIdsList.isEmpty() || !subnetIdsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("SubnetIds");
                jsonGenerator.writeStartArray();
                for (String subnetIdsListValue : subnetIdsList) {
                    if (subnetIdsListValue != null) {
                        jsonGenerator.writeValue(subnetIdsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (directoryConnectSettingsDescription.getCustomerUserName() != null) {
                jsonGenerator.writeFieldName("CustomerUserName").writeValue(directoryConnectSettingsDescription.getCustomerUserName());
            }
            if (directoryConnectSettingsDescription.getSecurityGroupId() != null) {
                jsonGenerator.writeFieldName("SecurityGroupId").writeValue(directoryConnectSettingsDescription.getSecurityGroupId());
            }

            com.amazonaws.internal.SdkInternalList<String> availabilityZonesList = (com.amazonaws.internal.SdkInternalList<String>) directoryConnectSettingsDescription
                    .getAvailabilityZones();
            if (!availabilityZonesList.isEmpty() || !availabilityZonesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("AvailabilityZones");
                jsonGenerator.writeStartArray();
                for (String availabilityZonesListValue : availabilityZonesList) {
                    if (availabilityZonesListValue != null) {
                        jsonGenerator.writeValue(availabilityZonesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<String> connectIpsList = (com.amazonaws.internal.SdkInternalList<String>) directoryConnectSettingsDescription
                    .getConnectIps();
            if (!connectIpsList.isEmpty() || !connectIpsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("ConnectIps");
                jsonGenerator.writeStartArray();
                for (String connectIpsListValue : connectIpsList) {
                    if (connectIpsListValue != null) {
                        jsonGenerator.writeValue(connectIpsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DirectoryConnectSettingsDescriptionJsonMarshaller instance;

    public static DirectoryConnectSettingsDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DirectoryConnectSettingsDescriptionJsonMarshaller();
        return instance;
    }

}
