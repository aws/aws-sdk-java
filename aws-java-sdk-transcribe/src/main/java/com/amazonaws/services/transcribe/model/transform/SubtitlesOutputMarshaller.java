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
package com.amazonaws.services.transcribe.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.transcribe.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SubtitlesOutputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SubtitlesOutputMarshaller {

    private static final MarshallingInfo<List> FORMATS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Formats").build();
    private static final MarshallingInfo<List> SUBTITLEFILEURIS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubtitleFileUris").build();
    private static final MarshallingInfo<Integer> OUTPUTSTARTINDEX_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputStartIndex").build();

    private static final SubtitlesOutputMarshaller instance = new SubtitlesOutputMarshaller();

    public static SubtitlesOutputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SubtitlesOutput subtitlesOutput, ProtocolMarshaller protocolMarshaller) {

        if (subtitlesOutput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(subtitlesOutput.getFormats(), FORMATS_BINDING);
            protocolMarshaller.marshall(subtitlesOutput.getSubtitleFileUris(), SUBTITLEFILEURIS_BINDING);
            protocolMarshaller.marshall(subtitlesOutput.getOutputStartIndex(), OUTPUTSTARTINDEX_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
