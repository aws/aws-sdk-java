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
 * AssociateEnvironmentOperationsRoleRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateEnvironmentOperationsRoleRequestMarshaller implements
        Marshaller<Request<AssociateEnvironmentOperationsRoleRequest>, AssociateEnvironmentOperationsRoleRequest> {

    public Request<AssociateEnvironmentOperationsRoleRequest> marshall(AssociateEnvironmentOperationsRoleRequest associateEnvironmentOperationsRoleRequest) {

        if (associateEnvironmentOperationsRoleRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AssociateEnvironmentOperationsRoleRequest> request = new DefaultRequest<AssociateEnvironmentOperationsRoleRequest>(
                associateEnvironmentOperationsRoleRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "AssociateEnvironmentOperationsRole");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (associateEnvironmentOperationsRoleRequest.getEnvironmentName() != null) {
            request.addParameter("EnvironmentName", StringUtils.fromString(associateEnvironmentOperationsRoleRequest.getEnvironmentName()));
        }

        if (associateEnvironmentOperationsRoleRequest.getOperationsRole() != null) {
            request.addParameter("OperationsRole", StringUtils.fromString(associateEnvironmentOperationsRoleRequest.getOperationsRole()));
        }

        return request;
    }

}
