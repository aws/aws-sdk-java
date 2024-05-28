/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.List;

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
 * CreateAccessGrantsInstanceRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAccessGrantsInstanceRequestMarshaller implements Marshaller<Request<CreateAccessGrantsInstanceRequest>, CreateAccessGrantsInstanceRequest> {

    public Request<CreateAccessGrantsInstanceRequest> marshall(CreateAccessGrantsInstanceRequest createAccessGrantsInstanceRequest) {

        if (createAccessGrantsInstanceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateAccessGrantsInstanceRequest> request = new DefaultRequest<CreateAccessGrantsInstanceRequest>(createAccessGrantsInstanceRequest,
                "AWSS3Control");

        request.setHttpMethod(HttpMethodName.POST);

        if (createAccessGrantsInstanceRequest.getAccountId() != null) {
            request.addHeader("x-amz-account-id", StringUtils.fromString(createAccessGrantsInstanceRequest.getAccountId()));
        }

        String uriResourcePath = "/v20180820/accessgrantsinstance";

        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "http://awss3control.amazonaws.com/doc/2018-08-20/");

            xmlWriter.startElement("CreateAccessGrantsInstanceRequest");
            if (createAccessGrantsInstanceRequest != null) {

                if (createAccessGrantsInstanceRequest.getIdentityCenterArn() != null) {
                    xmlWriter.startElement("IdentityCenterArn").value(createAccessGrantsInstanceRequest.getIdentityCenterArn()).endElement();
                }

                java.util.List<Tag> createAccessGrantsInstanceRequestTagsList = createAccessGrantsInstanceRequest.getTags();
                if (createAccessGrantsInstanceRequestTagsList != null) {
                    xmlWriter.startElement("Tags");

                    for (Tag createAccessGrantsInstanceRequestTagsListValue : createAccessGrantsInstanceRequestTagsList) {
                        xmlWriter.startElement("Tag");

                        if (createAccessGrantsInstanceRequestTagsListValue.getKey() != null) {
                            xmlWriter.startElement("Key").value(createAccessGrantsInstanceRequestTagsListValue.getKey()).endElement();
                        }

                        if (createAccessGrantsInstanceRequestTagsListValue.getValue() != null) {
                            xmlWriter.startElement("Value").value(createAccessGrantsInstanceRequestTagsListValue.getValue()).endElement();
                        }
                        xmlWriter.endElement();
                    }
                    xmlWriter.endElement();
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
