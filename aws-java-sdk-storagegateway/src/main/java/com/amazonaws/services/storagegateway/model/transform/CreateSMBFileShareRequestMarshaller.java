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
package com.amazonaws.services.storagegateway.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.storagegateway.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateSMBFileShareRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateSMBFileShareRequestMarshaller {

    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken").build();
    private static final MarshallingInfo<String> GATEWAYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GatewayARN").build();
    private static final MarshallingInfo<Boolean> KMSENCRYPTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KMSEncrypted").build();
    private static final MarshallingInfo<String> KMSKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KMSKey").build();
    private static final MarshallingInfo<String> ROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Role").build();
    private static final MarshallingInfo<String> LOCATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LocationARN").build();
    private static final MarshallingInfo<String> DEFAULTSTORAGECLASS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultStorageClass").build();
    private static final MarshallingInfo<String> OBJECTACL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ObjectACL").build();
    private static final MarshallingInfo<Boolean> READONLY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReadOnly").build();
    private static final MarshallingInfo<Boolean> GUESSMIMETYPEENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GuessMIMETypeEnabled").build();
    private static final MarshallingInfo<Boolean> REQUESTERPAYS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequesterPays").build();
    private static final MarshallingInfo<Boolean> SMBACLENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SMBACLEnabled").build();
    private static final MarshallingInfo<List> VALIDUSERLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ValidUserList").build();
    private static final MarshallingInfo<List> INVALIDUSERLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InvalidUserList").build();
    private static final MarshallingInfo<String> AUTHENTICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Authentication").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateSMBFileShareRequestMarshaller instance = new CreateSMBFileShareRequestMarshaller();

    public static CreateSMBFileShareRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateSMBFileShareRequest createSMBFileShareRequest, ProtocolMarshaller protocolMarshaller) {

        if (createSMBFileShareRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createSMBFileShareRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createSMBFileShareRequest.getGatewayARN(), GATEWAYARN_BINDING);
            protocolMarshaller.marshall(createSMBFileShareRequest.getKMSEncrypted(), KMSENCRYPTED_BINDING);
            protocolMarshaller.marshall(createSMBFileShareRequest.getKMSKey(), KMSKEY_BINDING);
            protocolMarshaller.marshall(createSMBFileShareRequest.getRole(), ROLE_BINDING);
            protocolMarshaller.marshall(createSMBFileShareRequest.getLocationARN(), LOCATIONARN_BINDING);
            protocolMarshaller.marshall(createSMBFileShareRequest.getDefaultStorageClass(), DEFAULTSTORAGECLASS_BINDING);
            protocolMarshaller.marshall(createSMBFileShareRequest.getObjectACL(), OBJECTACL_BINDING);
            protocolMarshaller.marshall(createSMBFileShareRequest.getReadOnly(), READONLY_BINDING);
            protocolMarshaller.marshall(createSMBFileShareRequest.getGuessMIMETypeEnabled(), GUESSMIMETYPEENABLED_BINDING);
            protocolMarshaller.marshall(createSMBFileShareRequest.getRequesterPays(), REQUESTERPAYS_BINDING);
            protocolMarshaller.marshall(createSMBFileShareRequest.getSMBACLEnabled(), SMBACLENABLED_BINDING);
            protocolMarshaller.marshall(createSMBFileShareRequest.getValidUserList(), VALIDUSERLIST_BINDING);
            protocolMarshaller.marshall(createSMBFileShareRequest.getInvalidUserList(), INVALIDUSERLIST_BINDING);
            protocolMarshaller.marshall(createSMBFileShareRequest.getAuthentication(), AUTHENTICATION_BINDING);
            protocolMarshaller.marshall(createSMBFileShareRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
