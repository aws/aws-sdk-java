/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * AuthorizeEndpointAccessRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthorizeEndpointAccessRequestMarshaller implements Marshaller<Request<AuthorizeEndpointAccessRequest>, AuthorizeEndpointAccessRequest> {

    public Request<AuthorizeEndpointAccessRequest> marshall(AuthorizeEndpointAccessRequest authorizeEndpointAccessRequest) {

        if (authorizeEndpointAccessRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AuthorizeEndpointAccessRequest> request = new DefaultRequest<AuthorizeEndpointAccessRequest>(authorizeEndpointAccessRequest, "AmazonRedshift");
        request.addParameter("Action", "AuthorizeEndpointAccess");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (authorizeEndpointAccessRequest.getClusterIdentifier() != null) {
            request.addParameter("ClusterIdentifier", StringUtils.fromString(authorizeEndpointAccessRequest.getClusterIdentifier()));
        }

        if (authorizeEndpointAccessRequest.getAccount() != null) {
            request.addParameter("Account", StringUtils.fromString(authorizeEndpointAccessRequest.getAccount()));
        }

        if (!authorizeEndpointAccessRequest.getVpcIds().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) authorizeEndpointAccessRequest.getVpcIds()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> vpcIdsList = (com.amazonaws.internal.SdkInternalList<String>) authorizeEndpointAccessRequest
                    .getVpcIds();
            int vpcIdsListIndex = 1;

            for (String vpcIdsListValue : vpcIdsList) {
                if (vpcIdsListValue != null) {
                    request.addParameter("VpcIds.VpcIdentifier." + vpcIdsListIndex, StringUtils.fromString(vpcIdsListValue));
                }
                vpcIdsListIndex++;
            }
        }

        return request;
    }

}
