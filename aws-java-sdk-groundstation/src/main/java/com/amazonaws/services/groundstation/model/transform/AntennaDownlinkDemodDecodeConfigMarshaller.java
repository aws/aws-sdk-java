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
 * AntennaDownlinkDemodDecodeConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AntennaDownlinkDemodDecodeConfigMarshaller {

    private static final MarshallingInfo<StructuredPojo> DECODECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("decodeConfig").build();
    private static final MarshallingInfo<StructuredPojo> DEMODULATIONCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("demodulationConfig").build();
    private static final MarshallingInfo<StructuredPojo> SPECTRUMCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("spectrumConfig").build();

    private static final AntennaDownlinkDemodDecodeConfigMarshaller instance = new AntennaDownlinkDemodDecodeConfigMarshaller();

    public static AntennaDownlinkDemodDecodeConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AntennaDownlinkDemodDecodeConfig antennaDownlinkDemodDecodeConfig, ProtocolMarshaller protocolMarshaller) {

        if (antennaDownlinkDemodDecodeConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(antennaDownlinkDemodDecodeConfig.getDecodeConfig(), DECODECONFIG_BINDING);
            protocolMarshaller.marshall(antennaDownlinkDemodDecodeConfig.getDemodulationConfig(), DEMODULATIONCONFIG_BINDING);
            protocolMarshaller.marshall(antennaDownlinkDemodDecodeConfig.getSpectrumConfig(), SPECTRUMCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
