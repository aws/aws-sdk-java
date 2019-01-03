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
 * MovSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MovSettingsMarshaller {

    private static final MarshallingInfo<String> CLAPATOM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("clapAtom").build();
    private static final MarshallingInfo<String> CSLGATOM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("cslgAtom").build();
    private static final MarshallingInfo<String> MPEG2FOURCCCONTROL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mpeg2FourCCControl").build();
    private static final MarshallingInfo<String> PADDINGCONTROL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("paddingControl").build();
    private static final MarshallingInfo<String> REFERENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("reference").build();

    private static final MovSettingsMarshaller instance = new MovSettingsMarshaller();

    public static MovSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MovSettings movSettings, ProtocolMarshaller protocolMarshaller) {

        if (movSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(movSettings.getClapAtom(), CLAPATOM_BINDING);
            protocolMarshaller.marshall(movSettings.getCslgAtom(), CSLGATOM_BINDING);
            protocolMarshaller.marshall(movSettings.getMpeg2FourCCControl(), MPEG2FOURCCCONTROL_BINDING);
            protocolMarshaller.marshall(movSettings.getPaddingControl(), PADDINGCONTROL_BINDING);
            protocolMarshaller.marshall(movSettings.getReference(), REFERENCE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
