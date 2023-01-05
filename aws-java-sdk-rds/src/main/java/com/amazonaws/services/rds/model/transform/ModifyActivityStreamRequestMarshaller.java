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
 * ModifyActivityStreamRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyActivityStreamRequestMarshaller implements Marshaller<Request<ModifyActivityStreamRequest>, ModifyActivityStreamRequest> {

    public Request<ModifyActivityStreamRequest> marshall(ModifyActivityStreamRequest modifyActivityStreamRequest) {

        if (modifyActivityStreamRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyActivityStreamRequest> request = new DefaultRequest<ModifyActivityStreamRequest>(modifyActivityStreamRequest, "AmazonRDS");
        request.addParameter("Action", "ModifyActivityStream");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyActivityStreamRequest.getResourceArn() != null) {
            request.addParameter("ResourceArn", StringUtils.fromString(modifyActivityStreamRequest.getResourceArn()));
        }

        if (modifyActivityStreamRequest.getAuditPolicyState() != null) {
            request.addParameter("AuditPolicyState", StringUtils.fromString(modifyActivityStreamRequest.getAuditPolicyState()));
        }

        return request;
    }

}
