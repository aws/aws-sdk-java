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
package com.amazonaws.services.cognitoidp.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cognitoidp.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AuthEventTypeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AuthEventTypeMarshaller {

    private static final MarshallingInfo<String> EVENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("EventId").build();
    private static final MarshallingInfo<String> EVENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("EventType").build();
    private static final MarshallingInfo<java.util.Date> CREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> EVENTRESPONSE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventResponse").build();
    private static final MarshallingInfo<StructuredPojo> EVENTRISK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventRisk").build();
    private static final MarshallingInfo<List> CHALLENGERESPONSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChallengeResponses").build();
    private static final MarshallingInfo<StructuredPojo> EVENTCONTEXTDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventContextData").build();
    private static final MarshallingInfo<StructuredPojo> EVENTFEEDBACK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventFeedback").build();

    private static final AuthEventTypeMarshaller instance = new AuthEventTypeMarshaller();

    public static AuthEventTypeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AuthEventType authEventType, ProtocolMarshaller protocolMarshaller) {

        if (authEventType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(authEventType.getEventId(), EVENTID_BINDING);
            protocolMarshaller.marshall(authEventType.getEventType(), EVENTTYPE_BINDING);
            protocolMarshaller.marshall(authEventType.getCreationDate(), CREATIONDATE_BINDING);
            protocolMarshaller.marshall(authEventType.getEventResponse(), EVENTRESPONSE_BINDING);
            protocolMarshaller.marshall(authEventType.getEventRisk(), EVENTRISK_BINDING);
            protocolMarshaller.marshall(authEventType.getChallengeResponses(), CHALLENGERESPONSES_BINDING);
            protocolMarshaller.marshall(authEventType.getEventContextData(), EVENTCONTEXTDATA_BINDING);
            protocolMarshaller.marshall(authEventType.getEventFeedback(), EVENTFEEDBACK_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
