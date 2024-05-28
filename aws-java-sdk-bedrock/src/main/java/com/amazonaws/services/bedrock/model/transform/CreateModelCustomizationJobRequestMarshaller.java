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
package com.amazonaws.services.bedrock.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.bedrock.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateModelCustomizationJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateModelCustomizationJobRequestMarshaller {

    private static final MarshallingInfo<String> JOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("jobName").build();
    private static final MarshallingInfo<String> CUSTOMMODELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("customModelName").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArn").build();
    private static final MarshallingInfo<String> CLIENTREQUESTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientRequestToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> BASEMODELIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("baseModelIdentifier").build();
    private static final MarshallingInfo<String> CUSTOMIZATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("customizationType").build();
    private static final MarshallingInfo<String> CUSTOMMODELKMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("customModelKmsKeyId").build();
    private static final MarshallingInfo<List> JOBTAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("jobTags").build();
    private static final MarshallingInfo<List> CUSTOMMODELTAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("customModelTags").build();
    private static final MarshallingInfo<StructuredPojo> TRAININGDATACONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("trainingDataConfig").build();
    private static final MarshallingInfo<StructuredPojo> VALIDATIONDATACONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("validationDataConfig").build();
    private static final MarshallingInfo<StructuredPojo> OUTPUTDATACONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputDataConfig").build();
    private static final MarshallingInfo<Map> HYPERPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("hyperParameters").build();
    private static final MarshallingInfo<StructuredPojo> VPCCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vpcConfig").build();

    private static final CreateModelCustomizationJobRequestMarshaller instance = new CreateModelCustomizationJobRequestMarshaller();

    public static CreateModelCustomizationJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateModelCustomizationJobRequest createModelCustomizationJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (createModelCustomizationJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createModelCustomizationJobRequest.getJobName(), JOBNAME_BINDING);
            protocolMarshaller.marshall(createModelCustomizationJobRequest.getCustomModelName(), CUSTOMMODELNAME_BINDING);
            protocolMarshaller.marshall(createModelCustomizationJobRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(createModelCustomizationJobRequest.getClientRequestToken(), CLIENTREQUESTTOKEN_BINDING);
            protocolMarshaller.marshall(createModelCustomizationJobRequest.getBaseModelIdentifier(), BASEMODELIDENTIFIER_BINDING);
            protocolMarshaller.marshall(createModelCustomizationJobRequest.getCustomizationType(), CUSTOMIZATIONTYPE_BINDING);
            protocolMarshaller.marshall(createModelCustomizationJobRequest.getCustomModelKmsKeyId(), CUSTOMMODELKMSKEYID_BINDING);
            protocolMarshaller.marshall(createModelCustomizationJobRequest.getJobTags(), JOBTAGS_BINDING);
            protocolMarshaller.marshall(createModelCustomizationJobRequest.getCustomModelTags(), CUSTOMMODELTAGS_BINDING);
            protocolMarshaller.marshall(createModelCustomizationJobRequest.getTrainingDataConfig(), TRAININGDATACONFIG_BINDING);
            protocolMarshaller.marshall(createModelCustomizationJobRequest.getValidationDataConfig(), VALIDATIONDATACONFIG_BINDING);
            protocolMarshaller.marshall(createModelCustomizationJobRequest.getOutputDataConfig(), OUTPUTDATACONFIG_BINDING);
            protocolMarshaller.marshall(createModelCustomizationJobRequest.getHyperParameters(), HYPERPARAMETERS_BINDING);
            protocolMarshaller.marshall(createModelCustomizationJobRequest.getVpcConfig(), VPCCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
