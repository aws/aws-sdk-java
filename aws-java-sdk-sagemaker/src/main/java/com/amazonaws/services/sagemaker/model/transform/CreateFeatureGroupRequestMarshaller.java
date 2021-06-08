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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateFeatureGroupRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateFeatureGroupRequestMarshaller {

    private static final MarshallingInfo<String> FEATUREGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FeatureGroupName").build();
    private static final MarshallingInfo<String> RECORDIDENTIFIERFEATURENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecordIdentifierFeatureName").build();
    private static final MarshallingInfo<String> EVENTTIMEFEATURENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventTimeFeatureName").build();
    private static final MarshallingInfo<List> FEATUREDEFINITIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FeatureDefinitions").build();
    private static final MarshallingInfo<StructuredPojo> ONLINESTORECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OnlineStoreConfig").build();
    private static final MarshallingInfo<StructuredPojo> OFFLINESTORECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OfflineStoreConfig").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleArn").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateFeatureGroupRequestMarshaller instance = new CreateFeatureGroupRequestMarshaller();

    public static CreateFeatureGroupRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateFeatureGroupRequest createFeatureGroupRequest, ProtocolMarshaller protocolMarshaller) {

        if (createFeatureGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createFeatureGroupRequest.getFeatureGroupName(), FEATUREGROUPNAME_BINDING);
            protocolMarshaller.marshall(createFeatureGroupRequest.getRecordIdentifierFeatureName(), RECORDIDENTIFIERFEATURENAME_BINDING);
            protocolMarshaller.marshall(createFeatureGroupRequest.getEventTimeFeatureName(), EVENTTIMEFEATURENAME_BINDING);
            protocolMarshaller.marshall(createFeatureGroupRequest.getFeatureDefinitions(), FEATUREDEFINITIONS_BINDING);
            protocolMarshaller.marshall(createFeatureGroupRequest.getOnlineStoreConfig(), ONLINESTORECONFIG_BINDING);
            protocolMarshaller.marshall(createFeatureGroupRequest.getOfflineStoreConfig(), OFFLINESTORECONFIG_BINDING);
            protocolMarshaller.marshall(createFeatureGroupRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(createFeatureGroupRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createFeatureGroupRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
