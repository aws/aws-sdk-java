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
package com.amazonaws.services.identitymanagement.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * UpdateServerCertificateRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateServerCertificateRequestMarshaller implements Marshaller<Request<UpdateServerCertificateRequest>, UpdateServerCertificateRequest> {

    public Request<UpdateServerCertificateRequest> marshall(UpdateServerCertificateRequest updateServerCertificateRequest) {

        if (updateServerCertificateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateServerCertificateRequest> request = new DefaultRequest<UpdateServerCertificateRequest>(updateServerCertificateRequest,
                "AmazonIdentityManagement");
        request.addParameter("Action", "UpdateServerCertificate");
        request.addParameter("Version", "2010-05-08");
        request.setHttpMethod(HttpMethodName.POST);

        if (updateServerCertificateRequest.getServerCertificateName() != null) {
            request.addParameter("ServerCertificateName", StringUtils.fromString(updateServerCertificateRequest.getServerCertificateName()));
        }

        if (updateServerCertificateRequest.getNewPath() != null) {
            request.addParameter("NewPath", StringUtils.fromString(updateServerCertificateRequest.getNewPath()));
        }

        if (updateServerCertificateRequest.getNewServerCertificateName() != null) {
            request.addParameter("NewServerCertificateName", StringUtils.fromString(updateServerCertificateRequest.getNewServerCertificateName()));
        }

        return request;
    }

}
