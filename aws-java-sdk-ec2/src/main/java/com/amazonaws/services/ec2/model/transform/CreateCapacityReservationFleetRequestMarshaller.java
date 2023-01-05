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
 * CreateCapacityReservationFleetRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCapacityReservationFleetRequestMarshaller implements
        Marshaller<Request<CreateCapacityReservationFleetRequest>, CreateCapacityReservationFleetRequest> {

    public Request<CreateCapacityReservationFleetRequest> marshall(CreateCapacityReservationFleetRequest createCapacityReservationFleetRequest) {

        if (createCapacityReservationFleetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateCapacityReservationFleetRequest> request = new DefaultRequest<CreateCapacityReservationFleetRequest>(
                createCapacityReservationFleetRequest, "AmazonEC2");
        request.addParameter("Action", "CreateCapacityReservationFleet");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createCapacityReservationFleetRequest.getAllocationStrategy() != null) {
            request.addParameter("AllocationStrategy", StringUtils.fromString(createCapacityReservationFleetRequest.getAllocationStrategy()));
        }

        request.addParameter("ClientToken", IdempotentUtils.resolveString(createCapacityReservationFleetRequest.getClientToken()));

        com.amazonaws.internal.SdkInternalList<ReservationFleetInstanceSpecification> createCapacityReservationFleetRequestInstanceTypeSpecificationsList = (com.amazonaws.internal.SdkInternalList<ReservationFleetInstanceSpecification>) createCapacityReservationFleetRequest
                .getInstanceTypeSpecifications();
        if (!createCapacityReservationFleetRequestInstanceTypeSpecificationsList.isEmpty()
                || !createCapacityReservationFleetRequestInstanceTypeSpecificationsList.isAutoConstruct()) {
            int instanceTypeSpecificationsListIndex = 1;

            for (ReservationFleetInstanceSpecification createCapacityReservationFleetRequestInstanceTypeSpecificationsListValue : createCapacityReservationFleetRequestInstanceTypeSpecificationsList) {

                if (createCapacityReservationFleetRequestInstanceTypeSpecificationsListValue.getInstanceType() != null) {
                    request.addParameter("InstanceTypeSpecification." + instanceTypeSpecificationsListIndex + ".InstanceType",
                            StringUtils.fromString(createCapacityReservationFleetRequestInstanceTypeSpecificationsListValue.getInstanceType()));
                }

                if (createCapacityReservationFleetRequestInstanceTypeSpecificationsListValue.getInstancePlatform() != null) {
                    request.addParameter("InstanceTypeSpecification." + instanceTypeSpecificationsListIndex + ".InstancePlatform",
                            StringUtils.fromString(createCapacityReservationFleetRequestInstanceTypeSpecificationsListValue.getInstancePlatform()));
                }

                if (createCapacityReservationFleetRequestInstanceTypeSpecificationsListValue.getWeight() != null) {
                    request.addParameter("InstanceTypeSpecification." + instanceTypeSpecificationsListIndex + ".Weight",
                            StringUtils.fromDouble(createCapacityReservationFleetRequestInstanceTypeSpecificationsListValue.getWeight()));
                }

                if (createCapacityReservationFleetRequestInstanceTypeSpecificationsListValue.getAvailabilityZone() != null) {
                    request.addParameter("InstanceTypeSpecification." + instanceTypeSpecificationsListIndex + ".AvailabilityZone",
                            StringUtils.fromString(createCapacityReservationFleetRequestInstanceTypeSpecificationsListValue.getAvailabilityZone()));
                }

                if (createCapacityReservationFleetRequestInstanceTypeSpecificationsListValue.getAvailabilityZoneId() != null) {
                    request.addParameter("InstanceTypeSpecification." + instanceTypeSpecificationsListIndex + ".AvailabilityZoneId",
                            StringUtils.fromString(createCapacityReservationFleetRequestInstanceTypeSpecificationsListValue.getAvailabilityZoneId()));
                }

                if (createCapacityReservationFleetRequestInstanceTypeSpecificationsListValue.getEbsOptimized() != null) {
                    request.addParameter("InstanceTypeSpecification." + instanceTypeSpecificationsListIndex + ".EbsOptimized",
                            StringUtils.fromBoolean(createCapacityReservationFleetRequestInstanceTypeSpecificationsListValue.getEbsOptimized()));
                }

                if (createCapacityReservationFleetRequestInstanceTypeSpecificationsListValue.getPriority() != null) {
                    request.addParameter("InstanceTypeSpecification." + instanceTypeSpecificationsListIndex + ".Priority",
                            StringUtils.fromInteger(createCapacityReservationFleetRequestInstanceTypeSpecificationsListValue.getPriority()));
                }
                instanceTypeSpecificationsListIndex++;
            }
        }

        if (createCapacityReservationFleetRequest.getTenancy() != null) {
            request.addParameter("Tenancy", StringUtils.fromString(createCapacityReservationFleetRequest.getTenancy()));
        }

        if (createCapacityReservationFleetRequest.getTotalTargetCapacity() != null) {
            request.addParameter("TotalTargetCapacity", StringUtils.fromInteger(createCapacityReservationFleetRequest.getTotalTargetCapacity()));
        }

        if (createCapacityReservationFleetRequest.getEndDate() != null) {
            request.addParameter("EndDate", StringUtils.fromDate(createCapacityReservationFleetRequest.getEndDate()));
        }

        if (createCapacityReservationFleetRequest.getInstanceMatchCriteria() != null) {
            request.addParameter("InstanceMatchCriteria", StringUtils.fromString(createCapacityReservationFleetRequest.getInstanceMatchCriteria()));
        }

        com.amazonaws.internal.SdkInternalList<TagSpecification> createCapacityReservationFleetRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) createCapacityReservationFleetRequest
                .getTagSpecifications();
        if (!createCapacityReservationFleetRequestTagSpecificationsList.isEmpty()
                || !createCapacityReservationFleetRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification createCapacityReservationFleetRequestTagSpecificationsListValue : createCapacityReservationFleetRequestTagSpecificationsList) {

                if (createCapacityReservationFleetRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(createCapacityReservationFleetRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createCapacityReservationFleetRequestTagSpecificationsListValue
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
