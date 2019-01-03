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
 * ResourceComplianceSummaryItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ResourceComplianceSummaryItemMarshaller {

    private static final MarshallingInfo<String> COMPLIANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComplianceType").build();
    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceType").build();
    private static final MarshallingInfo<String> RESOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceId").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> OVERALLSEVERITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OverallSeverity").build();
    private static final MarshallingInfo<StructuredPojo> EXECUTIONSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutionSummary").build();
    private static final MarshallingInfo<StructuredPojo> COMPLIANTSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompliantSummary").build();
    private static final MarshallingInfo<StructuredPojo> NONCOMPLIANTSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NonCompliantSummary").build();

    private static final ResourceComplianceSummaryItemMarshaller instance = new ResourceComplianceSummaryItemMarshaller();

    public static ResourceComplianceSummaryItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ResourceComplianceSummaryItem resourceComplianceSummaryItem, ProtocolMarshaller protocolMarshaller) {

        if (resourceComplianceSummaryItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(resourceComplianceSummaryItem.getComplianceType(), COMPLIANCETYPE_BINDING);
            protocolMarshaller.marshall(resourceComplianceSummaryItem.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(resourceComplianceSummaryItem.getResourceId(), RESOURCEID_BINDING);
            protocolMarshaller.marshall(resourceComplianceSummaryItem.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(resourceComplianceSummaryItem.getOverallSeverity(), OVERALLSEVERITY_BINDING);
            protocolMarshaller.marshall(resourceComplianceSummaryItem.getExecutionSummary(), EXECUTIONSUMMARY_BINDING);
            protocolMarshaller.marshall(resourceComplianceSummaryItem.getCompliantSummary(), COMPLIANTSUMMARY_BINDING);
            protocolMarshaller.marshall(resourceComplianceSummaryItem.getNonCompliantSummary(), NONCOMPLIANTSUMMARY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
