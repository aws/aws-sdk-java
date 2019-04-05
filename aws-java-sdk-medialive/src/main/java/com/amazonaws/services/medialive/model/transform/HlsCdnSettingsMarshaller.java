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
 * HlsCdnSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HlsCdnSettingsMarshaller {

    private static final MarshallingInfo<StructuredPojo> HLSAKAMAISETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hlsAkamaiSettings").build();
    private static final MarshallingInfo<StructuredPojo> HLSBASICPUTSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hlsBasicPutSettings").build();
    private static final MarshallingInfo<StructuredPojo> HLSMEDIASTORESETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hlsMediaStoreSettings").build();
    private static final MarshallingInfo<StructuredPojo> HLSWEBDAVSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hlsWebdavSettings").build();

    private static final HlsCdnSettingsMarshaller instance = new HlsCdnSettingsMarshaller();

    public static HlsCdnSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HlsCdnSettings hlsCdnSettings, ProtocolMarshaller protocolMarshaller) {

        if (hlsCdnSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(hlsCdnSettings.getHlsAkamaiSettings(), HLSAKAMAISETTINGS_BINDING);
            protocolMarshaller.marshall(hlsCdnSettings.getHlsBasicPutSettings(), HLSBASICPUTSETTINGS_BINDING);
            protocolMarshaller.marshall(hlsCdnSettings.getHlsMediaStoreSettings(), HLSMEDIASTORESETTINGS_BINDING);
            protocolMarshaller.marshall(hlsCdnSettings.getHlsWebdavSettings(), HLSWEBDAVSETTINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
