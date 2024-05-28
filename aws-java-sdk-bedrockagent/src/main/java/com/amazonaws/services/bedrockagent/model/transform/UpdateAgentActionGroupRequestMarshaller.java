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
package com.amazonaws.services.bedrockagent.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.bedrockagent.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateAgentActionGroupRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateAgentActionGroupRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> ACTIONGROUPEXECUTOR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("actionGroupExecutor").build();
    private static final MarshallingInfo<String> ACTIONGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("actionGroupId").build();
    private static final MarshallingInfo<String> ACTIONGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("actionGroupName").build();
    private static final MarshallingInfo<String> ACTIONGROUPSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("actionGroupState").build();
    private static final MarshallingInfo<String> AGENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("agentId").build();
    private static final MarshallingInfo<String> AGENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("agentVersion").build();
    private static final MarshallingInfo<StructuredPojo> APISCHEMA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("apiSchema").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<StructuredPojo> FUNCTIONSCHEMA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("functionSchema").build();
    private static final MarshallingInfo<String> PARENTACTIONGROUPSIGNATURE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("parentActionGroupSignature").build();

    private static final UpdateAgentActionGroupRequestMarshaller instance = new UpdateAgentActionGroupRequestMarshaller();

    public static UpdateAgentActionGroupRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateAgentActionGroupRequest updateAgentActionGroupRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateAgentActionGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateAgentActionGroupRequest.getActionGroupExecutor(), ACTIONGROUPEXECUTOR_BINDING);
            protocolMarshaller.marshall(updateAgentActionGroupRequest.getActionGroupId(), ACTIONGROUPID_BINDING);
            protocolMarshaller.marshall(updateAgentActionGroupRequest.getActionGroupName(), ACTIONGROUPNAME_BINDING);
            protocolMarshaller.marshall(updateAgentActionGroupRequest.getActionGroupState(), ACTIONGROUPSTATE_BINDING);
            protocolMarshaller.marshall(updateAgentActionGroupRequest.getAgentId(), AGENTID_BINDING);
            protocolMarshaller.marshall(updateAgentActionGroupRequest.getAgentVersion(), AGENTVERSION_BINDING);
            protocolMarshaller.marshall(updateAgentActionGroupRequest.getApiSchema(), APISCHEMA_BINDING);
            protocolMarshaller.marshall(updateAgentActionGroupRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateAgentActionGroupRequest.getFunctionSchema(), FUNCTIONSCHEMA_BINDING);
            protocolMarshaller.marshall(updateAgentActionGroupRequest.getParentActionGroupSignature(), PARENTACTIONGROUPSIGNATURE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
