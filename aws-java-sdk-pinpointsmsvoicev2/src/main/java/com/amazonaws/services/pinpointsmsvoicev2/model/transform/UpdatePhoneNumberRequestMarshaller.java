/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpointsmsvoicev2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpointsmsvoicev2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdatePhoneNumberRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdatePhoneNumberRequestMarshaller {

    private static final MarshallingInfo<String> PHONENUMBERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PhoneNumberId").build();
    private static final MarshallingInfo<Boolean> TWOWAYENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TwoWayEnabled").build();
    private static final MarshallingInfo<String> TWOWAYCHANNELARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TwoWayChannelArn").build();
    private static final MarshallingInfo<Boolean> SELFMANAGEDOPTOUTSENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SelfManagedOptOutsEnabled").build();
    private static final MarshallingInfo<String> OPTOUTLISTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OptOutListName").build();
    private static final MarshallingInfo<Boolean> DELETIONPROTECTIONENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeletionProtectionEnabled").build();

    private static final UpdatePhoneNumberRequestMarshaller instance = new UpdatePhoneNumberRequestMarshaller();

    public static UpdatePhoneNumberRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdatePhoneNumberRequest updatePhoneNumberRequest, ProtocolMarshaller protocolMarshaller) {

        if (updatePhoneNumberRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updatePhoneNumberRequest.getPhoneNumberId(), PHONENUMBERID_BINDING);
            protocolMarshaller.marshall(updatePhoneNumberRequest.getTwoWayEnabled(), TWOWAYENABLED_BINDING);
            protocolMarshaller.marshall(updatePhoneNumberRequest.getTwoWayChannelArn(), TWOWAYCHANNELARN_BINDING);
            protocolMarshaller.marshall(updatePhoneNumberRequest.getSelfManagedOptOutsEnabled(), SELFMANAGEDOPTOUTSENABLED_BINDING);
            protocolMarshaller.marshall(updatePhoneNumberRequest.getOptOutListName(), OPTOUTLISTNAME_BINDING);
            protocolMarshaller.marshall(updatePhoneNumberRequest.getDeletionProtectionEnabled(), DELETIONPROTECTIONENABLED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
