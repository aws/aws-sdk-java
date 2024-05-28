/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ModifyIntegrationRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyIntegrationRequestMarshaller implements Marshaller<Request<ModifyIntegrationRequest>, ModifyIntegrationRequest> {

    public Request<ModifyIntegrationRequest> marshall(ModifyIntegrationRequest modifyIntegrationRequest) {

        if (modifyIntegrationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyIntegrationRequest> request = new DefaultRequest<ModifyIntegrationRequest>(modifyIntegrationRequest, "AmazonRDS");
        request.addParameter("Action", "ModifyIntegration");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyIntegrationRequest.getIntegrationIdentifier() != null) {
            request.addParameter("IntegrationIdentifier", StringUtils.fromString(modifyIntegrationRequest.getIntegrationIdentifier()));
        }

        if (modifyIntegrationRequest.getIntegrationName() != null) {
            request.addParameter("IntegrationName", StringUtils.fromString(modifyIntegrationRequest.getIntegrationName()));
        }

        if (modifyIntegrationRequest.getDataFilter() != null) {
            request.addParameter("DataFilter", StringUtils.fromString(modifyIntegrationRequest.getDataFilter()));
        }

        if (modifyIntegrationRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(modifyIntegrationRequest.getDescription()));
        }

        return request;
    }

}
