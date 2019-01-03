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
package com.amazonaws.services.route53.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.util.StringUtils;

/**
 * ListTrafficPolicyInstancesByPolicyRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTrafficPolicyInstancesByPolicyRequestMarshaller implements
        Marshaller<Request<ListTrafficPolicyInstancesByPolicyRequest>, ListTrafficPolicyInstancesByPolicyRequest> {

    public Request<ListTrafficPolicyInstancesByPolicyRequest> marshall(ListTrafficPolicyInstancesByPolicyRequest listTrafficPolicyInstancesByPolicyRequest) {

        if (listTrafficPolicyInstancesByPolicyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListTrafficPolicyInstancesByPolicyRequest> request = new DefaultRequest<ListTrafficPolicyInstancesByPolicyRequest>(
                listTrafficPolicyInstancesByPolicyRequest, "AmazonRoute53");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/2013-04-01/trafficpolicyinstances/trafficpolicy";

        request.setResourcePath(uriResourcePath);

        if (listTrafficPolicyInstancesByPolicyRequest.getTrafficPolicyId() != null) {
            request.addParameter("id", StringUtils.fromString(listTrafficPolicyInstancesByPolicyRequest.getTrafficPolicyId()));
        }

        if (listTrafficPolicyInstancesByPolicyRequest.getTrafficPolicyVersion() != null) {
            request.addParameter("version", StringUtils.fromInteger(listTrafficPolicyInstancesByPolicyRequest.getTrafficPolicyVersion()));
        }

        if (listTrafficPolicyInstancesByPolicyRequest.getHostedZoneIdMarker() != null) {
            request.addParameter("hostedzoneid", StringUtils.fromString(listTrafficPolicyInstancesByPolicyRequest.getHostedZoneIdMarker()));
        }

        if (listTrafficPolicyInstancesByPolicyRequest.getTrafficPolicyInstanceNameMarker() != null) {
            request.addParameter("trafficpolicyinstancename",
                    StringUtils.fromString(listTrafficPolicyInstancesByPolicyRequest.getTrafficPolicyInstanceNameMarker()));
        }

        if (listTrafficPolicyInstancesByPolicyRequest.getTrafficPolicyInstanceTypeMarker() != null) {
            request.addParameter("trafficpolicyinstancetype",
                    StringUtils.fromString(listTrafficPolicyInstancesByPolicyRequest.getTrafficPolicyInstanceTypeMarker()));
        }

        if (listTrafficPolicyInstancesByPolicyRequest.getMaxItems() != null) {
            request.addParameter("maxitems", StringUtils.fromString(listTrafficPolicyInstancesByPolicyRequest.getMaxItems()));
        }

        return request;
    }

}
