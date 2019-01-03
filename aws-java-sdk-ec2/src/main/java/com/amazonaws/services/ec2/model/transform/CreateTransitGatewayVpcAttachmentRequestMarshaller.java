/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * CreateTransitGatewayVpcAttachmentRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTransitGatewayVpcAttachmentRequestMarshaller implements
        Marshaller<Request<CreateTransitGatewayVpcAttachmentRequest>, CreateTransitGatewayVpcAttachmentRequest> {

    public Request<CreateTransitGatewayVpcAttachmentRequest> marshall(CreateTransitGatewayVpcAttachmentRequest createTransitGatewayVpcAttachmentRequest) {

        if (createTransitGatewayVpcAttachmentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateTransitGatewayVpcAttachmentRequest> request = new DefaultRequest<CreateTransitGatewayVpcAttachmentRequest>(
                createTransitGatewayVpcAttachmentRequest, "AmazonEC2");
        request.addParameter("Action", "CreateTransitGatewayVpcAttachment");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createTransitGatewayVpcAttachmentRequest.getTransitGatewayId() != null) {
            request.addParameter("TransitGatewayId", StringUtils.fromString(createTransitGatewayVpcAttachmentRequest.getTransitGatewayId()));
        }

        if (createTransitGatewayVpcAttachmentRequest.getVpcId() != null) {
            request.addParameter("VpcId", StringUtils.fromString(createTransitGatewayVpcAttachmentRequest.getVpcId()));
        }

        com.amazonaws.internal.SdkInternalList<String> createTransitGatewayVpcAttachmentRequestSubnetIdsList = (com.amazonaws.internal.SdkInternalList<String>) createTransitGatewayVpcAttachmentRequest
                .getSubnetIds();
        if (!createTransitGatewayVpcAttachmentRequestSubnetIdsList.isEmpty() || !createTransitGatewayVpcAttachmentRequestSubnetIdsList.isAutoConstruct()) {
            int subnetIdsListIndex = 1;

            for (String createTransitGatewayVpcAttachmentRequestSubnetIdsListValue : createTransitGatewayVpcAttachmentRequestSubnetIdsList) {
                if (createTransitGatewayVpcAttachmentRequestSubnetIdsListValue != null) {
                    request.addParameter("SubnetIds." + subnetIdsListIndex, StringUtils.fromString(createTransitGatewayVpcAttachmentRequestSubnetIdsListValue));
                }
                subnetIdsListIndex++;
            }
        }

        CreateTransitGatewayVpcAttachmentRequestOptions options = createTransitGatewayVpcAttachmentRequest.getOptions();
        if (options != null) {

            if (options.getDnsSupport() != null) {
                request.addParameter("Options.DnsSupport", StringUtils.fromString(options.getDnsSupport()));
            }

            if (options.getIpv6Support() != null) {
                request.addParameter("Options.Ipv6Support", StringUtils.fromString(options.getIpv6Support()));
            }
        }

        com.amazonaws.internal.SdkInternalList<TagSpecification> createTransitGatewayVpcAttachmentRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) createTransitGatewayVpcAttachmentRequest
                .getTagSpecifications();
        if (!createTransitGatewayVpcAttachmentRequestTagSpecificationsList.isEmpty()
                || !createTransitGatewayVpcAttachmentRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification createTransitGatewayVpcAttachmentRequestTagSpecificationsListValue : createTransitGatewayVpcAttachmentRequestTagSpecificationsList) {

                if (createTransitGatewayVpcAttachmentRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecifications." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(createTransitGatewayVpcAttachmentRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createTransitGatewayVpcAttachmentRequestTagSpecificationsListValue
                        .getTags();
                if (!tagSpecificationTagsList.isEmpty() || !tagSpecificationTagsList.isAutoConstruct()) {
                    int tagsListIndex = 1;

                    for (Tag tagSpecificationTagsListValue : tagSpecificationTagsList) {

                        if (tagSpecificationTagsListValue.getKey() != null) {
                            request.addParameter("TagSpecifications." + tagSpecificationsListIndex + ".Tag." + tagsListIndex + ".Key",
                                    StringUtils.fromString(tagSpecificationTagsListValue.getKey()));
                        }

                        if (tagSpecificationTagsListValue.getValue() != null) {
                            request.addParameter("TagSpecifications." + tagSpecificationsListIndex + ".Tag." + tagsListIndex + ".Value",
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
