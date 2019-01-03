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
 * ListAccessKeysRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccessKeysRequestMarshaller implements Marshaller<Request<ListAccessKeysRequest>, ListAccessKeysRequest> {

    public Request<ListAccessKeysRequest> marshall(ListAccessKeysRequest listAccessKeysRequest) {

        if (listAccessKeysRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListAccessKeysRequest> request = new DefaultRequest<ListAccessKeysRequest>(listAccessKeysRequest, "AmazonIdentityManagement");
        request.addParameter("Action", "ListAccessKeys");
        request.addParameter("Version", "2010-05-08");
        request.setHttpMethod(HttpMethodName.POST);

        if (listAccessKeysRequest.getUserName() != null) {
            request.addParameter("UserName", StringUtils.fromString(listAccessKeysRequest.getUserName()));
        }

        if (listAccessKeysRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(listAccessKeysRequest.getMarker()));
        }

        if (listAccessKeysRequest.getMaxItems() != null) {
            request.addParameter("MaxItems", StringUtils.fromInteger(listAccessKeysRequest.getMaxItems()));
        }

        return request;
    }

}
