/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListCandidatesForAutoMLJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListCandidatesForAutoMLJobRequestMarshaller {

    private static final MarshallingInfo<String> AUTOMLJOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoMLJobName").build();
    private static final MarshallingInfo<String> STATUSEQUALS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatusEquals").build();
    private static final MarshallingInfo<String> CANDIDATENAMEEQUALS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CandidateNameEquals").build();
    private static final MarshallingInfo<String> SORTORDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SortOrder").build();
    private static final MarshallingInfo<String> SORTBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SortBy").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();

    private static final ListCandidatesForAutoMLJobRequestMarshaller instance = new ListCandidatesForAutoMLJobRequestMarshaller();

    public static ListCandidatesForAutoMLJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListCandidatesForAutoMLJobRequest listCandidatesForAutoMLJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (listCandidatesForAutoMLJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listCandidatesForAutoMLJobRequest.getAutoMLJobName(), AUTOMLJOBNAME_BINDING);
            protocolMarshaller.marshall(listCandidatesForAutoMLJobRequest.getStatusEquals(), STATUSEQUALS_BINDING);
            protocolMarshaller.marshall(listCandidatesForAutoMLJobRequest.getCandidateNameEquals(), CANDIDATENAMEEQUALS_BINDING);
            protocolMarshaller.marshall(listCandidatesForAutoMLJobRequest.getSortOrder(), SORTORDER_BINDING);
            protocolMarshaller.marshall(listCandidatesForAutoMLJobRequest.getSortBy(), SORTBY_BINDING);
            protocolMarshaller.marshall(listCandidatesForAutoMLJobRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listCandidatesForAutoMLJobRequest.getNextToken(), NEXTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
