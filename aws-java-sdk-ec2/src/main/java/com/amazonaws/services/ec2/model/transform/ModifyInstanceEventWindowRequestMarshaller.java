/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ModifyInstanceEventWindowRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyInstanceEventWindowRequestMarshaller implements Marshaller<Request<ModifyInstanceEventWindowRequest>, ModifyInstanceEventWindowRequest> {

    public Request<ModifyInstanceEventWindowRequest> marshall(ModifyInstanceEventWindowRequest modifyInstanceEventWindowRequest) {

        if (modifyInstanceEventWindowRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyInstanceEventWindowRequest> request = new DefaultRequest<ModifyInstanceEventWindowRequest>(modifyInstanceEventWindowRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyInstanceEventWindow");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyInstanceEventWindowRequest.getName() != null) {
            request.addParameter("Name", StringUtils.fromString(modifyInstanceEventWindowRequest.getName()));
        }

        if (modifyInstanceEventWindowRequest.getInstanceEventWindowId() != null) {
            request.addParameter("InstanceEventWindowId", StringUtils.fromString(modifyInstanceEventWindowRequest.getInstanceEventWindowId()));
        }

        com.amazonaws.internal.SdkInternalList<InstanceEventWindowTimeRangeRequest> modifyInstanceEventWindowRequestTimeRangesList = (com.amazonaws.internal.SdkInternalList<InstanceEventWindowTimeRangeRequest>) modifyInstanceEventWindowRequest
                .getTimeRanges();
        if (!modifyInstanceEventWindowRequestTimeRangesList.isEmpty() || !modifyInstanceEventWindowRequestTimeRangesList.isAutoConstruct()) {
            int timeRangesListIndex = 1;

            for (InstanceEventWindowTimeRangeRequest modifyInstanceEventWindowRequestTimeRangesListValue : modifyInstanceEventWindowRequestTimeRangesList) {

                if (modifyInstanceEventWindowRequestTimeRangesListValue.getStartWeekDay() != null) {
                    request.addParameter("TimeRange." + timeRangesListIndex + ".StartWeekDay",
                            StringUtils.fromString(modifyInstanceEventWindowRequestTimeRangesListValue.getStartWeekDay()));
                }

                if (modifyInstanceEventWindowRequestTimeRangesListValue.getStartHour() != null) {
                    request.addParameter("TimeRange." + timeRangesListIndex + ".StartHour",
                            StringUtils.fromInteger(modifyInstanceEventWindowRequestTimeRangesListValue.getStartHour()));
                }

                if (modifyInstanceEventWindowRequestTimeRangesListValue.getEndWeekDay() != null) {
                    request.addParameter("TimeRange." + timeRangesListIndex + ".EndWeekDay",
                            StringUtils.fromString(modifyInstanceEventWindowRequestTimeRangesListValue.getEndWeekDay()));
                }

                if (modifyInstanceEventWindowRequestTimeRangesListValue.getEndHour() != null) {
                    request.addParameter("TimeRange." + timeRangesListIndex + ".EndHour",
                            StringUtils.fromInteger(modifyInstanceEventWindowRequestTimeRangesListValue.getEndHour()));
                }
                timeRangesListIndex++;
            }
        }

        if (modifyInstanceEventWindowRequest.getCronExpression() != null) {
            request.addParameter("CronExpression", StringUtils.fromString(modifyInstanceEventWindowRequest.getCronExpression()));
        }

        return request;
    }

}
