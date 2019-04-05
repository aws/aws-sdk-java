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
package com.amazonaws.services.rds.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CopyDBParameterGroupRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyDBParameterGroupRequestMarshaller implements Marshaller<Request<CopyDBParameterGroupRequest>, CopyDBParameterGroupRequest> {

    public Request<CopyDBParameterGroupRequest> marshall(CopyDBParameterGroupRequest copyDBParameterGroupRequest) {

        if (copyDBParameterGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CopyDBParameterGroupRequest> request = new DefaultRequest<CopyDBParameterGroupRequest>(copyDBParameterGroupRequest, "AmazonRDS");
        request.addParameter("Action", "CopyDBParameterGroup");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (copyDBParameterGroupRequest.getSourceDBParameterGroupIdentifier() != null) {
            request.addParameter("SourceDBParameterGroupIdentifier", StringUtils.fromString(copyDBParameterGroupRequest.getSourceDBParameterGroupIdentifier()));
        }

        if (copyDBParameterGroupRequest.getTargetDBParameterGroupIdentifier() != null) {
            request.addParameter("TargetDBParameterGroupIdentifier", StringUtils.fromString(copyDBParameterGroupRequest.getTargetDBParameterGroupIdentifier()));
        }

        if (copyDBParameterGroupRequest.getTargetDBParameterGroupDescription() != null) {
            request.addParameter("TargetDBParameterGroupDescription",
                    StringUtils.fromString(copyDBParameterGroupRequest.getTargetDBParameterGroupDescription()));
        }

        if (!copyDBParameterGroupRequest.getTags().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Tag>) copyDBParameterGroupRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) copyDBParameterGroupRequest.getTags();
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
