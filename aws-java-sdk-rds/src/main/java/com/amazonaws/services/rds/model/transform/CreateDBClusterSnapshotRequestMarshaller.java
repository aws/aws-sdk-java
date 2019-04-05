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
package com.amazonaws.services.rds.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CreateDBClusterSnapshotRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDBClusterSnapshotRequestMarshaller implements Marshaller<Request<CreateDBClusterSnapshotRequest>, CreateDBClusterSnapshotRequest> {

    public Request<CreateDBClusterSnapshotRequest> marshall(CreateDBClusterSnapshotRequest createDBClusterSnapshotRequest) {

        if (createDBClusterSnapshotRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateDBClusterSnapshotRequest> request = new DefaultRequest<CreateDBClusterSnapshotRequest>(createDBClusterSnapshotRequest, "AmazonRDS");
        request.addParameter("Action", "CreateDBClusterSnapshot");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (createDBClusterSnapshotRequest.getDBClusterSnapshotIdentifier() != null) {
            request.addParameter("DBClusterSnapshotIdentifier", StringUtils.fromString(createDBClusterSnapshotRequest.getDBClusterSnapshotIdentifier()));
        }

        if (createDBClusterSnapshotRequest.getDBClusterIdentifier() != null) {
            request.addParameter("DBClusterIdentifier", StringUtils.fromString(createDBClusterSnapshotRequest.getDBClusterIdentifier()));
        }

        if (!createDBClusterSnapshotRequest.getTags().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Tag>) createDBClusterSnapshotRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createDBClusterSnapshotRequest.getTags();
            int tagsListIndex = 1;

            for (Tag tagsListValue : tagsList) {

                if (tagsListValue.getKey() != null) {
                    request.addParameter("Tags.Tag." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                }

                if (tagsListValue.getValue() != null) {
                    request.addParameter("Tags.Tag." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                }
                tagsListIndex++;
            }
        }

        return request;
    }

}
