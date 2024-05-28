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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.entityresolution.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateIdMappingWorkflowRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateIdMappingWorkflowRequestMarshaller {

    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<StructuredPojo> IDMAPPINGTECHNIQUES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("idMappingTechniques").build();
    private static final MarshallingInfo<List> INPUTSOURCECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputSourceConfig").build();
    private static final MarshallingInfo<List> OUTPUTSOURCECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputSourceConfig").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArn").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> WORKFLOWNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workflowName").build();

    private static final CreateIdMappingWorkflowRequestMarshaller instance = new CreateIdMappingWorkflowRequestMarshaller();

    public static CreateIdMappingWorkflowRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateIdMappingWorkflowRequest createIdMappingWorkflowRequest, ProtocolMarshaller protocolMarshaller) {

        if (createIdMappingWorkflowRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createIdMappingWorkflowRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createIdMappingWorkflowRequest.getIdMappingTechniques(), IDMAPPINGTECHNIQUES_BINDING);
            protocolMarshaller.marshall(createIdMappingWorkflowRequest.getInputSourceConfig(), INPUTSOURCECONFIG_BINDING);
            protocolMarshaller.marshall(createIdMappingWorkflowRequest.getOutputSourceConfig(), OUTPUTSOURCECONFIG_BINDING);
            protocolMarshaller.marshall(createIdMappingWorkflowRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(createIdMappingWorkflowRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createIdMappingWorkflowRequest.getWorkflowName(), WORKFLOWNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
