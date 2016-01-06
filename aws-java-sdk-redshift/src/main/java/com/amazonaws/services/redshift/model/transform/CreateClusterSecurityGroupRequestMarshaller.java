/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Create Cluster Security Group Request Marshaller
 */
public class CreateClusterSecurityGroupRequestMarshaller implements Marshaller<Request<CreateClusterSecurityGroupRequest>, CreateClusterSecurityGroupRequest> {

    public Request<CreateClusterSecurityGroupRequest> marshall(CreateClusterSecurityGroupRequest createClusterSecurityGroupRequest) {

        if (createClusterSecurityGroupRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateClusterSecurityGroupRequest> request = new DefaultRequest<CreateClusterSecurityGroupRequest>(createClusterSecurityGroupRequest, "AmazonRedshift");
        request.addParameter("Action", "CreateClusterSecurityGroup");
        request.addParameter("Version", "2012-12-01");

        if (createClusterSecurityGroupRequest.getClusterSecurityGroupName() != null) {
            request.addParameter("ClusterSecurityGroupName", StringUtils.fromString(createClusterSecurityGroupRequest.getClusterSecurityGroupName()));
        }
        if (createClusterSecurityGroupRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createClusterSecurityGroupRequest.getDescription()));
        }

        java.util.List<Tag> tagsList = createClusterSecurityGroupRequest.getTags();
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
