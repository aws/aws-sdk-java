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
package com.amazonaws.services.mediaconvert.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediaconvert.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ContainerSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ContainerSettingsMarshaller {

    private static final MarshallingInfo<String> CONTAINER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("container").build();
    private static final MarshallingInfo<StructuredPojo> F4VSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("f4vSettings").build();
    private static final MarshallingInfo<StructuredPojo> M2TSSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("m2tsSettings").build();
    private static final MarshallingInfo<StructuredPojo> M3U8SETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("m3u8Settings").build();
    private static final MarshallingInfo<StructuredPojo> MOVSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("movSettings").build();
    private static final MarshallingInfo<StructuredPojo> MP4SETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mp4Settings").build();

    private static final ContainerSettingsMarshaller instance = new ContainerSettingsMarshaller();

    public static ContainerSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ContainerSettings containerSettings, ProtocolMarshaller protocolMarshaller) {

        if (containerSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(containerSettings.getContainer(), CONTAINER_BINDING);
            protocolMarshaller.marshall(containerSettings.getF4vSettings(), F4VSETTINGS_BINDING);
            protocolMarshaller.marshall(containerSettings.getM2tsSettings(), M2TSSETTINGS_BINDING);
            protocolMarshaller.marshall(containerSettings.getM3u8Settings(), M3U8SETTINGS_BINDING);
            protocolMarshaller.marshall(containerSettings.getMovSettings(), MOVSETTINGS_BINDING);
            protocolMarshaller.marshall(containerSettings.getMp4Settings(), MP4SETTINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
