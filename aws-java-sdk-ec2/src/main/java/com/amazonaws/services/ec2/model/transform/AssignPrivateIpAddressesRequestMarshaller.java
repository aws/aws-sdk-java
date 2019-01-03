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
 * AssignPrivateIpAddressesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssignPrivateIpAddressesRequestMarshaller implements Marshaller<Request<AssignPrivateIpAddressesRequest>, AssignPrivateIpAddressesRequest> {

    public Request<AssignPrivateIpAddressesRequest> marshall(AssignPrivateIpAddressesRequest assignPrivateIpAddressesRequest) {

        if (assignPrivateIpAddressesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AssignPrivateIpAddressesRequest> request = new DefaultRequest<AssignPrivateIpAddressesRequest>(assignPrivateIpAddressesRequest, "AmazonEC2");
        request.addParameter("Action", "AssignPrivateIpAddresses");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (assignPrivateIpAddressesRequest.getAllowReassignment() != null) {
            request.addParameter("AllowReassignment", StringUtils.fromBoolean(assignPrivateIpAddressesRequest.getAllowReassignment()));
        }

        if (assignPrivateIpAddressesRequest.getNetworkInterfaceId() != null) {
            request.addParameter("NetworkInterfaceId", StringUtils.fromString(assignPrivateIpAddressesRequest.getNetworkInterfaceId()));
        }

        com.amazonaws.internal.SdkInternalList<String> assignPrivateIpAddressesRequestPrivateIpAddressesList = (com.amazonaws.internal.SdkInternalList<String>) assignPrivateIpAddressesRequest
                .getPrivateIpAddresses();
        if (!assignPrivateIpAddressesRequestPrivateIpAddressesList.isEmpty() || !assignPrivateIpAddressesRequestPrivateIpAddressesList.isAutoConstruct()) {
            int privateIpAddressesListIndex = 1;

            for (String assignPrivateIpAddressesRequestPrivateIpAddressesListValue : assignPrivateIpAddressesRequestPrivateIpAddressesList) {
                if (assignPrivateIpAddressesRequestPrivateIpAddressesListValue != null) {
                    request.addParameter("PrivateIpAddress." + privateIpAddressesListIndex,
                            StringUtils.fromString(assignPrivateIpAddressesRequestPrivateIpAddressesListValue));
                }
                privateIpAddressesListIndex++;
            }
        }

        if (assignPrivateIpAddressesRequest.getSecondaryPrivateIpAddressCount() != null) {
            request.addParameter("SecondaryPrivateIpAddressCount", StringUtils.fromInteger(assignPrivateIpAddressesRequest.getSecondaryPrivateIpAddressCount()));
        }

        return request;
    }

}
