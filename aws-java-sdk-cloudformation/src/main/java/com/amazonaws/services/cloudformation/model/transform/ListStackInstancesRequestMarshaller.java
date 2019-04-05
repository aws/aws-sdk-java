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
 * ListStackInstancesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStackInstancesRequestMarshaller implements Marshaller<Request<ListStackInstancesRequest>, ListStackInstancesRequest> {

    public Request<ListStackInstancesRequest> marshall(ListStackInstancesRequest listStackInstancesRequest) {

        if (listStackInstancesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListStackInstancesRequest> request = new DefaultRequest<ListStackInstancesRequest>(listStackInstancesRequest, "AmazonCloudFormation");
        request.addParameter("Action", "ListStackInstances");
        request.addParameter("Version", "2010-05-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (listStackInstancesRequest.getStackSetName() != null) {
            request.addParameter("StackSetName", StringUtils.fromString(listStackInstancesRequest.getStackSetName()));
        }

        if (listStackInstancesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(listStackInstancesRequest.getNextToken()));
        }

        if (listStackInstancesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(listStackInstancesRequest.getMaxResults()));
        }

        if (listStackInstancesRequest.getStackInstanceAccount() != null) {
            request.addParameter("StackInstanceAccount", StringUtils.fromString(listStackInstancesRequest.getStackInstanceAccount()));
        }

        if (listStackInstancesRequest.getStackInstanceRegion() != null) {
            request.addParameter("StackInstanceRegion", StringUtils.fromString(listStackInstancesRequest.getStackInstanceRegion()));
        }

        return request;
    }

}
