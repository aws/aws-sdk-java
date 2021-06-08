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
package com.amazonaws.services.workspaces.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workspaces.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateConnectionAliasPermissionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateConnectionAliasPermissionRequestMarshaller {

    private static final MarshallingInfo<String> ALIASID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AliasId").build();
    private static final MarshallingInfo<StructuredPojo> CONNECTIONALIASPERMISSION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectionAliasPermission").build();

    private static final UpdateConnectionAliasPermissionRequestMarshaller instance = new UpdateConnectionAliasPermissionRequestMarshaller();

    public static UpdateConnectionAliasPermissionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateConnectionAliasPermissionRequest updateConnectionAliasPermissionRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateConnectionAliasPermissionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateConnectionAliasPermissionRequest.getAliasId(), ALIASID_BINDING);
            protocolMarshaller.marshall(updateConnectionAliasPermissionRequest.getConnectionAliasPermission(), CONNECTIONALIASPERMISSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
