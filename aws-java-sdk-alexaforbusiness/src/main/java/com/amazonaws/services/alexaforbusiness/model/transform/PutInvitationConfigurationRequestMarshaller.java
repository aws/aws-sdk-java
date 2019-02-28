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
package com.amazonaws.services.alexaforbusiness.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.alexaforbusiness.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutInvitationConfigurationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutInvitationConfigurationRequestMarshaller {

    private static final MarshallingInfo<String> ORGANIZATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrganizationName").build();
    private static final MarshallingInfo<String> CONTACTEMAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContactEmail").build();
    private static final MarshallingInfo<List> PRIVATESKILLIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrivateSkillIds").build();

    private static final PutInvitationConfigurationRequestMarshaller instance = new PutInvitationConfigurationRequestMarshaller();

    public static PutInvitationConfigurationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutInvitationConfigurationRequest putInvitationConfigurationRequest, ProtocolMarshaller protocolMarshaller) {

        if (putInvitationConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putInvitationConfigurationRequest.getOrganizationName(), ORGANIZATIONNAME_BINDING);
            protocolMarshaller.marshall(putInvitationConfigurationRequest.getContactEmail(), CONTACTEMAIL_BINDING);
            protocolMarshaller.marshall(putInvitationConfigurationRequest.getPrivateSkillIds(), PRIVATESKILLIDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
