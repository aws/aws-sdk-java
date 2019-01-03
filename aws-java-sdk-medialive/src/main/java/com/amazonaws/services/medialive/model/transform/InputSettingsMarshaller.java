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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InputSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InputSettingsMarshaller {

    private static final MarshallingInfo<List> AUDIOSELECTORS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("audioSelectors").build();
    private static final MarshallingInfo<List> CAPTIONSELECTORS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("captionSelectors").build();
    private static final MarshallingInfo<String> DEBLOCKFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deblockFilter").build();
    private static final MarshallingInfo<String> DENOISEFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("denoiseFilter").build();
    private static final MarshallingInfo<Integer> FILTERSTRENGTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("filterStrength").build();
    private static final MarshallingInfo<String> INPUTFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputFilter").build();
    private static final MarshallingInfo<StructuredPojo> NETWORKINPUTSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkInputSettings").build();
    private static final MarshallingInfo<String> SOURCEENDBEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceEndBehavior").build();
    private static final MarshallingInfo<StructuredPojo> VIDEOSELECTOR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("videoSelector").build();

    private static final InputSettingsMarshaller instance = new InputSettingsMarshaller();

    public static InputSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InputSettings inputSettings, ProtocolMarshaller protocolMarshaller) {

        if (inputSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(inputSettings.getAudioSelectors(), AUDIOSELECTORS_BINDING);
            protocolMarshaller.marshall(inputSettings.getCaptionSelectors(), CAPTIONSELECTORS_BINDING);
            protocolMarshaller.marshall(inputSettings.getDeblockFilter(), DEBLOCKFILTER_BINDING);
            protocolMarshaller.marshall(inputSettings.getDenoiseFilter(), DENOISEFILTER_BINDING);
            protocolMarshaller.marshall(inputSettings.getFilterStrength(), FILTERSTRENGTH_BINDING);
            protocolMarshaller.marshall(inputSettings.getInputFilter(), INPUTFILTER_BINDING);
            protocolMarshaller.marshall(inputSettings.getNetworkInputSettings(), NETWORKINPUTSETTINGS_BINDING);
            protocolMarshaller.marshall(inputSettings.getSourceEndBehavior(), SOURCEENDBEHAVIOR_BINDING);
            protocolMarshaller.marshall(inputSettings.getVideoSelector(), VIDEOSELECTOR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
