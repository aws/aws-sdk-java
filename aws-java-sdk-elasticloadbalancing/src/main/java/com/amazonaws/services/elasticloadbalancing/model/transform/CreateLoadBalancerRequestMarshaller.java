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
package com.amazonaws.services.elasticloadbalancing.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * CreateLoadBalancerRequest Marshaller
 */

public class CreateLoadBalancerRequestMarshaller implements Marshaller<Request<CreateLoadBalancerRequest>, CreateLoadBalancerRequest> {

    public Request<CreateLoadBalancerRequest> marshall(CreateLoadBalancerRequest createLoadBalancerRequest) {

        if (createLoadBalancerRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateLoadBalancerRequest> request = new DefaultRequest<CreateLoadBalancerRequest>(createLoadBalancerRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "CreateLoadBalancer");
        request.addParameter("Version", "2012-06-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (createLoadBalancerRequest.getLoadBalancerName() != null) {
            request.addParameter("LoadBalancerName", StringUtils.fromString(createLoadBalancerRequest.getLoadBalancerName()));
        }

        com.amazonaws.internal.SdkInternalList<Listener> listenersList = (com.amazonaws.internal.SdkInternalList<Listener>) createLoadBalancerRequest
                .getListeners();
        if (!listenersList.isEmpty() || !listenersList.isAutoConstruct()) {
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

        com.amazonaws.internal.SdkInternalList<String> availabilityZonesList = (com.amazonaws.internal.SdkInternalList<String>) createLoadBalancerRequest
                .getAvailabilityZones();
        if (!availabilityZonesList.isEmpty() || !availabilityZonesList.isAutoConstruct()) {
            int availabilityZonesListIndex = 1;

            for (String availabilityZonesListValue : availabilityZonesList) {
                if (availabilityZonesListValue != null) {
                    request.addParameter("AvailabilityZones.member." + availabilityZonesListIndex, StringUtils.fromString(availabilityZonesListValue));
                }
                availabilityZonesListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> subnetsList = (com.amazonaws.internal.SdkInternalList<String>) createLoadBalancerRequest.getSubnets();
        if (!subnetsList.isEmpty() || !subnetsList.isAutoConstruct()) {
            int subnetsListIndex = 1;

            for (String subnetsListValue : subnetsList) {
                if (subnetsListValue != null) {
                    request.addParameter("Subnets.member." + subnetsListIndex, StringUtils.fromString(subnetsListValue));
                }
                subnetsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> securityGroupsList = (com.amazonaws.internal.SdkInternalList<String>) createLoadBalancerRequest
                .getSecurityGroups();
        if (!securityGroupsList.isEmpty() || !securityGroupsList.isAutoConstruct()) {
            int securityGroupsListIndex = 1;

            for (String securityGroupsListValue : securityGroupsList) {
                if (securityGroupsListValue != null) {
                    request.addParameter("SecurityGroups.member." + securityGroupsListIndex, StringUtils.fromString(securityGroupsListValue));
                }
                securityGroupsListIndex++;
            }
        }

        if (createLoadBalancerRequest.getScheme() != null) {
            request.addParameter("Scheme", StringUtils.fromString(createLoadBalancerRequest.getScheme()));
        }

        com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createLoadBalancerRequest.getTags();
        if (!tagsList.isEmpty() || !tagsList.isAutoConstruct()) {
            int tagsListIndex = 1;

            for (Tag tagsListValue : tagsList) {

                if (tagsListValue.getKey() != null) {
                    request.addParameter("Tags.member." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                }

                if (tagsListValue.getValue() != null) {
                    request.addParameter("Tags.member." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                }
                tagsListIndex++;
            }
        }

        return request;
    }

}
