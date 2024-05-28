/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * SwitchoverGlobalClusterRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SwitchoverGlobalClusterRequestMarshaller implements Marshaller<Request<SwitchoverGlobalClusterRequest>, SwitchoverGlobalClusterRequest> {

    public Request<SwitchoverGlobalClusterRequest> marshall(SwitchoverGlobalClusterRequest switchoverGlobalClusterRequest) {

        if (switchoverGlobalClusterRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SwitchoverGlobalClusterRequest> request = new DefaultRequest<SwitchoverGlobalClusterRequest>(switchoverGlobalClusterRequest, "AmazonRDS");
        request.addParameter("Action", "SwitchoverGlobalCluster");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (switchoverGlobalClusterRequest.getGlobalClusterIdentifier() != null) {
            request.addParameter("GlobalClusterIdentifier", StringUtils.fromString(switchoverGlobalClusterRequest.getGlobalClusterIdentifier()));
        }

        if (switchoverGlobalClusterRequest.getTargetDbClusterIdentifier() != null) {
            request.addParameter("TargetDbClusterIdentifier", StringUtils.fromString(switchoverGlobalClusterRequest.getTargetDbClusterIdentifier()));
        }

        return request;
    }

}
