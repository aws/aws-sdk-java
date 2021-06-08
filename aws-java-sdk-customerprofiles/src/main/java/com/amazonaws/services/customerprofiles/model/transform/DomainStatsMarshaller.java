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
package com.amazonaws.services.customerprofiles.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.customerprofiles.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DomainStatsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DomainStatsMarshaller {

    private static final MarshallingInfo<Long> PROFILECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ProfileCount").build();
    private static final MarshallingInfo<Long> METERINGPROFILECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MeteringProfileCount").build();
    private static final MarshallingInfo<Long> OBJECTCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ObjectCount").build();
    private static final MarshallingInfo<Long> TOTALSIZE_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TotalSize").build();

    private static final DomainStatsMarshaller instance = new DomainStatsMarshaller();

    public static DomainStatsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DomainStats domainStats, ProtocolMarshaller protocolMarshaller) {

        if (domainStats == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(domainStats.getProfileCount(), PROFILECOUNT_BINDING);
            protocolMarshaller.marshall(domainStats.getMeteringProfileCount(), METERINGPROFILECOUNT_BINDING);
            protocolMarshaller.marshall(domainStats.getObjectCount(), OBJECTCOUNT_BINDING);
            protocolMarshaller.marshall(domainStats.getTotalSize(), TOTALSIZE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
