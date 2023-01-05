/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mainframemodernization.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mainframemodernization.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListBatchJobExecutionsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListBatchJobExecutionsRequestMarshaller {

    private static final MarshallingInfo<String> APPLICATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("applicationId").build();
    private static final MarshallingInfo<List> EXECUTIONIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("executionIds").build();
    private static final MarshallingInfo<String> JOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("jobName").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("maxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("nextToken").build();
    private static final MarshallingInfo<java.util.Date> STARTEDAFTER_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("startedAfter").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> STARTEDBEFORE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("startedBefore").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("status").build();

    private static final ListBatchJobExecutionsRequestMarshaller instance = new ListBatchJobExecutionsRequestMarshaller();

    public static ListBatchJobExecutionsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListBatchJobExecutionsRequest listBatchJobExecutionsRequest, ProtocolMarshaller protocolMarshaller) {

        if (listBatchJobExecutionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listBatchJobExecutionsRequest.getApplicationId(), APPLICATIONID_BINDING);
            protocolMarshaller.marshall(listBatchJobExecutionsRequest.getExecutionIds(), EXECUTIONIDS_BINDING);
            protocolMarshaller.marshall(listBatchJobExecutionsRequest.getJobName(), JOBNAME_BINDING);
            protocolMarshaller.marshall(listBatchJobExecutionsRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listBatchJobExecutionsRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listBatchJobExecutionsRequest.getStartedAfter(), STARTEDAFTER_BINDING);
            protocolMarshaller.marshall(listBatchJobExecutionsRequest.getStartedBefore(), STARTEDBEFORE_BINDING);
            protocolMarshaller.marshall(listBatchJobExecutionsRequest.getStatus(), STATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
