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
 * DeleteAgentActionGroupRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeleteAgentActionGroupRequestMarshaller {

    private static final MarshallingInfo<String> ACTIONGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("actionGroupId").build();
    private static final MarshallingInfo<String> AGENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("agentId").build();
    private static final MarshallingInfo<String> AGENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("agentVersion").build();
    private static final MarshallingInfo<Boolean> SKIPRESOURCEINUSECHECK_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("skipResourceInUseCheck").build();

    private static final DeleteAgentActionGroupRequestMarshaller instance = new DeleteAgentActionGroupRequestMarshaller();

    public static DeleteAgentActionGroupRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeleteAgentActionGroupRequest deleteAgentActionGroupRequest, ProtocolMarshaller protocolMarshaller) {

        if (deleteAgentActionGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deleteAgentActionGroupRequest.getActionGroupId(), ACTIONGROUPID_BINDING);
            protocolMarshaller.marshall(deleteAgentActionGroupRequest.getAgentId(), AGENTID_BINDING);
            protocolMarshaller.marshall(deleteAgentActionGroupRequest.getAgentVersion(), AGENTVERSION_BINDING);
            protocolMarshaller.marshall(deleteAgentActionGroupRequest.getSkipResourceInUseCheck(), SKIPRESOURCEINUSECHECK_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
