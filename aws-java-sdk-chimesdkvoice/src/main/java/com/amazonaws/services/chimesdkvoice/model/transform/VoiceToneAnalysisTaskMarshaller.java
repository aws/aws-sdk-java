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
 * VoiceToneAnalysisTaskMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VoiceToneAnalysisTaskMarshaller {

    private static final MarshallingInfo<String> VOICETONEANALYSISTASKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VoiceToneAnalysisTaskId").build();
    private static final MarshallingInfo<String> VOICETONEANALYSISTASKSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VoiceToneAnalysisTaskStatus").build();
    private static final MarshallingInfo<StructuredPojo> CALLDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CallDetails").build();
    private static final MarshallingInfo<java.util.Date> CREATEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedTimestamp").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdatedTimestamp").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> STARTEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartedTimestamp").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> STATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatusMessage").build();

    private static final VoiceToneAnalysisTaskMarshaller instance = new VoiceToneAnalysisTaskMarshaller();

    public static VoiceToneAnalysisTaskMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VoiceToneAnalysisTask voiceToneAnalysisTask, ProtocolMarshaller protocolMarshaller) {

        if (voiceToneAnalysisTask == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(voiceToneAnalysisTask.getVoiceToneAnalysisTaskId(), VOICETONEANALYSISTASKID_BINDING);
            protocolMarshaller.marshall(voiceToneAnalysisTask.getVoiceToneAnalysisTaskStatus(), VOICETONEANALYSISTASKSTATUS_BINDING);
            protocolMarshaller.marshall(voiceToneAnalysisTask.getCallDetails(), CALLDETAILS_BINDING);
            protocolMarshaller.marshall(voiceToneAnalysisTask.getCreatedTimestamp(), CREATEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(voiceToneAnalysisTask.getUpdatedTimestamp(), UPDATEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(voiceToneAnalysisTask.getStartedTimestamp(), STARTEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(voiceToneAnalysisTask.getStatusMessage(), STATUSMESSAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
