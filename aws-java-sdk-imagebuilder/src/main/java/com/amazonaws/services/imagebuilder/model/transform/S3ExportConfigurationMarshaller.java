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
package com.amazonaws.services.imagebuilder.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.imagebuilder.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * S3ExportConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class S3ExportConfigurationMarshaller {

    private static final MarshallingInfo<String> ROLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleName").build();
    private static final MarshallingInfo<String> DISKIMAGEFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("diskImageFormat").build();
    private static final MarshallingInfo<String> S3BUCKET_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("s3Bucket").build();
    private static final MarshallingInfo<String> S3PREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("s3Prefix").build();

    private static final S3ExportConfigurationMarshaller instance = new S3ExportConfigurationMarshaller();

    public static S3ExportConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(S3ExportConfiguration s3ExportConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (s3ExportConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(s3ExportConfiguration.getRoleName(), ROLENAME_BINDING);
            protocolMarshaller.marshall(s3ExportConfiguration.getDiskImageFormat(), DISKIMAGEFORMAT_BINDING);
            protocolMarshaller.marshall(s3ExportConfiguration.getS3Bucket(), S3BUCKET_BINDING);
            protocolMarshaller.marshall(s3ExportConfiguration.getS3Prefix(), S3PREFIX_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
