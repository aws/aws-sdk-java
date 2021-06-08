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
 * CreateRestoreImageTaskRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRestoreImageTaskRequestMarshaller implements Marshaller<Request<CreateRestoreImageTaskRequest>, CreateRestoreImageTaskRequest> {

    public Request<CreateRestoreImageTaskRequest> marshall(CreateRestoreImageTaskRequest createRestoreImageTaskRequest) {

        if (createRestoreImageTaskRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateRestoreImageTaskRequest> request = new DefaultRequest<CreateRestoreImageTaskRequest>(createRestoreImageTaskRequest, "AmazonEC2");
        request.addParameter("Action", "CreateRestoreImageTask");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createRestoreImageTaskRequest.getBucket() != null) {
            request.addParameter("Bucket", StringUtils.fromString(createRestoreImageTaskRequest.getBucket()));
        }

        if (createRestoreImageTaskRequest.getObjectKey() != null) {
            request.addParameter("ObjectKey", StringUtils.fromString(createRestoreImageTaskRequest.getObjectKey()));
        }

        if (createRestoreImageTaskRequest.getName() != null) {
            request.addParameter("Name", StringUtils.fromString(createRestoreImageTaskRequest.getName()));
        }

        com.amazonaws.internal.SdkInternalList<TagSpecification> createRestoreImageTaskRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) createRestoreImageTaskRequest
                .getTagSpecifications();
        if (!createRestoreImageTaskRequestTagSpecificationsList.isEmpty() || !createRestoreImageTaskRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification createRestoreImageTaskRequestTagSpecificationsListValue : createRestoreImageTaskRequestTagSpecificationsList) {

                if (createRestoreImageTaskRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(createRestoreImageTaskRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createRestoreImageTaskRequestTagSpecificationsListValue
                        .getTags();
                if (!tagSpecificationTagsList.isEmpty() || !tagSpecificationTagsList.isAutoConstruct()) {
                    int tagsListIndex = 1;

                    for (Tag tagSpecificationTagsListValue : tagSpecificationTagsList) {

                        if (tagSpecificationTagsListValue.getKey() != null) {
                            request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".Tag." + tagsListIndex + ".Key",
                                    StringUtils.fromString(tagSpecificationTagsListValue.getKey()));
                        }

                        if (tagSpecificationTagsListValue.getValue() != null) {
                            request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".Tag." + tagsListIndex + ".Value",
                                    StringUtils.fromString(tagSpecificationTagsListValue.getValue()));
                        }
                        tagsListIndex++;
                    }
                }
                tagSpecificationsListIndex++;
            }
        }

        return request;
    }

}
