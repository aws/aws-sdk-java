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
 * GetCollaborationConfiguredAudienceModelAssociationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetCollaborationConfiguredAudienceModelAssociationRequestMarshaller {

    private static final MarshallingInfo<String> COLLABORATIONIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("collaborationIdentifier").build();
    private static final MarshallingInfo<String> CONFIGUREDAUDIENCEMODELASSOCIATIONIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("configuredAudienceModelAssociationIdentifier").build();

    private static final GetCollaborationConfiguredAudienceModelAssociationRequestMarshaller instance = new GetCollaborationConfiguredAudienceModelAssociationRequestMarshaller();

    public static GetCollaborationConfiguredAudienceModelAssociationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetCollaborationConfiguredAudienceModelAssociationRequest getCollaborationConfiguredAudienceModelAssociationRequest,
            ProtocolMarshaller protocolMarshaller) {

        if (getCollaborationConfiguredAudienceModelAssociationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller
                    .marshall(getCollaborationConfiguredAudienceModelAssociationRequest.getCollaborationIdentifier(), COLLABORATIONIDENTIFIER_BINDING);
            protocolMarshaller.marshall(getCollaborationConfiguredAudienceModelAssociationRequest.getConfiguredAudienceModelAssociationIdentifier(),
                    CONFIGUREDAUDIENCEMODELASSOCIATIONIDENTIFIER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
