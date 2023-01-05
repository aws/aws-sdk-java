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
package com.amazonaws.services.dataexchange.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dataexchange.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * S3DataAccessAssetMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class S3DataAccessAssetMarshaller {

    private static final MarshallingInfo<String> BUCKET_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Bucket").build();
    private static final MarshallingInfo<List> KEYPREFIXES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KeyPrefixes").build();
    private static final MarshallingInfo<List> KEYS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Keys").build();
    private static final MarshallingInfo<String> S3ACCESSPOINTALIAS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3AccessPointAlias").build();
    private static final MarshallingInfo<String> S3ACCESSPOINTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3AccessPointArn").build();

    private static final S3DataAccessAssetMarshaller instance = new S3DataAccessAssetMarshaller();

    public static S3DataAccessAssetMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(S3DataAccessAsset s3DataAccessAsset, ProtocolMarshaller protocolMarshaller) {

        if (s3DataAccessAsset == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(s3DataAccessAsset.getBucket(), BUCKET_BINDING);
            protocolMarshaller.marshall(s3DataAccessAsset.getKeyPrefixes(), KEYPREFIXES_BINDING);
            protocolMarshaller.marshall(s3DataAccessAsset.getKeys(), KEYS_BINDING);
            protocolMarshaller.marshall(s3DataAccessAsset.getS3AccessPointAlias(), S3ACCESSPOINTALIAS_BINDING);
            protocolMarshaller.marshall(s3DataAccessAsset.getS3AccessPointArn(), S3ACCESSPOINTARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
