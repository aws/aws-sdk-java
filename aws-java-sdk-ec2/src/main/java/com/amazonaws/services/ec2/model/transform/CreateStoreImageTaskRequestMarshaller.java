/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CreateStoreImageTaskRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateStoreImageTaskRequestMarshaller implements Marshaller<Request<CreateStoreImageTaskRequest>, CreateStoreImageTaskRequest> {

    public Request<CreateStoreImageTaskRequest> marshall(CreateStoreImageTaskRequest createStoreImageTaskRequest) {

        if (createStoreImageTaskRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateStoreImageTaskRequest> request = new DefaultRequest<CreateStoreImageTaskRequest>(createStoreImageTaskRequest, "AmazonEC2");
        request.addParameter("Action", "CreateStoreImageTask");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createStoreImageTaskRequest.getImageId() != null) {
            request.addParameter("ImageId", StringUtils.fromString(createStoreImageTaskRequest.getImageId()));
        }

        if (createStoreImageTaskRequest.getBucket() != null) {
            request.addParameter("Bucket", StringUtils.fromString(createStoreImageTaskRequest.getBucket()));
        }

        com.amazonaws.internal.SdkInternalList<S3ObjectTag> createStoreImageTaskRequestS3ObjectTagsList = (com.amazonaws.internal.SdkInternalList<S3ObjectTag>) createStoreImageTaskRequest
                .getS3ObjectTags();
        if (!createStoreImageTaskRequestS3ObjectTagsList.isEmpty() || !createStoreImageTaskRequestS3ObjectTagsList.isAutoConstruct()) {
            int s3ObjectTagsListIndex = 1;

            for (S3ObjectTag createStoreImageTaskRequestS3ObjectTagsListValue : createStoreImageTaskRequestS3ObjectTagsList) {

                if (createStoreImageTaskRequestS3ObjectTagsListValue.getKey() != null) {
                    request.addParameter("S3ObjectTag." + s3ObjectTagsListIndex + ".Key",
                            StringUtils.fromString(createStoreImageTaskRequestS3ObjectTagsListValue.getKey()));
                }

                if (createStoreImageTaskRequestS3ObjectTagsListValue.getValue() != null) {
                    request.addParameter("S3ObjectTag." + s3ObjectTagsListIndex + ".Value",
                            StringUtils.fromString(createStoreImageTaskRequestS3ObjectTagsListValue.getValue()));
                }
                s3ObjectTagsListIndex++;
            }
        }

        return request;
    }

}
