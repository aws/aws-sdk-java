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
 * DetachTrafficSourcesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetachTrafficSourcesRequestMarshaller implements Marshaller<Request<DetachTrafficSourcesRequest>, DetachTrafficSourcesRequest> {

    public Request<DetachTrafficSourcesRequest> marshall(DetachTrafficSourcesRequest detachTrafficSourcesRequest) {

        if (detachTrafficSourcesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DetachTrafficSourcesRequest> request = new DefaultRequest<DetachTrafficSourcesRequest>(detachTrafficSourcesRequest, "AmazonAutoScaling");
        request.addParameter("Action", "DetachTrafficSources");
        request.addParameter("Version", "2011-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (detachTrafficSourcesRequest.getAutoScalingGroupName() != null) {
            request.addParameter("AutoScalingGroupName", StringUtils.fromString(detachTrafficSourcesRequest.getAutoScalingGroupName()));
        }

        if (!detachTrafficSourcesRequest.getTrafficSources().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<TrafficSourceIdentifier>) detachTrafficSourcesRequest.getTrafficSources()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<TrafficSourceIdentifier> trafficSourcesList = (com.amazonaws.internal.SdkInternalList<TrafficSourceIdentifier>) detachTrafficSourcesRequest
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
