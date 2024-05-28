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
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeLockedSnapshotsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLockedSnapshotsRequestMarshaller implements Marshaller<Request<DescribeLockedSnapshotsRequest>, DescribeLockedSnapshotsRequest> {

    public Request<DescribeLockedSnapshotsRequest> marshall(DescribeLockedSnapshotsRequest describeLockedSnapshotsRequest) {

        if (describeLockedSnapshotsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeLockedSnapshotsRequest> request = new DefaultRequest<DescribeLockedSnapshotsRequest>(describeLockedSnapshotsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeLockedSnapshots");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeLockedSnapshotsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeLockedSnapshotsRequest
                .getFilters();
        if (!describeLockedSnapshotsRequestFiltersList.isEmpty() || !describeLockedSnapshotsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeLockedSnapshotsRequestFiltersListValue : describeLockedSnapshotsRequestFiltersList) {

                if (describeLockedSnapshotsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeLockedSnapshotsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeLockedSnapshotsRequestFiltersListValue
                        .getValues();
                if (!filterValuesList.isEmpty() || !filterValuesList.isAutoConstruct()) {
                    int valuesListIndex = 1;

                    for (String filterValuesListValue : filterValuesList) {
                        if (filterValuesListValue != null) {
                            request.addParameter("Filter." + filtersListIndex + ".Value." + valuesListIndex, StringUtils.fromString(filterValuesListValue));
                        }
                        valuesListIndex++;
                    }
                }
                filtersListIndex++;
            }
        }

        if (describeLockedSnapshotsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeLockedSnapshotsRequest.getMaxResults()));
        }

        if (describeLockedSnapshotsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeLockedSnapshotsRequest.getNextToken()));
        }

        com.amazonaws.internal.SdkInternalList<String> describeLockedSnapshotsRequestSnapshotIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeLockedSnapshotsRequest
                .getSnapshotIds();
        if (!describeLockedSnapshotsRequestSnapshotIdsList.isEmpty() || !describeLockedSnapshotsRequestSnapshotIdsList.isAutoConstruct()) {
            int snapshotIdsListIndex = 1;

            for (String describeLockedSnapshotsRequestSnapshotIdsListValue : describeLockedSnapshotsRequestSnapshotIdsList) {
                if (describeLockedSnapshotsRequestSnapshotIdsListValue != null) {
                    request.addParameter("SnapshotId." + snapshotIdsListIndex, StringUtils.fromString(describeLockedSnapshotsRequestSnapshotIdsListValue));
                }
                snapshotIdsListIndex++;
            }
        }

        return request;
    }

}
