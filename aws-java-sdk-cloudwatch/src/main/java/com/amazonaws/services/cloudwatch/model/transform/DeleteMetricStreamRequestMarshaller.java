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
package com.amazonaws.services.cloudwatch.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DeleteMetricStreamRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteMetricStreamRequestMarshaller implements Marshaller<Request<DeleteMetricStreamRequest>, DeleteMetricStreamRequest> {

    public Request<DeleteMetricStreamRequest> marshall(DeleteMetricStreamRequest deleteMetricStreamRequest) {

        if (deleteMetricStreamRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteMetricStreamRequest> request = new DefaultRequest<DeleteMetricStreamRequest>(deleteMetricStreamRequest, "AmazonCloudWatch");
        request.addParameter("Action", "DeleteMetricStream");
        request.addParameter("Version", "2010-08-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (deleteMetricStreamRequest.getName() != null) {
            request.addParameter("Name", StringUtils.fromString(deleteMetricStreamRequest.getName()));
        }

        return request;
    }

}
