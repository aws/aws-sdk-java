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
 * ListStackSetAutoDeploymentTargetsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStackSetAutoDeploymentTargetsRequestMarshaller implements
        Marshaller<Request<ListStackSetAutoDeploymentTargetsRequest>, ListStackSetAutoDeploymentTargetsRequest> {

    public Request<ListStackSetAutoDeploymentTargetsRequest> marshall(ListStackSetAutoDeploymentTargetsRequest listStackSetAutoDeploymentTargetsRequest) {

        if (listStackSetAutoDeploymentTargetsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListStackSetAutoDeploymentTargetsRequest> request = new DefaultRequest<ListStackSetAutoDeploymentTargetsRequest>(
                listStackSetAutoDeploymentTargetsRequest, "AmazonCloudFormation");
        request.addParameter("Action", "ListStackSetAutoDeploymentTargets");
        request.addParameter("Version", "2010-05-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (listStackSetAutoDeploymentTargetsRequest.getStackSetName() != null) {
            request.addParameter("StackSetName", StringUtils.fromString(listStackSetAutoDeploymentTargetsRequest.getStackSetName()));
        }

        if (listStackSetAutoDeploymentTargetsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(listStackSetAutoDeploymentTargetsRequest.getNextToken()));
        }

        if (listStackSetAutoDeploymentTargetsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(listStackSetAutoDeploymentTargetsRequest.getMaxResults()));
        }

        if (listStackSetAutoDeploymentTargetsRequest.getCallAs() != null) {
            request.addParameter("CallAs", StringUtils.fromString(listStackSetAutoDeploymentTargetsRequest.getCallAs()));
        }

        return request;
    }

}
