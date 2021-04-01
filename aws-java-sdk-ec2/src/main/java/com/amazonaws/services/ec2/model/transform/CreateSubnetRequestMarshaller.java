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
 * CreateSubnetRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSubnetRequestMarshaller implements Marshaller<Request<CreateSubnetRequest>, CreateSubnetRequest> {

    public Request<CreateSubnetRequest> marshall(CreateSubnetRequest createSubnetRequest) {

        if (createSubnetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateSubnetRequest> request = new DefaultRequest<CreateSubnetRequest>(createSubnetRequest, "AmazonEC2");
        request.addParameter("Action", "CreateSubnet");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<TagSpecification> createSubnetRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) createSubnetRequest
                .getTagSpecifications();
        if (!createSubnetRequestTagSpecificationsList.isEmpty() || !createSubnetRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification createSubnetRequestTagSpecificationsListValue : createSubnetRequestTagSpecificationsList) {

                if (createSubnetRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(createSubnetRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createSubnetRequestTagSpecificationsListValue
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

        if (createSubnetRequest.getAvailabilityZone() != null) {
            request.addParameter("AvailabilityZone", StringUtils.fromString(createSubnetRequest.getAvailabilityZone()));
        }

        if (createSubnetRequest.getAvailabilityZoneId() != null) {
            request.addParameter("AvailabilityZoneId", StringUtils.fromString(createSubnetRequest.getAvailabilityZoneId()));
        }

        if (createSubnetRequest.getCidrBlock() != null) {
            request.addParameter("CidrBlock", StringUtils.fromString(createSubnetRequest.getCidrBlock()));
        }

        if (createSubnetRequest.getIpv6CidrBlock() != null) {
            request.addParameter("Ipv6CidrBlock", StringUtils.fromString(createSubnetRequest.getIpv6CidrBlock()));
        }

        if (createSubnetRequest.getOutpostArn() != null) {
            request.addParameter("OutpostArn", StringUtils.fromString(createSubnetRequest.getOutpostArn()));
        }

        if (createSubnetRequest.getVpcId() != null) {
            request.addParameter("VpcId", StringUtils.fromString(createSubnetRequest.getVpcId()));
        }

        return request;
    }

}
