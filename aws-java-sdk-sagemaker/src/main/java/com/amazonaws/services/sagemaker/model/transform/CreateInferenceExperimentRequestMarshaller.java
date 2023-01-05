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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateInferenceExperimentRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateInferenceExperimentRequestMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<StructuredPojo> SCHEDULE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Schedule").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleArn").build();
    private static final MarshallingInfo<String> ENDPOINTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointName").build();
    private static final MarshallingInfo<List> MODELVARIANTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ModelVariants").build();
    private static final MarshallingInfo<StructuredPojo> DATASTORAGECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataStorageConfig").build();
    private static final MarshallingInfo<StructuredPojo> SHADOWMODECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ShadowModeConfig").build();
    private static final MarshallingInfo<String> KMSKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKey").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateInferenceExperimentRequestMarshaller instance = new CreateInferenceExperimentRequestMarshaller();

    public static CreateInferenceExperimentRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateInferenceExperimentRequest createInferenceExperimentRequest, ProtocolMarshaller protocolMarshaller) {

        if (createInferenceExperimentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createInferenceExperimentRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createInferenceExperimentRequest.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(createInferenceExperimentRequest.getSchedule(), SCHEDULE_BINDING);
            protocolMarshaller.marshall(createInferenceExperimentRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createInferenceExperimentRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(createInferenceExperimentRequest.getEndpointName(), ENDPOINTNAME_BINDING);
            protocolMarshaller.marshall(createInferenceExperimentRequest.getModelVariants(), MODELVARIANTS_BINDING);
            protocolMarshaller.marshall(createInferenceExperimentRequest.getDataStorageConfig(), DATASTORAGECONFIG_BINDING);
            protocolMarshaller.marshall(createInferenceExperimentRequest.getShadowModeConfig(), SHADOWMODECONFIG_BINDING);
            protocolMarshaller.marshall(createInferenceExperimentRequest.getKmsKey(), KMSKEY_BINDING);
            protocolMarshaller.marshall(createInferenceExperimentRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
