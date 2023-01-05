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
 * CoreNetworkPolicyVersionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CoreNetworkPolicyVersionMarshaller {

    private static final MarshallingInfo<String> CORENETWORKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CoreNetworkId").build();
    private static final MarshallingInfo<Integer> POLICYVERSIONID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PolicyVersionId").build();
    private static final MarshallingInfo<String> ALIAS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Alias").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> CHANGESETSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChangeSetState").build();

    private static final CoreNetworkPolicyVersionMarshaller instance = new CoreNetworkPolicyVersionMarshaller();

    public static CoreNetworkPolicyVersionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CoreNetworkPolicyVersion coreNetworkPolicyVersion, ProtocolMarshaller protocolMarshaller) {

        if (coreNetworkPolicyVersion == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(coreNetworkPolicyVersion.getCoreNetworkId(), CORENETWORKID_BINDING);
            protocolMarshaller.marshall(coreNetworkPolicyVersion.getPolicyVersionId(), POLICYVERSIONID_BINDING);
            protocolMarshaller.marshall(coreNetworkPolicyVersion.getAlias(), ALIAS_BINDING);
            protocolMarshaller.marshall(coreNetworkPolicyVersion.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(coreNetworkPolicyVersion.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(coreNetworkPolicyVersion.getChangeSetState(), CHANGESETSTATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
