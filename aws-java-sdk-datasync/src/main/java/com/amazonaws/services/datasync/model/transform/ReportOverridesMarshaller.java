/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datasync.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.datasync.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReportOverridesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReportOverridesMarshaller {

    private static final MarshallingInfo<StructuredPojo> TRANSFERRED_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Transferred").build();
    private static final MarshallingInfo<StructuredPojo> VERIFIED_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Verified").build();
    private static final MarshallingInfo<StructuredPojo> DELETED_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Deleted").build();
    private static final MarshallingInfo<StructuredPojo> SKIPPED_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Skipped").build();

    private static final ReportOverridesMarshaller instance = new ReportOverridesMarshaller();

    public static ReportOverridesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReportOverrides reportOverrides, ProtocolMarshaller protocolMarshaller) {

        if (reportOverrides == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(reportOverrides.getTransferred(), TRANSFERRED_BINDING);
            protocolMarshaller.marshall(reportOverrides.getVerified(), VERIFIED_BINDING);
            protocolMarshaller.marshall(reportOverrides.getDeleted(), DELETED_BINDING);
            protocolMarshaller.marshall(reportOverrides.getSkipped(), SKIPPED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
