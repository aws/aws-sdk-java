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
 * ModifyInstanceCapacityReservationAttributesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyInstanceCapacityReservationAttributesRequestMarshaller implements
        Marshaller<Request<ModifyInstanceCapacityReservationAttributesRequest>, ModifyInstanceCapacityReservationAttributesRequest> {

    public Request<ModifyInstanceCapacityReservationAttributesRequest> marshall(
            ModifyInstanceCapacityReservationAttributesRequest modifyInstanceCapacityReservationAttributesRequest) {

        if (modifyInstanceCapacityReservationAttributesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyInstanceCapacityReservationAttributesRequest> request = new DefaultRequest<ModifyInstanceCapacityReservationAttributesRequest>(
                modifyInstanceCapacityReservationAttributesRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyInstanceCapacityReservationAttributes");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyInstanceCapacityReservationAttributesRequest.getInstanceId() != null) {
            request.addParameter("InstanceId", StringUtils.fromString(modifyInstanceCapacityReservationAttributesRequest.getInstanceId()));
        }

        CapacityReservationSpecification capacityReservationSpecification = modifyInstanceCapacityReservationAttributesRequest
                .getCapacityReservationSpecification();
        if (capacityReservationSpecification != null) {

            if (capacityReservationSpecification.getCapacityReservationPreference() != null) {
                request.addParameter("CapacityReservationSpecification.CapacityReservationPreference",
                        StringUtils.fromString(capacityReservationSpecification.getCapacityReservationPreference()));
            }

            CapacityReservationTarget capacityReservationTarget = capacityReservationSpecification.getCapacityReservationTarget();
            if (capacityReservationTarget != null) {

                if (capacityReservationTarget.getCapacityReservationId() != null) {
                    request.addParameter("CapacityReservationSpecification.CapacityReservationTarget.CapacityReservationId",
                            StringUtils.fromString(capacityReservationTarget.getCapacityReservationId()));
                }
            }
        }

        return request;
    }

}
