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
package com.amazonaws.services.rekognition.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.rekognition.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SearchUsersByImageRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SearchUsersByImageRequestMarshaller {

    private static final MarshallingInfo<String> COLLECTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CollectionId").build();
    private static final MarshallingInfo<StructuredPojo> IMAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Image").build();
    private static final MarshallingInfo<Float> USERMATCHTHRESHOLD_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserMatchThreshold").build();
    private static final MarshallingInfo<Integer> MAXUSERS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxUsers").build();
    private static final MarshallingInfo<String> QUALITYFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QualityFilter").build();

    private static final SearchUsersByImageRequestMarshaller instance = new SearchUsersByImageRequestMarshaller();

    public static SearchUsersByImageRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SearchUsersByImageRequest searchUsersByImageRequest, ProtocolMarshaller protocolMarshaller) {

        if (searchUsersByImageRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(searchUsersByImageRequest.getCollectionId(), COLLECTIONID_BINDING);
            protocolMarshaller.marshall(searchUsersByImageRequest.getImage(), IMAGE_BINDING);
            protocolMarshaller.marshall(searchUsersByImageRequest.getUserMatchThreshold(), USERMATCHTHRESHOLD_BINDING);
            protocolMarshaller.marshall(searchUsersByImageRequest.getMaxUsers(), MAXUSERS_BINDING);
            protocolMarshaller.marshall(searchUsersByImageRequest.getQualityFilter(), QUALITYFILTER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
