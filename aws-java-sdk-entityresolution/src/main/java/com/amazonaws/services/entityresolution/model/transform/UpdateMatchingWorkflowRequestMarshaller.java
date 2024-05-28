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
package com.amazonaws.services.entityresolution.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.entityresolution.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateMatchingWorkflowRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateMatchingWorkflowRequestMarshaller {

    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<StructuredPojo> INCREMENTALRUNCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("incrementalRunConfig").build();
    private static final MarshallingInfo<List> INPUTSOURCECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputSourceConfig").build();
    private static final MarshallingInfo<List> OUTPUTSOURCECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputSourceConfig").build();
    private static final MarshallingInfo<StructuredPojo> RESOLUTIONTECHNIQUES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resolutionTechniques").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArn").build();
    private static final MarshallingInfo<String> WORKFLOWNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("workflowName").build();

    private static final UpdateMatchingWorkflowRequestMarshaller instance = new UpdateMatchingWorkflowRequestMarshaller();

    public static UpdateMatchingWorkflowRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateMatchingWorkflowRequest updateMatchingWorkflowRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateMatchingWorkflowRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateMatchingWorkflowRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateMatchingWorkflowRequest.getIncrementalRunConfig(), INCREMENTALRUNCONFIG_BINDING);
            protocolMarshaller.marshall(updateMatchingWorkflowRequest.getInputSourceConfig(), INPUTSOURCECONFIG_BINDING);
            protocolMarshaller.marshall(updateMatchingWorkflowRequest.getOutputSourceConfig(), OUTPUTSOURCECONFIG_BINDING);
            protocolMarshaller.marshall(updateMatchingWorkflowRequest.getResolutionTechniques(), RESOLUTIONTECHNIQUES_BINDING);
            protocolMarshaller.marshall(updateMatchingWorkflowRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(updateMatchingWorkflowRequest.getWorkflowName(), WORKFLOWNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
