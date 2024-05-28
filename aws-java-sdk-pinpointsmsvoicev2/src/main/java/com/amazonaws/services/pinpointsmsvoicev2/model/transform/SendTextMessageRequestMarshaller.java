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
package com.amazonaws.services.pinpointsmsvoicev2.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpointsmsvoicev2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SendTextMessageRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SendTextMessageRequestMarshaller {

    private static final MarshallingInfo<String> DESTINATIONPHONENUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationPhoneNumber").build();
    private static final MarshallingInfo<String> ORIGINATIONIDENTITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OriginationIdentity").build();
    private static final MarshallingInfo<String> MESSAGEBODY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MessageBody").build();
    private static final MarshallingInfo<String> MESSAGETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MessageType").build();
    private static final MarshallingInfo<String> KEYWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Keyword").build();
    private static final MarshallingInfo<String> CONFIGURATIONSETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConfigurationSetName").build();
    private static final MarshallingInfo<String> MAXPRICE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MaxPrice").build();
    private static final MarshallingInfo<Integer> TIMETOLIVE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeToLive").build();
    private static final MarshallingInfo<Map> CONTEXT_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Context").build();
    private static final MarshallingInfo<Map> DESTINATIONCOUNTRYPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationCountryParameters").build();
    private static final MarshallingInfo<Boolean> DRYRUN_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DryRun").build();
    private static final MarshallingInfo<String> PROTECTCONFIGURATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProtectConfigurationId").build();

    private static final SendTextMessageRequestMarshaller instance = new SendTextMessageRequestMarshaller();

    public static SendTextMessageRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SendTextMessageRequest sendTextMessageRequest, ProtocolMarshaller protocolMarshaller) {

        if (sendTextMessageRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sendTextMessageRequest.getDestinationPhoneNumber(), DESTINATIONPHONENUMBER_BINDING);
            protocolMarshaller.marshall(sendTextMessageRequest.getOriginationIdentity(), ORIGINATIONIDENTITY_BINDING);
            protocolMarshaller.marshall(sendTextMessageRequest.getMessageBody(), MESSAGEBODY_BINDING);
            protocolMarshaller.marshall(sendTextMessageRequest.getMessageType(), MESSAGETYPE_BINDING);
            protocolMarshaller.marshall(sendTextMessageRequest.getKeyword(), KEYWORD_BINDING);
            protocolMarshaller.marshall(sendTextMessageRequest.getConfigurationSetName(), CONFIGURATIONSETNAME_BINDING);
            protocolMarshaller.marshall(sendTextMessageRequest.getMaxPrice(), MAXPRICE_BINDING);
            protocolMarshaller.marshall(sendTextMessageRequest.getTimeToLive(), TIMETOLIVE_BINDING);
            protocolMarshaller.marshall(sendTextMessageRequest.getContext(), CONTEXT_BINDING);
            protocolMarshaller.marshall(sendTextMessageRequest.getDestinationCountryParameters(), DESTINATIONCOUNTRYPARAMETERS_BINDING);
            protocolMarshaller.marshall(sendTextMessageRequest.getDryRun(), DRYRUN_BINDING);
            protocolMarshaller.marshall(sendTextMessageRequest.getProtectConfigurationId(), PROTECTCONFIGURATIONID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
