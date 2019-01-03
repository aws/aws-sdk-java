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
package com.amazonaws.services.elasticbeanstalk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ComposeEnvironmentsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComposeEnvironmentsRequestMarshaller implements Marshaller<Request<ComposeEnvironmentsRequest>, ComposeEnvironmentsRequest> {

    public Request<ComposeEnvironmentsRequest> marshall(ComposeEnvironmentsRequest composeEnvironmentsRequest) {

        if (composeEnvironmentsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ComposeEnvironmentsRequest> request = new DefaultRequest<ComposeEnvironmentsRequest>(composeEnvironmentsRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "ComposeEnvironments");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (composeEnvironmentsRequest.getApplicationName() != null) {
            request.addParameter("ApplicationName", StringUtils.fromString(composeEnvironmentsRequest.getApplicationName()));
        }

        if (composeEnvironmentsRequest.getGroupName() != null) {
            request.addParameter("GroupName", StringUtils.fromString(composeEnvironmentsRequest.getGroupName()));
        }

        if (!composeEnvironmentsRequest.getVersionLabels().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) composeEnvironmentsRequest.getVersionLabels()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> versionLabelsList = (com.amazonaws.internal.SdkInternalList<String>) composeEnvironmentsRequest
                    .getVersionLabels();
            int versionLabelsListIndex = 1;

            for (String versionLabelsListValue : versionLabelsList) {
                if (versionLabelsListValue != null) {
                    request.addParameter("VersionLabels.member." + versionLabelsListIndex, StringUtils.fromString(versionLabelsListValue));
                }
                versionLabelsListIndex++;
            }
        }

        return request;
    }

}
