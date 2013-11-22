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
 * Describe D B Engine Versions Request Marshaller
 */
public class DescribeDBEngineVersionsRequestMarshaller implements Marshaller<Request<DescribeDBEngineVersionsRequest>, DescribeDBEngineVersionsRequest> {

    public Request<DescribeDBEngineVersionsRequest> marshall(DescribeDBEngineVersionsRequest describeDBEngineVersionsRequest) {

        if (describeDBEngineVersionsRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DescribeDBEngineVersionsRequest> request = new DefaultRequest<DescribeDBEngineVersionsRequest>(describeDBEngineVersionsRequest, "AmazonRDS");
        request.addParameter("Action", "DescribeDBEngineVersions");
        request.addParameter("Version", "2013-09-09");

        if (describeDBEngineVersionsRequest.getEngine() != null) {
            request.addParameter("Engine", StringUtils.fromString(describeDBEngineVersionsRequest.getEngine()));
        }
        if (describeDBEngineVersionsRequest.getEngineVersion() != null) {
            request.addParameter("EngineVersion", StringUtils.fromString(describeDBEngineVersionsRequest.getEngineVersion()));
        }
        if (describeDBEngineVersionsRequest.getDBParameterGroupFamily() != null) {
            request.addParameter("DBParameterGroupFamily", StringUtils.fromString(describeDBEngineVersionsRequest.getDBParameterGroupFamily()));
        }
        if (describeDBEngineVersionsRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeDBEngineVersionsRequest.getMaxRecords()));
        }
        if (describeDBEngineVersionsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeDBEngineVersionsRequest.getMarker()));
        }
        if (describeDBEngineVersionsRequest.isDefaultOnly() != null) {
            request.addParameter("DefaultOnly", StringUtils.fromBoolean(describeDBEngineVersionsRequest.isDefaultOnly()));
        }
        if (describeDBEngineVersionsRequest.isListSupportedCharacterSets() != null) {
            request.addParameter("ListSupportedCharacterSets", StringUtils.fromBoolean(describeDBEngineVersionsRequest.isListSupportedCharacterSets()));
        }


        return request;
    }
}
