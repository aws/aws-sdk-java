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
 * GetClusterCredentialsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetClusterCredentialsRequestMarshaller implements Marshaller<Request<GetClusterCredentialsRequest>, GetClusterCredentialsRequest> {

    public Request<GetClusterCredentialsRequest> marshall(GetClusterCredentialsRequest getClusterCredentialsRequest) {

        if (getClusterCredentialsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetClusterCredentialsRequest> request = new DefaultRequest<GetClusterCredentialsRequest>(getClusterCredentialsRequest, "AmazonRedshift");
        request.addParameter("Action", "GetClusterCredentials");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (getClusterCredentialsRequest.getDbUser() != null) {
            request.addParameter("DbUser", StringUtils.fromString(getClusterCredentialsRequest.getDbUser()));
        }

        if (getClusterCredentialsRequest.getDbName() != null) {
            request.addParameter("DbName", StringUtils.fromString(getClusterCredentialsRequest.getDbName()));
        }

        if (getClusterCredentialsRequest.getClusterIdentifier() != null) {
            request.addParameter("ClusterIdentifier", StringUtils.fromString(getClusterCredentialsRequest.getClusterIdentifier()));
        }

        if (getClusterCredentialsRequest.getDurationSeconds() != null) {
            request.addParameter("DurationSeconds", StringUtils.fromInteger(getClusterCredentialsRequest.getDurationSeconds()));
        }

        if (getClusterCredentialsRequest.getAutoCreate() != null) {
            request.addParameter("AutoCreate", StringUtils.fromBoolean(getClusterCredentialsRequest.getAutoCreate()));
        }

        if (!getClusterCredentialsRequest.getDbGroups().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) getClusterCredentialsRequest.getDbGroups()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> dbGroupsList = (com.amazonaws.internal.SdkInternalList<String>) getClusterCredentialsRequest
                    .getDbGroups();
            int dbGroupsListIndex = 1;

            for (String dbGroupsListValue : dbGroupsList) {
                if (dbGroupsListValue != null) {
                    request.addParameter("DbGroups.DbGroup." + dbGroupsListIndex, StringUtils.fromString(dbGroupsListValue));
                }
                dbGroupsListIndex++;
            }
        }

        return request;
    }

}
