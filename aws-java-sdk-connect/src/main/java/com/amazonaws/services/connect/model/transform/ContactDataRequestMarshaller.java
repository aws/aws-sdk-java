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
package com.amazonaws.services.connect.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ContactDataRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ContactDataRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> SYSTEMENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SystemEndpoint").build();
    private static final MarshallingInfo<StructuredPojo> CUSTOMERENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomerEndpoint").build();
    private static final MarshallingInfo<String> REQUESTIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequestIdentifier").build();
    private static final MarshallingInfo<String> QUEUEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("QueueId").build();
    private static final MarshallingInfo<Map> ATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Attributes").build();
    private static final MarshallingInfo<StructuredPojo> CAMPAIGN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Campaign").build();

    private static final ContactDataRequestMarshaller instance = new ContactDataRequestMarshaller();

    public static ContactDataRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ContactDataRequest contactDataRequest, ProtocolMarshaller protocolMarshaller) {

        if (contactDataRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(contactDataRequest.getSystemEndpoint(), SYSTEMENDPOINT_BINDING);
            protocolMarshaller.marshall(contactDataRequest.getCustomerEndpoint(), CUSTOMERENDPOINT_BINDING);
            protocolMarshaller.marshall(contactDataRequest.getRequestIdentifier(), REQUESTIDENTIFIER_BINDING);
            protocolMarshaller.marshall(contactDataRequest.getQueueId(), QUEUEID_BINDING);
            protocolMarshaller.marshall(contactDataRequest.getAttributes(), ATTRIBUTES_BINDING);
            protocolMarshaller.marshall(contactDataRequest.getCampaign(), CAMPAIGN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
