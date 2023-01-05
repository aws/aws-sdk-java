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
 * CreatePublicIpv4PoolRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePublicIpv4PoolRequestMarshaller implements Marshaller<Request<CreatePublicIpv4PoolRequest>, CreatePublicIpv4PoolRequest> {

    public Request<CreatePublicIpv4PoolRequest> marshall(CreatePublicIpv4PoolRequest createPublicIpv4PoolRequest) {

        if (createPublicIpv4PoolRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreatePublicIpv4PoolRequest> request = new DefaultRequest<CreatePublicIpv4PoolRequest>(createPublicIpv4PoolRequest, "AmazonEC2");
        request.addParameter("Action", "CreatePublicIpv4Pool");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<TagSpecification> createPublicIpv4PoolRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) createPublicIpv4PoolRequest
                .getTagSpecifications();
        if (!createPublicIpv4PoolRequestTagSpecificationsList.isEmpty() || !createPublicIpv4PoolRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification createPublicIpv4PoolRequestTagSpecificationsListValue : createPublicIpv4PoolRequestTagSpecificationsList) {

                if (createPublicIpv4PoolRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(createPublicIpv4PoolRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createPublicIpv4PoolRequestTagSpecificationsListValue
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
