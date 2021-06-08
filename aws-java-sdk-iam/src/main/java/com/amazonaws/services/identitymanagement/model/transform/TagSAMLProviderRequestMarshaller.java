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
package com.amazonaws.services.identitymanagement.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * TagSAMLProviderRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagSAMLProviderRequestMarshaller implements Marshaller<Request<TagSAMLProviderRequest>, TagSAMLProviderRequest> {

    public Request<TagSAMLProviderRequest> marshall(TagSAMLProviderRequest tagSAMLProviderRequest) {

        if (tagSAMLProviderRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<TagSAMLProviderRequest> request = new DefaultRequest<TagSAMLProviderRequest>(tagSAMLProviderRequest, "AmazonIdentityManagement");
        request.addParameter("Action", "TagSAMLProvider");
        request.addParameter("Version", "2010-05-08");
        request.setHttpMethod(HttpMethodName.POST);

        if (tagSAMLProviderRequest.getSAMLProviderArn() != null) {
            request.addParameter("SAMLProviderArn", StringUtils.fromString(tagSAMLProviderRequest.getSAMLProviderArn()));
        }

        if (!tagSAMLProviderRequest.getTags().isEmpty() || !((com.amazonaws.internal.SdkInternalList<Tag>) tagSAMLProviderRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) tagSAMLProviderRequest.getTags();
            int tagsListIndex = 1;

            for (Tag tagsListValue : tagsList) {
                if (tagsListValue != null) {

                    if (tagsListValue.getKey() != null) {
                        request.addParameter("Tags.member." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                    }

                    if (tagsListValue.getValue() != null) {
                        request.addParameter("Tags.member." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                    }
                }
                tagsListIndex++;
            }
        }

        return request;
    }

}
