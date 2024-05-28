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
package com.amazonaws.services.cleanrooms.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cleanrooms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateConfiguredAudienceModelAssociationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateConfiguredAudienceModelAssociationRequestMarshaller {

    private static final MarshallingInfo<String> MEMBERSHIPIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("membershipIdentifier").build();
    private static final MarshallingInfo<String> CONFIGUREDAUDIENCEMODELARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configuredAudienceModelArn").build();
    private static final MarshallingInfo<String> CONFIGUREDAUDIENCEMODELASSOCIATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configuredAudienceModelAssociationName").build();
    private static final MarshallingInfo<Boolean> MANAGERESOURCEPOLICIES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("manageResourcePolicies").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();

    private static final CreateConfiguredAudienceModelAssociationRequestMarshaller instance = new CreateConfiguredAudienceModelAssociationRequestMarshaller();

    public static CreateConfiguredAudienceModelAssociationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateConfiguredAudienceModelAssociationRequest createConfiguredAudienceModelAssociationRequest, ProtocolMarshaller protocolMarshaller) {

        if (createConfiguredAudienceModelAssociationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createConfiguredAudienceModelAssociationRequest.getMembershipIdentifier(), MEMBERSHIPIDENTIFIER_BINDING);
            protocolMarshaller.marshall(createConfiguredAudienceModelAssociationRequest.getConfiguredAudienceModelArn(), CONFIGUREDAUDIENCEMODELARN_BINDING);
            protocolMarshaller.marshall(createConfiguredAudienceModelAssociationRequest.getConfiguredAudienceModelAssociationName(),
                    CONFIGUREDAUDIENCEMODELASSOCIATIONNAME_BINDING);
            protocolMarshaller.marshall(createConfiguredAudienceModelAssociationRequest.getManageResourcePolicies(), MANAGERESOURCEPOLICIES_BINDING);
            protocolMarshaller.marshall(createConfiguredAudienceModelAssociationRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createConfiguredAudienceModelAssociationRequest.getDescription(), DESCRIPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
