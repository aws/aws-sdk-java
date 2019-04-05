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
package com.amazonaws.services.route53.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;

import java.io.StringWriter;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.util.StringInputStream;

import com.amazonaws.util.XMLWriter;

/**
 * ChangeTagsForResourceRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChangeTagsForResourceRequestMarshaller implements Marshaller<Request<ChangeTagsForResourceRequest>, ChangeTagsForResourceRequest> {

    public Request<ChangeTagsForResourceRequest> marshall(ChangeTagsForResourceRequest changeTagsForResourceRequest) {

        if (changeTagsForResourceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ChangeTagsForResourceRequest> request = new DefaultRequest<ChangeTagsForResourceRequest>(changeTagsForResourceRequest, "AmazonRoute53");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2013-04-01/tags/{ResourceType}/{ResourceId}";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "ResourceType",
                changeTagsForResourceRequest.getResourceType());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "ResourceId",
                changeTagsForResourceRequest.getResourceId());
        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "https://route53.amazonaws.com/doc/2013-04-01/");

            xmlWriter.startElement("ChangeTagsForResourceRequest");
            if (changeTagsForResourceRequest != null) {

                com.amazonaws.internal.SdkInternalList<Tag> changeTagsForResourceRequestAddTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) changeTagsForResourceRequest
                        .getAddTags();
                if (!changeTagsForResourceRequestAddTagsList.isEmpty() || !changeTagsForResourceRequestAddTagsList.isAutoConstruct()) {
                    xmlWriter.startElement("AddTags");

                    for (Tag changeTagsForResourceRequestAddTagsListValue : changeTagsForResourceRequestAddTagsList) {
                        xmlWriter.startElement("Tag");

                        if (changeTagsForResourceRequestAddTagsListValue.getKey() != null) {
                            xmlWriter.startElement("Key").value(changeTagsForResourceRequestAddTagsListValue.getKey()).endElement();
                        }

                        if (changeTagsForResourceRequestAddTagsListValue.getValue() != null) {
                            xmlWriter.startElement("Value").value(changeTagsForResourceRequestAddTagsListValue.getValue()).endElement();
                        }
                        xmlWriter.endElement();
                    }
                    xmlWriter.endElement();
                }

                com.amazonaws.internal.SdkInternalList<String> changeTagsForResourceRequestRemoveTagKeysList = (com.amazonaws.internal.SdkInternalList<String>) changeTagsForResourceRequest
                        .getRemoveTagKeys();
                if (!changeTagsForResourceRequestRemoveTagKeysList.isEmpty() || !changeTagsForResourceRequestRemoveTagKeysList.isAutoConstruct()) {
                    xmlWriter.startElement("RemoveTagKeys");

                    for (String changeTagsForResourceRequestRemoveTagKeysListValue : changeTagsForResourceRequestRemoveTagKeysList) {
                        xmlWriter.startElement("Key");
                        xmlWriter.value(changeTagsForResourceRequestRemoveTagKeysListValue);
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
