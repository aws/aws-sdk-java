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
 * DeleteCustomVerificationEmailTemplateRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteCustomVerificationEmailTemplateRequestMarshaller implements
        Marshaller<Request<DeleteCustomVerificationEmailTemplateRequest>, DeleteCustomVerificationEmailTemplateRequest> {

    public Request<DeleteCustomVerificationEmailTemplateRequest> marshall(
            DeleteCustomVerificationEmailTemplateRequest deleteCustomVerificationEmailTemplateRequest) {

        if (deleteCustomVerificationEmailTemplateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteCustomVerificationEmailTemplateRequest> request = new DefaultRequest<DeleteCustomVerificationEmailTemplateRequest>(
                deleteCustomVerificationEmailTemplateRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "DeleteCustomVerificationEmailTemplate");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (deleteCustomVerificationEmailTemplateRequest.getTemplateName() != null) {
            request.addParameter("TemplateName", StringUtils.fromString(deleteCustomVerificationEmailTemplateRequest.getTemplateName()));
        }

        return request;
    }

}
