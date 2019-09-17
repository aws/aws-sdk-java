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
 * GetCapacityReservationUsageRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCapacityReservationUsageRequestMarshaller implements
        Marshaller<Request<GetCapacityReservationUsageRequest>, GetCapacityReservationUsageRequest> {

    public Request<GetCapacityReservationUsageRequest> marshall(GetCapacityReservationUsageRequest getCapacityReservationUsageRequest) {

        if (getCapacityReservationUsageRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetCapacityReservationUsageRequest> request = new DefaultRequest<GetCapacityReservationUsageRequest>(getCapacityReservationUsageRequest,
                "AmazonEC2");
        request.addParameter("Action", "GetCapacityReservationUsage");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (getCapacityReservationUsageRequest.getCapacityReservationId() != null) {
            request.addParameter("CapacityReservationId", StringUtils.fromString(getCapacityReservationUsageRequest.getCapacityReservationId()));
        }

        if (getCapacityReservationUsageRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(getCapacityReservationUsageRequest.getNextToken()));
        }

        if (getCapacityReservationUsageRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(getCapacityReservationUsageRequest.getMaxResults()));
        }

        return request;
    }

}
