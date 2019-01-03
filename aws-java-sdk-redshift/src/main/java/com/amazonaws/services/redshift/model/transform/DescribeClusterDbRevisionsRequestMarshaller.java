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
 * DescribeClusterDbRevisionsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeClusterDbRevisionsRequestMarshaller implements Marshaller<Request<DescribeClusterDbRevisionsRequest>, DescribeClusterDbRevisionsRequest> {

    public Request<DescribeClusterDbRevisionsRequest> marshall(DescribeClusterDbRevisionsRequest describeClusterDbRevisionsRequest) {

        if (describeClusterDbRevisionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeClusterDbRevisionsRequest> request = new DefaultRequest<DescribeClusterDbRevisionsRequest>(describeClusterDbRevisionsRequest,
                "AmazonRedshift");
        request.addParameter("Action", "DescribeClusterDbRevisions");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeClusterDbRevisionsRequest.getClusterIdentifier() != null) {
            request.addParameter("ClusterIdentifier", StringUtils.fromString(describeClusterDbRevisionsRequest.getClusterIdentifier()));
        }

        if (describeClusterDbRevisionsRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeClusterDbRevisionsRequest.getMaxRecords()));
        }

        if (describeClusterDbRevisionsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeClusterDbRevisionsRequest.getMarker()));
        }

        return request;
    }

}
