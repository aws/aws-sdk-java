/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * CreateCustomDBEngineVersionRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCustomDBEngineVersionRequestMarshaller implements
        Marshaller<Request<CreateCustomDBEngineVersionRequest>, CreateCustomDBEngineVersionRequest> {

    public Request<CreateCustomDBEngineVersionRequest> marshall(CreateCustomDBEngineVersionRequest createCustomDBEngineVersionRequest) {

        if (createCustomDBEngineVersionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateCustomDBEngineVersionRequest> request = new DefaultRequest<CreateCustomDBEngineVersionRequest>(createCustomDBEngineVersionRequest,
                "AmazonRDS");
        request.addParameter("Action", "CreateCustomDBEngineVersion");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (createCustomDBEngineVersionRequest.getEngine() != null) {
            request.addParameter("Engine", StringUtils.fromString(createCustomDBEngineVersionRequest.getEngine()));
        }

        if (createCustomDBEngineVersionRequest.getEngineVersion() != null) {
            request.addParameter("EngineVersion", StringUtils.fromString(createCustomDBEngineVersionRequest.getEngineVersion()));
        }

        if (createCustomDBEngineVersionRequest.getDatabaseInstallationFilesS3BucketName() != null) {
            request.addParameter("DatabaseInstallationFilesS3BucketName",
                    StringUtils.fromString(createCustomDBEngineVersionRequest.getDatabaseInstallationFilesS3BucketName()));
        }

        if (createCustomDBEngineVersionRequest.getDatabaseInstallationFilesS3Prefix() != null) {
            request.addParameter("DatabaseInstallationFilesS3Prefix",
                    StringUtils.fromString(createCustomDBEngineVersionRequest.getDatabaseInstallationFilesS3Prefix()));
        }

        if (createCustomDBEngineVersionRequest.getImageId() != null) {
            request.addParameter("ImageId", StringUtils.fromString(createCustomDBEngineVersionRequest.getImageId()));
        }

        if (createCustomDBEngineVersionRequest.getKMSKeyId() != null) {
            request.addParameter("KMSKeyId", StringUtils.fromString(createCustomDBEngineVersionRequest.getKMSKeyId()));
        }

        if (createCustomDBEngineVersionRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createCustomDBEngineVersionRequest.getDescription()));
        }

        if (createCustomDBEngineVersionRequest.getManifest() != null) {
            request.addParameter("Manifest", StringUtils.fromString(createCustomDBEngineVersionRequest.getManifest()));
        }

        if (!createCustomDBEngineVersionRequest.getTags().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Tag>) createCustomDBEngineVersionRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createCustomDBEngineVersionRequest.getTags();
            int tagsListIndex = 1;

            for (Tag tagsListValue : tagsList) {
                if (tagsListValue != null) {

                    if (tagsListValue.getKey() != null) {
                        request.addParameter("Tags.Tag." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                    }

                    if (tagsListValue.getValue() != null) {
                        request.addParameter("Tags.Tag." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                    }
                }
                tagsListIndex++;
            }
        }

        return request;
    }

}
