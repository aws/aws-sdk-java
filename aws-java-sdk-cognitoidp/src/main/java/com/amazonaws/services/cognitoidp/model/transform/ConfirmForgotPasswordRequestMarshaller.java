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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cognitoidp.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConfirmForgotPasswordRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConfirmForgotPasswordRequestMarshaller {

    private static final MarshallingInfo<String> CLIENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ClientId").build();
    private static final MarshallingInfo<String> SECRETHASH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecretHash").build();
    private static final MarshallingInfo<String> USERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Username").build();
    private static final MarshallingInfo<String> CONFIRMATIONCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConfirmationCode").build();
    private static final MarshallingInfo<String> PASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Password").build();
    private static final MarshallingInfo<StructuredPojo> ANALYTICSMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AnalyticsMetadata").build();
    private static final MarshallingInfo<StructuredPojo> USERCONTEXTDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserContextData").build();

    private static final ConfirmForgotPasswordRequestMarshaller instance = new ConfirmForgotPasswordRequestMarshaller();

    public static ConfirmForgotPasswordRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConfirmForgotPasswordRequest confirmForgotPasswordRequest, ProtocolMarshaller protocolMarshaller) {

        if (confirmForgotPasswordRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(confirmForgotPasswordRequest.getClientId(), CLIENTID_BINDING);
            protocolMarshaller.marshall(confirmForgotPasswordRequest.getSecretHash(), SECRETHASH_BINDING);
            protocolMarshaller.marshall(confirmForgotPasswordRequest.getUsername(), USERNAME_BINDING);
            protocolMarshaller.marshall(confirmForgotPasswordRequest.getConfirmationCode(), CONFIRMATIONCODE_BINDING);
            protocolMarshaller.marshall(confirmForgotPasswordRequest.getPassword(), PASSWORD_BINDING);
            protocolMarshaller.marshall(confirmForgotPasswordRequest.getAnalyticsMetadata(), ANALYTICSMETADATA_BINDING);
            protocolMarshaller.marshall(confirmForgotPasswordRequest.getUserContextData(), USERCONTEXTDATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
