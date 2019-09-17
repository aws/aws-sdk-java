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
package com.amazonaws.services.medialive.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListReservationsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListReservationsRequestMarshaller {

    private static final MarshallingInfo<String> CHANNELCLASS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("channelClass").build();
    private static final MarshallingInfo<String> CODEC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.QUERY_PARAM)
            .marshallLocationName("codec").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("maxResults").build();
    private static final MarshallingInfo<String> MAXIMUMBITRATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("maximumBitrate").build();
    private static final MarshallingInfo<String> MAXIMUMFRAMERATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("maximumFramerate").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("nextToken").build();
    private static final MarshallingInfo<String> RESOLUTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("resolution").build();
    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("resourceType").build();
    private static final MarshallingInfo<String> SPECIALFEATURE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("specialFeature").build();
    private static final MarshallingInfo<String> VIDEOQUALITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("videoQuality").build();

    private static final ListReservationsRequestMarshaller instance = new ListReservationsRequestMarshaller();

    public static ListReservationsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListReservationsRequest listReservationsRequest, ProtocolMarshaller protocolMarshaller) {

        if (listReservationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listReservationsRequest.getChannelClass(), CHANNELCLASS_BINDING);
            protocolMarshaller.marshall(listReservationsRequest.getCodec(), CODEC_BINDING);
            protocolMarshaller.marshall(listReservationsRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listReservationsRequest.getMaximumBitrate(), MAXIMUMBITRATE_BINDING);
            protocolMarshaller.marshall(listReservationsRequest.getMaximumFramerate(), MAXIMUMFRAMERATE_BINDING);
            protocolMarshaller.marshall(listReservationsRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listReservationsRequest.getResolution(), RESOLUTION_BINDING);
            protocolMarshaller.marshall(listReservationsRequest.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(listReservationsRequest.getSpecialFeature(), SPECIALFEATURE_BINDING);
            protocolMarshaller.marshall(listReservationsRequest.getVideoQuality(), VIDEOQUALITY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
