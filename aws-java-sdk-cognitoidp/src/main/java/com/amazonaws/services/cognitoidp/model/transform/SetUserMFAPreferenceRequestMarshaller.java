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
 * SetUserMFAPreferenceRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SetUserMFAPreferenceRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> SMSMFASETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SMSMfaSettings").build();
    private static final MarshallingInfo<StructuredPojo> SOFTWARETOKENMFASETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SoftwareTokenMfaSettings").build();
    private static final MarshallingInfo<String> ACCESSTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccessToken").build();

    private static final SetUserMFAPreferenceRequestMarshaller instance = new SetUserMFAPreferenceRequestMarshaller();

    public static SetUserMFAPreferenceRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SetUserMFAPreferenceRequest setUserMFAPreferenceRequest, ProtocolMarshaller protocolMarshaller) {

        if (setUserMFAPreferenceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(setUserMFAPreferenceRequest.getSMSMfaSettings(), SMSMFASETTINGS_BINDING);
            protocolMarshaller.marshall(setUserMFAPreferenceRequest.getSoftwareTokenMfaSettings(), SOFTWARETOKENMFASETTINGS_BINDING);
            protocolMarshaller.marshall(setUserMFAPreferenceRequest.getAccessToken(), ACCESSTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
