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
 * ProvisionIpamByoasnRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionIpamByoasnRequestMarshaller implements Marshaller<Request<ProvisionIpamByoasnRequest>, ProvisionIpamByoasnRequest> {

    public Request<ProvisionIpamByoasnRequest> marshall(ProvisionIpamByoasnRequest provisionIpamByoasnRequest) {

        if (provisionIpamByoasnRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ProvisionIpamByoasnRequest> request = new DefaultRequest<ProvisionIpamByoasnRequest>(provisionIpamByoasnRequest, "AmazonEC2");
        request.addParameter("Action", "ProvisionIpamByoasn");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (provisionIpamByoasnRequest.getIpamId() != null) {
            request.addParameter("IpamId", StringUtils.fromString(provisionIpamByoasnRequest.getIpamId()));
        }

        if (provisionIpamByoasnRequest.getAsn() != null) {
            request.addParameter("Asn", StringUtils.fromString(provisionIpamByoasnRequest.getAsn()));
        }

        AsnAuthorizationContext asnAuthorizationContext = provisionIpamByoasnRequest.getAsnAuthorizationContext();
        if (asnAuthorizationContext != null) {

            if (asnAuthorizationContext.getMessage() != null) {
                request.addParameter("AsnAuthorizationContext.Message", StringUtils.fromString(asnAuthorizationContext.getMessage()));
            }

            if (asnAuthorizationContext.getSignature() != null) {
                request.addParameter("AsnAuthorizationContext.Signature", StringUtils.fromString(asnAuthorizationContext.getSignature()));
            }
        }

        return request;
    }

}
