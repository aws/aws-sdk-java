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
 * CreateCapacityReservationRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCapacityReservationRequestMarshaller implements Marshaller<Request<CreateCapacityReservationRequest>, CreateCapacityReservationRequest> {

    public Request<CreateCapacityReservationRequest> marshall(CreateCapacityReservationRequest createCapacityReservationRequest) {

        if (createCapacityReservationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateCapacityReservationRequest> request = new DefaultRequest<CreateCapacityReservationRequest>(createCapacityReservationRequest, "AmazonEC2");
        request.addParameter("Action", "CreateCapacityReservation");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createCapacityReservationRequest.getClientToken() != null) {
            request.addParameter("ClientToken", StringUtils.fromString(createCapacityReservationRequest.getClientToken()));
        }

        if (createCapacityReservationRequest.getInstanceType() != null) {
            request.addParameter("InstanceType", StringUtils.fromString(createCapacityReservationRequest.getInstanceType()));
        }

        if (createCapacityReservationRequest.getInstancePlatform() != null) {
            request.addParameter("InstancePlatform", StringUtils.fromString(createCapacityReservationRequest.getInstancePlatform()));
        }

        if (createCapacityReservationRequest.getAvailabilityZone() != null) {
            request.addParameter("AvailabilityZone", StringUtils.fromString(createCapacityReservationRequest.getAvailabilityZone()));
        }

        if (createCapacityReservationRequest.getTenancy() != null) {
            request.addParameter("Tenancy", StringUtils.fromString(createCapacityReservationRequest.getTenancy()));
        }

        if (createCapacityReservationRequest.getInstanceCount() != null) {
            request.addParameter("InstanceCount", StringUtils.fromInteger(createCapacityReservationRequest.getInstanceCount()));
        }

        if (createCapacityReservationRequest.getEbsOptimized() != null) {
            request.addParameter("EbsOptimized", StringUtils.fromBoolean(createCapacityReservationRequest.getEbsOptimized()));
        }

        if (createCapacityReservationRequest.getEphemeralStorage() != null) {
            request.addParameter("EphemeralStorage", StringUtils.fromBoolean(createCapacityReservationRequest.getEphemeralStorage()));
        }

        if (createCapacityReservationRequest.getEndDate() != null) {
            request.addParameter("EndDate", StringUtils.fromDate(createCapacityReservationRequest.getEndDate()));
        }

        if (createCapacityReservationRequest.getEndDateType() != null) {
            request.addParameter("EndDateType", StringUtils.fromString(createCapacityReservationRequest.getEndDateType()));
        }

        if (createCapacityReservationRequest.getInstanceMatchCriteria() != null) {
            request.addParameter("InstanceMatchCriteria", StringUtils.fromString(createCapacityReservationRequest.getInstanceMatchCriteria()));
        }

        com.amazonaws.internal.SdkInternalList<TagSpecification> createCapacityReservationRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) createCapacityReservationRequest
                .getTagSpecifications();
        if (!createCapacityReservationRequestTagSpecificationsList.isEmpty() || !createCapacityReservationRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification createCapacityReservationRequestTagSpecificationsListValue : createCapacityReservationRequestTagSpecificationsList) {

                if (createCapacityReservationRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecifications." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(createCapacityReservationRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createCapacityReservationRequestTagSpecificationsListValue
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
