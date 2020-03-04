/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpoint.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RecommenderConfigurationResponseMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RecommenderConfigurationResponseMarshaller {

    private static final MarshallingInfo<Map> ATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Attributes").build();
    private static final MarshallingInfo<String> CREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationDate").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> LASTMODIFIEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedDate").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> RECOMMENDATIONPROVIDERIDTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecommendationProviderIdType").build();
    private static final MarshallingInfo<String> RECOMMENDATIONPROVIDERROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecommendationProviderRoleArn").build();
    private static final MarshallingInfo<String> RECOMMENDATIONPROVIDERURI_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecommendationProviderUri").build();
    private static final MarshallingInfo<String> RECOMMENDATIONTRANSFORMERURI_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecommendationTransformerUri").build();
    private static final MarshallingInfo<String> RECOMMENDATIONSDISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecommendationsDisplayName").build();
    private static final MarshallingInfo<Integer> RECOMMENDATIONSPERMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecommendationsPerMessage").build();

    private static final RecommenderConfigurationResponseMarshaller instance = new RecommenderConfigurationResponseMarshaller();

    public static RecommenderConfigurationResponseMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RecommenderConfigurationResponse recommenderConfigurationResponse, ProtocolMarshaller protocolMarshaller) {

        if (recommenderConfigurationResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(recommenderConfigurationResponse.getAttributes(), ATTRIBUTES_BINDING);
            protocolMarshaller.marshall(recommenderConfigurationResponse.getCreationDate(), CREATIONDATE_BINDING);
            protocolMarshaller.marshall(recommenderConfigurationResponse.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(recommenderConfigurationResponse.getId(), ID_BINDING);
            protocolMarshaller.marshall(recommenderConfigurationResponse.getLastModifiedDate(), LASTMODIFIEDDATE_BINDING);
            protocolMarshaller.marshall(recommenderConfigurationResponse.getName(), NAME_BINDING);
            protocolMarshaller.marshall(recommenderConfigurationResponse.getRecommendationProviderIdType(), RECOMMENDATIONPROVIDERIDTYPE_BINDING);
            protocolMarshaller.marshall(recommenderConfigurationResponse.getRecommendationProviderRoleArn(), RECOMMENDATIONPROVIDERROLEARN_BINDING);
            protocolMarshaller.marshall(recommenderConfigurationResponse.getRecommendationProviderUri(), RECOMMENDATIONPROVIDERURI_BINDING);
            protocolMarshaller.marshall(recommenderConfigurationResponse.getRecommendationTransformerUri(), RECOMMENDATIONTRANSFORMERURI_BINDING);
            protocolMarshaller.marshall(recommenderConfigurationResponse.getRecommendationsDisplayName(), RECOMMENDATIONSDISPLAYNAME_BINDING);
            protocolMarshaller.marshall(recommenderConfigurationResponse.getRecommendationsPerMessage(), RECOMMENDATIONSPERMESSAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
