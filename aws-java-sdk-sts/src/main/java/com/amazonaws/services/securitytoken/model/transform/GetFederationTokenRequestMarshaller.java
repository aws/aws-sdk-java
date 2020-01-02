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
 * GetFederationTokenRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFederationTokenRequestMarshaller implements Marshaller<Request<GetFederationTokenRequest>, GetFederationTokenRequest> {

    public Request<GetFederationTokenRequest> marshall(GetFederationTokenRequest getFederationTokenRequest) {

        if (getFederationTokenRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetFederationTokenRequest> request = new DefaultRequest<GetFederationTokenRequest>(getFederationTokenRequest, "AWSSecurityTokenService");
        request.addParameter("Action", "GetFederationToken");
        request.addParameter("Version", "2011-06-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (getFederationTokenRequest.getName() != null) {
            request.addParameter("Name", StringUtils.fromString(getFederationTokenRequest.getName()));
        }

        if (getFederationTokenRequest.getPolicy() != null) {
            request.addParameter("Policy", StringUtils.fromString(getFederationTokenRequest.getPolicy()));
        }

        if (getFederationTokenRequest.getPolicyArns() != null) {
            java.util.List<PolicyDescriptorType> policyArnsList = getFederationTokenRequest.getPolicyArns();
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

        if (getFederationTokenRequest.getDurationSeconds() != null) {
            request.addParameter("DurationSeconds", StringUtils.fromInteger(getFederationTokenRequest.getDurationSeconds()));
        }

        if (getFederationTokenRequest.getTags() != null) {
            java.util.List<Tag> tagsList = getFederationTokenRequest.getTags();
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

        return request;
    }

}
