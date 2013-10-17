/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudfront.model.transform;

import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.XMLWriter;

/**
 * Create Invalidation Request Marshaller
 */
public class CreateInvalidationRequestMarshaller implements Marshaller<Request<CreateInvalidationRequest>, CreateInvalidationRequest> {

    public Request<CreateInvalidationRequest> marshall(CreateInvalidationRequest createInvalidationRequest) {
        if (createInvalidationRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateInvalidationRequest> request = new DefaultRequest<CreateInvalidationRequest>(createInvalidationRequest, "AmazonCloudFront");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "2013-09-27/distribution/{DistributionId}/invalidation"; 
        uriResourcePath = uriResourcePath.replace("{DistributionId}", getString(createInvalidationRequest.getDistributionId())); 

        if (uriResourcePath.contains("?")) {
            String queryString = uriResourcePath.substring(uriResourcePath.indexOf("?") + 1);
            uriResourcePath    = uriResourcePath.substring(0, uriResourcePath.indexOf("?"));

            for (String s : queryString.split("[;&]")) {
                String[] nameValuePair = s.split("=");
                if (nameValuePair.length == 2) {
                    request.addParameter(nameValuePair[0], nameValuePair[1]);
                } else {
                    request.addParameter(s, null);
                }
            }
        }

        request.setResourcePath(uriResourcePath);

        
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "http://cloudfront.amazonaws.com/doc/2013-09-27/");

            
                    if (createInvalidationRequest != null) {
            InvalidationBatch invalidationBatchInvalidationBatch = createInvalidationRequest.getInvalidationBatch();
            if (invalidationBatchInvalidationBatch != null) {
                xmlWriter.startElement("InvalidationBatch");
                if (invalidationBatchInvalidationBatch != null) {
                    Paths pathsPaths = invalidationBatchInvalidationBatch.getPaths();
                    if (pathsPaths != null) {
                        xmlWriter.startElement("Paths");
                        if (pathsPaths.getQuantity() != null) {
                            xmlWriter.startElement("Quantity").value(pathsPaths.getQuantity()).endElement();
                        }

                        if (pathsPaths != null) {
                            java.util.List<String> pathsPathsitemsList = pathsPaths.getItems();
                            if (pathsPathsitemsList != null && pathsPathsitemsList.size() > 0) {
                                int pathsPathsitemsListIndex = 1;
                                xmlWriter.startElement("Items");
                                for (String pathsPathsitemsListValue : pathsPathsitemsList) {

                                xmlWriter.startElement("Path");
                                    xmlWriter.value(pathsPathsitemsListValue);
                                xmlWriter.endElement();


                                    pathsPathsitemsListIndex++;
                                }
                                xmlWriter.endElement();
                            }
                        }
                        xmlWriter.endElement();
                    }
                }
                if (invalidationBatchInvalidationBatch.getCallerReference() != null) {
                    xmlWriter.startElement("CallerReference").value(invalidationBatchInvalidationBatch.getCallerReference()).endElement();
                }
                xmlWriter.endElement();
            }
        }


            try {
                request.setContent(new StringInputStream(stringWriter.getBuffer().toString()));
                request.addHeader("Content-Length", Integer.toString(stringWriter.getBuffer().toString().getBytes("UTF-8").length));
                request.addHeader("Content-Type", "application/xml");
            } catch (UnsupportedEncodingException e) {
                throw new AmazonClientException("Unable to marshall request to XML", e);
            }
        

        return request;
    }

    private String getString(String s) {
        if (s == null) return "";
        return s;
    }
}
