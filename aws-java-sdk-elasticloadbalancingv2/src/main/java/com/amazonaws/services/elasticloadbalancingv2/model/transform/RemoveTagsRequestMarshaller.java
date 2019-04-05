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
 * RemoveTagsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveTagsRequestMarshaller implements Marshaller<Request<RemoveTagsRequest>, RemoveTagsRequest> {

    public Request<RemoveTagsRequest> marshall(RemoveTagsRequest removeTagsRequest) {

        if (removeTagsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RemoveTagsRequest> request = new DefaultRequest<RemoveTagsRequest>(removeTagsRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "RemoveTags");
        request.addParameter("Version", "2015-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (removeTagsRequest.getResourceArns() != null) {
            java.util.List<String> resourceArnsList = removeTagsRequest.getResourceArns();
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

        if (removeTagsRequest.getTagKeys() != null) {
            java.util.List<String> tagKeysList = removeTagsRequest.getTagKeys();
            if (tagKeysList.isEmpty()) {
                request.addParameter("TagKeys", "");
            } else {
                int tagKeysListIndex = 1;

                for (String tagKeysListValue : tagKeysList) {
                    if (tagKeysListValue != null) {
                        request.addParameter("TagKeys.member." + tagKeysListIndex, StringUtils.fromString(tagKeysListValue));
                    }
                    tagKeysListIndex++;
                }
            }
        }

        return request;
    }

}
