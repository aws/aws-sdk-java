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
 * CreateTransitGatewayRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTransitGatewayRequestMarshaller implements Marshaller<Request<CreateTransitGatewayRequest>, CreateTransitGatewayRequest> {

    public Request<CreateTransitGatewayRequest> marshall(CreateTransitGatewayRequest createTransitGatewayRequest) {

        if (createTransitGatewayRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateTransitGatewayRequest> request = new DefaultRequest<CreateTransitGatewayRequest>(createTransitGatewayRequest, "AmazonEC2");
        request.addParameter("Action", "CreateTransitGateway");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createTransitGatewayRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createTransitGatewayRequest.getDescription()));
        }

        TransitGatewayRequestOptions options = createTransitGatewayRequest.getOptions();
        if (options != null) {

            if (options.getAmazonSideAsn() != null) {
                request.addParameter("Options.AmazonSideAsn", StringUtils.fromLong(options.getAmazonSideAsn()));
            }

            if (options.getAutoAcceptSharedAttachments() != null) {
                request.addParameter("Options.AutoAcceptSharedAttachments", StringUtils.fromString(options.getAutoAcceptSharedAttachments()));
            }

            if (options.getDefaultRouteTableAssociation() != null) {
                request.addParameter("Options.DefaultRouteTableAssociation", StringUtils.fromString(options.getDefaultRouteTableAssociation()));
            }

            if (options.getDefaultRouteTablePropagation() != null) {
                request.addParameter("Options.DefaultRouteTablePropagation", StringUtils.fromString(options.getDefaultRouteTablePropagation()));
            }

            if (options.getVpnEcmpSupport() != null) {
                request.addParameter("Options.VpnEcmpSupport", StringUtils.fromString(options.getVpnEcmpSupport()));
            }

            if (options.getDnsSupport() != null) {
                request.addParameter("Options.DnsSupport", StringUtils.fromString(options.getDnsSupport()));
            }
        }

        com.amazonaws.internal.SdkInternalList<TagSpecification> createTransitGatewayRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) createTransitGatewayRequest
                .getTagSpecifications();
        if (!createTransitGatewayRequestTagSpecificationsList.isEmpty() || !createTransitGatewayRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification createTransitGatewayRequestTagSpecificationsListValue : createTransitGatewayRequestTagSpecificationsList) {

                if (createTransitGatewayRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(createTransitGatewayRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createTransitGatewayRequestTagSpecificationsListValue
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
