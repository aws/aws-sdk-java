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

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateWorkloadRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateWorkloadRequestMarshaller {

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
    private static final MarshallingInfo<String> INDUSTRYTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IndustryType").build();
    private static final MarshallingInfo<String> INDUSTRY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Industry").build();
    private static final MarshallingInfo<List> LENSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Lenses").build();
    private static final MarshallingInfo<String> NOTES_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Notes").build();
    private static final MarshallingInfo<String> CLIENTREQUESTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientRequestToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateWorkloadRequestMarshaller instance = new CreateWorkloadRequestMarshaller();

    public static CreateWorkloadRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateWorkloadRequest createWorkloadRequest, ProtocolMarshaller protocolMarshaller) {

        if (createWorkloadRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createWorkloadRequest.getWorkloadName(), WORKLOADNAME_BINDING);
            protocolMarshaller.marshall(createWorkloadRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createWorkloadRequest.getEnvironment(), ENVIRONMENT_BINDING);
            protocolMarshaller.marshall(createWorkloadRequest.getAccountIds(), ACCOUNTIDS_BINDING);
            protocolMarshaller.marshall(createWorkloadRequest.getAwsRegions(), AWSREGIONS_BINDING);
            protocolMarshaller.marshall(createWorkloadRequest.getNonAwsRegions(), NONAWSREGIONS_BINDING);
            protocolMarshaller.marshall(createWorkloadRequest.getPillarPriorities(), PILLARPRIORITIES_BINDING);
            protocolMarshaller.marshall(createWorkloadRequest.getArchitecturalDesign(), ARCHITECTURALDESIGN_BINDING);
            protocolMarshaller.marshall(createWorkloadRequest.getReviewOwner(), REVIEWOWNER_BINDING);
            protocolMarshaller.marshall(createWorkloadRequest.getIndustryType(), INDUSTRYTYPE_BINDING);
            protocolMarshaller.marshall(createWorkloadRequest.getIndustry(), INDUSTRY_BINDING);
            protocolMarshaller.marshall(createWorkloadRequest.getLenses(), LENSES_BINDING);
            protocolMarshaller.marshall(createWorkloadRequest.getNotes(), NOTES_BINDING);
            protocolMarshaller.marshall(createWorkloadRequest.getClientRequestToken(), CLIENTREQUESTTOKEN_BINDING);
            protocolMarshaller.marshall(createWorkloadRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
