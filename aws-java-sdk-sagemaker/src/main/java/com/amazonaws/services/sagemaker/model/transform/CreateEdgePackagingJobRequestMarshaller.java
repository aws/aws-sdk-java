/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * CreateEdgePackagingJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateEdgePackagingJobRequestMarshaller {

    private static final MarshallingInfo<String> EDGEPACKAGINGJOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EdgePackagingJobName").build();
    private static final MarshallingInfo<String> COMPILATIONJOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompilationJobName").build();
    private static final MarshallingInfo<String> MODELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ModelName").build();
    private static final MarshallingInfo<String> MODELVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelVersion").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleArn").build();
    private static final MarshallingInfo<StructuredPojo> OUTPUTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputConfig").build();
    private static final MarshallingInfo<String> RESOURCEKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceKey").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateEdgePackagingJobRequestMarshaller instance = new CreateEdgePackagingJobRequestMarshaller();

    public static CreateEdgePackagingJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateEdgePackagingJobRequest createEdgePackagingJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (createEdgePackagingJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createEdgePackagingJobRequest.getEdgePackagingJobName(), EDGEPACKAGINGJOBNAME_BINDING);
            protocolMarshaller.marshall(createEdgePackagingJobRequest.getCompilationJobName(), COMPILATIONJOBNAME_BINDING);
            protocolMarshaller.marshall(createEdgePackagingJobRequest.getModelName(), MODELNAME_BINDING);
            protocolMarshaller.marshall(createEdgePackagingJobRequest.getModelVersion(), MODELVERSION_BINDING);
            protocolMarshaller.marshall(createEdgePackagingJobRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(createEdgePackagingJobRequest.getOutputConfig(), OUTPUTCONFIG_BINDING);
            protocolMarshaller.marshall(createEdgePackagingJobRequest.getResourceKey(), RESOURCEKEY_BINDING);
            protocolMarshaller.marshall(createEdgePackagingJobRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
