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
package com.amazonaws.services.verifiedpermissions.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.verifiedpermissions.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * IdentitySourceItemDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class IdentitySourceItemDetailsMarshaller {

    private static final MarshallingInfo<List> CLIENTIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("clientIds").build();
    private static final MarshallingInfo<String> USERPOOLARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("userPoolArn").build();
    private static final MarshallingInfo<String> DISCOVERYURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("discoveryUrl").build();
    private static final MarshallingInfo<String> OPENIDISSUER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("openIdIssuer").build();

    private static final IdentitySourceItemDetailsMarshaller instance = new IdentitySourceItemDetailsMarshaller();

    public static IdentitySourceItemDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(IdentitySourceItemDetails identitySourceItemDetails, ProtocolMarshaller protocolMarshaller) {

        if (identitySourceItemDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(identitySourceItemDetails.getClientIds(), CLIENTIDS_BINDING);
            protocolMarshaller.marshall(identitySourceItemDetails.getUserPoolArn(), USERPOOLARN_BINDING);
            protocolMarshaller.marshall(identitySourceItemDetails.getDiscoveryUrl(), DISCOVERYURL_BINDING);
            protocolMarshaller.marshall(identitySourceItemDetails.getOpenIdIssuer(), OPENIDISSUER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
