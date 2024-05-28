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
package com.amazonaws.services.datasync.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.datasync.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * S3ManifestConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class S3ManifestConfigMarshaller {

    private static final MarshallingInfo<String> MANIFESTOBJECTPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ManifestObjectPath").build();
    private static final MarshallingInfo<String> BUCKETACCESSROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BucketAccessRoleArn").build();
    private static final MarshallingInfo<String> S3BUCKETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3BucketArn").build();
    private static final MarshallingInfo<String> MANIFESTOBJECTVERSIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ManifestObjectVersionId").build();

    private static final S3ManifestConfigMarshaller instance = new S3ManifestConfigMarshaller();

    public static S3ManifestConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(S3ManifestConfig s3ManifestConfig, ProtocolMarshaller protocolMarshaller) {

        if (s3ManifestConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(s3ManifestConfig.getManifestObjectPath(), MANIFESTOBJECTPATH_BINDING);
            protocolMarshaller.marshall(s3ManifestConfig.getBucketAccessRoleArn(), BUCKETACCESSROLEARN_BINDING);
            protocolMarshaller.marshall(s3ManifestConfig.getS3BucketArn(), S3BUCKETARN_BINDING);
            protocolMarshaller.marshall(s3ManifestConfig.getManifestObjectVersionId(), MANIFESTOBJECTVERSIONID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
