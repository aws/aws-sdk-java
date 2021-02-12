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
package com.amazonaws.services.macie2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.macie2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AcceptInvitationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AcceptInvitationRequestMarshaller {

    private static final MarshallingInfo<String> ADMINISTRATORACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("administratorAccountId").build();
    private static final MarshallingInfo<String> INVITATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("invitationId").build();
    private static final MarshallingInfo<String> MASTERACCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("masterAccount").build();

    private static final AcceptInvitationRequestMarshaller instance = new AcceptInvitationRequestMarshaller();

    public static AcceptInvitationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AcceptInvitationRequest acceptInvitationRequest, ProtocolMarshaller protocolMarshaller) {

        if (acceptInvitationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(acceptInvitationRequest.getAdministratorAccountId(), ADMINISTRATORACCOUNTID_BINDING);
            protocolMarshaller.marshall(acceptInvitationRequest.getInvitationId(), INVITATIONID_BINDING);
            protocolMarshaller.marshall(acceptInvitationRequest.getMasterAccount(), MASTERACCOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
