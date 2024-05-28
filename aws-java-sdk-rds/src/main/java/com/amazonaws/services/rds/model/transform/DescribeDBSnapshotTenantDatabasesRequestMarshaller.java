/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeDBSnapshotTenantDatabasesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBSnapshotTenantDatabasesRequestMarshaller implements
        Marshaller<Request<DescribeDBSnapshotTenantDatabasesRequest>, DescribeDBSnapshotTenantDatabasesRequest> {

    public Request<DescribeDBSnapshotTenantDatabasesRequest> marshall(DescribeDBSnapshotTenantDatabasesRequest describeDBSnapshotTenantDatabasesRequest) {

        if (describeDBSnapshotTenantDatabasesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeDBSnapshotTenantDatabasesRequest> request = new DefaultRequest<DescribeDBSnapshotTenantDatabasesRequest>(
                describeDBSnapshotTenantDatabasesRequest, "AmazonRDS");
        request.addParameter("Action", "DescribeDBSnapshotTenantDatabases");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeDBSnapshotTenantDatabasesRequest.getDBInstanceIdentifier() != null) {
            request.addParameter("DBInstanceIdentifier", StringUtils.fromString(describeDBSnapshotTenantDatabasesRequest.getDBInstanceIdentifier()));
        }

        if (describeDBSnapshotTenantDatabasesRequest.getDBSnapshotIdentifier() != null) {
            request.addParameter("DBSnapshotIdentifier", StringUtils.fromString(describeDBSnapshotTenantDatabasesRequest.getDBSnapshotIdentifier()));
        }

        if (describeDBSnapshotTenantDatabasesRequest.getSnapshotType() != null) {
            request.addParameter("SnapshotType", StringUtils.fromString(describeDBSnapshotTenantDatabasesRequest.getSnapshotType()));
        }

        if (!describeDBSnapshotTenantDatabasesRequest.getFilters().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Filter>) describeDBSnapshotTenantDatabasesRequest.getFilters()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Filter> filtersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeDBSnapshotTenantDatabasesRequest
                    .getFilters();
            int filtersListIndex = 1;

            for (Filter filtersListValue : filtersList) {
                if (filtersListValue != null) {

                    if (filtersListValue.getName() != null) {
                        request.addParameter("Filters.Filter." + filtersListIndex + ".Name", StringUtils.fromString(filtersListValue.getName()));
                    }

                    if (!filtersListValue.getValues().isEmpty()
                            || !((com.amazonaws.internal.SdkInternalList<String>) filtersListValue.getValues()).isAutoConstruct()) {
                        com.amazonaws.internal.SdkInternalList<String> valuesList = (com.amazonaws.internal.SdkInternalList<String>) filtersListValue
                                .getValues();
                        int valuesListIndex = 1;

                        for (String valuesListValue : valuesList) {
                            if (valuesListValue != null) {
                                request.addParameter("Filters.Filter." + filtersListIndex + ".Values.Value." + valuesListIndex,
                                        StringUtils.fromString(valuesListValue));
                            }
                            valuesListIndex++;
                        }
                    }
                }
                filtersListIndex++;
            }
        }

        if (describeDBSnapshotTenantDatabasesRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeDBSnapshotTenantDatabasesRequest.getMaxRecords()));
        }

        if (describeDBSnapshotTenantDatabasesRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeDBSnapshotTenantDatabasesRequest.getMarker()));
        }

        if (describeDBSnapshotTenantDatabasesRequest.getDbiResourceId() != null) {
            request.addParameter("DbiResourceId", StringUtils.fromString(describeDBSnapshotTenantDatabasesRequest.getDbiResourceId()));
        }

        return request;
    }

}
