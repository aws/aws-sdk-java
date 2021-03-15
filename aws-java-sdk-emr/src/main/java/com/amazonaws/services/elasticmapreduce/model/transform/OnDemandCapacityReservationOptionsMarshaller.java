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
package com.amazonaws.services.elasticmapreduce.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticmapreduce.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OnDemandCapacityReservationOptionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OnDemandCapacityReservationOptionsMarshaller {

    private static final MarshallingInfo<String> USAGESTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UsageStrategy").build();
    private static final MarshallingInfo<String> CAPACITYRESERVATIONPREFERENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CapacityReservationPreference").build();
    private static final MarshallingInfo<String> CAPACITYRESERVATIONRESOURCEGROUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CapacityReservationResourceGroupArn").build();

    private static final OnDemandCapacityReservationOptionsMarshaller instance = new OnDemandCapacityReservationOptionsMarshaller();

    public static OnDemandCapacityReservationOptionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OnDemandCapacityReservationOptions onDemandCapacityReservationOptions, ProtocolMarshaller protocolMarshaller) {

        if (onDemandCapacityReservationOptions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(onDemandCapacityReservationOptions.getUsageStrategy(), USAGESTRATEGY_BINDING);
            protocolMarshaller.marshall(onDemandCapacityReservationOptions.getCapacityReservationPreference(), CAPACITYRESERVATIONPREFERENCE_BINDING);
            protocolMarshaller.marshall(onDemandCapacityReservationOptions.getCapacityReservationResourceGroupArn(),
                    CAPACITYRESERVATIONRESOURCEGROUPARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
