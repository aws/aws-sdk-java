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
package com.amazonaws.services.simpleemail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CreateCustomVerificationEmailTemplateRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCustomVerificationEmailTemplateRequestMarshaller implements
        Marshaller<Request<CreateCustomVerificationEmailTemplateRequest>, CreateCustomVerificationEmailTemplateRequest> {

    public Request<CreateCustomVerificationEmailTemplateRequest> marshall(
            CreateCustomVerificationEmailTemplateRequest createCustomVerificationEmailTemplateRequest) {

        if (createCustomVerificationEmailTemplateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateCustomVerificationEmailTemplateRequest> request = new DefaultRequest<CreateCustomVerificationEmailTemplateRequest>(
                createCustomVerificationEmailTemplateRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "CreateCustomVerificationEmailTemplate");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (createCustomVerificationEmailTemplateRequest.getTemplateName() != null) {
            request.addParameter("TemplateName", StringUtils.fromString(createCustomVerificationEmailTemplateRequest.getTemplateName()));
        }

        if (createCustomVerificationEmailTemplateRequest.getFromEmailAddress() != null) {
            request.addParameter("FromEmailAddress", StringUtils.fromString(createCustomVerificationEmailTemplateRequest.getFromEmailAddress()));
        }

        if (createCustomVerificationEmailTemplateRequest.getTemplateSubject() != null) {
            request.addParameter("TemplateSubject", StringUtils.fromString(createCustomVerificationEmailTemplateRequest.getTemplateSubject()));
        }

        if (createCustomVerificationEmailTemplateRequest.getTemplateContent() != null) {
            request.addParameter("TemplateContent", StringUtils.fromString(createCustomVerificationEmailTemplateRequest.getTemplateContent()));
        }

        if (createCustomVerificationEmailTemplateRequest.getSuccessRedirectionURL() != null) {
            request.addParameter("SuccessRedirectionURL", StringUtils.fromString(createCustomVerificationEmailTemplateRequest.getSuccessRedirectionURL()));
        }

        if (createCustomVerificationEmailTemplateRequest.getFailureRedirectionURL() != null) {
            request.addParameter("FailureRedirectionURL", StringUtils.fromString(createCustomVerificationEmailTemplateRequest.getFailureRedirectionURL()));
        }

        return request;
    }

}
