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
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Describe Snapshots Request Marshaller
 */
public class DescribeSnapshotsRequestMarshaller implements Marshaller<Request<DescribeSnapshotsRequest>, DescribeSnapshotsRequest> {

    public Request<DescribeSnapshotsRequest> marshall(DescribeSnapshotsRequest describeSnapshotsRequest) {

        if (describeSnapshotsRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DescribeSnapshotsRequest> request = new DefaultRequest<DescribeSnapshotsRequest>(describeSnapshotsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeSnapshots");
        request.addParameter("Version", "2013-10-15");


        java.util.List<String> snapshotIdsList = describeSnapshotsRequest.getSnapshotIds();
        int snapshotIdsListIndex = 1;

        for (String snapshotIdsListValue : snapshotIdsList) {
            if (snapshotIdsListValue != null) {
                request.addParameter("SnapshotId." + snapshotIdsListIndex, StringUtils.fromString(snapshotIdsListValue));
            }

            snapshotIdsListIndex++;
        }

        java.util.List<String> ownerIdsList = describeSnapshotsRequest.getOwnerIds();
        int ownerIdsListIndex = 1;

        for (String ownerIdsListValue : ownerIdsList) {
            if (ownerIdsListValue != null) {
                request.addParameter("Owner." + ownerIdsListIndex, StringUtils.fromString(ownerIdsListValue));
            }

            ownerIdsListIndex++;
        }

        java.util.List<String> restorableByUserIdsList = describeSnapshotsRequest.getRestorableByUserIds();
        int restorableByUserIdsListIndex = 1;

        for (String restorableByUserIdsListValue : restorableByUserIdsList) {
            if (restorableByUserIdsListValue != null) {
                request.addParameter("RestorableBy." + restorableByUserIdsListIndex, StringUtils.fromString(restorableByUserIdsListValue));
            }

            restorableByUserIdsListIndex++;
        }

        java.util.List<Filter> filtersList = describeSnapshotsRequest.getFilters();
        int filtersListIndex = 1;

        for (Filter filtersListValue : filtersList) {
            Filter filterMember = filtersListValue;
            if (filterMember != null) {
                if (filterMember.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(filterMember.getName()));
                }

                java.util.List<String> valuesList = filterMember.getValues();
                int valuesListIndex = 1;

                for (String valuesListValue : valuesList) {
                    if (valuesListValue != null) {
                        request.addParameter("Filter." + filtersListIndex + ".Value." + valuesListIndex, StringUtils.fromString(valuesListValue));
                    }

                    valuesListIndex++;
                }
            }

            filtersListIndex++;
        }


        return request;
    }
}
