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
 * ActivateTypeRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActivateTypeRequestMarshaller implements Marshaller<Request<ActivateTypeRequest>, ActivateTypeRequest> {

    public Request<ActivateTypeRequest> marshall(ActivateTypeRequest activateTypeRequest) {

        if (activateTypeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ActivateTypeRequest> request = new DefaultRequest<ActivateTypeRequest>(activateTypeRequest, "AmazonCloudFormation");
        request.addParameter("Action", "ActivateType");
        request.addParameter("Version", "2010-05-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (activateTypeRequest.getType() != null) {
            request.addParameter("Type", StringUtils.fromString(activateTypeRequest.getType()));
        }

        if (activateTypeRequest.getPublicTypeArn() != null) {
            request.addParameter("PublicTypeArn", StringUtils.fromString(activateTypeRequest.getPublicTypeArn()));
        }

        if (activateTypeRequest.getPublisherId() != null) {
            request.addParameter("PublisherId", StringUtils.fromString(activateTypeRequest.getPublisherId()));
        }

        if (activateTypeRequest.getTypeName() != null) {
            request.addParameter("TypeName", StringUtils.fromString(activateTypeRequest.getTypeName()));
        }

        if (activateTypeRequest.getTypeNameAlias() != null) {
            request.addParameter("TypeNameAlias", StringUtils.fromString(activateTypeRequest.getTypeNameAlias()));
        }

        if (activateTypeRequest.getAutoUpdate() != null) {
            request.addParameter("AutoUpdate", StringUtils.fromBoolean(activateTypeRequest.getAutoUpdate()));
        }

        {
            LoggingConfig loggingConfig = activateTypeRequest.getLoggingConfig();
            if (loggingConfig != null) {

                if (loggingConfig.getLogRoleArn() != null) {
                    request.addParameter("LoggingConfig.LogRoleArn", StringUtils.fromString(loggingConfig.getLogRoleArn()));
                }

                if (loggingConfig.getLogGroupName() != null) {
                    request.addParameter("LoggingConfig.LogGroupName", StringUtils.fromString(loggingConfig.getLogGroupName()));
                }
            }
        }

        if (activateTypeRequest.getExecutionRoleArn() != null) {
            request.addParameter("ExecutionRoleArn", StringUtils.fromString(activateTypeRequest.getExecutionRoleArn()));
        }

        if (activateTypeRequest.getVersionBump() != null) {
            request.addParameter("VersionBump", StringUtils.fromString(activateTypeRequest.getVersionBump()));
        }

        if (activateTypeRequest.getMajorVersion() != null) {
            request.addParameter("MajorVersion", StringUtils.fromLong(activateTypeRequest.getMajorVersion()));
        }

        return request;
    }

}
