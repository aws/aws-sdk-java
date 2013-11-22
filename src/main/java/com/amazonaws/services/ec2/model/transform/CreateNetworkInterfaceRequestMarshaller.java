/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Create Network Interface Request Marshaller
 */
public class CreateNetworkInterfaceRequestMarshaller implements Marshaller<Request<CreateNetworkInterfaceRequest>, CreateNetworkInterfaceRequest> {

    public Request<CreateNetworkInterfaceRequest> marshall(CreateNetworkInterfaceRequest createNetworkInterfaceRequest) {

        if (createNetworkInterfaceRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<CreateNetworkInterfaceRequest> request = new DefaultRequest<CreateNetworkInterfaceRequest>(createNetworkInterfaceRequest, "AmazonEC2");
        request.addParameter("Action", "CreateNetworkInterface");
        request.addParameter("Version", "2013-10-15");

        if (createNetworkInterfaceRequest.getSubnetId() != null) {
            request.addParameter("SubnetId", StringUtils.fromString(createNetworkInterfaceRequest.getSubnetId()));
        }
        if (createNetworkInterfaceRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createNetworkInterfaceRequest.getDescription()));
        }
        if (createNetworkInterfaceRequest.getPrivateIpAddress() != null) {
            request.addParameter("PrivateIpAddress", StringUtils.fromString(createNetworkInterfaceRequest.getPrivateIpAddress()));
        }

        java.util.List<String> groupsList = createNetworkInterfaceRequest.getGroups();
        int groupsListIndex = 1;

        for (String groupsListValue : groupsList) {
            if (groupsListValue != null) {
                request.addParameter("SecurityGroupId." + groupsListIndex, StringUtils.fromString(groupsListValue));
            }

            groupsListIndex++;
        }

        java.util.List<PrivateIpAddressSpecification> privateIpAddressesList = createNetworkInterfaceRequest.getPrivateIpAddresses();
        int privateIpAddressesListIndex = 1;

        for (PrivateIpAddressSpecification privateIpAddressesListValue : privateIpAddressesList) {
            PrivateIpAddressSpecification privateIpAddressSpecificationMember = privateIpAddressesListValue;
            if (privateIpAddressSpecificationMember != null) {
                if (privateIpAddressSpecificationMember.getPrivateIpAddress() != null) {
                    request.addParameter("PrivateIpAddresses." + privateIpAddressesListIndex + ".PrivateIpAddress", StringUtils.fromString(privateIpAddressSpecificationMember.getPrivateIpAddress()));
                }
                if (privateIpAddressSpecificationMember.isPrimary() != null) {
                    request.addParameter("PrivateIpAddresses." + privateIpAddressesListIndex + ".Primary", StringUtils.fromBoolean(privateIpAddressSpecificationMember.isPrimary()));
                }
            }

            privateIpAddressesListIndex++;
        }
        if (createNetworkInterfaceRequest.getSecondaryPrivateIpAddressCount() != null) {
            request.addParameter("SecondaryPrivateIpAddressCount", StringUtils.fromInteger(createNetworkInterfaceRequest.getSecondaryPrivateIpAddressCount()));
        }


        return request;
    }
}
