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
package com.amazonaws.services.mgn.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mgn.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ApplicationAggregatedStatusMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ApplicationAggregatedStatusMarshaller {

    private static final MarshallingInfo<String> HEALTHSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("healthStatus").build();
    private static final MarshallingInfo<String> LASTUPDATEDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdateDateTime").build();
    private static final MarshallingInfo<String> PROGRESSSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("progressStatus").build();
    private static final MarshallingInfo<Long> TOTALSOURCESERVERS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalSourceServers").build();

    private static final ApplicationAggregatedStatusMarshaller instance = new ApplicationAggregatedStatusMarshaller();

    public static ApplicationAggregatedStatusMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ApplicationAggregatedStatus applicationAggregatedStatus, ProtocolMarshaller protocolMarshaller) {

        if (applicationAggregatedStatus == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(applicationAggregatedStatus.getHealthStatus(), HEALTHSTATUS_BINDING);
            protocolMarshaller.marshall(applicationAggregatedStatus.getLastUpdateDateTime(), LASTUPDATEDATETIME_BINDING);
            protocolMarshaller.marshall(applicationAggregatedStatus.getProgressStatus(), PROGRESSSTATUS_BINDING);
            protocolMarshaller.marshall(applicationAggregatedStatus.getTotalSourceServers(), TOTALSOURCESERVERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
