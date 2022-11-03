/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.batch.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.batch.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ComputeEnvironmentDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ComputeEnvironmentDetailMarshaller {

    private static final MarshallingInfo<String> COMPUTEENVIRONMENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("computeEnvironmentName").build();
    private static final MarshallingInfo<String> COMPUTEENVIRONMENTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("computeEnvironmentArn").build();
    private static final MarshallingInfo<Integer> UNMANAGEDVCPUS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("unmanagedvCpus").build();
    private static final MarshallingInfo<String> ECSCLUSTERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ecsClusterArn").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("state").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> STATUSREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusReason").build();
    private static final MarshallingInfo<StructuredPojo> COMPUTERESOURCES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("computeResources").build();
    private static final MarshallingInfo<String> SERVICEROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceRole").build();
    private static final MarshallingInfo<StructuredPojo> UPDATEPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatePolicy").build();
    private static final MarshallingInfo<StructuredPojo> EKSCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("eksConfiguration").build();
    private static final MarshallingInfo<String> CONTAINERORCHESTRATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("containerOrchestrationType").build();
    private static final MarshallingInfo<String> UUID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("uuid").build();

    private static final ComputeEnvironmentDetailMarshaller instance = new ComputeEnvironmentDetailMarshaller();

    public static ComputeEnvironmentDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ComputeEnvironmentDetail computeEnvironmentDetail, ProtocolMarshaller protocolMarshaller) {

        if (computeEnvironmentDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(computeEnvironmentDetail.getComputeEnvironmentName(), COMPUTEENVIRONMENTNAME_BINDING);
            protocolMarshaller.marshall(computeEnvironmentDetail.getComputeEnvironmentArn(), COMPUTEENVIRONMENTARN_BINDING);
            protocolMarshaller.marshall(computeEnvironmentDetail.getUnmanagedvCpus(), UNMANAGEDVCPUS_BINDING);
            protocolMarshaller.marshall(computeEnvironmentDetail.getEcsClusterArn(), ECSCLUSTERARN_BINDING);
            protocolMarshaller.marshall(computeEnvironmentDetail.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(computeEnvironmentDetail.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(computeEnvironmentDetail.getState(), STATE_BINDING);
            protocolMarshaller.marshall(computeEnvironmentDetail.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(computeEnvironmentDetail.getStatusReason(), STATUSREASON_BINDING);
            protocolMarshaller.marshall(computeEnvironmentDetail.getComputeResources(), COMPUTERESOURCES_BINDING);
            protocolMarshaller.marshall(computeEnvironmentDetail.getServiceRole(), SERVICEROLE_BINDING);
            protocolMarshaller.marshall(computeEnvironmentDetail.getUpdatePolicy(), UPDATEPOLICY_BINDING);
            protocolMarshaller.marshall(computeEnvironmentDetail.getEksConfiguration(), EKSCONFIGURATION_BINDING);
            protocolMarshaller.marshall(computeEnvironmentDetail.getContainerOrchestrationType(), CONTAINERORCHESTRATIONTYPE_BINDING);
            protocolMarshaller.marshall(computeEnvironmentDetail.getUuid(), UUID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
