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
 * BatchModifyClusterSnapshotsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchModifyClusterSnapshotsRequestMarshaller implements
        Marshaller<Request<BatchModifyClusterSnapshotsRequest>, BatchModifyClusterSnapshotsRequest> {

    public Request<BatchModifyClusterSnapshotsRequest> marshall(BatchModifyClusterSnapshotsRequest batchModifyClusterSnapshotsRequest) {

        if (batchModifyClusterSnapshotsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<BatchModifyClusterSnapshotsRequest> request = new DefaultRequest<BatchModifyClusterSnapshotsRequest>(batchModifyClusterSnapshotsRequest,
                "AmazonRedshift");
        request.addParameter("Action", "BatchModifyClusterSnapshots");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (!batchModifyClusterSnapshotsRequest.getSnapshotIdentifierList().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) batchModifyClusterSnapshotsRequest.getSnapshotIdentifierList()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> snapshotIdentifierListList = (com.amazonaws.internal.SdkInternalList<String>) batchModifyClusterSnapshotsRequest
                    .getSnapshotIdentifierList();
            int snapshotIdentifierListListIndex = 1;

            for (String snapshotIdentifierListListValue : snapshotIdentifierListList) {
                if (snapshotIdentifierListListValue != null) {
                    request.addParameter("SnapshotIdentifierList.String." + snapshotIdentifierListListIndex,
                            StringUtils.fromString(snapshotIdentifierListListValue));
                }
                snapshotIdentifierListListIndex++;
            }
        }

        if (batchModifyClusterSnapshotsRequest.getManualSnapshotRetentionPeriod() != null) {
            request.addParameter("ManualSnapshotRetentionPeriod",
                    StringUtils.fromInteger(batchModifyClusterSnapshotsRequest.getManualSnapshotRetentionPeriod()));
        }

        if (batchModifyClusterSnapshotsRequest.getForce() != null) {
            request.addParameter("Force", StringUtils.fromBoolean(batchModifyClusterSnapshotsRequest.getForce()));
        }

        return request;
    }

}
