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
package com.amazonaws.services.s3control.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;

import java.io.StringWriter;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.s3control.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;

import com.amazonaws.util.XMLWriter;

/**
 * CreateBucketRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBucketRequestMarshaller implements Marshaller<Request<CreateBucketRequest>, CreateBucketRequest> {

    public Request<CreateBucketRequest> marshall(CreateBucketRequest createBucketRequest) {

        if (createBucketRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateBucketRequest> request = new DefaultRequest<CreateBucketRequest>(createBucketRequest, "AWSS3Control");

        request.setHttpMethod(HttpMethodName.PUT);

        if (createBucketRequest.getACL() != null) {
            request.addHeader("x-amz-acl", StringUtils.fromString(createBucketRequest.getACL()));
        }

        if (createBucketRequest.getGrantFullControl() != null) {
            request.addHeader("x-amz-grant-full-control", StringUtils.fromString(createBucketRequest.getGrantFullControl()));
        }

        if (createBucketRequest.getGrantRead() != null) {
            request.addHeader("x-amz-grant-read", StringUtils.fromString(createBucketRequest.getGrantRead()));
        }

        if (createBucketRequest.getGrantReadACP() != null) {
            request.addHeader("x-amz-grant-read-acp", StringUtils.fromString(createBucketRequest.getGrantReadACP()));
        }

        if (createBucketRequest.getGrantWrite() != null) {
            request.addHeader("x-amz-grant-write", StringUtils.fromString(createBucketRequest.getGrantWrite()));
        }

        if (createBucketRequest.getGrantWriteACP() != null) {
            request.addHeader("x-amz-grant-write-acp", StringUtils.fromString(createBucketRequest.getGrantWriteACP()));
        }

        if (createBucketRequest.getObjectLockEnabledForBucket() != null) {
            request.addHeader("x-amz-bucket-object-lock-enabled", StringUtils.fromBoolean(createBucketRequest.getObjectLockEnabledForBucket()));
        }

        if (createBucketRequest.getOutpostId() != null) {
            request.addHeader("x-amz-outpost-id", StringUtils.fromString(createBucketRequest.getOutpostId()));
        }

        String uriResourcePath = "/v20180820/bucket/{name}";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "name", createBucketRequest.getBucket());
        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "http://awss3control.amazonaws.com/doc/2018-08-20/");

            CreateBucketConfiguration createBucketConfiguration = createBucketRequest.getCreateBucketConfiguration();
            if (createBucketConfiguration != null) {
                xmlWriter.startElement("CreateBucketConfiguration");

                if (createBucketConfiguration.getLocationConstraint() != null) {
                    xmlWriter.startElement("LocationConstraint").value(createBucketConfiguration.getLocationConstraint()).endElement();
                }
                xmlWriter.endElement();
            }

            request.setContent(new StringInputStream(stringWriter.getBuffer().toString()));
            request.addHeader("Content-Length", Integer.toString(stringWriter.getBuffer().toString().getBytes(UTF8).length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", "application/xml");
            }
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to XML: " + t.getMessage(), t);
        }

        return request;
    }

}
