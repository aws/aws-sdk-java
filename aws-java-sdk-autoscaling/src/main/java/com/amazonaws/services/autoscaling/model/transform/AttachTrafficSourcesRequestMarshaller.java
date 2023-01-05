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
 * AttachTrafficSourcesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttachTrafficSourcesRequestMarshaller implements Marshaller<Request<AttachTrafficSourcesRequest>, AttachTrafficSourcesRequest> {

    public Request<AttachTrafficSourcesRequest> marshall(AttachTrafficSourcesRequest attachTrafficSourcesRequest) {

        if (attachTrafficSourcesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AttachTrafficSourcesRequest> request = new DefaultRequest<AttachTrafficSourcesRequest>(attachTrafficSourcesRequest, "AmazonAutoScaling");
        request.addParameter("Action", "AttachTrafficSources");
        request.addParameter("Version", "2011-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (attachTrafficSourcesRequest.getAutoScalingGroupName() != null) {
            request.addParameter("AutoScalingGroupName", StringUtils.fromString(attachTrafficSourcesRequest.getAutoScalingGroupName()));
        }

        if (!attachTrafficSourcesRequest.getTrafficSources().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<TrafficSourceIdentifier>) attachTrafficSourcesRequest.getTrafficSources()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<TrafficSourceIdentifier> trafficSourcesList = (com.amazonaws.internal.SdkInternalList<TrafficSourceIdentifier>) attachTrafficSourcesRequest
                    .getTrafficSources();
            int trafficSourcesListIndex = 1;

            for (TrafficSourceIdentifier trafficSourcesListValue : trafficSourcesList) {
                if (trafficSourcesListValue != null) {

                    if (trafficSourcesListValue.getIdentifier() != null) {
                        request.addParameter("TrafficSources.member." + trafficSourcesListIndex + ".Identifier",
                                StringUtils.fromString(trafficSourcesListValue.getIdentifier()));
                    }
                }
                trafficSourcesListIndex++;
            }
        }

        return request;
    }

}
