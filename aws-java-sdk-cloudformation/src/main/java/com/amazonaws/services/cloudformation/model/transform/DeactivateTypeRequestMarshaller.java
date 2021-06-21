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
 * DeactivateTypeRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeactivateTypeRequestMarshaller implements Marshaller<Request<DeactivateTypeRequest>, DeactivateTypeRequest> {

    public Request<DeactivateTypeRequest> marshall(DeactivateTypeRequest deactivateTypeRequest) {

        if (deactivateTypeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeactivateTypeRequest> request = new DefaultRequest<DeactivateTypeRequest>(deactivateTypeRequest, "AmazonCloudFormation");
        request.addParameter("Action", "DeactivateType");
        request.addParameter("Version", "2010-05-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (deactivateTypeRequest.getTypeName() != null) {
            request.addParameter("TypeName", StringUtils.fromString(deactivateTypeRequest.getTypeName()));
        }

        if (deactivateTypeRequest.getType() != null) {
            request.addParameter("Type", StringUtils.fromString(deactivateTypeRequest.getType()));
        }

        if (deactivateTypeRequest.getArn() != null) {
            request.addParameter("Arn", StringUtils.fromString(deactivateTypeRequest.getArn()));
        }

        return request;
    }

}
