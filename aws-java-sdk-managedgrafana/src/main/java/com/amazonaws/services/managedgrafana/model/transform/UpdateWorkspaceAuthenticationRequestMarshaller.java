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
package com.amazonaws.services.managedgrafana.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.managedgrafana.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateWorkspaceAuthenticationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateWorkspaceAuthenticationRequestMarshaller {

    private static final MarshallingInfo<List> AUTHENTICATIONPROVIDERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authenticationProviders").build();
    private static final MarshallingInfo<StructuredPojo> SAMLCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("samlConfiguration").build();
    private static final MarshallingInfo<String> WORKSPACEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("workspaceId").build();

    private static final UpdateWorkspaceAuthenticationRequestMarshaller instance = new UpdateWorkspaceAuthenticationRequestMarshaller();

    public static UpdateWorkspaceAuthenticationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateWorkspaceAuthenticationRequest updateWorkspaceAuthenticationRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateWorkspaceAuthenticationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateWorkspaceAuthenticationRequest.getAuthenticationProviders(), AUTHENTICATIONPROVIDERS_BINDING);
            protocolMarshaller.marshall(updateWorkspaceAuthenticationRequest.getSamlConfiguration(), SAMLCONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateWorkspaceAuthenticationRequest.getWorkspaceId(), WORKSPACEID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
