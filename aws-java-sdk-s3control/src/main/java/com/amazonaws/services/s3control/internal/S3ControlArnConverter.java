/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.s3control.internal;

import static com.amazonaws.services.s3.S3ArnUtils.parseOutpostArn;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.arn.Arn;
import com.amazonaws.arn.ArnConverter;
import com.amazonaws.arn.ArnResource;
import com.amazonaws.services.s3.S3AccessPointResource;
import com.amazonaws.services.s3.S3Resource;
import com.amazonaws.services.s3.internal.IntermediateOutpostResource;
import com.amazonaws.services.s3.internal.OutpostResourceType;
import com.amazonaws.services.s3.internal.S3OutpostResource;

@SdkInternalApi
public final class S3ControlArnConverter implements ArnConverter<S3Resource> {
    private static final S3ControlArnConverter INSTANCE = new S3ControlArnConverter();

    private S3ControlArnConverter() {
    }

    /**
     * Gets a static singleton instance of an {@link S3ControlArnConverter}.
     *
     * @return A static instance of an {@link S3ControlArnConverter}.
     */
    public static S3ControlArnConverter getInstance() {
        return INSTANCE;
    }

    @Override
    public S3Resource convertArn(Arn arn) {
        S3ControlResourceType s3ResourceType;

        try {
            s3ResourceType = S3ControlResourceType.fromValue(arn.getResource().getResourceType());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Unknown ARN type '" + arn.getResource().getResourceType() + "'");
        }

        switch (s3ResourceType) {
            case OUTPOST:
                return parseS3OutpostArn(arn);
            default:
                throw new IllegalArgumentException("Unknown ARN type '" + arn.getResource().getResourceType() + "'");
        }
    }

    private S3Resource parseS3OutpostArn(Arn arn) {
        IntermediateOutpostResource intermediateOutpostResource = parseOutpostArn(arn);
        ArnResource outpostSubresource = intermediateOutpostResource.getOutpostSubresource();
        String subResource = outpostSubresource.getResource();
        OutpostResourceType outpostResourceType;
        try {
            outpostResourceType = OutpostResourceType.fromValue(outpostSubresource.getResourceType());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Unknown outpost ARN type '" + outpostSubresource.getResourceType() + "'");
        }

        String outpostId = intermediateOutpostResource.getOutpostId();

        switch (outpostResourceType) {
            case OUTPOST_BUCKET:
                return S3ControlBucketResource.builder()
                                       .withBucketName(subResource)
                                       .withParentS3Resource(S3OutpostResource.builder()
                                                                              .withPartition(arn.getPartition())
                                                                              .withRegion(arn.getRegion())
                                                                              .withAccountId(arn.getAccountId())
                                                                              .withOutpostId(outpostId)
                                                                              .build())
                                       .build();

            case OUTPOST_ACCESS_POINT:
                return S3AccessPointResource.builder()
                                            .withAccessPointName(subResource)
                                            .withParentS3Resource(S3OutpostResource.builder()
                                                                                   .withPartition(arn.getPartition())
                                                                                   .withRegion(arn.getRegion())
                                                                                   .withAccountId(arn.getAccountId())
                                                                                   .withOutpostId(outpostId)
                                                                                   .build())
                                            .build();
            default:
                throw new IllegalArgumentException("Unknown outpost ARN type '" + outpostSubresource.getResourceType() + "'");
        }
    }

}
