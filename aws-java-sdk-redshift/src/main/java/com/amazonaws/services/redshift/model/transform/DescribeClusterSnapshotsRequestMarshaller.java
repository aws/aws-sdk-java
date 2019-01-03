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
package com.amazonaws.services.redshift.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeClusterSnapshotsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeClusterSnapshotsRequestMarshaller implements Marshaller<Request<DescribeClusterSnapshotsRequest>, DescribeClusterSnapshotsRequest> {

    public Request<DescribeClusterSnapshotsRequest> marshall(DescribeClusterSnapshotsRequest describeClusterSnapshotsRequest) {

        if (describeClusterSnapshotsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeClusterSnapshotsRequest> request = new DefaultRequest<DescribeClusterSnapshotsRequest>(describeClusterSnapshotsRequest,
                "AmazonRedshift");
        request.addParameter("Action", "DescribeClusterSnapshots");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeClusterSnapshotsRequest.getClusterIdentifier() != null) {
            request.addParameter("ClusterIdentifier", StringUtils.fromString(describeClusterSnapshotsRequest.getClusterIdentifier()));
        }

        if (describeClusterSnapshotsRequest.getSnapshotIdentifier() != null) {
            request.addParameter("SnapshotIdentifier", StringUtils.fromString(describeClusterSnapshotsRequest.getSnapshotIdentifier()));
        }

        if (describeClusterSnapshotsRequest.getSnapshotType() != null) {
            request.addParameter("SnapshotType", StringUtils.fromString(describeClusterSnapshotsRequest.getSnapshotType()));
        }

        if (describeClusterSnapshotsRequest.getStartTime() != null) {
            request.addParameter("StartTime", StringUtils.fromDate(describeClusterSnapshotsRequest.getStartTime()));
        }

        if (describeClusterSnapshotsRequest.getEndTime() != null) {
            request.addParameter("EndTime", StringUtils.fromDate(describeClusterSnapshotsRequest.getEndTime()));
        }

        if (describeClusterSnapshotsRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeClusterSnapshotsRequest.getMaxRecords()));
        }

        if (describeClusterSnapshotsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeClusterSnapshotsRequest.getMarker()));
        }

        if (describeClusterSnapshotsRequest.getOwnerAccount() != null) {
            request.addParameter("OwnerAccount", StringUtils.fromString(describeClusterSnapshotsRequest.getOwnerAccount()));
        }

        if (!describeClusterSnapshotsRequest.getTagKeys().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) describeClusterSnapshotsRequest.getTagKeys()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> tagKeysList = (com.amazonaws.internal.SdkInternalList<String>) describeClusterSnapshotsRequest
                    .getTagKeys();
            int tagKeysListIndex = 1;

            for (String tagKeysListValue : tagKeysList) {
                if (tagKeysListValue != null) {
                    request.addParameter("TagKeys.TagKey." + tagKeysListIndex, StringUtils.fromString(tagKeysListValue));
                }
                tagKeysListIndex++;
            }
        }

        if (!describeClusterSnapshotsRequest.getTagValues().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) describeClusterSnapshotsRequest.getTagValues()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> tagValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeClusterSnapshotsRequest
                    .getTagValues();
            int tagValuesListIndex = 1;

            for (String tagValuesListValue : tagValuesList) {
                if (tagValuesListValue != null) {
                    request.addParameter("TagValues.TagValue." + tagValuesListIndex, StringUtils.fromString(tagValuesListValue));
                }
                tagValuesListIndex++;
            }
        }

        if (describeClusterSnapshotsRequest.getClusterExists() != null) {
            request.addParameter("ClusterExists", StringUtils.fromBoolean(describeClusterSnapshotsRequest.getClusterExists()));
        }

        if (!describeClusterSnapshotsRequest.getSortingEntities().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<SnapshotSortingEntity>) describeClusterSnapshotsRequest.getSortingEntities()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<SnapshotSortingEntity> sortingEntitiesList = (com.amazonaws.internal.SdkInternalList<SnapshotSortingEntity>) describeClusterSnapshotsRequest
                    .getSortingEntities();
            int sortingEntitiesListIndex = 1;

            for (SnapshotSortingEntity sortingEntitiesListValue : sortingEntitiesList) {

                if (sortingEntitiesListValue.getAttribute() != null) {
                    request.addParameter("SortingEntities.SnapshotSortingEntity." + sortingEntitiesListIndex + ".Attribute",
                            StringUtils.fromString(sortingEntitiesListValue.getAttribute()));
                }

                if (sortingEntitiesListValue.getSortOrder() != null) {
                    request.addParameter("SortingEntities.SnapshotSortingEntity." + sortingEntitiesListIndex + ".SortOrder",
                            StringUtils.fromString(sortingEntitiesListValue.getSortOrder()));
                }
                sortingEntitiesListIndex++;
            }
        }

        return request;
    }

}
