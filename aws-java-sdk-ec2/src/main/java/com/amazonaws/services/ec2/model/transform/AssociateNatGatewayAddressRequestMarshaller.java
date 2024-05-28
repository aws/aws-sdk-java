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
 * AssociateNatGatewayAddressRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateNatGatewayAddressRequestMarshaller implements Marshaller<Request<AssociateNatGatewayAddressRequest>, AssociateNatGatewayAddressRequest> {

    public Request<AssociateNatGatewayAddressRequest> marshall(AssociateNatGatewayAddressRequest associateNatGatewayAddressRequest) {

        if (associateNatGatewayAddressRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AssociateNatGatewayAddressRequest> request = new DefaultRequest<AssociateNatGatewayAddressRequest>(associateNatGatewayAddressRequest,
                "AmazonEC2");
        request.addParameter("Action", "AssociateNatGatewayAddress");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (associateNatGatewayAddressRequest.getNatGatewayId() != null) {
            request.addParameter("NatGatewayId", StringUtils.fromString(associateNatGatewayAddressRequest.getNatGatewayId()));
        }

        com.amazonaws.internal.SdkInternalList<String> associateNatGatewayAddressRequestAllocationIdsList = (com.amazonaws.internal.SdkInternalList<String>) associateNatGatewayAddressRequest
                .getAllocationIds();
        if (!associateNatGatewayAddressRequestAllocationIdsList.isEmpty() || !associateNatGatewayAddressRequestAllocationIdsList.isAutoConstruct()) {
            int allocationIdsListIndex = 1;

            for (String associateNatGatewayAddressRequestAllocationIdsListValue : associateNatGatewayAddressRequestAllocationIdsList) {
                if (associateNatGatewayAddressRequestAllocationIdsListValue != null) {
                    request.addParameter("AllocationId." + allocationIdsListIndex,
                            StringUtils.fromString(associateNatGatewayAddressRequestAllocationIdsListValue));
                }
                allocationIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> associateNatGatewayAddressRequestPrivateIpAddressesList = (com.amazonaws.internal.SdkInternalList<String>) associateNatGatewayAddressRequest
                .getPrivateIpAddresses();
        if (!associateNatGatewayAddressRequestPrivateIpAddressesList.isEmpty() || !associateNatGatewayAddressRequestPrivateIpAddressesList.isAutoConstruct()) {
            int privateIpAddressesListIndex = 1;

            for (String associateNatGatewayAddressRequestPrivateIpAddressesListValue : associateNatGatewayAddressRequestPrivateIpAddressesList) {
                if (associateNatGatewayAddressRequestPrivateIpAddressesListValue != null) {
                    request.addParameter("PrivateIpAddress." + privateIpAddressesListIndex,
                            StringUtils.fromString(associateNatGatewayAddressRequestPrivateIpAddressesListValue));
                }
                privateIpAddressesListIndex++;
            }
        }

        return request;
    }

}
