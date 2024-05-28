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
package com.amazonaws.services.medicalimaging.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medicalimaging.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateImageSetMetadataRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateImageSetMetadataRequestMarshaller {

    private static final MarshallingInfo<String> DATASTOREID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("datastoreId").build();
    private static final MarshallingInfo<String> IMAGESETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("imageSetId").build();
    private static final MarshallingInfo<String> LATESTVERSIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("latestVersion").build();
    private static final MarshallingInfo<StructuredPojo> UPDATEIMAGESETMETADATAUPDATES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).isExplicitPayloadMember(true).build();

    private static final UpdateImageSetMetadataRequestMarshaller instance = new UpdateImageSetMetadataRequestMarshaller();

    public static UpdateImageSetMetadataRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateImageSetMetadataRequest updateImageSetMetadataRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateImageSetMetadataRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateImageSetMetadataRequest.getDatastoreId(), DATASTOREID_BINDING);
            protocolMarshaller.marshall(updateImageSetMetadataRequest.getImageSetId(), IMAGESETID_BINDING);
            protocolMarshaller.marshall(updateImageSetMetadataRequest.getLatestVersionId(), LATESTVERSIONID_BINDING);
            protocolMarshaller.marshall(updateImageSetMetadataRequest.getUpdateImageSetMetadataUpdates(), UPDATEIMAGESETMETADATAUPDATES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
