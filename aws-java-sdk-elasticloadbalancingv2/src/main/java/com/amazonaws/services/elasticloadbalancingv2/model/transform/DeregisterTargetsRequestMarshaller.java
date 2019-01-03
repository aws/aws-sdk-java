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
package com.amazonaws.services.elasticloadbalancingv2.model.transform;

import java.util.List;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticloadbalancingv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DeregisterTargetsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeregisterTargetsRequestMarshaller implements Marshaller<Request<DeregisterTargetsRequest>, DeregisterTargetsRequest> {

    public Request<DeregisterTargetsRequest> marshall(DeregisterTargetsRequest deregisterTargetsRequest) {

        if (deregisterTargetsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeregisterTargetsRequest> request = new DefaultRequest<DeregisterTargetsRequest>(deregisterTargetsRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "DeregisterTargets");
        request.addParameter("Version", "2015-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (deregisterTargetsRequest.getTargetGroupArn() != null) {
            request.addParameter("TargetGroupArn", StringUtils.fromString(deregisterTargetsRequest.getTargetGroupArn()));
        }

        if (deregisterTargetsRequest.getTargets() != null) {
            java.util.List<TargetDescription> targetsList = deregisterTargetsRequest.getTargets();
            if (targetsList.isEmpty()) {
                request.addParameter("Targets", "");
            } else {
                int targetsListIndex = 1;

                for (TargetDescription targetsListValue : targetsList) {

                    if (targetsListValue.getId() != null) {
                        request.addParameter("Targets.member." + targetsListIndex + ".Id", StringUtils.fromString(targetsListValue.getId()));
                    }

                    if (targetsListValue.getPort() != null) {
                        request.addParameter("Targets.member." + targetsListIndex + ".Port", StringUtils.fromInteger(targetsListValue.getPort()));
                    }

                    if (targetsListValue.getAvailabilityZone() != null) {
                        request.addParameter("Targets.member." + targetsListIndex + ".AvailabilityZone",
                                StringUtils.fromString(targetsListValue.getAvailabilityZone()));
                    }
                    targetsListIndex++;
                }
            }
        }

        return request;
    }

}
