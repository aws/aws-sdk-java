/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import static com.amazonaws.services.s3.S3ArnUtils.parseOutpostArn;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.arn.Arn;
import com.amazonaws.arn.ArnConverter;
import com.amazonaws.arn.ArnResource;
import com.amazonaws.services.s3.internal.IntermediateOutpostResource;
import com.amazonaws.services.s3.internal.OutpostResourceType;
import com.amazonaws.services.s3.internal.S3ObjectLambdasResource;
import com.amazonaws.services.s3.internal.S3OutpostResource;

/**
 * An implementation of {@link ArnConverter} that can be used to convert valid {@link Arn} representations of s3
 * resources into {@link S3Resource} objects. To fetch an instance of this class, use the singleton getter method
 * {@link #getInstance()}.
 */
@SdkInternalApi
public class S3ArnConverter implements ArnConverter<S3Resource> {
    private static final S3ArnConverter INSTANCE = new S3ArnConverter();
    private static final Pattern OBJECT_AP_PATTERN = Pattern.compile("^([0-9a-zA-Z-]+)/object/(.*)$");
    private static final String OBJECT_LAMBDAS_SERVICE = "s3-object-lambda";

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
        if (isV1Arn(arn)) {
            return convertV1Arn(arn);
        }

        S3ResourceType s3ResourceType;

        try {
            s3ResourceType = S3ResourceType.fromValue(arn.getResource().getResourceType());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Unknown ARN type '" + arn.getResource().getResourceType() + "'");
        }

        // OBJECT is a sub-resource under ACCESS_POINT and BUCKET and will not be recognized as a primary ARN resource
        // type
        switch(s3ResourceType) {
            case ACCESS_POINT:
                return parseS3AccessPointArn(arn);
            case BUCKET:
                return parseS3BucketArn(arn);
            case OUTPOST:
                return parseS3OutpostAccessPointArn(arn);
            default:
                throw new IllegalArgumentException("Unknown ARN type '" + arn.getResource().getResourceType() + "'");
        }
    }

    private S3Resource convertV1Arn(Arn arn) {
        String resource = arn.getResourceAsString();
        String[] splitResource = resource.split("/", 2);

        if (splitResource.length > 1) {
            // Bucket/key
            S3BucketResource parentBucket = S3BucketResource.builder()
                                                            .withPartition(arn.getPartition())
                                                            .withBucketName(splitResource[0])
                                                            .build();

            return S3ObjectResource.builder()
                                   .withParentS3Resource(parentBucket)
                                   .withKey(splitResource[1])
                                   .build();
        } else {
            // Just bucket
            return S3BucketResource.builder()
                                   .withPartition(arn.getPartition())
                                   .withBucketName(resource)
                                   .build();
        }
    }

    private S3Resource parseS3OutpostAccessPointArn(Arn arn) {
        IntermediateOutpostResource intermediateOutpostResource = parseOutpostArn(arn);
        ArnResource outpostSubResource = intermediateOutpostResource.getOutpostSubresource();

        if (!OutpostResourceType.OUTPOST_ACCESS_POINT.toString().equals(outpostSubResource.getResourceType())) {
            throw new IllegalArgumentException("Unknown outpost ARN type '" + outpostSubResource.getResourceType() + "'");
        }

        return S3AccessPointResource.builder()
                                    .withAccessPointName(outpostSubResource.getResource())
                                    .withParentS3Resource(S3OutpostResource.builder()
                                                                           .withPartition(arn.getPartition())
                                                                           .withRegion(arn.getRegion())
                                                                           .withAccountId(arn.getAccountId())
                                                                           .withOutpostId(intermediateOutpostResource.getOutpostId())
                                                                           .build())
                                    .build();
    }

    private S3BucketResource parseS3BucketArn(Arn arn) {
        return S3BucketResource.builder()
                               .withPartition(arn.getPartition())
                               .withRegion(arn.getRegion())
                               .withAccountId(arn.getAccountId())
                               .withBucketName(arn.getResource().getResource())
                               .build();
    }

    private S3Resource parseS3AccessPointArn(Arn arn) {
        Matcher objectMatcher = OBJECT_AP_PATTERN.matcher(arn.getResource().getResource());

        if (objectMatcher.matches()) {
            // ARN is actually an object addressed through an access-point
            String accessPointName = objectMatcher.group(1);
            String objectKey = objectMatcher.group(2);
            S3AccessPointResource parentResource =
                S3AccessPointResource.builder()
                                     .withPartition(arn.getPartition())
                                     .withRegion(arn.getRegion())
                                     .withAccountId(arn.getAccountId())
                                     .withAccessPointName(accessPointName)
                                     .build();

            return S3ObjectResource.builder()
                                   .withParentS3Resource(parentResource)
                                   .withKey(objectKey)
                                   .build();
        }

        if (OBJECT_LAMBDAS_SERVICE.equals(arn.getService())) {
            return parseS3ObjectLambdasAccessPointArn(arn);
        }

        return S3AccessPointResource.builder()
                                    .withPartition(arn.getPartition())
                                    .withRegion(arn.getRegion())
                                    .withAccountId(arn.getAccountId())
                                    .withAccessPointName(arn.getResource().getResource())
                                    .build();
    }

    private S3Resource parseS3ObjectLambdasAccessPointArn(Arn arn) {
        S3ObjectLambdasResource objectLambdasResource = S3ObjectLambdasResource.builder()
                .withAccountId(arn.getAccountId())
                .withRegion(arn.getRegion())
                .withPartition(arn.getPartition())
                .withAccessPointName(arn.getResource().getResource())
                .build();

        return S3AccessPointResource.builder()
                .withAccessPointName(objectLambdasResource.getAccessPointName())
                .withParentS3Resource(objectLambdasResource)
                .build();
    }

    private static boolean isV1Arn(Arn arn) {
        return arn.getAccountId() == null && arn.getRegion() == null;
    }

}
