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
 * ReportInstanceStatusRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportInstanceStatusRequestMarshaller implements Marshaller<Request<ReportInstanceStatusRequest>, ReportInstanceStatusRequest> {

    public Request<ReportInstanceStatusRequest> marshall(ReportInstanceStatusRequest reportInstanceStatusRequest) {

        if (reportInstanceStatusRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ReportInstanceStatusRequest> request = new DefaultRequest<ReportInstanceStatusRequest>(reportInstanceStatusRequest, "AmazonEC2");
        request.addParameter("Action", "ReportInstanceStatus");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (reportInstanceStatusRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(reportInstanceStatusRequest.getDescription()));
        }

        if (reportInstanceStatusRequest.getEndTime() != null) {
            request.addParameter("EndTime", StringUtils.fromDate(reportInstanceStatusRequest.getEndTime()));
        }

        com.amazonaws.internal.SdkInternalList<String> reportInstanceStatusRequestInstancesList = (com.amazonaws.internal.SdkInternalList<String>) reportInstanceStatusRequest
                .getInstances();
        if (!reportInstanceStatusRequestInstancesList.isEmpty() || !reportInstanceStatusRequestInstancesList.isAutoConstruct()) {
            int instancesListIndex = 1;

            for (String reportInstanceStatusRequestInstancesListValue : reportInstanceStatusRequestInstancesList) {
                if (reportInstanceStatusRequestInstancesListValue != null) {
                    request.addParameter("InstanceId." + instancesListIndex, StringUtils.fromString(reportInstanceStatusRequestInstancesListValue));
                }
                instancesListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> reportInstanceStatusRequestReasonCodesList = (com.amazonaws.internal.SdkInternalList<String>) reportInstanceStatusRequest
                .getReasonCodes();
        if (!reportInstanceStatusRequestReasonCodesList.isEmpty() || !reportInstanceStatusRequestReasonCodesList.isAutoConstruct()) {
            int reasonCodesListIndex = 1;

            for (String reportInstanceStatusRequestReasonCodesListValue : reportInstanceStatusRequestReasonCodesList) {
                if (reportInstanceStatusRequestReasonCodesListValue != null) {
                    request.addParameter("ReasonCode." + reasonCodesListIndex, StringUtils.fromString(reportInstanceStatusRequestReasonCodesListValue));
                }
                reasonCodesListIndex++;
            }
        }

        if (reportInstanceStatusRequest.getStartTime() != null) {
            request.addParameter("StartTime", StringUtils.fromDate(reportInstanceStatusRequest.getStartTime()));
        }

        if (reportInstanceStatusRequest.getStatus() != null) {
            request.addParameter("Status", StringUtils.fromString(reportInstanceStatusRequest.getStatus()));
        }

        return request;
    }

}
