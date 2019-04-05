/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.s3.internal;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.s3.model.GetObjectMetadataRequest;
import com.amazonaws.services.s3.model.GetObjectRequest;

@SdkInternalApi
public class RequestCopyUtils {

    /**
     * Creates a #GetObjectMetadataRequest by copying values for common members
     * from the input #GetObjectRequest.
     */
    public static GetObjectMetadataRequest createGetObjectMetadataRequestFrom(GetObjectRequest getObjectRequest) {
        return new GetObjectMetadataRequest(getObjectRequest.getBucketName(), getObjectRequest.getKey())
                .withVersionId(getObjectRequest.getVersionId())
                .withRequesterPays(getObjectRequest.isRequesterPays())
                .withSSECustomerKey(getObjectRequest.getSSECustomerKey())
                .withPartNumber(getObjectRequest.getPartNumber());
    }
}
