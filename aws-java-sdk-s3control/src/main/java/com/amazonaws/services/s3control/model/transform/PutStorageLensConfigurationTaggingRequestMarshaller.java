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
 * PutStorageLensConfigurationTaggingRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutStorageLensConfigurationTaggingRequestMarshaller implements
        Marshaller<Request<PutStorageLensConfigurationTaggingRequest>, PutStorageLensConfigurationTaggingRequest> {

    public Request<PutStorageLensConfigurationTaggingRequest> marshall(PutStorageLensConfigurationTaggingRequest putStorageLensConfigurationTaggingRequest) {

        if (putStorageLensConfigurationTaggingRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<PutStorageLensConfigurationTaggingRequest> request = new DefaultRequest<PutStorageLensConfigurationTaggingRequest>(
                putStorageLensConfigurationTaggingRequest, "AWSS3Control");

        request.setHttpMethod(HttpMethodName.PUT);

        if (putStorageLensConfigurationTaggingRequest.getAccountId() != null) {
            request.addHeader("x-amz-account-id", StringUtils.fromString(putStorageLensConfigurationTaggingRequest.getAccountId()));
        }

        String uriResourcePath = "/v20180820/storagelens/{storagelensid}/tagging";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "storagelensid",
                putStorageLensConfigurationTaggingRequest.getConfigId());
        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "http://awss3control.amazonaws.com/doc/2018-08-20/");

            xmlWriter.startElement("PutStorageLensConfigurationTaggingRequest");
            if (putStorageLensConfigurationTaggingRequest != null) {

                java.util.List<StorageLensTag> putStorageLensConfigurationTaggingRequestTagsList = putStorageLensConfigurationTaggingRequest.getTags();
                if (putStorageLensConfigurationTaggingRequestTagsList != null) {
                    xmlWriter.startElement("Tags");

                    for (StorageLensTag putStorageLensConfigurationTaggingRequestTagsListValue : putStorageLensConfigurationTaggingRequestTagsList) {
                        xmlWriter.startElement("Tag");

                        if (putStorageLensConfigurationTaggingRequestTagsListValue.getKey() != null) {
                            xmlWriter.startElement("Key").value(putStorageLensConfigurationTaggingRequestTagsListValue.getKey()).endElement();
                        }

                        if (putStorageLensConfigurationTaggingRequestTagsListValue.getValue() != null) {
                            xmlWriter.startElement("Value").value(putStorageLensConfigurationTaggingRequestTagsListValue.getValue()).endElement();
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
