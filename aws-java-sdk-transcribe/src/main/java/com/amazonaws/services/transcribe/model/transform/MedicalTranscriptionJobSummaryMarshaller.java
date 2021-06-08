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
 * MedicalTranscriptionJobSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MedicalTranscriptionJobSummaryMarshaller {

    private static final MarshallingInfo<String> MEDICALTRANSCRIPTIONJOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MedicalTranscriptionJobName").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> COMPLETIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompletionTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> LANGUAGECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LanguageCode").build();
    private static final MarshallingInfo<String> TRANSCRIPTIONJOBSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TranscriptionJobStatus").build();
    private static final MarshallingInfo<String> FAILUREREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureReason").build();
    private static final MarshallingInfo<String> OUTPUTLOCATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputLocationType").build();
    private static final MarshallingInfo<String> SPECIALTY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Specialty").build();
    private static final MarshallingInfo<String> CONTENTIDENTIFICATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContentIdentificationType").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();

    private static final MedicalTranscriptionJobSummaryMarshaller instance = new MedicalTranscriptionJobSummaryMarshaller();

    public static MedicalTranscriptionJobSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MedicalTranscriptionJobSummary medicalTranscriptionJobSummary, ProtocolMarshaller protocolMarshaller) {

        if (medicalTranscriptionJobSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(medicalTranscriptionJobSummary.getMedicalTranscriptionJobName(), MEDICALTRANSCRIPTIONJOBNAME_BINDING);
            protocolMarshaller.marshall(medicalTranscriptionJobSummary.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(medicalTranscriptionJobSummary.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(medicalTranscriptionJobSummary.getCompletionTime(), COMPLETIONTIME_BINDING);
            protocolMarshaller.marshall(medicalTranscriptionJobSummary.getLanguageCode(), LANGUAGECODE_BINDING);
            protocolMarshaller.marshall(medicalTranscriptionJobSummary.getTranscriptionJobStatus(), TRANSCRIPTIONJOBSTATUS_BINDING);
            protocolMarshaller.marshall(medicalTranscriptionJobSummary.getFailureReason(), FAILUREREASON_BINDING);
            protocolMarshaller.marshall(medicalTranscriptionJobSummary.getOutputLocationType(), OUTPUTLOCATIONTYPE_BINDING);
            protocolMarshaller.marshall(medicalTranscriptionJobSummary.getSpecialty(), SPECIALTY_BINDING);
            protocolMarshaller.marshall(medicalTranscriptionJobSummary.getContentIdentificationType(), CONTENTIDENTIFICATIONTYPE_BINDING);
            protocolMarshaller.marshall(medicalTranscriptionJobSummary.getType(), TYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
