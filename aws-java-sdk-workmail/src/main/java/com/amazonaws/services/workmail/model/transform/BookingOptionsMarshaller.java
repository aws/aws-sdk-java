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
package com.amazonaws.services.workmail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workmail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BookingOptionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BookingOptionsMarshaller {

    private static final MarshallingInfo<Boolean> AUTOACCEPTREQUESTS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoAcceptRequests").build();
    private static final MarshallingInfo<Boolean> AUTODECLINERECURRINGREQUESTS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoDeclineRecurringRequests").build();
    private static final MarshallingInfo<Boolean> AUTODECLINECONFLICTINGREQUESTS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoDeclineConflictingRequests").build();

    private static final BookingOptionsMarshaller instance = new BookingOptionsMarshaller();

    public static BookingOptionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BookingOptions bookingOptions, ProtocolMarshaller protocolMarshaller) {

        if (bookingOptions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(bookingOptions.getAutoAcceptRequests(), AUTOACCEPTREQUESTS_BINDING);
            protocolMarshaller.marshall(bookingOptions.getAutoDeclineRecurringRequests(), AUTODECLINERECURRINGREQUESTS_BINDING);
            protocolMarshaller.marshall(bookingOptions.getAutoDeclineConflictingRequests(), AUTODECLINECONFLICTINGREQUESTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
