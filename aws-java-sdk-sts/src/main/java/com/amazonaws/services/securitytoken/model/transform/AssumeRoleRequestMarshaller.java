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
package com.amazonaws.services.securitytoken.model.transform;

import java.util.List;

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

        if (assumeRoleRequest.getPolicyArns() != null) {
            java.util.List<PolicyDescriptorType> policyArnsList = assumeRoleRequest.getPolicyArns();
            if (policyArnsList.isEmpty()) {
                request.addParameter("PolicyArns", "");
            } else {
                int policyArnsListIndex = 1;

                for (PolicyDescriptorType policyArnsListValue : policyArnsList) {

                    if (policyArnsListValue.getArn() != null) {
                        request.addParameter("PolicyArns.member." + policyArnsListIndex + ".arn", StringUtils.fromString(policyArnsListValue.getArn()));
                    }
                    policyArnsListIndex++;
                }
            }
        }

        if (assumeRoleRequest.getPolicy() != null) {
            request.addParameter("Policy", StringUtils.fromString(assumeRoleRequest.getPolicy()));
        }

        if (assumeRoleRequest.getDurationSeconds() != null) {
            request.addParameter("DurationSeconds", StringUtils.fromInteger(assumeRoleRequest.getDurationSeconds()));
        }

        if (assumeRoleRequest.getTags() != null) {
            java.util.List<Tag> tagsList = assumeRoleRequest.getTags();
            if (tagsList.isEmpty()) {
                request.addParameter("Tags", "");
            } else {
                int tagsListIndex = 1;

                for (Tag tagsListValue : tagsList) {

                    if (tagsListValue.getKey() != null) {
                        request.addParameter("Tags.member." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                    }

                    if (tagsListValue.getValue() != null) {
                        request.addParameter("Tags.member." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                    }
                    tagsListIndex++;
                }
            }
        }

        if (assumeRoleRequest.getTransitiveTagKeys() != null) {
            java.util.List<String> transitiveTagKeysList = assumeRoleRequest.getTransitiveTagKeys();
            if (transitiveTagKeysList.isEmpty()) {
                request.addParameter("TransitiveTagKeys", "");
            } else {
                int transitiveTagKeysListIndex = 1;

                for (String transitiveTagKeysListValue : transitiveTagKeysList) {
                    if (transitiveTagKeysListValue != null) {
                        request.addParameter("TransitiveTagKeys.member." + transitiveTagKeysListIndex, StringUtils.fromString(transitiveTagKeysListValue));
                    }
                    transitiveTagKeysListIndex++;
                }
            }
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
