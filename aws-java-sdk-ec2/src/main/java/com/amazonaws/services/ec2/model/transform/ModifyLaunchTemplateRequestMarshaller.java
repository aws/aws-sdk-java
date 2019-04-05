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
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ModifyLaunchTemplateRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyLaunchTemplateRequestMarshaller implements Marshaller<Request<ModifyLaunchTemplateRequest>, ModifyLaunchTemplateRequest> {

    public Request<ModifyLaunchTemplateRequest> marshall(ModifyLaunchTemplateRequest modifyLaunchTemplateRequest) {

        if (modifyLaunchTemplateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyLaunchTemplateRequest> request = new DefaultRequest<ModifyLaunchTemplateRequest>(modifyLaunchTemplateRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyLaunchTemplate");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyLaunchTemplateRequest.getClientToken() != null) {
            request.addParameter("ClientToken", StringUtils.fromString(modifyLaunchTemplateRequest.getClientToken()));
        }

        if (modifyLaunchTemplateRequest.getLaunchTemplateId() != null) {
            request.addParameter("LaunchTemplateId", StringUtils.fromString(modifyLaunchTemplateRequest.getLaunchTemplateId()));
        }

        if (modifyLaunchTemplateRequest.getLaunchTemplateName() != null) {
            request.addParameter("LaunchTemplateName", StringUtils.fromString(modifyLaunchTemplateRequest.getLaunchTemplateName()));
        }

        if (modifyLaunchTemplateRequest.getDefaultVersion() != null) {
            request.addParameter("SetDefaultVersion", StringUtils.fromString(modifyLaunchTemplateRequest.getDefaultVersion()));
        }

        return request;
    }

}
