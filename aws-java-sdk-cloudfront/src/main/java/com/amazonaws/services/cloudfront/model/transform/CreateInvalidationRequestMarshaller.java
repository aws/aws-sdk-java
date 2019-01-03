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

import com.amazonaws.util.XMLWriter;

/**
 * CreateInvalidationRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateInvalidationRequestMarshaller implements Marshaller<Request<CreateInvalidationRequest>, CreateInvalidationRequest> {

    public Request<CreateInvalidationRequest> marshall(CreateInvalidationRequest createInvalidationRequest) {

        if (createInvalidationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateInvalidationRequest> request = new DefaultRequest<CreateInvalidationRequest>(createInvalidationRequest, "AmazonCloudFront");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2018-11-05/distribution/{DistributionId}/invalidation";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "DistributionId",
                createInvalidationRequest.getDistributionId());
        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "http://cloudfront.amazonaws.com/doc/2018-11-05/");

            InvalidationBatch invalidationBatch = createInvalidationRequest.getInvalidationBatch();
            if (invalidationBatch != null) {
                xmlWriter.startElement("InvalidationBatch");

                Paths paths = invalidationBatch.getPaths();
                if (paths != null) {
                    xmlWriter.startElement("Paths");

                    if (paths.getQuantity() != null) {
                        xmlWriter.startElement("Quantity").value(paths.getQuantity()).endElement();
                    }

                    com.amazonaws.internal.SdkInternalList<String> pathsItemsList = (com.amazonaws.internal.SdkInternalList<String>) paths.getItems();
                    if (!pathsItemsList.isEmpty() || !pathsItemsList.isAutoConstruct()) {
                        xmlWriter.startElement("Items");

                        for (String pathsItemsListValue : pathsItemsList) {
                            xmlWriter.startElement("Path");
                            xmlWriter.value(pathsItemsListValue);
                            xmlWriter.endElement();
                        }
                        xmlWriter.endElement();
                    }
                    xmlWriter.endElement();
                }

                if (invalidationBatch.getCallerReference() != null) {
                    xmlWriter.startElement("CallerReference").value(invalidationBatch.getCallerReference()).endElement();
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
