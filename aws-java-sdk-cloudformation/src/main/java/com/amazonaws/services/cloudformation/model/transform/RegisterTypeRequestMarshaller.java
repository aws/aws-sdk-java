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
 * RegisterTypeRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterTypeRequestMarshaller implements Marshaller<Request<RegisterTypeRequest>, RegisterTypeRequest> {

    public Request<RegisterTypeRequest> marshall(RegisterTypeRequest registerTypeRequest) {

        if (registerTypeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RegisterTypeRequest> request = new DefaultRequest<RegisterTypeRequest>(registerTypeRequest, "AmazonCloudFormation");
        request.addParameter("Action", "RegisterType");
        request.addParameter("Version", "2010-05-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (registerTypeRequest.getType() != null) {
            request.addParameter("Type", StringUtils.fromString(registerTypeRequest.getType()));
        }

        if (registerTypeRequest.getTypeName() != null) {
            request.addParameter("TypeName", StringUtils.fromString(registerTypeRequest.getTypeName()));
        }

        if (registerTypeRequest.getSchemaHandlerPackage() != null) {
            request.addParameter("SchemaHandlerPackage", StringUtils.fromString(registerTypeRequest.getSchemaHandlerPackage()));
        }

        {
            LoggingConfig loggingConfig = registerTypeRequest.getLoggingConfig();
            if (loggingConfig != null) {

                if (loggingConfig.getLogRoleArn() != null) {
                    request.addParameter("LoggingConfig.LogRoleArn", StringUtils.fromString(loggingConfig.getLogRoleArn()));
                }

                if (loggingConfig.getLogGroupName() != null) {
                    request.addParameter("LoggingConfig.LogGroupName", StringUtils.fromString(loggingConfig.getLogGroupName()));
                }
            }
        }

        if (registerTypeRequest.getExecutionRoleArn() != null) {
            request.addParameter("ExecutionRoleArn", StringUtils.fromString(registerTypeRequest.getExecutionRoleArn()));
        }

        if (registerTypeRequest.getClientRequestToken() != null) {
            request.addParameter("ClientRequestToken", StringUtils.fromString(registerTypeRequest.getClientRequestToken()));
        }

        return request;
    }

}
