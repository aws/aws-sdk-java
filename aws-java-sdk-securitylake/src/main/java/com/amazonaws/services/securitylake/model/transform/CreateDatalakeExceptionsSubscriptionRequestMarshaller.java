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
package com.amazonaws.services.securitylake.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securitylake.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateDatalakeExceptionsSubscriptionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateDatalakeExceptionsSubscriptionRequestMarshaller {

    private static final MarshallingInfo<String> NOTIFICATIONENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("notificationEndpoint").build();
    private static final MarshallingInfo<String> SUBSCRIPTIONPROTOCOL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("subscriptionProtocol").build();

    private static final CreateDatalakeExceptionsSubscriptionRequestMarshaller instance = new CreateDatalakeExceptionsSubscriptionRequestMarshaller();

    public static CreateDatalakeExceptionsSubscriptionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateDatalakeExceptionsSubscriptionRequest createDatalakeExceptionsSubscriptionRequest, ProtocolMarshaller protocolMarshaller) {

        if (createDatalakeExceptionsSubscriptionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createDatalakeExceptionsSubscriptionRequest.getNotificationEndpoint(), NOTIFICATIONENDPOINT_BINDING);
            protocolMarshaller.marshall(createDatalakeExceptionsSubscriptionRequest.getSubscriptionProtocol(), SUBSCRIPTIONPROTOCOL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
