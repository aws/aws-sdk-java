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
package com.amazonaws.services.rds.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Describe Orderable D B Instance Options Request Marshaller
 */
public class DescribeOrderableDBInstanceOptionsRequestMarshaller implements Marshaller<Request<DescribeOrderableDBInstanceOptionsRequest>, DescribeOrderableDBInstanceOptionsRequest> {

    public Request<DescribeOrderableDBInstanceOptionsRequest> marshall(DescribeOrderableDBInstanceOptionsRequest describeOrderableDBInstanceOptionsRequest) {

        if (describeOrderableDBInstanceOptionsRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DescribeOrderableDBInstanceOptionsRequest> request = new DefaultRequest<DescribeOrderableDBInstanceOptionsRequest>(describeOrderableDBInstanceOptionsRequest, "AmazonRDS");
        request.addParameter("Action", "DescribeOrderableDBInstanceOptions");
        request.addParameter("Version", "2013-09-09");

        if (describeOrderableDBInstanceOptionsRequest.getEngine() != null) {
            request.addParameter("Engine", StringUtils.fromString(describeOrderableDBInstanceOptionsRequest.getEngine()));
        }
        if (describeOrderableDBInstanceOptionsRequest.getEngineVersion() != null) {
            request.addParameter("EngineVersion", StringUtils.fromString(describeOrderableDBInstanceOptionsRequest.getEngineVersion()));
        }
        if (describeOrderableDBInstanceOptionsRequest.getDBInstanceClass() != null) {
            request.addParameter("DBInstanceClass", StringUtils.fromString(describeOrderableDBInstanceOptionsRequest.getDBInstanceClass()));
        }
        if (describeOrderableDBInstanceOptionsRequest.getLicenseModel() != null) {
            request.addParameter("LicenseModel", StringUtils.fromString(describeOrderableDBInstanceOptionsRequest.getLicenseModel()));
        }
        if (describeOrderableDBInstanceOptionsRequest.isVpc() != null) {
            request.addParameter("Vpc", StringUtils.fromBoolean(describeOrderableDBInstanceOptionsRequest.isVpc()));
        }
        if (describeOrderableDBInstanceOptionsRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeOrderableDBInstanceOptionsRequest.getMaxRecords()));
        }
        if (describeOrderableDBInstanceOptionsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeOrderableDBInstanceOptionsRequest.getMarker()));
        }


        return request;
    }
}
