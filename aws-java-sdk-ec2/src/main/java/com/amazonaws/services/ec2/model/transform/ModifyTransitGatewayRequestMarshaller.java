/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ModifyTransitGatewayRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyTransitGatewayRequestMarshaller implements Marshaller<Request<ModifyTransitGatewayRequest>, ModifyTransitGatewayRequest> {

    public Request<ModifyTransitGatewayRequest> marshall(ModifyTransitGatewayRequest modifyTransitGatewayRequest) {

        if (modifyTransitGatewayRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyTransitGatewayRequest> request = new DefaultRequest<ModifyTransitGatewayRequest>(modifyTransitGatewayRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyTransitGateway");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyTransitGatewayRequest.getTransitGatewayId() != null) {
            request.addParameter("TransitGatewayId", StringUtils.fromString(modifyTransitGatewayRequest.getTransitGatewayId()));
        }

        if (modifyTransitGatewayRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(modifyTransitGatewayRequest.getDescription()));
        }

        ModifyTransitGatewayOptions options = modifyTransitGatewayRequest.getOptions();
        if (options != null) {

            com.amazonaws.internal.SdkInternalList<String> modifyTransitGatewayOptionsAddTransitGatewayCidrBlocksList = (com.amazonaws.internal.SdkInternalList<String>) options
                    .getAddTransitGatewayCidrBlocks();
            if (!modifyTransitGatewayOptionsAddTransitGatewayCidrBlocksList.isEmpty()
                    || !modifyTransitGatewayOptionsAddTransitGatewayCidrBlocksList.isAutoConstruct()) {
                int addTransitGatewayCidrBlocksListIndex = 1;

                for (String modifyTransitGatewayOptionsAddTransitGatewayCidrBlocksListValue : modifyTransitGatewayOptionsAddTransitGatewayCidrBlocksList) {
                    if (modifyTransitGatewayOptionsAddTransitGatewayCidrBlocksListValue != null) {
                        request.addParameter("Options.AddTransitGatewayCidrBlocks." + addTransitGatewayCidrBlocksListIndex,
                                StringUtils.fromString(modifyTransitGatewayOptionsAddTransitGatewayCidrBlocksListValue));
                    }
                    addTransitGatewayCidrBlocksListIndex++;
                }
            }

            com.amazonaws.internal.SdkInternalList<String> modifyTransitGatewayOptionsRemoveTransitGatewayCidrBlocksList = (com.amazonaws.internal.SdkInternalList<String>) options
                    .getRemoveTransitGatewayCidrBlocks();
            if (!modifyTransitGatewayOptionsRemoveTransitGatewayCidrBlocksList.isEmpty()
                    || !modifyTransitGatewayOptionsRemoveTransitGatewayCidrBlocksList.isAutoConstruct()) {
                int removeTransitGatewayCidrBlocksListIndex = 1;

                for (String modifyTransitGatewayOptionsRemoveTransitGatewayCidrBlocksListValue : modifyTransitGatewayOptionsRemoveTransitGatewayCidrBlocksList) {
                    if (modifyTransitGatewayOptionsRemoveTransitGatewayCidrBlocksListValue != null) {
                        request.addParameter("Options.RemoveTransitGatewayCidrBlocks." + removeTransitGatewayCidrBlocksListIndex,
                                StringUtils.fromString(modifyTransitGatewayOptionsRemoveTransitGatewayCidrBlocksListValue));
                    }
                    removeTransitGatewayCidrBlocksListIndex++;
                }
            }

            if (options.getVpnEcmpSupport() != null) {
                request.addParameter("Options.VpnEcmpSupport", StringUtils.fromString(options.getVpnEcmpSupport()));
            }

            if (options.getDnsSupport() != null) {
                request.addParameter("Options.DnsSupport", StringUtils.fromString(options.getDnsSupport()));
            }

            if (options.getAutoAcceptSharedAttachments() != null) {
                request.addParameter("Options.AutoAcceptSharedAttachments", StringUtils.fromString(options.getAutoAcceptSharedAttachments()));
            }

            if (options.getDefaultRouteTableAssociation() != null) {
                request.addParameter("Options.DefaultRouteTableAssociation", StringUtils.fromString(options.getDefaultRouteTableAssociation()));
            }

            if (options.getAssociationDefaultRouteTableId() != null) {
                request.addParameter("Options.AssociationDefaultRouteTableId", StringUtils.fromString(options.getAssociationDefaultRouteTableId()));
            }

            if (options.getDefaultRouteTablePropagation() != null) {
                request.addParameter("Options.DefaultRouteTablePropagation", StringUtils.fromString(options.getDefaultRouteTablePropagation()));
            }

            if (options.getPropagationDefaultRouteTableId() != null) {
                request.addParameter("Options.PropagationDefaultRouteTableId", StringUtils.fromString(options.getPropagationDefaultRouteTableId()));
            }
        }

        return request;
    }

}
