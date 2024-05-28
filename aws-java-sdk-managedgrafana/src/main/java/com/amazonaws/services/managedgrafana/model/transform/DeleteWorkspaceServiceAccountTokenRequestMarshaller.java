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
package com.amazonaws.services.managedgrafana.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.managedgrafana.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeleteWorkspaceServiceAccountTokenRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeleteWorkspaceServiceAccountTokenRequestMarshaller {

    private static final MarshallingInfo<String> SERVICEACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("serviceAccountId").build();
    private static final MarshallingInfo<String> TOKENID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("tokenId").build();
    private static final MarshallingInfo<String> WORKSPACEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("workspaceId").build();

    private static final DeleteWorkspaceServiceAccountTokenRequestMarshaller instance = new DeleteWorkspaceServiceAccountTokenRequestMarshaller();

    public static DeleteWorkspaceServiceAccountTokenRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeleteWorkspaceServiceAccountTokenRequest deleteWorkspaceServiceAccountTokenRequest, ProtocolMarshaller protocolMarshaller) {

        if (deleteWorkspaceServiceAccountTokenRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deleteWorkspaceServiceAccountTokenRequest.getServiceAccountId(), SERVICEACCOUNTID_BINDING);
            protocolMarshaller.marshall(deleteWorkspaceServiceAccountTokenRequest.getTokenId(), TOKENID_BINDING);
            protocolMarshaller.marshall(deleteWorkspaceServiceAccountTokenRequest.getWorkspaceId(), WORKSPACEID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
