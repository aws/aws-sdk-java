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
package com.amazonaws.services.logs.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.logs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FilterLogEventsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FilterLogEventsRequestMarshaller {

    private static final MarshallingInfo<String> LOGGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logGroupName").build();
    private static final MarshallingInfo<List> LOGSTREAMNAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logStreamNames").build();
    private static final MarshallingInfo<String> LOGSTREAMNAMEPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logStreamNamePrefix").build();
    private static final MarshallingInfo<Long> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("startTime").build();
    private static final MarshallingInfo<Long> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("endTime").build();
    private static final MarshallingInfo<String> FILTERPATTERN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("filterPattern").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nextToken").build();
    private static final MarshallingInfo<Integer> LIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("limit").build();
    private static final MarshallingInfo<Boolean> INTERLEAVED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("interleaved").build();

    private static final FilterLogEventsRequestMarshaller instance = new FilterLogEventsRequestMarshaller();

    public static FilterLogEventsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FilterLogEventsRequest filterLogEventsRequest, ProtocolMarshaller protocolMarshaller) {

        if (filterLogEventsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(filterLogEventsRequest.getLogGroupName(), LOGGROUPNAME_BINDING);
            protocolMarshaller.marshall(filterLogEventsRequest.getLogStreamNames(), LOGSTREAMNAMES_BINDING);
            protocolMarshaller.marshall(filterLogEventsRequest.getLogStreamNamePrefix(), LOGSTREAMNAMEPREFIX_BINDING);
            protocolMarshaller.marshall(filterLogEventsRequest.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(filterLogEventsRequest.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(filterLogEventsRequest.getFilterPattern(), FILTERPATTERN_BINDING);
            protocolMarshaller.marshall(filterLogEventsRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(filterLogEventsRequest.getLimit(), LIMIT_BINDING);
            protocolMarshaller.marshall(filterLogEventsRequest.getInterleaved(), INTERLEAVED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
