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
 * Describe D B Snapshots Request Marshaller
 */
public class DescribeDBSnapshotsRequestMarshaller implements Marshaller<Request<DescribeDBSnapshotsRequest>, DescribeDBSnapshotsRequest> {

    public Request<DescribeDBSnapshotsRequest> marshall(DescribeDBSnapshotsRequest describeDBSnapshotsRequest) {

        if (describeDBSnapshotsRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DescribeDBSnapshotsRequest> request = new DefaultRequest<DescribeDBSnapshotsRequest>(describeDBSnapshotsRequest, "AmazonRDS");
        request.addParameter("Action", "DescribeDBSnapshots");
        request.addParameter("Version", "2013-09-09");

        if (describeDBSnapshotsRequest.getDBInstanceIdentifier() != null) {
            request.addParameter("DBInstanceIdentifier", StringUtils.fromString(describeDBSnapshotsRequest.getDBInstanceIdentifier()));
        }
        if (describeDBSnapshotsRequest.getDBSnapshotIdentifier() != null) {
            request.addParameter("DBSnapshotIdentifier", StringUtils.fromString(describeDBSnapshotsRequest.getDBSnapshotIdentifier()));
        }
        if (describeDBSnapshotsRequest.getSnapshotType() != null) {
            request.addParameter("SnapshotType", StringUtils.fromString(describeDBSnapshotsRequest.getSnapshotType()));
        }

        java.util.List<Filter> filtersList = describeDBSnapshotsRequest.getFilters();
        int filtersListIndex = 1;

        for (Filter filtersListValue : filtersList) {
            Filter filterMember = filtersListValue;
            if (filterMember != null) {
                if (filterMember.getFilterName() != null) {
                    request.addParameter("Filters.Filter." + filtersListIndex + ".FilterName", StringUtils.fromString(filterMember.getFilterName()));
                }

                java.util.List<String> filterValueList = filterMember.getFilterValue();
                int filterValueListIndex = 1;

                for (String filterValueListValue : filterValueList) {
                    if (filterValueListValue != null) {
                        request.addParameter("Filters.Filter." + filtersListIndex + ".FilterValue.Value." + filterValueListIndex, StringUtils.fromString(filterValueListValue));
                    }

                    filterValueListIndex++;
                }
            }

            filtersListIndex++;
        }
        if (describeDBSnapshotsRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeDBSnapshotsRequest.getMaxRecords()));
        }
        if (describeDBSnapshotsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeDBSnapshotsRequest.getMarker()));
        }


        return request;
    }
}
