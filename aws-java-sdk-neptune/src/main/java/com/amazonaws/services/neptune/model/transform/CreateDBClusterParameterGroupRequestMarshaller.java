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
 * CreateDBClusterParameterGroupRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDBClusterParameterGroupRequestMarshaller implements
        Marshaller<Request<CreateDBClusterParameterGroupRequest>, CreateDBClusterParameterGroupRequest> {

    public Request<CreateDBClusterParameterGroupRequest> marshall(CreateDBClusterParameterGroupRequest createDBClusterParameterGroupRequest) {

        if (createDBClusterParameterGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateDBClusterParameterGroupRequest> request = new DefaultRequest<CreateDBClusterParameterGroupRequest>(createDBClusterParameterGroupRequest,
                "AmazonNeptune");
        request.addParameter("Action", "CreateDBClusterParameterGroup");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (createDBClusterParameterGroupRequest.getDBClusterParameterGroupName() != null) {
            request.addParameter("DBClusterParameterGroupName", StringUtils.fromString(createDBClusterParameterGroupRequest.getDBClusterParameterGroupName()));
        }

        if (createDBClusterParameterGroupRequest.getDBParameterGroupFamily() != null) {
            request.addParameter("DBParameterGroupFamily", StringUtils.fromString(createDBClusterParameterGroupRequest.getDBParameterGroupFamily()));
        }

        if (createDBClusterParameterGroupRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createDBClusterParameterGroupRequest.getDescription()));
        }

        if (createDBClusterParameterGroupRequest.getTags() != null) {
            java.util.List<Tag> tagsList = createDBClusterParameterGroupRequest.getTags();
            if (tagsList.isEmpty()) {
                request.addParameter("Tags", "");
            } else {
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
        }

        return request;
    }

}
