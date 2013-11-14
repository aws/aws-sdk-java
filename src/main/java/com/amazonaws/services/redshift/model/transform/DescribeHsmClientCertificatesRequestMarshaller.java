/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.redshift.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Describe Hsm Client Certificates Request Marshaller
 */
public class DescribeHsmClientCertificatesRequestMarshaller implements Marshaller<Request<DescribeHsmClientCertificatesRequest>, DescribeHsmClientCertificatesRequest> {

    public Request<DescribeHsmClientCertificatesRequest> marshall(DescribeHsmClientCertificatesRequest describeHsmClientCertificatesRequest) {

        if (describeHsmClientCertificatesRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DescribeHsmClientCertificatesRequest> request = new DefaultRequest<DescribeHsmClientCertificatesRequest>(describeHsmClientCertificatesRequest, "AmazonRedshift");
        request.addParameter("Action", "DescribeHsmClientCertificates");
        request.addParameter("Version", "2012-12-01");

        if (describeHsmClientCertificatesRequest.getHsmClientCertificateIdentifier() != null) {
            request.addParameter("HsmClientCertificateIdentifier", StringUtils.fromString(describeHsmClientCertificatesRequest.getHsmClientCertificateIdentifier()));
        }
        if (describeHsmClientCertificatesRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeHsmClientCertificatesRequest.getMaxRecords()));
        }
        if (describeHsmClientCertificatesRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeHsmClientCertificatesRequest.getMarker()));
        }


        return request;
    }
}
