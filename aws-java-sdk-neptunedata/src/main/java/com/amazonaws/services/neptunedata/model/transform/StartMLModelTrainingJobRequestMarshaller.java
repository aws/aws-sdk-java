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
 * StartMLModelTrainingJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartMLModelTrainingJobRequestMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> PREVIOUSMODELTRAININGJOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("previousModelTrainingJobId").build();
    private static final MarshallingInfo<String> DATAPROCESSINGJOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataProcessingJobId").build();
    private static final MarshallingInfo<String> TRAINMODELS3LOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("trainModelS3Location").build();
    private static final MarshallingInfo<String> SAGEMAKERIAMROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sagemakerIamRoleArn").build();
    private static final MarshallingInfo<String> NEPTUNEIAMROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("neptuneIamRoleArn").build();
    private static final MarshallingInfo<String> BASEPROCESSINGINSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("baseProcessingInstanceType").build();
    private static final MarshallingInfo<String> TRAININGINSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("trainingInstanceType").build();
    private static final MarshallingInfo<Integer> TRAININGINSTANCEVOLUMESIZEINGB_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("trainingInstanceVolumeSizeInGB").build();
    private static final MarshallingInfo<Integer> TRAININGTIMEOUTINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("trainingTimeOutInSeconds").build();
    private static final MarshallingInfo<Integer> MAXHPONUMBEROFTRAININGJOBS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxHPONumberOfTrainingJobs").build();
    private static final MarshallingInfo<Integer> MAXHPOPARALLELTRAININGJOBS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxHPOParallelTrainingJobs").build();
    private static final MarshallingInfo<List> SUBNETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("subnets").build();
    private static final MarshallingInfo<List> SECURITYGROUPIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("securityGroupIds").build();
    private static final MarshallingInfo<String> VOLUMEENCRYPTIONKMSKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("volumeEncryptionKMSKey").build();
    private static final MarshallingInfo<String> S3OUTPUTENCRYPTIONKMSKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("s3OutputEncryptionKMSKey").build();
    private static final MarshallingInfo<Boolean> ENABLEMANAGEDSPOTTRAINING_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("enableManagedSpotTraining").build();
    private static final MarshallingInfo<StructuredPojo> CUSTOMMODELTRAININGPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("customModelTrainingParameters").build();

    private static final StartMLModelTrainingJobRequestMarshaller instance = new StartMLModelTrainingJobRequestMarshaller();

    public static StartMLModelTrainingJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartMLModelTrainingJobRequest startMLModelTrainingJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (startMLModelTrainingJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startMLModelTrainingJobRequest.getId(), ID_BINDING);
            protocolMarshaller.marshall(startMLModelTrainingJobRequest.getPreviousModelTrainingJobId(), PREVIOUSMODELTRAININGJOBID_BINDING);
            protocolMarshaller.marshall(startMLModelTrainingJobRequest.getDataProcessingJobId(), DATAPROCESSINGJOBID_BINDING);
            protocolMarshaller.marshall(startMLModelTrainingJobRequest.getTrainModelS3Location(), TRAINMODELS3LOCATION_BINDING);
            protocolMarshaller.marshall(startMLModelTrainingJobRequest.getSagemakerIamRoleArn(), SAGEMAKERIAMROLEARN_BINDING);
            protocolMarshaller.marshall(startMLModelTrainingJobRequest.getNeptuneIamRoleArn(), NEPTUNEIAMROLEARN_BINDING);
            protocolMarshaller.marshall(startMLModelTrainingJobRequest.getBaseProcessingInstanceType(), BASEPROCESSINGINSTANCETYPE_BINDING);
            protocolMarshaller.marshall(startMLModelTrainingJobRequest.getTrainingInstanceType(), TRAININGINSTANCETYPE_BINDING);
            protocolMarshaller.marshall(startMLModelTrainingJobRequest.getTrainingInstanceVolumeSizeInGB(), TRAININGINSTANCEVOLUMESIZEINGB_BINDING);
            protocolMarshaller.marshall(startMLModelTrainingJobRequest.getTrainingTimeOutInSeconds(), TRAININGTIMEOUTINSECONDS_BINDING);
            protocolMarshaller.marshall(startMLModelTrainingJobRequest.getMaxHPONumberOfTrainingJobs(), MAXHPONUMBEROFTRAININGJOBS_BINDING);
            protocolMarshaller.marshall(startMLModelTrainingJobRequest.getMaxHPOParallelTrainingJobs(), MAXHPOPARALLELTRAININGJOBS_BINDING);
            protocolMarshaller.marshall(startMLModelTrainingJobRequest.getSubnets(), SUBNETS_BINDING);
            protocolMarshaller.marshall(startMLModelTrainingJobRequest.getSecurityGroupIds(), SECURITYGROUPIDS_BINDING);
            protocolMarshaller.marshall(startMLModelTrainingJobRequest.getVolumeEncryptionKMSKey(), VOLUMEENCRYPTIONKMSKEY_BINDING);
            protocolMarshaller.marshall(startMLModelTrainingJobRequest.getS3OutputEncryptionKMSKey(), S3OUTPUTENCRYPTIONKMSKEY_BINDING);
            protocolMarshaller.marshall(startMLModelTrainingJobRequest.getEnableManagedSpotTraining(), ENABLEMANAGEDSPOTTRAINING_BINDING);
            protocolMarshaller.marshall(startMLModelTrainingJobRequest.getCustomModelTrainingParameters(), CUSTOMMODELTRAININGPARAMETERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
