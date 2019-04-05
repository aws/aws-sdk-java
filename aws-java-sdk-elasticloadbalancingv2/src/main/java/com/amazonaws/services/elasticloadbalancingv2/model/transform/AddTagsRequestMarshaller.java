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
package com.amazonaws.services.elasticloadbalancingv2.model.transform;

import java.util.List;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticloadbalancingv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * AddTagsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddTagsRequestMarshaller implements Marshaller<Request<AddTagsRequest>, AddTagsRequest> {

    public Request<AddTagsRequest> marshall(AddTagsRequest addTagsRequest) {

        if (addTagsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AddTagsRequest> request = new DefaultRequest<AddTagsRequest>(addTagsRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "AddTags");
        request.addParameter("Version", "2015-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (addTagsRequest.getResourceArns() != null) {
            java.util.List<String> resourceArnsList = addTagsRequest.getResourceArns();
            if (resourceArnsList.isEmpty()) {
                request.addParameter("ResourceArns", "");
            } else {
                int resourceArnsListIndex = 1;

                for (String resourceArnsListValue : resourceArnsList) {
                    if (resourceArnsListValue != null) {
                        request.addParameter("ResourceArns.member." + resourceArnsListIndex, StringUtils.fromString(resourceArnsListValue));
                    }
                    resourceArnsListIndex++;
                }
            }
        }

        if (addTagsRequest.getTags() != null) {
            java.util.List<Tag> tagsList = addTagsRequest.getTags();
            if (tagsList.isEmpty()) {
                request.addParameter("Tags", "");
            } else {
                int tagsListIndex = 1;

                for (Tag tagsListValue : tagsList) {

                    if (tagsListValue.getKey() != null) {
                        request.addParameter("Tags.member." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                    }

                    if (tagsListValue.getValue() != null) {
                        request.addParameter("Tags.member." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                    }
                    tagsListIndex++;
                }
            }
        }

        return request;
    }

}
