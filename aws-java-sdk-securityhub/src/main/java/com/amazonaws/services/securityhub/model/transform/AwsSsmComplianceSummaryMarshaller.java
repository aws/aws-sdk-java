/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsSsmComplianceSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsSsmComplianceSummaryMarshaller {

    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<Integer> COMPLIANTCRITICALCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompliantCriticalCount").build();
    private static final MarshallingInfo<Integer> COMPLIANTHIGHCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompliantHighCount").build();
    private static final MarshallingInfo<Integer> COMPLIANTMEDIUMCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompliantMediumCount").build();
    private static final MarshallingInfo<String> EXECUTIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutionType").build();
    private static final MarshallingInfo<Integer> NONCOMPLIANTCRITICALCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NonCompliantCriticalCount").build();
    private static final MarshallingInfo<Integer> COMPLIANTINFORMATIONALCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompliantInformationalCount").build();
    private static final MarshallingInfo<Integer> NONCOMPLIANTINFORMATIONALCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NonCompliantInformationalCount").build();
    private static final MarshallingInfo<Integer> COMPLIANTUNSPECIFIEDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompliantUnspecifiedCount").build();
    private static final MarshallingInfo<Integer> NONCOMPLIANTLOWCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NonCompliantLowCount").build();
    private static final MarshallingInfo<Integer> NONCOMPLIANTHIGHCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NonCompliantHighCount").build();
    private static final MarshallingInfo<Integer> COMPLIANTLOWCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompliantLowCount").build();
    private static final MarshallingInfo<String> COMPLIANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComplianceType").build();
    private static final MarshallingInfo<String> PATCHBASELINEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PatchBaselineId").build();
    private static final MarshallingInfo<String> OVERALLSEVERITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OverallSeverity").build();
    private static final MarshallingInfo<Integer> NONCOMPLIANTMEDIUMCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NonCompliantMediumCount").build();
    private static final MarshallingInfo<Integer> NONCOMPLIANTUNSPECIFIEDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NonCompliantUnspecifiedCount").build();
    private static final MarshallingInfo<String> PATCHGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PatchGroup").build();

    private static final AwsSsmComplianceSummaryMarshaller instance = new AwsSsmComplianceSummaryMarshaller();

    public static AwsSsmComplianceSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsSsmComplianceSummary awsSsmComplianceSummary, ProtocolMarshaller protocolMarshaller) {

        if (awsSsmComplianceSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsSsmComplianceSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(awsSsmComplianceSummary.getCompliantCriticalCount(), COMPLIANTCRITICALCOUNT_BINDING);
            protocolMarshaller.marshall(awsSsmComplianceSummary.getCompliantHighCount(), COMPLIANTHIGHCOUNT_BINDING);
            protocolMarshaller.marshall(awsSsmComplianceSummary.getCompliantMediumCount(), COMPLIANTMEDIUMCOUNT_BINDING);
            protocolMarshaller.marshall(awsSsmComplianceSummary.getExecutionType(), EXECUTIONTYPE_BINDING);
            protocolMarshaller.marshall(awsSsmComplianceSummary.getNonCompliantCriticalCount(), NONCOMPLIANTCRITICALCOUNT_BINDING);
            protocolMarshaller.marshall(awsSsmComplianceSummary.getCompliantInformationalCount(), COMPLIANTINFORMATIONALCOUNT_BINDING);
            protocolMarshaller.marshall(awsSsmComplianceSummary.getNonCompliantInformationalCount(), NONCOMPLIANTINFORMATIONALCOUNT_BINDING);
            protocolMarshaller.marshall(awsSsmComplianceSummary.getCompliantUnspecifiedCount(), COMPLIANTUNSPECIFIEDCOUNT_BINDING);
            protocolMarshaller.marshall(awsSsmComplianceSummary.getNonCompliantLowCount(), NONCOMPLIANTLOWCOUNT_BINDING);
            protocolMarshaller.marshall(awsSsmComplianceSummary.getNonCompliantHighCount(), NONCOMPLIANTHIGHCOUNT_BINDING);
            protocolMarshaller.marshall(awsSsmComplianceSummary.getCompliantLowCount(), COMPLIANTLOWCOUNT_BINDING);
            protocolMarshaller.marshall(awsSsmComplianceSummary.getComplianceType(), COMPLIANCETYPE_BINDING);
            protocolMarshaller.marshall(awsSsmComplianceSummary.getPatchBaselineId(), PATCHBASELINEID_BINDING);
            protocolMarshaller.marshall(awsSsmComplianceSummary.getOverallSeverity(), OVERALLSEVERITY_BINDING);
            protocolMarshaller.marshall(awsSsmComplianceSummary.getNonCompliantMediumCount(), NONCOMPLIANTMEDIUMCOUNT_BINDING);
            protocolMarshaller.marshall(awsSsmComplianceSummary.getNonCompliantUnspecifiedCount(), NONCOMPLIANTUNSPECIFIEDCOUNT_BINDING);
            protocolMarshaller.marshall(awsSsmComplianceSummary.getPatchGroup(), PATCHGROUP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
