/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * CreateBlueGreenDeploymentRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBlueGreenDeploymentRequestMarshaller implements Marshaller<Request<CreateBlueGreenDeploymentRequest>, CreateBlueGreenDeploymentRequest> {

    public Request<CreateBlueGreenDeploymentRequest> marshall(CreateBlueGreenDeploymentRequest createBlueGreenDeploymentRequest) {

        if (createBlueGreenDeploymentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateBlueGreenDeploymentRequest> request = new DefaultRequest<CreateBlueGreenDeploymentRequest>(createBlueGreenDeploymentRequest, "AmazonRDS");
        request.addParameter("Action", "CreateBlueGreenDeployment");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (createBlueGreenDeploymentRequest.getBlueGreenDeploymentName() != null) {
            request.addParameter("BlueGreenDeploymentName", StringUtils.fromString(createBlueGreenDeploymentRequest.getBlueGreenDeploymentName()));
        }

        if (createBlueGreenDeploymentRequest.getSource() != null) {
            request.addParameter("Source", StringUtils.fromString(createBlueGreenDeploymentRequest.getSource()));
        }

        if (createBlueGreenDeploymentRequest.getTargetEngineVersion() != null) {
            request.addParameter("TargetEngineVersion", StringUtils.fromString(createBlueGreenDeploymentRequest.getTargetEngineVersion()));
        }

        if (createBlueGreenDeploymentRequest.getTargetDBParameterGroupName() != null) {
            request.addParameter("TargetDBParameterGroupName", StringUtils.fromString(createBlueGreenDeploymentRequest.getTargetDBParameterGroupName()));
        }

        if (createBlueGreenDeploymentRequest.getTargetDBClusterParameterGroupName() != null) {
            request.addParameter("TargetDBClusterParameterGroupName",
                    StringUtils.fromString(createBlueGreenDeploymentRequest.getTargetDBClusterParameterGroupName()));
        }

        if (!createBlueGreenDeploymentRequest.getTags().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Tag>) createBlueGreenDeploymentRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createBlueGreenDeploymentRequest.getTags();
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

        return request;
    }

}
