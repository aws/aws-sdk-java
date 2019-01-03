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
 * BatchDeleteScheduledActionRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteScheduledActionRequestMarshaller implements Marshaller<Request<BatchDeleteScheduledActionRequest>, BatchDeleteScheduledActionRequest> {

    public Request<BatchDeleteScheduledActionRequest> marshall(BatchDeleteScheduledActionRequest batchDeleteScheduledActionRequest) {

        if (batchDeleteScheduledActionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<BatchDeleteScheduledActionRequest> request = new DefaultRequest<BatchDeleteScheduledActionRequest>(batchDeleteScheduledActionRequest,
                "AmazonAutoScaling");
        request.addParameter("Action", "BatchDeleteScheduledAction");
        request.addParameter("Version", "2011-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (batchDeleteScheduledActionRequest.getAutoScalingGroupName() != null) {
            request.addParameter("AutoScalingGroupName", StringUtils.fromString(batchDeleteScheduledActionRequest.getAutoScalingGroupName()));
        }

        if (!batchDeleteScheduledActionRequest.getScheduledActionNames().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) batchDeleteScheduledActionRequest.getScheduledActionNames()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> scheduledActionNamesList = (com.amazonaws.internal.SdkInternalList<String>) batchDeleteScheduledActionRequest
                    .getScheduledActionNames();
            int scheduledActionNamesListIndex = 1;

            for (String scheduledActionNamesListValue : scheduledActionNamesList) {
                if (scheduledActionNamesListValue != null) {
                    request.addParameter("ScheduledActionNames.member." + scheduledActionNamesListIndex, StringUtils.fromString(scheduledActionNamesListValue));
                }
                scheduledActionNamesListIndex++;
            }
        }

        return request;
    }

}
