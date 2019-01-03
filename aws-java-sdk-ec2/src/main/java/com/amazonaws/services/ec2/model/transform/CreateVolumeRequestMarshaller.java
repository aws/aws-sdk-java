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
 * CreateVolumeRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVolumeRequestMarshaller implements Marshaller<Request<CreateVolumeRequest>, CreateVolumeRequest> {

    public Request<CreateVolumeRequest> marshall(CreateVolumeRequest createVolumeRequest) {

        if (createVolumeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateVolumeRequest> request = new DefaultRequest<CreateVolumeRequest>(createVolumeRequest, "AmazonEC2");
        request.addParameter("Action", "CreateVolume");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createVolumeRequest.getAvailabilityZone() != null) {
            request.addParameter("AvailabilityZone", StringUtils.fromString(createVolumeRequest.getAvailabilityZone()));
        }

        if (createVolumeRequest.getEncrypted() != null) {
            request.addParameter("Encrypted", StringUtils.fromBoolean(createVolumeRequest.getEncrypted()));
        }

        if (createVolumeRequest.getIops() != null) {
            request.addParameter("Iops", StringUtils.fromInteger(createVolumeRequest.getIops()));
        }

        if (createVolumeRequest.getKmsKeyId() != null) {
            request.addParameter("KmsKeyId", StringUtils.fromString(createVolumeRequest.getKmsKeyId()));
        }

        if (createVolumeRequest.getSize() != null) {
            request.addParameter("Size", StringUtils.fromInteger(createVolumeRequest.getSize()));
        }

        if (createVolumeRequest.getSnapshotId() != null) {
            request.addParameter("SnapshotId", StringUtils.fromString(createVolumeRequest.getSnapshotId()));
        }

        if (createVolumeRequest.getVolumeType() != null) {
            request.addParameter("VolumeType", StringUtils.fromString(createVolumeRequest.getVolumeType()));
        }

        com.amazonaws.internal.SdkInternalList<TagSpecification> createVolumeRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) createVolumeRequest
                .getTagSpecifications();
        if (!createVolumeRequestTagSpecificationsList.isEmpty() || !createVolumeRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification createVolumeRequestTagSpecificationsListValue : createVolumeRequestTagSpecificationsList) {

                if (createVolumeRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(createVolumeRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createVolumeRequestTagSpecificationsListValue
                        .getTags();
                if (!tagSpecificationTagsList.isEmpty() || !tagSpecificationTagsList.isAutoConstruct()) {
                    int tagsListIndex = 1;

                    for (Tag tagSpecificationTagsListValue : tagSpecificationTagsList) {

                        if (tagSpecificationTagsListValue.getKey() != null) {
                            request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".Tag." + tagsListIndex + ".Key",
                                    StringUtils.fromString(tagSpecificationTagsListValue.getKey()));
                        }

                        if (tagSpecificationTagsListValue.getValue() != null) {
                            request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".Tag." + tagsListIndex + ".Value",
                                    StringUtils.fromString(tagSpecificationTagsListValue.getValue()));
                        }
                        tagsListIndex++;
                    }
                }
                tagSpecificationsListIndex++;
            }
        }

        return request;
    }

}
