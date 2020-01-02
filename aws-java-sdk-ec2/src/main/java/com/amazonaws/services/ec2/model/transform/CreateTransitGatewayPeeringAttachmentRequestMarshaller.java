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
 * CreateTransitGatewayPeeringAttachmentRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTransitGatewayPeeringAttachmentRequestMarshaller implements
        Marshaller<Request<CreateTransitGatewayPeeringAttachmentRequest>, CreateTransitGatewayPeeringAttachmentRequest> {

    public Request<CreateTransitGatewayPeeringAttachmentRequest> marshall(
            CreateTransitGatewayPeeringAttachmentRequest createTransitGatewayPeeringAttachmentRequest) {

        if (createTransitGatewayPeeringAttachmentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateTransitGatewayPeeringAttachmentRequest> request = new DefaultRequest<CreateTransitGatewayPeeringAttachmentRequest>(
                createTransitGatewayPeeringAttachmentRequest, "AmazonEC2");
        request.addParameter("Action", "CreateTransitGatewayPeeringAttachment");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createTransitGatewayPeeringAttachmentRequest.getTransitGatewayId() != null) {
            request.addParameter("TransitGatewayId", StringUtils.fromString(createTransitGatewayPeeringAttachmentRequest.getTransitGatewayId()));
        }

        if (createTransitGatewayPeeringAttachmentRequest.getPeerTransitGatewayId() != null) {
            request.addParameter("PeerTransitGatewayId", StringUtils.fromString(createTransitGatewayPeeringAttachmentRequest.getPeerTransitGatewayId()));
        }

        if (createTransitGatewayPeeringAttachmentRequest.getPeerAccountId() != null) {
            request.addParameter("PeerAccountId", StringUtils.fromString(createTransitGatewayPeeringAttachmentRequest.getPeerAccountId()));
        }

        if (createTransitGatewayPeeringAttachmentRequest.getPeerRegion() != null) {
            request.addParameter("PeerRegion", StringUtils.fromString(createTransitGatewayPeeringAttachmentRequest.getPeerRegion()));
        }

        com.amazonaws.internal.SdkInternalList<TagSpecification> createTransitGatewayPeeringAttachmentRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) createTransitGatewayPeeringAttachmentRequest
                .getTagSpecifications();
        if (!createTransitGatewayPeeringAttachmentRequestTagSpecificationsList.isEmpty()
                || !createTransitGatewayPeeringAttachmentRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification createTransitGatewayPeeringAttachmentRequestTagSpecificationsListValue : createTransitGatewayPeeringAttachmentRequestTagSpecificationsList) {

                if (createTransitGatewayPeeringAttachmentRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(createTransitGatewayPeeringAttachmentRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createTransitGatewayPeeringAttachmentRequestTagSpecificationsListValue
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
