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
 * ResizeClusterRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResizeClusterRequestMarshaller implements Marshaller<Request<ResizeClusterRequest>, ResizeClusterRequest> {

    public Request<ResizeClusterRequest> marshall(ResizeClusterRequest resizeClusterRequest) {

        if (resizeClusterRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ResizeClusterRequest> request = new DefaultRequest<ResizeClusterRequest>(resizeClusterRequest, "AmazonRedshift");
        request.addParameter("Action", "ResizeCluster");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (resizeClusterRequest.getClusterIdentifier() != null) {
            request.addParameter("ClusterIdentifier", StringUtils.fromString(resizeClusterRequest.getClusterIdentifier()));
        }

        if (resizeClusterRequest.getClusterType() != null) {
            request.addParameter("ClusterType", StringUtils.fromString(resizeClusterRequest.getClusterType()));
        }

        if (resizeClusterRequest.getNodeType() != null) {
            request.addParameter("NodeType", StringUtils.fromString(resizeClusterRequest.getNodeType()));
        }

        if (resizeClusterRequest.getNumberOfNodes() != null) {
            request.addParameter("NumberOfNodes", StringUtils.fromInteger(resizeClusterRequest.getNumberOfNodes()));
        }

        if (resizeClusterRequest.getClassic() != null) {
            request.addParameter("Classic", StringUtils.fromBoolean(resizeClusterRequest.getClassic()));
        }

        return request;
    }

}
