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
package com.amazonaws.services.s3control.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.s3control.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.util.StringUtils;

/**
 * ListAccessGrantsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccessGrantsRequestMarshaller implements Marshaller<Request<ListAccessGrantsRequest>, ListAccessGrantsRequest> {

    public Request<ListAccessGrantsRequest> marshall(ListAccessGrantsRequest listAccessGrantsRequest) {

        if (listAccessGrantsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListAccessGrantsRequest> request = new DefaultRequest<ListAccessGrantsRequest>(listAccessGrantsRequest, "AWSS3Control");

        request.setHttpMethod(HttpMethodName.GET);

        if (listAccessGrantsRequest.getAccountId() != null) {
            request.addHeader("x-amz-account-id", StringUtils.fromString(listAccessGrantsRequest.getAccountId()));
        }

        String uriResourcePath = "/v20180820/accessgrantsinstance/grants";

        request.setResourcePath(uriResourcePath);

        if (listAccessGrantsRequest.getNextToken() != null) {
            request.addParameter("nextToken", StringUtils.fromString(listAccessGrantsRequest.getNextToken()));
        }

        if (listAccessGrantsRequest.getMaxResults() != null) {
            request.addParameter("maxResults", StringUtils.fromInteger(listAccessGrantsRequest.getMaxResults()));
        }

        if (listAccessGrantsRequest.getGranteeType() != null) {
            request.addParameter("granteetype", StringUtils.fromString(listAccessGrantsRequest.getGranteeType()));
        }

        if (listAccessGrantsRequest.getGranteeIdentifier() != null) {
            request.addParameter("granteeidentifier", StringUtils.fromString(listAccessGrantsRequest.getGranteeIdentifier()));
        }

        if (listAccessGrantsRequest.getPermission() != null) {
            request.addParameter("permission", StringUtils.fromString(listAccessGrantsRequest.getPermission()));
        }

        if (listAccessGrantsRequest.getGrantScope() != null) {
            request.addParameter("grantscope", StringUtils.fromString(listAccessGrantsRequest.getGrantScope()));
        }

        if (listAccessGrantsRequest.getApplicationArn() != null) {
            request.addParameter("application_arn", StringUtils.fromString(listAccessGrantsRequest.getApplicationArn()));
        }

        return request;
    }

}
