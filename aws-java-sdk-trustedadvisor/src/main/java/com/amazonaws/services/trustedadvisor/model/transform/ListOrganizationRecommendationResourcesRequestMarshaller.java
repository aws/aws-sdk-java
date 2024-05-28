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
 * ListOrganizationRecommendationResourcesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListOrganizationRecommendationResourcesRequestMarshaller {

    private static final MarshallingInfo<String> AFFECTEDACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("affectedAccountId").build();
    private static final MarshallingInfo<String> EXCLUSIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("exclusionStatus").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("maxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("nextToken").build();
    private static final MarshallingInfo<String> ORGANIZATIONRECOMMENDATIONIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("organizationRecommendationIdentifier").build();
    private static final MarshallingInfo<String> REGIONCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("regionCode").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("status").build();

    private static final ListOrganizationRecommendationResourcesRequestMarshaller instance = new ListOrganizationRecommendationResourcesRequestMarshaller();

    public static ListOrganizationRecommendationResourcesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListOrganizationRecommendationResourcesRequest listOrganizationRecommendationResourcesRequest, ProtocolMarshaller protocolMarshaller) {

        if (listOrganizationRecommendationResourcesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listOrganizationRecommendationResourcesRequest.getAffectedAccountId(), AFFECTEDACCOUNTID_BINDING);
            protocolMarshaller.marshall(listOrganizationRecommendationResourcesRequest.getExclusionStatus(), EXCLUSIONSTATUS_BINDING);
            protocolMarshaller.marshall(listOrganizationRecommendationResourcesRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listOrganizationRecommendationResourcesRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listOrganizationRecommendationResourcesRequest.getOrganizationRecommendationIdentifier(),
                    ORGANIZATIONRECOMMENDATIONIDENTIFIER_BINDING);
            protocolMarshaller.marshall(listOrganizationRecommendationResourcesRequest.getRegionCode(), REGIONCODE_BINDING);
            protocolMarshaller.marshall(listOrganizationRecommendationResourcesRequest.getStatus(), STATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
