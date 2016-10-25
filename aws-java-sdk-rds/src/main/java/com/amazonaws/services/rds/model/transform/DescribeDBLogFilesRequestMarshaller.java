/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * DescribeDBLogFilesRequest Marshaller
 */

public class DescribeDBLogFilesRequestMarshaller implements Marshaller<Request<DescribeDBLogFilesRequest>, DescribeDBLogFilesRequest> {

    public Request<DescribeDBLogFilesRequest> marshall(DescribeDBLogFilesRequest describeDBLogFilesRequest) {

        if (describeDBLogFilesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeDBLogFilesRequest> request = new DefaultRequest<DescribeDBLogFilesRequest>(describeDBLogFilesRequest, "AmazonRDS");
        request.addParameter("Action", "DescribeDBLogFiles");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeDBLogFilesRequest.getDBInstanceIdentifier() != null) {
            request.addParameter("DBInstanceIdentifier", StringUtils.fromString(describeDBLogFilesRequest.getDBInstanceIdentifier()));
        }

        if (describeDBLogFilesRequest.getFilenameContains() != null) {
            request.addParameter("FilenameContains", StringUtils.fromString(describeDBLogFilesRequest.getFilenameContains()));
        }

        if (describeDBLogFilesRequest.getFileLastWritten() != null) {
            request.addParameter("FileLastWritten", StringUtils.fromLong(describeDBLogFilesRequest.getFileLastWritten()));
        }

        if (describeDBLogFilesRequest.getFileSize() != null) {
            request.addParameter("FileSize", StringUtils.fromLong(describeDBLogFilesRequest.getFileSize()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> filtersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeDBLogFilesRequest.getFilters();
        if (!filtersList.isEmpty() || !filtersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter filtersListValue : filtersList) {

                if (filtersListValue.getName() != null) {
                    request.addParameter("Filters.Filter." + filtersListIndex + ".Name", StringUtils.fromString(filtersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> valuesList = (com.amazonaws.internal.SdkInternalList<String>) filtersListValue.getValues();
                if (!valuesList.isEmpty() || !valuesList.isAutoConstruct()) {
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

        if (describeDBLogFilesRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeDBLogFilesRequest.getMaxRecords()));
        }

        if (describeDBLogFilesRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeDBLogFilesRequest.getMarker()));
        }

        return request;
    }

}
