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
package com.amazonaws.services.signer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.signer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RevokeSigningProfileRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RevokeSigningProfileRequestMarshaller {

    private static final MarshallingInfo<String> PROFILENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("profileName").build();
    private static final MarshallingInfo<String> PROFILEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("profileVersion").build();
    private static final MarshallingInfo<String> REASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("reason").build();
    private static final MarshallingInfo<java.util.Date> EFFECTIVETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("effectiveTime").timestampFormat("unixTimestamp").build();

    private static final RevokeSigningProfileRequestMarshaller instance = new RevokeSigningProfileRequestMarshaller();

    public static RevokeSigningProfileRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RevokeSigningProfileRequest revokeSigningProfileRequest, ProtocolMarshaller protocolMarshaller) {

        if (revokeSigningProfileRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(revokeSigningProfileRequest.getProfileName(), PROFILENAME_BINDING);
            protocolMarshaller.marshall(revokeSigningProfileRequest.getProfileVersion(), PROFILEVERSION_BINDING);
            protocolMarshaller.marshall(revokeSigningProfileRequest.getReason(), REASON_BINDING);
            protocolMarshaller.marshall(revokeSigningProfileRequest.getEffectiveTime(), EFFECTIVETIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
