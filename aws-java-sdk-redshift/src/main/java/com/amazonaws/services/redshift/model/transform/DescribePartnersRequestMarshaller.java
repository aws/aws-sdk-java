/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribePartnersRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePartnersRequestMarshaller implements Marshaller<Request<DescribePartnersRequest>, DescribePartnersRequest> {

    public Request<DescribePartnersRequest> marshall(DescribePartnersRequest describePartnersRequest) {

        if (describePartnersRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribePartnersRequest> request = new DefaultRequest<DescribePartnersRequest>(describePartnersRequest, "AmazonRedshift");
        request.addParameter("Action", "DescribePartners");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describePartnersRequest.getAccountId() != null) {
            request.addParameter("AccountId", StringUtils.fromString(describePartnersRequest.getAccountId()));
        }

        if (describePartnersRequest.getClusterIdentifier() != null) {
            request.addParameter("ClusterIdentifier", StringUtils.fromString(describePartnersRequest.getClusterIdentifier()));
        }

        if (describePartnersRequest.getDatabaseName() != null) {
            request.addParameter("DatabaseName", StringUtils.fromString(describePartnersRequest.getDatabaseName()));
        }

        if (describePartnersRequest.getPartnerName() != null) {
            request.addParameter("PartnerName", StringUtils.fromString(describePartnersRequest.getPartnerName()));
        }

        return request;
    }

}
