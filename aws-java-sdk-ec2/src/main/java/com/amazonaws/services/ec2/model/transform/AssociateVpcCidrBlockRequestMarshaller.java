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
 * AssociateVpcCidrBlockRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateVpcCidrBlockRequestMarshaller implements Marshaller<Request<AssociateVpcCidrBlockRequest>, AssociateVpcCidrBlockRequest> {

    public Request<AssociateVpcCidrBlockRequest> marshall(AssociateVpcCidrBlockRequest associateVpcCidrBlockRequest) {

        if (associateVpcCidrBlockRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AssociateVpcCidrBlockRequest> request = new DefaultRequest<AssociateVpcCidrBlockRequest>(associateVpcCidrBlockRequest, "AmazonEC2");
        request.addParameter("Action", "AssociateVpcCidrBlock");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (associateVpcCidrBlockRequest.getAmazonProvidedIpv6CidrBlock() != null) {
            request.addParameter("AmazonProvidedIpv6CidrBlock", StringUtils.fromBoolean(associateVpcCidrBlockRequest.getAmazonProvidedIpv6CidrBlock()));
        }

        if (associateVpcCidrBlockRequest.getCidrBlock() != null) {
            request.addParameter("CidrBlock", StringUtils.fromString(associateVpcCidrBlockRequest.getCidrBlock()));
        }

        if (associateVpcCidrBlockRequest.getVpcId() != null) {
            request.addParameter("VpcId", StringUtils.fromString(associateVpcCidrBlockRequest.getVpcId()));
        }

        return request;
    }

}
