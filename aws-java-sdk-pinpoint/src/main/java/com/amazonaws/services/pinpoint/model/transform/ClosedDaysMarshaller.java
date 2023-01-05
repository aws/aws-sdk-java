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
package com.amazonaws.services.pinpoint.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ClosedDaysMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ClosedDaysMarshaller {

    private static final MarshallingInfo<List> EMAIL_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("EMAIL").build();
    private static final MarshallingInfo<List> SMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SMS").build();
    private static final MarshallingInfo<List> PUSH_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PUSH").build();
    private static final MarshallingInfo<List> VOICE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VOICE").build();
    private static final MarshallingInfo<List> CUSTOM_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CUSTOM").build();

    private static final ClosedDaysMarshaller instance = new ClosedDaysMarshaller();

    public static ClosedDaysMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ClosedDays closedDays, ProtocolMarshaller protocolMarshaller) {

        if (closedDays == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(closedDays.getEMAIL(), EMAIL_BINDING);
            protocolMarshaller.marshall(closedDays.getSMS(), SMS_BINDING);
            protocolMarshaller.marshall(closedDays.getPUSH(), PUSH_BINDING);
            protocolMarshaller.marshall(closedDays.getVOICE(), VOICE_BINDING);
            protocolMarshaller.marshall(closedDays.getCUSTOM(), CUSTOM_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
