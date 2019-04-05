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
package com.amazonaws.services.redshift.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CreateClusterSecurityGroupRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateClusterSecurityGroupRequestMarshaller implements Marshaller<Request<CreateClusterSecurityGroupRequest>, CreateClusterSecurityGroupRequest> {

    public Request<CreateClusterSecurityGroupRequest> marshall(CreateClusterSecurityGroupRequest createClusterSecurityGroupRequest) {

        if (createClusterSecurityGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateClusterSecurityGroupRequest> request = new DefaultRequest<CreateClusterSecurityGroupRequest>(createClusterSecurityGroupRequest,
                "AmazonRedshift");
        request.addParameter("Action", "CreateClusterSecurityGroup");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (createClusterSecurityGroupRequest.getClusterSecurityGroupName() != null) {
            request.addParameter("ClusterSecurityGroupName", StringUtils.fromString(createClusterSecurityGroupRequest.getClusterSecurityGroupName()));
        }

        if (createClusterSecurityGroupRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createClusterSecurityGroupRequest.getDescription()));
        }

        if (!createClusterSecurityGroupRequest.getTags().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Tag>) createClusterSecurityGroupRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createClusterSecurityGroupRequest.getTags();
            int tagsListIndex = 1;

            for (Tag tagsListValue : tagsList) {

                if (tagsListValue.getKey() != null) {
                    request.addParameter("Tags.Tag." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                }

                if (tagsListValue.getValue() != null) {
                    request.addParameter("Tags.Tag." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                }
                tagsListIndex++;
            }
        }

        return request;
    }

}
