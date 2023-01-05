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
 * SwitchoverBlueGreenDeploymentRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SwitchoverBlueGreenDeploymentRequestMarshaller implements
        Marshaller<Request<SwitchoverBlueGreenDeploymentRequest>, SwitchoverBlueGreenDeploymentRequest> {

    public Request<SwitchoverBlueGreenDeploymentRequest> marshall(SwitchoverBlueGreenDeploymentRequest switchoverBlueGreenDeploymentRequest) {

        if (switchoverBlueGreenDeploymentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SwitchoverBlueGreenDeploymentRequest> request = new DefaultRequest<SwitchoverBlueGreenDeploymentRequest>(switchoverBlueGreenDeploymentRequest,
                "AmazonRDS");
        request.addParameter("Action", "SwitchoverBlueGreenDeployment");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (switchoverBlueGreenDeploymentRequest.getBlueGreenDeploymentIdentifier() != null) {
            request.addParameter("BlueGreenDeploymentIdentifier",
                    StringUtils.fromString(switchoverBlueGreenDeploymentRequest.getBlueGreenDeploymentIdentifier()));
        }

        if (switchoverBlueGreenDeploymentRequest.getSwitchoverTimeout() != null) {
            request.addParameter("SwitchoverTimeout", StringUtils.fromInteger(switchoverBlueGreenDeploymentRequest.getSwitchoverTimeout()));
        }

        return request;
    }

}
