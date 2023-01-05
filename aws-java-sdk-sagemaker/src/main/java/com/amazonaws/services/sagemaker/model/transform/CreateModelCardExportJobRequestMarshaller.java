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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateModelCardExportJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateModelCardExportJobRequestMarshaller {

    private static final MarshallingInfo<String> MODELCARDNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelCardName").build();
    private static final MarshallingInfo<Integer> MODELCARDVERSION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelCardVersion").build();
    private static final MarshallingInfo<String> MODELCARDEXPORTJOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelCardExportJobName").build();
    private static final MarshallingInfo<StructuredPojo> OUTPUTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputConfig").build();

    private static final CreateModelCardExportJobRequestMarshaller instance = new CreateModelCardExportJobRequestMarshaller();

    public static CreateModelCardExportJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateModelCardExportJobRequest createModelCardExportJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (createModelCardExportJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createModelCardExportJobRequest.getModelCardName(), MODELCARDNAME_BINDING);
            protocolMarshaller.marshall(createModelCardExportJobRequest.getModelCardVersion(), MODELCARDVERSION_BINDING);
            protocolMarshaller.marshall(createModelCardExportJobRequest.getModelCardExportJobName(), MODELCARDEXPORTJOBNAME_BINDING);
            protocolMarshaller.marshall(createModelCardExportJobRequest.getOutputConfig(), OUTPUTCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
