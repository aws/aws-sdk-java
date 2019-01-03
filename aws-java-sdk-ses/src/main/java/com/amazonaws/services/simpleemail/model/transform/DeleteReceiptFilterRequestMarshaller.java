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
package com.amazonaws.services.simpleemail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DeleteReceiptFilterRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteReceiptFilterRequestMarshaller implements Marshaller<Request<DeleteReceiptFilterRequest>, DeleteReceiptFilterRequest> {

    public Request<DeleteReceiptFilterRequest> marshall(DeleteReceiptFilterRequest deleteReceiptFilterRequest) {

        if (deleteReceiptFilterRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteReceiptFilterRequest> request = new DefaultRequest<DeleteReceiptFilterRequest>(deleteReceiptFilterRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "DeleteReceiptFilter");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (deleteReceiptFilterRequest.getFilterName() != null) {
            request.addParameter("FilterName", StringUtils.fromString(deleteReceiptFilterRequest.getFilterName()));
        }

        return request;
    }

}
