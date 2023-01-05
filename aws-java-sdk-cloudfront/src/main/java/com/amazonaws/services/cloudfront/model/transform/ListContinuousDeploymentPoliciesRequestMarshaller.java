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
package com.amazonaws.services.cloudfront.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.util.StringUtils;

/**
 * ListContinuousDeploymentPoliciesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListContinuousDeploymentPoliciesRequestMarshaller implements
        Marshaller<Request<ListContinuousDeploymentPoliciesRequest>, ListContinuousDeploymentPoliciesRequest> {

    public Request<ListContinuousDeploymentPoliciesRequest> marshall(ListContinuousDeploymentPoliciesRequest listContinuousDeploymentPoliciesRequest) {

        if (listContinuousDeploymentPoliciesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListContinuousDeploymentPoliciesRequest> request = new DefaultRequest<ListContinuousDeploymentPoliciesRequest>(
                listContinuousDeploymentPoliciesRequest, "AmazonCloudFront");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/2020-05-31/continuous-deployment-policy";

        request.setResourcePath(uriResourcePath);

        if (listContinuousDeploymentPoliciesRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(listContinuousDeploymentPoliciesRequest.getMarker()));
        }

        if (listContinuousDeploymentPoliciesRequest.getMaxItems() != null) {
            request.addParameter("MaxItems", StringUtils.fromString(listContinuousDeploymentPoliciesRequest.getMaxItems()));
        }

        return request;
    }

}
