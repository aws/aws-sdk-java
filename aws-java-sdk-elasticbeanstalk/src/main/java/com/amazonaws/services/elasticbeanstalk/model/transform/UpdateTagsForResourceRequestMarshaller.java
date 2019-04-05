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
package com.amazonaws.services.elasticbeanstalk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * UpdateTagsForResourceRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTagsForResourceRequestMarshaller implements Marshaller<Request<UpdateTagsForResourceRequest>, UpdateTagsForResourceRequest> {

    public Request<UpdateTagsForResourceRequest> marshall(UpdateTagsForResourceRequest updateTagsForResourceRequest) {

        if (updateTagsForResourceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateTagsForResourceRequest> request = new DefaultRequest<UpdateTagsForResourceRequest>(updateTagsForResourceRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "UpdateTagsForResource");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (updateTagsForResourceRequest.getResourceArn() != null) {
            request.addParameter("ResourceArn", StringUtils.fromString(updateTagsForResourceRequest.getResourceArn()));
        }

        if (!updateTagsForResourceRequest.getTagsToAdd().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Tag>) updateTagsForResourceRequest.getTagsToAdd()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsToAddList = (com.amazonaws.internal.SdkInternalList<Tag>) updateTagsForResourceRequest
                    .getTagsToAdd();
            int tagsToAddListIndex = 1;

            for (Tag tagsToAddListValue : tagsToAddList) {

                if (tagsToAddListValue.getKey() != null) {
                    request.addParameter("TagsToAdd.member." + tagsToAddListIndex + ".Key", StringUtils.fromString(tagsToAddListValue.getKey()));
                }

                if (tagsToAddListValue.getValue() != null) {
                    request.addParameter("TagsToAdd.member." + tagsToAddListIndex + ".Value", StringUtils.fromString(tagsToAddListValue.getValue()));
                }
                tagsToAddListIndex++;
            }
        }

        if (!updateTagsForResourceRequest.getTagsToRemove().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) updateTagsForResourceRequest.getTagsToRemove()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> tagsToRemoveList = (com.amazonaws.internal.SdkInternalList<String>) updateTagsForResourceRequest
                    .getTagsToRemove();
            int tagsToRemoveListIndex = 1;

            for (String tagsToRemoveListValue : tagsToRemoveList) {
                if (tagsToRemoveListValue != null) {
                    request.addParameter("TagsToRemove.member." + tagsToRemoveListIndex, StringUtils.fromString(tagsToRemoveListValue));
                }
                tagsToRemoveListIndex++;
            }
        }

        return request;
    }

}
