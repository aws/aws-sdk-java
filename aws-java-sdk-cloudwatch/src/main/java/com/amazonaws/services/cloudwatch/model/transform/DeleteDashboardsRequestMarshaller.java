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
package com.amazonaws.services.cloudwatch.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DeleteDashboardsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDashboardsRequestMarshaller implements Marshaller<Request<DeleteDashboardsRequest>, DeleteDashboardsRequest> {

    public Request<DeleteDashboardsRequest> marshall(DeleteDashboardsRequest deleteDashboardsRequest) {

        if (deleteDashboardsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteDashboardsRequest> request = new DefaultRequest<DeleteDashboardsRequest>(deleteDashboardsRequest, "AmazonCloudWatch");
        request.addParameter("Action", "DeleteDashboards");
        request.addParameter("Version", "2010-08-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (!deleteDashboardsRequest.getDashboardNames().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) deleteDashboardsRequest.getDashboardNames()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> dashboardNamesList = (com.amazonaws.internal.SdkInternalList<String>) deleteDashboardsRequest
                    .getDashboardNames();
            int dashboardNamesListIndex = 1;

            for (String dashboardNamesListValue : dashboardNamesList) {
                if (dashboardNamesListValue != null) {
                    request.addParameter("DashboardNames.member." + dashboardNamesListIndex, StringUtils.fromString(dashboardNamesListValue));
                }
                dashboardNamesListIndex++;
            }
        }

        return request;
    }

}
