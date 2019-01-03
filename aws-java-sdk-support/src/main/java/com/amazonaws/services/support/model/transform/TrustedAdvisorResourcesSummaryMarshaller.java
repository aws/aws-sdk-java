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
package com.amazonaws.services.support.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.support.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TrustedAdvisorResourcesSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TrustedAdvisorResourcesSummaryMarshaller {

    private static final MarshallingInfo<Long> RESOURCESPROCESSED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourcesProcessed").build();
    private static final MarshallingInfo<Long> RESOURCESFLAGGED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourcesFlagged").build();
    private static final MarshallingInfo<Long> RESOURCESIGNORED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourcesIgnored").build();
    private static final MarshallingInfo<Long> RESOURCESSUPPRESSED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourcesSuppressed").build();

    private static final TrustedAdvisorResourcesSummaryMarshaller instance = new TrustedAdvisorResourcesSummaryMarshaller();

    public static TrustedAdvisorResourcesSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TrustedAdvisorResourcesSummary trustedAdvisorResourcesSummary, ProtocolMarshaller protocolMarshaller) {

        if (trustedAdvisorResourcesSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(trustedAdvisorResourcesSummary.getResourcesProcessed(), RESOURCESPROCESSED_BINDING);
            protocolMarshaller.marshall(trustedAdvisorResourcesSummary.getResourcesFlagged(), RESOURCESFLAGGED_BINDING);
            protocolMarshaller.marshall(trustedAdvisorResourcesSummary.getResourcesIgnored(), RESOURCESIGNORED_BINDING);
            protocolMarshaller.marshall(trustedAdvisorResourcesSummary.getResourcesSuppressed(), RESOURCESSUPPRESSED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
