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
package com.amazonaws.services.route53.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.util.StringUtils;

/**
 * ListHostedZonesByVPCRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListHostedZonesByVPCRequestMarshaller implements Marshaller<Request<ListHostedZonesByVPCRequest>, ListHostedZonesByVPCRequest> {

    public Request<ListHostedZonesByVPCRequest> marshall(ListHostedZonesByVPCRequest listHostedZonesByVPCRequest) {

        if (listHostedZonesByVPCRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListHostedZonesByVPCRequest> request = new DefaultRequest<ListHostedZonesByVPCRequest>(listHostedZonesByVPCRequest, "AmazonRoute53");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/2013-04-01/hostedzonesbyvpc";

        request.setResourcePath(uriResourcePath);

        if (listHostedZonesByVPCRequest.getVPCId() != null) {
            request.addParameter("vpcid", StringUtils.fromString(listHostedZonesByVPCRequest.getVPCId()));
        }

        if (listHostedZonesByVPCRequest.getVPCRegion() != null) {
            request.addParameter("vpcregion", StringUtils.fromString(listHostedZonesByVPCRequest.getVPCRegion()));
        }

        if (listHostedZonesByVPCRequest.getMaxItems() != null) {
            request.addParameter("maxitems", StringUtils.fromString(listHostedZonesByVPCRequest.getMaxItems()));
        }

        if (listHostedZonesByVPCRequest.getNextToken() != null) {
            request.addParameter("nexttoken", StringUtils.fromString(listHostedZonesByVPCRequest.getNextToken()));
        }

        return request;
    }

}
