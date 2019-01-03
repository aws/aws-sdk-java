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
 * UpdateCloudFrontOriginAccessIdentityRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCloudFrontOriginAccessIdentityRequestMarshaller implements
        Marshaller<Request<UpdateCloudFrontOriginAccessIdentityRequest>, UpdateCloudFrontOriginAccessIdentityRequest> {

    public Request<UpdateCloudFrontOriginAccessIdentityRequest> marshall(UpdateCloudFrontOriginAccessIdentityRequest updateCloudFrontOriginAccessIdentityRequest) {

        if (updateCloudFrontOriginAccessIdentityRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateCloudFrontOriginAccessIdentityRequest> request = new DefaultRequest<UpdateCloudFrontOriginAccessIdentityRequest>(
                updateCloudFrontOriginAccessIdentityRequest, "AmazonCloudFront");

        request.setHttpMethod(HttpMethodName.PUT);

        if (updateCloudFrontOriginAccessIdentityRequest.getIfMatch() != null) {
            request.addHeader("If-Match", StringUtils.fromString(updateCloudFrontOriginAccessIdentityRequest.getIfMatch()));
        }

        String uriResourcePath = "/2018-11-05/origin-access-identity/cloudfront/{Id}/config";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "Id",
                updateCloudFrontOriginAccessIdentityRequest.getId());
        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "http://cloudfront.amazonaws.com/doc/2018-11-05/");

            CloudFrontOriginAccessIdentityConfig cloudFrontOriginAccessIdentityConfig = updateCloudFrontOriginAccessIdentityRequest
                    .getCloudFrontOriginAccessIdentityConfig();
            if (cloudFrontOriginAccessIdentityConfig != null) {
                xmlWriter.startElement("CloudFrontOriginAccessIdentityConfig");

                if (cloudFrontOriginAccessIdentityConfig.getCallerReference() != null) {
                    xmlWriter.startElement("CallerReference").value(cloudFrontOriginAccessIdentityConfig.getCallerReference()).endElement();
                }

                if (cloudFrontOriginAccessIdentityConfig.getComment() != null) {
                    xmlWriter.startElement("Comment").value(cloudFrontOriginAccessIdentityConfig.getComment()).endElement();
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
