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
package com.amazonaws.services.simpledb.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.simpledb.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * SelectRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SelectRequestMarshaller implements Marshaller<Request<SelectRequest>, SelectRequest> {

    public Request<SelectRequest> marshall(SelectRequest selectRequest) {

        if (selectRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SelectRequest> request = new DefaultRequest<SelectRequest>(selectRequest, "AmazonSimpleDB");
        request.addParameter("Action", "Select");
        request.addParameter("Version", "2009-04-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (selectRequest.getSelectExpression() != null) {
            request.addParameter("SelectExpression", StringUtils.fromString(selectRequest.getSelectExpression()));
        }

        if (selectRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(selectRequest.getNextToken()));
        }

        if (selectRequest.getConsistentRead() != null) {
            request.addParameter("ConsistentRead", StringUtils.fromBoolean(selectRequest.getConsistentRead()));
        }

        return request;
    }

}
