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
package com.amazonaws.services.redshift.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeEndpointAuthorizationRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEndpointAuthorizationRequestMarshaller implements
        Marshaller<Request<DescribeEndpointAuthorizationRequest>, DescribeEndpointAuthorizationRequest> {

    public Request<DescribeEndpointAuthorizationRequest> marshall(DescribeEndpointAuthorizationRequest describeEndpointAuthorizationRequest) {

        if (describeEndpointAuthorizationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeEndpointAuthorizationRequest> request = new DefaultRequest<DescribeEndpointAuthorizationRequest>(describeEndpointAuthorizationRequest,
                "AmazonRedshift");
        request.addParameter("Action", "DescribeEndpointAuthorization");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeEndpointAuthorizationRequest.getClusterIdentifier() != null) {
            request.addParameter("ClusterIdentifier", StringUtils.fromString(describeEndpointAuthorizationRequest.getClusterIdentifier()));
        }

        if (describeEndpointAuthorizationRequest.getAccount() != null) {
            request.addParameter("Account", StringUtils.fromString(describeEndpointAuthorizationRequest.getAccount()));
        }

        if (describeEndpointAuthorizationRequest.getGrantee() != null) {
            request.addParameter("Grantee", StringUtils.fromBoolean(describeEndpointAuthorizationRequest.getGrantee()));
        }

        if (describeEndpointAuthorizationRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeEndpointAuthorizationRequest.getMaxRecords()));
        }

        if (describeEndpointAuthorizationRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeEndpointAuthorizationRequest.getMarker()));
        }

        return request;
    }

}
