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
 * CopyClusterSnapshotRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyClusterSnapshotRequestMarshaller implements Marshaller<Request<CopyClusterSnapshotRequest>, CopyClusterSnapshotRequest> {

    public Request<CopyClusterSnapshotRequest> marshall(CopyClusterSnapshotRequest copyClusterSnapshotRequest) {

        if (copyClusterSnapshotRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CopyClusterSnapshotRequest> request = new DefaultRequest<CopyClusterSnapshotRequest>(copyClusterSnapshotRequest, "AmazonRedshift");
        request.addParameter("Action", "CopyClusterSnapshot");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (copyClusterSnapshotRequest.getSourceSnapshotIdentifier() != null) {
            request.addParameter("SourceSnapshotIdentifier", StringUtils.fromString(copyClusterSnapshotRequest.getSourceSnapshotIdentifier()));
        }

        if (copyClusterSnapshotRequest.getSourceSnapshotClusterIdentifier() != null) {
            request.addParameter("SourceSnapshotClusterIdentifier", StringUtils.fromString(copyClusterSnapshotRequest.getSourceSnapshotClusterIdentifier()));
        }

        if (copyClusterSnapshotRequest.getTargetSnapshotIdentifier() != null) {
            request.addParameter("TargetSnapshotIdentifier", StringUtils.fromString(copyClusterSnapshotRequest.getTargetSnapshotIdentifier()));
        }

        if (copyClusterSnapshotRequest.getManualSnapshotRetentionPeriod() != null) {
            request.addParameter("ManualSnapshotRetentionPeriod", StringUtils.fromInteger(copyClusterSnapshotRequest.getManualSnapshotRetentionPeriod()));
        }

        return request;
    }

}
