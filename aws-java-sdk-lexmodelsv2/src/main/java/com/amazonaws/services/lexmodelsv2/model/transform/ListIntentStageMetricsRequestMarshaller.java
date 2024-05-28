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
package com.amazonaws.services.lexmodelsv2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexmodelsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListIntentStageMetricsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListIntentStageMetricsRequestMarshaller {

    private static final MarshallingInfo<String> BOTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("botId").build();
    private static final MarshallingInfo<java.util.Date> STARTDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<List> METRICS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("metrics").build();
    private static final MarshallingInfo<List> BINBY_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("binBy").build();
    private static final MarshallingInfo<List> GROUPBY_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("groupBy").build();
    private static final MarshallingInfo<List> FILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("filters").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nextToken").build();

    private static final ListIntentStageMetricsRequestMarshaller instance = new ListIntentStageMetricsRequestMarshaller();

    public static ListIntentStageMetricsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListIntentStageMetricsRequest listIntentStageMetricsRequest, ProtocolMarshaller protocolMarshaller) {

        if (listIntentStageMetricsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listIntentStageMetricsRequest.getBotId(), BOTID_BINDING);
            protocolMarshaller.marshall(listIntentStageMetricsRequest.getStartDateTime(), STARTDATETIME_BINDING);
            protocolMarshaller.marshall(listIntentStageMetricsRequest.getEndDateTime(), ENDDATETIME_BINDING);
            protocolMarshaller.marshall(listIntentStageMetricsRequest.getMetrics(), METRICS_BINDING);
            protocolMarshaller.marshall(listIntentStageMetricsRequest.getBinBy(), BINBY_BINDING);
            protocolMarshaller.marshall(listIntentStageMetricsRequest.getGroupBy(), GROUPBY_BINDING);
            protocolMarshaller.marshall(listIntentStageMetricsRequest.getFilters(), FILTERS_BINDING);
            protocolMarshaller.marshall(listIntentStageMetricsRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listIntentStageMetricsRequest.getNextToken(), NEXTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
