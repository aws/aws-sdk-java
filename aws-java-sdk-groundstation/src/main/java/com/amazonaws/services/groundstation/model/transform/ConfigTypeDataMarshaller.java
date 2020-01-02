/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.groundstation.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.groundstation.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConfigTypeDataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConfigTypeDataMarshaller {

    private static final MarshallingInfo<StructuredPojo> ANTENNADOWNLINKCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("antennaDownlinkConfig").build();
    private static final MarshallingInfo<StructuredPojo> ANTENNADOWNLINKDEMODDECODECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("antennaDownlinkDemodDecodeConfig").build();
    private static final MarshallingInfo<StructuredPojo> ANTENNAUPLINKCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("antennaUplinkConfig").build();
    private static final MarshallingInfo<StructuredPojo> DATAFLOWENDPOINTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataflowEndpointConfig").build();
    private static final MarshallingInfo<StructuredPojo> TRACKINGCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("trackingConfig").build();
    private static final MarshallingInfo<StructuredPojo> UPLINKECHOCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("uplinkEchoConfig").build();

    private static final ConfigTypeDataMarshaller instance = new ConfigTypeDataMarshaller();

    public static ConfigTypeDataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConfigTypeData configTypeData, ProtocolMarshaller protocolMarshaller) {

        if (configTypeData == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(configTypeData.getAntennaDownlinkConfig(), ANTENNADOWNLINKCONFIG_BINDING);
            protocolMarshaller.marshall(configTypeData.getAntennaDownlinkDemodDecodeConfig(), ANTENNADOWNLINKDEMODDECODECONFIG_BINDING);
            protocolMarshaller.marshall(configTypeData.getAntennaUplinkConfig(), ANTENNAUPLINKCONFIG_BINDING);
            protocolMarshaller.marshall(configTypeData.getDataflowEndpointConfig(), DATAFLOWENDPOINTCONFIG_BINDING);
            protocolMarshaller.marshall(configTypeData.getTrackingConfig(), TRACKINGCONFIG_BINDING);
            protocolMarshaller.marshall(configTypeData.getUplinkEchoConfig(), UPLINKECHOCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
