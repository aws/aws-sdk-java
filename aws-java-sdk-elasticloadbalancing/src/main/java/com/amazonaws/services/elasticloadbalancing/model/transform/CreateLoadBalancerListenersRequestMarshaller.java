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
package com.amazonaws.services.elasticloadbalancing.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CreateLoadBalancerListenersRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLoadBalancerListenersRequestMarshaller implements
        Marshaller<Request<CreateLoadBalancerListenersRequest>, CreateLoadBalancerListenersRequest> {

    public Request<CreateLoadBalancerListenersRequest> marshall(CreateLoadBalancerListenersRequest createLoadBalancerListenersRequest) {

        if (createLoadBalancerListenersRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateLoadBalancerListenersRequest> request = new DefaultRequest<CreateLoadBalancerListenersRequest>(createLoadBalancerListenersRequest,
                "AmazonElasticLoadBalancing");
        request.addParameter("Action", "CreateLoadBalancerListeners");
        request.addParameter("Version", "2012-06-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (createLoadBalancerListenersRequest.getLoadBalancerName() != null) {
            request.addParameter("LoadBalancerName", StringUtils.fromString(createLoadBalancerListenersRequest.getLoadBalancerName()));
        }

        if (!createLoadBalancerListenersRequest.getListeners().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Listener>) createLoadBalancerListenersRequest.getListeners()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Listener> listenersList = (com.amazonaws.internal.SdkInternalList<Listener>) createLoadBalancerListenersRequest
                    .getListeners();
            int listenersListIndex = 1;

            for (Listener listenersListValue : listenersList) {

                if (listenersListValue.getProtocol() != null) {
                    request.addParameter("Listeners.member." + listenersListIndex + ".Protocol", StringUtils.fromString(listenersListValue.getProtocol()));
                }

                if (listenersListValue.getLoadBalancerPort() != null) {
                    request.addParameter("Listeners.member." + listenersListIndex + ".LoadBalancerPort",
                            StringUtils.fromInteger(listenersListValue.getLoadBalancerPort()));
                }

                if (listenersListValue.getInstanceProtocol() != null) {
                    request.addParameter("Listeners.member." + listenersListIndex + ".InstanceProtocol",
                            StringUtils.fromString(listenersListValue.getInstanceProtocol()));
                }

                if (listenersListValue.getInstancePort() != null) {
                    request.addParameter("Listeners.member." + listenersListIndex + ".InstancePort",
                            StringUtils.fromInteger(listenersListValue.getInstancePort()));
                }

                if (listenersListValue.getSSLCertificateId() != null) {
                    request.addParameter("Listeners.member." + listenersListIndex + ".SSLCertificateId",
                            StringUtils.fromString(listenersListValue.getSSLCertificateId()));
                }
                listenersListIndex++;
            }
        }

        return request;
    }

}
