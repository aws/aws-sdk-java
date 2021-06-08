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
import com.amazonaws.util.IdempotentUtils;

/**
 * CreateReplaceRootVolumeTaskRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateReplaceRootVolumeTaskRequestMarshaller implements
        Marshaller<Request<CreateReplaceRootVolumeTaskRequest>, CreateReplaceRootVolumeTaskRequest> {

    public Request<CreateReplaceRootVolumeTaskRequest> marshall(CreateReplaceRootVolumeTaskRequest createReplaceRootVolumeTaskRequest) {

        if (createReplaceRootVolumeTaskRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateReplaceRootVolumeTaskRequest> request = new DefaultRequest<CreateReplaceRootVolumeTaskRequest>(createReplaceRootVolumeTaskRequest,
                "AmazonEC2");
        request.addParameter("Action", "CreateReplaceRootVolumeTask");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createReplaceRootVolumeTaskRequest.getInstanceId() != null) {
            request.addParameter("InstanceId", StringUtils.fromString(createReplaceRootVolumeTaskRequest.getInstanceId()));
        }

        if (createReplaceRootVolumeTaskRequest.getSnapshotId() != null) {
            request.addParameter("SnapshotId", StringUtils.fromString(createReplaceRootVolumeTaskRequest.getSnapshotId()));
        }

        request.addParameter("ClientToken", IdempotentUtils.resolveString(createReplaceRootVolumeTaskRequest.getClientToken()));

        com.amazonaws.internal.SdkInternalList<TagSpecification> createReplaceRootVolumeTaskRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) createReplaceRootVolumeTaskRequest
                .getTagSpecifications();
        if (!createReplaceRootVolumeTaskRequestTagSpecificationsList.isEmpty() || !createReplaceRootVolumeTaskRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification createReplaceRootVolumeTaskRequestTagSpecificationsListValue : createReplaceRootVolumeTaskRequestTagSpecificationsList) {

                if (createReplaceRootVolumeTaskRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(createReplaceRootVolumeTaskRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createReplaceRootVolumeTaskRequestTagSpecificationsListValue
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
