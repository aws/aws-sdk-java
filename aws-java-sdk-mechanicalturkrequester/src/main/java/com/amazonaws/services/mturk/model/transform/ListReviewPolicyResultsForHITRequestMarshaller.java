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
package com.amazonaws.services.mturk.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mturk.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListReviewPolicyResultsForHITRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListReviewPolicyResultsForHITRequestMarshaller {

    private static final MarshallingInfo<String> HITID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("HITId").build();
    private static final MarshallingInfo<List> POLICYLEVELS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PolicyLevels").build();
    private static final MarshallingInfo<Boolean> RETRIEVEACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RetrieveActions").build();
    private static final MarshallingInfo<Boolean> RETRIEVERESULTS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RetrieveResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxResults").build();

    private static final ListReviewPolicyResultsForHITRequestMarshaller instance = new ListReviewPolicyResultsForHITRequestMarshaller();

    public static ListReviewPolicyResultsForHITRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListReviewPolicyResultsForHITRequest listReviewPolicyResultsForHITRequest, ProtocolMarshaller protocolMarshaller) {

        if (listReviewPolicyResultsForHITRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listReviewPolicyResultsForHITRequest.getHITId(), HITID_BINDING);
            protocolMarshaller.marshall(listReviewPolicyResultsForHITRequest.getPolicyLevels(), POLICYLEVELS_BINDING);
            protocolMarshaller.marshall(listReviewPolicyResultsForHITRequest.getRetrieveActions(), RETRIEVEACTIONS_BINDING);
            protocolMarshaller.marshall(listReviewPolicyResultsForHITRequest.getRetrieveResults(), RETRIEVERESULTS_BINDING);
            protocolMarshaller.marshall(listReviewPolicyResultsForHITRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listReviewPolicyResultsForHITRequest.getMaxResults(), MAXRESULTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
