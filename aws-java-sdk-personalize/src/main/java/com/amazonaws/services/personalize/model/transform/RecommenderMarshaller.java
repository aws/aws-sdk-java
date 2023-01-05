/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.personalize.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.personalize.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RecommenderMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RecommenderMarshaller {

    private static final MarshallingInfo<String> RECOMMENDERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recommenderArn").build();
    private static final MarshallingInfo<String> DATASETGROUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("datasetGroupArn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> RECIPEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("recipeArn").build();
    private static final MarshallingInfo<StructuredPojo> RECOMMENDERCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recommenderConfig").build();
    private static final MarshallingInfo<java.util.Date> CREATIONDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdatedDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> FAILUREREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failureReason").build();
    private static final MarshallingInfo<StructuredPojo> LATESTRECOMMENDERUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("latestRecommenderUpdate").build();
    private static final MarshallingInfo<Map> MODELMETRICS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("modelMetrics").build();

    private static final RecommenderMarshaller instance = new RecommenderMarshaller();

    public static RecommenderMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Recommender recommender, ProtocolMarshaller protocolMarshaller) {

        if (recommender == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(recommender.getRecommenderArn(), RECOMMENDERARN_BINDING);
            protocolMarshaller.marshall(recommender.getDatasetGroupArn(), DATASETGROUPARN_BINDING);
            protocolMarshaller.marshall(recommender.getName(), NAME_BINDING);
            protocolMarshaller.marshall(recommender.getRecipeArn(), RECIPEARN_BINDING);
            protocolMarshaller.marshall(recommender.getRecommenderConfig(), RECOMMENDERCONFIG_BINDING);
            protocolMarshaller.marshall(recommender.getCreationDateTime(), CREATIONDATETIME_BINDING);
            protocolMarshaller.marshall(recommender.getLastUpdatedDateTime(), LASTUPDATEDDATETIME_BINDING);
            protocolMarshaller.marshall(recommender.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(recommender.getFailureReason(), FAILUREREASON_BINDING);
            protocolMarshaller.marshall(recommender.getLatestRecommenderUpdate(), LATESTRECOMMENDERUPDATE_BINDING);
            protocolMarshaller.marshall(recommender.getModelMetrics(), MODELMETRICS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
