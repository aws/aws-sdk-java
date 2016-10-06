/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * CreateTagsRequest Marshaller
 */

public class CreateTagsRequestMarshaller implements Marshaller<Request<CreateTagsRequest>, CreateTagsRequest> {

    public Request<CreateTagsRequest> marshall(CreateTagsRequest createTagsRequest) {

        if (createTagsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateTagsRequest> request = new DefaultRequest<CreateTagsRequest>(createTagsRequest, "AmazonEC2");
        request.addParameter("Action", "CreateTags");
        request.addParameter("Version", "2016-09-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> createTagsRequestResourcesList = (com.amazonaws.internal.SdkInternalList<String>) createTagsRequest
                .getResources();
        if (!createTagsRequestResourcesList.isEmpty() || !createTagsRequestResourcesList.isAutoConstruct()) {
            int resourcesListIndex = 1;

            for (String createTagsRequestResourcesListValue : createTagsRequestResourcesList) {
                if (createTagsRequestResourcesListValue != null) {
                    request.addParameter("ResourceId." + resourcesListIndex, StringUtils.fromString(createTagsRequestResourcesListValue));
                }
                resourcesListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Tag> createTagsRequestTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createTagsRequest.getTags();
        if (!createTagsRequestTagsList.isEmpty() || !createTagsRequestTagsList.isAutoConstruct()) {
            int tagsListIndex = 1;

            for (Tag createTagsRequestTagsListValue : createTagsRequestTagsList) {

                if (createTagsRequestTagsListValue.getKey() != null) {
                    request.addParameter("Tag." + tagsListIndex + ".Key", StringUtils.fromString(createTagsRequestTagsListValue.getKey()));
                }

                if (createTagsRequestTagsListValue.getValue() != null) {
                    request.addParameter("Tag." + tagsListIndex + ".Value", StringUtils.fromString(createTagsRequestTagsListValue.getValue()));
                }
                tagsListIndex++;
            }
        }

        return request;
    }

}
