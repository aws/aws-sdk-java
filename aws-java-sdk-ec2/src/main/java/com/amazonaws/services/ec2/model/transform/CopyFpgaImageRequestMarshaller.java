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
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CopyFpgaImageRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyFpgaImageRequestMarshaller implements Marshaller<Request<CopyFpgaImageRequest>, CopyFpgaImageRequest> {

    public Request<CopyFpgaImageRequest> marshall(CopyFpgaImageRequest copyFpgaImageRequest) {

        if (copyFpgaImageRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CopyFpgaImageRequest> request = new DefaultRequest<CopyFpgaImageRequest>(copyFpgaImageRequest, "AmazonEC2");
        request.addParameter("Action", "CopyFpgaImage");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (copyFpgaImageRequest.getSourceFpgaImageId() != null) {
            request.addParameter("SourceFpgaImageId", StringUtils.fromString(copyFpgaImageRequest.getSourceFpgaImageId()));
        }

        if (copyFpgaImageRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(copyFpgaImageRequest.getDescription()));
        }

        if (copyFpgaImageRequest.getName() != null) {
            request.addParameter("Name", StringUtils.fromString(copyFpgaImageRequest.getName()));
        }

        if (copyFpgaImageRequest.getSourceRegion() != null) {
            request.addParameter("SourceRegion", StringUtils.fromString(copyFpgaImageRequest.getSourceRegion()));
        }

        if (copyFpgaImageRequest.getClientToken() != null) {
            request.addParameter("ClientToken", StringUtils.fromString(copyFpgaImageRequest.getClientToken()));
        }

        return request;
    }

}
