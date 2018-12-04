/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * DeleteTagsRequest Marshaller
 */

public class DeleteTagsRequestMarshaller implements
        Marshaller<Request<DeleteTagsRequest>, DeleteTagsRequest> {

    public Request<DeleteTagsRequest> marshall(
            DeleteTagsRequest deleteTagsRequest) {

        if (deleteTagsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DeleteTagsRequest> request = new DefaultRequest<DeleteTagsRequest>(
                deleteTagsRequest, "AmazonEC2");
        request.addParameter("Action", "DeleteTags");
        request.addParameter("Version", "2015-10-01");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> resourcesList = (com.amazonaws.internal.SdkInternalList<String>) deleteTagsRequest
                .getResources();
        if (!resourcesList.isEmpty() || !resourcesList.isAutoConstruct()) {
            int resourcesListIndex = 1;

            for (String resourcesListValue : resourcesList) {
                if (resourcesListValue != null) {
                    request.addParameter("ResourceId." + resourcesListIndex,
                            StringUtils.fromString(resourcesListValue));
                }
                resourcesListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) deleteTagsRequest
                .getTags();
        if (!tagsList.isEmpty() || !tagsList.isAutoConstruct()) {
            int tagsListIndex = 1;

            for (Tag tagsListValue : tagsList) {

                if (tagsListValue.getKey() != null) {
                    request.addParameter("Tag." + tagsListIndex + ".Key",
                            StringUtils.fromString(tagsListValue.getKey()));
                }

                if (tagsListValue.getValue() != null) {
                    request.addParameter("Tag." + tagsListIndex + ".Value",
                            StringUtils.fromString(tagsListValue.getValue()));
                }
                tagsListIndex++;
            }
        }

        return request;
    }

}
