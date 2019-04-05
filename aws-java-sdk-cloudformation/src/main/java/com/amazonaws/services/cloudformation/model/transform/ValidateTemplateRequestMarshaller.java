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
 * ValidateTemplateRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidateTemplateRequestMarshaller implements Marshaller<Request<ValidateTemplateRequest>, ValidateTemplateRequest> {

    public Request<ValidateTemplateRequest> marshall(ValidateTemplateRequest validateTemplateRequest) {

        if (validateTemplateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ValidateTemplateRequest> request = new DefaultRequest<ValidateTemplateRequest>(validateTemplateRequest, "AmazonCloudFormation");
        request.addParameter("Action", "ValidateTemplate");
        request.addParameter("Version", "2010-05-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (validateTemplateRequest.getTemplateBody() != null) {
            request.addParameter("TemplateBody", StringUtils.fromString(validateTemplateRequest.getTemplateBody()));
        }

        if (validateTemplateRequest.getTemplateURL() != null) {
            request.addParameter("TemplateURL", StringUtils.fromString(validateTemplateRequest.getTemplateURL()));
        }

        return request;
    }

}
