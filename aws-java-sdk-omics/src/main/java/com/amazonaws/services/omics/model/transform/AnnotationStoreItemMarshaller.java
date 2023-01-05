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
package com.amazonaws.services.omics.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.omics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AnnotationStoreItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AnnotationStoreItemMarshaller {

    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<StructuredPojo> REFERENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("reference").build();
    private static final MarshallingInfo<StructuredPojo> SSECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sseConfig").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> STATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusMessage").build();
    private static final MarshallingInfo<String> STOREARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("storeArn").build();
    private static final MarshallingInfo<String> STOREFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("storeFormat").build();
    private static final MarshallingInfo<Long> STORESIZEBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("storeSizeBytes").build();
    private static final MarshallingInfo<java.util.Date> UPDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updateTime").timestampFormat("iso8601").build();

    private static final AnnotationStoreItemMarshaller instance = new AnnotationStoreItemMarshaller();

    public static AnnotationStoreItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AnnotationStoreItem annotationStoreItem, ProtocolMarshaller protocolMarshaller) {

        if (annotationStoreItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(annotationStoreItem.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(annotationStoreItem.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(annotationStoreItem.getId(), ID_BINDING);
            protocolMarshaller.marshall(annotationStoreItem.getName(), NAME_BINDING);
            protocolMarshaller.marshall(annotationStoreItem.getReference(), REFERENCE_BINDING);
            protocolMarshaller.marshall(annotationStoreItem.getSseConfig(), SSECONFIG_BINDING);
            protocolMarshaller.marshall(annotationStoreItem.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(annotationStoreItem.getStatusMessage(), STATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(annotationStoreItem.getStoreArn(), STOREARN_BINDING);
            protocolMarshaller.marshall(annotationStoreItem.getStoreFormat(), STOREFORMAT_BINDING);
            protocolMarshaller.marshall(annotationStoreItem.getStoreSizeBytes(), STORESIZEBYTES_BINDING);
            protocolMarshaller.marshall(annotationStoreItem.getUpdateTime(), UPDATETIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
