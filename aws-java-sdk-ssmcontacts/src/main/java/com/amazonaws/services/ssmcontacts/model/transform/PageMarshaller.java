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
package com.amazonaws.services.ssmcontacts.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ssmcontacts.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PageMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PageMarshaller {

    private static final MarshallingInfo<String> PAGEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PageArn").build();
    private static final MarshallingInfo<String> ENGAGEMENTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EngagementArn").build();
    private static final MarshallingInfo<String> CONTACTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContactArn").build();
    private static final MarshallingInfo<String> SENDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Sender").build();
    private static final MarshallingInfo<String> INCIDENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncidentId").build();
    private static final MarshallingInfo<java.util.Date> SENTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SentTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> DELIVERYTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeliveryTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> READTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReadTime").timestampFormat("unixTimestamp").build();

    private static final PageMarshaller instance = new PageMarshaller();

    public static PageMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Page page, ProtocolMarshaller protocolMarshaller) {

        if (page == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(page.getPageArn(), PAGEARN_BINDING);
            protocolMarshaller.marshall(page.getEngagementArn(), ENGAGEMENTARN_BINDING);
            protocolMarshaller.marshall(page.getContactArn(), CONTACTARN_BINDING);
            protocolMarshaller.marshall(page.getSender(), SENDER_BINDING);
            protocolMarshaller.marshall(page.getIncidentId(), INCIDENTID_BINDING);
            protocolMarshaller.marshall(page.getSentTime(), SENTTIME_BINDING);
            protocolMarshaller.marshall(page.getDeliveryTime(), DELIVERYTIME_BINDING);
            protocolMarshaller.marshall(page.getReadTime(), READTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
