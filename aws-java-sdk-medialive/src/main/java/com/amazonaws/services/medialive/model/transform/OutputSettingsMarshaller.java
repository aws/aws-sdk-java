/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medialive.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OutputSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OutputSettingsMarshaller {

    private static final MarshallingInfo<StructuredPojo> ARCHIVEOUTPUTSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("archiveOutputSettings").build();
    private static final MarshallingInfo<StructuredPojo> FRAMECAPTUREOUTPUTSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("frameCaptureOutputSettings").build();
    private static final MarshallingInfo<StructuredPojo> HLSOUTPUTSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hlsOutputSettings").build();
    private static final MarshallingInfo<StructuredPojo> MEDIAPACKAGEOUTPUTSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mediaPackageOutputSettings").build();
    private static final MarshallingInfo<StructuredPojo> MSSMOOTHOUTPUTSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("msSmoothOutputSettings").build();
    private static final MarshallingInfo<StructuredPojo> RTMPOUTPUTSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rtmpOutputSettings").build();
    private static final MarshallingInfo<StructuredPojo> UDPOUTPUTSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("udpOutputSettings").build();

    private static final OutputSettingsMarshaller instance = new OutputSettingsMarshaller();

    public static OutputSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OutputSettings outputSettings, ProtocolMarshaller protocolMarshaller) {

        if (outputSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(outputSettings.getArchiveOutputSettings(), ARCHIVEOUTPUTSETTINGS_BINDING);
            protocolMarshaller.marshall(outputSettings.getFrameCaptureOutputSettings(), FRAMECAPTUREOUTPUTSETTINGS_BINDING);
            protocolMarshaller.marshall(outputSettings.getHlsOutputSettings(), HLSOUTPUTSETTINGS_BINDING);
            protocolMarshaller.marshall(outputSettings.getMediaPackageOutputSettings(), MEDIAPACKAGEOUTPUTSETTINGS_BINDING);
            protocolMarshaller.marshall(outputSettings.getMsSmoothOutputSettings(), MSSMOOTHOUTPUTSETTINGS_BINDING);
            protocolMarshaller.marshall(outputSettings.getRtmpOutputSettings(), RTMPOUTPUTSETTINGS_BINDING);
            protocolMarshaller.marshall(outputSettings.getUdpOutputSettings(), UDPOUTPUTSETTINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
