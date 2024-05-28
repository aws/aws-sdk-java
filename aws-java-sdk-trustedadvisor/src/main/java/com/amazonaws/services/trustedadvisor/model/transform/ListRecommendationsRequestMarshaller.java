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
package com.amazonaws.services.trustedadvisor.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.trustedadvisor.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListRecommendationsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListRecommendationsRequestMarshaller {

    private static final MarshallingInfo<java.util.Date> AFTERLASTUPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("afterLastUpdatedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> AWSSERVICE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("awsService").build();
    private static final MarshallingInfo<java.util.Date> BEFORELASTUPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("beforeLastUpdatedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> CHECKIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("checkIdentifier").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("maxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("nextToken").build();
    private static final MarshallingInfo<String> PILLAR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("pillar").build();
    private static final MarshallingInfo<String> SOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("source").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("status").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.QUERY_PARAM)
            .marshallLocationName("type").build();

    private static final ListRecommendationsRequestMarshaller instance = new ListRecommendationsRequestMarshaller();

    public static ListRecommendationsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListRecommendationsRequest listRecommendationsRequest, ProtocolMarshaller protocolMarshaller) {

        if (listRecommendationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listRecommendationsRequest.getAfterLastUpdatedAt(), AFTERLASTUPDATEDAT_BINDING);
            protocolMarshaller.marshall(listRecommendationsRequest.getAwsService(), AWSSERVICE_BINDING);
            protocolMarshaller.marshall(listRecommendationsRequest.getBeforeLastUpdatedAt(), BEFORELASTUPDATEDAT_BINDING);
            protocolMarshaller.marshall(listRecommendationsRequest.getCheckIdentifier(), CHECKIDENTIFIER_BINDING);
            protocolMarshaller.marshall(listRecommendationsRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listRecommendationsRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listRecommendationsRequest.getPillar(), PILLAR_BINDING);
            protocolMarshaller.marshall(listRecommendationsRequest.getSource(), SOURCE_BINDING);
            protocolMarshaller.marshall(listRecommendationsRequest.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(listRecommendationsRequest.getType(), TYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
