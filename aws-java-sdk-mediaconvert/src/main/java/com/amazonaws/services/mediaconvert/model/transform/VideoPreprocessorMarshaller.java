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
 * VideoPreprocessorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VideoPreprocessorMarshaller {

    private static final MarshallingInfo<StructuredPojo> COLORCORRECTOR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("colorCorrector").build();
    private static final MarshallingInfo<StructuredPojo> DEINTERLACER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deinterlacer").build();
    private static final MarshallingInfo<StructuredPojo> IMAGEINSERTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("imageInserter").build();
    private static final MarshallingInfo<StructuredPojo> NOISEREDUCER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("noiseReducer").build();
    private static final MarshallingInfo<StructuredPojo> TIMECODEBURNIN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timecodeBurnin").build();

    private static final VideoPreprocessorMarshaller instance = new VideoPreprocessorMarshaller();

    public static VideoPreprocessorMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VideoPreprocessor videoPreprocessor, ProtocolMarshaller protocolMarshaller) {

        if (videoPreprocessor == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(videoPreprocessor.getColorCorrector(), COLORCORRECTOR_BINDING);
            protocolMarshaller.marshall(videoPreprocessor.getDeinterlacer(), DEINTERLACER_BINDING);
            protocolMarshaller.marshall(videoPreprocessor.getImageInserter(), IMAGEINSERTER_BINDING);
            protocolMarshaller.marshall(videoPreprocessor.getNoiseReducer(), NOISEREDUCER_BINDING);
            protocolMarshaller.marshall(videoPreprocessor.getTimecodeBurnin(), TIMECODEBURNIN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
