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
 * DisassociateNatGatewayAddressRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateNatGatewayAddressRequestMarshaller implements
        Marshaller<Request<DisassociateNatGatewayAddressRequest>, DisassociateNatGatewayAddressRequest> {

    public Request<DisassociateNatGatewayAddressRequest> marshall(DisassociateNatGatewayAddressRequest disassociateNatGatewayAddressRequest) {

        if (disassociateNatGatewayAddressRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DisassociateNatGatewayAddressRequest> request = new DefaultRequest<DisassociateNatGatewayAddressRequest>(disassociateNatGatewayAddressRequest,
                "AmazonEC2");
        request.addParameter("Action", "DisassociateNatGatewayAddress");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (disassociateNatGatewayAddressRequest.getNatGatewayId() != null) {
            request.addParameter("NatGatewayId", StringUtils.fromString(disassociateNatGatewayAddressRequest.getNatGatewayId()));
        }

        com.amazonaws.internal.SdkInternalList<String> disassociateNatGatewayAddressRequestAssociationIdsList = (com.amazonaws.internal.SdkInternalList<String>) disassociateNatGatewayAddressRequest
                .getAssociationIds();
        if (!disassociateNatGatewayAddressRequestAssociationIdsList.isEmpty() || !disassociateNatGatewayAddressRequestAssociationIdsList.isAutoConstruct()) {
            int associationIdsListIndex = 1;

            for (String disassociateNatGatewayAddressRequestAssociationIdsListValue : disassociateNatGatewayAddressRequestAssociationIdsList) {
                if (disassociateNatGatewayAddressRequestAssociationIdsListValue != null) {
                    request.addParameter("AssociationId." + associationIdsListIndex,
                            StringUtils.fromString(disassociateNatGatewayAddressRequestAssociationIdsListValue));
                }
                associationIdsListIndex++;
            }
        }

        if (disassociateNatGatewayAddressRequest.getMaxDrainDurationSeconds() != null) {
            request.addParameter("MaxDrainDurationSeconds", StringUtils.fromInteger(disassociateNatGatewayAddressRequest.getMaxDrainDurationSeconds()));
        }

        return request;
    }

}
