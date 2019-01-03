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
package com.amazonaws.services.greengrass.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.greengrass.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ResourceDataContainerMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ResourceDataContainerMarshaller {

    private static final MarshallingInfo<StructuredPojo> LOCALDEVICERESOURCEDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LocalDeviceResourceData").build();
    private static final MarshallingInfo<StructuredPojo> LOCALVOLUMERESOURCEDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LocalVolumeResourceData").build();
    private static final MarshallingInfo<StructuredPojo> S3MACHINELEARNINGMODELRESOURCEDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3MachineLearningModelResourceData").build();
    private static final MarshallingInfo<StructuredPojo> SAGEMAKERMACHINELEARNINGMODELRESOURCEDATA_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SageMakerMachineLearningModelResourceData")
            .build();
    private static final MarshallingInfo<StructuredPojo> SECRETSMANAGERSECRETRESOURCEDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecretsManagerSecretResourceData").build();

    private static final ResourceDataContainerMarshaller instance = new ResourceDataContainerMarshaller();

    public static ResourceDataContainerMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ResourceDataContainer resourceDataContainer, ProtocolMarshaller protocolMarshaller) {

        if (resourceDataContainer == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(resourceDataContainer.getLocalDeviceResourceData(), LOCALDEVICERESOURCEDATA_BINDING);
            protocolMarshaller.marshall(resourceDataContainer.getLocalVolumeResourceData(), LOCALVOLUMERESOURCEDATA_BINDING);
            protocolMarshaller.marshall(resourceDataContainer.getS3MachineLearningModelResourceData(), S3MACHINELEARNINGMODELRESOURCEDATA_BINDING);
            protocolMarshaller
                    .marshall(resourceDataContainer.getSageMakerMachineLearningModelResourceData(), SAGEMAKERMACHINELEARNINGMODELRESOURCEDATA_BINDING);
            protocolMarshaller.marshall(resourceDataContainer.getSecretsManagerSecretResourceData(), SECRETSMANAGERSECRETRESOURCEDATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
