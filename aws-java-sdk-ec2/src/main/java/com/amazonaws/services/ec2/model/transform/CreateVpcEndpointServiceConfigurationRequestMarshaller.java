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

/**
 * CreateVpcEndpointServiceConfigurationRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVpcEndpointServiceConfigurationRequestMarshaller implements
        Marshaller<Request<CreateVpcEndpointServiceConfigurationRequest>, CreateVpcEndpointServiceConfigurationRequest> {

    public Request<CreateVpcEndpointServiceConfigurationRequest> marshall(
            CreateVpcEndpointServiceConfigurationRequest createVpcEndpointServiceConfigurationRequest) {

        if (createVpcEndpointServiceConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateVpcEndpointServiceConfigurationRequest> request = new DefaultRequest<CreateVpcEndpointServiceConfigurationRequest>(
                createVpcEndpointServiceConfigurationRequest, "AmazonEC2");
        request.addParameter("Action", "CreateVpcEndpointServiceConfiguration");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createVpcEndpointServiceConfigurationRequest.getAcceptanceRequired() != null) {
            request.addParameter("AcceptanceRequired", StringUtils.fromBoolean(createVpcEndpointServiceConfigurationRequest.getAcceptanceRequired()));
        }

        if (createVpcEndpointServiceConfigurationRequest.getPrivateDnsName() != null) {
            request.addParameter("PrivateDnsName", StringUtils.fromString(createVpcEndpointServiceConfigurationRequest.getPrivateDnsName()));
        }

        com.amazonaws.internal.SdkInternalList<String> createVpcEndpointServiceConfigurationRequestNetworkLoadBalancerArnsList = (com.amazonaws.internal.SdkInternalList<String>) createVpcEndpointServiceConfigurationRequest
                .getNetworkLoadBalancerArns();
        if (!createVpcEndpointServiceConfigurationRequestNetworkLoadBalancerArnsList.isEmpty()
                || !createVpcEndpointServiceConfigurationRequestNetworkLoadBalancerArnsList.isAutoConstruct()) {
            int networkLoadBalancerArnsListIndex = 1;

            for (String createVpcEndpointServiceConfigurationRequestNetworkLoadBalancerArnsListValue : createVpcEndpointServiceConfigurationRequestNetworkLoadBalancerArnsList) {
                if (createVpcEndpointServiceConfigurationRequestNetworkLoadBalancerArnsListValue != null) {
                    request.addParameter("NetworkLoadBalancerArn." + networkLoadBalancerArnsListIndex,
                            StringUtils.fromString(createVpcEndpointServiceConfigurationRequestNetworkLoadBalancerArnsListValue));
                }
                networkLoadBalancerArnsListIndex++;
            }
        }

        if (createVpcEndpointServiceConfigurationRequest.getClientToken() != null) {
            request.addParameter("ClientToken", StringUtils.fromString(createVpcEndpointServiceConfigurationRequest.getClientToken()));
        }

        com.amazonaws.internal.SdkInternalList<TagSpecification> createVpcEndpointServiceConfigurationRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) createVpcEndpointServiceConfigurationRequest
                .getTagSpecifications();
        if (!createVpcEndpointServiceConfigurationRequestTagSpecificationsList.isEmpty()
                || !createVpcEndpointServiceConfigurationRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification createVpcEndpointServiceConfigurationRequestTagSpecificationsListValue : createVpcEndpointServiceConfigurationRequestTagSpecificationsList) {

                if (createVpcEndpointServiceConfigurationRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(createVpcEndpointServiceConfigurationRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createVpcEndpointServiceConfigurationRequestTagSpecificationsListValue
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
