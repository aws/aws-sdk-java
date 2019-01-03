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
package com.amazonaws.services.transcribe.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.transcribe.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TranscriptionJobMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TranscriptionJobMarshaller {

    private static final MarshallingInfo<String> TRANSCRIPTIONJOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TranscriptionJobName").build();
    private static final MarshallingInfo<String> TRANSCRIPTIONJOBSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TranscriptionJobStatus").build();
    private static final MarshallingInfo<String> LANGUAGECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LanguageCode").build();
    private static final MarshallingInfo<Integer> MEDIASAMPLERATEHERTZ_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MediaSampleRateHertz").build();
    private static final MarshallingInfo<String> MEDIAFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MediaFormat").build();
    private static final MarshallingInfo<StructuredPojo> MEDIA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Media").build();
    private static final MarshallingInfo<StructuredPojo> TRANSCRIPT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Transcript").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> COMPLETIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompletionTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> FAILUREREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureReason").build();
    private static final MarshallingInfo<StructuredPojo> SETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Settings").build();

    private static final TranscriptionJobMarshaller instance = new TranscriptionJobMarshaller();

    public static TranscriptionJobMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TranscriptionJob transcriptionJob, ProtocolMarshaller protocolMarshaller) {

        if (transcriptionJob == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(transcriptionJob.getTranscriptionJobName(), TRANSCRIPTIONJOBNAME_BINDING);
            protocolMarshaller.marshall(transcriptionJob.getTranscriptionJobStatus(), TRANSCRIPTIONJOBSTATUS_BINDING);
            protocolMarshaller.marshall(transcriptionJob.getLanguageCode(), LANGUAGECODE_BINDING);
            protocolMarshaller.marshall(transcriptionJob.getMediaSampleRateHertz(), MEDIASAMPLERATEHERTZ_BINDING);
            protocolMarshaller.marshall(transcriptionJob.getMediaFormat(), MEDIAFORMAT_BINDING);
            protocolMarshaller.marshall(transcriptionJob.getMedia(), MEDIA_BINDING);
            protocolMarshaller.marshall(transcriptionJob.getTranscript(), TRANSCRIPT_BINDING);
            protocolMarshaller.marshall(transcriptionJob.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(transcriptionJob.getCompletionTime(), COMPLETIONTIME_BINDING);
            protocolMarshaller.marshall(transcriptionJob.getFailureReason(), FAILUREREASON_BINDING);
            protocolMarshaller.marshall(transcriptionJob.getSettings(), SETTINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
