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
 * PutAnomalyDetectorRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutAnomalyDetectorRequestMarshaller implements Marshaller<Request<PutAnomalyDetectorRequest>, PutAnomalyDetectorRequest> {

    public Request<PutAnomalyDetectorRequest> marshall(PutAnomalyDetectorRequest putAnomalyDetectorRequest) {

        if (putAnomalyDetectorRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<PutAnomalyDetectorRequest> request = new DefaultRequest<PutAnomalyDetectorRequest>(putAnomalyDetectorRequest, "AmazonCloudWatch");
        request.addParameter("Action", "PutAnomalyDetector");
        request.addParameter("Version", "2010-08-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (putAnomalyDetectorRequest.getNamespace() != null) {
            request.addParameter("Namespace", StringUtils.fromString(putAnomalyDetectorRequest.getNamespace()));
        }

        if (putAnomalyDetectorRequest.getMetricName() != null) {
            request.addParameter("MetricName", StringUtils.fromString(putAnomalyDetectorRequest.getMetricName()));
        }

        if (!putAnomalyDetectorRequest.getDimensions().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Dimension>) putAnomalyDetectorRequest.getDimensions()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Dimension> dimensionsList = (com.amazonaws.internal.SdkInternalList<Dimension>) putAnomalyDetectorRequest
                    .getDimensions();
            int dimensionsListIndex = 1;

            for (Dimension dimensionsListValue : dimensionsList) {

                if (dimensionsListValue.getName() != null) {
                    request.addParameter("Dimensions.member." + dimensionsListIndex + ".Name", StringUtils.fromString(dimensionsListValue.getName()));
                }

                if (dimensionsListValue.getValue() != null) {
                    request.addParameter("Dimensions.member." + dimensionsListIndex + ".Value", StringUtils.fromString(dimensionsListValue.getValue()));
                }
                dimensionsListIndex++;
            }
        }

        if (putAnomalyDetectorRequest.getStat() != null) {
            request.addParameter("Stat", StringUtils.fromString(putAnomalyDetectorRequest.getStat()));
        }

        {
            AnomalyDetectorConfiguration configuration = putAnomalyDetectorRequest.getConfiguration();
            if (configuration != null) {

                if (!configuration.getExcludedTimeRanges().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<Range>) configuration.getExcludedTimeRanges()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<Range> excludedTimeRangesList = (com.amazonaws.internal.SdkInternalList<Range>) configuration
                            .getExcludedTimeRanges();
                    int excludedTimeRangesListIndex = 1;

                    for (Range excludedTimeRangesListValue : excludedTimeRangesList) {

                        if (excludedTimeRangesListValue.getStartTime() != null) {
                            request.addParameter("Configuration.ExcludedTimeRanges.member." + excludedTimeRangesListIndex + ".StartTime",
                                    StringUtils.fromDate(excludedTimeRangesListValue.getStartTime()));
                        }

                        if (excludedTimeRangesListValue.getEndTime() != null) {
                            request.addParameter("Configuration.ExcludedTimeRanges.member." + excludedTimeRangesListIndex + ".EndTime",
                                    StringUtils.fromDate(excludedTimeRangesListValue.getEndTime()));
                        }
                        excludedTimeRangesListIndex++;
                    }
                }

                if (configuration.getMetricTimezone() != null) {
                    request.addParameter("Configuration.MetricTimezone", StringUtils.fromString(configuration.getMetricTimezone()));
                }
            }
        }

        return request;
    }

}
