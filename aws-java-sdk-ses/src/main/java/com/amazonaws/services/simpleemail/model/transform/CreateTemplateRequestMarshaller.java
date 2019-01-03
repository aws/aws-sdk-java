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
 * CreateTemplateRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTemplateRequestMarshaller implements Marshaller<Request<CreateTemplateRequest>, CreateTemplateRequest> {

    public Request<CreateTemplateRequest> marshall(CreateTemplateRequest createTemplateRequest) {

        if (createTemplateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateTemplateRequest> request = new DefaultRequest<CreateTemplateRequest>(createTemplateRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "CreateTemplate");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        {
            Template template = createTemplateRequest.getTemplate();
            if (template != null) {

                if (template.getTemplateName() != null) {
                    request.addParameter("Template.TemplateName", StringUtils.fromString(template.getTemplateName()));
                }

                if (template.getSubjectPart() != null) {
                    request.addParameter("Template.SubjectPart", StringUtils.fromString(template.getSubjectPart()));
                }

                if (template.getTextPart() != null) {
                    request.addParameter("Template.TextPart", StringUtils.fromString(template.getTextPart()));
                }

                if (template.getHtmlPart() != null) {
                    request.addParameter("Template.HtmlPart", StringUtils.fromString(template.getHtmlPart()));
                }
            }
        }

        return request;
    }

}
