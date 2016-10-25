/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * DeleteSAMLProviderRequest Marshaller
 */

public class DeleteSAMLProviderRequestMarshaller implements Marshaller<Request<DeleteSAMLProviderRequest>, DeleteSAMLProviderRequest> {

    public Request<DeleteSAMLProviderRequest> marshall(DeleteSAMLProviderRequest deleteSAMLProviderRequest) {

        if (deleteSAMLProviderRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteSAMLProviderRequest> request = new DefaultRequest<DeleteSAMLProviderRequest>(deleteSAMLProviderRequest, "AmazonIdentityManagement");
        request.addParameter("Action", "DeleteSAMLProvider");
        request.addParameter("Version", "2010-05-08");
        request.setHttpMethod(HttpMethodName.POST);

        if (deleteSAMLProviderRequest.getSAMLProviderArn() != null) {
            request.addParameter("SAMLProviderArn", StringUtils.fromString(deleteSAMLProviderRequest.getSAMLProviderArn()));
        }

        return request;
    }

}
