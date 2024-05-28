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
package com.amazonaws.services.omics.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.omics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AnnotationStoreVersionItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AnnotationStoreVersionItemMarshaller {

    private static final MarshallingInfo<String> STOREID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("storeId").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> VERSIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("versionArn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> VERSIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("versionName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> UPDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updateTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> STATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusMessage").build();
    private static final MarshallingInfo<Long> VERSIONSIZEBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("versionSizeBytes").build();

    private static final AnnotationStoreVersionItemMarshaller instance = new AnnotationStoreVersionItemMarshaller();

    public static AnnotationStoreVersionItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AnnotationStoreVersionItem annotationStoreVersionItem, ProtocolMarshaller protocolMarshaller) {

        if (annotationStoreVersionItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(annotationStoreVersionItem.getStoreId(), STOREID_BINDING);
            protocolMarshaller.marshall(annotationStoreVersionItem.getId(), ID_BINDING);
            protocolMarshaller.marshall(annotationStoreVersionItem.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(annotationStoreVersionItem.getVersionArn(), VERSIONARN_BINDING);
            protocolMarshaller.marshall(annotationStoreVersionItem.getName(), NAME_BINDING);
            protocolMarshaller.marshall(annotationStoreVersionItem.getVersionName(), VERSIONNAME_BINDING);
            protocolMarshaller.marshall(annotationStoreVersionItem.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(annotationStoreVersionItem.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(annotationStoreVersionItem.getUpdateTime(), UPDATETIME_BINDING);
            protocolMarshaller.marshall(annotationStoreVersionItem.getStatusMessage(), STATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(annotationStoreVersionItem.getVersionSizeBytes(), VERSIONSIZEBYTES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
