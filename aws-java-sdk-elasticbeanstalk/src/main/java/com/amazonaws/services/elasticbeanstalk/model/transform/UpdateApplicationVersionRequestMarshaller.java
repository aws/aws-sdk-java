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
package com.amazonaws.services.elasticbeanstalk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * UpdateApplicationVersionRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateApplicationVersionRequestMarshaller implements Marshaller<Request<UpdateApplicationVersionRequest>, UpdateApplicationVersionRequest> {

    public Request<UpdateApplicationVersionRequest> marshall(UpdateApplicationVersionRequest updateApplicationVersionRequest) {

        if (updateApplicationVersionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateApplicationVersionRequest> request = new DefaultRequest<UpdateApplicationVersionRequest>(updateApplicationVersionRequest,
                "AWSElasticBeanstalk");
        request.addParameter("Action", "UpdateApplicationVersion");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (updateApplicationVersionRequest.getApplicationName() != null) {
            request.addParameter("ApplicationName", StringUtils.fromString(updateApplicationVersionRequest.getApplicationName()));
        }

        if (updateApplicationVersionRequest.getVersionLabel() != null) {
            request.addParameter("VersionLabel", StringUtils.fromString(updateApplicationVersionRequest.getVersionLabel()));
        }

        if (updateApplicationVersionRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(updateApplicationVersionRequest.getDescription()));
        }

        return request;
    }

}
