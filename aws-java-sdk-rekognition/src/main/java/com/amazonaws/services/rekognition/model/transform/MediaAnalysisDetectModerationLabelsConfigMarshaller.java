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
package com.amazonaws.services.rekognition.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.rekognition.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MediaAnalysisDetectModerationLabelsConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MediaAnalysisDetectModerationLabelsConfigMarshaller {

    private static final MarshallingInfo<Float> MINCONFIDENCE_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinConfidence").build();
    private static final MarshallingInfo<String> PROJECTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProjectVersion").build();

    private static final MediaAnalysisDetectModerationLabelsConfigMarshaller instance = new MediaAnalysisDetectModerationLabelsConfigMarshaller();

    public static MediaAnalysisDetectModerationLabelsConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MediaAnalysisDetectModerationLabelsConfig mediaAnalysisDetectModerationLabelsConfig, ProtocolMarshaller protocolMarshaller) {

        if (mediaAnalysisDetectModerationLabelsConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(mediaAnalysisDetectModerationLabelsConfig.getMinConfidence(), MINCONFIDENCE_BINDING);
            protocolMarshaller.marshall(mediaAnalysisDetectModerationLabelsConfig.getProjectVersion(), PROJECTVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
