/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ColorConversion3DLUTSettingMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ColorConversion3DLUTSettingMarshaller {

    private static final MarshallingInfo<String> FILEINPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("fileInput").build();
    private static final MarshallingInfo<String> INPUTCOLORSPACE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputColorSpace").build();
    private static final MarshallingInfo<Integer> INPUTMASTERINGLUMINANCE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputMasteringLuminance").build();
    private static final MarshallingInfo<String> OUTPUTCOLORSPACE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputColorSpace").build();
    private static final MarshallingInfo<Integer> OUTPUTMASTERINGLUMINANCE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputMasteringLuminance").build();

    private static final ColorConversion3DLUTSettingMarshaller instance = new ColorConversion3DLUTSettingMarshaller();

    public static ColorConversion3DLUTSettingMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ColorConversion3DLUTSetting colorConversion3DLUTSetting, ProtocolMarshaller protocolMarshaller) {

        if (colorConversion3DLUTSetting == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(colorConversion3DLUTSetting.getFileInput(), FILEINPUT_BINDING);
            protocolMarshaller.marshall(colorConversion3DLUTSetting.getInputColorSpace(), INPUTCOLORSPACE_BINDING);
            protocolMarshaller.marshall(colorConversion3DLUTSetting.getInputMasteringLuminance(), INPUTMASTERINGLUMINANCE_BINDING);
            protocolMarshaller.marshall(colorConversion3DLUTSetting.getOutputColorSpace(), OUTPUTCOLORSPACE_BINDING);
            protocolMarshaller.marshall(colorConversion3DLUTSetting.getOutputMasteringLuminance(), OUTPUTMASTERINGLUMINANCE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
