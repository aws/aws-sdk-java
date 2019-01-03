/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ram.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ram.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ResourceShareInvitationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ResourceShareInvitationMarshaller {

    private static final MarshallingInfo<String> RESOURCESHAREINVITATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceShareInvitationArn").build();
    private static final MarshallingInfo<String> RESOURCESHARENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceShareName").build();
    private static final MarshallingInfo<String> RESOURCESHAREARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceShareArn").build();
    private static final MarshallingInfo<String> SENDERACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("senderAccountId").build();
    private static final MarshallingInfo<String> RECEIVERACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("receiverAccountId").build();
    private static final MarshallingInfo<java.util.Date> INVITATIONTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("invitationTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<List> RESOURCESHAREASSOCIATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceShareAssociations").build();

    private static final ResourceShareInvitationMarshaller instance = new ResourceShareInvitationMarshaller();

    public static ResourceShareInvitationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ResourceShareInvitation resourceShareInvitation, ProtocolMarshaller protocolMarshaller) {

        if (resourceShareInvitation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(resourceShareInvitation.getResourceShareInvitationArn(), RESOURCESHAREINVITATIONARN_BINDING);
            protocolMarshaller.marshall(resourceShareInvitation.getResourceShareName(), RESOURCESHARENAME_BINDING);
            protocolMarshaller.marshall(resourceShareInvitation.getResourceShareArn(), RESOURCESHAREARN_BINDING);
            protocolMarshaller.marshall(resourceShareInvitation.getSenderAccountId(), SENDERACCOUNTID_BINDING);
            protocolMarshaller.marshall(resourceShareInvitation.getReceiverAccountId(), RECEIVERACCOUNTID_BINDING);
            protocolMarshaller.marshall(resourceShareInvitation.getInvitationTimestamp(), INVITATIONTIMESTAMP_BINDING);
            protocolMarshaller.marshall(resourceShareInvitation.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(resourceShareInvitation.getResourceShareAssociations(), RESOURCESHAREASSOCIATIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
