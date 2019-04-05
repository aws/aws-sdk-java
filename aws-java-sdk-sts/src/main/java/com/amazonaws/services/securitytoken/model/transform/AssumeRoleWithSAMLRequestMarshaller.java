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
 * AssumeRoleWithSAMLRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssumeRoleWithSAMLRequestMarshaller implements Marshaller<Request<AssumeRoleWithSAMLRequest>, AssumeRoleWithSAMLRequest> {

    public Request<AssumeRoleWithSAMLRequest> marshall(AssumeRoleWithSAMLRequest assumeRoleWithSAMLRequest) {

        if (assumeRoleWithSAMLRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AssumeRoleWithSAMLRequest> request = new DefaultRequest<AssumeRoleWithSAMLRequest>(assumeRoleWithSAMLRequest, "AWSSecurityTokenService");
        request.addParameter("Action", "AssumeRoleWithSAML");
        request.addParameter("Version", "2011-06-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (assumeRoleWithSAMLRequest.getRoleArn() != null) {
            request.addParameter("RoleArn", StringUtils.fromString(assumeRoleWithSAMLRequest.getRoleArn()));
        }

        if (assumeRoleWithSAMLRequest.getPrincipalArn() != null) {
            request.addParameter("PrincipalArn", StringUtils.fromString(assumeRoleWithSAMLRequest.getPrincipalArn()));
        }

        if (assumeRoleWithSAMLRequest.getSAMLAssertion() != null) {
            request.addParameter("SAMLAssertion", StringUtils.fromString(assumeRoleWithSAMLRequest.getSAMLAssertion()));
        }

        if (assumeRoleWithSAMLRequest.getPolicy() != null) {
            request.addParameter("Policy", StringUtils.fromString(assumeRoleWithSAMLRequest.getPolicy()));
        }

        if (assumeRoleWithSAMLRequest.getDurationSeconds() != null) {
            request.addParameter("DurationSeconds", StringUtils.fromInteger(assumeRoleWithSAMLRequest.getDurationSeconds()));
        }

        return request;
    }

}
