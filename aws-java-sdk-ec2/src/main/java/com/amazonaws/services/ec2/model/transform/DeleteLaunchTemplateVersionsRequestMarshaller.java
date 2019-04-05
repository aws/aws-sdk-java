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
 * DeleteLaunchTemplateVersionsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteLaunchTemplateVersionsRequestMarshaller implements
        Marshaller<Request<DeleteLaunchTemplateVersionsRequest>, DeleteLaunchTemplateVersionsRequest> {

    public Request<DeleteLaunchTemplateVersionsRequest> marshall(DeleteLaunchTemplateVersionsRequest deleteLaunchTemplateVersionsRequest) {

        if (deleteLaunchTemplateVersionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteLaunchTemplateVersionsRequest> request = new DefaultRequest<DeleteLaunchTemplateVersionsRequest>(deleteLaunchTemplateVersionsRequest,
                "AmazonEC2");
        request.addParameter("Action", "DeleteLaunchTemplateVersions");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (deleteLaunchTemplateVersionsRequest.getLaunchTemplateId() != null) {
            request.addParameter("LaunchTemplateId", StringUtils.fromString(deleteLaunchTemplateVersionsRequest.getLaunchTemplateId()));
        }

        if (deleteLaunchTemplateVersionsRequest.getLaunchTemplateName() != null) {
            request.addParameter("LaunchTemplateName", StringUtils.fromString(deleteLaunchTemplateVersionsRequest.getLaunchTemplateName()));
        }

        com.amazonaws.internal.SdkInternalList<String> deleteLaunchTemplateVersionsRequestVersionsList = (com.amazonaws.internal.SdkInternalList<String>) deleteLaunchTemplateVersionsRequest
                .getVersions();
        if (!deleteLaunchTemplateVersionsRequestVersionsList.isEmpty() || !deleteLaunchTemplateVersionsRequestVersionsList.isAutoConstruct()) {
            int versionsListIndex = 1;

            for (String deleteLaunchTemplateVersionsRequestVersionsListValue : deleteLaunchTemplateVersionsRequestVersionsList) {
                if (deleteLaunchTemplateVersionsRequestVersionsListValue != null) {
                    request.addParameter("LaunchTemplateVersion." + versionsListIndex,
                            StringUtils.fromString(deleteLaunchTemplateVersionsRequestVersionsListValue));
                }
                versionsListIndex++;
            }
        }

        return request;
    }

}
