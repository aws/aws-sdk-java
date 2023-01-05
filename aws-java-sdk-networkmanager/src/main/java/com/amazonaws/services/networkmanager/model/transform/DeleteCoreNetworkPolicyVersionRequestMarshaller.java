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
package com.amazonaws.services.networkmanager.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.networkmanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeleteCoreNetworkPolicyVersionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeleteCoreNetworkPolicyVersionRequestMarshaller {

    private static final MarshallingInfo<String> CORENETWORKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("coreNetworkId").build();
    private static final MarshallingInfo<Integer> POLICYVERSIONID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("policyVersionId").build();

    private static final DeleteCoreNetworkPolicyVersionRequestMarshaller instance = new DeleteCoreNetworkPolicyVersionRequestMarshaller();

    public static DeleteCoreNetworkPolicyVersionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeleteCoreNetworkPolicyVersionRequest deleteCoreNetworkPolicyVersionRequest, ProtocolMarshaller protocolMarshaller) {

        if (deleteCoreNetworkPolicyVersionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deleteCoreNetworkPolicyVersionRequest.getCoreNetworkId(), CORENETWORKID_BINDING);
            protocolMarshaller.marshall(deleteCoreNetworkPolicyVersionRequest.getPolicyVersionId(), POLICYVERSIONID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
