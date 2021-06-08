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
 * CreateVpcRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVpcRequestMarshaller implements Marshaller<Request<CreateVpcRequest>, CreateVpcRequest> {

    public Request<CreateVpcRequest> marshall(CreateVpcRequest createVpcRequest) {

        if (createVpcRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateVpcRequest> request = new DefaultRequest<CreateVpcRequest>(createVpcRequest, "AmazonEC2");
        request.addParameter("Action", "CreateVpc");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createVpcRequest.getCidrBlock() != null) {
            request.addParameter("CidrBlock", StringUtils.fromString(createVpcRequest.getCidrBlock()));
        }

        if (createVpcRequest.getAmazonProvidedIpv6CidrBlock() != null) {
            request.addParameter("AmazonProvidedIpv6CidrBlock", StringUtils.fromBoolean(createVpcRequest.getAmazonProvidedIpv6CidrBlock()));
        }

        if (createVpcRequest.getIpv6Pool() != null) {
            request.addParameter("Ipv6Pool", StringUtils.fromString(createVpcRequest.getIpv6Pool()));
        }

        if (createVpcRequest.getIpv6CidrBlock() != null) {
            request.addParameter("Ipv6CidrBlock", StringUtils.fromString(createVpcRequest.getIpv6CidrBlock()));
        }

        if (createVpcRequest.getInstanceTenancy() != null) {
            request.addParameter("InstanceTenancy", StringUtils.fromString(createVpcRequest.getInstanceTenancy()));
        }

        if (createVpcRequest.getIpv6CidrBlockNetworkBorderGroup() != null) {
            request.addParameter("Ipv6CidrBlockNetworkBorderGroup", StringUtils.fromString(createVpcRequest.getIpv6CidrBlockNetworkBorderGroup()));
        }

        com.amazonaws.internal.SdkInternalList<TagSpecification> createVpcRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) createVpcRequest
                .getTagSpecifications();
        if (!createVpcRequestTagSpecificationsList.isEmpty() || !createVpcRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification createVpcRequestTagSpecificationsListValue : createVpcRequestTagSpecificationsList) {

                if (createVpcRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(createVpcRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createVpcRequestTagSpecificationsListValue
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
