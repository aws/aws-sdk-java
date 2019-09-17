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
 * ListTemplatesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTemplatesRequestMarshaller implements Marshaller<Request<ListTemplatesRequest>, ListTemplatesRequest> {

    public Request<ListTemplatesRequest> marshall(ListTemplatesRequest listTemplatesRequest) {

        if (listTemplatesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListTemplatesRequest> request = new DefaultRequest<ListTemplatesRequest>(listTemplatesRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "ListTemplates");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (listTemplatesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(listTemplatesRequest.getNextToken()));
        }

        if (listTemplatesRequest.getMaxItems() != null) {
            request.addParameter("MaxItems", StringUtils.fromInteger(listTemplatesRequest.getMaxItems()));
        }

        return request;
    }

}
