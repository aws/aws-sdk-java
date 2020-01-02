/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudformation.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ListTypeVersionsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTypeVersionsRequestMarshaller implements Marshaller<Request<ListTypeVersionsRequest>, ListTypeVersionsRequest> {

    public Request<ListTypeVersionsRequest> marshall(ListTypeVersionsRequest listTypeVersionsRequest) {

        if (listTypeVersionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListTypeVersionsRequest> request = new DefaultRequest<ListTypeVersionsRequest>(listTypeVersionsRequest, "AmazonCloudFormation");
        request.addParameter("Action", "ListTypeVersions");
        request.addParameter("Version", "2010-05-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (listTypeVersionsRequest.getType() != null) {
            request.addParameter("Type", StringUtils.fromString(listTypeVersionsRequest.getType()));
        }

        if (listTypeVersionsRequest.getTypeName() != null) {
            request.addParameter("TypeName", StringUtils.fromString(listTypeVersionsRequest.getTypeName()));
        }

        if (listTypeVersionsRequest.getArn() != null) {
            request.addParameter("Arn", StringUtils.fromString(listTypeVersionsRequest.getArn()));
        }

        if (listTypeVersionsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(listTypeVersionsRequest.getMaxResults()));
        }

        if (listTypeVersionsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(listTypeVersionsRequest.getNextToken()));
        }

        if (listTypeVersionsRequest.getDeprecatedStatus() != null) {
            request.addParameter("DeprecatedStatus", StringUtils.fromString(listTypeVersionsRequest.getDeprecatedStatus()));
        }

        return request;
    }

}
