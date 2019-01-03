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
 * StartSpeechSynthesisTaskRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartSpeechSynthesisTaskRequestMarshaller {

    private static final MarshallingInfo<List> LEXICONNAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LexiconNames").build();
    private static final MarshallingInfo<String> OUTPUTFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputFormat").build();
    private static final MarshallingInfo<String> OUTPUTS3BUCKETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputS3BucketName").build();
    private static final MarshallingInfo<String> OUTPUTS3KEYPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputS3KeyPrefix").build();
    private static final MarshallingInfo<String> SAMPLERATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SampleRate").build();
    private static final MarshallingInfo<String> SNSTOPICARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnsTopicArn").build();
    private static final MarshallingInfo<List> SPEECHMARKTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SpeechMarkTypes").build();
    private static final MarshallingInfo<String> TEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Text").build();
    private static final MarshallingInfo<String> TEXTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TextType").build();
    private static final MarshallingInfo<String> VOICEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VoiceId").build();
    private static final MarshallingInfo<String> LANGUAGECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LanguageCode").build();

    private static final StartSpeechSynthesisTaskRequestMarshaller instance = new StartSpeechSynthesisTaskRequestMarshaller();

    public static StartSpeechSynthesisTaskRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartSpeechSynthesisTaskRequest startSpeechSynthesisTaskRequest, ProtocolMarshaller protocolMarshaller) {

        if (startSpeechSynthesisTaskRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startSpeechSynthesisTaskRequest.getLexiconNames(), LEXICONNAMES_BINDING);
            protocolMarshaller.marshall(startSpeechSynthesisTaskRequest.getOutputFormat(), OUTPUTFORMAT_BINDING);
            protocolMarshaller.marshall(startSpeechSynthesisTaskRequest.getOutputS3BucketName(), OUTPUTS3BUCKETNAME_BINDING);
            protocolMarshaller.marshall(startSpeechSynthesisTaskRequest.getOutputS3KeyPrefix(), OUTPUTS3KEYPREFIX_BINDING);
            protocolMarshaller.marshall(startSpeechSynthesisTaskRequest.getSampleRate(), SAMPLERATE_BINDING);
            protocolMarshaller.marshall(startSpeechSynthesisTaskRequest.getSnsTopicArn(), SNSTOPICARN_BINDING);
            protocolMarshaller.marshall(startSpeechSynthesisTaskRequest.getSpeechMarkTypes(), SPEECHMARKTYPES_BINDING);
            protocolMarshaller.marshall(startSpeechSynthesisTaskRequest.getText(), TEXT_BINDING);
            protocolMarshaller.marshall(startSpeechSynthesisTaskRequest.getTextType(), TEXTTYPE_BINDING);
            protocolMarshaller.marshall(startSpeechSynthesisTaskRequest.getVoiceId(), VOICEID_BINDING);
            protocolMarshaller.marshall(startSpeechSynthesisTaskRequest.getLanguageCode(), LANGUAGECODE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
