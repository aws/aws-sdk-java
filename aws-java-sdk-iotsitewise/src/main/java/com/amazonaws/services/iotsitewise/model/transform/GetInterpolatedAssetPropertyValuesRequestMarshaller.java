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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotsitewise.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetInterpolatedAssetPropertyValuesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetInterpolatedAssetPropertyValuesRequestMarshaller {

    private static final MarshallingInfo<String> ASSETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("assetId").build();
    private static final MarshallingInfo<String> PROPERTYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("propertyId").build();
    private static final MarshallingInfo<String> PROPERTYALIAS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("propertyAlias").build();
    private static final MarshallingInfo<Long> STARTTIMEINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("startTimeInSeconds").build();
    private static final MarshallingInfo<Integer> STARTTIMEOFFSETINNANOS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("startTimeOffsetInNanos").build();
    private static final MarshallingInfo<Long> ENDTIMEINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("endTimeInSeconds").build();
    private static final MarshallingInfo<Integer> ENDTIMEOFFSETINNANOS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("endTimeOffsetInNanos").build();
    private static final MarshallingInfo<String> QUALITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("quality").build();
    private static final MarshallingInfo<Long> INTERVALINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("intervalInSeconds").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("nextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("maxResults").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.QUERY_PARAM)
            .marshallLocationName("type").build();

    private static final GetInterpolatedAssetPropertyValuesRequestMarshaller instance = new GetInterpolatedAssetPropertyValuesRequestMarshaller();

    public static GetInterpolatedAssetPropertyValuesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetInterpolatedAssetPropertyValuesRequest getInterpolatedAssetPropertyValuesRequest, ProtocolMarshaller protocolMarshaller) {

        if (getInterpolatedAssetPropertyValuesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getInterpolatedAssetPropertyValuesRequest.getAssetId(), ASSETID_BINDING);
            protocolMarshaller.marshall(getInterpolatedAssetPropertyValuesRequest.getPropertyId(), PROPERTYID_BINDING);
            protocolMarshaller.marshall(getInterpolatedAssetPropertyValuesRequest.getPropertyAlias(), PROPERTYALIAS_BINDING);
            protocolMarshaller.marshall(getInterpolatedAssetPropertyValuesRequest.getStartTimeInSeconds(), STARTTIMEINSECONDS_BINDING);
            protocolMarshaller.marshall(getInterpolatedAssetPropertyValuesRequest.getStartTimeOffsetInNanos(), STARTTIMEOFFSETINNANOS_BINDING);
            protocolMarshaller.marshall(getInterpolatedAssetPropertyValuesRequest.getEndTimeInSeconds(), ENDTIMEINSECONDS_BINDING);
            protocolMarshaller.marshall(getInterpolatedAssetPropertyValuesRequest.getEndTimeOffsetInNanos(), ENDTIMEOFFSETINNANOS_BINDING);
            protocolMarshaller.marshall(getInterpolatedAssetPropertyValuesRequest.getQuality(), QUALITY_BINDING);
            protocolMarshaller.marshall(getInterpolatedAssetPropertyValuesRequest.getIntervalInSeconds(), INTERVALINSECONDS_BINDING);
            protocolMarshaller.marshall(getInterpolatedAssetPropertyValuesRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(getInterpolatedAssetPropertyValuesRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(getInterpolatedAssetPropertyValuesRequest.getType(), TYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
