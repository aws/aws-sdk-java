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
package com.amazonaws.services.location.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.location.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateGeofenceCollectionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateGeofenceCollectionRequestMarshaller {

    private static final MarshallingInfo<String> COLLECTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CollectionName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKeyId").build();
    private static final MarshallingInfo<String> PRICINGPLAN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PricingPlan").build();
    private static final MarshallingInfo<String> PRICINGPLANDATASOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PricingPlanDataSource").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateGeofenceCollectionRequestMarshaller instance = new CreateGeofenceCollectionRequestMarshaller();

    public static CreateGeofenceCollectionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateGeofenceCollectionRequest createGeofenceCollectionRequest, ProtocolMarshaller protocolMarshaller) {

        if (createGeofenceCollectionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createGeofenceCollectionRequest.getCollectionName(), COLLECTIONNAME_BINDING);
            protocolMarshaller.marshall(createGeofenceCollectionRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createGeofenceCollectionRequest.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(createGeofenceCollectionRequest.getPricingPlan(), PRICINGPLAN_BINDING);
            protocolMarshaller.marshall(createGeofenceCollectionRequest.getPricingPlanDataSource(), PRICINGPLANDATASOURCE_BINDING);
            protocolMarshaller.marshall(createGeofenceCollectionRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
