/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * CreateFlowLogsRequest Marshaller
 */

public class CreateFlowLogsRequestMarshaller implements Marshaller<Request<CreateFlowLogsRequest>, CreateFlowLogsRequest> {

    public Request<CreateFlowLogsRequest> marshall(CreateFlowLogsRequest createFlowLogsRequest) {

        if (createFlowLogsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateFlowLogsRequest> request = new DefaultRequest<CreateFlowLogsRequest>(createFlowLogsRequest, "AmazonEC2");
        request.addParameter("Action", "CreateFlowLogs");
        request.addParameter("Version", "2016-09-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> createFlowLogsRequestResourceIdsList = (com.amazonaws.internal.SdkInternalList<String>) createFlowLogsRequest
                .getResourceIds();
        if (!createFlowLogsRequestResourceIdsList.isEmpty() || !createFlowLogsRequestResourceIdsList.isAutoConstruct()) {
            int resourceIdsListIndex = 1;

            for (String createFlowLogsRequestResourceIdsListValue : createFlowLogsRequestResourceIdsList) {
                if (createFlowLogsRequestResourceIdsListValue != null) {
                    request.addParameter("ResourceId." + resourceIdsListIndex, StringUtils.fromString(createFlowLogsRequestResourceIdsListValue));
                }
                resourceIdsListIndex++;
            }
        }

        if (createFlowLogsRequest.getResourceType() != null) {
            request.addParameter("ResourceType", StringUtils.fromString(createFlowLogsRequest.getResourceType()));
        }

        if (createFlowLogsRequest.getTrafficType() != null) {
            request.addParameter("TrafficType", StringUtils.fromString(createFlowLogsRequest.getTrafficType()));
        }

        if (createFlowLogsRequest.getLogGroupName() != null) {
            request.addParameter("LogGroupName", StringUtils.fromString(createFlowLogsRequest.getLogGroupName()));
        }

        if (createFlowLogsRequest.getDeliverLogsPermissionArn() != null) {
            request.addParameter("DeliverLogsPermissionArn", StringUtils.fromString(createFlowLogsRequest.getDeliverLogsPermissionArn()));
        }

        if (createFlowLogsRequest.getClientToken() != null) {
            request.addParameter("ClientToken", StringUtils.fromString(createFlowLogsRequest.getClientToken()));
        }

        return request;
    }

}
