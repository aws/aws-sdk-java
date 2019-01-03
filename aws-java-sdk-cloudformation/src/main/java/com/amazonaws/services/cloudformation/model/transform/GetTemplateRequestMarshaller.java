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
 * GetTemplateRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTemplateRequestMarshaller implements Marshaller<Request<GetTemplateRequest>, GetTemplateRequest> {

    public Request<GetTemplateRequest> marshall(GetTemplateRequest getTemplateRequest) {

        if (getTemplateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetTemplateRequest> request = new DefaultRequest<GetTemplateRequest>(getTemplateRequest, "AmazonCloudFormation");
        request.addParameter("Action", "GetTemplate");
        request.addParameter("Version", "2010-05-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (getTemplateRequest.getStackName() != null) {
            request.addParameter("StackName", StringUtils.fromString(getTemplateRequest.getStackName()));
        }

        if (getTemplateRequest.getChangeSetName() != null) {
            request.addParameter("ChangeSetName", StringUtils.fromString(getTemplateRequest.getChangeSetName()));
        }

        if (getTemplateRequest.getTemplateStage() != null) {
            request.addParameter("TemplateStage", StringUtils.fromString(getTemplateRequest.getTemplateStage()));
        }

        return request;
    }

}
