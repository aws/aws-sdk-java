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
 * CreateNetworkInterfaceRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateNetworkInterfaceRequestMarshaller implements Marshaller<Request<CreateNetworkInterfaceRequest>, CreateNetworkInterfaceRequest> {

    public Request<CreateNetworkInterfaceRequest> marshall(CreateNetworkInterfaceRequest createNetworkInterfaceRequest) {

        if (createNetworkInterfaceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateNetworkInterfaceRequest> request = new DefaultRequest<CreateNetworkInterfaceRequest>(createNetworkInterfaceRequest, "AmazonEC2");
        request.addParameter("Action", "CreateNetworkInterface");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createNetworkInterfaceRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createNetworkInterfaceRequest.getDescription()));
        }

        com.amazonaws.internal.SdkInternalList<String> createNetworkInterfaceRequestGroupsList = (com.amazonaws.internal.SdkInternalList<String>) createNetworkInterfaceRequest
                .getGroups();
        if (!createNetworkInterfaceRequestGroupsList.isEmpty() || !createNetworkInterfaceRequestGroupsList.isAutoConstruct()) {
            int groupsListIndex = 1;

            for (String createNetworkInterfaceRequestGroupsListValue : createNetworkInterfaceRequestGroupsList) {
                if (createNetworkInterfaceRequestGroupsListValue != null) {
                    request.addParameter("SecurityGroupId." + groupsListIndex, StringUtils.fromString(createNetworkInterfaceRequestGroupsListValue));
                }
                groupsListIndex++;
            }
        }

        if (createNetworkInterfaceRequest.getIpv6AddressCount() != null) {
            request.addParameter("Ipv6AddressCount", StringUtils.fromInteger(createNetworkInterfaceRequest.getIpv6AddressCount()));
        }

        com.amazonaws.internal.SdkInternalList<InstanceIpv6Address> createNetworkInterfaceRequestIpv6AddressesList = (com.amazonaws.internal.SdkInternalList<InstanceIpv6Address>) createNetworkInterfaceRequest
                .getIpv6Addresses();
        if (!createNetworkInterfaceRequestIpv6AddressesList.isEmpty() || !createNetworkInterfaceRequestIpv6AddressesList.isAutoConstruct()) {
            int ipv6AddressesListIndex = 1;

            for (InstanceIpv6Address createNetworkInterfaceRequestIpv6AddressesListValue : createNetworkInterfaceRequestIpv6AddressesList) {

                if (createNetworkInterfaceRequestIpv6AddressesListValue.getIpv6Address() != null) {
                    request.addParameter("Ipv6Addresses." + ipv6AddressesListIndex + ".Ipv6Address",
                            StringUtils.fromString(createNetworkInterfaceRequestIpv6AddressesListValue.getIpv6Address()));
                }
                ipv6AddressesListIndex++;
            }
        }

        if (createNetworkInterfaceRequest.getPrivateIpAddress() != null) {
            request.addParameter("PrivateIpAddress", StringUtils.fromString(createNetworkInterfaceRequest.getPrivateIpAddress()));
        }

        com.amazonaws.internal.SdkInternalList<PrivateIpAddressSpecification> createNetworkInterfaceRequestPrivateIpAddressesList = (com.amazonaws.internal.SdkInternalList<PrivateIpAddressSpecification>) createNetworkInterfaceRequest
                .getPrivateIpAddresses();
        if (!createNetworkInterfaceRequestPrivateIpAddressesList.isEmpty() || !createNetworkInterfaceRequestPrivateIpAddressesList.isAutoConstruct()) {
            int privateIpAddressesListIndex = 1;

            for (PrivateIpAddressSpecification createNetworkInterfaceRequestPrivateIpAddressesListValue : createNetworkInterfaceRequestPrivateIpAddressesList) {

                if (createNetworkInterfaceRequestPrivateIpAddressesListValue.getPrimary() != null) {
                    request.addParameter("PrivateIpAddresses." + privateIpAddressesListIndex + ".Primary",
                            StringUtils.fromBoolean(createNetworkInterfaceRequestPrivateIpAddressesListValue.getPrimary()));
                }

                if (createNetworkInterfaceRequestPrivateIpAddressesListValue.getPrivateIpAddress() != null) {
                    request.addParameter("PrivateIpAddresses." + privateIpAddressesListIndex + ".PrivateIpAddress",
                            StringUtils.fromString(createNetworkInterfaceRequestPrivateIpAddressesListValue.getPrivateIpAddress()));
                }
                privateIpAddressesListIndex++;
            }
        }

        if (createNetworkInterfaceRequest.getSecondaryPrivateIpAddressCount() != null) {
            request.addParameter("SecondaryPrivateIpAddressCount", StringUtils.fromInteger(createNetworkInterfaceRequest.getSecondaryPrivateIpAddressCount()));
        }

        if (createNetworkInterfaceRequest.getSubnetId() != null) {
            request.addParameter("SubnetId", StringUtils.fromString(createNetworkInterfaceRequest.getSubnetId()));
        }

        return request;
    }

}
