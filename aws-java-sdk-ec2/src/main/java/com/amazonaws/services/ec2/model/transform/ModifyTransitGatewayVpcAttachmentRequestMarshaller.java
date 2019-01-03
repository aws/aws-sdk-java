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
 * ModifyTransitGatewayVpcAttachmentRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyTransitGatewayVpcAttachmentRequestMarshaller implements
        Marshaller<Request<ModifyTransitGatewayVpcAttachmentRequest>, ModifyTransitGatewayVpcAttachmentRequest> {

    public Request<ModifyTransitGatewayVpcAttachmentRequest> marshall(ModifyTransitGatewayVpcAttachmentRequest modifyTransitGatewayVpcAttachmentRequest) {

        if (modifyTransitGatewayVpcAttachmentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyTransitGatewayVpcAttachmentRequest> request = new DefaultRequest<ModifyTransitGatewayVpcAttachmentRequest>(
                modifyTransitGatewayVpcAttachmentRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyTransitGatewayVpcAttachment");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyTransitGatewayVpcAttachmentRequest.getTransitGatewayAttachmentId() != null) {
            request.addParameter("TransitGatewayAttachmentId", StringUtils.fromString(modifyTransitGatewayVpcAttachmentRequest.getTransitGatewayAttachmentId()));
        }

        com.amazonaws.internal.SdkInternalList<String> modifyTransitGatewayVpcAttachmentRequestAddSubnetIdsList = (com.amazonaws.internal.SdkInternalList<String>) modifyTransitGatewayVpcAttachmentRequest
                .getAddSubnetIds();
        if (!modifyTransitGatewayVpcAttachmentRequestAddSubnetIdsList.isEmpty() || !modifyTransitGatewayVpcAttachmentRequestAddSubnetIdsList.isAutoConstruct()) {
            int addSubnetIdsListIndex = 1;

            for (String modifyTransitGatewayVpcAttachmentRequestAddSubnetIdsListValue : modifyTransitGatewayVpcAttachmentRequestAddSubnetIdsList) {
                if (modifyTransitGatewayVpcAttachmentRequestAddSubnetIdsListValue != null) {
                    request.addParameter("AddSubnetIds." + addSubnetIdsListIndex,
                            StringUtils.fromString(modifyTransitGatewayVpcAttachmentRequestAddSubnetIdsListValue));
                }
                addSubnetIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> modifyTransitGatewayVpcAttachmentRequestRemoveSubnetIdsList = (com.amazonaws.internal.SdkInternalList<String>) modifyTransitGatewayVpcAttachmentRequest
                .getRemoveSubnetIds();
        if (!modifyTransitGatewayVpcAttachmentRequestRemoveSubnetIdsList.isEmpty()
                || !modifyTransitGatewayVpcAttachmentRequestRemoveSubnetIdsList.isAutoConstruct()) {
            int removeSubnetIdsListIndex = 1;

            for (String modifyTransitGatewayVpcAttachmentRequestRemoveSubnetIdsListValue : modifyTransitGatewayVpcAttachmentRequestRemoveSubnetIdsList) {
                if (modifyTransitGatewayVpcAttachmentRequestRemoveSubnetIdsListValue != null) {
                    request.addParameter("RemoveSubnetIds." + removeSubnetIdsListIndex,
                            StringUtils.fromString(modifyTransitGatewayVpcAttachmentRequestRemoveSubnetIdsListValue));
                }
                removeSubnetIdsListIndex++;
            }
        }

        ModifyTransitGatewayVpcAttachmentRequestOptions options = modifyTransitGatewayVpcAttachmentRequest.getOptions();
        if (options != null) {

            if (options.getDnsSupport() != null) {
                request.addParameter("Options.DnsSupport", StringUtils.fromString(options.getDnsSupport()));
            }

            if (options.getIpv6Support() != null) {
                request.addParameter("Options.Ipv6Support", StringUtils.fromString(options.getIpv6Support()));
            }
        }

        return request;
    }

}
