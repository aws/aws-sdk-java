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
package com.amazonaws.services.guardduty.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.guardduty.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * HighestSeverityThreatDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HighestSeverityThreatDetailsMarshaller {

    private static final MarshallingInfo<String> SEVERITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("severity").build();
    private static final MarshallingInfo<String> THREATNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("threatName").build();
    private static final MarshallingInfo<Integer> COUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("count").build();

    private static final HighestSeverityThreatDetailsMarshaller instance = new HighestSeverityThreatDetailsMarshaller();

    public static HighestSeverityThreatDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HighestSeverityThreatDetails highestSeverityThreatDetails, ProtocolMarshaller protocolMarshaller) {

        if (highestSeverityThreatDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(highestSeverityThreatDetails.getSeverity(), SEVERITY_BINDING);
            protocolMarshaller.marshall(highestSeverityThreatDetails.getThreatName(), THREATNAME_BINDING);
            protocolMarshaller.marshall(highestSeverityThreatDetails.getCount(), COUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
