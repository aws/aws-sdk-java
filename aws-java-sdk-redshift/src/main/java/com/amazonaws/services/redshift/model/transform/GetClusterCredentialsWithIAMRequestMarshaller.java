/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * GetClusterCredentialsWithIAMRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetClusterCredentialsWithIAMRequestMarshaller implements
        Marshaller<Request<GetClusterCredentialsWithIAMRequest>, GetClusterCredentialsWithIAMRequest> {

    public Request<GetClusterCredentialsWithIAMRequest> marshall(GetClusterCredentialsWithIAMRequest getClusterCredentialsWithIAMRequest) {

        if (getClusterCredentialsWithIAMRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetClusterCredentialsWithIAMRequest> request = new DefaultRequest<GetClusterCredentialsWithIAMRequest>(getClusterCredentialsWithIAMRequest,
                "AmazonRedshift");
        request.addParameter("Action", "GetClusterCredentialsWithIAM");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (getClusterCredentialsWithIAMRequest.getDbName() != null) {
            request.addParameter("DbName", StringUtils.fromString(getClusterCredentialsWithIAMRequest.getDbName()));
        }

        if (getClusterCredentialsWithIAMRequest.getClusterIdentifier() != null) {
            request.addParameter("ClusterIdentifier", StringUtils.fromString(getClusterCredentialsWithIAMRequest.getClusterIdentifier()));
        }

        if (getClusterCredentialsWithIAMRequest.getDurationSeconds() != null) {
            request.addParameter("DurationSeconds", StringUtils.fromInteger(getClusterCredentialsWithIAMRequest.getDurationSeconds()));
        }

        return request;
    }

}
