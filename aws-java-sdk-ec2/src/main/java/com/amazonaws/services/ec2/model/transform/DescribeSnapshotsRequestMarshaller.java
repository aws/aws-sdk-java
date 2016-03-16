/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * DescribeSnapshotsRequest Marshaller
 */

public class DescribeSnapshotsRequestMarshaller implements
        Marshaller<Request<DescribeSnapshotsRequest>, DescribeSnapshotsRequest> {

    public Request<DescribeSnapshotsRequest> marshall(
            DescribeSnapshotsRequest describeSnapshotsRequest) {

        if (describeSnapshotsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DescribeSnapshotsRequest> request = new DefaultRequest<DescribeSnapshotsRequest>(
                describeSnapshotsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeSnapshots");
        request.addParameter("Version", "2015-10-01");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> snapshotIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeSnapshotsRequest
                .getSnapshotIds();
        if (!snapshotIdsList.isEmpty() || !snapshotIdsList.isAutoConstruct()) {
            int snapshotIdsListIndex = 1;

            for (String snapshotIdsListValue : snapshotIdsList) {
                if (snapshotIdsListValue != null) {
                    request.addParameter("SnapshotId." + snapshotIdsListIndex,
                            StringUtils.fromString(snapshotIdsListValue));
                }
                snapshotIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> ownerIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeSnapshotsRequest
                .getOwnerIds();
        if (!ownerIdsList.isEmpty() || !ownerIdsList.isAutoConstruct()) {
            int ownerIdsListIndex = 1;

            for (String ownerIdsListValue : ownerIdsList) {
                if (ownerIdsListValue != null) {
                    request.addParameter("Owner." + ownerIdsListIndex,
                            StringUtils.fromString(ownerIdsListValue));
                }
                ownerIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> restorableByUserIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeSnapshotsRequest
                .getRestorableByUserIds();
        if (!restorableByUserIdsList.isEmpty()
                || !restorableByUserIdsList.isAutoConstruct()) {
            int restorableByUserIdsListIndex = 1;

            for (String restorableByUserIdsListValue : restorableByUserIdsList) {
                if (restorableByUserIdsListValue != null) {
                    request.addParameter("RestorableBy."
                            + restorableByUserIdsListIndex, StringUtils
                            .fromString(restorableByUserIdsListValue));
                }
                restorableByUserIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> filtersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeSnapshotsRequest
                .getFilters();
        if (!filtersList.isEmpty() || !filtersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter filtersListValue : filtersList) {

                if (filtersListValue.getName() != null) {
                    request.addParameter(
                            "Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(filtersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> valuesList = (com.amazonaws.internal.SdkInternalList<String>) filtersListValue
                        .getValues();
                if (!valuesList.isEmpty() || !valuesList.isAutoConstruct()) {
                    int valuesListIndex = 1;

                    for (String valuesListValue : valuesList) {
                        if (valuesListValue != null) {
                            request.addParameter("Filter." + filtersListIndex
                                    + ".Value." + valuesListIndex,
                                    StringUtils.fromString(valuesListValue));
                        }
                        valuesListIndex++;
                    }
                }
                filtersListIndex++;
            }
        }

        if (describeSnapshotsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils
                    .fromString(describeSnapshotsRequest.getNextToken()));
        }

        if (describeSnapshotsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils
                    .fromInteger(describeSnapshotsRequest.getMaxResults()));
        }

        return request;
    }

}
