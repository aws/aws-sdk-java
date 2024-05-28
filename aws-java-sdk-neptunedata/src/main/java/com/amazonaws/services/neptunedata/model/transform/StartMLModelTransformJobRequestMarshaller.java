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
 * StartMLModelTransformJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartMLModelTransformJobRequestMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> DATAPROCESSINGJOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataProcessingJobId").build();
    private static final MarshallingInfo<String> MLMODELTRAININGJOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mlModelTrainingJobId").build();
    private static final MarshallingInfo<String> TRAININGJOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("trainingJobName").build();
    private static final MarshallingInfo<String> MODELTRANSFORMOUTPUTS3LOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("modelTransformOutputS3Location").build();
    private static final MarshallingInfo<String> SAGEMAKERIAMROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sagemakerIamRoleArn").build();
    private static final MarshallingInfo<String> NEPTUNEIAMROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("neptuneIamRoleArn").build();
    private static final MarshallingInfo<StructuredPojo> CUSTOMMODELTRANSFORMPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("customModelTransformParameters").build();
    private static final MarshallingInfo<String> BASEPROCESSINGINSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("baseProcessingInstanceType").build();
    private static final MarshallingInfo<Integer> BASEPROCESSINGINSTANCEVOLUMESIZEINGB_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("baseProcessingInstanceVolumeSizeInGB").build();
    private static final MarshallingInfo<List> SUBNETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("subnets").build();
    private static final MarshallingInfo<List> SECURITYGROUPIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("securityGroupIds").build();
    private static final MarshallingInfo<String> VOLUMEENCRYPTIONKMSKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("volumeEncryptionKMSKey").build();
    private static final MarshallingInfo<String> S3OUTPUTENCRYPTIONKMSKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("s3OutputEncryptionKMSKey").build();

    private static final StartMLModelTransformJobRequestMarshaller instance = new StartMLModelTransformJobRequestMarshaller();

    public static StartMLModelTransformJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartMLModelTransformJobRequest startMLModelTransformJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (startMLModelTransformJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startMLModelTransformJobRequest.getId(), ID_BINDING);
            protocolMarshaller.marshall(startMLModelTransformJobRequest.getDataProcessingJobId(), DATAPROCESSINGJOBID_BINDING);
            protocolMarshaller.marshall(startMLModelTransformJobRequest.getMlModelTrainingJobId(), MLMODELTRAININGJOBID_BINDING);
            protocolMarshaller.marshall(startMLModelTransformJobRequest.getTrainingJobName(), TRAININGJOBNAME_BINDING);
            protocolMarshaller.marshall(startMLModelTransformJobRequest.getModelTransformOutputS3Location(), MODELTRANSFORMOUTPUTS3LOCATION_BINDING);
            protocolMarshaller.marshall(startMLModelTransformJobRequest.getSagemakerIamRoleArn(), SAGEMAKERIAMROLEARN_BINDING);
            protocolMarshaller.marshall(startMLModelTransformJobRequest.getNeptuneIamRoleArn(), NEPTUNEIAMROLEARN_BINDING);
            protocolMarshaller.marshall(startMLModelTransformJobRequest.getCustomModelTransformParameters(), CUSTOMMODELTRANSFORMPARAMETERS_BINDING);
            protocolMarshaller.marshall(startMLModelTransformJobRequest.getBaseProcessingInstanceType(), BASEPROCESSINGINSTANCETYPE_BINDING);
            protocolMarshaller
                    .marshall(startMLModelTransformJobRequest.getBaseProcessingInstanceVolumeSizeInGB(), BASEPROCESSINGINSTANCEVOLUMESIZEINGB_BINDING);
            protocolMarshaller.marshall(startMLModelTransformJobRequest.getSubnets(), SUBNETS_BINDING);
            protocolMarshaller.marshall(startMLModelTransformJobRequest.getSecurityGroupIds(), SECURITYGROUPIDS_BINDING);
            protocolMarshaller.marshall(startMLModelTransformJobRequest.getVolumeEncryptionKMSKey(), VOLUMEENCRYPTIONKMSKEY_BINDING);
            protocolMarshaller.marshall(startMLModelTransformJobRequest.getS3OutputEncryptionKMSKey(), S3OUTPUTENCRYPTIONKMSKEY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
