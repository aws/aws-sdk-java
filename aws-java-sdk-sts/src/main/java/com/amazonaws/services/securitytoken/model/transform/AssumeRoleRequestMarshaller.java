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
package com.amazonaws.services.securitytoken.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.securitytoken.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * AssumeRoleRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssumeRoleRequestMarshaller implements Marshaller<Request<AssumeRoleRequest>, AssumeRoleRequest> {

    public Request<AssumeRoleRequest> marshall(AssumeRoleRequest assumeRoleRequest) {

        if (assumeRoleRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AssumeRoleRequest> request = new DefaultRequest<AssumeRoleRequest>(assumeRoleRequest, "AWSSecurityTokenService");
        request.addParameter("Action", "AssumeRole");
        request.addParameter("Version", "2011-06-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (assumeRoleRequest.getRoleArn() != null) {
            request.addParameter("RoleArn", StringUtils.fromString(assumeRoleRequest.getRoleArn()));
        }

        if (assumeRoleRequest.getRoleSessionName() != null) {
            request.addParameter("RoleSessionName", StringUtils.fromString(assumeRoleRequest.getRoleSessionName()));
        }

        if (assumeRoleRequest.getPolicy() != null) {
            request.addParameter("Policy", StringUtils.fromString(assumeRoleRequest.getPolicy()));
        }

        if (assumeRoleRequest.getDurationSeconds() != null) {
            request.addParameter("DurationSeconds", StringUtils.fromInteger(assumeRoleRequest.getDurationSeconds()));
        }

        if (assumeRoleRequest.getExternalId() != null) {
            request.addParameter("ExternalId", StringUtils.fromString(assumeRoleRequest.getExternalId()));
        }

        if (assumeRoleRequest.getSerialNumber() != null) {
            request.addParameter("SerialNumber", StringUtils.fromString(assumeRoleRequest.getSerialNumber()));
        }

        if (assumeRoleRequest.getTokenCode() != null) {
            request.addParameter("TokenCode", StringUtils.fromString(assumeRoleRequest.getTokenCode()));
        }

        return request;
    }

}
