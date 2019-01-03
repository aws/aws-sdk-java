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
 * DomainIspPlacementMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DomainIspPlacementMarshaller {

    private static final MarshallingInfo<String> ISPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IspName").build();
    private static final MarshallingInfo<Long> INBOXRAWCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("InboxRawCount").build();
    private static final MarshallingInfo<Long> SPAMRAWCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SpamRawCount").build();
    private static final MarshallingInfo<Double> INBOXPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InboxPercentage").build();
    private static final MarshallingInfo<Double> SPAMPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SpamPercentage").build();

    private static final DomainIspPlacementMarshaller instance = new DomainIspPlacementMarshaller();

    public static DomainIspPlacementMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DomainIspPlacement domainIspPlacement, ProtocolMarshaller protocolMarshaller) {

        if (domainIspPlacement == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(domainIspPlacement.getIspName(), ISPNAME_BINDING);
            protocolMarshaller.marshall(domainIspPlacement.getInboxRawCount(), INBOXRAWCOUNT_BINDING);
            protocolMarshaller.marshall(domainIspPlacement.getSpamRawCount(), SPAMRAWCOUNT_BINDING);
            protocolMarshaller.marshall(domainIspPlacement.getInboxPercentage(), INBOXPERCENTAGE_BINDING);
            protocolMarshaller.marshall(domainIspPlacement.getSpamPercentage(), SPAMPERCENTAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
