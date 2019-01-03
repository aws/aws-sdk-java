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
package com.amazonaws.services.opsworks.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opsworks.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateUserProfileRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateUserProfileRequestMarshaller {

    private static final MarshallingInfo<String> IAMUSERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IamUserArn").build();
    private static final MarshallingInfo<String> SSHUSERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SshUsername").build();
    private static final MarshallingInfo<String> SSHPUBLICKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SshPublicKey").build();
    private static final MarshallingInfo<Boolean> ALLOWSELFMANAGEMENT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllowSelfManagement").build();

    private static final CreateUserProfileRequestMarshaller instance = new CreateUserProfileRequestMarshaller();

    public static CreateUserProfileRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateUserProfileRequest createUserProfileRequest, ProtocolMarshaller protocolMarshaller) {

        if (createUserProfileRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createUserProfileRequest.getIamUserArn(), IAMUSERARN_BINDING);
            protocolMarshaller.marshall(createUserProfileRequest.getSshUsername(), SSHUSERNAME_BINDING);
            protocolMarshaller.marshall(createUserProfileRequest.getSshPublicKey(), SSHPUBLICKEY_BINDING);
            protocolMarshaller.marshall(createUserProfileRequest.getAllowSelfManagement(), ALLOWSELFMANAGEMENT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
