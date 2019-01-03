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
package com.amazonaws.services.elasticache.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeSnapshotsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSnapshotsRequestMarshaller implements Marshaller<Request<DescribeSnapshotsRequest>, DescribeSnapshotsRequest> {

    public Request<DescribeSnapshotsRequest> marshall(DescribeSnapshotsRequest describeSnapshotsRequest) {

        if (describeSnapshotsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeSnapshotsRequest> request = new DefaultRequest<DescribeSnapshotsRequest>(describeSnapshotsRequest, "AmazonElastiCache");
        request.addParameter("Action", "DescribeSnapshots");
        request.addParameter("Version", "2015-02-02");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeSnapshotsRequest.getReplicationGroupId() != null) {
            request.addParameter("ReplicationGroupId", StringUtils.fromString(describeSnapshotsRequest.getReplicationGroupId()));
        }

        if (describeSnapshotsRequest.getCacheClusterId() != null) {
            request.addParameter("CacheClusterId", StringUtils.fromString(describeSnapshotsRequest.getCacheClusterId()));
        }

        if (describeSnapshotsRequest.getSnapshotName() != null) {
            request.addParameter("SnapshotName", StringUtils.fromString(describeSnapshotsRequest.getSnapshotName()));
        }

        if (describeSnapshotsRequest.getSnapshotSource() != null) {
            request.addParameter("SnapshotSource", StringUtils.fromString(describeSnapshotsRequest.getSnapshotSource()));
        }

        if (describeSnapshotsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeSnapshotsRequest.getMarker()));
        }

        if (describeSnapshotsRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeSnapshotsRequest.getMaxRecords()));
        }

        if (describeSnapshotsRequest.getShowNodeGroupConfig() != null) {
            request.addParameter("ShowNodeGroupConfig", StringUtils.fromBoolean(describeSnapshotsRequest.getShowNodeGroupConfig()));
        }

        return request;
    }

}
