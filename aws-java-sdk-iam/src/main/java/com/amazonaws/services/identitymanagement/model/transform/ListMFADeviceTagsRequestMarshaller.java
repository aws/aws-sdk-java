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
 * ListMFADeviceTagsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMFADeviceTagsRequestMarshaller implements Marshaller<Request<ListMFADeviceTagsRequest>, ListMFADeviceTagsRequest> {

    public Request<ListMFADeviceTagsRequest> marshall(ListMFADeviceTagsRequest listMFADeviceTagsRequest) {

        if (listMFADeviceTagsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListMFADeviceTagsRequest> request = new DefaultRequest<ListMFADeviceTagsRequest>(listMFADeviceTagsRequest, "AmazonIdentityManagement");
        request.addParameter("Action", "ListMFADeviceTags");
        request.addParameter("Version", "2010-05-08");
        request.setHttpMethod(HttpMethodName.POST);

        if (listMFADeviceTagsRequest.getSerialNumber() != null) {
            request.addParameter("SerialNumber", StringUtils.fromString(listMFADeviceTagsRequest.getSerialNumber()));
        }

        if (listMFADeviceTagsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(listMFADeviceTagsRequest.getMarker()));
        }

        if (listMFADeviceTagsRequest.getMaxItems() != null) {
            request.addParameter("MaxItems", StringUtils.fromInteger(listMFADeviceTagsRequest.getMaxItems()));
        }

        return request;
    }

}
