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
package com.amazonaws.services.autoscaling.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * PutScheduledUpdateGroupActionRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutScheduledUpdateGroupActionRequestMarshaller implements
        Marshaller<Request<PutScheduledUpdateGroupActionRequest>, PutScheduledUpdateGroupActionRequest> {

    public Request<PutScheduledUpdateGroupActionRequest> marshall(PutScheduledUpdateGroupActionRequest putScheduledUpdateGroupActionRequest) {

        if (putScheduledUpdateGroupActionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<PutScheduledUpdateGroupActionRequest> request = new DefaultRequest<PutScheduledUpdateGroupActionRequest>(putScheduledUpdateGroupActionRequest,
                "AmazonAutoScaling");
        request.addParameter("Action", "PutScheduledUpdateGroupAction");
        request.addParameter("Version", "2011-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (putScheduledUpdateGroupActionRequest.getAutoScalingGroupName() != null) {
            request.addParameter("AutoScalingGroupName", StringUtils.fromString(putScheduledUpdateGroupActionRequest.getAutoScalingGroupName()));
        }

        if (putScheduledUpdateGroupActionRequest.getScheduledActionName() != null) {
            request.addParameter("ScheduledActionName", StringUtils.fromString(putScheduledUpdateGroupActionRequest.getScheduledActionName()));
        }

        if (putScheduledUpdateGroupActionRequest.getTime() != null) {
            request.addParameter("Time", StringUtils.fromDate(putScheduledUpdateGroupActionRequest.getTime()));
        }

        if (putScheduledUpdateGroupActionRequest.getStartTime() != null) {
            request.addParameter("StartTime", StringUtils.fromDate(putScheduledUpdateGroupActionRequest.getStartTime()));
        }

        if (putScheduledUpdateGroupActionRequest.getEndTime() != null) {
            request.addParameter("EndTime", StringUtils.fromDate(putScheduledUpdateGroupActionRequest.getEndTime()));
        }

        if (putScheduledUpdateGroupActionRequest.getRecurrence() != null) {
            request.addParameter("Recurrence", StringUtils.fromString(putScheduledUpdateGroupActionRequest.getRecurrence()));
        }

        if (putScheduledUpdateGroupActionRequest.getMinSize() != null) {
            request.addParameter("MinSize", StringUtils.fromInteger(putScheduledUpdateGroupActionRequest.getMinSize()));
        }

        if (putScheduledUpdateGroupActionRequest.getMaxSize() != null) {
            request.addParameter("MaxSize", StringUtils.fromInteger(putScheduledUpdateGroupActionRequest.getMaxSize()));
        }

        if (putScheduledUpdateGroupActionRequest.getDesiredCapacity() != null) {
            request.addParameter("DesiredCapacity", StringUtils.fromInteger(putScheduledUpdateGroupActionRequest.getDesiredCapacity()));
        }

        return request;
    }

}
