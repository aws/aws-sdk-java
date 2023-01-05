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
 * CreateSubnetCidrReservationRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSubnetCidrReservationRequestMarshaller implements
        Marshaller<Request<CreateSubnetCidrReservationRequest>, CreateSubnetCidrReservationRequest> {

    public Request<CreateSubnetCidrReservationRequest> marshall(CreateSubnetCidrReservationRequest createSubnetCidrReservationRequest) {

        if (createSubnetCidrReservationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateSubnetCidrReservationRequest> request = new DefaultRequest<CreateSubnetCidrReservationRequest>(createSubnetCidrReservationRequest,
                "AmazonEC2");
        request.addParameter("Action", "CreateSubnetCidrReservation");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createSubnetCidrReservationRequest.getSubnetId() != null) {
            request.addParameter("SubnetId", StringUtils.fromString(createSubnetCidrReservationRequest.getSubnetId()));
        }

        if (createSubnetCidrReservationRequest.getCidr() != null) {
            request.addParameter("Cidr", StringUtils.fromString(createSubnetCidrReservationRequest.getCidr()));
        }

        if (createSubnetCidrReservationRequest.getReservationType() != null) {
            request.addParameter("ReservationType", StringUtils.fromString(createSubnetCidrReservationRequest.getReservationType()));
        }

        if (createSubnetCidrReservationRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createSubnetCidrReservationRequest.getDescription()));
        }

        com.amazonaws.internal.SdkInternalList<TagSpecification> createSubnetCidrReservationRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) createSubnetCidrReservationRequest
                .getTagSpecifications();
        if (!createSubnetCidrReservationRequestTagSpecificationsList.isEmpty() || !createSubnetCidrReservationRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification createSubnetCidrReservationRequestTagSpecificationsListValue : createSubnetCidrReservationRequestTagSpecificationsList) {

                if (createSubnetCidrReservationRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(createSubnetCidrReservationRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createSubnetCidrReservationRequestTagSpecificationsListValue
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
