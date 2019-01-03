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
 * BatchDeleteClusterSnapshotsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteClusterSnapshotsRequestMarshaller implements
        Marshaller<Request<BatchDeleteClusterSnapshotsRequest>, BatchDeleteClusterSnapshotsRequest> {

    public Request<BatchDeleteClusterSnapshotsRequest> marshall(BatchDeleteClusterSnapshotsRequest batchDeleteClusterSnapshotsRequest) {

        if (batchDeleteClusterSnapshotsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<BatchDeleteClusterSnapshotsRequest> request = new DefaultRequest<BatchDeleteClusterSnapshotsRequest>(batchDeleteClusterSnapshotsRequest,
                "AmazonRedshift");
        request.addParameter("Action", "BatchDeleteClusterSnapshots");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (!batchDeleteClusterSnapshotsRequest.getIdentifiers().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<DeleteClusterSnapshotMessage>) batchDeleteClusterSnapshotsRequest.getIdentifiers())
                        .isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<DeleteClusterSnapshotMessage> identifiersList = (com.amazonaws.internal.SdkInternalList<DeleteClusterSnapshotMessage>) batchDeleteClusterSnapshotsRequest
                    .getIdentifiers();
            int identifiersListIndex = 1;

            for (DeleteClusterSnapshotMessage identifiersListValue : identifiersList) {

                if (identifiersListValue.getSnapshotIdentifier() != null) {
                    request.addParameter("Identifiers.DeleteClusterSnapshotMessage." + identifiersListIndex + ".SnapshotIdentifier",
                            StringUtils.fromString(identifiersListValue.getSnapshotIdentifier()));
                }

                if (identifiersListValue.getSnapshotClusterIdentifier() != null) {
                    request.addParameter("Identifiers.DeleteClusterSnapshotMessage." + identifiersListIndex + ".SnapshotClusterIdentifier",
                            StringUtils.fromString(identifiersListValue.getSnapshotClusterIdentifier()));
                }
                identifiersListIndex++;
            }
        }

        return request;
    }

}
