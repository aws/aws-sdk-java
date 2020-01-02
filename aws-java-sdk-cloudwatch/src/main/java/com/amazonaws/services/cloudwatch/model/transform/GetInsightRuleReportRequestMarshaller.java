/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * GetInsightRuleReportRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInsightRuleReportRequestMarshaller implements Marshaller<Request<GetInsightRuleReportRequest>, GetInsightRuleReportRequest> {

    public Request<GetInsightRuleReportRequest> marshall(GetInsightRuleReportRequest getInsightRuleReportRequest) {

        if (getInsightRuleReportRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetInsightRuleReportRequest> request = new DefaultRequest<GetInsightRuleReportRequest>(getInsightRuleReportRequest, "AmazonCloudWatch");
        request.addParameter("Action", "GetInsightRuleReport");
        request.addParameter("Version", "2010-08-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (getInsightRuleReportRequest.getRuleName() != null) {
            request.addParameter("RuleName", StringUtils.fromString(getInsightRuleReportRequest.getRuleName()));
        }

        if (getInsightRuleReportRequest.getStartTime() != null) {
            request.addParameter("StartTime", StringUtils.fromDate(getInsightRuleReportRequest.getStartTime()));
        }

        if (getInsightRuleReportRequest.getEndTime() != null) {
            request.addParameter("EndTime", StringUtils.fromDate(getInsightRuleReportRequest.getEndTime()));
        }

        if (getInsightRuleReportRequest.getPeriod() != null) {
            request.addParameter("Period", StringUtils.fromInteger(getInsightRuleReportRequest.getPeriod()));
        }

        if (getInsightRuleReportRequest.getMaxContributorCount() != null) {
            request.addParameter("MaxContributorCount", StringUtils.fromInteger(getInsightRuleReportRequest.getMaxContributorCount()));
        }

        if (!getInsightRuleReportRequest.getMetrics().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) getInsightRuleReportRequest.getMetrics()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> metricsList = (com.amazonaws.internal.SdkInternalList<String>) getInsightRuleReportRequest
                    .getMetrics();
            int metricsListIndex = 1;

            for (String metricsListValue : metricsList) {
                if (metricsListValue != null) {
                    request.addParameter("Metrics.member." + metricsListIndex, StringUtils.fromString(metricsListValue));
                }
                metricsListIndex++;
            }
        }

        if (getInsightRuleReportRequest.getOrderBy() != null) {
            request.addParameter("OrderBy", StringUtils.fromString(getInsightRuleReportRequest.getOrderBy()));
        }

        return request;
    }

}
