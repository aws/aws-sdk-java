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
 * DescribeSnapshotsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSnapshotsRequestMarshaller implements Marshaller<Request<DescribeSnapshotsRequest>, DescribeSnapshotsRequest> {

    public Request<DescribeSnapshotsRequest> marshall(DescribeSnapshotsRequest describeSnapshotsRequest) {

        if (describeSnapshotsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeSnapshotsRequest> request = new DefaultRequest<DescribeSnapshotsRequest>(describeSnapshotsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeSnapshots");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeSnapshotsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeSnapshotsRequest
                .getFilters();
        if (!describeSnapshotsRequestFiltersList.isEmpty() || !describeSnapshotsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeSnapshotsRequestFiltersListValue : describeSnapshotsRequestFiltersList) {

                if (describeSnapshotsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(describeSnapshotsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeSnapshotsRequestFiltersListValue
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

        if (describeSnapshotsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeSnapshotsRequest.getMaxResults()));
        }

        if (describeSnapshotsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeSnapshotsRequest.getNextToken()));
        }

        com.amazonaws.internal.SdkInternalList<String> describeSnapshotsRequestOwnerIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeSnapshotsRequest
                .getOwnerIds();
        if (!describeSnapshotsRequestOwnerIdsList.isEmpty() || !describeSnapshotsRequestOwnerIdsList.isAutoConstruct()) {
            int ownerIdsListIndex = 1;

            for (String describeSnapshotsRequestOwnerIdsListValue : describeSnapshotsRequestOwnerIdsList) {
                if (describeSnapshotsRequestOwnerIdsListValue != null) {
                    request.addParameter("Owner." + ownerIdsListIndex, StringUtils.fromString(describeSnapshotsRequestOwnerIdsListValue));
                }
                ownerIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> describeSnapshotsRequestRestorableByUserIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeSnapshotsRequest
                .getRestorableByUserIds();
        if (!describeSnapshotsRequestRestorableByUserIdsList.isEmpty() || !describeSnapshotsRequestRestorableByUserIdsList.isAutoConstruct()) {
            int restorableByUserIdsListIndex = 1;

            for (String describeSnapshotsRequestRestorableByUserIdsListValue : describeSnapshotsRequestRestorableByUserIdsList) {
                if (describeSnapshotsRequestRestorableByUserIdsListValue != null) {
                    request.addParameter("RestorableBy." + restorableByUserIdsListIndex,
                            StringUtils.fromString(describeSnapshotsRequestRestorableByUserIdsListValue));
                }
                restorableByUserIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> describeSnapshotsRequestSnapshotIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeSnapshotsRequest
                .getSnapshotIds();
        if (!describeSnapshotsRequestSnapshotIdsList.isEmpty() || !describeSnapshotsRequestSnapshotIdsList.isAutoConstruct()) {
            int snapshotIdsListIndex = 1;

            for (String describeSnapshotsRequestSnapshotIdsListValue : describeSnapshotsRequestSnapshotIdsList) {
                if (describeSnapshotsRequestSnapshotIdsListValue != null) {
                    request.addParameter("SnapshotId." + snapshotIdsListIndex, StringUtils.fromString(describeSnapshotsRequestSnapshotIdsListValue));
                }
                snapshotIdsListIndex++;
            }
        }

        return request;
    }

}
