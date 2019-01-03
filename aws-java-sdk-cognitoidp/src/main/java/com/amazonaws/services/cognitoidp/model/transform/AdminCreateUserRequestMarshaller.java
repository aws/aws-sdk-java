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
package com.amazonaws.services.cognitoidp.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cognitoidp.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AdminCreateUserRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AdminCreateUserRequestMarshaller {

    private static final MarshallingInfo<String> USERPOOLID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserPoolId").build();
    private static final MarshallingInfo<String> USERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Username").build();
    private static final MarshallingInfo<List> USERATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserAttributes").build();
    private static final MarshallingInfo<List> VALIDATIONDATA_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ValidationData").build();
    private static final MarshallingInfo<String> TEMPORARYPASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TemporaryPassword").build();
    private static final MarshallingInfo<Boolean> FORCEALIASCREATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ForceAliasCreation").build();
    private static final MarshallingInfo<String> MESSAGEACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MessageAction").build();
    private static final MarshallingInfo<List> DESIREDDELIVERYMEDIUMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DesiredDeliveryMediums").build();

    private static final AdminCreateUserRequestMarshaller instance = new AdminCreateUserRequestMarshaller();

    public static AdminCreateUserRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AdminCreateUserRequest adminCreateUserRequest, ProtocolMarshaller protocolMarshaller) {

        if (adminCreateUserRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(adminCreateUserRequest.getUserPoolId(), USERPOOLID_BINDING);
            protocolMarshaller.marshall(adminCreateUserRequest.getUsername(), USERNAME_BINDING);
            protocolMarshaller.marshall(adminCreateUserRequest.getUserAttributes(), USERATTRIBUTES_BINDING);
            protocolMarshaller.marshall(adminCreateUserRequest.getValidationData(), VALIDATIONDATA_BINDING);
            protocolMarshaller.marshall(adminCreateUserRequest.getTemporaryPassword(), TEMPORARYPASSWORD_BINDING);
            protocolMarshaller.marshall(adminCreateUserRequest.getForceAliasCreation(), FORCEALIASCREATION_BINDING);
            protocolMarshaller.marshall(adminCreateUserRequest.getMessageAction(), MESSAGEACTION_BINDING);
            protocolMarshaller.marshall(adminCreateUserRequest.getDesiredDeliveryMediums(), DESIREDDELIVERYMEDIUMS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
