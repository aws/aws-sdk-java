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
package com.amazonaws.services.neptunedata.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.neptunedata.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartMLDataProcessingJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartMLDataProcessingJobRequestMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> PREVIOUSDATAPROCESSINGJOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("previousDataProcessingJobId").build();
    private static final MarshallingInfo<String> INPUTDATAS3LOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputDataS3Location").build();
    private static final MarshallingInfo<String> PROCESSEDDATAS3LOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("processedDataS3Location").build();
    private static final MarshallingInfo<String> SAGEMAKERIAMROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sagemakerIamRoleArn").build();
    private static final MarshallingInfo<String> NEPTUNEIAMROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("neptuneIamRoleArn").build();
    private static final MarshallingInfo<String> PROCESSINGINSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("processingInstanceType").build();
    private static final MarshallingInfo<Integer> PROCESSINGINSTANCEVOLUMESIZEINGB_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("processingInstanceVolumeSizeInGB").build();
    private static final MarshallingInfo<Integer> PROCESSINGTIMEOUTINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("processingTimeOutInSeconds").build();
    private static final MarshallingInfo<String> MODELTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("modelType").build();
    private static final MarshallingInfo<String> CONFIGFILENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configFileName").build();
    private static final MarshallingInfo<List> SUBNETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("subnets").build();
    private static final MarshallingInfo<List> SECURITYGROUPIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("securityGroupIds").build();
    private static final MarshallingInfo<String> VOLUMEENCRYPTIONKMSKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("volumeEncryptionKMSKey").build();
    private static final MarshallingInfo<String> S3OUTPUTENCRYPTIONKMSKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("s3OutputEncryptionKMSKey").build();

    private static final StartMLDataProcessingJobRequestMarshaller instance = new StartMLDataProcessingJobRequestMarshaller();

    public static StartMLDataProcessingJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartMLDataProcessingJobRequest startMLDataProcessingJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (startMLDataProcessingJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startMLDataProcessingJobRequest.getId(), ID_BINDING);
            protocolMarshaller.marshall(startMLDataProcessingJobRequest.getPreviousDataProcessingJobId(), PREVIOUSDATAPROCESSINGJOBID_BINDING);
            protocolMarshaller.marshall(startMLDataProcessingJobRequest.getInputDataS3Location(), INPUTDATAS3LOCATION_BINDING);
            protocolMarshaller.marshall(startMLDataProcessingJobRequest.getProcessedDataS3Location(), PROCESSEDDATAS3LOCATION_BINDING);
            protocolMarshaller.marshall(startMLDataProcessingJobRequest.getSagemakerIamRoleArn(), SAGEMAKERIAMROLEARN_BINDING);
            protocolMarshaller.marshall(startMLDataProcessingJobRequest.getNeptuneIamRoleArn(), NEPTUNEIAMROLEARN_BINDING);
            protocolMarshaller.marshall(startMLDataProcessingJobRequest.getProcessingInstanceType(), PROCESSINGINSTANCETYPE_BINDING);
            protocolMarshaller.marshall(startMLDataProcessingJobRequest.getProcessingInstanceVolumeSizeInGB(), PROCESSINGINSTANCEVOLUMESIZEINGB_BINDING);
            protocolMarshaller.marshall(startMLDataProcessingJobRequest.getProcessingTimeOutInSeconds(), PROCESSINGTIMEOUTINSECONDS_BINDING);
            protocolMarshaller.marshall(startMLDataProcessingJobRequest.getModelType(), MODELTYPE_BINDING);
            protocolMarshaller.marshall(startMLDataProcessingJobRequest.getConfigFileName(), CONFIGFILENAME_BINDING);
            protocolMarshaller.marshall(startMLDataProcessingJobRequest.getSubnets(), SUBNETS_BINDING);
            protocolMarshaller.marshall(startMLDataProcessingJobRequest.getSecurityGroupIds(), SECURITYGROUPIDS_BINDING);
            protocolMarshaller.marshall(startMLDataProcessingJobRequest.getVolumeEncryptionKMSKey(), VOLUMEENCRYPTIONKMSKEY_BINDING);
            protocolMarshaller.marshall(startMLDataProcessingJobRequest.getS3OutputEncryptionKMSKey(), S3OUTPUTENCRYPTIONKMSKEY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
