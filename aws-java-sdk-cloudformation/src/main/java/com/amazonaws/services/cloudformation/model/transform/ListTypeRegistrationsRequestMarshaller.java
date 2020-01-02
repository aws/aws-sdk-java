/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ListTypeRegistrationsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTypeRegistrationsRequestMarshaller implements Marshaller<Request<ListTypeRegistrationsRequest>, ListTypeRegistrationsRequest> {

    public Request<ListTypeRegistrationsRequest> marshall(ListTypeRegistrationsRequest listTypeRegistrationsRequest) {

        if (listTypeRegistrationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListTypeRegistrationsRequest> request = new DefaultRequest<ListTypeRegistrationsRequest>(listTypeRegistrationsRequest, "AmazonCloudFormation");
        request.addParameter("Action", "ListTypeRegistrations");
        request.addParameter("Version", "2010-05-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (listTypeRegistrationsRequest.getType() != null) {
            request.addParameter("Type", StringUtils.fromString(listTypeRegistrationsRequest.getType()));
        }

        if (listTypeRegistrationsRequest.getTypeName() != null) {
            request.addParameter("TypeName", StringUtils.fromString(listTypeRegistrationsRequest.getTypeName()));
        }

        if (listTypeRegistrationsRequest.getTypeArn() != null) {
            request.addParameter("TypeArn", StringUtils.fromString(listTypeRegistrationsRequest.getTypeArn()));
        }

        if (listTypeRegistrationsRequest.getRegistrationStatusFilter() != null) {
            request.addParameter("RegistrationStatusFilter", StringUtils.fromString(listTypeRegistrationsRequest.getRegistrationStatusFilter()));
        }

        if (listTypeRegistrationsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(listTypeRegistrationsRequest.getMaxResults()));
        }

        if (listTypeRegistrationsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(listTypeRegistrationsRequest.getNextToken()));
        }

        return request;
    }

}
