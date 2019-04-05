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
 * SetLoadBalancerListenerSSLCertificateRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetLoadBalancerListenerSSLCertificateRequestMarshaller implements
        Marshaller<Request<SetLoadBalancerListenerSSLCertificateRequest>, SetLoadBalancerListenerSSLCertificateRequest> {

    public Request<SetLoadBalancerListenerSSLCertificateRequest> marshall(
            SetLoadBalancerListenerSSLCertificateRequest setLoadBalancerListenerSSLCertificateRequest) {

        if (setLoadBalancerListenerSSLCertificateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SetLoadBalancerListenerSSLCertificateRequest> request = new DefaultRequest<SetLoadBalancerListenerSSLCertificateRequest>(
                setLoadBalancerListenerSSLCertificateRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "SetLoadBalancerListenerSSLCertificate");
        request.addParameter("Version", "2012-06-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (setLoadBalancerListenerSSLCertificateRequest.getLoadBalancerName() != null) {
            request.addParameter("LoadBalancerName", StringUtils.fromString(setLoadBalancerListenerSSLCertificateRequest.getLoadBalancerName()));
        }

        if (setLoadBalancerListenerSSLCertificateRequest.getLoadBalancerPort() != null) {
            request.addParameter("LoadBalancerPort", StringUtils.fromInteger(setLoadBalancerListenerSSLCertificateRequest.getLoadBalancerPort()));
        }

        if (setLoadBalancerListenerSSLCertificateRequest.getSSLCertificateId() != null) {
            request.addParameter("SSLCertificateId", StringUtils.fromString(setLoadBalancerListenerSSLCertificateRequest.getSSLCertificateId()));
        }

        return request;
    }

}
