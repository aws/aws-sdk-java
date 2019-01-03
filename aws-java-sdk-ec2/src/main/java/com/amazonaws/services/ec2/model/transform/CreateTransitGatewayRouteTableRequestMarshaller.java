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
 * CreateTransitGatewayRouteTableRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTransitGatewayRouteTableRequestMarshaller implements
        Marshaller<Request<CreateTransitGatewayRouteTableRequest>, CreateTransitGatewayRouteTableRequest> {

    public Request<CreateTransitGatewayRouteTableRequest> marshall(CreateTransitGatewayRouteTableRequest createTransitGatewayRouteTableRequest) {

        if (createTransitGatewayRouteTableRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateTransitGatewayRouteTableRequest> request = new DefaultRequest<CreateTransitGatewayRouteTableRequest>(
                createTransitGatewayRouteTableRequest, "AmazonEC2");
        request.addParameter("Action", "CreateTransitGatewayRouteTable");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createTransitGatewayRouteTableRequest.getTransitGatewayId() != null) {
            request.addParameter("TransitGatewayId", StringUtils.fromString(createTransitGatewayRouteTableRequest.getTransitGatewayId()));
        }

        com.amazonaws.internal.SdkInternalList<TagSpecification> createTransitGatewayRouteTableRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) createTransitGatewayRouteTableRequest
                .getTagSpecifications();
        if (!createTransitGatewayRouteTableRequestTagSpecificationsList.isEmpty()
                || !createTransitGatewayRouteTableRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification createTransitGatewayRouteTableRequestTagSpecificationsListValue : createTransitGatewayRouteTableRequestTagSpecificationsList) {

                if (createTransitGatewayRouteTableRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecifications." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(createTransitGatewayRouteTableRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createTransitGatewayRouteTableRequestTagSpecificationsListValue
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
