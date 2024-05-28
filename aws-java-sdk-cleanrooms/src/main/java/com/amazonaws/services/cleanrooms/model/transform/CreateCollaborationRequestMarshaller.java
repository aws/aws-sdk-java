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
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cleanrooms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateCollaborationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateCollaborationRequestMarshaller {

    private static final MarshallingInfo<List> MEMBERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("members").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<List> CREATORMEMBERABILITIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creatorMemberAbilities").build();
    private static final MarshallingInfo<String> CREATORDISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creatorDisplayName").build();
    private static final MarshallingInfo<StructuredPojo> DATAENCRYPTIONMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataEncryptionMetadata").build();
    private static final MarshallingInfo<String> QUERYLOGSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("queryLogStatus").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<StructuredPojo> CREATORPAYMENTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creatorPaymentConfiguration").build();

    private static final CreateCollaborationRequestMarshaller instance = new CreateCollaborationRequestMarshaller();

    public static CreateCollaborationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateCollaborationRequest createCollaborationRequest, ProtocolMarshaller protocolMarshaller) {

        if (createCollaborationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createCollaborationRequest.getMembers(), MEMBERS_BINDING);
            protocolMarshaller.marshall(createCollaborationRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createCollaborationRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createCollaborationRequest.getCreatorMemberAbilities(), CREATORMEMBERABILITIES_BINDING);
            protocolMarshaller.marshall(createCollaborationRequest.getCreatorDisplayName(), CREATORDISPLAYNAME_BINDING);
            protocolMarshaller.marshall(createCollaborationRequest.getDataEncryptionMetadata(), DATAENCRYPTIONMETADATA_BINDING);
            protocolMarshaller.marshall(createCollaborationRequest.getQueryLogStatus(), QUERYLOGSTATUS_BINDING);
            protocolMarshaller.marshall(createCollaborationRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createCollaborationRequest.getCreatorPaymentConfiguration(), CREATORPAYMENTCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
