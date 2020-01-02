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
package com.amazonaws.services.rds.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StopActivityStreamRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopActivityStreamRequestMarshaller implements Marshaller<Request<StopActivityStreamRequest>, StopActivityStreamRequest> {

    public Request<StopActivityStreamRequest> marshall(StopActivityStreamRequest stopActivityStreamRequest) {

        if (stopActivityStreamRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<StopActivityStreamRequest> request = new DefaultRequest<StopActivityStreamRequest>(stopActivityStreamRequest, "AmazonRDS");
        request.addParameter("Action", "StopActivityStream");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (stopActivityStreamRequest.getResourceArn() != null) {
            request.addParameter("ResourceArn", StringUtils.fromString(stopActivityStreamRequest.getResourceArn()));
        }

        if (stopActivityStreamRequest.getApplyImmediately() != null) {
            request.addParameter("ApplyImmediately", StringUtils.fromBoolean(stopActivityStreamRequest.getApplyImmediately()));
        }

        return request;
    }

}
