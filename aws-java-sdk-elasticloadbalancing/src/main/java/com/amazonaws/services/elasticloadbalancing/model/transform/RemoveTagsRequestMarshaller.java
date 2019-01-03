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
package com.amazonaws.services.elasticloadbalancing.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticloadbalancing.model.*;
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
        request.addParameter("Version", "2012-06-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (!removeTagsRequest.getLoadBalancerNames().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) removeTagsRequest.getLoadBalancerNames()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> loadBalancerNamesList = (com.amazonaws.internal.SdkInternalList<String>) removeTagsRequest
                    .getLoadBalancerNames();
            int loadBalancerNamesListIndex = 1;

            for (String loadBalancerNamesListValue : loadBalancerNamesList) {
                if (loadBalancerNamesListValue != null) {
                    request.addParameter("LoadBalancerNames.member." + loadBalancerNamesListIndex, StringUtils.fromString(loadBalancerNamesListValue));
                }
                loadBalancerNamesListIndex++;
            }
        }

        if (!removeTagsRequest.getTags().isEmpty() || !((com.amazonaws.internal.SdkInternalList<TagKeyOnly>) removeTagsRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<TagKeyOnly> tagsList = (com.amazonaws.internal.SdkInternalList<TagKeyOnly>) removeTagsRequest.getTags();
            int tagsListIndex = 1;

            for (TagKeyOnly tagsListValue : tagsList) {

                if (tagsListValue.getKey() != null) {
                    request.addParameter("Tags.member." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                }
                tagsListIndex++;
            }
        }

        return request;
    }

}
