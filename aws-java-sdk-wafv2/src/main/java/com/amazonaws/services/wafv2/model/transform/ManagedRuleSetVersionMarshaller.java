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
package com.amazonaws.services.wafv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.wafv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ManagedRuleSetVersionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ManagedRuleSetVersionMarshaller {

    private static final MarshallingInfo<String> ASSOCIATEDRULEGROUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociatedRuleGroupArn").build();
    private static final MarshallingInfo<Long> CAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Capacity").build();
    private static final MarshallingInfo<Integer> FORECASTEDLIFETIME_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ForecastedLifetime").build();
    private static final MarshallingInfo<java.util.Date> PUBLISHTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PublishTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATETIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdateTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> EXPIRYTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExpiryTimestamp").timestampFormat("unixTimestamp").build();

    private static final ManagedRuleSetVersionMarshaller instance = new ManagedRuleSetVersionMarshaller();

    public static ManagedRuleSetVersionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ManagedRuleSetVersion managedRuleSetVersion, ProtocolMarshaller protocolMarshaller) {

        if (managedRuleSetVersion == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(managedRuleSetVersion.getAssociatedRuleGroupArn(), ASSOCIATEDRULEGROUPARN_BINDING);
            protocolMarshaller.marshall(managedRuleSetVersion.getCapacity(), CAPACITY_BINDING);
            protocolMarshaller.marshall(managedRuleSetVersion.getForecastedLifetime(), FORECASTEDLIFETIME_BINDING);
            protocolMarshaller.marshall(managedRuleSetVersion.getPublishTimestamp(), PUBLISHTIMESTAMP_BINDING);
            protocolMarshaller.marshall(managedRuleSetVersion.getLastUpdateTimestamp(), LASTUPDATETIMESTAMP_BINDING);
            protocolMarshaller.marshall(managedRuleSetVersion.getExpiryTimestamp(), EXPIRYTIMESTAMP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
