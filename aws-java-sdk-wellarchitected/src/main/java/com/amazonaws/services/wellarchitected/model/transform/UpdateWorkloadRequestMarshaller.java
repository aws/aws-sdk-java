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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.wellarchitected.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateWorkloadRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateWorkloadRequestMarshaller {

    private static final MarshallingInfo<String> WORKLOADID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("WorkloadId").build();
    private static final MarshallingInfo<String> WORKLOADNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkloadName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> ENVIRONMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Environment").build();
    private static final MarshallingInfo<List> ACCOUNTIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AccountIds").build();
    private static final MarshallingInfo<List> AWSREGIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AwsRegions").build();
    private static final MarshallingInfo<List> NONAWSREGIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NonAwsRegions").build();
    private static final MarshallingInfo<List> PILLARPRIORITIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PillarPriorities").build();
    private static final MarshallingInfo<String> ARCHITECTURALDESIGN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ArchitecturalDesign").build();
    private static final MarshallingInfo<String> REVIEWOWNER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReviewOwner").build();
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

    private static final UpdateWorkloadRequestMarshaller instance = new UpdateWorkloadRequestMarshaller();

    public static UpdateWorkloadRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateWorkloadRequest updateWorkloadRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateWorkloadRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateWorkloadRequest.getWorkloadId(), WORKLOADID_BINDING);
            protocolMarshaller.marshall(updateWorkloadRequest.getWorkloadName(), WORKLOADNAME_BINDING);
            protocolMarshaller.marshall(updateWorkloadRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateWorkloadRequest.getEnvironment(), ENVIRONMENT_BINDING);
            protocolMarshaller.marshall(updateWorkloadRequest.getAccountIds(), ACCOUNTIDS_BINDING);
            protocolMarshaller.marshall(updateWorkloadRequest.getAwsRegions(), AWSREGIONS_BINDING);
            protocolMarshaller.marshall(updateWorkloadRequest.getNonAwsRegions(), NONAWSREGIONS_BINDING);
            protocolMarshaller.marshall(updateWorkloadRequest.getPillarPriorities(), PILLARPRIORITIES_BINDING);
            protocolMarshaller.marshall(updateWorkloadRequest.getArchitecturalDesign(), ARCHITECTURALDESIGN_BINDING);
            protocolMarshaller.marshall(updateWorkloadRequest.getReviewOwner(), REVIEWOWNER_BINDING);
            protocolMarshaller.marshall(updateWorkloadRequest.getIsReviewOwnerUpdateAcknowledged(), ISREVIEWOWNERUPDATEACKNOWLEDGED_BINDING);
            protocolMarshaller.marshall(updateWorkloadRequest.getIndustryType(), INDUSTRYTYPE_BINDING);
            protocolMarshaller.marshall(updateWorkloadRequest.getIndustry(), INDUSTRY_BINDING);
            protocolMarshaller.marshall(updateWorkloadRequest.getNotes(), NOTES_BINDING);
            protocolMarshaller.marshall(updateWorkloadRequest.getImprovementStatus(), IMPROVEMENTSTATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
