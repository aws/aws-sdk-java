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
 * VideoSelectorSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VideoSelectorSettingsMarshaller {

    private static final MarshallingInfo<StructuredPojo> VIDEOSELECTORPID_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("videoSelectorPid").build();
    private static final MarshallingInfo<StructuredPojo> VIDEOSELECTORPROGRAMID_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("videoSelectorProgramId").build();

    private static final VideoSelectorSettingsMarshaller instance = new VideoSelectorSettingsMarshaller();

    public static VideoSelectorSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VideoSelectorSettings videoSelectorSettings, ProtocolMarshaller protocolMarshaller) {

        if (videoSelectorSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(videoSelectorSettings.getVideoSelectorPid(), VIDEOSELECTORPID_BINDING);
            protocolMarshaller.marshall(videoSelectorSettings.getVideoSelectorProgramId(), VIDEOSELECTORPROGRAMID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
