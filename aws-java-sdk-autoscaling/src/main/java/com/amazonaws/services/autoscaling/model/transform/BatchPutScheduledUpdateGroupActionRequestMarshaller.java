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
 * BatchPutScheduledUpdateGroupActionRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchPutScheduledUpdateGroupActionRequestMarshaller implements
        Marshaller<Request<BatchPutScheduledUpdateGroupActionRequest>, BatchPutScheduledUpdateGroupActionRequest> {

    public Request<BatchPutScheduledUpdateGroupActionRequest> marshall(BatchPutScheduledUpdateGroupActionRequest batchPutScheduledUpdateGroupActionRequest) {

        if (batchPutScheduledUpdateGroupActionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<BatchPutScheduledUpdateGroupActionRequest> request = new DefaultRequest<BatchPutScheduledUpdateGroupActionRequest>(
                batchPutScheduledUpdateGroupActionRequest, "AmazonAutoScaling");
        request.addParameter("Action", "BatchPutScheduledUpdateGroupAction");
        request.addParameter("Version", "2011-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (batchPutScheduledUpdateGroupActionRequest.getAutoScalingGroupName() != null) {
            request.addParameter("AutoScalingGroupName", StringUtils.fromString(batchPutScheduledUpdateGroupActionRequest.getAutoScalingGroupName()));
        }

        if (!batchPutScheduledUpdateGroupActionRequest.getScheduledUpdateGroupActions().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<ScheduledUpdateGroupActionRequest>) batchPutScheduledUpdateGroupActionRequest
                        .getScheduledUpdateGroupActions()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<ScheduledUpdateGroupActionRequest> scheduledUpdateGroupActionsList = (com.amazonaws.internal.SdkInternalList<ScheduledUpdateGroupActionRequest>) batchPutScheduledUpdateGroupActionRequest
                    .getScheduledUpdateGroupActions();
            int scheduledUpdateGroupActionsListIndex = 1;

            for (ScheduledUpdateGroupActionRequest scheduledUpdateGroupActionsListValue : scheduledUpdateGroupActionsList) {

                if (scheduledUpdateGroupActionsListValue.getScheduledActionName() != null) {
                    request.addParameter("ScheduledUpdateGroupActions.member." + scheduledUpdateGroupActionsListIndex + ".ScheduledActionName",
                            StringUtils.fromString(scheduledUpdateGroupActionsListValue.getScheduledActionName()));
                }

                if (scheduledUpdateGroupActionsListValue.getStartTime() != null) {
                    request.addParameter("ScheduledUpdateGroupActions.member." + scheduledUpdateGroupActionsListIndex + ".StartTime",
                            StringUtils.fromDate(scheduledUpdateGroupActionsListValue.getStartTime()));
                }

                if (scheduledUpdateGroupActionsListValue.getEndTime() != null) {
                    request.addParameter("ScheduledUpdateGroupActions.member." + scheduledUpdateGroupActionsListIndex + ".EndTime",
                            StringUtils.fromDate(scheduledUpdateGroupActionsListValue.getEndTime()));
                }

                if (scheduledUpdateGroupActionsListValue.getRecurrence() != null) {
                    request.addParameter("ScheduledUpdateGroupActions.member." + scheduledUpdateGroupActionsListIndex + ".Recurrence",
                            StringUtils.fromString(scheduledUpdateGroupActionsListValue.getRecurrence()));
                }

                if (scheduledUpdateGroupActionsListValue.getMinSize() != null) {
                    request.addParameter("ScheduledUpdateGroupActions.member." + scheduledUpdateGroupActionsListIndex + ".MinSize",
                            StringUtils.fromInteger(scheduledUpdateGroupActionsListValue.getMinSize()));
                }

                if (scheduledUpdateGroupActionsListValue.getMaxSize() != null) {
                    request.addParameter("ScheduledUpdateGroupActions.member." + scheduledUpdateGroupActionsListIndex + ".MaxSize",
                            StringUtils.fromInteger(scheduledUpdateGroupActionsListValue.getMaxSize()));
                }

                if (scheduledUpdateGroupActionsListValue.getDesiredCapacity() != null) {
                    request.addParameter("ScheduledUpdateGroupActions.member." + scheduledUpdateGroupActionsListIndex + ".DesiredCapacity",
                            StringUtils.fromInteger(scheduledUpdateGroupActionsListValue.getDesiredCapacity()));
                }
                scheduledUpdateGroupActionsListIndex++;
            }
        }

        return request;
    }

}
