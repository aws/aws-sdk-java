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
package com.amazonaws.services.macie2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.macie2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetUsageStatisticsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetUsageStatisticsRequestMarshaller {

    private static final MarshallingInfo<List> FILTERBY_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("filterBy").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nextToken").build();
    private static final MarshallingInfo<StructuredPojo> SORTBY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sortBy").build();
    private static final MarshallingInfo<String> TIMERANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("timeRange").build();

    private static final GetUsageStatisticsRequestMarshaller instance = new GetUsageStatisticsRequestMarshaller();

    public static GetUsageStatisticsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetUsageStatisticsRequest getUsageStatisticsRequest, ProtocolMarshaller protocolMarshaller) {

        if (getUsageStatisticsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getUsageStatisticsRequest.getFilterBy(), FILTERBY_BINDING);
            protocolMarshaller.marshall(getUsageStatisticsRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(getUsageStatisticsRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(getUsageStatisticsRequest.getSortBy(), SORTBY_BINDING);
            protocolMarshaller.marshall(getUsageStatisticsRequest.getTimeRange(), TIMERANGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
