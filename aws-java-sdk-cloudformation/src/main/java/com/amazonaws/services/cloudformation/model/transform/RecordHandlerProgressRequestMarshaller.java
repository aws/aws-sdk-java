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
 * RecordHandlerProgressRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecordHandlerProgressRequestMarshaller implements Marshaller<Request<RecordHandlerProgressRequest>, RecordHandlerProgressRequest> {

    public Request<RecordHandlerProgressRequest> marshall(RecordHandlerProgressRequest recordHandlerProgressRequest) {

        if (recordHandlerProgressRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RecordHandlerProgressRequest> request = new DefaultRequest<RecordHandlerProgressRequest>(recordHandlerProgressRequest, "AmazonCloudFormation");
        request.addParameter("Action", "RecordHandlerProgress");
        request.addParameter("Version", "2010-05-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (recordHandlerProgressRequest.getBearerToken() != null) {
            request.addParameter("BearerToken", StringUtils.fromString(recordHandlerProgressRequest.getBearerToken()));
        }

        if (recordHandlerProgressRequest.getOperationStatus() != null) {
            request.addParameter("OperationStatus", StringUtils.fromString(recordHandlerProgressRequest.getOperationStatus()));
        }

        if (recordHandlerProgressRequest.getCurrentOperationStatus() != null) {
            request.addParameter("CurrentOperationStatus", StringUtils.fromString(recordHandlerProgressRequest.getCurrentOperationStatus()));
        }

        if (recordHandlerProgressRequest.getStatusMessage() != null) {
            request.addParameter("StatusMessage", StringUtils.fromString(recordHandlerProgressRequest.getStatusMessage()));
        }

        if (recordHandlerProgressRequest.getErrorCode() != null) {
            request.addParameter("ErrorCode", StringUtils.fromString(recordHandlerProgressRequest.getErrorCode()));
        }

        if (recordHandlerProgressRequest.getResourceModel() != null) {
            request.addParameter("ResourceModel", StringUtils.fromString(recordHandlerProgressRequest.getResourceModel()));
        }

        if (recordHandlerProgressRequest.getClientRequestToken() != null) {
            request.addParameter("ClientRequestToken", StringUtils.fromString(recordHandlerProgressRequest.getClientRequestToken()));
        }

        return request;
    }

}
