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
 * ModifyCapacityReservationFleetRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyCapacityReservationFleetRequestMarshaller implements
        Marshaller<Request<ModifyCapacityReservationFleetRequest>, ModifyCapacityReservationFleetRequest> {

    public Request<ModifyCapacityReservationFleetRequest> marshall(ModifyCapacityReservationFleetRequest modifyCapacityReservationFleetRequest) {

        if (modifyCapacityReservationFleetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyCapacityReservationFleetRequest> request = new DefaultRequest<ModifyCapacityReservationFleetRequest>(
                modifyCapacityReservationFleetRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyCapacityReservationFleet");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyCapacityReservationFleetRequest.getCapacityReservationFleetId() != null) {
            request.addParameter("CapacityReservationFleetId", StringUtils.fromString(modifyCapacityReservationFleetRequest.getCapacityReservationFleetId()));
        }

        if (modifyCapacityReservationFleetRequest.getTotalTargetCapacity() != null) {
            request.addParameter("TotalTargetCapacity", StringUtils.fromInteger(modifyCapacityReservationFleetRequest.getTotalTargetCapacity()));
        }

        if (modifyCapacityReservationFleetRequest.getEndDate() != null) {
            request.addParameter("EndDate", StringUtils.fromDate(modifyCapacityReservationFleetRequest.getEndDate()));
        }

        if (modifyCapacityReservationFleetRequest.getRemoveEndDate() != null) {
            request.addParameter("RemoveEndDate", StringUtils.fromBoolean(modifyCapacityReservationFleetRequest.getRemoveEndDate()));
        }

        return request;
    }

}
