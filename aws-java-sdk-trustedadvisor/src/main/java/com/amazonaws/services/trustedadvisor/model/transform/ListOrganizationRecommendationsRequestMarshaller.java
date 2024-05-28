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
 * ListOrganizationRecommendationsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListOrganizationRecommendationsRequestMarshaller {

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

    private static final ListOrganizationRecommendationsRequestMarshaller instance = new ListOrganizationRecommendationsRequestMarshaller();

    public static ListOrganizationRecommendationsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListOrganizationRecommendationsRequest listOrganizationRecommendationsRequest, ProtocolMarshaller protocolMarshaller) {

        if (listOrganizationRecommendationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listOrganizationRecommendationsRequest.getAfterLastUpdatedAt(), AFTERLASTUPDATEDAT_BINDING);
            protocolMarshaller.marshall(listOrganizationRecommendationsRequest.getAwsService(), AWSSERVICE_BINDING);
            protocolMarshaller.marshall(listOrganizationRecommendationsRequest.getBeforeLastUpdatedAt(), BEFORELASTUPDATEDAT_BINDING);
            protocolMarshaller.marshall(listOrganizationRecommendationsRequest.getCheckIdentifier(), CHECKIDENTIFIER_BINDING);
            protocolMarshaller.marshall(listOrganizationRecommendationsRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listOrganizationRecommendationsRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listOrganizationRecommendationsRequest.getPillar(), PILLAR_BINDING);
            protocolMarshaller.marshall(listOrganizationRecommendationsRequest.getSource(), SOURCE_BINDING);
            protocolMarshaller.marshall(listOrganizationRecommendationsRequest.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(listOrganizationRecommendationsRequest.getType(), TYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
