/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * StartMedicalTranscriptionJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartMedicalTranscriptionJobRequestMarshaller {

    private static final MarshallingInfo<String> MEDICALTRANSCRIPTIONJOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MedicalTranscriptionJobName").build();
    private static final MarshallingInfo<String> LANGUAGECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LanguageCode").build();
    private static final MarshallingInfo<Integer> MEDIASAMPLERATEHERTZ_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MediaSampleRateHertz").build();
    private static final MarshallingInfo<String> MEDIAFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MediaFormat").build();
    private static final MarshallingInfo<StructuredPojo> MEDIA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Media").build();
    private static final MarshallingInfo<String> OUTPUTBUCKETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputBucketName").build();
    private static final MarshallingInfo<String> OUTPUTKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OutputKey").build();
    private static final MarshallingInfo<String> OUTPUTENCRYPTIONKMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputEncryptionKMSKeyId").build();
    private static final MarshallingInfo<StructuredPojo> SETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Settings").build();
    private static final MarshallingInfo<String> SPECIALTY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Specialty").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();

    private static final StartMedicalTranscriptionJobRequestMarshaller instance = new StartMedicalTranscriptionJobRequestMarshaller();

    public static StartMedicalTranscriptionJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartMedicalTranscriptionJobRequest startMedicalTranscriptionJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (startMedicalTranscriptionJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startMedicalTranscriptionJobRequest.getMedicalTranscriptionJobName(), MEDICALTRANSCRIPTIONJOBNAME_BINDING);
            protocolMarshaller.marshall(startMedicalTranscriptionJobRequest.getLanguageCode(), LANGUAGECODE_BINDING);
            protocolMarshaller.marshall(startMedicalTranscriptionJobRequest.getMediaSampleRateHertz(), MEDIASAMPLERATEHERTZ_BINDING);
            protocolMarshaller.marshall(startMedicalTranscriptionJobRequest.getMediaFormat(), MEDIAFORMAT_BINDING);
            protocolMarshaller.marshall(startMedicalTranscriptionJobRequest.getMedia(), MEDIA_BINDING);
            protocolMarshaller.marshall(startMedicalTranscriptionJobRequest.getOutputBucketName(), OUTPUTBUCKETNAME_BINDING);
            protocolMarshaller.marshall(startMedicalTranscriptionJobRequest.getOutputKey(), OUTPUTKEY_BINDING);
            protocolMarshaller.marshall(startMedicalTranscriptionJobRequest.getOutputEncryptionKMSKeyId(), OUTPUTENCRYPTIONKMSKEYID_BINDING);
            protocolMarshaller.marshall(startMedicalTranscriptionJobRequest.getSettings(), SETTINGS_BINDING);
            protocolMarshaller.marshall(startMedicalTranscriptionJobRequest.getSpecialty(), SPECIALTY_BINDING);
            protocolMarshaller.marshall(startMedicalTranscriptionJobRequest.getType(), TYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
