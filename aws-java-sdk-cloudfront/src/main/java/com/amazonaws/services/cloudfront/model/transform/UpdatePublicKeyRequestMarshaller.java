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
 * UpdatePublicKeyRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePublicKeyRequestMarshaller implements Marshaller<Request<UpdatePublicKeyRequest>, UpdatePublicKeyRequest> {

    public Request<UpdatePublicKeyRequest> marshall(UpdatePublicKeyRequest updatePublicKeyRequest) {

        if (updatePublicKeyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdatePublicKeyRequest> request = new DefaultRequest<UpdatePublicKeyRequest>(updatePublicKeyRequest, "AmazonCloudFront");

        request.setHttpMethod(HttpMethodName.PUT);

        if (updatePublicKeyRequest.getIfMatch() != null) {
            request.addHeader("If-Match", StringUtils.fromString(updatePublicKeyRequest.getIfMatch()));
        }

        String uriResourcePath = "/2018-11-05/public-key/{Id}/config";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "Id", updatePublicKeyRequest.getId());
        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "http://cloudfront.amazonaws.com/doc/2018-11-05/");

            PublicKeyConfig publicKeyConfig = updatePublicKeyRequest.getPublicKeyConfig();
            if (publicKeyConfig != null) {
                xmlWriter.startElement("PublicKeyConfig");

                if (publicKeyConfig.getCallerReference() != null) {
                    xmlWriter.startElement("CallerReference").value(publicKeyConfig.getCallerReference()).endElement();
                }

                if (publicKeyConfig.getName() != null) {
                    xmlWriter.startElement("Name").value(publicKeyConfig.getName()).endElement();
                }

                if (publicKeyConfig.getEncodedKey() != null) {
                    xmlWriter.startElement("EncodedKey").value(publicKeyConfig.getEncodedKey()).endElement();
                }

                if (publicKeyConfig.getComment() != null) {
                    xmlWriter.startElement("Comment").value(publicKeyConfig.getComment()).endElement();
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
