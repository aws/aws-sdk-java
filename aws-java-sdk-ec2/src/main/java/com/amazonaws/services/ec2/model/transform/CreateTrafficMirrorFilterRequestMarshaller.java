/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * CreateTrafficMirrorFilterRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTrafficMirrorFilterRequestMarshaller implements Marshaller<Request<CreateTrafficMirrorFilterRequest>, CreateTrafficMirrorFilterRequest> {

    public Request<CreateTrafficMirrorFilterRequest> marshall(CreateTrafficMirrorFilterRequest createTrafficMirrorFilterRequest) {

        if (createTrafficMirrorFilterRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateTrafficMirrorFilterRequest> request = new DefaultRequest<CreateTrafficMirrorFilterRequest>(createTrafficMirrorFilterRequest, "AmazonEC2");
        request.addParameter("Action", "CreateTrafficMirrorFilter");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createTrafficMirrorFilterRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createTrafficMirrorFilterRequest.getDescription()));
        }

        com.amazonaws.internal.SdkInternalList<TagSpecification> createTrafficMirrorFilterRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) createTrafficMirrorFilterRequest
                .getTagSpecifications();
        if (!createTrafficMirrorFilterRequestTagSpecificationsList.isEmpty() || !createTrafficMirrorFilterRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification createTrafficMirrorFilterRequestTagSpecificationsListValue : createTrafficMirrorFilterRequestTagSpecificationsList) {

                if (createTrafficMirrorFilterRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(createTrafficMirrorFilterRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createTrafficMirrorFilterRequestTagSpecificationsListValue
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

        request.addParameter("ClientToken", IdempotentUtils.resolveString(createTrafficMirrorFilterRequest.getClientToken()));

        return request;
    }

}
