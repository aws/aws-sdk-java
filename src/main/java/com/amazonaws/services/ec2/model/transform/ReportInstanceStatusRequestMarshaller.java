/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Report Instance Status Request Marshaller
 */
public class ReportInstanceStatusRequestMarshaller implements Marshaller<Request<ReportInstanceStatusRequest>, ReportInstanceStatusRequest> {

    public Request<ReportInstanceStatusRequest> marshall(ReportInstanceStatusRequest reportInstanceStatusRequest) {

        if (reportInstanceStatusRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<ReportInstanceStatusRequest> request = new DefaultRequest<ReportInstanceStatusRequest>(reportInstanceStatusRequest, "AmazonEC2");
        request.addParameter("Action", "ReportInstanceStatus");
        request.addParameter("Version", "2013-10-15");


        java.util.List<String> instancesList = reportInstanceStatusRequest.getInstances();
        int instancesListIndex = 1;

        for (String instancesListValue : instancesList) {
            if (instancesListValue != null) {
                request.addParameter("InstanceId." + instancesListIndex, StringUtils.fromString(instancesListValue));
            }

            instancesListIndex++;
        }
        if (reportInstanceStatusRequest.getStatus() != null) {
            request.addParameter("Status", StringUtils.fromString(reportInstanceStatusRequest.getStatus()));
        }
        if (reportInstanceStatusRequest.getStartTime() != null) {
            request.addParameter("StartTime", StringUtils.fromDate(reportInstanceStatusRequest.getStartTime()));
        }
        if (reportInstanceStatusRequest.getEndTime() != null) {
            request.addParameter("EndTime", StringUtils.fromDate(reportInstanceStatusRequest.getEndTime()));
        }

        java.util.List<String> reasonCodesList = reportInstanceStatusRequest.getReasonCodes();
        int reasonCodesListIndex = 1;

        for (String reasonCodesListValue : reasonCodesList) {
            if (reasonCodesListValue != null) {
                request.addParameter("ReasonCode." + reasonCodesListIndex, StringUtils.fromString(reasonCodesListValue));
            }

            reasonCodesListIndex++;
        }
        if (reportInstanceStatusRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(reportInstanceStatusRequest.getDescription()));
        }


        return request;
    }
}
