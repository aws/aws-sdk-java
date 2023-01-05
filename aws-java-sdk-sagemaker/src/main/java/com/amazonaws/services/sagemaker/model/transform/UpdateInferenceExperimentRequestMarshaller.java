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
 * UpdateInferenceExperimentRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateInferenceExperimentRequestMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<StructuredPojo> SCHEDULE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Schedule").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<List> MODELVARIANTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ModelVariants").build();
    private static final MarshallingInfo<StructuredPojo> DATASTORAGECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataStorageConfig").build();
    private static final MarshallingInfo<StructuredPojo> SHADOWMODECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ShadowModeConfig").build();

    private static final UpdateInferenceExperimentRequestMarshaller instance = new UpdateInferenceExperimentRequestMarshaller();

    public static UpdateInferenceExperimentRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateInferenceExperimentRequest updateInferenceExperimentRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateInferenceExperimentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateInferenceExperimentRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateInferenceExperimentRequest.getSchedule(), SCHEDULE_BINDING);
            protocolMarshaller.marshall(updateInferenceExperimentRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateInferenceExperimentRequest.getModelVariants(), MODELVARIANTS_BINDING);
            protocolMarshaller.marshall(updateInferenceExperimentRequest.getDataStorageConfig(), DATASTORAGECONFIG_BINDING);
            protocolMarshaller.marshall(updateInferenceExperimentRequest.getShadowModeConfig(), SHADOWMODECONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
