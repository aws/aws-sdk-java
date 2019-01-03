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
package com.amazonaws.services.pinpointemail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpointemail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PlacementStatisticsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PlacementStatisticsMarshaller {

    private static final MarshallingInfo<Double> INBOXPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InboxPercentage").build();
    private static final MarshallingInfo<Double> SPAMPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SpamPercentage").build();
    private static final MarshallingInfo<Double> MISSINGPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MissingPercentage").build();
    private static final MarshallingInfo<Double> SPFPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SpfPercentage").build();
    private static final MarshallingInfo<Double> DKIMPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DkimPercentage").build();

    private static final PlacementStatisticsMarshaller instance = new PlacementStatisticsMarshaller();

    public static PlacementStatisticsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PlacementStatistics placementStatistics, ProtocolMarshaller protocolMarshaller) {

        if (placementStatistics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(placementStatistics.getInboxPercentage(), INBOXPERCENTAGE_BINDING);
            protocolMarshaller.marshall(placementStatistics.getSpamPercentage(), SPAMPERCENTAGE_BINDING);
            protocolMarshaller.marshall(placementStatistics.getMissingPercentage(), MISSINGPERCENTAGE_BINDING);
            protocolMarshaller.marshall(placementStatistics.getSpfPercentage(), SPFPERCENTAGE_BINDING);
            protocolMarshaller.marshall(placementStatistics.getDkimPercentage(), DKIMPERCENTAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
