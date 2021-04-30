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
package com.amazonaws.services.cloudfront.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;

import java.io.StringWriter;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;

import com.amazonaws.util.XMLWriter;

/**
 * TestFunctionRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestFunctionRequestMarshaller implements Marshaller<Request<TestFunctionRequest>, TestFunctionRequest> {

    public Request<TestFunctionRequest> marshall(TestFunctionRequest testFunctionRequest) {

        if (testFunctionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<TestFunctionRequest> request = new DefaultRequest<TestFunctionRequest>(testFunctionRequest, "AmazonCloudFront");

        request.setHttpMethod(HttpMethodName.POST);

        if (testFunctionRequest.getIfMatch() != null) {
            request.addHeader("If-Match", StringUtils.fromString(testFunctionRequest.getIfMatch()));
        }

        String uriResourcePath = "/2020-05-31/function/{Name}/test";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "Name", testFunctionRequest.getName());
        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "http://cloudfront.amazonaws.com/doc/2020-05-31/");

            xmlWriter.startElement("TestFunctionRequest");
            if (testFunctionRequest != null) {

                if (testFunctionRequest.getStage() != null) {
                    xmlWriter.startElement("Stage").value(testFunctionRequest.getStage()).endElement();
                }

                if (testFunctionRequest.getEventObject() != null) {
                    xmlWriter.startElement("EventObject").value(testFunctionRequest.getEventObject()).endElement();
                }
            }
            xmlWriter.endElement();

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
