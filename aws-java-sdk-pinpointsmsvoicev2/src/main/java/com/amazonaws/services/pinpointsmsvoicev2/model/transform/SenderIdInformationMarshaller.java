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

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SenderIdInformationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SenderIdInformationMarshaller {

    private static final MarshallingInfo<String> SENDERIDARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SenderIdArn").build();
    private static final MarshallingInfo<String> SENDERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SenderId").build();
    private static final MarshallingInfo<String> ISOCOUNTRYCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsoCountryCode").build();
    private static final MarshallingInfo<List> MESSAGETYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MessageTypes").build();
    private static final MarshallingInfo<String> MONTHLYLEASINGPRICE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonthlyLeasingPrice").build();

    private static final SenderIdInformationMarshaller instance = new SenderIdInformationMarshaller();

    public static SenderIdInformationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SenderIdInformation senderIdInformation, ProtocolMarshaller protocolMarshaller) {

        if (senderIdInformation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(senderIdInformation.getSenderIdArn(), SENDERIDARN_BINDING);
            protocolMarshaller.marshall(senderIdInformation.getSenderId(), SENDERID_BINDING);
            protocolMarshaller.marshall(senderIdInformation.getIsoCountryCode(), ISOCOUNTRYCODE_BINDING);
            protocolMarshaller.marshall(senderIdInformation.getMessageTypes(), MESSAGETYPES_BINDING);
            protocolMarshaller.marshall(senderIdInformation.getMonthlyLeasingPrice(), MONTHLYLEASINGPRICE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
