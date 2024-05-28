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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.trustedadvisor.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RecommendationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RecommendationMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<List> AWSSERVICES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("awsServices").build();
    private static final MarshallingInfo<String> CHECKARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("checkArn").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("createdBy").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdatedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> LIFECYCLESTAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lifecycleStage").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<StructuredPojo> PILLARSPECIFICAGGREGATES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pillarSpecificAggregates").build();
    private static final MarshallingInfo<List> PILLARS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("pillars").build();
    private static final MarshallingInfo<java.util.Date> RESOLVEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resolvedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCESAGGREGATES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourcesAggregates").build();
    private static final MarshallingInfo<String> SOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("source").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<String> UPDATEREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updateReason").build();
    private static final MarshallingInfo<String> UPDATEREASONCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updateReasonCode").build();
    private static final MarshallingInfo<String> UPDATEDONBEHALFOF_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedOnBehalfOf").build();
    private static final MarshallingInfo<String> UPDATEDONBEHALFOFJOBTITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedOnBehalfOfJobTitle").build();

    private static final RecommendationMarshaller instance = new RecommendationMarshaller();

    public static RecommendationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Recommendation recommendation, ProtocolMarshaller protocolMarshaller) {

        if (recommendation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(recommendation.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(recommendation.getAwsServices(), AWSSERVICES_BINDING);
            protocolMarshaller.marshall(recommendation.getCheckArn(), CHECKARN_BINDING);
            protocolMarshaller.marshall(recommendation.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(recommendation.getCreatedBy(), CREATEDBY_BINDING);
            protocolMarshaller.marshall(recommendation.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(recommendation.getId(), ID_BINDING);
            protocolMarshaller.marshall(recommendation.getLastUpdatedAt(), LASTUPDATEDAT_BINDING);
            protocolMarshaller.marshall(recommendation.getLifecycleStage(), LIFECYCLESTAGE_BINDING);
            protocolMarshaller.marshall(recommendation.getName(), NAME_BINDING);
            protocolMarshaller.marshall(recommendation.getPillarSpecificAggregates(), PILLARSPECIFICAGGREGATES_BINDING);
            protocolMarshaller.marshall(recommendation.getPillars(), PILLARS_BINDING);
            protocolMarshaller.marshall(recommendation.getResolvedAt(), RESOLVEDAT_BINDING);
            protocolMarshaller.marshall(recommendation.getResourcesAggregates(), RESOURCESAGGREGATES_BINDING);
            protocolMarshaller.marshall(recommendation.getSource(), SOURCE_BINDING);
            protocolMarshaller.marshall(recommendation.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(recommendation.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(recommendation.getUpdateReason(), UPDATEREASON_BINDING);
            protocolMarshaller.marshall(recommendation.getUpdateReasonCode(), UPDATEREASONCODE_BINDING);
            protocolMarshaller.marshall(recommendation.getUpdatedOnBehalfOf(), UPDATEDONBEHALFOF_BINDING);
            protocolMarshaller.marshall(recommendation.getUpdatedOnBehalfOfJobTitle(), UPDATEDONBEHALFOFJOBTITLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
