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
package com.amazonaws.services.iotsitewise.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotsitewise.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetAssetPropertyAggregatesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetAssetPropertyAggregatesRequestMarshaller {

    private static final MarshallingInfo<String> ASSETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("assetId").build();
    private static final MarshallingInfo<String> PROPERTYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("propertyId").build();
    private static final MarshallingInfo<String> PROPERTYALIAS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("propertyAlias").build();
    private static final MarshallingInfo<List> AGGREGATETYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("aggregateTypes").build();
    private static final MarshallingInfo<String> RESOLUTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("resolution").build();
    private static final MarshallingInfo<List> QUALITIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.QUERY_PARAM)
            .marshallLocationName("qualities").build();
    private static final MarshallingInfo<java.util.Date> STARTDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("startDate").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> ENDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("endDate").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> TIMEORDERING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("timeOrdering").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("nextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("maxResults").build();

    private static final GetAssetPropertyAggregatesRequestMarshaller instance = new GetAssetPropertyAggregatesRequestMarshaller();

    public static GetAssetPropertyAggregatesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetAssetPropertyAggregatesRequest getAssetPropertyAggregatesRequest, ProtocolMarshaller protocolMarshaller) {

        if (getAssetPropertyAggregatesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getAssetPropertyAggregatesRequest.getAssetId(), ASSETID_BINDING);
            protocolMarshaller.marshall(getAssetPropertyAggregatesRequest.getPropertyId(), PROPERTYID_BINDING);
            protocolMarshaller.marshall(getAssetPropertyAggregatesRequest.getPropertyAlias(), PROPERTYALIAS_BINDING);
            protocolMarshaller.marshall(getAssetPropertyAggregatesRequest.getAggregateTypes(), AGGREGATETYPES_BINDING);
            protocolMarshaller.marshall(getAssetPropertyAggregatesRequest.getResolution(), RESOLUTION_BINDING);
            protocolMarshaller.marshall(getAssetPropertyAggregatesRequest.getQualities(), QUALITIES_BINDING);
            protocolMarshaller.marshall(getAssetPropertyAggregatesRequest.getStartDate(), STARTDATE_BINDING);
            protocolMarshaller.marshall(getAssetPropertyAggregatesRequest.getEndDate(), ENDDATE_BINDING);
            protocolMarshaller.marshall(getAssetPropertyAggregatesRequest.getTimeOrdering(), TIMEORDERING_BINDING);
            protocolMarshaller.marshall(getAssetPropertyAggregatesRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(getAssetPropertyAggregatesRequest.getMaxResults(), MAXRESULTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
