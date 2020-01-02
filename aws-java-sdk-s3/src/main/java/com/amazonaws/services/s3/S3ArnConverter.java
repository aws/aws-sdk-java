/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.s3;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.arn.Arn;
import com.amazonaws.arn.ArnConverter;

/**
 * An implementation of {@link ArnConverter} that can be used to convert valid {@link Arn} representations of s3
 * resources into {@link S3Resource} objects. To fetch an instance of this class, use the singleton getter method
 * {@link #getInstance()}.
 */
@SdkInternalApi
public class S3ArnConverter implements ArnConverter<S3Resource> {
    private static final S3ArnConverter INSTANCE = new S3ArnConverter();

    private S3ArnConverter() {
    }

    /**
     * Gets a static singleton instance of an {@link S3ArnConverter}.
     * @return A static instance of an {@link S3ArnConverter}.
     */
    public static S3ArnConverter getInstance() {
        return INSTANCE;
    }

    /**
     * Converts a valid ARN representation of an S3 resource into a {@link S3Resource} object.
     * @param arn The ARN to convert.
     * @return An {@link S3Resource} object as specified by the ARN.
     * @throws IllegalArgumentException if the ARN is not a valid representation of an S3 resource supported by this
     * SDK.
     */
    @Override
    public S3Resource convertArn(Arn arn) {
        Arn v2Arn = convertToV2Arn(arn);
        S3ResourceType s3ResourceType;

        try {
            s3ResourceType = S3ResourceType.fromValue(v2Arn.getResource().getResourceType());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Unknown ARN type '" + v2Arn.getResource().getResourceType() + "'");
        }

        switch(s3ResourceType) {
            case OBJECT:
                return parseS3ObjectArn(v2Arn);
            case ACCESS_POINT:
                return parseS3AccessPointArn(v2Arn);
            case BUCKET:
                return parseS3BucketArn(v2Arn);
            default:
                throw new IllegalArgumentException("Unknown ARN type '" + v2Arn.getResource().getResourceType() + "'");
        }
    }

    private Arn convertToV2Arn(Arn arn) {
        if (!isV1Arn(arn)) {
            return arn;
        }

        String resource = arn.getResourceAsString();

        if (resource.contains("/")) {
            return arn.toBuilder().withResource("object:" + arn.getResourceAsString()).build();
        } else {
            return arn.toBuilder().withResource("bucket_name:" + arn.getResourceAsString()).build();
        }
    }

    private S3BucketResource parseS3BucketArn(Arn arn) {
        return S3BucketResource.builder()
                               .withPartition(arn.getPartition())
                               .withRegion(arn.getRegion())
                               .withAccountId(arn.getAccountId())
                               .withBucketName(arn.getResource().getResource())
                               .build();
    }

    private S3AccessPointResource parseS3AccessPointArn(Arn arn) {
        return S3AccessPointResource.builder()
                                 .withPartition(arn.getPartition())
                                 .withRegion(arn.getRegion())
                                 .withAccountId(arn.getAccountId())
                                 .withAccessPointName(arn.getResource().getResource())
                                 .build();
    }

    private S3ObjectResource parseS3ObjectArn(Arn arn) {
        String resourceString = arn.getResource().getResource();
        String [] splitResourceString = resourceString.split("/");

        if (splitResourceString.length < 2) {
            throw new IllegalArgumentException("Invalid format for S3 object resource ARN");
        }

        String bucketName = splitResourceString[0];
        String key = splitResourceString[1];

        return S3ObjectResource.builder()
                               .withPartition(arn.getPartition())
                               .withRegion(arn.getRegion())
                               .withAccountId(arn.getAccountId())
                               .withBucketName(bucketName)
                               .withKey(key)
                               .build();
    }

    private boolean isV1Arn(Arn arn) {
        return arn.getAccountId() == null && arn.getRegion() == null;
    }
}
