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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpointsmsvoicev2.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RequestPhoneNumberRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RequestPhoneNumberRequestMarshaller {

    private static final MarshallingInfo<String> ISOCOUNTRYCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsoCountryCode").build();
    private static final MarshallingInfo<String> MESSAGETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MessageType").build();
    private static final MarshallingInfo<List> NUMBERCAPABILITIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberCapabilities").build();
    private static final MarshallingInfo<String> NUMBERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberType").build();
    private static final MarshallingInfo<String> OPTOUTLISTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OptOutListName").build();
    private static final MarshallingInfo<String> POOLID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PoolId").build();
    private static final MarshallingInfo<String> REGISTRATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegistrationId").build();
    private static final MarshallingInfo<Boolean> DELETIONPROTECTIONENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeletionProtectionEnabled").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();

    private static final RequestPhoneNumberRequestMarshaller instance = new RequestPhoneNumberRequestMarshaller();

    public static RequestPhoneNumberRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RequestPhoneNumberRequest requestPhoneNumberRequest, ProtocolMarshaller protocolMarshaller) {

        if (requestPhoneNumberRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(requestPhoneNumberRequest.getIsoCountryCode(), ISOCOUNTRYCODE_BINDING);
            protocolMarshaller.marshall(requestPhoneNumberRequest.getMessageType(), MESSAGETYPE_BINDING);
            protocolMarshaller.marshall(requestPhoneNumberRequest.getNumberCapabilities(), NUMBERCAPABILITIES_BINDING);
            protocolMarshaller.marshall(requestPhoneNumberRequest.getNumberType(), NUMBERTYPE_BINDING);
            protocolMarshaller.marshall(requestPhoneNumberRequest.getOptOutListName(), OPTOUTLISTNAME_BINDING);
            protocolMarshaller.marshall(requestPhoneNumberRequest.getPoolId(), POOLID_BINDING);
            protocolMarshaller.marshall(requestPhoneNumberRequest.getRegistrationId(), REGISTRATIONID_BINDING);
            protocolMarshaller.marshall(requestPhoneNumberRequest.getDeletionProtectionEnabled(), DELETIONPROTECTIONENABLED_BINDING);
            protocolMarshaller.marshall(requestPhoneNumberRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(requestPhoneNumberRequest.getClientToken(), CLIENTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
