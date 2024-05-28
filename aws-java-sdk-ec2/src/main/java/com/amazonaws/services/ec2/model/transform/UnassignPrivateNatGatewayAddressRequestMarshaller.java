/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * UnassignPrivateNatGatewayAddressRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnassignPrivateNatGatewayAddressRequestMarshaller implements
        Marshaller<Request<UnassignPrivateNatGatewayAddressRequest>, UnassignPrivateNatGatewayAddressRequest> {

    public Request<UnassignPrivateNatGatewayAddressRequest> marshall(UnassignPrivateNatGatewayAddressRequest unassignPrivateNatGatewayAddressRequest) {

        if (unassignPrivateNatGatewayAddressRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UnassignPrivateNatGatewayAddressRequest> request = new DefaultRequest<UnassignPrivateNatGatewayAddressRequest>(
                unassignPrivateNatGatewayAddressRequest, "AmazonEC2");
        request.addParameter("Action", "UnassignPrivateNatGatewayAddress");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (unassignPrivateNatGatewayAddressRequest.getNatGatewayId() != null) {
            request.addParameter("NatGatewayId", StringUtils.fromString(unassignPrivateNatGatewayAddressRequest.getNatGatewayId()));
        }

        com.amazonaws.internal.SdkInternalList<String> unassignPrivateNatGatewayAddressRequestPrivateIpAddressesList = (com.amazonaws.internal.SdkInternalList<String>) unassignPrivateNatGatewayAddressRequest
                .getPrivateIpAddresses();
        if (!unassignPrivateNatGatewayAddressRequestPrivateIpAddressesList.isEmpty()
                || !unassignPrivateNatGatewayAddressRequestPrivateIpAddressesList.isAutoConstruct()) {
            int privateIpAddressesListIndex = 1;

            for (String unassignPrivateNatGatewayAddressRequestPrivateIpAddressesListValue : unassignPrivateNatGatewayAddressRequestPrivateIpAddressesList) {
                if (unassignPrivateNatGatewayAddressRequestPrivateIpAddressesListValue != null) {
                    request.addParameter("PrivateIpAddress." + privateIpAddressesListIndex,
                            StringUtils.fromString(unassignPrivateNatGatewayAddressRequestPrivateIpAddressesListValue));
                }
                privateIpAddressesListIndex++;
            }
        }

        if (unassignPrivateNatGatewayAddressRequest.getMaxDrainDurationSeconds() != null) {
            request.addParameter("MaxDrainDurationSeconds", StringUtils.fromInteger(unassignPrivateNatGatewayAddressRequest.getMaxDrainDurationSeconds()));
        }

        return request;
    }

}
