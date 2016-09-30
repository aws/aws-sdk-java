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
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * ModifyIdentityIdFormatRequest Marshaller
 */

public class ModifyIdentityIdFormatRequestMarshaller implements Marshaller<Request<ModifyIdentityIdFormatRequest>, ModifyIdentityIdFormatRequest> {

    public Request<ModifyIdentityIdFormatRequest> marshall(ModifyIdentityIdFormatRequest modifyIdentityIdFormatRequest) {

        if (modifyIdentityIdFormatRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyIdentityIdFormatRequest> request = new DefaultRequest<ModifyIdentityIdFormatRequest>(modifyIdentityIdFormatRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyIdentityIdFormat");
        request.addParameter("Version", "2016-09-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyIdentityIdFormatRequest.getResource() != null) {
            request.addParameter("Resource", StringUtils.fromString(modifyIdentityIdFormatRequest.getResource()));
        }

        if (modifyIdentityIdFormatRequest.getUseLongIds() != null) {
            request.addParameter("UseLongIds", StringUtils.fromBoolean(modifyIdentityIdFormatRequest.getUseLongIds()));
        }

        if (modifyIdentityIdFormatRequest.getPrincipalArn() != null) {
            request.addParameter("PrincipalArn", StringUtils.fromString(modifyIdentityIdFormatRequest.getPrincipalArn()));
        }

        return request;
    }

}
