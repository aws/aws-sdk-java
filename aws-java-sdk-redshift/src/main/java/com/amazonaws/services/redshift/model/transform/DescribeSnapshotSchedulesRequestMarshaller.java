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
 * DescribeSnapshotSchedulesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSnapshotSchedulesRequestMarshaller implements Marshaller<Request<DescribeSnapshotSchedulesRequest>, DescribeSnapshotSchedulesRequest> {

    public Request<DescribeSnapshotSchedulesRequest> marshall(DescribeSnapshotSchedulesRequest describeSnapshotSchedulesRequest) {

        if (describeSnapshotSchedulesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeSnapshotSchedulesRequest> request = new DefaultRequest<DescribeSnapshotSchedulesRequest>(describeSnapshotSchedulesRequest,
                "AmazonRedshift");
        request.addParameter("Action", "DescribeSnapshotSchedules");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeSnapshotSchedulesRequest.getClusterIdentifier() != null) {
            request.addParameter("ClusterIdentifier", StringUtils.fromString(describeSnapshotSchedulesRequest.getClusterIdentifier()));
        }

        if (describeSnapshotSchedulesRequest.getScheduleIdentifier() != null) {
            request.addParameter("ScheduleIdentifier", StringUtils.fromString(describeSnapshotSchedulesRequest.getScheduleIdentifier()));
        }

        if (!describeSnapshotSchedulesRequest.getTagKeys().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) describeSnapshotSchedulesRequest.getTagKeys()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> tagKeysList = (com.amazonaws.internal.SdkInternalList<String>) describeSnapshotSchedulesRequest
                    .getTagKeys();
            int tagKeysListIndex = 1;

            for (String tagKeysListValue : tagKeysList) {
                if (tagKeysListValue != null) {
                    request.addParameter("TagKeys.TagKey." + tagKeysListIndex, StringUtils.fromString(tagKeysListValue));
                }
                tagKeysListIndex++;
            }
        }

        if (!describeSnapshotSchedulesRequest.getTagValues().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) describeSnapshotSchedulesRequest.getTagValues()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> tagValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeSnapshotSchedulesRequest
                    .getTagValues();
            int tagValuesListIndex = 1;

            for (String tagValuesListValue : tagValuesList) {
                if (tagValuesListValue != null) {
                    request.addParameter("TagValues.TagValue." + tagValuesListIndex, StringUtils.fromString(tagValuesListValue));
                }
                tagValuesListIndex++;
            }
        }

        if (describeSnapshotSchedulesRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeSnapshotSchedulesRequest.getMarker()));
        }

        if (describeSnapshotSchedulesRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeSnapshotSchedulesRequest.getMaxRecords()));
        }

        return request;
    }

}
