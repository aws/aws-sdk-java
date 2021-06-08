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
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * AssociateEnclaveCertificateIamRoleRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateEnclaveCertificateIamRoleRequestMarshaller implements
        Marshaller<Request<AssociateEnclaveCertificateIamRoleRequest>, AssociateEnclaveCertificateIamRoleRequest> {

    public Request<AssociateEnclaveCertificateIamRoleRequest> marshall(AssociateEnclaveCertificateIamRoleRequest associateEnclaveCertificateIamRoleRequest) {

        if (associateEnclaveCertificateIamRoleRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AssociateEnclaveCertificateIamRoleRequest> request = new DefaultRequest<AssociateEnclaveCertificateIamRoleRequest>(
                associateEnclaveCertificateIamRoleRequest, "AmazonEC2");
        request.addParameter("Action", "AssociateEnclaveCertificateIamRole");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (associateEnclaveCertificateIamRoleRequest.getCertificateArn() != null) {
            request.addParameter("CertificateArn", StringUtils.fromString(associateEnclaveCertificateIamRoleRequest.getCertificateArn()));
        }

        if (associateEnclaveCertificateIamRoleRequest.getRoleArn() != null) {
            request.addParameter("RoleArn", StringUtils.fromString(associateEnclaveCertificateIamRoleRequest.getRoleArn()));
        }

        return request;
    }

}
