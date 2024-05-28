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
package com.amazonaws.services.pcaconnectorad.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pcaconnectorad.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateTemplateGroupAccessControlEntryRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateTemplateGroupAccessControlEntryRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> ACCESSRIGHTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccessRights").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> GROUPDISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GroupDisplayName").build();
    private static final MarshallingInfo<String> GROUPSECURITYIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GroupSecurityIdentifier").build();
    private static final MarshallingInfo<String> TEMPLATEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("TemplateArn").build();

    private static final CreateTemplateGroupAccessControlEntryRequestMarshaller instance = new CreateTemplateGroupAccessControlEntryRequestMarshaller();

    public static CreateTemplateGroupAccessControlEntryRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateTemplateGroupAccessControlEntryRequest createTemplateGroupAccessControlEntryRequest, ProtocolMarshaller protocolMarshaller) {

        if (createTemplateGroupAccessControlEntryRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createTemplateGroupAccessControlEntryRequest.getAccessRights(), ACCESSRIGHTS_BINDING);
            protocolMarshaller.marshall(createTemplateGroupAccessControlEntryRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createTemplateGroupAccessControlEntryRequest.getGroupDisplayName(), GROUPDISPLAYNAME_BINDING);
            protocolMarshaller.marshall(createTemplateGroupAccessControlEntryRequest.getGroupSecurityIdentifier(), GROUPSECURITYIDENTIFIER_BINDING);
            protocolMarshaller.marshall(createTemplateGroupAccessControlEntryRequest.getTemplateArn(), TEMPLATEARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
