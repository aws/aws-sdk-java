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
package com.amazonaws.services.costexplorer.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costexplorer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AnomalySubscriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AnomalySubscriptionMarshaller {

    private static final MarshallingInfo<String> SUBSCRIPTIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubscriptionArn").build();
    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AccountId").build();
    private static final MarshallingInfo<List> MONITORARNLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitorArnList").build();
    private static final MarshallingInfo<List> SUBSCRIBERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Subscribers").build();
    private static final MarshallingInfo<Double> THRESHOLD_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Threshold").build();
    private static final MarshallingInfo<String> FREQUENCY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Frequency").build();
    private static final MarshallingInfo<String> SUBSCRIPTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubscriptionName").build();

    private static final AnomalySubscriptionMarshaller instance = new AnomalySubscriptionMarshaller();

    public static AnomalySubscriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AnomalySubscription anomalySubscription, ProtocolMarshaller protocolMarshaller) {

        if (anomalySubscription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(anomalySubscription.getSubscriptionArn(), SUBSCRIPTIONARN_BINDING);
            protocolMarshaller.marshall(anomalySubscription.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(anomalySubscription.getMonitorArnList(), MONITORARNLIST_BINDING);
            protocolMarshaller.marshall(anomalySubscription.getSubscribers(), SUBSCRIBERS_BINDING);
            protocolMarshaller.marshall(anomalySubscription.getThreshold(), THRESHOLD_BINDING);
            protocolMarshaller.marshall(anomalySubscription.getFrequency(), FREQUENCY_BINDING);
            protocolMarshaller.marshall(anomalySubscription.getSubscriptionName(), SUBSCRIPTIONNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
