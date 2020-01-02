/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DisassociateTransitGatewayMulticastDomainRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateTransitGatewayMulticastDomainRequestMarshaller implements
        Marshaller<Request<DisassociateTransitGatewayMulticastDomainRequest>, DisassociateTransitGatewayMulticastDomainRequest> {

    public Request<DisassociateTransitGatewayMulticastDomainRequest> marshall(
            DisassociateTransitGatewayMulticastDomainRequest disassociateTransitGatewayMulticastDomainRequest) {

        if (disassociateTransitGatewayMulticastDomainRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DisassociateTransitGatewayMulticastDomainRequest> request = new DefaultRequest<DisassociateTransitGatewayMulticastDomainRequest>(
                disassociateTransitGatewayMulticastDomainRequest, "AmazonEC2");
        request.addParameter("Action", "DisassociateTransitGatewayMulticastDomain");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (disassociateTransitGatewayMulticastDomainRequest.getTransitGatewayMulticastDomainId() != null) {
            request.addParameter("TransitGatewayMulticastDomainId",
                    StringUtils.fromString(disassociateTransitGatewayMulticastDomainRequest.getTransitGatewayMulticastDomainId()));
        }

        if (disassociateTransitGatewayMulticastDomainRequest.getTransitGatewayAttachmentId() != null) {
            request.addParameter("TransitGatewayAttachmentId",
                    StringUtils.fromString(disassociateTransitGatewayMulticastDomainRequest.getTransitGatewayAttachmentId()));
        }

        com.amazonaws.internal.SdkInternalList<String> disassociateTransitGatewayMulticastDomainRequestSubnetIdsList = (com.amazonaws.internal.SdkInternalList<String>) disassociateTransitGatewayMulticastDomainRequest
                .getSubnetIds();
        if (!disassociateTransitGatewayMulticastDomainRequestSubnetIdsList.isEmpty()
                || !disassociateTransitGatewayMulticastDomainRequestSubnetIdsList.isAutoConstruct()) {
            int subnetIdsListIndex = 1;

            for (String disassociateTransitGatewayMulticastDomainRequestSubnetIdsListValue : disassociateTransitGatewayMulticastDomainRequestSubnetIdsList) {
                if (disassociateTransitGatewayMulticastDomainRequestSubnetIdsListValue != null) {
                    request.addParameter("SubnetIds." + subnetIdsListIndex,
                            StringUtils.fromString(disassociateTransitGatewayMulticastDomainRequestSubnetIdsListValue));
                }
                subnetIdsListIndex++;
            }
        }

        return request;
    }

}
