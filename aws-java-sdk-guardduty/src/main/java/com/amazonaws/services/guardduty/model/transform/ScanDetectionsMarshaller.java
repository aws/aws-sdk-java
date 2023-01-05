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
 * ScanDetectionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ScanDetectionsMarshaller {

    private static final MarshallingInfo<StructuredPojo> SCANNEDITEMCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scannedItemCount").build();
    private static final MarshallingInfo<StructuredPojo> THREATSDETECTEDITEMCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("threatsDetectedItemCount").build();
    private static final MarshallingInfo<StructuredPojo> HIGHESTSEVERITYTHREATDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("highestSeverityThreatDetails").build();
    private static final MarshallingInfo<StructuredPojo> THREATDETECTEDBYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("threatDetectedByName").build();

    private static final ScanDetectionsMarshaller instance = new ScanDetectionsMarshaller();

    public static ScanDetectionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ScanDetections scanDetections, ProtocolMarshaller protocolMarshaller) {

        if (scanDetections == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(scanDetections.getScannedItemCount(), SCANNEDITEMCOUNT_BINDING);
            protocolMarshaller.marshall(scanDetections.getThreatsDetectedItemCount(), THREATSDETECTEDITEMCOUNT_BINDING);
            protocolMarshaller.marshall(scanDetections.getHighestSeverityThreatDetails(), HIGHESTSEVERITYTHREATDETAILS_BINDING);
            protocolMarshaller.marshall(scanDetections.getThreatDetectedByName(), THREATDETECTEDBYNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
