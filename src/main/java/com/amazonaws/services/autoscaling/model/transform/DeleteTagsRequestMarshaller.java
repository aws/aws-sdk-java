/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Delete Tags Request Marshaller
 */
public class DeleteTagsRequestMarshaller implements Marshaller<Request<DeleteTagsRequest>, DeleteTagsRequest> {

    public Request<DeleteTagsRequest> marshall(DeleteTagsRequest deleteTagsRequest) {

        if (deleteTagsRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DeleteTagsRequest> request = new DefaultRequest<DeleteTagsRequest>(deleteTagsRequest, "AmazonAutoScaling");
        request.addParameter("Action", "DeleteTags");
        request.addParameter("Version", "2011-01-01");


        java.util.List<Tag> tagsList = deleteTagsRequest.getTags();
        int tagsListIndex = 1;

        for (Tag tagsListValue : tagsList) {
            Tag tagMember = tagsListValue;
            if (tagMember != null) {
                if (tagMember.getResourceId() != null) {
                    request.addParameter("Tags.member." + tagsListIndex + ".ResourceId", StringUtils.fromString(tagMember.getResourceId()));
                }
                if (tagMember.getResourceType() != null) {
                    request.addParameter("Tags.member." + tagsListIndex + ".ResourceType", StringUtils.fromString(tagMember.getResourceType()));
                }
                if (tagMember.getKey() != null) {
                    request.addParameter("Tags.member." + tagsListIndex + ".Key", StringUtils.fromString(tagMember.getKey()));
                }
                if (tagMember.getValue() != null) {
                    request.addParameter("Tags.member." + tagsListIndex + ".Value", StringUtils.fromString(tagMember.getValue()));
                }
                if (tagMember.isPropagateAtLaunch() != null) {
                    request.addParameter("Tags.member." + tagsListIndex + ".PropagateAtLaunch", StringUtils.fromBoolean(tagMember.isPropagateAtLaunch()));
                }
            }

            tagsListIndex++;
        }


        return request;
    }
}
