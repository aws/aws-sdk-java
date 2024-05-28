/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.location.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.location.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateKeyRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateKeyRequestMarshaller {

    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<java.util.Date> EXPIRETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExpireTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<Boolean> FORCEUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ForceUpdate").build();
    private static final MarshallingInfo<String> KEYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("KeyName").build();
    private static final MarshallingInfo<Boolean> NOEXPIRY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NoExpiry").build();
    private static final MarshallingInfo<StructuredPojo> RESTRICTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Restrictions").build();

    private static final UpdateKeyRequestMarshaller instance = new UpdateKeyRequestMarshaller();

    public static UpdateKeyRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateKeyRequest updateKeyRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateKeyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateKeyRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateKeyRequest.getExpireTime(), EXPIRETIME_BINDING);
            protocolMarshaller.marshall(updateKeyRequest.getForceUpdate(), FORCEUPDATE_BINDING);
            protocolMarshaller.marshall(updateKeyRequest.getKeyName(), KEYNAME_BINDING);
            protocolMarshaller.marshall(updateKeyRequest.getNoExpiry(), NOEXPIRY_BINDING);
            protocolMarshaller.marshall(updateKeyRequest.getRestrictions(), RESTRICTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
