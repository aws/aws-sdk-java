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
 * TrustedAdvisorCheckSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TrustedAdvisorCheckSummaryMarshaller {

    private static final MarshallingInfo<String> CHECKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("checkId").build();
    private static final MarshallingInfo<String> TIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("timestamp").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<Boolean> HASFLAGGEDRESOURCES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hasFlaggedResources").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCESSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourcesSummary").build();
    private static final MarshallingInfo<StructuredPojo> CATEGORYSPECIFICSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("categorySpecificSummary").build();

    private static final TrustedAdvisorCheckSummaryMarshaller instance = new TrustedAdvisorCheckSummaryMarshaller();

    public static TrustedAdvisorCheckSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TrustedAdvisorCheckSummary trustedAdvisorCheckSummary, ProtocolMarshaller protocolMarshaller) {

        if (trustedAdvisorCheckSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(trustedAdvisorCheckSummary.getCheckId(), CHECKID_BINDING);
            protocolMarshaller.marshall(trustedAdvisorCheckSummary.getTimestamp(), TIMESTAMP_BINDING);
            protocolMarshaller.marshall(trustedAdvisorCheckSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(trustedAdvisorCheckSummary.getHasFlaggedResources(), HASFLAGGEDRESOURCES_BINDING);
            protocolMarshaller.marshall(trustedAdvisorCheckSummary.getResourcesSummary(), RESOURCESSUMMARY_BINDING);
            protocolMarshaller.marshall(trustedAdvisorCheckSummary.getCategorySpecificSummary(), CATEGORYSPECIFICSUMMARY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
