/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.util.IdempotentUtils;

/**
 * AllocateIpamPoolCidrRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AllocateIpamPoolCidrRequestMarshaller implements Marshaller<Request<AllocateIpamPoolCidrRequest>, AllocateIpamPoolCidrRequest> {

    public Request<AllocateIpamPoolCidrRequest> marshall(AllocateIpamPoolCidrRequest allocateIpamPoolCidrRequest) {

        if (allocateIpamPoolCidrRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AllocateIpamPoolCidrRequest> request = new DefaultRequest<AllocateIpamPoolCidrRequest>(allocateIpamPoolCidrRequest, "AmazonEC2");
        request.addParameter("Action", "AllocateIpamPoolCidr");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (allocateIpamPoolCidrRequest.getIpamPoolId() != null) {
            request.addParameter("IpamPoolId", StringUtils.fromString(allocateIpamPoolCidrRequest.getIpamPoolId()));
        }

        if (allocateIpamPoolCidrRequest.getCidr() != null) {
            request.addParameter("Cidr", StringUtils.fromString(allocateIpamPoolCidrRequest.getCidr()));
        }

        if (allocateIpamPoolCidrRequest.getNetmaskLength() != null) {
            request.addParameter("NetmaskLength", StringUtils.fromInteger(allocateIpamPoolCidrRequest.getNetmaskLength()));
        }

        request.addParameter("ClientToken", IdempotentUtils.resolveString(allocateIpamPoolCidrRequest.getClientToken()));

        if (allocateIpamPoolCidrRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(allocateIpamPoolCidrRequest.getDescription()));
        }

        if (allocateIpamPoolCidrRequest.getPreviewNextCidr() != null) {
            request.addParameter("PreviewNextCidr", StringUtils.fromBoolean(allocateIpamPoolCidrRequest.getPreviewNextCidr()));
        }

        com.amazonaws.internal.SdkInternalList<String> allocateIpamPoolCidrRequestDisallowedCidrsList = (com.amazonaws.internal.SdkInternalList<String>) allocateIpamPoolCidrRequest
                .getDisallowedCidrs();
        if (!allocateIpamPoolCidrRequestDisallowedCidrsList.isEmpty() || !allocateIpamPoolCidrRequestDisallowedCidrsList.isAutoConstruct()) {
            int disallowedCidrsListIndex = 1;

            for (String allocateIpamPoolCidrRequestDisallowedCidrsListValue : allocateIpamPoolCidrRequestDisallowedCidrsList) {
                if (allocateIpamPoolCidrRequestDisallowedCidrsListValue != null) {
                    request.addParameter("DisallowedCidr." + disallowedCidrsListIndex,
                            StringUtils.fromString(allocateIpamPoolCidrRequestDisallowedCidrsListValue));
                }
                disallowedCidrsListIndex++;
            }
        }

        return request;
    }

}
