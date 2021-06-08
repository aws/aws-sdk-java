/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.neptune.model.transform;

import java.util.List;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.neptune.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CreateDBClusterEndpointRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDBClusterEndpointRequestMarshaller implements Marshaller<Request<CreateDBClusterEndpointRequest>, CreateDBClusterEndpointRequest> {

    public Request<CreateDBClusterEndpointRequest> marshall(CreateDBClusterEndpointRequest createDBClusterEndpointRequest) {

        if (createDBClusterEndpointRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateDBClusterEndpointRequest> request = new DefaultRequest<CreateDBClusterEndpointRequest>(createDBClusterEndpointRequest, "AmazonNeptune");
        request.addParameter("Action", "CreateDBClusterEndpoint");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (createDBClusterEndpointRequest.getDBClusterIdentifier() != null) {
            request.addParameter("DBClusterIdentifier", StringUtils.fromString(createDBClusterEndpointRequest.getDBClusterIdentifier()));
        }

        if (createDBClusterEndpointRequest.getDBClusterEndpointIdentifier() != null) {
            request.addParameter("DBClusterEndpointIdentifier", StringUtils.fromString(createDBClusterEndpointRequest.getDBClusterEndpointIdentifier()));
        }

        if (createDBClusterEndpointRequest.getEndpointType() != null) {
            request.addParameter("EndpointType", StringUtils.fromString(createDBClusterEndpointRequest.getEndpointType()));
        }

        if (createDBClusterEndpointRequest.getStaticMembers() != null) {
            java.util.List<String> staticMembersList = createDBClusterEndpointRequest.getStaticMembers();
            if (staticMembersList.isEmpty()) {
                request.addParameter("StaticMembers", "");
            } else {
                int staticMembersListIndex = 1;

                for (String staticMembersListValue : staticMembersList) {
                    if (staticMembersListValue != null) {
                        request.addParameter("StaticMembers.member." + staticMembersListIndex, StringUtils.fromString(staticMembersListValue));
                    }
                    staticMembersListIndex++;
                }
            }
        }

        if (createDBClusterEndpointRequest.getExcludedMembers() != null) {
            java.util.List<String> excludedMembersList = createDBClusterEndpointRequest.getExcludedMembers();
            if (excludedMembersList.isEmpty()) {
                request.addParameter("ExcludedMembers", "");
            } else {
                int excludedMembersListIndex = 1;

                for (String excludedMembersListValue : excludedMembersList) {
                    if (excludedMembersListValue != null) {
                        request.addParameter("ExcludedMembers.member." + excludedMembersListIndex, StringUtils.fromString(excludedMembersListValue));
                    }
                    excludedMembersListIndex++;
                }
            }
        }

        if (createDBClusterEndpointRequest.getTags() != null) {
            java.util.List<Tag> tagsList = createDBClusterEndpointRequest.getTags();
            if (tagsList.isEmpty()) {
                request.addParameter("Tags", "");
            } else {
                int tagsListIndex = 1;

                for (Tag tagsListValue : tagsList) {
                    if (tagsListValue != null) {

                        if (tagsListValue.getKey() != null) {
                            request.addParameter("Tags.Tag." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                        }

                        if (tagsListValue.getValue() != null) {
                            request.addParameter("Tags.Tag." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                        }
                    }
                    tagsListIndex++;
                }
            }
        }

        return request;
    }

}
