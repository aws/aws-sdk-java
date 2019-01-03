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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.support.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TrustedAdvisorCheckResultMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TrustedAdvisorCheckResultMarshaller {

    private static final MarshallingInfo<String> CHECKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("checkId").build();
    private static final MarshallingInfo<String> TIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("timestamp").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCESSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourcesSummary").build();
    private static final MarshallingInfo<StructuredPojo> CATEGORYSPECIFICSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("categorySpecificSummary").build();
    private static final MarshallingInfo<List> FLAGGEDRESOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("flaggedResources").build();

    private static final TrustedAdvisorCheckResultMarshaller instance = new TrustedAdvisorCheckResultMarshaller();

    public static TrustedAdvisorCheckResultMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TrustedAdvisorCheckResult trustedAdvisorCheckResult, ProtocolMarshaller protocolMarshaller) {

        if (trustedAdvisorCheckResult == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(trustedAdvisorCheckResult.getCheckId(), CHECKID_BINDING);
            protocolMarshaller.marshall(trustedAdvisorCheckResult.getTimestamp(), TIMESTAMP_BINDING);
            protocolMarshaller.marshall(trustedAdvisorCheckResult.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(trustedAdvisorCheckResult.getResourcesSummary(), RESOURCESSUMMARY_BINDING);
            protocolMarshaller.marshall(trustedAdvisorCheckResult.getCategorySpecificSummary(), CATEGORYSPECIFICSUMMARY_BINDING);
            protocolMarshaller.marshall(trustedAdvisorCheckResult.getFlaggedResources(), FLAGGEDRESOURCES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
