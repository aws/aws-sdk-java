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
package com.amazonaws.services.chimesdkvoice.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chimesdkvoice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetVoiceToneAnalysisTaskRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetVoiceToneAnalysisTaskRequestMarshaller {

    private static final MarshallingInfo<String> VOICECONNECTORID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("VoiceConnectorId").build();
    private static final MarshallingInfo<String> VOICETONEANALYSISTASKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("VoiceToneAnalysisTaskId").build();
    private static final MarshallingInfo<Boolean> ISCALLER_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("isCaller").build();

    private static final GetVoiceToneAnalysisTaskRequestMarshaller instance = new GetVoiceToneAnalysisTaskRequestMarshaller();

    public static GetVoiceToneAnalysisTaskRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetVoiceToneAnalysisTaskRequest getVoiceToneAnalysisTaskRequest, ProtocolMarshaller protocolMarshaller) {

        if (getVoiceToneAnalysisTaskRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getVoiceToneAnalysisTaskRequest.getVoiceConnectorId(), VOICECONNECTORID_BINDING);
            protocolMarshaller.marshall(getVoiceToneAnalysisTaskRequest.getVoiceToneAnalysisTaskId(), VOICETONEANALYSISTASKID_BINDING);
            protocolMarshaller.marshall(getVoiceToneAnalysisTaskRequest.getIsCaller(), ISCALLER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
