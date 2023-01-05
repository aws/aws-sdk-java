/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotwireless.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotwireless.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateNetworkAnalyzerConfigurationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateNetworkAnalyzerConfigurationRequestMarshaller {

    private static final MarshallingInfo<String> CONFIGURATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("ConfigurationName").build();
    private static final MarshallingInfo<StructuredPojo> TRACECONTENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TraceContent").build();
    private static final MarshallingInfo<List> WIRELESSDEVICESTOADD_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WirelessDevicesToAdd").build();
    private static final MarshallingInfo<List> WIRELESSDEVICESTOREMOVE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WirelessDevicesToRemove").build();
    private static final MarshallingInfo<List> WIRELESSGATEWAYSTOADD_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WirelessGatewaysToAdd").build();
    private static final MarshallingInfo<List> WIRELESSGATEWAYSTOREMOVE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WirelessGatewaysToRemove").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();

    private static final UpdateNetworkAnalyzerConfigurationRequestMarshaller instance = new UpdateNetworkAnalyzerConfigurationRequestMarshaller();

    public static UpdateNetworkAnalyzerConfigurationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateNetworkAnalyzerConfigurationRequest updateNetworkAnalyzerConfigurationRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateNetworkAnalyzerConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateNetworkAnalyzerConfigurationRequest.getConfigurationName(), CONFIGURATIONNAME_BINDING);
            protocolMarshaller.marshall(updateNetworkAnalyzerConfigurationRequest.getTraceContent(), TRACECONTENT_BINDING);
            protocolMarshaller.marshall(updateNetworkAnalyzerConfigurationRequest.getWirelessDevicesToAdd(), WIRELESSDEVICESTOADD_BINDING);
            protocolMarshaller.marshall(updateNetworkAnalyzerConfigurationRequest.getWirelessDevicesToRemove(), WIRELESSDEVICESTOREMOVE_BINDING);
            protocolMarshaller.marshall(updateNetworkAnalyzerConfigurationRequest.getWirelessGatewaysToAdd(), WIRELESSGATEWAYSTOADD_BINDING);
            protocolMarshaller.marshall(updateNetworkAnalyzerConfigurationRequest.getWirelessGatewaysToRemove(), WIRELESSGATEWAYSTOREMOVE_BINDING);
            protocolMarshaller.marshall(updateNetworkAnalyzerConfigurationRequest.getDescription(), DESCRIPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
