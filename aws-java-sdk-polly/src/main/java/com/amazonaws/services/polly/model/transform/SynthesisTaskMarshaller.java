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
package com.amazonaws.services.polly.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.polly.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SynthesisTaskMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SynthesisTaskMarshaller {

    private static final MarshallingInfo<String> TASKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TaskId").build();
    private static final MarshallingInfo<String> TASKSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TaskStatus").build();
    private static final MarshallingInfo<String> TASKSTATUSREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TaskStatusReason").build();
    private static final MarshallingInfo<String> OUTPUTURI_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OutputUri").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Integer> REQUESTCHARACTERS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequestCharacters").build();
    private static final MarshallingInfo<String> SNSTOPICARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnsTopicArn").build();
    private static final MarshallingInfo<List> LEXICONNAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LexiconNames").build();
    private static final MarshallingInfo<String> OUTPUTFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputFormat").build();
    private static final MarshallingInfo<String> SAMPLERATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SampleRate").build();
    private static final MarshallingInfo<List> SPEECHMARKTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SpeechMarkTypes").build();
    private static final MarshallingInfo<String> TEXTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TextType").build();
    private static final MarshallingInfo<String> VOICEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VoiceId").build();
    private static final MarshallingInfo<String> LANGUAGECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LanguageCode").build();

    private static final SynthesisTaskMarshaller instance = new SynthesisTaskMarshaller();

    public static SynthesisTaskMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SynthesisTask synthesisTask, ProtocolMarshaller protocolMarshaller) {

        if (synthesisTask == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(synthesisTask.getTaskId(), TASKID_BINDING);
            protocolMarshaller.marshall(synthesisTask.getTaskStatus(), TASKSTATUS_BINDING);
            protocolMarshaller.marshall(synthesisTask.getTaskStatusReason(), TASKSTATUSREASON_BINDING);
            protocolMarshaller.marshall(synthesisTask.getOutputUri(), OUTPUTURI_BINDING);
            protocolMarshaller.marshall(synthesisTask.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(synthesisTask.getRequestCharacters(), REQUESTCHARACTERS_BINDING);
            protocolMarshaller.marshall(synthesisTask.getSnsTopicArn(), SNSTOPICARN_BINDING);
            protocolMarshaller.marshall(synthesisTask.getLexiconNames(), LEXICONNAMES_BINDING);
            protocolMarshaller.marshall(synthesisTask.getOutputFormat(), OUTPUTFORMAT_BINDING);
            protocolMarshaller.marshall(synthesisTask.getSampleRate(), SAMPLERATE_BINDING);
            protocolMarshaller.marshall(synthesisTask.getSpeechMarkTypes(), SPEECHMARKTYPES_BINDING);
            protocolMarshaller.marshall(synthesisTask.getTextType(), TEXTTYPE_BINDING);
            protocolMarshaller.marshall(synthesisTask.getVoiceId(), VOICEID_BINDING);
            protocolMarshaller.marshall(synthesisTask.getLanguageCode(), LANGUAGECODE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
