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

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateNetworkAnalyzerConfigurationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateNetworkAnalyzerConfigurationRequestMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<StructuredPojo> TRACECONTENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TraceContent").build();
    private static final MarshallingInfo<List> WIRELESSDEVICES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WirelessDevices").build();
    private static final MarshallingInfo<List> WIRELESSGATEWAYS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WirelessGateways").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<String> CLIENTREQUESTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientRequestToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();

    private static final CreateNetworkAnalyzerConfigurationRequestMarshaller instance = new CreateNetworkAnalyzerConfigurationRequestMarshaller();

    public static CreateNetworkAnalyzerConfigurationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateNetworkAnalyzerConfigurationRequest createNetworkAnalyzerConfigurationRequest, ProtocolMarshaller protocolMarshaller) {

        if (createNetworkAnalyzerConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createNetworkAnalyzerConfigurationRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createNetworkAnalyzerConfigurationRequest.getTraceContent(), TRACECONTENT_BINDING);
            protocolMarshaller.marshall(createNetworkAnalyzerConfigurationRequest.getWirelessDevices(), WIRELESSDEVICES_BINDING);
            protocolMarshaller.marshall(createNetworkAnalyzerConfigurationRequest.getWirelessGateways(), WIRELESSGATEWAYS_BINDING);
            protocolMarshaller.marshall(createNetworkAnalyzerConfigurationRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createNetworkAnalyzerConfigurationRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createNetworkAnalyzerConfigurationRequest.getClientRequestToken(), CLIENTREQUESTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
