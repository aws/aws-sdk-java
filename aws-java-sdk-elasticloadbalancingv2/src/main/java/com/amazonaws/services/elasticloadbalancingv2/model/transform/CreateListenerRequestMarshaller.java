/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticloadbalancingv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * CreateListenerRequest Marshaller
 */

public class CreateListenerRequestMarshaller implements Marshaller<Request<CreateListenerRequest>, CreateListenerRequest> {

    public Request<CreateListenerRequest> marshall(CreateListenerRequest createListenerRequest) {

        if (createListenerRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateListenerRequest> request = new DefaultRequest<CreateListenerRequest>(createListenerRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "CreateListener");
        request.addParameter("Version", "2015-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (createListenerRequest.getLoadBalancerArn() != null) {
            request.addParameter("LoadBalancerArn", StringUtils.fromString(createListenerRequest.getLoadBalancerArn()));
        }

        if (createListenerRequest.getProtocol() != null) {
            request.addParameter("Protocol", StringUtils.fromString(createListenerRequest.getProtocol()));
        }

        if (createListenerRequest.getPort() != null) {
            request.addParameter("Port", StringUtils.fromInteger(createListenerRequest.getPort()));
        }

        if (createListenerRequest.getSslPolicy() != null) {
            request.addParameter("SslPolicy", StringUtils.fromString(createListenerRequest.getSslPolicy()));
        }

        java.util.List<Certificate> certificatesList = createListenerRequest.getCertificates();

        if (certificatesList != null) {
            if (certificatesList.isEmpty()) {
                request.addParameter("Certificates", "");
            } else {
                int certificatesListIndex = 1;

                for (Certificate certificatesListValue : certificatesList) {

                    if (certificatesListValue.getCertificateArn() != null) {
                        request.addParameter("Certificates.member." + certificatesListIndex + ".CertificateArn",
                                StringUtils.fromString(certificatesListValue.getCertificateArn()));
                    }
                    certificatesListIndex++;
                }
            }
        }

        java.util.List<Action> defaultActionsList = createListenerRequest.getDefaultActions();

        if (defaultActionsList != null) {
            if (defaultActionsList.isEmpty()) {
                request.addParameter("DefaultActions", "");
            } else {
                int defaultActionsListIndex = 1;

                for (Action defaultActionsListValue : defaultActionsList) {

                    if (defaultActionsListValue.getType() != null) {
                        request.addParameter("DefaultActions.member." + defaultActionsListIndex + ".Type",
                                StringUtils.fromString(defaultActionsListValue.getType()));
                    }

                    if (defaultActionsListValue.getTargetGroupArn() != null) {
                        request.addParameter("DefaultActions.member." + defaultActionsListIndex + ".TargetGroupArn",
                                StringUtils.fromString(defaultActionsListValue.getTargetGroupArn()));
                    }
                    defaultActionsListIndex++;
                }
            }
        }

        return request;
    }

}
