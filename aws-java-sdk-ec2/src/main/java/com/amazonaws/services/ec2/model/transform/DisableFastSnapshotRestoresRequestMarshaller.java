/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DisableFastSnapshotRestoresRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisableFastSnapshotRestoresRequestMarshaller implements
        Marshaller<Request<DisableFastSnapshotRestoresRequest>, DisableFastSnapshotRestoresRequest> {

    public Request<DisableFastSnapshotRestoresRequest> marshall(DisableFastSnapshotRestoresRequest disableFastSnapshotRestoresRequest) {

        if (disableFastSnapshotRestoresRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DisableFastSnapshotRestoresRequest> request = new DefaultRequest<DisableFastSnapshotRestoresRequest>(disableFastSnapshotRestoresRequest,
                "AmazonEC2");
        request.addParameter("Action", "DisableFastSnapshotRestores");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> disableFastSnapshotRestoresRequestAvailabilityZonesList = (com.amazonaws.internal.SdkInternalList<String>) disableFastSnapshotRestoresRequest
                .getAvailabilityZones();
        if (!disableFastSnapshotRestoresRequestAvailabilityZonesList.isEmpty() || !disableFastSnapshotRestoresRequestAvailabilityZonesList.isAutoConstruct()) {
            int availabilityZonesListIndex = 1;

            for (String disableFastSnapshotRestoresRequestAvailabilityZonesListValue : disableFastSnapshotRestoresRequestAvailabilityZonesList) {
                if (disableFastSnapshotRestoresRequestAvailabilityZonesListValue != null) {
                    request.addParameter("AvailabilityZone." + availabilityZonesListIndex,
                            StringUtils.fromString(disableFastSnapshotRestoresRequestAvailabilityZonesListValue));
                }
                availabilityZonesListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> disableFastSnapshotRestoresRequestSourceSnapshotIdsList = (com.amazonaws.internal.SdkInternalList<String>) disableFastSnapshotRestoresRequest
                .getSourceSnapshotIds();
        if (!disableFastSnapshotRestoresRequestSourceSnapshotIdsList.isEmpty() || !disableFastSnapshotRestoresRequestSourceSnapshotIdsList.isAutoConstruct()) {
            int sourceSnapshotIdsListIndex = 1;

            for (String disableFastSnapshotRestoresRequestSourceSnapshotIdsListValue : disableFastSnapshotRestoresRequestSourceSnapshotIdsList) {
                if (disableFastSnapshotRestoresRequestSourceSnapshotIdsListValue != null) {
                    request.addParameter("SourceSnapshotId." + sourceSnapshotIdsListIndex,
                            StringUtils.fromString(disableFastSnapshotRestoresRequestSourceSnapshotIdsListValue));
                }
                sourceSnapshotIdsListIndex++;
            }
        }

        return request;
    }

}
