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
package com.amazonaws.services.cloudformation.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * SetTypeConfigurationRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetTypeConfigurationRequestMarshaller implements Marshaller<Request<SetTypeConfigurationRequest>, SetTypeConfigurationRequest> {

    public Request<SetTypeConfigurationRequest> marshall(SetTypeConfigurationRequest setTypeConfigurationRequest) {

        if (setTypeConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SetTypeConfigurationRequest> request = new DefaultRequest<SetTypeConfigurationRequest>(setTypeConfigurationRequest, "AmazonCloudFormation");
        request.addParameter("Action", "SetTypeConfiguration");
        request.addParameter("Version", "2010-05-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (setTypeConfigurationRequest.getTypeArn() != null) {
            request.addParameter("TypeArn", StringUtils.fromString(setTypeConfigurationRequest.getTypeArn()));
        }

        if (setTypeConfigurationRequest.getConfiguration() != null) {
            request.addParameter("Configuration", StringUtils.fromString(setTypeConfigurationRequest.getConfiguration()));
        }

        if (setTypeConfigurationRequest.getConfigurationAlias() != null) {
            request.addParameter("ConfigurationAlias", StringUtils.fromString(setTypeConfigurationRequest.getConfigurationAlias()));
        }

        if (setTypeConfigurationRequest.getTypeName() != null) {
            request.addParameter("TypeName", StringUtils.fromString(setTypeConfigurationRequest.getTypeName()));
        }

        if (setTypeConfigurationRequest.getType() != null) {
            request.addParameter("Type", StringUtils.fromString(setTypeConfigurationRequest.getType()));
        }

        return request;
    }

}
