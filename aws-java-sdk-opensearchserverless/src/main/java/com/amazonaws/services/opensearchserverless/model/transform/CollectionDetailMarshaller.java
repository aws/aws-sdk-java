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
package com.amazonaws.services.opensearchserverless.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opensearchserverless.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CollectionDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CollectionDetailMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> COLLECTIONENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("collectionEndpoint").build();
    private static final MarshallingInfo<Long> CREATEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("createdDate").build();
    private static final MarshallingInfo<String> DASHBOARDENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dashboardEndpoint").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> KMSKEYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("kmsKeyArn").build();
    private static final MarshallingInfo<Long> LASTMODIFIEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastModifiedDate").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();

    private static final CollectionDetailMarshaller instance = new CollectionDetailMarshaller();

    public static CollectionDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CollectionDetail collectionDetail, ProtocolMarshaller protocolMarshaller) {

        if (collectionDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(collectionDetail.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(collectionDetail.getCollectionEndpoint(), COLLECTIONENDPOINT_BINDING);
            protocolMarshaller.marshall(collectionDetail.getCreatedDate(), CREATEDDATE_BINDING);
            protocolMarshaller.marshall(collectionDetail.getDashboardEndpoint(), DASHBOARDENDPOINT_BINDING);
            protocolMarshaller.marshall(collectionDetail.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(collectionDetail.getId(), ID_BINDING);
            protocolMarshaller.marshall(collectionDetail.getKmsKeyArn(), KMSKEYARN_BINDING);
            protocolMarshaller.marshall(collectionDetail.getLastModifiedDate(), LASTMODIFIEDDATE_BINDING);
            protocolMarshaller.marshall(collectionDetail.getName(), NAME_BINDING);
            protocolMarshaller.marshall(collectionDetail.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(collectionDetail.getType(), TYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
