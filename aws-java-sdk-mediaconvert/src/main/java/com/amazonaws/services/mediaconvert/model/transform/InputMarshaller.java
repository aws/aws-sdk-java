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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediaconvert.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InputMarshaller {

    private static final MarshallingInfo<Map> AUDIOSELECTORGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("audioSelectorGroups").build();
    private static final MarshallingInfo<Map> AUDIOSELECTORS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("audioSelectors").build();
    private static final MarshallingInfo<Map> CAPTIONSELECTORS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("captionSelectors").build();
    private static final MarshallingInfo<String> DEBLOCKFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deblockFilter").build();
    private static final MarshallingInfo<StructuredPojo> DECRYPTIONSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("decryptionSettings").build();
    private static final MarshallingInfo<String> DENOISEFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("denoiseFilter").build();
    private static final MarshallingInfo<String> FILEINPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("fileInput").build();
    private static final MarshallingInfo<String> FILTERENABLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("filterEnable").build();
    private static final MarshallingInfo<Integer> FILTERSTRENGTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("filterStrength").build();
    private static final MarshallingInfo<StructuredPojo> IMAGEINSERTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("imageInserter").build();
    private static final MarshallingInfo<List> INPUTCLIPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputClippings").build();
    private static final MarshallingInfo<Integer> PROGRAMNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("programNumber").build();
    private static final MarshallingInfo<String> PSICONTROL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("psiControl").build();
    private static final MarshallingInfo<List> SUPPLEMENTALIMPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("supplementalImps").build();
    private static final MarshallingInfo<String> TIMECODESOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timecodeSource").build();
    private static final MarshallingInfo<StructuredPojo> VIDEOSELECTOR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("videoSelector").build();

    private static final InputMarshaller instance = new InputMarshaller();

    public static InputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Input input, ProtocolMarshaller protocolMarshaller) {

        if (input == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(input.getAudioSelectorGroups(), AUDIOSELECTORGROUPS_BINDING);
            protocolMarshaller.marshall(input.getAudioSelectors(), AUDIOSELECTORS_BINDING);
            protocolMarshaller.marshall(input.getCaptionSelectors(), CAPTIONSELECTORS_BINDING);
            protocolMarshaller.marshall(input.getDeblockFilter(), DEBLOCKFILTER_BINDING);
            protocolMarshaller.marshall(input.getDecryptionSettings(), DECRYPTIONSETTINGS_BINDING);
            protocolMarshaller.marshall(input.getDenoiseFilter(), DENOISEFILTER_BINDING);
            protocolMarshaller.marshall(input.getFileInput(), FILEINPUT_BINDING);
            protocolMarshaller.marshall(input.getFilterEnable(), FILTERENABLE_BINDING);
            protocolMarshaller.marshall(input.getFilterStrength(), FILTERSTRENGTH_BINDING);
            protocolMarshaller.marshall(input.getImageInserter(), IMAGEINSERTER_BINDING);
            protocolMarshaller.marshall(input.getInputClippings(), INPUTCLIPPINGS_BINDING);
            protocolMarshaller.marshall(input.getProgramNumber(), PROGRAMNUMBER_BINDING);
            protocolMarshaller.marshall(input.getPsiControl(), PSICONTROL_BINDING);
            protocolMarshaller.marshall(input.getSupplementalImps(), SUPPLEMENTALIMPS_BINDING);
            protocolMarshaller.marshall(input.getTimecodeSource(), TIMECODESOURCE_BINDING);
            protocolMarshaller.marshall(input.getVideoSelector(), VIDEOSELECTOR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
