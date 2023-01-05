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
import com.amazonaws.util.IdempotentUtils;

/**
 * CreateVerifiedAccessEndpointRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVerifiedAccessEndpointRequestMarshaller implements
        Marshaller<Request<CreateVerifiedAccessEndpointRequest>, CreateVerifiedAccessEndpointRequest> {

    public Request<CreateVerifiedAccessEndpointRequest> marshall(CreateVerifiedAccessEndpointRequest createVerifiedAccessEndpointRequest) {

        if (createVerifiedAccessEndpointRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateVerifiedAccessEndpointRequest> request = new DefaultRequest<CreateVerifiedAccessEndpointRequest>(createVerifiedAccessEndpointRequest,
                "AmazonEC2");
        request.addParameter("Action", "CreateVerifiedAccessEndpoint");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createVerifiedAccessEndpointRequest.getVerifiedAccessGroupId() != null) {
            request.addParameter("VerifiedAccessGroupId", StringUtils.fromString(createVerifiedAccessEndpointRequest.getVerifiedAccessGroupId()));
        }

        if (createVerifiedAccessEndpointRequest.getEndpointType() != null) {
            request.addParameter("EndpointType", StringUtils.fromString(createVerifiedAccessEndpointRequest.getEndpointType()));
        }

        if (createVerifiedAccessEndpointRequest.getAttachmentType() != null) {
            request.addParameter("AttachmentType", StringUtils.fromString(createVerifiedAccessEndpointRequest.getAttachmentType()));
        }

        if (createVerifiedAccessEndpointRequest.getDomainCertificateArn() != null) {
            request.addParameter("DomainCertificateArn", StringUtils.fromString(createVerifiedAccessEndpointRequest.getDomainCertificateArn()));
        }

        if (createVerifiedAccessEndpointRequest.getApplicationDomain() != null) {
            request.addParameter("ApplicationDomain", StringUtils.fromString(createVerifiedAccessEndpointRequest.getApplicationDomain()));
        }

        if (createVerifiedAccessEndpointRequest.getEndpointDomainPrefix() != null) {
            request.addParameter("EndpointDomainPrefix", StringUtils.fromString(createVerifiedAccessEndpointRequest.getEndpointDomainPrefix()));
        }

        com.amazonaws.internal.SdkInternalList<String> createVerifiedAccessEndpointRequestSecurityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) createVerifiedAccessEndpointRequest
                .getSecurityGroupIds();
        if (!createVerifiedAccessEndpointRequestSecurityGroupIdsList.isEmpty() || !createVerifiedAccessEndpointRequestSecurityGroupIdsList.isAutoConstruct()) {
            int securityGroupIdsListIndex = 1;

            for (String createVerifiedAccessEndpointRequestSecurityGroupIdsListValue : createVerifiedAccessEndpointRequestSecurityGroupIdsList) {
                if (createVerifiedAccessEndpointRequestSecurityGroupIdsListValue != null) {
                    request.addParameter("SecurityGroupId." + securityGroupIdsListIndex,
                            StringUtils.fromString(createVerifiedAccessEndpointRequestSecurityGroupIdsListValue));
                }
                securityGroupIdsListIndex++;
            }
        }

        CreateVerifiedAccessEndpointLoadBalancerOptions loadBalancerOptions = createVerifiedAccessEndpointRequest.getLoadBalancerOptions();
        if (loadBalancerOptions != null) {

            if (loadBalancerOptions.getProtocol() != null) {
                request.addParameter("LoadBalancerOptions.Protocol", StringUtils.fromString(loadBalancerOptions.getProtocol()));
            }

            if (loadBalancerOptions.getPort() != null) {
                request.addParameter("LoadBalancerOptions.Port", StringUtils.fromInteger(loadBalancerOptions.getPort()));
            }

            if (loadBalancerOptions.getLoadBalancerArn() != null) {
                request.addParameter("LoadBalancerOptions.LoadBalancerArn", StringUtils.fromString(loadBalancerOptions.getLoadBalancerArn()));
            }

            com.amazonaws.internal.SdkInternalList<String> createVerifiedAccessEndpointLoadBalancerOptionsSubnetIdsList = (com.amazonaws.internal.SdkInternalList<String>) loadBalancerOptions
                    .getSubnetIds();
            if (!createVerifiedAccessEndpointLoadBalancerOptionsSubnetIdsList.isEmpty()
                    || !createVerifiedAccessEndpointLoadBalancerOptionsSubnetIdsList.isAutoConstruct()) {
                int subnetIdsListIndex = 1;

                for (String createVerifiedAccessEndpointLoadBalancerOptionsSubnetIdsListValue : createVerifiedAccessEndpointLoadBalancerOptionsSubnetIdsList) {
                    if (createVerifiedAccessEndpointLoadBalancerOptionsSubnetIdsListValue != null) {
                        request.addParameter("LoadBalancerOptions.SubnetId." + subnetIdsListIndex,
                                StringUtils.fromString(createVerifiedAccessEndpointLoadBalancerOptionsSubnetIdsListValue));
                    }
                    subnetIdsListIndex++;
                }
            }
        }

        CreateVerifiedAccessEndpointEniOptions networkInterfaceOptions = createVerifiedAccessEndpointRequest.getNetworkInterfaceOptions();
        if (networkInterfaceOptions != null) {

            if (networkInterfaceOptions.getNetworkInterfaceId() != null) {
                request.addParameter("NetworkInterfaceOptions.NetworkInterfaceId", StringUtils.fromString(networkInterfaceOptions.getNetworkInterfaceId()));
            }

            if (networkInterfaceOptions.getProtocol() != null) {
                request.addParameter("NetworkInterfaceOptions.Protocol", StringUtils.fromString(networkInterfaceOptions.getProtocol()));
            }

            if (networkInterfaceOptions.getPort() != null) {
                request.addParameter("NetworkInterfaceOptions.Port", StringUtils.fromInteger(networkInterfaceOptions.getPort()));
            }
        }

        if (createVerifiedAccessEndpointRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createVerifiedAccessEndpointRequest.getDescription()));
        }

        if (createVerifiedAccessEndpointRequest.getPolicyDocument() != null) {
            request.addParameter("PolicyDocument", StringUtils.fromString(createVerifiedAccessEndpointRequest.getPolicyDocument()));
        }

        com.amazonaws.internal.SdkInternalList<TagSpecification> createVerifiedAccessEndpointRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) createVerifiedAccessEndpointRequest
                .getTagSpecifications();
        if (!createVerifiedAccessEndpointRequestTagSpecificationsList.isEmpty() || !createVerifiedAccessEndpointRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification createVerifiedAccessEndpointRequestTagSpecificationsListValue : createVerifiedAccessEndpointRequestTagSpecificationsList) {

                if (createVerifiedAccessEndpointRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(createVerifiedAccessEndpointRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createVerifiedAccessEndpointRequestTagSpecificationsListValue
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

        request.addParameter("ClientToken", IdempotentUtils.resolveString(createVerifiedAccessEndpointRequest.getClientToken()));

        return request;
    }

}
