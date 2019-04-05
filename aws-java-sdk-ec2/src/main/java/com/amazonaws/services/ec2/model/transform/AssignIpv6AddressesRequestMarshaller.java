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
 * AssignIpv6AddressesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssignIpv6AddressesRequestMarshaller implements Marshaller<Request<AssignIpv6AddressesRequest>, AssignIpv6AddressesRequest> {

    public Request<AssignIpv6AddressesRequest> marshall(AssignIpv6AddressesRequest assignIpv6AddressesRequest) {

        if (assignIpv6AddressesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AssignIpv6AddressesRequest> request = new DefaultRequest<AssignIpv6AddressesRequest>(assignIpv6AddressesRequest, "AmazonEC2");
        request.addParameter("Action", "AssignIpv6Addresses");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (assignIpv6AddressesRequest.getIpv6AddressCount() != null) {
            request.addParameter("Ipv6AddressCount", StringUtils.fromInteger(assignIpv6AddressesRequest.getIpv6AddressCount()));
        }

        com.amazonaws.internal.SdkInternalList<String> assignIpv6AddressesRequestIpv6AddressesList = (com.amazonaws.internal.SdkInternalList<String>) assignIpv6AddressesRequest
                .getIpv6Addresses();
        if (!assignIpv6AddressesRequestIpv6AddressesList.isEmpty() || !assignIpv6AddressesRequestIpv6AddressesList.isAutoConstruct()) {
            int ipv6AddressesListIndex = 1;

            for (String assignIpv6AddressesRequestIpv6AddressesListValue : assignIpv6AddressesRequestIpv6AddressesList) {
                if (assignIpv6AddressesRequestIpv6AddressesListValue != null) {
                    request.addParameter("Ipv6Addresses." + ipv6AddressesListIndex, StringUtils.fromString(assignIpv6AddressesRequestIpv6AddressesListValue));
                }
                ipv6AddressesListIndex++;
            }
        }

        if (assignIpv6AddressesRequest.getNetworkInterfaceId() != null) {
            request.addParameter("NetworkInterfaceId", StringUtils.fromString(assignIpv6AddressesRequest.getNetworkInterfaceId()));
        }

        return request;
    }

}
