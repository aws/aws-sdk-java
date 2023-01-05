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
package com.amazonaws.services.medialive.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NielsenWatermarksSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NielsenWatermarksSettingsMarshaller {

    private static final MarshallingInfo<StructuredPojo> NIELSENCBETSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nielsenCbetSettings").build();
    private static final MarshallingInfo<String> NIELSENDISTRIBUTIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nielsenDistributionType").build();
    private static final MarshallingInfo<StructuredPojo> NIELSENNAESIINWSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nielsenNaesIiNwSettings").build();

    private static final NielsenWatermarksSettingsMarshaller instance = new NielsenWatermarksSettingsMarshaller();

    public static NielsenWatermarksSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NielsenWatermarksSettings nielsenWatermarksSettings, ProtocolMarshaller protocolMarshaller) {

        if (nielsenWatermarksSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(nielsenWatermarksSettings.getNielsenCbetSettings(), NIELSENCBETSETTINGS_BINDING);
            protocolMarshaller.marshall(nielsenWatermarksSettings.getNielsenDistributionType(), NIELSENDISTRIBUTIONTYPE_BINDING);
            protocolMarshaller.marshall(nielsenWatermarksSettings.getNielsenNaesIiNwSettings(), NIELSENNAESIINWSETTINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
