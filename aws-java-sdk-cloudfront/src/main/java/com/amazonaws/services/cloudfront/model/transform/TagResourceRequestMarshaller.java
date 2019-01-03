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
 * TagResourceRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagResourceRequestMarshaller implements Marshaller<Request<TagResourceRequest>, TagResourceRequest> {

    public Request<TagResourceRequest> marshall(TagResourceRequest tagResourceRequest) {

        if (tagResourceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<TagResourceRequest> request = new DefaultRequest<TagResourceRequest>(tagResourceRequest, "AmazonCloudFront");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2018-11-05/tagging?Operation=Tag";

        uriResourcePath = com.amazonaws.util.UriResourcePathUtils.addStaticQueryParamtersToRequest(request, uriResourcePath);

        request.setResourcePath(uriResourcePath);

        if (tagResourceRequest.getResource() != null) {
            request.addParameter("Resource", StringUtils.fromString(tagResourceRequest.getResource()));
        }

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "http://cloudfront.amazonaws.com/doc/2018-11-05/");

            Tags tags = tagResourceRequest.getTags();
            if (tags != null) {
                xmlWriter.startElement("Tags");

                com.amazonaws.internal.SdkInternalList<Tag> tagsItemsList = (com.amazonaws.internal.SdkInternalList<Tag>) tags.getItems();
                if (!tagsItemsList.isEmpty() || !tagsItemsList.isAutoConstruct()) {
                    xmlWriter.startElement("Items");

                    for (Tag tagsItemsListValue : tagsItemsList) {
                        xmlWriter.startElement("Tag");

                        if (tagsItemsListValue.getKey() != null) {
                            xmlWriter.startElement("Key").value(tagsItemsListValue.getKey()).endElement();
                        }

                        if (tagsItemsListValue.getValue() != null) {
                            xmlWriter.startElement("Value").value(tagsItemsListValue.getValue()).endElement();
                        }
                        xmlWriter.endElement();
                    }
                    xmlWriter.endElement();
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
