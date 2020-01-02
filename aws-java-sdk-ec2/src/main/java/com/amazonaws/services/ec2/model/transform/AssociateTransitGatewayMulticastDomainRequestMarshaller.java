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
 * AssociateTransitGatewayMulticastDomainRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateTransitGatewayMulticastDomainRequestMarshaller implements
        Marshaller<Request<AssociateTransitGatewayMulticastDomainRequest>, AssociateTransitGatewayMulticastDomainRequest> {

    public Request<AssociateTransitGatewayMulticastDomainRequest> marshall(
            AssociateTransitGatewayMulticastDomainRequest associateTransitGatewayMulticastDomainRequest) {

        if (associateTransitGatewayMulticastDomainRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AssociateTransitGatewayMulticastDomainRequest> request = new DefaultRequest<AssociateTransitGatewayMulticastDomainRequest>(
                associateTransitGatewayMulticastDomainRequest, "AmazonEC2");
        request.addParameter("Action", "AssociateTransitGatewayMulticastDomain");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (associateTransitGatewayMulticastDomainRequest.getTransitGatewayMulticastDomainId() != null) {
            request.addParameter("TransitGatewayMulticastDomainId",
                    StringUtils.fromString(associateTransitGatewayMulticastDomainRequest.getTransitGatewayMulticastDomainId()));
        }

        if (associateTransitGatewayMulticastDomainRequest.getTransitGatewayAttachmentId() != null) {
            request.addParameter("TransitGatewayAttachmentId",
                    StringUtils.fromString(associateTransitGatewayMulticastDomainRequest.getTransitGatewayAttachmentId()));
        }

        com.amazonaws.internal.SdkInternalList<String> associateTransitGatewayMulticastDomainRequestSubnetIdsList = (com.amazonaws.internal.SdkInternalList<String>) associateTransitGatewayMulticastDomainRequest
                .getSubnetIds();
        if (!associateTransitGatewayMulticastDomainRequestSubnetIdsList.isEmpty()
                || !associateTransitGatewayMulticastDomainRequestSubnetIdsList.isAutoConstruct()) {
            int subnetIdsListIndex = 1;

            for (String associateTransitGatewayMulticastDomainRequestSubnetIdsListValue : associateTransitGatewayMulticastDomainRequestSubnetIdsList) {
                if (associateTransitGatewayMulticastDomainRequestSubnetIdsListValue != null) {
                    request.addParameter("SubnetIds." + subnetIdsListIndex,
                            StringUtils.fromString(associateTransitGatewayMulticastDomainRequestSubnetIdsListValue));
                }
                subnetIdsListIndex++;
            }
        }

        return request;
    }

}
