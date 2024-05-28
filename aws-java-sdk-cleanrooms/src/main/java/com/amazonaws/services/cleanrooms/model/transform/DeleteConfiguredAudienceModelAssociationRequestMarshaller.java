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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cleanrooms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeleteConfiguredAudienceModelAssociationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeleteConfiguredAudienceModelAssociationRequestMarshaller {

    private static final MarshallingInfo<String> CONFIGUREDAUDIENCEMODELASSOCIATIONIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("configuredAudienceModelAssociationIdentifier").build();
    private static final MarshallingInfo<String> MEMBERSHIPIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("membershipIdentifier").build();

    private static final DeleteConfiguredAudienceModelAssociationRequestMarshaller instance = new DeleteConfiguredAudienceModelAssociationRequestMarshaller();

    public static DeleteConfiguredAudienceModelAssociationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeleteConfiguredAudienceModelAssociationRequest deleteConfiguredAudienceModelAssociationRequest, ProtocolMarshaller protocolMarshaller) {

        if (deleteConfiguredAudienceModelAssociationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deleteConfiguredAudienceModelAssociationRequest.getConfiguredAudienceModelAssociationIdentifier(),
                    CONFIGUREDAUDIENCEMODELASSOCIATIONIDENTIFIER_BINDING);
            protocolMarshaller.marshall(deleteConfiguredAudienceModelAssociationRequest.getMembershipIdentifier(), MEMBERSHIPIDENTIFIER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
