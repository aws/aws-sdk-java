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
 * CopyDBSnapshotRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyDBSnapshotRequestMarshaller implements Marshaller<Request<CopyDBSnapshotRequest>, CopyDBSnapshotRequest> {

    public Request<CopyDBSnapshotRequest> marshall(CopyDBSnapshotRequest copyDBSnapshotRequest) {

        if (copyDBSnapshotRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CopyDBSnapshotRequest> request = new DefaultRequest<CopyDBSnapshotRequest>(copyDBSnapshotRequest, "AmazonRDS");
        request.addParameter("Action", "CopyDBSnapshot");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (copyDBSnapshotRequest.getSourceDBSnapshotIdentifier() != null) {
            request.addParameter("SourceDBSnapshotIdentifier", StringUtils.fromString(copyDBSnapshotRequest.getSourceDBSnapshotIdentifier()));
        }

        if (copyDBSnapshotRequest.getTargetDBSnapshotIdentifier() != null) {
            request.addParameter("TargetDBSnapshotIdentifier", StringUtils.fromString(copyDBSnapshotRequest.getTargetDBSnapshotIdentifier()));
        }

        if (copyDBSnapshotRequest.getKmsKeyId() != null) {
            request.addParameter("KmsKeyId", StringUtils.fromString(copyDBSnapshotRequest.getKmsKeyId()));
        }

        if (!copyDBSnapshotRequest.getTags().isEmpty() || !((com.amazonaws.internal.SdkInternalList<Tag>) copyDBSnapshotRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) copyDBSnapshotRequest.getTags();
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

        if (copyDBSnapshotRequest.getCopyTags() != null) {
            request.addParameter("CopyTags", StringUtils.fromBoolean(copyDBSnapshotRequest.getCopyTags()));
        }

        if (copyDBSnapshotRequest.getPreSignedUrl() != null) {
            request.addParameter("PreSignedUrl", StringUtils.fromString(copyDBSnapshotRequest.getPreSignedUrl()));
        }

        if (copyDBSnapshotRequest.getOptionGroupName() != null) {
            request.addParameter("OptionGroupName", StringUtils.fromString(copyDBSnapshotRequest.getOptionGroupName()));
        }

        if (copyDBSnapshotRequest.getSourceRegion() != null) {
            request.addParameter("SourceRegion", StringUtils.fromString(copyDBSnapshotRequest.getSourceRegion()));
        }

        return request;
    }

}
