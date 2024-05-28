/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.deadline.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.deadline.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SearchTasksRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SearchTasksRequestMarshaller {

    private static final MarshallingInfo<String> FARMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("farmId").build();
    private static final MarshallingInfo<StructuredPojo> FILTEREXPRESSIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("filterExpressions").build();
    private static final MarshallingInfo<Integer> ITEMOFFSET_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("itemOffset").build();
    private static final MarshallingInfo<String> JOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("jobId").build();
    private static final MarshallingInfo<Integer> PAGESIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pageSize").build();
    private static final MarshallingInfo<List> QUEUEIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("queueIds").build();
    private static final MarshallingInfo<List> SORTEXPRESSIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sortExpressions").build();

    private static final SearchTasksRequestMarshaller instance = new SearchTasksRequestMarshaller();

    public static SearchTasksRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SearchTasksRequest searchTasksRequest, ProtocolMarshaller protocolMarshaller) {

        if (searchTasksRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(searchTasksRequest.getFarmId(), FARMID_BINDING);
            protocolMarshaller.marshall(searchTasksRequest.getFilterExpressions(), FILTEREXPRESSIONS_BINDING);
            protocolMarshaller.marshall(searchTasksRequest.getItemOffset(), ITEMOFFSET_BINDING);
            protocolMarshaller.marshall(searchTasksRequest.getJobId(), JOBID_BINDING);
            protocolMarshaller.marshall(searchTasksRequest.getPageSize(), PAGESIZE_BINDING);
            protocolMarshaller.marshall(searchTasksRequest.getQueueIds(), QUEUEIDS_BINDING);
            protocolMarshaller.marshall(searchTasksRequest.getSortExpressions(), SORTEXPRESSIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
