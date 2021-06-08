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
package com.amazonaws.services.quicksight.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateUserRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateUserRequestMarshaller {

    private static final MarshallingInfo<String> USERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("UserName").build();
    private static final MarshallingInfo<String> AWSACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("AwsAccountId").build();
    private static final MarshallingInfo<String> NAMESPACE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("Namespace").build();
    private static final MarshallingInfo<String> EMAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Email").build();
    private static final MarshallingInfo<String> ROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Role").build();
    private static final MarshallingInfo<String> CUSTOMPERMISSIONSNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomPermissionsName").build();
    private static final MarshallingInfo<Boolean> UNAPPLYCUSTOMPERMISSIONS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UnapplyCustomPermissions").build();
    private static final MarshallingInfo<String> EXTERNALLOGINFEDERATIONPROVIDERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExternalLoginFederationProviderType").build();
    private static final MarshallingInfo<String> CUSTOMFEDERATIONPROVIDERURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomFederationProviderUrl").build();
    private static final MarshallingInfo<String> EXTERNALLOGINID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExternalLoginId").build();

    private static final UpdateUserRequestMarshaller instance = new UpdateUserRequestMarshaller();

    public static UpdateUserRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateUserRequest updateUserRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateUserRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateUserRequest.getUserName(), USERNAME_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getAwsAccountId(), AWSACCOUNTID_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getNamespace(), NAMESPACE_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getEmail(), EMAIL_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getRole(), ROLE_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getCustomPermissionsName(), CUSTOMPERMISSIONSNAME_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getUnapplyCustomPermissions(), UNAPPLYCUSTOMPERMISSIONS_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getExternalLoginFederationProviderType(), EXTERNALLOGINFEDERATIONPROVIDERTYPE_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getCustomFederationProviderUrl(), CUSTOMFEDERATIONPROVIDERURL_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getExternalLoginId(), EXTERNALLOGINID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
