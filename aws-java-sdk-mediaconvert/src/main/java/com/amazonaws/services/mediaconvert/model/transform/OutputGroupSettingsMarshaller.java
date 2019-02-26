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
 * OutputGroupSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OutputGroupSettingsMarshaller {

    private static final MarshallingInfo<StructuredPojo> CMAFGROUPSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cmafGroupSettings").build();
    private static final MarshallingInfo<StructuredPojo> DASHISOGROUPSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dashIsoGroupSettings").build();
    private static final MarshallingInfo<StructuredPojo> FILEGROUPSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fileGroupSettings").build();
    private static final MarshallingInfo<StructuredPojo> HLSGROUPSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hlsGroupSettings").build();
    private static final MarshallingInfo<StructuredPojo> MSSMOOTHGROUPSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("msSmoothGroupSettings").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();

    private static final OutputGroupSettingsMarshaller instance = new OutputGroupSettingsMarshaller();

    public static OutputGroupSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OutputGroupSettings outputGroupSettings, ProtocolMarshaller protocolMarshaller) {

        if (outputGroupSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(outputGroupSettings.getCmafGroupSettings(), CMAFGROUPSETTINGS_BINDING);
            protocolMarshaller.marshall(outputGroupSettings.getDashIsoGroupSettings(), DASHISOGROUPSETTINGS_BINDING);
            protocolMarshaller.marshall(outputGroupSettings.getFileGroupSettings(), FILEGROUPSETTINGS_BINDING);
            protocolMarshaller.marshall(outputGroupSettings.getHlsGroupSettings(), HLSGROUPSETTINGS_BINDING);
            protocolMarshaller.marshall(outputGroupSettings.getMsSmoothGroupSettings(), MSSMOOTHGROUPSETTINGS_BINDING);
            protocolMarshaller.marshall(outputGroupSettings.getType(), TYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
