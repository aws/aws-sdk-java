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
 * ListTypesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTypesRequestMarshaller implements Marshaller<Request<ListTypesRequest>, ListTypesRequest> {

    public Request<ListTypesRequest> marshall(ListTypesRequest listTypesRequest) {

        if (listTypesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListTypesRequest> request = new DefaultRequest<ListTypesRequest>(listTypesRequest, "AmazonCloudFormation");
        request.addParameter("Action", "ListTypes");
        request.addParameter("Version", "2010-05-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (listTypesRequest.getVisibility() != null) {
            request.addParameter("Visibility", StringUtils.fromString(listTypesRequest.getVisibility()));
        }

        if (listTypesRequest.getProvisioningType() != null) {
            request.addParameter("ProvisioningType", StringUtils.fromString(listTypesRequest.getProvisioningType()));
        }

        if (listTypesRequest.getDeprecatedStatus() != null) {
            request.addParameter("DeprecatedStatus", StringUtils.fromString(listTypesRequest.getDeprecatedStatus()));
        }

        if (listTypesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(listTypesRequest.getMaxResults()));
        }

        if (listTypesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(listTypesRequest.getNextToken()));
        }

        return request;
    }

}
