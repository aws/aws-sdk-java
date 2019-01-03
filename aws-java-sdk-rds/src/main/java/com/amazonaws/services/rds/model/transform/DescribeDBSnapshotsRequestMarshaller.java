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
 * DescribeDBSnapshotsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBSnapshotsRequestMarshaller implements Marshaller<Request<DescribeDBSnapshotsRequest>, DescribeDBSnapshotsRequest> {

    public Request<DescribeDBSnapshotsRequest> marshall(DescribeDBSnapshotsRequest describeDBSnapshotsRequest) {

        if (describeDBSnapshotsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeDBSnapshotsRequest> request = new DefaultRequest<DescribeDBSnapshotsRequest>(describeDBSnapshotsRequest, "AmazonRDS");
        request.addParameter("Action", "DescribeDBSnapshots");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeDBSnapshotsRequest.getDBInstanceIdentifier() != null) {
            request.addParameter("DBInstanceIdentifier", StringUtils.fromString(describeDBSnapshotsRequest.getDBInstanceIdentifier()));
        }

        if (describeDBSnapshotsRequest.getDBSnapshotIdentifier() != null) {
            request.addParameter("DBSnapshotIdentifier", StringUtils.fromString(describeDBSnapshotsRequest.getDBSnapshotIdentifier()));
        }

        if (describeDBSnapshotsRequest.getSnapshotType() != null) {
            request.addParameter("SnapshotType", StringUtils.fromString(describeDBSnapshotsRequest.getSnapshotType()));
        }

        if (!describeDBSnapshotsRequest.getFilters().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Filter>) describeDBSnapshotsRequest.getFilters()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Filter> filtersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeDBSnapshotsRequest
                    .getFilters();
            int filtersListIndex = 1;

            for (Filter filtersListValue : filtersList) {

                if (filtersListValue.getName() != null) {
                    request.addParameter("Filters.Filter." + filtersListIndex + ".Name", StringUtils.fromString(filtersListValue.getName()));
                }

                if (!filtersListValue.getValues().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<String>) filtersListValue.getValues()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<String> valuesList = (com.amazonaws.internal.SdkInternalList<String>) filtersListValue.getValues();
                    int valuesListIndex = 1;

                    for (String valuesListValue : valuesList) {
                        if (valuesListValue != null) {
                            request.addParameter("Filters.Filter." + filtersListIndex + ".Values.Value." + valuesListIndex,
                                    StringUtils.fromString(valuesListValue));
                        }
                        valuesListIndex++;
                    }
                }
                filtersListIndex++;
            }
        }

        if (describeDBSnapshotsRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeDBSnapshotsRequest.getMaxRecords()));
        }

        if (describeDBSnapshotsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeDBSnapshotsRequest.getMarker()));
        }

        if (describeDBSnapshotsRequest.getIncludeShared() != null) {
            request.addParameter("IncludeShared", StringUtils.fromBoolean(describeDBSnapshotsRequest.getIncludeShared()));
        }

        if (describeDBSnapshotsRequest.getIncludePublic() != null) {
            request.addParameter("IncludePublic", StringUtils.fromBoolean(describeDBSnapshotsRequest.getIncludePublic()));
        }

        if (describeDBSnapshotsRequest.getDbiResourceId() != null) {
            request.addParameter("DbiResourceId", StringUtils.fromString(describeDBSnapshotsRequest.getDbiResourceId()));
        }

        return request;
    }

}
