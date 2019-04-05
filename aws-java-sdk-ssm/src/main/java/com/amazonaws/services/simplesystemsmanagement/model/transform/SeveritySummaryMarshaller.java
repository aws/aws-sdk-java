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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SeveritySummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SeveritySummaryMarshaller {

    private static final MarshallingInfo<Integer> CRITICALCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CriticalCount").build();
    private static final MarshallingInfo<Integer> HIGHCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HighCount").build();
    private static final MarshallingInfo<Integer> MEDIUMCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MediumCount").build();
    private static final MarshallingInfo<Integer> LOWCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LowCount").build();
    private static final MarshallingInfo<Integer> INFORMATIONALCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InformationalCount").build();
    private static final MarshallingInfo<Integer> UNSPECIFIEDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UnspecifiedCount").build();

    private static final SeveritySummaryMarshaller instance = new SeveritySummaryMarshaller();

    public static SeveritySummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SeveritySummary severitySummary, ProtocolMarshaller protocolMarshaller) {

        if (severitySummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(severitySummary.getCriticalCount(), CRITICALCOUNT_BINDING);
            protocolMarshaller.marshall(severitySummary.getHighCount(), HIGHCOUNT_BINDING);
            protocolMarshaller.marshall(severitySummary.getMediumCount(), MEDIUMCOUNT_BINDING);
            protocolMarshaller.marshall(severitySummary.getLowCount(), LOWCOUNT_BINDING);
            protocolMarshaller.marshall(severitySummary.getInformationalCount(), INFORMATIONALCOUNT_BINDING);
            protocolMarshaller.marshall(severitySummary.getUnspecifiedCount(), UNSPECIFIEDCOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
