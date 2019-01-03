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
package com.amazonaws.services.pi.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pi.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DescribeDimensionKeysRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DescribeDimensionKeysRequestMarshaller {

    private static final MarshallingInfo<String> SERVICETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceType").build();
    private static final MarshallingInfo<String> IDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Identifier").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> METRIC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Metric").build();
    private static final MarshallingInfo<Integer> PERIODINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PeriodInSeconds").build();
    private static final MarshallingInfo<StructuredPojo> GROUPBY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GroupBy").build();
    private static final MarshallingInfo<StructuredPojo> PARTITIONBY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PartitionBy").build();
    private static final MarshallingInfo<Map> FILTER_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Filter").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();

    private static final DescribeDimensionKeysRequestMarshaller instance = new DescribeDimensionKeysRequestMarshaller();

    public static DescribeDimensionKeysRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DescribeDimensionKeysRequest describeDimensionKeysRequest, ProtocolMarshaller protocolMarshaller) {

        if (describeDimensionKeysRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(describeDimensionKeysRequest.getServiceType(), SERVICETYPE_BINDING);
            protocolMarshaller.marshall(describeDimensionKeysRequest.getIdentifier(), IDENTIFIER_BINDING);
            protocolMarshaller.marshall(describeDimensionKeysRequest.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(describeDimensionKeysRequest.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(describeDimensionKeysRequest.getMetric(), METRIC_BINDING);
            protocolMarshaller.marshall(describeDimensionKeysRequest.getPeriodInSeconds(), PERIODINSECONDS_BINDING);
            protocolMarshaller.marshall(describeDimensionKeysRequest.getGroupBy(), GROUPBY_BINDING);
            protocolMarshaller.marshall(describeDimensionKeysRequest.getPartitionBy(), PARTITIONBY_BINDING);
            protocolMarshaller.marshall(describeDimensionKeysRequest.getFilter(), FILTER_BINDING);
            protocolMarshaller.marshall(describeDimensionKeysRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(describeDimensionKeysRequest.getNextToken(), NEXTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
