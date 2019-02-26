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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.storagegateway.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ChapInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ChapInfoMarshaller {

    private static final MarshallingInfo<String> TARGETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TargetARN").build();
    private static final MarshallingInfo<String> SECRETTOAUTHENTICATEINITIATOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecretToAuthenticateInitiator").build();
    private static final MarshallingInfo<String> INITIATORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InitiatorName").build();
    private static final MarshallingInfo<String> SECRETTOAUTHENTICATETARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecretToAuthenticateTarget").build();

    private static final ChapInfoMarshaller instance = new ChapInfoMarshaller();

    public static ChapInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ChapInfo chapInfo, ProtocolMarshaller protocolMarshaller) {

        if (chapInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(chapInfo.getTargetARN(), TARGETARN_BINDING);
            protocolMarshaller.marshall(chapInfo.getSecretToAuthenticateInitiator(), SECRETTOAUTHENTICATEINITIATOR_BINDING);
            protocolMarshaller.marshall(chapInfo.getInitiatorName(), INITIATORNAME_BINDING);
            protocolMarshaller.marshall(chapInfo.getSecretToAuthenticateTarget(), SECRETTOAUTHENTICATETARGET_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
