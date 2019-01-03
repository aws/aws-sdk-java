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
 * UnassignIpv6AddressesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnassignIpv6AddressesRequestMarshaller implements Marshaller<Request<UnassignIpv6AddressesRequest>, UnassignIpv6AddressesRequest> {

    public Request<UnassignIpv6AddressesRequest> marshall(UnassignIpv6AddressesRequest unassignIpv6AddressesRequest) {

        if (unassignIpv6AddressesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UnassignIpv6AddressesRequest> request = new DefaultRequest<UnassignIpv6AddressesRequest>(unassignIpv6AddressesRequest, "AmazonEC2");
        request.addParameter("Action", "UnassignIpv6Addresses");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> unassignIpv6AddressesRequestIpv6AddressesList = (com.amazonaws.internal.SdkInternalList<String>) unassignIpv6AddressesRequest
                .getIpv6Addresses();
        if (!unassignIpv6AddressesRequestIpv6AddressesList.isEmpty() || !unassignIpv6AddressesRequestIpv6AddressesList.isAutoConstruct()) {
            int ipv6AddressesListIndex = 1;

            for (String unassignIpv6AddressesRequestIpv6AddressesListValue : unassignIpv6AddressesRequestIpv6AddressesList) {
                if (unassignIpv6AddressesRequestIpv6AddressesListValue != null) {
                    request.addParameter("Ipv6Addresses." + ipv6AddressesListIndex, StringUtils.fromString(unassignIpv6AddressesRequestIpv6AddressesListValue));
                }
                ipv6AddressesListIndex++;
            }
        }

        if (unassignIpv6AddressesRequest.getNetworkInterfaceId() != null) {
            request.addParameter("NetworkInterfaceId", StringUtils.fromString(unassignIpv6AddressesRequest.getNetworkInterfaceId()));
        }

        return request;
    }

}
