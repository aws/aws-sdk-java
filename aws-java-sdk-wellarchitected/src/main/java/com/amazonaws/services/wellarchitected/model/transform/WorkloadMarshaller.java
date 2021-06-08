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
package com.amazonaws.services.wellarchitected.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.wellarchitected.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * WorkloadMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WorkloadMarshaller {

    private static final MarshallingInfo<String> WORKLOADID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkloadId").build();
    private static final MarshallingInfo<String> WORKLOADARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkloadArn").build();
    private static final MarshallingInfo<String> WORKLOADNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkloadName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> ENVIRONMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Environment").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<List> ACCOUNTIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AccountIds").build();
    private static final MarshallingInfo<List> AWSREGIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AwsRegions").build();
    private static final MarshallingInfo<List> NONAWSREGIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NonAwsRegions").build();
    private static final MarshallingInfo<String> ARCHITECTURALDESIGN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ArchitecturalDesign").build();
    private static final MarshallingInfo<String> REVIEWOWNER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReviewOwner").build();
    private static final MarshallingInfo<java.util.Date> REVIEWRESTRICTIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReviewRestrictionDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Boolean> ISREVIEWOWNERUPDATEACKNOWLEDGED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsReviewOwnerUpdateAcknowledged").build();
    private static final MarshallingInfo<String> INDUSTRYTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IndustryType").build();
    private static final MarshallingInfo<String> INDUSTRY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Industry").build();
    private static final MarshallingInfo<String> NOTES_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Notes").build();
    private static final MarshallingInfo<String> IMPROVEMENTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImprovementStatus").build();
    private static final MarshallingInfo<Map> RISKCOUNTS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RiskCounts").build();
    private static final MarshallingInfo<List> PILLARPRIORITIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PillarPriorities").build();
    private static final MarshallingInfo<List> LENSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Lenses").build();
    private static final MarshallingInfo<String> OWNER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Owner").build();
    private static final MarshallingInfo<String> SHAREINVITATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ShareInvitationId").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final WorkloadMarshaller instance = new WorkloadMarshaller();

    public static WorkloadMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Workload workload, ProtocolMarshaller protocolMarshaller) {

        if (workload == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(workload.getWorkloadId(), WORKLOADID_BINDING);
            protocolMarshaller.marshall(workload.getWorkloadArn(), WORKLOADARN_BINDING);
            protocolMarshaller.marshall(workload.getWorkloadName(), WORKLOADNAME_BINDING);
            protocolMarshaller.marshall(workload.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(workload.getEnvironment(), ENVIRONMENT_BINDING);
            protocolMarshaller.marshall(workload.getUpdatedAt(), UPDATEDAT_BINDING);
            protocolMarshaller.marshall(workload.getAccountIds(), ACCOUNTIDS_BINDING);
            protocolMarshaller.marshall(workload.getAwsRegions(), AWSREGIONS_BINDING);
            protocolMarshaller.marshall(workload.getNonAwsRegions(), NONAWSREGIONS_BINDING);
            protocolMarshaller.marshall(workload.getArchitecturalDesign(), ARCHITECTURALDESIGN_BINDING);
            protocolMarshaller.marshall(workload.getReviewOwner(), REVIEWOWNER_BINDING);
            protocolMarshaller.marshall(workload.getReviewRestrictionDate(), REVIEWRESTRICTIONDATE_BINDING);
            protocolMarshaller.marshall(workload.getIsReviewOwnerUpdateAcknowledged(), ISREVIEWOWNERUPDATEACKNOWLEDGED_BINDING);
            protocolMarshaller.marshall(workload.getIndustryType(), INDUSTRYTYPE_BINDING);
            protocolMarshaller.marshall(workload.getIndustry(), INDUSTRY_BINDING);
            protocolMarshaller.marshall(workload.getNotes(), NOTES_BINDING);
            protocolMarshaller.marshall(workload.getImprovementStatus(), IMPROVEMENTSTATUS_BINDING);
            protocolMarshaller.marshall(workload.getRiskCounts(), RISKCOUNTS_BINDING);
            protocolMarshaller.marshall(workload.getPillarPriorities(), PILLARPRIORITIES_BINDING);
            protocolMarshaller.marshall(workload.getLenses(), LENSES_BINDING);
            protocolMarshaller.marshall(workload.getOwner(), OWNER_BINDING);
            protocolMarshaller.marshall(workload.getShareInvitationId(), SHAREINVITATIONID_BINDING);
            protocolMarshaller.marshall(workload.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
