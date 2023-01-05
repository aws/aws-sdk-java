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
 * OptedOutNumberInformationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OptedOutNumberInformationMarshaller {

    private static final MarshallingInfo<String> OPTEDOUTNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OptedOutNumber").build();
    private static final MarshallingInfo<java.util.Date> OPTEDOUTTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OptedOutTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Boolean> ENDUSEROPTEDOUT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndUserOptedOut").build();

    private static final OptedOutNumberInformationMarshaller instance = new OptedOutNumberInformationMarshaller();

    public static OptedOutNumberInformationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OptedOutNumberInformation optedOutNumberInformation, ProtocolMarshaller protocolMarshaller) {

        if (optedOutNumberInformation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(optedOutNumberInformation.getOptedOutNumber(), OPTEDOUTNUMBER_BINDING);
            protocolMarshaller.marshall(optedOutNumberInformation.getOptedOutTimestamp(), OPTEDOUTTIMESTAMP_BINDING);
            protocolMarshaller.marshall(optedOutNumberInformation.getEndUserOptedOut(), ENDUSEROPTEDOUT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
