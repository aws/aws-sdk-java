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
 * ModifyCustomDBEngineVersionRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyCustomDBEngineVersionRequestMarshaller implements
        Marshaller<Request<ModifyCustomDBEngineVersionRequest>, ModifyCustomDBEngineVersionRequest> {

    public Request<ModifyCustomDBEngineVersionRequest> marshall(ModifyCustomDBEngineVersionRequest modifyCustomDBEngineVersionRequest) {

        if (modifyCustomDBEngineVersionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyCustomDBEngineVersionRequest> request = new DefaultRequest<ModifyCustomDBEngineVersionRequest>(modifyCustomDBEngineVersionRequest,
                "AmazonRDS");
        request.addParameter("Action", "ModifyCustomDBEngineVersion");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyCustomDBEngineVersionRequest.getEngine() != null) {
            request.addParameter("Engine", StringUtils.fromString(modifyCustomDBEngineVersionRequest.getEngine()));
        }

        if (modifyCustomDBEngineVersionRequest.getEngineVersion() != null) {
            request.addParameter("EngineVersion", StringUtils.fromString(modifyCustomDBEngineVersionRequest.getEngineVersion()));
        }

        if (modifyCustomDBEngineVersionRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(modifyCustomDBEngineVersionRequest.getDescription()));
        }

        if (modifyCustomDBEngineVersionRequest.getStatus() != null) {
            request.addParameter("Status", StringUtils.fromString(modifyCustomDBEngineVersionRequest.getStatus()));
        }

        return request;
    }

}
