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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.neptunedata.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateMLEndpointRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateMLEndpointRequestMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> MLMODELTRAININGJOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mlModelTrainingJobId").build();
    private static final MarshallingInfo<String> MLMODELTRANSFORMJOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mlModelTransformJobId").build();
    private static final MarshallingInfo<Boolean> UPDATE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("update").build();
    private static final MarshallingInfo<String> NEPTUNEIAMROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("neptuneIamRoleArn").build();
    private static final MarshallingInfo<String> MODELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("modelName").build();
    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceType").build();
    private static final MarshallingInfo<Integer> INSTANCECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceCount").build();
    private static final MarshallingInfo<String> VOLUMEENCRYPTIONKMSKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("volumeEncryptionKMSKey").build();

    private static final CreateMLEndpointRequestMarshaller instance = new CreateMLEndpointRequestMarshaller();

    public static CreateMLEndpointRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateMLEndpointRequest createMLEndpointRequest, ProtocolMarshaller protocolMarshaller) {

        if (createMLEndpointRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createMLEndpointRequest.getId(), ID_BINDING);
            protocolMarshaller.marshall(createMLEndpointRequest.getMlModelTrainingJobId(), MLMODELTRAININGJOBID_BINDING);
            protocolMarshaller.marshall(createMLEndpointRequest.getMlModelTransformJobId(), MLMODELTRANSFORMJOBID_BINDING);
            protocolMarshaller.marshall(createMLEndpointRequest.getUpdate(), UPDATE_BINDING);
            protocolMarshaller.marshall(createMLEndpointRequest.getNeptuneIamRoleArn(), NEPTUNEIAMROLEARN_BINDING);
            protocolMarshaller.marshall(createMLEndpointRequest.getModelName(), MODELNAME_BINDING);
            protocolMarshaller.marshall(createMLEndpointRequest.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(createMLEndpointRequest.getInstanceCount(), INSTANCECOUNT_BINDING);
            protocolMarshaller.marshall(createMLEndpointRequest.getVolumeEncryptionKMSKey(), VOLUMEENCRYPTIONKMSKEY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
