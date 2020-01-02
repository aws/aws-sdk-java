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
 * EnableFastSnapshotRestoresRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableFastSnapshotRestoresRequestMarshaller implements Marshaller<Request<EnableFastSnapshotRestoresRequest>, EnableFastSnapshotRestoresRequest> {

    public Request<EnableFastSnapshotRestoresRequest> marshall(EnableFastSnapshotRestoresRequest enableFastSnapshotRestoresRequest) {

        if (enableFastSnapshotRestoresRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<EnableFastSnapshotRestoresRequest> request = new DefaultRequest<EnableFastSnapshotRestoresRequest>(enableFastSnapshotRestoresRequest,
                "AmazonEC2");
        request.addParameter("Action", "EnableFastSnapshotRestores");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> enableFastSnapshotRestoresRequestAvailabilityZonesList = (com.amazonaws.internal.SdkInternalList<String>) enableFastSnapshotRestoresRequest
                .getAvailabilityZones();
        if (!enableFastSnapshotRestoresRequestAvailabilityZonesList.isEmpty() || !enableFastSnapshotRestoresRequestAvailabilityZonesList.isAutoConstruct()) {
            int availabilityZonesListIndex = 1;

            for (String enableFastSnapshotRestoresRequestAvailabilityZonesListValue : enableFastSnapshotRestoresRequestAvailabilityZonesList) {
                if (enableFastSnapshotRestoresRequestAvailabilityZonesListValue != null) {
                    request.addParameter("AvailabilityZone." + availabilityZonesListIndex,
                            StringUtils.fromString(enableFastSnapshotRestoresRequestAvailabilityZonesListValue));
                }
                availabilityZonesListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> enableFastSnapshotRestoresRequestSourceSnapshotIdsList = (com.amazonaws.internal.SdkInternalList<String>) enableFastSnapshotRestoresRequest
                .getSourceSnapshotIds();
        if (!enableFastSnapshotRestoresRequestSourceSnapshotIdsList.isEmpty() || !enableFastSnapshotRestoresRequestSourceSnapshotIdsList.isAutoConstruct()) {
            int sourceSnapshotIdsListIndex = 1;

            for (String enableFastSnapshotRestoresRequestSourceSnapshotIdsListValue : enableFastSnapshotRestoresRequestSourceSnapshotIdsList) {
                if (enableFastSnapshotRestoresRequestSourceSnapshotIdsListValue != null) {
                    request.addParameter("SourceSnapshotId." + sourceSnapshotIdsListIndex,
                            StringUtils.fromString(enableFastSnapshotRestoresRequestSourceSnapshotIdsListValue));
                }
                sourceSnapshotIdsListIndex++;
            }
        }

        return request;
    }

}
