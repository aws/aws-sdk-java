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
 * AuthorizeSnapshotAccessRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthorizeSnapshotAccessRequestMarshaller implements Marshaller<Request<AuthorizeSnapshotAccessRequest>, AuthorizeSnapshotAccessRequest> {

    public Request<AuthorizeSnapshotAccessRequest> marshall(AuthorizeSnapshotAccessRequest authorizeSnapshotAccessRequest) {

        if (authorizeSnapshotAccessRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AuthorizeSnapshotAccessRequest> request = new DefaultRequest<AuthorizeSnapshotAccessRequest>(authorizeSnapshotAccessRequest, "AmazonRedshift");
        request.addParameter("Action", "AuthorizeSnapshotAccess");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (authorizeSnapshotAccessRequest.getSnapshotIdentifier() != null) {
            request.addParameter("SnapshotIdentifier", StringUtils.fromString(authorizeSnapshotAccessRequest.getSnapshotIdentifier()));
        }

        if (authorizeSnapshotAccessRequest.getSnapshotClusterIdentifier() != null) {
            request.addParameter("SnapshotClusterIdentifier", StringUtils.fromString(authorizeSnapshotAccessRequest.getSnapshotClusterIdentifier()));
        }

        if (authorizeSnapshotAccessRequest.getAccountWithRestoreAccess() != null) {
            request.addParameter("AccountWithRestoreAccess", StringUtils.fromString(authorizeSnapshotAccessRequest.getAccountWithRestoreAccess()));
        }

        return request;
    }

}
