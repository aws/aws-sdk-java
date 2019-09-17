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
 * VolumeStatisticsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VolumeStatisticsMarshaller {

    private static final MarshallingInfo<Long> INBOXRAWCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("InboxRawCount").build();
    private static final MarshallingInfo<Long> SPAMRAWCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SpamRawCount").build();
    private static final MarshallingInfo<Long> PROJECTEDINBOX_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProjectedInbox").build();
    private static final MarshallingInfo<Long> PROJECTEDSPAM_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ProjectedSpam").build();

    private static final VolumeStatisticsMarshaller instance = new VolumeStatisticsMarshaller();

    public static VolumeStatisticsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VolumeStatistics volumeStatistics, ProtocolMarshaller protocolMarshaller) {

        if (volumeStatistics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(volumeStatistics.getInboxRawCount(), INBOXRAWCOUNT_BINDING);
            protocolMarshaller.marshall(volumeStatistics.getSpamRawCount(), SPAMRAWCOUNT_BINDING);
            protocolMarshaller.marshall(volumeStatistics.getProjectedInbox(), PROJECTEDINBOX_BINDING);
            protocolMarshaller.marshall(volumeStatistics.getProjectedSpam(), PROJECTEDSPAM_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
