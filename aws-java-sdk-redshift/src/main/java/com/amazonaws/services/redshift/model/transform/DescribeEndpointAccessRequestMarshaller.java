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
 * DescribeEndpointAccessRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEndpointAccessRequestMarshaller implements Marshaller<Request<DescribeEndpointAccessRequest>, DescribeEndpointAccessRequest> {

    public Request<DescribeEndpointAccessRequest> marshall(DescribeEndpointAccessRequest describeEndpointAccessRequest) {

        if (describeEndpointAccessRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeEndpointAccessRequest> request = new DefaultRequest<DescribeEndpointAccessRequest>(describeEndpointAccessRequest, "AmazonRedshift");
        request.addParameter("Action", "DescribeEndpointAccess");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeEndpointAccessRequest.getClusterIdentifier() != null) {
            request.addParameter("ClusterIdentifier", StringUtils.fromString(describeEndpointAccessRequest.getClusterIdentifier()));
        }

        if (describeEndpointAccessRequest.getResourceOwner() != null) {
            request.addParameter("ResourceOwner", StringUtils.fromString(describeEndpointAccessRequest.getResourceOwner()));
        }

        if (describeEndpointAccessRequest.getEndpointName() != null) {
            request.addParameter("EndpointName", StringUtils.fromString(describeEndpointAccessRequest.getEndpointName()));
        }

        if (describeEndpointAccessRequest.getVpcId() != null) {
            request.addParameter("VpcId", StringUtils.fromString(describeEndpointAccessRequest.getVpcId()));
        }

        if (describeEndpointAccessRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeEndpointAccessRequest.getMaxRecords()));
        }

        if (describeEndpointAccessRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeEndpointAccessRequest.getMarker()));
        }

        return request;
    }

}
