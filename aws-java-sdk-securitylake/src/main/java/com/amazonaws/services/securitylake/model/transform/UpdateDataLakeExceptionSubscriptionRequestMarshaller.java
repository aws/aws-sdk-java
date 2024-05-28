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
package com.amazonaws.services.securitylake.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securitylake.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateDataLakeExceptionSubscriptionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateDataLakeExceptionSubscriptionRequestMarshaller {

    private static final MarshallingInfo<Long> EXCEPTIONTIMETOLIVE_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("exceptionTimeToLive").build();
    private static final MarshallingInfo<String> NOTIFICATIONENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("notificationEndpoint").build();
    private static final MarshallingInfo<String> SUBSCRIPTIONPROTOCOL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("subscriptionProtocol").build();

    private static final UpdateDataLakeExceptionSubscriptionRequestMarshaller instance = new UpdateDataLakeExceptionSubscriptionRequestMarshaller();

    public static UpdateDataLakeExceptionSubscriptionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateDataLakeExceptionSubscriptionRequest updateDataLakeExceptionSubscriptionRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateDataLakeExceptionSubscriptionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateDataLakeExceptionSubscriptionRequest.getExceptionTimeToLive(), EXCEPTIONTIMETOLIVE_BINDING);
            protocolMarshaller.marshall(updateDataLakeExceptionSubscriptionRequest.getNotificationEndpoint(), NOTIFICATIONENDPOINT_BINDING);
            protocolMarshaller.marshall(updateDataLakeExceptionSubscriptionRequest.getSubscriptionProtocol(), SUBSCRIPTIONPROTOCOL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
