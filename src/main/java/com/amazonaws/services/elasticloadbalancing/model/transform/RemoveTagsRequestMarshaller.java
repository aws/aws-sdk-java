/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticloadbalancing.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Remove Tags Request Marshaller
 */
public class RemoveTagsRequestMarshaller implements Marshaller<Request<RemoveTagsRequest>, RemoveTagsRequest> {

    public Request<RemoveTagsRequest> marshall(RemoveTagsRequest removeTagsRequest) {

        if (removeTagsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<RemoveTagsRequest> request = new DefaultRequest<RemoveTagsRequest>(removeTagsRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "RemoveTags");
        request.addParameter("Version", "2012-06-01");

        java.util.List<String> loadBalancerNamesList = removeTagsRequest.getLoadBalancerNames();
        int loadBalancerNamesListIndex = 1;

        for (String loadBalancerNamesListValue : loadBalancerNamesList) {
            if (loadBalancerNamesListValue != null) {
                request.addParameter("LoadBalancerNames.member." + loadBalancerNamesListIndex, StringUtils.fromString(loadBalancerNamesListValue));
            }

            loadBalancerNamesListIndex++;
        }

        java.util.List<TagKeyOnly> tagsList = removeTagsRequest.getTags();
        int tagsListIndex = 1;

        for (TagKeyOnly tagsListValue : tagsList) {
            TagKeyOnly tagKeyOnlyMember = tagsListValue;
            if (tagKeyOnlyMember != null) {
                if (tagKeyOnlyMember.getKey() != null) {
                    request.addParameter("Tags.member." + tagsListIndex + ".Key", StringUtils.fromString(tagKeyOnlyMember.getKey()));
                }
            }

            tagsListIndex++;
        }

        return request;
    }
}
