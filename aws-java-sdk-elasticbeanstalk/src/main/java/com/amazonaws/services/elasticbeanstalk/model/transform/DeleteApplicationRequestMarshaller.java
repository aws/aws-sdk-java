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
package com.amazonaws.services.elasticbeanstalk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DeleteApplicationRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteApplicationRequestMarshaller implements Marshaller<Request<DeleteApplicationRequest>, DeleteApplicationRequest> {

    public Request<DeleteApplicationRequest> marshall(DeleteApplicationRequest deleteApplicationRequest) {

        if (deleteApplicationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteApplicationRequest> request = new DefaultRequest<DeleteApplicationRequest>(deleteApplicationRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "DeleteApplication");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (deleteApplicationRequest.getApplicationName() != null) {
            request.addParameter("ApplicationName", StringUtils.fromString(deleteApplicationRequest.getApplicationName()));
        }

        if (deleteApplicationRequest.getTerminateEnvByForce() != null) {
            request.addParameter("TerminateEnvByForce", StringUtils.fromBoolean(deleteApplicationRequest.getTerminateEnvByForce()));
        }

        return request;
    }

}
