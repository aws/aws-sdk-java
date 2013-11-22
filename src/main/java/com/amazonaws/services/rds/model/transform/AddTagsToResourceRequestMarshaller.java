/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Add Tags To Resource Request Marshaller
 */
public class AddTagsToResourceRequestMarshaller implements Marshaller<Request<AddTagsToResourceRequest>, AddTagsToResourceRequest> {

    public Request<AddTagsToResourceRequest> marshall(AddTagsToResourceRequest addTagsToResourceRequest) {

        if (addTagsToResourceRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<AddTagsToResourceRequest> request = new DefaultRequest<AddTagsToResourceRequest>(addTagsToResourceRequest, "AmazonRDS");
        request.addParameter("Action", "AddTagsToResource");
        request.addParameter("Version", "2013-09-09");

        if (addTagsToResourceRequest.getResourceName() != null) {
            request.addParameter("ResourceName", StringUtils.fromString(addTagsToResourceRequest.getResourceName()));
        }

        java.util.List<Tag> tagsList = addTagsToResourceRequest.getTags();
        int tagsListIndex = 1;

        for (Tag tagsListValue : tagsList) {
            Tag tagMember = tagsListValue;
            if (tagMember != null) {
                if (tagMember.getKey() != null) {
                    request.addParameter("Tags.Tag." + tagsListIndex + ".Key", StringUtils.fromString(tagMember.getKey()));
                }
                if (tagMember.getValue() != null) {
                    request.addParameter("Tags.Tag." + tagsListIndex + ".Value", StringUtils.fromString(tagMember.getValue()));
                }
            }

            tagsListIndex++;
        }


        return request;
    }
}
