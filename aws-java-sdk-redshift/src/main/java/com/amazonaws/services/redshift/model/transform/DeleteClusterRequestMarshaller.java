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
 * DeleteClusterRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteClusterRequestMarshaller implements Marshaller<Request<DeleteClusterRequest>, DeleteClusterRequest> {

    public Request<DeleteClusterRequest> marshall(DeleteClusterRequest deleteClusterRequest) {

        if (deleteClusterRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteClusterRequest> request = new DefaultRequest<DeleteClusterRequest>(deleteClusterRequest, "AmazonRedshift");
        request.addParameter("Action", "DeleteCluster");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (deleteClusterRequest.getClusterIdentifier() != null) {
            request.addParameter("ClusterIdentifier", StringUtils.fromString(deleteClusterRequest.getClusterIdentifier()));
        }

        if (deleteClusterRequest.getSkipFinalClusterSnapshot() != null) {
            request.addParameter("SkipFinalClusterSnapshot", StringUtils.fromBoolean(deleteClusterRequest.getSkipFinalClusterSnapshot()));
        }

        if (deleteClusterRequest.getFinalClusterSnapshotIdentifier() != null) {
            request.addParameter("FinalClusterSnapshotIdentifier", StringUtils.fromString(deleteClusterRequest.getFinalClusterSnapshotIdentifier()));
        }

        if (deleteClusterRequest.getFinalClusterSnapshotRetentionPeriod() != null) {
            request.addParameter("FinalClusterSnapshotRetentionPeriod", StringUtils.fromInteger(deleteClusterRequest.getFinalClusterSnapshotRetentionPeriod()));
        }

        return request;
    }

}
