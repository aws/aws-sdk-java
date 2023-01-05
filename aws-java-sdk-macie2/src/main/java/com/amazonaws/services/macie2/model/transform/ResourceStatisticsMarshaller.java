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
package com.amazonaws.services.macie2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.macie2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ResourceStatisticsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ResourceStatisticsMarshaller {

    private static final MarshallingInfo<Long> TOTALBYTESCLASSIFIED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalBytesClassified").build();
    private static final MarshallingInfo<Long> TOTALDETECTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalDetections").build();
    private static final MarshallingInfo<Long> TOTALDETECTIONSSUPPRESSED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalDetectionsSuppressed").build();
    private static final MarshallingInfo<Long> TOTALITEMSCLASSIFIED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalItemsClassified").build();
    private static final MarshallingInfo<Long> TOTALITEMSSENSITIVE_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalItemsSensitive").build();
    private static final MarshallingInfo<Long> TOTALITEMSSKIPPED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalItemsSkipped").build();
    private static final MarshallingInfo<Long> TOTALITEMSSKIPPEDINVALIDENCRYPTION_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalItemsSkippedInvalidEncryption").build();
    private static final MarshallingInfo<Long> TOTALITEMSSKIPPEDINVALIDKMS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalItemsSkippedInvalidKms").build();
    private static final MarshallingInfo<Long> TOTALITEMSSKIPPEDPERMISSIONDENIED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalItemsSkippedPermissionDenied").build();

    private static final ResourceStatisticsMarshaller instance = new ResourceStatisticsMarshaller();

    public static ResourceStatisticsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ResourceStatistics resourceStatistics, ProtocolMarshaller protocolMarshaller) {

        if (resourceStatistics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(resourceStatistics.getTotalBytesClassified(), TOTALBYTESCLASSIFIED_BINDING);
            protocolMarshaller.marshall(resourceStatistics.getTotalDetections(), TOTALDETECTIONS_BINDING);
            protocolMarshaller.marshall(resourceStatistics.getTotalDetectionsSuppressed(), TOTALDETECTIONSSUPPRESSED_BINDING);
            protocolMarshaller.marshall(resourceStatistics.getTotalItemsClassified(), TOTALITEMSCLASSIFIED_BINDING);
            protocolMarshaller.marshall(resourceStatistics.getTotalItemsSensitive(), TOTALITEMSSENSITIVE_BINDING);
            protocolMarshaller.marshall(resourceStatistics.getTotalItemsSkipped(), TOTALITEMSSKIPPED_BINDING);
            protocolMarshaller.marshall(resourceStatistics.getTotalItemsSkippedInvalidEncryption(), TOTALITEMSSKIPPEDINVALIDENCRYPTION_BINDING);
            protocolMarshaller.marshall(resourceStatistics.getTotalItemsSkippedInvalidKms(), TOTALITEMSSKIPPEDINVALIDKMS_BINDING);
            protocolMarshaller.marshall(resourceStatistics.getTotalItemsSkippedPermissionDenied(), TOTALITEMSSKIPPEDPERMISSIONDENIED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
