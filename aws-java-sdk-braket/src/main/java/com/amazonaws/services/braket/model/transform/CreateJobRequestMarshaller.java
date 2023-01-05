/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.braket.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.braket.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateJobRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> ALGORITHMSPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("algorithmSpecification").build();
    private static final MarshallingInfo<StructuredPojo> CHECKPOINTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("checkpointConfig").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<StructuredPojo> DEVICECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deviceConfig").build();
    private static final MarshallingInfo<Map> HYPERPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("hyperParameters").build();
    private static final MarshallingInfo<List> INPUTDATACONFIG_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputDataConfig").build();
    private static final MarshallingInfo<StructuredPojo> INSTANCECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceConfig").build();
    private static final MarshallingInfo<String> JOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("jobName").build();
    private static final MarshallingInfo<StructuredPojo> OUTPUTDATACONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputDataConfig").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArn").build();
    private static final MarshallingInfo<StructuredPojo> STOPPINGCONDITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stoppingCondition").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final CreateJobRequestMarshaller instance = new CreateJobRequestMarshaller();

    public static CreateJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateJobRequest createJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (createJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createJobRequest.getAlgorithmSpecification(), ALGORITHMSPECIFICATION_BINDING);
            protocolMarshaller.marshall(createJobRequest.getCheckpointConfig(), CHECKPOINTCONFIG_BINDING);
            protocolMarshaller.marshall(createJobRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createJobRequest.getDeviceConfig(), DEVICECONFIG_BINDING);
            protocolMarshaller.marshall(createJobRequest.getHyperParameters(), HYPERPARAMETERS_BINDING);
            protocolMarshaller.marshall(createJobRequest.getInputDataConfig(), INPUTDATACONFIG_BINDING);
            protocolMarshaller.marshall(createJobRequest.getInstanceConfig(), INSTANCECONFIG_BINDING);
            protocolMarshaller.marshall(createJobRequest.getJobName(), JOBNAME_BINDING);
            protocolMarshaller.marshall(createJobRequest.getOutputDataConfig(), OUTPUTDATACONFIG_BINDING);
            protocolMarshaller.marshall(createJobRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(createJobRequest.getStoppingCondition(), STOPPINGCONDITION_BINDING);
            protocolMarshaller.marshall(createJobRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
