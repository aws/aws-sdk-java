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
package com.amazonaws.services.transcribe.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.transcribe.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MedicalScribeJobMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MedicalScribeJobMarshaller {

    private static final MarshallingInfo<String> MEDICALSCRIBEJOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MedicalScribeJobName").build();
    private static final MarshallingInfo<String> MEDICALSCRIBEJOBSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MedicalScribeJobStatus").build();
    private static final MarshallingInfo<String> LANGUAGECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LanguageCode").build();
    private static final MarshallingInfo<StructuredPojo> MEDIA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Media").build();
    private static final MarshallingInfo<StructuredPojo> MEDICALSCRIBEOUTPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MedicalScribeOutput").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> COMPLETIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompletionTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> FAILUREREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureReason").build();
    private static final MarshallingInfo<StructuredPojo> SETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Settings").build();
    private static final MarshallingInfo<String> DATAACCESSROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataAccessRoleArn").build();
    private static final MarshallingInfo<List> CHANNELDEFINITIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChannelDefinitions").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final MedicalScribeJobMarshaller instance = new MedicalScribeJobMarshaller();

    public static MedicalScribeJobMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MedicalScribeJob medicalScribeJob, ProtocolMarshaller protocolMarshaller) {

        if (medicalScribeJob == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(medicalScribeJob.getMedicalScribeJobName(), MEDICALSCRIBEJOBNAME_BINDING);
            protocolMarshaller.marshall(medicalScribeJob.getMedicalScribeJobStatus(), MEDICALSCRIBEJOBSTATUS_BINDING);
            protocolMarshaller.marshall(medicalScribeJob.getLanguageCode(), LANGUAGECODE_BINDING);
            protocolMarshaller.marshall(medicalScribeJob.getMedia(), MEDIA_BINDING);
            protocolMarshaller.marshall(medicalScribeJob.getMedicalScribeOutput(), MEDICALSCRIBEOUTPUT_BINDING);
            protocolMarshaller.marshall(medicalScribeJob.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(medicalScribeJob.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(medicalScribeJob.getCompletionTime(), COMPLETIONTIME_BINDING);
            protocolMarshaller.marshall(medicalScribeJob.getFailureReason(), FAILUREREASON_BINDING);
            protocolMarshaller.marshall(medicalScribeJob.getSettings(), SETTINGS_BINDING);
            protocolMarshaller.marshall(medicalScribeJob.getDataAccessRoleArn(), DATAACCESSROLEARN_BINDING);
            protocolMarshaller.marshall(medicalScribeJob.getChannelDefinitions(), CHANNELDEFINITIONS_BINDING);
            protocolMarshaller.marshall(medicalScribeJob.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
