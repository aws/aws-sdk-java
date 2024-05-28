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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.transcribe.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartMedicalScribeJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartMedicalScribeJobRequestMarshaller {

    private static final MarshallingInfo<String> MEDICALSCRIBEJOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MedicalScribeJobName").build();
    private static final MarshallingInfo<StructuredPojo> MEDIA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Media").build();
    private static final MarshallingInfo<String> OUTPUTBUCKETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputBucketName").build();
    private static final MarshallingInfo<String> OUTPUTENCRYPTIONKMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputEncryptionKMSKeyId").build();
    private static final MarshallingInfo<Map> KMSENCRYPTIONCONTEXT_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KMSEncryptionContext").build();
    private static final MarshallingInfo<String> DATAACCESSROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataAccessRoleArn").build();
    private static final MarshallingInfo<StructuredPojo> SETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Settings").build();
    private static final MarshallingInfo<List> CHANNELDEFINITIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChannelDefinitions").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final StartMedicalScribeJobRequestMarshaller instance = new StartMedicalScribeJobRequestMarshaller();

    public static StartMedicalScribeJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartMedicalScribeJobRequest startMedicalScribeJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (startMedicalScribeJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startMedicalScribeJobRequest.getMedicalScribeJobName(), MEDICALSCRIBEJOBNAME_BINDING);
            protocolMarshaller.marshall(startMedicalScribeJobRequest.getMedia(), MEDIA_BINDING);
            protocolMarshaller.marshall(startMedicalScribeJobRequest.getOutputBucketName(), OUTPUTBUCKETNAME_BINDING);
            protocolMarshaller.marshall(startMedicalScribeJobRequest.getOutputEncryptionKMSKeyId(), OUTPUTENCRYPTIONKMSKEYID_BINDING);
            protocolMarshaller.marshall(startMedicalScribeJobRequest.getKMSEncryptionContext(), KMSENCRYPTIONCONTEXT_BINDING);
            protocolMarshaller.marshall(startMedicalScribeJobRequest.getDataAccessRoleArn(), DATAACCESSROLEARN_BINDING);
            protocolMarshaller.marshall(startMedicalScribeJobRequest.getSettings(), SETTINGS_BINDING);
            protocolMarshaller.marshall(startMedicalScribeJobRequest.getChannelDefinitions(), CHANNELDEFINITIONS_BINDING);
            protocolMarshaller.marshall(startMedicalScribeJobRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
