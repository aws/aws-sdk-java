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
 * Describe Hsm Configurations Request Marshaller
 */
public class DescribeHsmConfigurationsRequestMarshaller implements Marshaller<Request<DescribeHsmConfigurationsRequest>, DescribeHsmConfigurationsRequest> {

    public Request<DescribeHsmConfigurationsRequest> marshall(DescribeHsmConfigurationsRequest describeHsmConfigurationsRequest) {

        if (describeHsmConfigurationsRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DescribeHsmConfigurationsRequest> request = new DefaultRequest<DescribeHsmConfigurationsRequest>(describeHsmConfigurationsRequest, "AmazonRedshift");
        request.addParameter("Action", "DescribeHsmConfigurations");
        request.addParameter("Version", "2012-12-01");

        if (describeHsmConfigurationsRequest.getHsmConfigurationIdentifier() != null) {
            request.addParameter("HsmConfigurationIdentifier", StringUtils.fromString(describeHsmConfigurationsRequest.getHsmConfigurationIdentifier()));
        }
        if (describeHsmConfigurationsRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeHsmConfigurationsRequest.getMaxRecords()));
        }
        if (describeHsmConfigurationsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeHsmConfigurationsRequest.getMarker()));
        }


        return request;
    }
}
