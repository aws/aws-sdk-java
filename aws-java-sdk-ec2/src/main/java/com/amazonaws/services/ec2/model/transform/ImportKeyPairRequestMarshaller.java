/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ImportKeyPairRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportKeyPairRequestMarshaller implements Marshaller<Request<ImportKeyPairRequest>, ImportKeyPairRequest> {

    public Request<ImportKeyPairRequest> marshall(ImportKeyPairRequest importKeyPairRequest) {

        if (importKeyPairRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ImportKeyPairRequest> request = new DefaultRequest<ImportKeyPairRequest>(importKeyPairRequest, "AmazonEC2");
        request.addParameter("Action", "ImportKeyPair");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (importKeyPairRequest.getKeyName() != null) {
            request.addParameter("KeyName", StringUtils.fromString(importKeyPairRequest.getKeyName()));
        }

        if (importKeyPairRequest.getPublicKeyMaterial() != null) {
            request.addParameter("PublicKeyMaterial", StringUtils.fromString(importKeyPairRequest.getPublicKeyMaterial()));
        }

        com.amazonaws.internal.SdkInternalList<TagSpecification> importKeyPairRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) importKeyPairRequest
                .getTagSpecifications();
        if (!importKeyPairRequestTagSpecificationsList.isEmpty() || !importKeyPairRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification importKeyPairRequestTagSpecificationsListValue : importKeyPairRequestTagSpecificationsList) {

                if (importKeyPairRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(importKeyPairRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) importKeyPairRequestTagSpecificationsListValue
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
