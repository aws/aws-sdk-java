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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.managedgrafana.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateWorkspaceConfigurationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateWorkspaceConfigurationRequestMarshaller {

    private static final MarshallingInfo<String> CONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.JSON_VALUE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configuration").build();
    private static final MarshallingInfo<String> WORKSPACEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("workspaceId").build();

    private static final UpdateWorkspaceConfigurationRequestMarshaller instance = new UpdateWorkspaceConfigurationRequestMarshaller();

    public static UpdateWorkspaceConfigurationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateWorkspaceConfigurationRequest updateWorkspaceConfigurationRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateWorkspaceConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateWorkspaceConfigurationRequest.getConfiguration(), CONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateWorkspaceConfigurationRequest.getWorkspaceId(), WORKSPACEID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
