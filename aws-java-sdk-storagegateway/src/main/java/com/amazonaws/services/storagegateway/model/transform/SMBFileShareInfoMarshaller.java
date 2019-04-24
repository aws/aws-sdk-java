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
 * SMBFileShareInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SMBFileShareInfoMarshaller {

    private static final MarshallingInfo<String> FILESHAREARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FileShareARN").build();
    private static final MarshallingInfo<String> FILESHAREID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FileShareId").build();
    private static final MarshallingInfo<String> FILESHARESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FileShareStatus").build();
    private static final MarshallingInfo<String> GATEWAYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GatewayARN").build();
    private static final MarshallingInfo<Boolean> KMSENCRYPTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KMSEncrypted").build();
    private static final MarshallingInfo<String> KMSKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KMSKey").build();
    private static final MarshallingInfo<String> PATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Path").build();
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

    private static final SMBFileShareInfoMarshaller instance = new SMBFileShareInfoMarshaller();

    public static SMBFileShareInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SMBFileShareInfo sMBFileShareInfo, ProtocolMarshaller protocolMarshaller) {

        if (sMBFileShareInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sMBFileShareInfo.getFileShareARN(), FILESHAREARN_BINDING);
            protocolMarshaller.marshall(sMBFileShareInfo.getFileShareId(), FILESHAREID_BINDING);
            protocolMarshaller.marshall(sMBFileShareInfo.getFileShareStatus(), FILESHARESTATUS_BINDING);
            protocolMarshaller.marshall(sMBFileShareInfo.getGatewayARN(), GATEWAYARN_BINDING);
            protocolMarshaller.marshall(sMBFileShareInfo.getKMSEncrypted(), KMSENCRYPTED_BINDING);
            protocolMarshaller.marshall(sMBFileShareInfo.getKMSKey(), KMSKEY_BINDING);
            protocolMarshaller.marshall(sMBFileShareInfo.getPath(), PATH_BINDING);
            protocolMarshaller.marshall(sMBFileShareInfo.getRole(), ROLE_BINDING);
            protocolMarshaller.marshall(sMBFileShareInfo.getLocationARN(), LOCATIONARN_BINDING);
            protocolMarshaller.marshall(sMBFileShareInfo.getDefaultStorageClass(), DEFAULTSTORAGECLASS_BINDING);
            protocolMarshaller.marshall(sMBFileShareInfo.getObjectACL(), OBJECTACL_BINDING);
            protocolMarshaller.marshall(sMBFileShareInfo.getReadOnly(), READONLY_BINDING);
            protocolMarshaller.marshall(sMBFileShareInfo.getGuessMIMETypeEnabled(), GUESSMIMETYPEENABLED_BINDING);
            protocolMarshaller.marshall(sMBFileShareInfo.getRequesterPays(), REQUESTERPAYS_BINDING);
            protocolMarshaller.marshall(sMBFileShareInfo.getSMBACLEnabled(), SMBACLENABLED_BINDING);
            protocolMarshaller.marshall(sMBFileShareInfo.getValidUserList(), VALIDUSERLIST_BINDING);
            protocolMarshaller.marshall(sMBFileShareInfo.getInvalidUserList(), INVALIDUSERLIST_BINDING);
            protocolMarshaller.marshall(sMBFileShareInfo.getAuthentication(), AUTHENTICATION_BINDING);
            protocolMarshaller.marshall(sMBFileShareInfo.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
