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
 * RemoveListenerCertificatesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveListenerCertificatesRequestMarshaller implements Marshaller<Request<RemoveListenerCertificatesRequest>, RemoveListenerCertificatesRequest> {

    public Request<RemoveListenerCertificatesRequest> marshall(RemoveListenerCertificatesRequest removeListenerCertificatesRequest) {

        if (removeListenerCertificatesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RemoveListenerCertificatesRequest> request = new DefaultRequest<RemoveListenerCertificatesRequest>(removeListenerCertificatesRequest,
                "AmazonElasticLoadBalancing");
        request.addParameter("Action", "RemoveListenerCertificates");
        request.addParameter("Version", "2015-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (removeListenerCertificatesRequest.getListenerArn() != null) {
            request.addParameter("ListenerArn", StringUtils.fromString(removeListenerCertificatesRequest.getListenerArn()));
        }

        if (removeListenerCertificatesRequest.getCertificates() != null) {
            java.util.List<Certificate> certificatesList = removeListenerCertificatesRequest.getCertificates();
            if (certificatesList.isEmpty()) {
                request.addParameter("Certificates", "");
            } else {
                int certificatesListIndex = 1;

                for (Certificate certificatesListValue : certificatesList) {

                    if (certificatesListValue.getCertificateArn() != null) {
                        request.addParameter("Certificates.member." + certificatesListIndex + ".CertificateArn",
                                StringUtils.fromString(certificatesListValue.getCertificateArn()));
                    }

                    if (certificatesListValue.getIsDefault() != null) {
                        request.addParameter("Certificates.member." + certificatesListIndex + ".IsDefault",
                                StringUtils.fromBoolean(certificatesListValue.getIsDefault()));
                    }
                    certificatesListIndex++;
                }
            }
        }

        return request;
    }

}
