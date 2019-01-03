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
 * CreateVpcEndpointConnectionNotificationRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVpcEndpointConnectionNotificationRequestMarshaller implements
        Marshaller<Request<CreateVpcEndpointConnectionNotificationRequest>, CreateVpcEndpointConnectionNotificationRequest> {

    public Request<CreateVpcEndpointConnectionNotificationRequest> marshall(
            CreateVpcEndpointConnectionNotificationRequest createVpcEndpointConnectionNotificationRequest) {

        if (createVpcEndpointConnectionNotificationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateVpcEndpointConnectionNotificationRequest> request = new DefaultRequest<CreateVpcEndpointConnectionNotificationRequest>(
                createVpcEndpointConnectionNotificationRequest, "AmazonEC2");
        request.addParameter("Action", "CreateVpcEndpointConnectionNotification");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createVpcEndpointConnectionNotificationRequest.getServiceId() != null) {
            request.addParameter("ServiceId", StringUtils.fromString(createVpcEndpointConnectionNotificationRequest.getServiceId()));
        }

        if (createVpcEndpointConnectionNotificationRequest.getVpcEndpointId() != null) {
            request.addParameter("VpcEndpointId", StringUtils.fromString(createVpcEndpointConnectionNotificationRequest.getVpcEndpointId()));
        }

        if (createVpcEndpointConnectionNotificationRequest.getConnectionNotificationArn() != null) {
            request.addParameter("ConnectionNotificationArn",
                    StringUtils.fromString(createVpcEndpointConnectionNotificationRequest.getConnectionNotificationArn()));
        }

        com.amazonaws.internal.SdkInternalList<String> createVpcEndpointConnectionNotificationRequestConnectionEventsList = (com.amazonaws.internal.SdkInternalList<String>) createVpcEndpointConnectionNotificationRequest
                .getConnectionEvents();
        if (!createVpcEndpointConnectionNotificationRequestConnectionEventsList.isEmpty()
                || !createVpcEndpointConnectionNotificationRequestConnectionEventsList.isAutoConstruct()) {
            int connectionEventsListIndex = 1;

            for (String createVpcEndpointConnectionNotificationRequestConnectionEventsListValue : createVpcEndpointConnectionNotificationRequestConnectionEventsList) {
                if (createVpcEndpointConnectionNotificationRequestConnectionEventsListValue != null) {
                    request.addParameter("ConnectionEvents." + connectionEventsListIndex,
                            StringUtils.fromString(createVpcEndpointConnectionNotificationRequestConnectionEventsListValue));
                }
                connectionEventsListIndex++;
            }
        }

        if (createVpcEndpointConnectionNotificationRequest.getClientToken() != null) {
            request.addParameter("ClientToken", StringUtils.fromString(createVpcEndpointConnectionNotificationRequest.getClientToken()));
        }

        return request;
    }

}
