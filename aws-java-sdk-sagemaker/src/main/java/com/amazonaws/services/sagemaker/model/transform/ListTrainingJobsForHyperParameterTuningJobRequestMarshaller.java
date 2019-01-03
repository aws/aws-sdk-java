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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListTrainingJobsForHyperParameterTuningJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListTrainingJobsForHyperParameterTuningJobRequestMarshaller {

    private static final MarshallingInfo<String> HYPERPARAMETERTUNINGJOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HyperParameterTuningJobName").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxResults").build();
    private static final MarshallingInfo<String> STATUSEQUALS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatusEquals").build();
    private static final MarshallingInfo<String> SORTBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SortBy").build();
    private static final MarshallingInfo<String> SORTORDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SortOrder").build();

    private static final ListTrainingJobsForHyperParameterTuningJobRequestMarshaller instance = new ListTrainingJobsForHyperParameterTuningJobRequestMarshaller();

    public static ListTrainingJobsForHyperParameterTuningJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListTrainingJobsForHyperParameterTuningJobRequest listTrainingJobsForHyperParameterTuningJobRequest,
            ProtocolMarshaller protocolMarshaller) {

        if (listTrainingJobsForHyperParameterTuningJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller
                    .marshall(listTrainingJobsForHyperParameterTuningJobRequest.getHyperParameterTuningJobName(), HYPERPARAMETERTUNINGJOBNAME_BINDING);
            protocolMarshaller.marshall(listTrainingJobsForHyperParameterTuningJobRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listTrainingJobsForHyperParameterTuningJobRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listTrainingJobsForHyperParameterTuningJobRequest.getStatusEquals(), STATUSEQUALS_BINDING);
            protocolMarshaller.marshall(listTrainingJobsForHyperParameterTuningJobRequest.getSortBy(), SORTBY_BINDING);
            protocolMarshaller.marshall(listTrainingJobsForHyperParameterTuningJobRequest.getSortOrder(), SORTORDER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
