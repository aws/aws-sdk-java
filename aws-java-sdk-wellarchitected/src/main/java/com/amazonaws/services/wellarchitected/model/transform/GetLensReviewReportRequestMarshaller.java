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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.wellarchitected.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetLensReviewReportRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetLensReviewReportRequestMarshaller {

    private static final MarshallingInfo<String> WORKLOADID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("WorkloadId").build();
    private static final MarshallingInfo<String> LENSALIAS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("LensAlias").build();
    private static final MarshallingInfo<Integer> MILESTONENUMBER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("MilestoneNumber").build();

    private static final GetLensReviewReportRequestMarshaller instance = new GetLensReviewReportRequestMarshaller();

    public static GetLensReviewReportRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetLensReviewReportRequest getLensReviewReportRequest, ProtocolMarshaller protocolMarshaller) {

        if (getLensReviewReportRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getLensReviewReportRequest.getWorkloadId(), WORKLOADID_BINDING);
            protocolMarshaller.marshall(getLensReviewReportRequest.getLensAlias(), LENSALIAS_BINDING);
            protocolMarshaller.marshall(getLensReviewReportRequest.getMilestoneNumber(), MILESTONENUMBER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
