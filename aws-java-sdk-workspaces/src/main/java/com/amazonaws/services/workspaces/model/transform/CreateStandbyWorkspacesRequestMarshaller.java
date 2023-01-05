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
package com.amazonaws.services.workspaces.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workspaces.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateStandbyWorkspacesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateStandbyWorkspacesRequestMarshaller {

    private static final MarshallingInfo<String> PRIMARYREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrimaryRegion").build();
    private static final MarshallingInfo<List> STANDBYWORKSPACES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StandbyWorkspaces").build();

    private static final CreateStandbyWorkspacesRequestMarshaller instance = new CreateStandbyWorkspacesRequestMarshaller();

    public static CreateStandbyWorkspacesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateStandbyWorkspacesRequest createStandbyWorkspacesRequest, ProtocolMarshaller protocolMarshaller) {

        if (createStandbyWorkspacesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createStandbyWorkspacesRequest.getPrimaryRegion(), PRIMARYREGION_BINDING);
            protocolMarshaller.marshall(createStandbyWorkspacesRequest.getStandbyWorkspaces(), STANDBYWORKSPACES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
