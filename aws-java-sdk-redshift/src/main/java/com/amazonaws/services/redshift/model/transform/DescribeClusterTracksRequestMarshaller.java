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
 * DescribeClusterTracksRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeClusterTracksRequestMarshaller implements Marshaller<Request<DescribeClusterTracksRequest>, DescribeClusterTracksRequest> {

    public Request<DescribeClusterTracksRequest> marshall(DescribeClusterTracksRequest describeClusterTracksRequest) {

        if (describeClusterTracksRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeClusterTracksRequest> request = new DefaultRequest<DescribeClusterTracksRequest>(describeClusterTracksRequest, "AmazonRedshift");
        request.addParameter("Action", "DescribeClusterTracks");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeClusterTracksRequest.getMaintenanceTrackName() != null) {
            request.addParameter("MaintenanceTrackName", StringUtils.fromString(describeClusterTracksRequest.getMaintenanceTrackName()));
        }

        if (describeClusterTracksRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeClusterTracksRequest.getMaxRecords()));
        }

        if (describeClusterTracksRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeClusterTracksRequest.getMarker()));
        }

        return request;
    }

}
