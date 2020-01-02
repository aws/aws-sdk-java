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
 * DeleteAnomalyDetectorRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAnomalyDetectorRequestMarshaller implements Marshaller<Request<DeleteAnomalyDetectorRequest>, DeleteAnomalyDetectorRequest> {

    public Request<DeleteAnomalyDetectorRequest> marshall(DeleteAnomalyDetectorRequest deleteAnomalyDetectorRequest) {

        if (deleteAnomalyDetectorRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteAnomalyDetectorRequest> request = new DefaultRequest<DeleteAnomalyDetectorRequest>(deleteAnomalyDetectorRequest, "AmazonCloudWatch");
        request.addParameter("Action", "DeleteAnomalyDetector");
        request.addParameter("Version", "2010-08-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (deleteAnomalyDetectorRequest.getNamespace() != null) {
            request.addParameter("Namespace", StringUtils.fromString(deleteAnomalyDetectorRequest.getNamespace()));
        }

        if (deleteAnomalyDetectorRequest.getMetricName() != null) {
            request.addParameter("MetricName", StringUtils.fromString(deleteAnomalyDetectorRequest.getMetricName()));
        }

        if (!deleteAnomalyDetectorRequest.getDimensions().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Dimension>) deleteAnomalyDetectorRequest.getDimensions()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Dimension> dimensionsList = (com.amazonaws.internal.SdkInternalList<Dimension>) deleteAnomalyDetectorRequest
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

        if (deleteAnomalyDetectorRequest.getStat() != null) {
            request.addParameter("Stat", StringUtils.fromString(deleteAnomalyDetectorRequest.getStat()));
        }

        return request;
    }

}
