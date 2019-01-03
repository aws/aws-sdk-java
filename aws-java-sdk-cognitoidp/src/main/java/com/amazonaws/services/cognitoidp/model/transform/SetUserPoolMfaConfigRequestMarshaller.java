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
 * SetUserPoolMfaConfigRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SetUserPoolMfaConfigRequestMarshaller {

    private static final MarshallingInfo<String> USERPOOLID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserPoolId").build();
    private static final MarshallingInfo<StructuredPojo> SMSMFACONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SmsMfaConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> SOFTWARETOKENMFACONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SoftwareTokenMfaConfiguration").build();
    private static final MarshallingInfo<String> MFACONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MfaConfiguration").build();

    private static final SetUserPoolMfaConfigRequestMarshaller instance = new SetUserPoolMfaConfigRequestMarshaller();

    public static SetUserPoolMfaConfigRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SetUserPoolMfaConfigRequest setUserPoolMfaConfigRequest, ProtocolMarshaller protocolMarshaller) {

        if (setUserPoolMfaConfigRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(setUserPoolMfaConfigRequest.getUserPoolId(), USERPOOLID_BINDING);
            protocolMarshaller.marshall(setUserPoolMfaConfigRequest.getSmsMfaConfiguration(), SMSMFACONFIGURATION_BINDING);
            protocolMarshaller.marshall(setUserPoolMfaConfigRequest.getSoftwareTokenMfaConfiguration(), SOFTWARETOKENMFACONFIGURATION_BINDING);
            protocolMarshaller.marshall(setUserPoolMfaConfigRequest.getMfaConfiguration(), MFACONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
