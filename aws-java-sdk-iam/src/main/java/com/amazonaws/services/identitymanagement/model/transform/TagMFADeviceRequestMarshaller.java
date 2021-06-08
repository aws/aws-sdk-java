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
 * TagMFADeviceRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagMFADeviceRequestMarshaller implements Marshaller<Request<TagMFADeviceRequest>, TagMFADeviceRequest> {

    public Request<TagMFADeviceRequest> marshall(TagMFADeviceRequest tagMFADeviceRequest) {

        if (tagMFADeviceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<TagMFADeviceRequest> request = new DefaultRequest<TagMFADeviceRequest>(tagMFADeviceRequest, "AmazonIdentityManagement");
        request.addParameter("Action", "TagMFADevice");
        request.addParameter("Version", "2010-05-08");
        request.setHttpMethod(HttpMethodName.POST);

        if (tagMFADeviceRequest.getSerialNumber() != null) {
            request.addParameter("SerialNumber", StringUtils.fromString(tagMFADeviceRequest.getSerialNumber()));
        }

        if (!tagMFADeviceRequest.getTags().isEmpty() || !((com.amazonaws.internal.SdkInternalList<Tag>) tagMFADeviceRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) tagMFADeviceRequest.getTags();
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
